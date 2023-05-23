/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import percobaanlogin.Login;
import javax.swing.JFrame;

/**
 *
 * @author ALFI
 */
public class Main {
    
    public static void main(String [] args){
        JFrame frame = new JFrame("Login Frame");
        Login loginPanel = new Login();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(loginPanel);
        frame.pack();
        frame.setVisible(true);

    }
    
}
