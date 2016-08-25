<?php

// Aluno: Raul Bernardeli
// TIA: 41638441

function numeroPrimo($numero) { // $numero será o numero a ser testado
    $i = 1; // não pode ser 0, se não $numero/0 (divisão por zero)
    $divisores = array(); // os divisores serão guardados no array

    for ($i; $i <= $numero; $i++) {
        if ($numero % $i == 0) {
            array_push($divisores, $i);
        }
    }

    if (count($divisores) == 2) { // contando a quantidade de divisores para saber se é primo
        echo "O número {$numero} é PRIMO !!!" . nl2br(PHP_EOL);
    } else {
        echo "O número {$numero} NÃO É PRIMO" . nl2br(PHP_EOL); 
    }
}

$numerosParaTestar = array();
$numerosParaTestar[] = 2;
$numerosParaTestar[] = 10;
$numerosParaTestar[] = 11;
$numerosParaTestar[] = 433;

header('Content-Type: text/html');
echo "<html> <meta charset=\"UFT-8\"> ";

foreach ($numerosParaTestar as $numero) {
    numeroPrimo($numero);
}
echo "</html>";