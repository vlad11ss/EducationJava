package lesson7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow extends JFrame {

    private final int WIN_WIDTH = 500;
    private final int WIN_HEIGHT = 500;
    private final int WIN_POS_X = 300;
    private final int WIN_POS_Y = 100;

    private Settings settings;

    MainWindow(){

        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        int screenW = dimension.width;
        int screenH = dimension.height;

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(WIN_WIDTH,WIN_HEIGHT);
//        setLocation(WIN_POS_X,WIN_POS_Y);
        setLocation(screenW / 2 - WIN_WIDTH / 2, screenH / 2 - WIN_HEIGHT /2);
        setTitle("ИГРА-X0");
        setResizable(true);

        settings = new Settings(this);

        JButton btnStart = new JButton("старт игры");
        btnStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                settings.setVisible(true);
            }
        });


        JButton btnExit = new JButton("конец игры");
        btnExit.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        JPanel panelForButtons = new JPanel();
        panelForButtons.setLayout(new GridLayout(1,2));
        panelForButtons.add(btnStart);
        panelForButtons.add(btnExit);


       add(panelForButtons, BorderLayout.SOUTH);

//        setLayout(new GridLayout(20,10));
//
//        for (int i = 0; i < 30; i++) {
//            add(new JButton("Button #" + i));
//        }
//
//        setLayout(new FlowLayout());
//        for (int i = 0; i < 20; i++) {
//            add(new JButton("Button #" + i));
//        }

        setVisible(true);
    }

}
