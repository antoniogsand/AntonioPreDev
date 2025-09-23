// Ejemplo de uso global

<?php
$a = 1;
$b = 2;

function sumar()
{
    global $a, $b;
    $b = $a+$b;
}

sumar();
echo $b;
?>

// Eejemplo de uso de variables estaticas

<?php

function test ()
{
    static $a = 0;
    echo $a;
    $a++;
 
}
    test();
    test();
    test();
    test();
    test();
    test();

  
?>

<?php
function suma ($a, $b){
    return $a +$b;
}
var_dump (suma(2.2,4));
?>

<?php
$simple = 'Simples \n Salto de linea\n';
echo nl2br($simple);
$dobles = "dobles \n Salto de linea\n";

echo nl2br($dobles);
$nombre = "Antonio Garcia Sanchez";
echo 'Mostrar vafiable nombre $nombre';
echo "Mostrar variable nombre $nombre";
?>



