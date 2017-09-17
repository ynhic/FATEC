/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetoIa.telas;

import br.com.projeto.entity.Grafo;
import br.com.projetoIa.Functions.Buscar;
import javax.swing.JOptionPane;

/**
 *
 * @author asus
 */
public class Menu extends javax.swing.JFrame {
    Grafo grafo;
    /**
     * Creates new form Menu
     */
    public Menu(Grafo grafo1) {
        initComponents();
        grafo = grafo1;
        verMatriz(grafo);
        VerGrafo(grafo);
        System.out.println(grafo.getNumeroDeNodos());
        
    }
    
     public void verMatriz(Grafo grafo1) {
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
     
    public void VerGrafo(Grafo grafo1) {
        grafo = grafo1;
        if (grafo.getNumeroDeNodos() >= 2) {
            lb_0.setText("0");
            lb_1.setText("1");
            if (grafo.getMatrizDePesos()[0][1] != 0) {
                op_01.setText("|");
            }

            if (grafo.getNumeroDeNodos() >= 3) {
                lb_2.setText("2");
                if (grafo.getMatrizDePesos()[0][2] != 0) {
                    op_02.setText("----");
                }
                if (grafo.getMatrizDePesos()[1][2] != 0) {
                    op_03.setText("/");
                }

                if (grafo.getNumeroDeNodos() >= 4) {
                    lb_3.setText("3");
                    if (grafo.getMatrizDePesos()[1][3] != 0) {
                        op_04.setText("----");
                    }
                    if (grafo.getMatrizDePesos()[2][3] != 0) {
                        op_05.setText("|");
                    }
                    if (grafo.getMatrizDePesos()[0][3] != 0) {
                        if (op_03.getText() == "/") {
                            op_03.setText("X");
                        } else {
                            op_03.setText("\\");
                        }
                    }
                    if (grafo.getNumeroDeNodos() >= 5) {
                        lb_4.setText("4");
                        if (grafo.getMatrizDePesos()[2][4] != 0) {
                            op_06.setText("----");
                        }
                        if (grafo.getMatrizDePesos()[3][4] != 0) {
                            op_07.setText("/");
                        }

                        if (grafo.getNumeroDeNodos() >= 6) {
                            lb_5.setText("5");
                            if (grafo.getMatrizDePesos()[2][5] != 0) {
                                if (op_07.getText() == "/") {
                                    op_07.setText("X");
                                } else {
                                    op_07.setText("\\");
                                }
                            }
                            if (grafo.getMatrizDePesos()[3][5] != 0) {
                                op_08.setText("----");
                            }
                            if (grafo.getMatrizDePesos()[4][5] != 0) {
                                op_09.setText("|");
                            }

                            if (grafo.getNumeroDeNodos() >= 7) {
                                lb_6.setText("6");
                                if (grafo.getMatrizDePesos()[4][6] != 0) {
                                    op_10.setText("----");
                                }
                                if (grafo.getMatrizDePesos()[5][6] != 0) {
                                    op_11.setText("/");
                                }

                                if (grafo.getNumeroDeNodos() >= 8) {
                                    lb_7.setText("7");
                                    if (grafo.getMatrizDePesos()[4][7] != 0) {
                                        if (op_11.getText() == "/") {
                                            op_11.setText("X");
                                        } else {
                                            op_11.setText("\\");
                                        }
                                    }
                                    if (grafo.getMatrizDePesos()[5][7] != 0) {
                                        op_12.setText("----");
                                    }
                                    if (grafo.getMatrizDePesos()[6][7] != 0) {
                                        op_13.setText("|");
                                    }

                                    if (grafo.getNumeroDeNodos() >= 9) {
                                        lb_8.setText("8");
                                        if (grafo.getMatrizDePesos()[7][8] != 0) {
                                            op_15.setText("/");
                                        }
                                        if (grafo.getMatrizDePesos()[6][8] != 0) {
                                            op_14.setText("----");
                                        }

                                        if (grafo.getNumeroDeNodos() == 10) {
                                            lb_9.setText("9");
                                            if (grafo.getMatrizDePesos()[8][9] != 0) {
                                                op_17.setText("|");
                                            }
                                            if (grafo.getMatrizDePesos()[7][9] != 0) {
                                                op_16.setText("----");
                                            }
                                            if (grafo.getMatrizDePesos()[6][9] != 0) {
                                                if (op_15.getText() == "/") {
                                                    op_15.setText("X");
                                                } else {
                                                    op_15.setText("\\");
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
    
    private void adicionarAresta(){
        int peso = 0;
        if(Integer.parseInt(txt_a1.getText())%2 == 0)
           if(Integer.parseInt(txt_a1.getText()) == Integer.parseInt(txt_a2.getText()) + 3 || Integer.parseInt(txt_a2.getText()) == Integer.parseInt(txt_a1.getText()) + 3)
                peso = 2;
            else
                peso = 1;
        else
        if(Integer.parseInt(txt_a1.getText()) == Integer.parseInt(txt_a2.getText()) + 1 || Integer.parseInt(txt_a2.getText()) == Integer.parseInt(txt_a1.getText()) + 1)
            peso = 2;
        else
            peso = 1;
            grafo.addAresta(Integer.parseInt(txt_a1.getText()), Integer.parseInt(txt_a2.getText()), peso);
            JOptionPane.showMessageDialog(null, "Aresta Adicionada");
            verMatriz(grafo);
            VerGrafo(grafo);  
    }

    Menu() {
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

        button1 = new java.awt.Button();
        btnAddAresta = new java.awt.Button();
        btnVerMatriz = new java.awt.Button();
        btnVerGrafo = new java.awt.Button();
        jPanel1 = new javax.swing.JPanel();
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
        lbl24 = new java.awt.Label();
        lbl38 = new java.awt.Label();
        jPanel2 = new javax.swing.JPanel();
        op_11 = new java.awt.Label();
        lb_6 = new java.awt.Label();
        op_13 = new java.awt.Label();
        lb_7 = new java.awt.Label();
        op_14 = new java.awt.Label();
        op_15 = new java.awt.Label();
        op_16 = new java.awt.Label();
        lb_8 = new java.awt.Label();
        op_17 = new java.awt.Label();
        lb_9 = new java.awt.Label();
        op_02 = new java.awt.Label();
        lb_0 = new java.awt.Label();
        lb_1 = new java.awt.Label();
        op_01 = new java.awt.Label();
        lb_2 = new java.awt.Label();
        lb_3 = new java.awt.Label();
        op_03 = new java.awt.Label();
        op_04 = new java.awt.Label();
        op_05 = new java.awt.Label();
        op_06 = new java.awt.Label();
        op_08 = new java.awt.Label();
        op_07 = new java.awt.Label();
        lb_4 = new java.awt.Label();
        lb_5 = new java.awt.Label();
        op_09 = new java.awt.Label();
        op_10 = new java.awt.Label();
        op_12 = new java.awt.Label();
        label1 = new java.awt.Label();
        btn_calcular = new java.awt.Button();
        lbl_custo = new java.awt.Label();
        lbl_menorCaminho = new java.awt.Label();
        txt_fim = new java.awt.TextField();
        txt_começo = new java.awt.TextField();
        jButton1 = new javax.swing.JButton();
        label3 = new java.awt.Label();
        label4 = new java.awt.Label();
        btn_addAresta = new java.awt.Button();
        label2 = new java.awt.Label();
        label5 = new java.awt.Label();
        txt_a1 = new java.awt.TextField();
        txt_a2 = new java.awt.TextField();

        button1.setLabel("button1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        btnAddAresta.setLabel("Adicionar Aresta");
        btnAddAresta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddArestaActionPerformed(evt);
            }
        });

        btnVerMatriz.setLabel("Ver Matriz");
        btnVerMatriz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerMatrizActionPerformed(evt);
            }
        });

        btnVerGrafo.setLabel("Ver Grafo");
        btnVerGrafo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerGrafoActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        lbl_0.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        lbl_0.setText("0");

        lbl_1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        lbl_1.setText("1");

        lbl_2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        lbl_2.setText("2");

        lbl_3.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        lbl_3.setText("3");

        lbl_4.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        lbl_4.setText("4");

        lbl_5.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        lbl_5.setText("5");

        lbl_6.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        lbl_6.setText("6");

        lbl_7.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        lbl_7.setText("7");

        lbl_8.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        lbl_8.setText("8");

        lbl_9.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        lbl_9.setText("9");

        lbl0.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        lbl0.setText("0");

        lbl1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        lbl1.setText("1");

        lbl2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        lbl2.setText("2");

        lbl3.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        lbl3.setText("3");

        lbl4.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        lbl4.setText("4");

        lbl5.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        lbl5.setText("5");

        lbl6.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        lbl6.setText("6");

        lbl7.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        lbl7.setText("7");

        lbl8.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        lbl8.setText("8");

        lbl9.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        lbl9.setText("9");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_0, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(lbl_1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(lbl_2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(lbl_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl00, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl01, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl11, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl02, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl03, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl23, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl33, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl04, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl24, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl34, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl44, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl05, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl25, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl35, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl45, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl55, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl06, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl16, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl26, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl36, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl46, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl56, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl66, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl07, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl27, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl37, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl47, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl57, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl67, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl77, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl08, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl18, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl28, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl38, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl48, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl58, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl68, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl78, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl88, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl09, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl19, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl29, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl39, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl49, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl59, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl69, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl79, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl89, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl99, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl03, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl04, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl05, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl06, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl07, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl08, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl09, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lbl00, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl01, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl55, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl56, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl57, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl58, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl59, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl66, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl67, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl68, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl69, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl77, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl78, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl79, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl88, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl89, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(lbl9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl99, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        op_11.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        lb_6.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        op_13.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        lb_7.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        op_14.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        op_15.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        op_16.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        lb_8.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        op_17.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        lb_9.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        op_02.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        lb_0.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        lb_1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        op_01.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        lb_2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        lb_3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        op_03.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        op_04.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        op_05.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        op_06.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        op_08.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        op_07.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        lb_4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        lb_5.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        op_09.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        op_10.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        op_12.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lb_0, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(op_02, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(lb_2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(op_06, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(lb_4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(op_10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(lb_6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(op_14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(lb_8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(op_01, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(op_03, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(op_05, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(op_07, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(op_09, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(op_11, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(op_13, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(op_15, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(op_17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lb_1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(op_04, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(lb_3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(op_08, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(lb_5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(op_12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(lb_7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(op_16, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(lb_9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(175, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(op_02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(op_06, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(op_10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(op_14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(op_01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(op_03, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(op_05, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(op_07, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(op_09, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(op_11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(op_13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(op_15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(op_17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(op_04, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(op_08, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(op_12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(op_16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        label1.setText("Menor Caminho:");

        btn_calcular.setLabel("Menor");
        btn_calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_calcularActionPerformed(evt);
            }
        });

        jButton1.setText("manhattan");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        label3.setText("Custo: ");

        label4.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        label4.setText("Heurística: Pronfundidade, olhando todos os filhos e escolhendo o mais próximo");

        btn_addAresta.setLabel("Adicionar");
        btn_addAresta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addArestaActionPerformed(evt);
            }
        });

        label2.setText("Vertice 1");

        label5.setText("Vertice2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnVerGrafo, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnVerMatriz, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addComponent(txt_começo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(txt_fim, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(btn_calcular, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_menorCaminho, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2)
                                        .addComponent(lbl_custo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txt_a2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_a1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(39, 39, 39)
                                .addComponent(btn_addAresta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnAddAresta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAddAresta, btnVerGrafo, btnVerMatriz, btn_calcular, jButton1});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addComponent(btnAddAresta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_a1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_addAresta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_a2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_calcular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_começo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_fim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_menorCaminho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_custo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jButton1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnVerMatriz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVerGrafo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAddAresta, btnVerGrafo, btnVerMatriz, btn_calcular, jButton1});

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddArestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddArestaActionPerformed
      
    }//GEN-LAST:event_btnAddArestaActionPerformed

    private void btnVerMatrizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerMatrizActionPerformed
        
    }//GEN-LAST:event_btnVerMatrizActionPerformed

    private void btnVerGrafoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerGrafoActionPerformed
        /*VerGrafo g = new VerGrafo(grafo);
        g.setVisible(true);
        setVisible(false);*/
    }//GEN-LAST:event_btnVerGrafoActionPerformed

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
        System.out.println(buscar.manhattan(Integer.parseInt(txt_começo.getText()), Integer.parseInt(txt_fim.getText()), grafo));
        lbl_menorCaminho.setText(buscar.manhattan(Integer.parseInt(txt_começo.getText()), Integer.parseInt(txt_fim.getText()), grafo));
        lbl_custo.setText(Float.toString(buscar.returnCusto()));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_addArestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addArestaActionPerformed
        int peso;
        try{
            if(Integer.parseInt(txt_a1.getText()) > grafo.getNumeroDeNodos() -1 || Integer.parseInt(txt_a2.getText()) > grafo.getNumeroDeNodos() -1){
                JOptionPane.showMessageDialog(null, "Digite numeros entre 0 e " + (grafo.getNumeroDeNodos() - 1));
            }else{
                if(Integer.parseInt(txt_a1.getText()) == Integer.parseInt(txt_a2.getText())){
                    JOptionPane.showMessageDialog(null, "Vertice não pode se ligar com sigo mesmo");
                }else{
                    if(Integer.parseInt(txt_a1.getText()) > Integer.parseInt(txt_a2.getText()) + 3 || Integer.parseInt(txt_a1.getText()) < Integer.parseInt(txt_a2.getText()) - 3){
                        JOptionPane.showMessageDialog(null, "Vertices estão muito longe");

                    }else{
                        if(Integer.parseInt(txt_a1.getText()) < Integer.parseInt(txt_a2.getText())){
                            if(Integer.parseInt(txt_a1.getText())%2 == 1 && Integer.parseInt(txt_a1.getText()) == Integer.parseInt(txt_a2.getText()) -3)
                            JOptionPane.showMessageDialog(null, "Vertices estão muito longe");
                            else
                            adicionarAresta();
                        }else{
                            if(Integer.parseInt(txt_a2.getText())%2 != 1 && Integer.parseInt(txt_a2.getText()) == Integer.parseInt(txt_a1.getText()) -3)
                            JOptionPane.showMessageDialog(null, "Vertices estão muito longe");
                            else
                            adicionarAresta();
                        }

                    }
                }
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Digite apenas numeros");
        }

    }//GEN-LAST:event_btn_addArestaActionPerformed

    /**
     * @param args the command line arguments
     */
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btnAddAresta;
    private java.awt.Button btnVerGrafo;
    private java.awt.Button btnVerMatriz;
    private java.awt.Button btn_addAresta;
    private java.awt.Button btn_calcular;
    private java.awt.Button button1;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label lb_0;
    private java.awt.Label lb_1;
    private java.awt.Label lb_2;
    private java.awt.Label lb_3;
    private java.awt.Label lb_4;
    private java.awt.Label lb_5;
    private java.awt.Label lb_6;
    private java.awt.Label lb_7;
    private java.awt.Label lb_8;
    private java.awt.Label lb_9;
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
    private java.awt.Label lbl_custo;
    private java.awt.Label lbl_menorCaminho;
    private java.awt.Label op_01;
    private java.awt.Label op_02;
    private java.awt.Label op_03;
    private java.awt.Label op_04;
    private java.awt.Label op_05;
    private java.awt.Label op_06;
    private java.awt.Label op_07;
    private java.awt.Label op_08;
    private java.awt.Label op_09;
    private java.awt.Label op_10;
    private java.awt.Label op_11;
    private java.awt.Label op_12;
    private java.awt.Label op_13;
    private java.awt.Label op_14;
    private java.awt.Label op_15;
    private java.awt.Label op_16;
    private java.awt.Label op_17;
    private java.awt.TextField txt_a1;
    private java.awt.TextField txt_a2;
    private java.awt.TextField txt_começo;
    private java.awt.TextField txt_fim;
    // End of variables declaration//GEN-END:variables

}
