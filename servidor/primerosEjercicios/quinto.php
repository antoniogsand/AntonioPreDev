<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <?php
    
    // Álvaro ha estudiado Ingeniería electrónica en la Universidad de Córdoba
    
    $cadenaOriginal= "Álvaro ha estudiado Ingeniería electrónica en la Universidad de Córdoba";
    $arrayConTilde = ["Á", "í", "ó"];
    $arraySinTilde = ["A", "i", "o"];

    $cadenaSustituida = str_replace ($arrayConTilde, $arraySinTilde,$cadenaOriginal);
    echo $cadenaSustituida;
    ?>

    <?php

    $ventas= [2.3, 6.6, 4.8, 7.2, 5.5, 2.3, 6.6, 4.8, 7.2, 5.5,2.3, 6.6, 4.8, 7.2, 5.5,2.3, 6.6, 4.8, 7.2, 5.5];

    $suma =0;

    foreach ($ventas as $venta){
        $suma = $suma + $venta;
    };
    $promedio = $suma / 20;
    echo $suma. "<br/>";
    echo $promedio;
    ?>
<!-- Me he quedado por las tablas -->
</body>
</html>