/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetoIa.Functions;

import br.com.projeto.entity.Grafo;

/**
 *
 * @author asus
 */
public class Buscar {

    String caminho = "";
    float peso = 0;
    int i = 0;
    int i2 = 0;
    int i3 = 11;
    int i4 = 11;
    int i5 = 10;

    public String buscarMenor(int inicio, int fim, Grafo grafo) {
        peso = 0;
        i = inicio;
        i2 = grafo.getNumeroDeNodos() - 1;
        for (; i5 >= 0; i5--) {
            for (; i2 >= 0; i2--) {
                if (grafo.getMatrizDePesos()[i][i2] != 0) {
                    if (i3 > Math.abs(i2 - fim)) {
                        i3 = Math.abs(i2 - fim);
                        i4 = i2;
                    }
                }
            }
            if(grafo.getMatrizDePesos()[i][i4] == 2)
                peso += 1.41;
            else
                peso += grafo.getMatrizDePesos()[i][i4];
            
            caminho += Integer.toString(i) + "->" + Integer.toString(i4) + " ";
            i = i4;
            if (i3 == 0) {
                return caminho;
            }
            if (i4 >= 11) {
                return "busca impossivel";
            }
            i4 = 11;
            i2 = grafo.getNumeroDeNodos() - 1;

        }
        return "busca impossivel";

    }

    public String manhattan(int inicio, int fim, Grafo grafo) {
        peso = 0;
        i = inicio;
        i2 = grafo.getNumeroDeNodos() - 1;
        for (; i5 >= 0; i5--) {
            for (; i2 >= 0; i2--) {
                if (grafo.getMatrizDePesos()[i][i2] == 1) {
                    if (i3 > Math.abs(i2 - fim)) {
                        i3 = Math.abs(i2 - fim);
                        i4 = i2;
                    }
                }
            }
            peso += grafo.getMatrizDePesos()[i][i4];
            caminho += Integer.toString(i) + "->" + Integer.toString(i4) + " ";
            i = i4;
            if (i3 == 0) {
                return caminho;
            }
            if (i4 >= 11) {
                return "busca impossivel";
            }
            i4 = 11;
            i2 = grafo.getNumeroDeNodos() - 1;

        }
        return "busca impossivel";

    }

    public float returnCusto() {
        System.out.println(peso);
        return peso;
    }

}
