import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setLayout(null);
        frame.setSize(500,300);
//        frame.setBackground(Color.black);
        Button vipul = new Button("Vipul");
        frame.add(vipul);
        vipul.setBounds(200,200,70,35);
        vipul.setBackground(Color.yellow);
        frame.setTitle("Brick Breaker Game");
        frame.setVisible(true);


    }
}