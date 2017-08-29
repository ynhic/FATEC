var matrizArmazenada;
var matrizRecuperada;

function armazenarMatrizTest(){
	clearConsole();
	matrizArmazenada = armazenarMatriz(matrizCorrente);
}

function recuperarMatrizTest(){
	clearConsole();
	matrizRecuperada = recuperarMatriz(matrizArmazenada);
	matrizCorrente = matrizRecuperada;
	drawingMatrixTable(matrizRecuperada);
}

function armazenarMatriz(matrizCorrente){
	
    setConsole("Exibe matriz de adjacências\n");
	sessionStorage.setItem('matriz', JSON.stringify(matrizCorrente));

	var linha ="";
	var posAux = 0;
	
	var matrixAux = new Array(matrizCorrente.length);
	
	for(i = 0 ; i < matrizCorrente.length ; i++){
		
		matrixAux[i] = new Array(posAux);
		for(ii = 0 ; ii <= posAux ; ii++){
			matrixAux[i][ii] = matrizCorrente[i][ii];
			
		}
		posAux++;
	}
	
	printMatrixOnConsole(matrixAux);
	
	return matrixAux;
}

function recuperarMatriz(matrixP){
	
	setConsole("Recuperando matriz\n");

	if (matrixP == null)
	    matrixP = JSON.parse(sessionStorage.matriz);
	//instanciando linhas matrixR
	var matrixR = new Array(matrixP.length);
	
	//instanciando colunas matrixR
	for(i = 0; i < matrixR.length; i++){
		matrixR[i] = new Array(matrixR.length);
	}
	
	for(i = 0 ; i < matrixP.length; i++){
		// listando matriz de cima para baixo, da esquerda para direita
		for(ii = 0; ii < matrixP[i].length; ii++){
			 matrixR[i][ii] = matrixP[i][ii];
			 // espelhando: se [A,B] = 1 então [B,A] = 1
			 matrixR[ii][i] = matrixP[i][ii];
		}
	}
	
	printMatrixOnConsole(matrixR);
	return matrixR;
	
		
}

function printMatrixOnConsole(matrix){
	var linha = "";
	for(i = 0; i < matrix.length; i++){
		for(ii = 0; ii< matrix[i].length; ii++){
			linha+=matrix[i][ii]+" ";
		}
		setConsole(linha);
		linha="";
	}
	
	setConsole("--------------------------");
	
}

