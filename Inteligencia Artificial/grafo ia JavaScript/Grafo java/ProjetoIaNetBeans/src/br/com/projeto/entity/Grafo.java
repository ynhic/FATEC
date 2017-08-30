/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projeto.entity;

/**
 *
 * @author asus
 */
public class Grafo {
    private int numeroDeNodos;
    private Integer[][] matrizDePesos;
    
    @SuppressWarnings("empty-statement")
    public Grafo(int numeroDeNodos) throws Exception{
        
        if (numeroDeNodos <=0)
            throw new Exception("o numero de nodos deve ser > 0") ;    
        this.numeroDeNodos = numeroDeNodos;
        
        try{
            setMatrizDePesos(criarMatrizInt(numeroDeNodos, 0));
            
        }catch(Exception ex){
            if (ex.getMessage() == null)
		System.out.println("Ocorreu um erro de " + ex + " no construtor");
            else
		System.out.println(ex.getMessage());
        }
    }
    
    public Integer[][] criarMatrizInt(int tamanho, Integer valorPadrao) throws Exception {
		if (tamanho <= 1)
			throw new Exception("o tamanho deve ser maior que 1");
		// como o grafo vai considerar valores de 1-n
		Integer matriz[][] = new Integer[tamanho + 1][];
		try {
			for (int i = 0; i < tamanho; i++) {
				matriz[i] = new Integer[tamanho + 1];
				for (int j = 0; j < tamanho; j++) {
					matriz[i][j] = valorPadrao;
				}
			}
		} catch (Exception ex) {
			if (ex.getMessage() == null)
				System.out.println("Ocorreu um erro de " + ex + " em criaMatrizInt");
			else
				System.out.println("Erro ao criar a matriz");
		}
		return matriz;
	}

    /**
     * @return the numeroDeNodos
     */
    public int getNumeroDeNodos() {
        return numeroDeNodos;
    }

    /**
     * @param numeroDeNodos the numeroDeNodos to set
     */
    public void setNumeroDeNodos(int numeroDeNodos) {
        this.numeroDeNodos = numeroDeNodos;
    }

    /**
     * @return the matrizDePesos
     */
    public Integer[][] getMatrizDePesos() {
        return matrizDePesos;
    }

    /**
     * @param matrizDePesos the matrizDePesos to set
     */
    public void setMatrizDePesos(Integer[][] matrizDePesos) {
        this.matrizDePesos = matrizDePesos;
    }
    
    public void addAresta(int a1, int a2, int peso){
        matrizDePesos[a1][a2] = peso;
        matrizDePesos[a2][a1] = peso;
    }
    
}
