/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
//importando classes
import javax.swing.*;
import java.awt.*;
public class exercicio1 extends JFrame {
    JLabel rotulo1, rotulo2, rotulo3, rotulo4, rotulo5, rotulo6, rotulo7, rotulo8;
    JTextField texto1, texto2, texto3, texto4, texto5, texto6, texto7;

    public  exercicio1(){
 super("Exemplo com JTextField");
         Container tela = getContentPane();
         setLayout(null);
     rotulo1 = new JLabel ("Nome");
     rotulo2 = new JLabel ("CPF");
     rotulo3 = new JLabel ("RG");
     rotulo4 = new JLabel ("Endereço");
     rotulo5 = new JLabel ("Cidade");
     rotulo6 = new JLabel ("Estado");
     rotulo7 = new JLabel ("CEP");
    
     
     texto1 = new JTextField(50);
     texto2 = new JTextField(3);
     texto3 = new JTextField(10);
     texto4 = new JTextField(10);
     texto5 = new JTextField(50);
     texto6 = new JTextField(3);
     texto7 = new JTextField(10);
     
     //definir tamanho, linha, largura 
     rotulo1.setBounds(50, 20, 80, 20);
     rotulo2.setBounds(50, 60, 80, 20);
     rotulo3.setBounds(50, 100, 100, 20);
     rotulo4.setBounds(50, 140, 80, 20);
     rotulo5.setBounds(50, 180, 80, 20);
     rotulo6.setBounds(50, 220, 80, 20);
     rotulo7.setBounds(50, 260, 100, 20);
         
     texto1.setBounds(50, 40, 200, 20);
     texto2.setBounds(50, 80, 140, 20);
     texto3.setBounds(50, 120, 120, 20);
     texto4.setBounds(50, 160, 200, 20);
     texto5.setBounds(50, 200, 190, 20);
     texto6.setBounds(50, 240, 150, 20);
     texto7.setBounds(50, 280, 120, 20);
     
     //mostrar que não esta visivel
     setVisible(true);
    tela.add(rotulo1);
    tela.add(rotulo2);
    tela.add(rotulo3);
    tela.add(rotulo4);
    tela.add(rotulo5);
    tela.add(rotulo6);
    tela.add(rotulo7);
   
    
    tela.add(texto1);
    tela.add(texto2);
    tela.add(texto3);
    tela.add(texto4);
    tela.add(texto5);
    tela.add(texto6);
    tela.add(texto7);
    
    //definindo tamanho
     setSize(500, 500);
     //janela centralizada
     setLocationRelativeTo(null);
}
    
      public static void main(String args[]){
      //criar objeto 
      exercicio1 app = new  exercicio1();
      //mostrar os componentes como: minimizar etc...
      app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}
