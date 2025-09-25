<!DOCTYPE html>
<html lang="en">
<head>
 <meta charset="UTF-8">
 <meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Document</title>
</head>
<body>
 <?php
// Tu código PHP de la primera parte...
//  ?>

<?php
// array clave-valor
$personas = ["Cristina" => 28, "Pedro" => 32, "Maria" => 35];
?>
<table border="1"> 
<thead>
 <tr>
 <th>Nombre</th>
 <th>Edad</th>
 </tr>
</thead>
<tbody>
 <?php
 foreach ($personas as $nombre => $edad) {
 echo "<tr>";
 echo "<td>$nombre</td>";
 echo "<td>$edad</td>";
 echo "</tr>";
 };
 ?>
</tbody>
</table>

<!-- array dentro de array !-->

<table border="1">
<thead>
 <tr>
 <th>Producto</th>
 <th>Cantidad</th>
 <th>Precio</th>
 </tr>
</thead>

<!-- tbody para crear elementos html dinamicamente !-->

<tbody>
<?php
$productos= [["Destornillador", 1, 3], ["Llave inglesa", 2, 5], ["Martillo", 1, 7]];

$totalCantidad= 0;

$totalPrecio =0;
foreach ($productos as $fila_productos){
    $subtotal_producto = $fila_productos[1] * $fila_productos[2];
    echo "<tr>";
    echo "<td>" . $fila_productos[0] . "</td>";
    echo "<td>" . $fila_productos[1] . "</td>";
    echo "<td>" . $fila_productos[2] . "</td>";
    echo "</tr>";


$totalCantidad += $fila_productos[1];
$totalSubtotal += $subtotal_producto;
$totalPrecio += $fila_productos[2];
};
?>
</tbody>

<table border="1">
<thead>
 <tr>
 <th>Producto</th>
 <th>Cantidad</th>
 <th>Precio</th>
 </tr>
</thead>

<!-- tbody para crear elementos html dinamicamente !-->

<tbody>
<?php
$productos= [["Destornillador", 1, 3], ["Llave inglesa", 2, 5], ["Martillo", 1, 7]];

$totalSubtotal = 0;
foreach ($productos as $fila_productos){
    // acumula lo que hay en cada subarray en cada iteracion
    $subtotal_producto = $fila_productos[1] * $fila_productos[2];
    echo "<tr>";
    echo "<td>" . $fila_productos[0] . "</td>";
    echo "<td>" . $fila_productos[1] . "</td>";
    echo "<td>" . $fila_productos[2] . "</td>";
    echo "</tr>";
// acumula en totalSubtotal fuera del foreach
$totalSubtotal += $subtotal_producto;
};
?>
</tbody>

<tfoot>
    <tr>
        <td colspan="2">Total</td>
        <td><?php echo $totalSubtotal; ?></td>
    </tr>
</tfoot>
</table>
</body>
</html>