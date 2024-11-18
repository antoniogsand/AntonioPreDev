function generarTablas() {
    const numeroTablas = Number(document.getElementById("numeroTablas").value);
    const rangoInicio = Number(document.getElementById("rango-inicio").value);
    const rangoFin = Number(document.getElementById("rango-fin").value);


    /* Esa linea la comento porque entiendo lo que hace pero y he visto que hace innerHTML
    pero no llego a entenderla bien. No sé porque no deja que se se mantengan las tablas creadas anteriormente
    
    const resultadoElement = document.getElementById("resultado");
    resultadoElement.innerHTML = ""; */ 


    for (let i = 1; i <= numeroTablas; i++) {
        resultadoElement.innerHTML += `<h3>Tabla de multiplicar del ${i}</h3>`;

      for (let a = 1; a <= 10; a++) {
            resultadoElement.innerHTML += `${i} X ${a} = ${i * a} <br>`;
        } 
    }
}


/* Explicación del código

    Se definen 4 constantes. 3 de tipo numérico con Number
    donde se indica a cada una que obtenga de cada una el valor del elemento con la id que se indica entre paréntesis



    Si al bucle exterior le digo que numeroTablas vale 3 en la primera vuelta comprueba que i es menor o igual al valor
    que le di a numeroTablas y pasa al bucle siguiente haciendolo 10 veces y cuando acabe vuelve al bucle exterior que ahora valdrá 2 ya que debido a ++
    se ha incrementado en uno su valor y hara el mismo procedimiento hasta llegar a 4 donde parara al no cumplirse la condicion 

*/