
/**
 *nama : apriani magfira
 * stambuk: 13020180058
 * tanggal/ waktu :09 mei 2020 , 09.40 WITA
 */

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class CalculatorDemoAWT extends Frame implements ActionListener

{
    Label l1,l2,l3;

    TextField t1,t2,t3;

    Button b1,b2,b3,b4,b5,b6;

    public CalculatorDemoAWT()
    {
        l1 = new Label("Number1");
        l2 = new Label("Number2");
        l3 = new Label("Result");

        t1 = new TextField(10);
        t2 = new TextField(10);
        t3 = new TextField(10);

        b1 = new Button("Add");
        b2 = new Button("Sub");
        b3 = new Button("Multi");
        b4 = new Button("Div");
        b5 = new Button("Reset");
        b6 = new Button("Close");

            add(l1);
            add(t1);
            add(l2);
            add(t2);
            add(l3);
            add(t3);
            add(b1);
            add(b2);
            add(b3);
            add(b4);
            add(b5);
            add(b6);
            setSize(200,200);
            setTitle("Calculatore");
            setLayout(new FlowLayout());
            //setLayout(new FlowLayout(FlowLayout.RIGHT));
            //setLayout(new FlowLayout(FlowLayout.LEFT));
            b1.addActionListener(this);
            b2.addActionListener(this);
            b3.addActionListener(this);
            b4.addActionListener(this);
            b5.addActionListener(this);
            b6.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae) {
        double a=0,b=0,c=0;
        try
        {
            a = Double.parseDouble(t1.getText());
        }
        catch (NumberFormatException e) {
            t1.setText("Invalid input");
        }
        try
        {
            b = Double.parseDouble(t2.getText());
        }
        catch (NumberFormatException e) {
            t2.setText("Invalid input");
        }
        if(ae.getSource()==b1)
        {
            c = a + b;
            t3.setText(String.valueOf(c));
        }
        if(ae.getSource()==b2)
        {
            c = a - b;
            t3.setText(String.valueOf(c));
        }
        if(ae.getSource()==b3)
        {
            c = a * b;
            t3.setText(String.valueOf(c));
        }
        if(ae.getSource()==b4)
        {
            c = a / b;
            t3.setText(String.valueOf(c));
        }
        if(ae.getSource()==b5)
        {
            t1.setText("0");
            t2.setText("0");
            t3.setText("0");
        }
        if(ae.getSource()==b6)
        {
            System.exit(0);
        }     
    }
    public static void main(String[] args)
    {
      CalculatorDemoAWT c = new CalculatorDemoAWT();
        c.setVisible(true);
        c.setLocation(300,300);
    }
}