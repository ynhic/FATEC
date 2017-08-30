/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetoIa.telas;

import br.com.projeto.entity.Grafo;

/**
 *
 * @author asus
 */
public class MostrarMatriz extends javax.swing.JFrame {
    Grafo grafo;
    /**
     * Creates new form MostrarMatriz
     */
    public MostrarMatriz(Grafo grafo1) {
        initComponents();
        grafo = grafo1;
        if(grafo.getNumeroDeNodos() >= 2){
           lbl00.setText(Integer.toString(grafo.getMatrizDePesos()[0][0]));
           lbl01.setText(Integer.toString(grafo.getMatrizDePesos()[0][1]));
           lbl11.setText(Integer.toString(grafo.getMatrizDePesos()[1][1]));
           if(grafo.getNumeroDeNodos() >=3){
                lbl02.setText(Integer.toString(grafo.getMatrizDePesos()[0][2]));
                if(grafo.getMatrizDePesos()[1][2] != 2)
                    lbl12.setText(Integer.toString(grafo.getMatrizDePesos()[1][2]));
                else
                    lbl12.setText("1,41");
                lbl22.setText(Integer.toString(grafo.getMatrizDePesos()[2][2]));
                if(grafo.getNumeroDeNodos() >=4){
                    if(grafo.getMatrizDePesos()[0][3] == 2)
                        lbl03.setText("1,41");
                    else
                        lbl03.setText(Integer.toString(grafo.getMatrizDePesos()[0][3]));
                    lbl13.setText(Integer.toString(grafo.getMatrizDePesos()[1][3]));
                    lbl23.setText(Integer.toString(grafo.getMatrizDePesos()[2][3]));
                    lbl33.setText(Integer.toString(grafo.getMatrizDePesos()[3][3]));
                    if(grafo.getNumeroDeNodos() >=5){
                        lbl04.setText(Integer.toString(grafo.getMatrizDePesos()[0][4]));
                        lbl14.setText(Integer.toString(grafo.getMatrizDePesos()[1][4]));
                        lbl24.setText(Integer.toString(grafo.getMatrizDePesos()[2][4]));
                        if(grafo.getMatrizDePesos()[3][4] == 2)
                            lbl34.setText("1,41");
                        else
                            lbl34.setText(Integer.toString(grafo.getMatrizDePesos()[3][4]));
                        lbl44.setText(Integer.toString(grafo.getMatrizDePesos()[4][4]));
                        if(grafo.getNumeroDeNodos() >=6){
                            lbl05.setText(Integer.toString(grafo.getMatrizDePesos()[0][5]));
                            lbl15.setText(Integer.toString(grafo.getMatrizDePesos()[1][5]));
                            if(grafo.getMatrizDePesos()[2][5] == 2)
                                lbl25.setText("1,41");
                            else
                                lbl25.setText(Integer.toString(grafo.getMatrizDePesos()[2][5]));
                            lbl35.setText(Integer.toString(grafo.getMatrizDePesos()[3][5]));
                            lbl45.setText(Integer.toString(grafo.getMatrizDePesos()[4][5]));
                            lbl55.setText(Integer.toString(grafo.getMatrizDePesos()[5][5]));
                            if(grafo.getNumeroDeNodos() >=7){
                                lbl06.setText(Integer.toString(grafo.getMatrizDePesos()[0][6]));
                                lbl16.setText(Integer.toString(grafo.getMatrizDePesos()[1][6]));
                                lbl26.setText(Integer.toString(grafo.getMatrizDePesos()[2][6]));
                                lbl36.setText(Integer.toString(grafo.getMatrizDePesos()[3][6]));
                                lbl46.setText(Integer.toString(grafo.getMatrizDePesos()[4][6]));
                                if(grafo.getMatrizDePesos()[5][6] == 2)
                                    lbl56.setText("1,41");
                                else
                                    lbl56.setText(Integer.toString(grafo.getMatrizDePesos()[5][6]));
                                lbl66.setText(Integer.toString(grafo.getMatrizDePesos()[6][6]));
                                if(grafo.getNumeroDeNodos() >=8){
                                    lbl07.setText(Integer.toString(grafo.getMatrizDePesos()[0][7]));
                                    lbl17.setText(Integer.toString(grafo.getMatrizDePesos()[1][7]));
                                    lbl27.setText(Integer.toString(grafo.getMatrizDePesos()[2][7]));
                                    lbl37.setText(Integer.toString(grafo.getMatrizDePesos()[3][7]));
                                    if(grafo.getMatrizDePesos()[4][7] == 2)
                                        lbl47.setText("1,41");
                                    else
                                        lbl47.setText(Integer.toString(grafo.getMatrizDePesos()[4][7]));
                                    lbl57.setText(Integer.toString(grafo.getMatrizDePesos()[5][7]));
                                    lbl67.setText(Integer.toString(grafo.getMatrizDePesos()[6][7]));
                                    lbl77.setText(Integer.toString(grafo.getMatrizDePesos()[7][7]));
                                    if(grafo.getNumeroDeNodos() >=9){
                                        lbl08.setText(Integer.toString(grafo.getMatrizDePesos()[0][8]));
                                        lbl18.setText(Integer.toString(grafo.getMatrizDePesos()[1][8]));
                                        lbl28.setText(Integer.toString(grafo.getMatrizDePesos()[2][8]));
                                        lbl38.setText(Integer.toString(grafo.getMatrizDePesos()[3][8]));
                                        lbl48.setText(Integer.toString(grafo.getMatrizDePesos()[4][8]));
                                        lbl58.setText(Integer.toString(grafo.getMatrizDePesos()[5][8]));
                                        lbl68.setText(Integer.toString(grafo.getMatrizDePesos()[6][8]));
                                        if(grafo.getMatrizDePesos()[7][8] == 2)
                                            lbl78.setText("1,41");
                                        else
                                            lbl78.setText(Integer.toString(grafo.getMatrizDePesos()[7][8]));
                                        lbl88.setText(Integer.toString(grafo.getMatrizDePesos()[8][8]));
                                        if(grafo.getNumeroDeNodos() == 10){
                                            lbl09.setText(Integer.toString(grafo.getMatrizDePesos()[0][9]));
                                            lbl19.setText(Integer.toString(grafo.getMatrizDePesos()[1][9]));
                                            lbl29.setText(Integer.toString(grafo.getMatrizDePesos()[2][9]));
                                            lbl39.setText(Integer.toString(grafo.getMatrizDePesos()[3][9]));
                                            lbl49.setText(Integer.toString(grafo.getMatrizDePesos()[4][9]));
                                            lbl59.setText(Integer.toString(grafo.getMatrizDePesos()[5][9]));
                                            if(grafo.getMatrizDePesos()[6][9] == 2)
                                                lbl69.setText("1,41");
                                            else
                                                lbl69.setText(Integer.toString(grafo.getMatrizDePesos()[6][9]));
                                            lbl79.setText(Integer.toString(grafo.getMatrizDePesos()[7][9]));
                                            lbl89.setText(Integer.toString(grafo.getMatrizDePesos()[8][9]));
                                            lbl99.setText(Integer.toString(grafo.getMatrizDePesos()[9][9]));
                                        }
                                    }
                                }
                            }
                        }
                    }
                }           
           }
        }
        
    }

    private MostrarMatriz() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        lbl_0 = new java.awt.Label();
        lbl_1 = new java.awt.Label();
        lbl_2 = new java.awt.Label();
        lbl_3 = new java.awt.Label();
        lbl_4 = new java.awt.Label();
        lbl_5 = new java.awt.Label();
        lbl_6 = new java.awt.Label();
        lbl_7 = new java.awt.Label();
        lbl_8 = new java.awt.Label();
        lbl_9 = new java.awt.Label();
        lbl0 = new java.awt.Label();
        lbl1 = new java.awt.Label();
        lbl2 = new java.awt.Label();
        lbl3 = new java.awt.Label();
        lbl4 = new java.awt.Label();
        lbl5 = new java.awt.Label();
        lbl6 = new java.awt.Label();
        lbl7 = new java.awt.Label();
        lbl8 = new java.awt.Label();
        lbl9 = new java.awt.Label();
        lbl00 = new java.awt.Label();
        lbl11 = new java.awt.Label();
        lbl22 = new java.awt.Label();
        lbl33 = new java.awt.Label();
        lbl44 = new java.awt.Label();
        lbl55 = new java.awt.Label();
        lbl66 = new java.awt.Label();
        lbl77 = new java.awt.Label();
        lbl88 = new java.awt.Label();
        lbl99 = new java.awt.Label();
        lbl01 = new java.awt.Label();
        lbl02 = new java.awt.Label();
        lbl03 = new java.awt.Label();
        lbl04 = new java.awt.Label();
        lbl05 = new java.awt.Label();
        lbl06 = new java.awt.Label();
        lbl07 = new java.awt.Label();
        lbl08 = new java.awt.Label();
        lbl09 = new java.awt.Label();
        lbl12 = new java.awt.Label();
        lbl13 = new java.awt.Label();
        lbl14 = new java.awt.Label();
        lbl15 = new java.awt.Label();
        lbl16 = new java.awt.Label();
        lbl17 = new java.awt.Label();
        lbl18 = new java.awt.Label();
        lbl19 = new java.awt.Label();
        lbl23 = new java.awt.Label();
        lbl25 = new java.awt.Label();
        lbl26 = new java.awt.Label();
        lbl27 = new java.awt.Label();
        lbl28 = new java.awt.Label();
        lbl29 = new java.awt.Label();
        lbl34 = new java.awt.Label();
        lbl35 = new java.awt.Label();
        lbl36 = new java.awt.Label();
        lbl37 = new java.awt.Label();
        lbl39 = new java.awt.Label();
        lbl45 = new java.awt.Label();
        lbl46 = new java.awt.Label();
        lbl47 = new java.awt.Label();
        lbl48 = new java.awt.Label();
        lbl49 = new java.awt.Label();
        lbl56 = new java.awt.Label();
        lbl57 = new java.awt.Label();
        lbl58 = new java.awt.Label();
        lbl59 = new java.awt.Label();
        lbl67 = new java.awt.Label();
        lbl68 = new java.awt.Label();
        lbl69 = new java.awt.Label();
        lbl78 = new java.awt.Label();
        lbl79 = new java.awt.Label();
        lbl89 = new java.awt.Label();
        btn_sair = new java.awt.Button();
        lbl24 = new java.awt.Label();
        lbl38 = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 100, 100));
        setMinimumSize(new java.awt.Dimension(500, 500));
        getContentPane().setLayout(null);

        lbl_0.setText("0");
        getContentPane().add(lbl_0);
        lbl_0.setBounds(43, 10, 23, 20);

        lbl_1.setText("1");
        getContentPane().add(lbl_1);
        lbl_1.setBounds(76, 10, 20, 20);

        lbl_2.setText("2");
        getContentPane().add(lbl_2);
        lbl_2.setBounds(110, 10, 19, 20);

        lbl_3.setText("3");
        getContentPane().add(lbl_3);
        lbl_3.setBounds(140, 10, 11, 20);

        lbl_4.setText("4");
        getContentPane().add(lbl_4);
        lbl_4.setBounds(170, 10, 11, 20);

        lbl_5.setText("5");
        getContentPane().add(lbl_5);
        lbl_5.setBounds(200, 10, 11, 20);

        lbl_6.setText("6");
        getContentPane().add(lbl_6);
        lbl_6.setBounds(230, 10, 11, 20);

        lbl_7.setText("7");
        getContentPane().add(lbl_7);
        lbl_7.setBounds(260, 10, 11, 20);

        lbl_8.setText("8");
        getContentPane().add(lbl_8);
        lbl_8.setBounds(290, 10, 11, 20);

        lbl_9.setText("9");
        getContentPane().add(lbl_9);
        lbl_9.setBounds(320, 10, 11, 20);

        lbl0.setText("0");
        getContentPane().add(lbl0);
        lbl0.setBounds(10, 40, 11, 20);

        lbl1.setText("1");
        getContentPane().add(lbl1);
        lbl1.setBounds(10, 70, 11, 20);

        lbl2.setText("2");
        getContentPane().add(lbl2);
        lbl2.setBounds(10, 100, 11, 20);

        lbl3.setText("3");
        getContentPane().add(lbl3);
        lbl3.setBounds(10, 130, 11, 20);

        lbl4.setText("4");
        getContentPane().add(lbl4);
        lbl4.setBounds(10, 160, 11, 20);

        lbl5.setText("5");
        getContentPane().add(lbl5);
        lbl5.setBounds(10, 190, 11, 20);

        lbl6.setText("6");
        getContentPane().add(lbl6);
        lbl6.setBounds(10, 220, 11, 20);

        lbl7.setText("7");
        getContentPane().add(lbl7);
        lbl7.setBounds(10, 250, 11, 20);

        lbl8.setText("8");
        getContentPane().add(lbl8);
        lbl8.setBounds(10, 280, 11, 20);

        lbl9.setText("9");
        getContentPane().add(lbl9);
        lbl9.setBounds(10, 310, 11, 20);
        getContentPane().add(lbl00);
        lbl00.setBounds(43, 40, 30, 20);
        getContentPane().add(lbl11);
        lbl11.setBounds(76, 70, 20, 20);
        getContentPane().add(lbl22);
        lbl22.setBounds(110, 100, 30, 20);
        getContentPane().add(lbl33);
        lbl33.setBounds(140, 130, 30, 20);
        getContentPane().add(lbl44);
        lbl44.setBounds(170, 160, 20, 20);
        getContentPane().add(lbl55);
        lbl55.setBounds(200, 190, 20, 20);
        getContentPane().add(lbl66);
        lbl66.setBounds(230, 220, 20, 20);
        getContentPane().add(lbl77);
        lbl77.setBounds(260, 250, 20, 20);
        getContentPane().add(lbl88);
        lbl88.setBounds(290, 280, 20, 20);
        getContentPane().add(lbl99);
        lbl99.setBounds(320, 310, 20, 20);
        getContentPane().add(lbl01);
        lbl01.setBounds(76, 40, 30, 20);
        getContentPane().add(lbl02);
        lbl02.setBounds(110, 40, 30, 20);
        getContentPane().add(lbl03);
        lbl03.setBounds(140, 40, 30, 20);
        getContentPane().add(lbl04);
        lbl04.setBounds(170, 40, 30, 20);
        getContentPane().add(lbl05);
        lbl05.setBounds(200, 40, 30, 20);
        getContentPane().add(lbl06);
        lbl06.setBounds(230, 40, 30, 20);
        lbl06.getAccessibleContext().setAccessibleName("0");

        getContentPane().add(lbl07);
        lbl07.setBounds(260, 40, 30, 20);
        getContentPane().add(lbl08);
        lbl08.setBounds(290, 40, 30, 20);
        getContentPane().add(lbl09);
        lbl09.setBounds(320, 40, 30, 20);
        getContentPane().add(lbl12);
        lbl12.setBounds(110, 70, 30, 20);
        getContentPane().add(lbl13);
        lbl13.setBounds(140, 70, 30, 20);
        getContentPane().add(lbl14);
        lbl14.setBounds(170, 70, 30, 20);
        getContentPane().add(lbl15);
        lbl15.setBounds(200, 70, 30, 20);
        getContentPane().add(lbl16);
        lbl16.setBounds(230, 70, 30, 20);
        getContentPane().add(lbl17);
        lbl17.setBounds(260, 70, 30, 20);
        getContentPane().add(lbl18);
        lbl18.setBounds(290, 70, 30, 20);
        getContentPane().add(lbl19);
        lbl19.setBounds(320, 70, 30, 20);
        getContentPane().add(lbl23);
        lbl23.setBounds(140, 100, 30, 20);
        getContentPane().add(lbl25);
        lbl25.setBounds(200, 100, 30, 20);
        getContentPane().add(lbl26);
        lbl26.setBounds(230, 100, 30, 20);
        getContentPane().add(lbl27);
        lbl27.setBounds(260, 100, 30, 20);
        getContentPane().add(lbl28);
        lbl28.setBounds(290, 100, 30, 20);
        getContentPane().add(lbl29);
        lbl29.setBounds(320, 100, 30, 20);
        getContentPane().add(lbl34);
        lbl34.setBounds(170, 130, 30, 20);
        getContentPane().add(lbl35);
        lbl35.setBounds(200, 130, 30, 20);
        getContentPane().add(lbl36);
        lbl36.setBounds(230, 130, 30, 20);
        getContentPane().add(lbl37);
        lbl37.setBounds(260, 130, 30, 20);
        getContentPane().add(lbl39);
        lbl39.setBounds(320, 130, 30, 20);
        getContentPane().add(lbl45);
        lbl45.setBounds(200, 160, 30, 20);
        getContentPane().add(lbl46);
        lbl46.setBounds(230, 160, 30, 20);
        getContentPane().add(lbl47);
        lbl47.setBounds(260, 160, 30, 20);
        getContentPane().add(lbl48);
        lbl48.setBounds(290, 160, 30, 20);
        getContentPane().add(lbl49);
        lbl49.setBounds(320, 160, 40, 20);
        getContentPane().add(lbl56);
        lbl56.setBounds(230, 190, 30, 20);
        getContentPane().add(lbl57);
        lbl57.setBounds(260, 190, 30, 20);
        getContentPane().add(lbl58);
        lbl58.setBounds(290, 190, 30, 20);
        getContentPane().add(lbl59);
        lbl59.setBounds(320, 190, 30, 20);
        getContentPane().add(lbl67);
        lbl67.setBounds(260, 220, 30, 20);
        getContentPane().add(lbl68);
        lbl68.setBounds(290, 220, 30, 20);
        getContentPane().add(lbl69);
        lbl69.setBounds(320, 220, 40, 20);
        getContentPane().add(lbl78);
        lbl78.setBounds(290, 250, 30, 20);
        getContentPane().add(lbl79);
        lbl79.setBounds(320, 250, 20, 20);
        getContentPane().add(lbl89);
        lbl89.setBounds(320, 280, 30, 20);

        btn_sair.setLabel("Voltar");
        btn_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sairActionPerformed(evt);
            }
        });
        getContentPane().add(btn_sair);
        btn_sair.setBounds(330, 350, 80, 24);
        getContentPane().add(lbl24);
        lbl24.setBounds(170, 100, 30, 20);
        getContentPane().add(lbl38);
        lbl38.setBounds(290, 130, 30, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sairActionPerformed
        Menu m = new Menu(grafo);
        m.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btn_sairActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MostrarMatriz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MostrarMatriz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MostrarMatriz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MostrarMatriz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MostrarMatriz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btn_sair;
    private javax.swing.JPopupMenu jPopupMenu1;
    private java.awt.Label lbl0;
    private java.awt.Label lbl00;
    private java.awt.Label lbl01;
    private java.awt.Label lbl02;
    private java.awt.Label lbl03;
    private java.awt.Label lbl04;
    private java.awt.Label lbl05;
    private java.awt.Label lbl06;
    private java.awt.Label lbl07;
    private java.awt.Label lbl08;
    private java.awt.Label lbl09;
    private java.awt.Label lbl1;
    private java.awt.Label lbl11;
    private java.awt.Label lbl12;
    private java.awt.Label lbl13;
    private java.awt.Label lbl14;
    private java.awt.Label lbl15;
    private java.awt.Label lbl16;
    private java.awt.Label lbl17;
    private java.awt.Label lbl18;
    private java.awt.Label lbl19;
    private java.awt.Label lbl2;
    private java.awt.Label lbl22;
    private java.awt.Label lbl23;
    private java.awt.Label lbl24;
    private java.awt.Label lbl25;
    private java.awt.Label lbl26;
    private java.awt.Label lbl27;
    private java.awt.Label lbl28;
    private java.awt.Label lbl29;
    private java.awt.Label lbl3;
    private java.awt.Label lbl33;
    private java.awt.Label lbl34;
    private java.awt.Label lbl35;
    private java.awt.Label lbl36;
    private java.awt.Label lbl37;
    private java.awt.Label lbl38;
    private java.awt.Label lbl39;
    private java.awt.Label lbl4;
    private java.awt.Label lbl44;
    private java.awt.Label lbl45;
    private java.awt.Label lbl46;
    private java.awt.Label lbl47;
    private java.awt.Label lbl48;
    private java.awt.Label lbl49;
    private java.awt.Label lbl5;
    private java.awt.Label lbl55;
    private java.awt.Label lbl56;
    private java.awt.Label lbl57;
    private java.awt.Label lbl58;
    private java.awt.Label lbl59;
    private java.awt.Label lbl6;
    private java.awt.Label lbl66;
    private java.awt.Label lbl67;
    private java.awt.Label lbl68;
    private java.awt.Label lbl69;
    private java.awt.Label lbl7;
    private java.awt.Label lbl77;
    private java.awt.Label lbl78;
    private java.awt.Label lbl79;
    private java.awt.Label lbl8;
    private java.awt.Label lbl88;
    private java.awt.Label lbl89;
    private java.awt.Label lbl9;
    private java.awt.Label lbl99;
    private java.awt.Label lbl_0;
    private java.awt.Label lbl_1;
    private java.awt.Label lbl_2;
    private java.awt.Label lbl_3;
    private java.awt.Label lbl_4;
    private java.awt.Label lbl_5;
    private java.awt.Label lbl_6;
    private java.awt.Label lbl_7;
    private java.awt.Label lbl_8;
    private java.awt.Label lbl_9;
    // End of variables declaration//GEN-END:variables
}
