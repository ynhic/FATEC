/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetoIa.telas;

import br.com.projeto.entity.Grafo;
import javax.swing.JOptionPane;

/**
 *
 * @author asus
 */
public class Executar {
    
    public static void main(String[] args) throws Exception {
        String vertices = "0";
        
        int i=0;
        do{
            vertices = JOptionPane.showInputDialog("Escolhe o numero de vertices entre 2 à 10");
            try{
                if(Integer.parseInt(vertices) < 2 || Integer.parseInt(vertices) >10)
                    JOptionPane.showMessageDialog(null, vertices + "não é um numero entre 2 à 10");
                else{
                    JOptionPane.showMessageDialog(null, "Criado vertices de 0 à " + (Integer.parseInt(vertices) - 1));
                    i++;
                }
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, "Digite um numero entre 2 à 10");
            }
        }while(i == 0);
        Grafo grafo = new Grafo(Integer.parseInt(vertices));
        Menu menu = new Menu(grafo);
        menu.setVisible(true);
        
    }
}
