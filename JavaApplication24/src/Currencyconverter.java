import java.awt.*;
import java.awt.event.*;

public class Currencyconverter extends Frame implements ActionListener {
     TextField txt1,txt2;
    Label L1,L2;
     Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
    Currencyconverter(){
      txt1 = new TextField();
      txt1.setBounds(200,100, 150, 30);
      txt2 = new TextField();
      txt2.setBounds(200, 150, 150, 30);
      txt2.setEditable(false);
      L1 = new Label("Currency in Ksh:");
      L1.setBounds(30,100,100, 40);
      L2= new Label("Converted Value:");
      L2.setBounds(30,150,100,40);
     b1 = new Button("TzSh");
     b1.setBounds(50,200,100,30);
     b2 = new Button("USD");
     b2.setBounds(250,200,100, 30);
     b3 = new Button("Pound");
     b3.setBounds(450,200,100,30);
     b4 = new Button("UgSh");
     b4.setBounds(50,350,100,30);
     b5 = new Button("Euro");
     b5.setBounds(250,350,100,30);
     b6 = new Button("yen");
     b6.setBounds(450,350,100,30);
     b7 = new Button("Yuan");
     b7.setBounds(50,500,100,30);
     b8 = new Button("Dirham");
     b8.setBounds(250,500,100,30);
     b9 = new Button("Kroner");
     b9.setBounds(450,500,100,30);
     b1.addActionListener(this);
     b2.addActionListener(this);
     b3.addActionListener(this);
     b4.addActionListener(this);
     b5.addActionListener(this);
     b6.addActionListener(this);
     b7.addActionListener(this);
     b8.addActionListener(this);
     b9.addActionListener(this);
      add (b1);
      add (b2);
      add (b3);
      add (b4);
      add (b5);
      add (b6);
      add (b7);
      add (b8);
      add (b9);
      add (txt1);
      add (txt2);
      add(L1);
      add(L2);
  setSize(750, 650);
  setLayout(null);
  setVisible(true);
  setTitle("Currency convertor");

    }
public void actionPerformed(ActionEvent r){
       String s1 = txt1.getText();
       int a = Integer.parseInt(s1);
       double b = 0;
       
       if (r.getSource()==b1){
           b= a*212.77;
       }
       else if(r.getSource()==b2){
           b= a*0.007758;
       }
       else if(r.getSource()==b3){
           b= a*0.0058;
       }
       else if(r.getSource()==b4){
           b= a*28.41;
       }
       else if(r.getSource()==b5){
           b= a*0.0070;
       }
       else if(r.getSource()==b6){
           b= a*1.12;
       }
       else if(r.getSource()==b7){
           b= a*0.055;
       }
       else if(r.getSource()==b8){
           b= a*0.28;
       }
       else if(r.getSource()==b9){
           b= a*0.082;
       }
     String result = String.valueOf(b);
     txt2.setText(result);
   }
 
    public static void main(String[] args) {
        new Currencyconverter();
    }
    
}
