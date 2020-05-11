
/**
 *nama : apriani magfira
 * stambuk: 13020180058
 * tanggal/ waktu :08 mei 2020 , 21.10 WITA
 */
import javax.swing.*;
import java.awt.*;

class SwingDemo {
    JFrame frame;
    JPanel panel;
    JTextField textField;
    JButton button;
    Container contentPane;
        public static void main(String args[]) {
            SwingDemo sd = new SwingDemo();
            sd.launchFrame();
        }


    void launchFrame() {
    /* inisialisasi */
    frame = new JFrame("My First Swing Application");
    panel = new JPanel();
    textField = new JTextField("Default text");
    button = new JButton("Click me!");
    contentPane = frame.getContentPane();
    //menambahkan komponen pada panel-FlowLayout
    panel.add(textField);
    panel.add(button);
    /* menambahkan komponen pada contentPane */
    contentPane.add(panel, BorderLayout.CENTER);
    frame.pack(); //Ukuran frame berdasar komponen
    frame.setVisible(true);
    }

}
