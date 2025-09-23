<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <?php
    // el . es para concatenar
    $texto = "Hola";
    echo $texto."<br/>";

    $entero = 1234;
    echo $entero. "<br/>";
    
    $boolean = true;
    echo $boolean. "<br/>";

    $float= 1.2;
    echo $float. "<br/>";

    $array = [1,2,3,];
    echo $array [2]. "<br/>";

    print_r($array); // imprime el array en clave/valor
    echo "<br/>";
    ?>
</body>
</html>