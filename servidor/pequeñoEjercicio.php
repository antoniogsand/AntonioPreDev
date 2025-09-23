<?php
$cadena = "Álvaro ha estudiado Ingeniería electrónica en la Universidad de Córdoba";

$cadena = str_replace(["Á","í","ó"], ["A","i","o"], $cadena);
echo $cadena;

$cadenaDos = "\n Álvaro ha estudiado Ingeniería electrónica en la Universidad de Córdoba \n";
echo ($cadenaDos);
$longitud = strlen ($cadenaDos);

echo ($longitud);
?>