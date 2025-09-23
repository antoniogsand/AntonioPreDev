<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
<?php
// Ejercicio 4 quitar tildes a la cadena "Álvaro ha estudiado Ingeniería electrónica en la Universidad de Córdoba"
$cadenaOriginal = "Álvaro ha estudiado Ingeniería electrónica en la Universidad de Córdoba";

$cadenaSinTildes = str_replace(["Á","í","ó"], ["A","i","o"], $cadenaOriginal);
echo $cadenaSinTildes. "<br/>";
// ver longitud
$longitud = strlen ($cadenaOriginal);
echo ($longitud). "<br/>";

// convertir cadena a mayúsculas
$cadenaMayusculas=  strtoupper($cadenaOriginal);
echo $cadenaMayusculas. "<br/>";

//quitar tildes y espacios a 45748521 L Antonio García Sánchez
$cadena = "45748521 L Antonio García Sánchez";
$cadenaSinEspacios = str_replace(" ", "", $cadena);
echo $cadenaSinEspacios;
?>
</body>
</html>