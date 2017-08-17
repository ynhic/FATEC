<?
//pega as variaveis por POST

$nome = $_POST['nome'];
$email = $_POST['email'];
$phone = $_POST['phone'];
$comentario = $_POST['comentario'];

global $email; //função para validar a variável $email no script todo

$data = date("d/m/y"); //função para pegar a data de envio do e-mail

$hora = date("H:i"); //para pegar a hora com a função date

//aqui envia o e-mail para você

mail ("hfernandes@multipoint.com.br", //email aonde o php vai enviar os dados do form

"teste de envio de email php",

"Nome: $nome\nData: $data\nHora: $hora\nE-mail: $email\nMensagem: $mensagem",

"From: $email"

);

echo "<p align=center> $nome, sua mensagem foi enviada com sucesso!</p>";

echo "<p align=center>Estaremos retornando em breve.</p>";

?>