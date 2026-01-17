import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

void main() {
    //1
    /*Random random = new Random();
    JFrame frame = new JFrame("Random number");
    JButton button = new JButton("Generate");
    JLabel label = new JLabel();
    final int[] number={0};

    button.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            number[0] = random.nextInt(100)+1;
            label.setText(number[0]+"");
        }
    });
    frame.setLayout(new FlowLayout());
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.add(button);
    frame.add(label);
    frame.setSize(400, 100);
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);*/

    //2
    JFrame frame = new JFrame("Form of registration");
    JLabel nameLabel = new JLabel("Name: ");
    JTextField nameField = new JTextField(10);
    JLabel ageLabel = new JLabel("Age: ");
    JTextField ageField = new JTextField(10);
    JButton button = new JButton("Submit");
    JLabel label = new JLabel();

    frame.setLayout(new FlowLayout());
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.add(nameLabel);
    frame.add(nameField);
    frame.add(ageLabel);
    frame.add(ageField);
    frame.add(button);
    frame.add(label);
    frame.setSize(400, 100);
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);

    button.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String name = nameField.getText().trim();
            String ageText = ageField.getText();

            if(name.isEmpty()){
                label.setText("Name is empty");
                label.setForeground(Color.RED);
                return;
            }
            if(ageText.isEmpty()){
                label.setText("Age is empty");
                label.setForeground(Color.RED);
                return;
            }
            int age;
            try{
                age= Integer.parseInt(ageText);
            }catch (NumberFormatException ex){
                label.setText(ex.getMessage());
                label.setForeground(Color.RED);
                return;
            }
            if(age<0){
                label.setText("Age < 0");
                label.setForeground(Color.RED);
                return;
            }
            label.setText("User: "+name+", age: "+age);
            label.setForeground(Color.GREEN);
        }
    });


}