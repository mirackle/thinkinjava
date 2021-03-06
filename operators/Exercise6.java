
public class Exercise6 {
    
    public static void main(String[] args) {
        Dog d1 = new Dog();
        Dog d2 = new Dog();

        d1.name = "spot";
        d1.says = "Ruff!";

        d2.name = "scruffy";
        d2.says = "Wurf!";

        System.out.println(d1.name + ":" + d1.says);
        System.out.println(d2.name + ":" + d2.says);

        Dog d3 = d1;
        System.out.println(d3 == d1);
        System.out.println(d3.equals(d1));

        Dog d4 = d2;
        System.out.println(d4 == d2);
        System.out.println(d4.equals(d2));
    }
}

class Dog {
    String name;
    String says;
}
