public class App {
    public static void main(String[] args) throws Exception {
       
ContratoLaboral contrato = new ContratoLaboral(0, "completa", "Exclusividad");

ContratoLaboral contratoDos= new ContratoLaboral();
System.out.println("ContratoDos por defecto " + contratoDos);

Empleado empleado = new Empleado("Antonio", "García", "677063461", contrato);

contrato.setSalario(1300);

System.out.println("Modificación de salario " + contrato);

System.out.println("Objeto empleado " + empleado);

contrato.salarioMayorCero(0);

contrato.setSalario(500);

System.out.println(contrato.getSalario());

    }
}
