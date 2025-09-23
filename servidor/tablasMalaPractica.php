<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>

<!--aunque funciona no es una buena práctica ya que se mezcla datos de lógica con visualización !--
    <?php
    $arrayTabla = ["<table
                    <tr>
                    <th style='background-color: grey;'>Persona</th>
                    <th style='background-color: #999999;'>Edad</th>
                    </tr>

                    <tr>
                    <td>Luis</td>
                    <td>31</td>
                    </tr>

                    <tr>
                    <td>Ana</td>
                    <td>32</td>
                    </tr>
                    </table>"];

    echo $arrayTabla[0];
?>

</body>
</html>