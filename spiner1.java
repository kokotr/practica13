
import java.awt.*;


import java.awt.event.*;


import javax.swing.*;




public class spiner1 extends JFrame {


private JSpinner a;

String texto[]={"rojo","verde","azul","jinata"};

public spiner1(){


setLayout(null);

//a=new JSpinner(new SpinnerNumberModel(0,0,10,2));

//a=new JSpinner(new SpinnerListModel(texto));

//a=new JSpinner();

a=new JSpinner(new SpinnerDateModel());


a.setBounds(10,10,200,50);


add(a);



}

public static void main(String[]args){



spiner1 uno=new spiner1();


uno.setSize(500,500);


uno.setTitle("esto es una practica de java");


uno.setResizable(false);

uno.setLocationRelativeTo(null);

uno.setVisible(true);


uno.setDefaultCloseOperation(EXIT_ON_CLOSE);














}



}




