/*  String.fromCharCode(i+65) : função que  transforma (i+65) em caractere, exemplo 1+65 = 'B'; 
 *  charCodeAt() = converte o caractere em número seguindo os valores da tabela ascii , exemplo 'B' = 66;
 *  a posição matrix[0] referece a letra A , a posição da matrix[1] referece a letra B e assim por diante, pois
 *  somando 0+65 = 65 e 65 é o valor de 'A' na tabela ascii 
 */

function calcularDistanciaManhattan(inicio,fim){
	
	var vertPosInicio = getVertPositionOnGraph(inicio);
	var vertPosFim = getVertPositionOnGraph(fim);
		
	//                x1       -     x2                 
	x = Math.abs(vertPosInicio[0]-vertPosFim[0]);
	
	//                y1       -     y2
	y = Math.abs(vertPosInicio[1]-vertPosFim[1]);
	
	var DM = x+y;
	
	setConsole("-------------------------------");
    setConsole("Distância Manhattan");
	setConsole("Posição "+String.fromCharCode(inicio + 65)+" = ["+vertPosInicio+"]");
	setConsole("Posição "+String.fromCharCode(fim + 65)+" = ["+vertPosFim+"]");
	setConsole("DM = "+DM);
}

function getVertPositionOnGraph(y){
	
	var vert = new Array(2);
	var x=0;
	if(y > input-1){
	   y = y-input;
	   x = 1;
	}
	
	vert[0] = x;
	vert[1] = y;
	
	return vert;
}

function buscar(){
	
	clearConsole();
	setConsole("iniciando busca...");
	
	var inicioLetra = document.getElementById("inicio").value.toUpperCase();
	var fimLetra = document.getElementById("fim").value.toUpperCase();
	var inicio = inicioLetra.charCodeAt()-65;
	var fim = fimLetra.charCodeAt()-65;
	
	var cor = new Array(input*2);
	var distanciaPercorrida=0;
	
	//preenchendo array de cores com a cor BRANCA
	for(i = 0; i < (input*2); i++){
		cor[i]="BRANCO";
	}
	
	var pai = new Array();// política FIFO
	pai.push(null);
	var paiRecuperado;
	cor[inicio] = "CINZA";
	var vert = inicio;
	var fimEncontrado = false;
	
	for(i = 0; i <= matrizCorrente[vert].length && fimEncontrado == false; i++){
		
		console.log("i:"+i);
		
		//se o peso do vértice for diferente de 0 e da cor BRANCA
		if(matrizCorrente[vert][i] !== 0 && cor[i] === "BRANCO"){
						
			setConsole("vértice encontrado:"+String.fromCharCode(i+65));
			
			//computando salto  
			distanciaPercorrida+=parseFloat(matrizCorrente[vert][i]);
			
			pai.push(String.fromCharCode(vert+65));
			cor[i]="CINZA";
			
			if(fim == i){
				
				pai.push(String.fromCharCode(i+65));
				pai.splice(0,1);// retirando null da fila de pais para a apresentação do resultado
			
				setConsole("------------------------");
				setConsole("fim encontrado!!!");
				setConsole("caminho["+pai.toString()+"]");
				setConsole("distância percorrida:"+distanciaPercorrida);
				
				//calculo distancia manhattan
				calcularDistanciaManhattan(inicio,fim);
							
				fimEncontrado = true;
				
			}else{
				//saltando para próximo vértice
				vert = i;
				
				i=-1;// para compensar o i++ do for e chegar a posição do array matrix[vert][0] 
			}
					
		}
		
		//se todas as arestas ligadas ao vértice já foram percorridas
		if(i == matrizCorrente[vert].length){
			
			// pintando vértice de PRETO
			cor[i]="PRETO";
			paiRecuperado = pai.pop();
			
			if(paiRecuperado==null){
				setConsole("fim não encontrado!");
			}else{
				
				setConsole("\nretornando para:"+paiRecuperado+"\n");
				
				//computando retorno ao vértice pai
				distanciaPercorrida-=parseFloat(matrizCorrente[vert][(paiRecuperado.charCodeAt()-65)]);
				vert = parseInt(paiRecuperado.charCodeAt()-65);
				i=-1;// para compensar o i++ do for e chegar a posição do array matrix[vert][0] 
				
			}
		}

	}
		
	setConsole("fim da busca.");
}


function setConsole(text){
	txtConsole.value += text+"\n";
}

function clearConsole(){
	txtConsole.value = "";
}