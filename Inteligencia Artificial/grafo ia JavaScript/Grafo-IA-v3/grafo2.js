var input;

var peso1 = 1;
var peso2 = 1.42; 

var matrizCorrente;
var txtConsole ;

function init(){
	 txtConsole = document.getElementById("txt_console");
}

function createGraph(){
    
	clearConsole();
	
	input = document.getElementById("txt_tamanho").value;

	if (input > 5 || input < 2) {
	    document.getElementById("txt_tamanho").value = 0;
	    setConsole("Tamanho invalido!");
	    return;
	}

    var graphTable = document.getElementById("grafo");
	$(graphTable).empty();
	
	//criando matriz bidimensional
	var graph = new Array();
    graph[0] = new Array(input);
	graph[1] = new Array(input);
		
	var ii = 0;
	
	var elements = 0;
	
	var elementsAux = new Array(input);
	
	for(var ii = 0; ii < 2 ; ii++){
		
		var tr = document.createElement("tr");
		
		//1ª e 3º tr 
		for(var i = 0 ; i < input; i++){
			
			elementsAux[i]=elements;
			
			var td = document.createElement("td");
			td.setAttribute("class","td_grafo");
			graph[ii][i] = elements++;
		
			var char = graph[ii][i]+65;
			td.innerHTML = String.fromCharCode(char);
			tr.appendChild(td);
			
			if(i!=input-1){
				var tdSelect = document.createElement("td");
				var select = document.createElement("select");
				select.setAttribute("onChange","setMatrixValue(this)");
				select.setAttribute("style", "width:100px");
				
				option = document.createElement("option");
				option.text="["+ String.fromCharCode(((elements-1)+65)) +","+ String.fromCharCode((elements+65))+"]";
				option.value = "["+(elements-1)+","+ peso1 +","+(elements)+"]";
				
				var blankOption = document.createElement("option");
				blankOption.value="["+(elements-1)+","+ 0 +","+(elements)+"]";
				
				select.appendChild(blankOption);
				select.appendChild(option);
				
				tdSelect.appendChild(select);
				tr.appendChild(tdSelect);
				
			}
		}
		graphTable.appendChild(tr);
	
		//2º tr
		if(ii < 1){
			var trPar = document.createElement("tr");
			for(var i = 0 ; i < input; i++){
				
				
				
				var tdPar = document.createElement("td");
				tdPar.setAttribute("class","td_grafo");
				var selectPar = document.createElement("select");
				selectPar.setAttribute("onChange","setMatrixValue(this)");
				var optionPar = document.createElement("option");
								
				optionPar.text = "["+String.fromCharCode(elementsAux[i]+65)+","+String.fromCharCode(elementsAux[i]+parseInt(input)+65)+"]";
				
				optionPar.value ="["+(elementsAux[i])+","+ peso1 +","+(elementsAux[i]+parseInt(input))+"]";
				
				var blankOption = document.createElement("option");
				blankOption.value = "["+(elementsAux[i])+","+ 0 +","+(elementsAux[i]+parseInt(input))+"]";
				
				selectPar.appendChild(blankOption)
				selectPar.appendChild(optionPar);
				tdPar.appendChild(selectPar);  
				trPar.appendChild(tdPar);
				
				if(i!=input-1){
					
									
					var tdX = document.createElement("td");
					var selectX = document.createElement("select");
					selectX.setAttribute("onChange","setMatrixValue(this)");
					
					
					var option1 = document.createElement("option");
					option1.text="["+String.fromCharCode(elementsAux[i]+65)+","+String.fromCharCode((elementsAux[i]+parseInt(input)+1)+65)+"]";
					option1.value="["+(elementsAux[i])+","+ peso2 +","+(elementsAux[i]+parseInt(input)+1)+"];"+
								  "["+(elementsAux[i]+parseInt(input))+","+ 0 +","+(elementsAux[i]+1)+"]";
					
					var option2 = document.createElement("option");
					option2.text="["+String.fromCharCode(elementsAux[i]+parseInt(input)+65)+","+String.fromCharCode((elementsAux[i]+1)+65)+"]";
					
					option2.value="["+(elementsAux[i]+parseInt(input))+","+ peso2 +","+(elementsAux[i]+1)+"];"+
								  "["+(elementsAux[i])+","+ 0 +","+(elementsAux[i]+parseInt(input)+1)+"]";
									
					
					var option3 = document.createElement("option");
					option3.text="["+String.fromCharCode(elementsAux[i]+65)+","+String.fromCharCode((elementsAux[i]+parseInt(input)+1)+65)+"];["+
									 String.fromCharCode(elementsAux[i]+parseInt(input)+65)+","+String.fromCharCode((elementsAux[i]+1)+65)+"]";
					
					option3.value="["+(elementsAux[i])+","+ peso2 +","+(elementsAux[i]+parseInt(input)+1)+"];"+
								  "["+(elementsAux[i]+parseInt(input))+","+ peso2 +","+(elementsAux[i]+1)+"]";
					
					
					var blankOption = document.createElement("option");
					blankOption.value="["+(elementsAux[i])+","+ 0 +","+(elementsAux[i]+parseInt(input)+1)+"];"+
									  "["+(elementsAux[i]+parseInt(input))+","+ 0 +","+(elementsAux[i]+1)+"]";
					
					selectX.appendChild(blankOption);
					selectX.appendChild(option1);
					selectX.appendChild(option2);
					selectX.appendChild(option3);
					
					tdX.appendChild(selectX);
					trPar.appendChild(tdX);
				}
				
				
			}
				
			graphTable.appendChild(trPar);
		}
	}
	
	createMatrix(input);
	
}


function setMatrixValue(select){
	
	selectValue = select.value;
	
	var number='';
	var numeros  = new Array();
	var isComposedTriple = false;
	
	for(i = 0; i < selectValue.length; i++){
		
		if(selectValue[i]==';'){
			isComposedTriple = true;
		}
	}
	
	for(i = 0;i < selectValue.length; i++){
		
		if(!isNaN(selectValue[i])||selectValue[i]=='.'){
			if(selectValue[i].trim()!=''){
				number+=selectValue[i];
			}
			
		}else{
			if(!isNaN(parseFloat(number))){
				numeros.push(number);
			}
			number='';
		}
	}
	
	
	if(!isComposedTriple){
		
		var x = numeros[0];
		var y = numeros[2];
			    
		matrizCorrente[x][y] = numeros[1];
		matrizCorrente[y][x] = numeros[1];
		
	}else{
	
		var x1 = numeros[0];
		var y1 = numeros[2];
		var x2 = numeros[3];
		var y2 = numeros[5];
			
		matrizCorrente[x1][y1] = numeros[1];
		matrizCorrente[y1][x1] = numeros[1];
		
		matrizCorrente[x2][y2] = numeros[4];
		matrizCorrente[y2][x2] = numeros[4];
		
	}

	drawingMatrixTable(matrizCorrente);
	
}


function createMatrix(input){
	
	var x = input*2;

	this.matrizCorrente = new Array(x);

	for(var i = 0; i < x; i++){
		matrizCorrente[i] =  new Array(x);	
	}

	for(var i = 0; i < matrizCorrente.length; i++){
		for(var ii=0; ii < matrizCorrente[i].length; ii++){
			matrizCorrente[i][ii]=0;
		}
	}
	
	drawingMatrixTable(matrizCorrente);
}


function drawingMatrixTable(matrixAux){
	
	var table = document.getElementById("table");

	$(table).empty();
	
	tr = document.createElement("tr");
	var th = document.createElement("th");
	tr.appendChild(th);
	for(var i=0; i < matrixAux.length ; i++){
	
		//desenha a linha de letras
		var th = document.createElement("th");
		var char = i+65;	
		th.innerHTML = String.fromCharCode(char);
		tr.appendChild(th);
	}
	
	table.appendChild(tr);

	for(var i = 0; i < matrixAux.length; i++){
		
	    var th = document.createElement("th");
	   
	    //desenha a coluna de letras
	    var char = i+65;
	    th.innerHTML = String.fromCharCode(char);
	    var tr = document.createElement("tr");
		tr.appendChild(th);
		
		for(var ii=0; ii < matrixAux[i].length; ii++){
			 var td = document.createElement("td");
						 
			 var auxNumber = parseFloat(matrixAux[i][ii]);
			 
			 var cellValue = auxNumber.toFixed(1);
			 
			 if(cellValue != 0){
				 td.innerHTML = "<b>"+cellValue+"</b>"; 
			 }else{
				 td.innerHTML = cellValue;
			 }
			 
			 tr.appendChild(td);
			 
		}
		table.appendChild(tr);
		
		
	}
	
}

