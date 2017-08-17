  <?php
	  $con = mysqli_connect("localhost", "root", "", "azul") or
		  die('Não foi possível conectar');
	  
	  if ($con->connect_error) {
		  die("falhou porra!!!");
	    }  
		$nome = $_POST['nome'];
		$email = $_POST['email'];
		$phone = $_POST['phone'];
		$comentario = $_POST['comentario'];
		
		
	  $sql= "INSERT INTO usuario (nome, email, phone,  comentario) VALUES ('".$nome."', '".$email."', ".$phone.", '".$comentario."')";
	  
	  if ($con->query($sql) === true) {
			//echo "deu certo";	
			echo "<script>alert('dados cadastrados!');
			window.location.href='contato.html';
			</script>";
			//header('Location: teste.html');
		} else {
			echo "<script>  alert('dados não cadastrados!');
			window.location.href='contato.html';
			</script>";
			//window.location.href='contato.html';	
		}
	  $con->close();	
  ?>