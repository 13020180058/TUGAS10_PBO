
/**
 *
 * @author ASUS-PC  11.30
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class EventHandling extends JFrame
{
    JLabel labelData1,labelData2,labelHasil;
    JTextField field1,field2,field3;
    JButton button;
   
    public EventHandling()
    {
        setLayout(null);
        labelData1=new JLabel("Data 1 = ");
        field1=new JTextField(8);
        labelData2=new JLabel("Data 2 = ");
        field2=new JTextField(8);
        labelHasil=new JLabel("Hasil = ");
        field3=new JTextField(8);       
        button=new JButton("+");
       
        labelData1.setBounds(10,10,80,25);
        field1.setBounds(65,10,80,25);
        labelData2.setBounds(10,40,80,25);
        field2.setBounds(65,40,80,25);
        labelHasil.setBounds(10,70,80,25);
        field3.setBounds(65,70,80,25);
        button.setBounds(65,120,50,25);
       
        add(labelData1);
        add(field1);
        add(labelData2);
        add(field2);
        add(labelHasil);
        add(field3);
        add(button);
       
        ActionListener listener = new EventHandling.Handler();
        button.addActionListener(listener);   
    }
   
    class Handler implements ActionListener{
        public void actionPerformed(ActionEvent e){
            String s = e.getActionCommand();
           
            if(s.equals("+")){
                String data1=field1.getText();
                String data2=field2.getText();
               
                int a=Integer.parseInt(data1);
                int b=Integer.parseInt(data2);       

       
                int hasil=a+b;
                field3.setText(Integer.toString(hasil));
            }
        }
    }
   
    public static void main(String [] args)
    {
        EventHandling frame=new EventHandling();
        frame.setTitle("Penjumlahan");
        frame.setSize(200,200);
        //frame.setLocationRelationTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}