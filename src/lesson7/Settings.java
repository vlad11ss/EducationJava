package lesson7;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Settings extends JFrame {

    private final int WIN_WIDTH = 350;
    private final int WIN_HEIGHT = 250;

    private MainWindow mainWindow;

    private JRadioButton pve;
    private JRadioButton pvp;

    private JLabel currentMapSizeLabel;
    private JSlider sliderMapSize;
    private final int MIN_MAP_SIZE = 3;
    private final int MAX_MAP_SIZE = 10;

    private JLabel currentWinLengthLabel;
    private JSlider sliderWinLength;
    private final int MIN_WIN_LEN = 3;

    private JButton btnSaveSettings;

    private final String WIN_SIZE_LB_PREFIX = "Размер карты ";
    private final String WIN_LEN_LB_PREFIX = "Размер длины победы ";



    Settings(MainWindow mainWindow) {
        this.mainWindow = mainWindow;

        Rectangle mainWindowBounds = mainWindow.getBounds();
        int coordinateX = (int) mainWindowBounds.getCenterX() - WIN_WIDTH / 2;
        int coordinateY = (int) mainWindowBounds.getCenterY() - WIN_HEIGHT / 2;
        setLocation(coordinateX, coordinateY);
        setResizable(false);
        setTitle("Настроики");
        setSize(WIN_WIDTH, WIN_HEIGHT);

        setLayout(new GridLayout(10,1));

        setupGameMode();
        setupMapSizeSettings();
        setupWinLength();
        collectAndUserSettings();
    }

    private void setupGameMode() {
        add(new JLabel("РЕЖИМ"));
        pve = new JRadioButton("PVE",true);
        pvp = new JRadioButton("PVP");

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(pve);
        buttonGroup.add(pvp);

        add(pve);
        add(pvp);

    }

    private void setupMapSizeSettings() {
        add(new JLabel("РАЗМЕР КАРТЫ"));
        currentMapSizeLabel = new JLabel(WIN_SIZE_LB_PREFIX + MIN_MAP_SIZE + "x" + MIN_MAP_SIZE);
        sliderMapSize = new JSlider(MIN_MAP_SIZE,MAX_MAP_SIZE,MIN_MAP_SIZE);
        sliderMapSize.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int currentValue = sliderMapSize.getValue();
                currentMapSizeLabel.setText(WIN_SIZE_LB_PREFIX + currentValue + "x" + currentValue);
                sliderWinLength.setMaximum(currentValue);

            }
        });
        add(currentMapSizeLabel);
        add(sliderMapSize);


    }

    private void setupWinLength() {
        add(new JLabel("РАЗМЕР ДЛИНЫ ПОБЕДЫ"));
        currentWinLengthLabel = new JLabel(WIN_LEN_LB_PREFIX + MIN_WIN_LEN);
        sliderWinLength = new JSlider(MIN_WIN_LEN,MIN_MAP_SIZE,MIN_MAP_SIZE);
        sliderWinLength.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                currentWinLengthLabel.setText(WIN_LEN_LB_PREFIX + sliderWinLength.getValue());

            }
        });
        add(currentWinLengthLabel);
        add(sliderWinLength);


    }

    private void collectAndUserSettings(){
        btnSaveSettings = new JButton("Сохранить и Начать");
        btnSaveSettings.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                collectUserSettings();
            }
        });
        add(btnSaveSettings);

    }

    private void collectUserSettings(){
        int gameMode;

        if (pve.isSelected()){
            gameMode = GameMap.PVE_MODE;

        } else if (pvp.isSelected()){
            gameMode = GameMap.PVP_MODE;

        }else {
            JOptionPane.showMessageDialog(this,"error");
        }

        int mapSize = sliderMapSize.getValue();
        int winLength = sliderWinLength.getValue();

    }
}
