let resultado = document.getElementById("resultado");
let num1 = 0;
let num2 = 0;
let opera ;

function agregarNumero(num) {
  resultado.value += num;
}

function limpiar() {
  // por hacer
}

function borrar() {
  resultado.value = resultado.value.slice(0, -1);
}

function aCero (){
  num1 = 0;
  num2 = 0;
  refrescar();
}



function operar(op) {
  switch (op) {
   
    case "raiz":
      try {
        resultado.value = Math.sqrt(eval(resultado.value));
      } catch (error) {
        resultado.value = "Error";
      }
      break;
    case "binario":
      try {
        resultado.value = eval(resultado.value).toString(2);
      } catch (error) {
        resultado.value = "Error";
      }
      break;
    default:
      resultado.value += op;
      break;
  }
}

function calcular() {
  try {
    resultado.value = eval(resultado.value);
  } catch (error) {
    resultado.value = "Error";
  }
}
