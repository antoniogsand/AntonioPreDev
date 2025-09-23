<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <?php
if (is_string($texto)){
echo "true";
}else {
    echo "false";
};
  echo "<br/>";
if (is_string ($entero)){
echo "true";
}else {
    echo "false";
};
  echo "<br/>";
if(is_string ($boolean)){
echo "true";
}else{
    echo "false";
};
  echo "<br/>";
if (is_string ($float)){
    echo "true";
}else{
    echo "false";
};
  echo "<br/>";
if (is_string ($array)){
    echo "true";
}else{
    echo "false";
};
  echo "<br/>";
?>

<!-- Parte dos -->

<?php 

/*$numero = 12345;
Convertir el número a un string
$cadena_de_texto = (string) $numero;
*/

$numeroAString = (string) $entero;
echo is_string($numeroAString);
echo "<br/>";
$booleanAString = (string) $boolean;
echo is_string ($booleanAString);
echo "<br/>";
$floatAString = (string) $float;
echo is_string ($floatAString);
echo "<br/>";
if (is_string ($array[0])){
echo "true";
}else{
echo "false". "<br/>";
};

?>
</body>
</html>