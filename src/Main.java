import javax.swing.*;
import javax.xml.crypto.Data;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.FileSystem;
import java.nio.file.Files;
import java.sql.SQLOutput;
import java.util.List;
void main(){
    JButton button = new JButton("Нажми меня");
    JFrame frame = new JFrame("Пример события");
    JLabel label = new JLabel("Нажатий: 0");
    final int[] count = {0};
    //Отдельный файл
    //button.addActionListener(new MyActionListener());
    //Анонимный класс
    button.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            count[0]++;
            label.setText("Нажатий "+count[0]);
        }
    });
    /*button.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            System.out.println("Mouse is clicked");
        }
    });*/
    /*button.addKeyListener(new KeyAdapter() {
        @Override
        public void keyPressed(KeyEvent e) {
            System.out.println(e.getKeyChar());
        }
    });*/
    /*frame.setLayout(new FlowLayout());
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//завершает программу при нажатии на крестик
    frame.add(button);
    frame.add(label);
    frame.setSize(400, 100);
    frame.setVisible(true);*/

    DataLoader loader = new DataLoader();
    DataLoadedHandler handler = new DataLoadedHandler();
    loader.addDataLoaded(handler);
    loader.loadData();
    loader.removeDataLoader(handler);

}



