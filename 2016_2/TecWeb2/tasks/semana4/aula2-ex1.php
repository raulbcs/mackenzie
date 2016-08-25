<?php
  // Aluno: Raul Bernardeli
  // TIA: 41638441
    // Parte 3: Pintar somente as linhas pares, não incluindo o cabeçalho

    // Fantastico. O professor já me deu uma parte do código pronto.
    // Vou escrever aqui um comentario para que meus outros colegas possam entender essa parte.
    /* 
         <Comentário do aluno> 
    */
    $output = "<table border='1'>
                     <tr>
                        <th> ID </th>
                        <th> NOME </th>
                        <th> DESC </th>
                     </tr>
                 "; 

    $numeroDeLinhas = 7;

	for ($i = 0; $i < $numeroDeLinhas; $i++) {
       if ($i % 2) {
          $output .= "<tr style=background-color:grey>";
       } else {
          $output .= "<tr>";
       }

       // O professor já trabalhou bastante nesse código. Agora é minha vez.
       $output .= "<td> id </td><td> nome </td><td> desc </td>";
       $output .= "</tr>";
    }   

    // Dica: abriu fechou. Está faltando fechar alguma tag aqui...
    $output .= "</table>";
?>
<html>
   <head>
      <title> Exemplo - Tabela </title>
   </head>
   <body>
       <h1> Exemplo - Tabela </h1>
       <?php echo $output?>
   </body>
</html>