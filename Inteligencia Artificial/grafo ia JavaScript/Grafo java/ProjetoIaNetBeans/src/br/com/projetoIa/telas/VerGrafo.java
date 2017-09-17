/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetoIa.telas;

import br.com.projeto.entity.Grafo;
import br.com.projetoIa.Functions.Buscar;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author asus
 */
public class VerGrafo extends javax.swing.JFrame {

    Grafo grafo;

    public VerGrafo(Grafo grafo1) {
        initComponents();
        grafo = grafo1;

        if (grafo.getNumeroDeNodos() >= 2) {
            lbl_0.setText("0");
            lbl_1.setText("1");
            if (grafo.getMatrizDePesos()[0][1] != 0) {
                lbl_01.setText("|");
            }

            if (grafo.getNumeroDeNodos() >= 3) {
                lbl_2.setText("2");
                if (grafo.getMatrizDePesos()[0][2] != 0) {
                    lbl_02.setText("----");
                }
                if (grafo.getMatrizDePesos()[1][2] != 0) {
                    lbl_0312.setText("/");
                }

                if (grafo.getNumeroDeNodos() >= 4) {
                    lbl_3.setText("3");
                    if (grafo.getMatrizDePesos()[1][3] != 0) {
                        lbl_13.setText("----");
                    }
                    if (grafo.getMatrizDePesos()[2][3] != 0) {
                        lbl_23.setText("|");
                    }
                    if (grafo.getMatrizDePesos()[0][3] != 0) {
                        if (lbl_0312.getText() == "/") {
                            lbl_0312.setText("X");
                        } else {
                            lbl_0312.setText("\\");
                        }
                    }
                    if (grafo.getNumeroDeNodos() >= 5) {
                        lbl_4.setText("4");
                        if (grafo.getMatrizDePesos()[2][4] != 0) {
                            lbl_24.setText("----");
                        }
                        if (grafo.getMatrizDePesos()[3][4] != 0) {
                            lbl_2534.setText("/");
                        }

                        if (grafo.getNumeroDeNodos() >= 6) {
                            lbl_5.setText("5");
                            if (grafo.getMatrizDePesos()[2][5] != 0) {
                                if (lbl_2534.getText() == "/") {
                                    lbl_2534.setText("X");
                                } else {
                                    lbl_2534.setText("\\");
                                }
                            }
                            if (grafo.getMatrizDePesos()[3][5] != 0) {
                                lbl_35.setText("----");
                            }
                            if (grafo.getMatrizDePesos()[4][5] != 0) {
                                lbl_45.setText("|");
                            }

                            if (grafo.getNumeroDeNodos() >= 7) {
                                lbl_6.setText("6");
                                if (grafo.getMatrizDePesos()[4][6] != 0) {
                                    lbl_46.setText("----");
                                }
                                if (grafo.getMatrizDePesos()[5][6] != 0) {
                                    lbl_4756.setText("/");
                                }

                                if (grafo.getNumeroDeNodos() >= 8) {
                                    lbl_7.setText("7");
                                    if (grafo.getMatrizDePesos()[4][7] != 0) {
                                        if (lbl_4756.getText() == "/") {
                                            lbl_4756.setText("X");
                                        } else {
                                            lbl_4756.setText("\\");
                                        }
                                    }
                                    if (grafo.getMatrizDePesos()[5][7] != 0) {
                                        lbl_57.setText("----");
                                    }
                                    if (grafo.getMatrizDePesos()[6][7] != 0) {
                                        lbl_67.setText("|");
                                    }

                                    if (grafo.getNumeroDeNodos() >= 9) {
                                        lbl_8.setText("8");
                                        if (grafo.getMatrizDePesos()[7][8] != 0) {
                                            lbl_6978.setText("/");
                                        }
                                        if (grafo.getMatrizDePesos()[6][8] != 0) {
                                            lbl_68.setText("----");
                                        }

                                        if (grafo.getNumeroDeNodos() == 10) {
                                            lbl_9.setText("9");
                                            if (grafo.getMatrizDePesos()[8][9] != 0) {
                                                lbl_89.setText("|");
                                            }
                                            if (grafo.getMatrizDePesos()[7][9] != 0) {
                                                lbl_79.setText("----");
                                            }
                                            if (grafo.getMatrizDePesos()[6][9] != 0) {
                                                if (lbl_6978.getText() == "/") {
                                                    lbl_6978.setText("X");
                                                } else {
                                                    lbl_6978.setText("\\");
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

        }
    }

    private VerGrafo() {
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

        label7 = new java.awt.Label();
        lbl_0 = new java.awt.Label();
        lbl_1 = new java.awt.Label();
        lbl_01 = new java.awt.Label();
        lbl_2 = new java.awt.Label();
        lbl_3 = new java.awt.Label();
        lbl_0312 = new java.awt.Label();
        lbl_13 = new java.awt.Label();
        lbl_23 = new java.awt.Label();
        lbl_24 = new java.awt.Label();
        lbl_35 = new java.awt.Label();
        lbl_2534 = new java.awt.Label();
        lbl_4 = new java.awt.Label();
        lbl_5 = new java.awt.Label();
        lbl_45 = new java.awt.Label();
        lbl_46 = new java.awt.Label();
        lbl_57 = new java.awt.Label();
        lbl_4756 = new java.awt.Label();
        lbl_6 = new java.awt.Label();
        lbl_67 = new java.awt.Label();
        lbl_7 = new java.awt.Label();
        lbl_68 = new java.awt.Label();
        lbl_6978 = new java.awt.Label();
        lbl_79 = new java.awt.Label();
        lbl_8 = new java.awt.Label();
        lbl_89 = new java.awt.Label();
        lbl_9 = new java.awt.Label();
        label1 = new java.awt.Label();
        btn_calcular = new java.awt.Button();
        lbl_custo = new java.awt.Label();
        lbl_menorCaminho = new java.awt.Label();
        btn_voltar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        label2 = new java.awt.Label();
        txt_fim = new java.awt.TextField();
        txt_começo = new java.awt.TextField();
        jButton1 = new javax.swing.JButton();
        label3 = new java.awt.Label();
        lbl_02 = new java.awt.Label();
        label4 = new java.awt.Label();

        label7.setText("label7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 300, 300));
        setMinimumSize(new java.awt.Dimension(500, 500));
        setResizable(false);
        getContentPane().setLayout(null);
        getContentPane().add(lbl_0);
        lbl_0.setBounds(190, 40, 10, 19);
        getContentPane().add(lbl_1);
        lbl_1.setBounds(190, 100, 10, 19);
        getContentPane().add(lbl_01);
        lbl_01.setBounds(190, 70, 20, 19);
        getContentPane().add(lbl_2);
        lbl_2.setBounds(240, 40, 20, 19);
        getContentPane().add(lbl_3);
        lbl_3.setBounds(240, 100, 20, 19);
        getContentPane().add(lbl_0312);
        lbl_0312.setBounds(210, 70, 20, 19);
        getContentPane().add(lbl_13);
        lbl_13.setBounds(210, 100, 30, 19);
        getContentPane().add(lbl_23);
        lbl_23.setBounds(240, 70, 20, 19);
        getContentPane().add(lbl_24);
        lbl_24.setBounds(260, 40, 30, 19);
        getContentPane().add(lbl_35);
        lbl_35.setBounds(260, 100, 30, 19);
        getContentPane().add(lbl_2534);
        lbl_2534.setBounds(260, 70, 20, 19);
        getContentPane().add(lbl_4);
        lbl_4.setBounds(290, 40, 20, 19);
        getContentPane().add(lbl_5);
        lbl_5.setBounds(290, 100, 20, 19);
        getContentPane().add(lbl_45);
        lbl_45.setBounds(290, 70, 20, 19);
        getContentPane().add(lbl_46);
        lbl_46.setBounds(310, 40, 30, 19);
        getContentPane().add(lbl_57);
        lbl_57.setBounds(310, 100, 30, 19);
        getContentPane().add(lbl_4756);
        lbl_4756.setBounds(310, 70, 20, 19);
        getContentPane().add(lbl_6);
        lbl_6.setBounds(340, 40, 20, 19);
        getContentPane().add(lbl_67);
        lbl_67.setBounds(340, 70, 20, 19);
        getContentPane().add(lbl_7);
        lbl_7.setBounds(340, 100, 20, 19);
        getContentPane().add(lbl_68);
        lbl_68.setBounds(360, 40, 30, 19);
        getContentPane().add(lbl_6978);
        lbl_6978.setBounds(360, 70, 20, 19);
        getContentPane().add(lbl_79);
        lbl_79.setBounds(360, 100, 20, 19);
        getContentPane().add(lbl_8);
        lbl_8.setBounds(390, 40, 30, 19);
        getContentPane().add(lbl_89);
        lbl_89.setBounds(390, 70, 30, 19);
        getContentPane().add(lbl_9);
        lbl_9.setBounds(390, 100, 20, 19);

        label1.setText("Menor Caminho:");
        getContentPane().add(label1);
        label1.setBounds(30, 170, 105, 19);

        btn_calcular.setLabel("Menor");
        btn_calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_calcularActionPerformed(evt);
            }
        });
        getContentPane().add(btn_calcular);
        btn_calcular.setBounds(300, 160, 100, 23);
        getContentPane().add(lbl_custo);
        lbl_custo.setBounds(80, 240, 160, 19);
        getContentPane().add(lbl_menorCaminho);
        lbl_menorCaminho.setBounds(30, 210, 260, 19);

        btn_voltar.setText("Voltar");
        btn_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_voltarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_voltar);
        btn_voltar.setBounds(310, 270, 80, 31);

        jLabel1.setText("Começo");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(150, 150, 60, 15);

        label2.setText("Fim");
        getContentPane().add(label2);
        label2.setBounds(240, 150, 25, 19);
        getContentPane().add(txt_fim);
        txt_fim.setBounds(230, 170, 40, 19);
        getContentPane().add(txt_começo);
        txt_começo.setBounds(150, 170, 40, 19);

        jButton1.setText("manhattan");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(290, 210, 100, 31);

        label3.setText("Custo: ");
        getContentPane().add(label3);
        label3.setBounds(30, 240, 48, 19);
        getContentPane().add(lbl_02);
        lbl_02.setBounds(210, 40, 30, 19);

        label4.setText("Heurística: Pronfundidade, olhando todos os filhos e escolhendo o mais próximo");
        getContentPane().add(label4);
        label4.setBounds(10, 350, 570, 60);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_voltarActionPerformed
        Menu m = new Menu(grafo);
        m.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btn_voltarActionPerformed

    private void btn_calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_calcularActionPerformed

        if (Integer.parseInt(txt_começo.getText()) < 0 || Integer.parseInt(txt_fim.getText()) < 0 || Integer.parseInt(txt_fim.getText()) > grafo.getNumeroDeNodos() - 1 || Integer.parseInt(txt_fim.getText()) > grafo.getNumeroDeNodos() - 1) {
            JOptionPane.showMessageDialog(null, "Não coleque valores < 0 ou > " + Integer.toString(grafo.getNumeroDeNodos() - 1));
        } else {
            if (Integer.parseInt(txt_começo.getText()) == Integer.parseInt(txt_fim.getText())) {
                JOptionPane.showMessageDialog(null, "Não coloque numeros iguais");
            }
        }

        Buscar buscar = new Buscar();
        lbl_menorCaminho.setText(buscar.buscarMenor(Integer.parseInt(txt_começo.getText()), Integer.parseInt(txt_fim.getText()), grafo));
        lbl_custo.setText(Float.toString(buscar.returnCusto()));

    }//GEN-LAST:event_btn_calcularActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if (Integer.parseInt(txt_começo.getText()) < 0 || Integer.parseInt(txt_fim.getText()) < 0 || Integer.parseInt(txt_fim.getText()) > grafo.getNumeroDeNodos() - 1 || Integer.parseInt(txt_fim.getText()) > grafo.getNumeroDeNodos() - 1) {
            JOptionPane.showMessageDialog(null, "Não coleque valores < 0 ou > " + Integer.toString(grafo.getNumeroDeNodos() - 1));
        } else {
            if (Integer.parseInt(txt_começo.getText()) == Integer.parseInt(txt_fim.getText())) {
                JOptionPane.showMessageDialog(null, "Não coloque numeros iguais");
            }
        }

        Buscar buscar = new Buscar();
        lbl_menorCaminho.setText(buscar.manhattan(Integer.parseInt(txt_começo.getText()), Integer.parseInt(txt_fim.getText()), grafo));
        lbl_custo.setText(Float.toString(buscar.returnCusto()));

    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(VerGrafo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VerGrafo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VerGrafo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VerGrafo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VerGrafo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btn_calcular;
    private javax.swing.JButton btn_voltar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label7;
    private java.awt.Label lbl_0;
    private java.awt.Label lbl_01;
    private java.awt.Label lbl_02;
    private java.awt.Label lbl_0312;
    private java.awt.Label lbl_1;
    private java.awt.Label lbl_13;
    private java.awt.Label lbl_2;
    private java.awt.Label lbl_23;
    private java.awt.Label lbl_24;
    private java.awt.Label lbl_2534;
    private java.awt.Label lbl_3;
    private java.awt.Label lbl_35;
    private java.awt.Label lbl_4;
    private java.awt.Label lbl_45;
    private java.awt.Label lbl_46;
    private java.awt.Label lbl_4756;
    private java.awt.Label lbl_5;
    private java.awt.Label lbl_57;
    private java.awt.Label lbl_6;
    private java.awt.Label lbl_67;
    private java.awt.Label lbl_68;
    private java.awt.Label lbl_6978;
    private java.awt.Label lbl_7;
    private java.awt.Label lbl_79;
    private java.awt.Label lbl_8;
    private java.awt.Label lbl_89;
    private java.awt.Label lbl_9;
    private java.awt.Label lbl_custo;
    private java.awt.Label lbl_menorCaminho;
    private java.awt.TextField txt_começo;
    private java.awt.TextField txt_fim;
    // End of variables declaration//GEN-END:variables
}
