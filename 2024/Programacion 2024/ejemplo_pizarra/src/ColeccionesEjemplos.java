import java.util.LinkedList;

public class ColeccionesEjemplos {
    public static void main(String[] args) {
        
        /* 
        LinkedList <Integer> lista  = new LinkedList<>();
        
        for (int i = 0; i<10; i++){
            lista.add(i);
        }
        // Quiero borrar dos elementos a la vez ¿¿??
        int [] borrar = {1,2}; 
        boolean estaEl14 = lista.contains(14);
        System.out.println(estaEl14);
        lista.remove(4);
        
        System.out.println(lista);
        */

        /* con un iterador no se devuelven posiciones si no valores. 
         * bucle for each
         * for (Integer i: lista) {
         * sout lista}
         */

         // Añadir elemento a la lista
         LinkedList <Double> lista  = new LinkedList<>();
        lista.add(1.5);
        lista.add(5.5);
        lista.add(-1.5);

        //conocer el tamaño de la lista
        lista.size();
        
        // añade elemento en una posicion indicada (posición primero y después valor)
        lista.add(1, -5.5);

        // obtener elemento de la lista dada su posición
        System.out.println(lista.get(0));

        // borra el elemento de la posicón que indiquemos y devuelve ese elemento borrado
        System.out.println(lista.remove(0));
        
        //devuelve el elemento que indiquemos cuando lo encuentre y devuelve true si lo hace
        System.out.println(lista.remove(5.5));

        //borrado de todos los elementos de la lista
        lista.clear();

        //actualizar elemento en la posicion indicada
        System.out.println(lista.set(0, 6.6));

        //Ver si hay un elemento en la lista dado su valor
        System.out.println(lista.contains(6.6));

        //devuelve la posicion dado un valor de busqueda
        System.out.println(-1.5);

        // comprueba si una lista está vacía
        lista.isEmpty();

        


    }
}
