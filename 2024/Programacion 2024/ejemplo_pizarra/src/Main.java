public class Main {
    public static void main(String[] args) {
        System.out.println(" POLIMORFISMO ESTÁTICO");
        SubclassOverload obj = new SubclassOverload();
        obj.demo(10);
        obj.demo(10, 20);
        obj.demo(5.5);

        Overload obj2= new Overload();
        obj2.demo(10);
        obj2.demo(10, 20);
        //obj2.demo(5.5);




    }
}
