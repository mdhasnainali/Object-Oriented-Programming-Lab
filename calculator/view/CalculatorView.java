package com.cseru.calculator.view;

import javax.swing.*;

public class CalculatorView {
    private JPanel panel1;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton button6;
    private JButton button5;
    private JButton button4;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton buttonDevide;
    private JButton buttonMultiply;
    private JButton buttonSubstraction;
    private JButton button0;
    private JButton button00;
    private JButton buttonDot;
    private JButton buttonPlus;
    private JButton buttonEqual;
    private JLabel lebel;


    CalculatorView(){
        JFrame frame = new JFrame("Calculator");
        //lebel.setText("Hello");
        frame.setContentPane(new CalculatorView().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        frame.pack();
        frame.setVisible(true);
    }


    public static void main(String[] args) {
        new CalculatorView();
    }
}
