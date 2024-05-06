package GUI;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SimpleGUI extends JFrame  {
    private JButton button = new JButton("Press");
    private JTextField input = new JTextField("",5);
    private JLabel label = new JLabel("input:");
    private JRadioButton radioButton1 = new JRadioButton("Select this");
    private JRadioButton radioButton2 = new JRadioButton("Select that");
    private JCheckBox checkBox = new JCheckBox("Проверка",false);

    public SimpleGUI(){
        super("Simple Example");
        this.setBounds(100,100,250,100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3,2,2,2));
        container.add(label);
        container.add(input);

        ButtonGroup group = new ButtonGroup();
        group.add(radioButton1);
        group.add(radioButton2);
        container.add(radioButton1);
        radioButton1.setSelected(true);
        container.add(radioButton2);
        container.add(checkBox);
        button.addActionListener(new ButtonEvent());
        container.add(button);
    }
    class ButtonEvent implements ActionListener {
        public void actionPerformed (ActionEvent e){
            String message = "";
            message += "Кнопка была нажата\n";
            message += "Текст " + input.getText() + "\n";
            message += (radioButton1.isSelected() ? "Radio #1" : "Radio #2" ) + " выбран\n";
            message += "CheckBox is " + ((checkBox.isSelected()) ? "проверил" : "не проверил" );
            JOptionPane.showMessageDialog(null, message, "Output", JOptionPane.PLAIN_MESSAGE);
        }

    }
}
