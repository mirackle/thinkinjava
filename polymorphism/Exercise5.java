
public class Exercise5 {
    
    public static void main(String[] args) {
        Cycle c1 = new Cycle();
        Cycle c2 = new Unicycle();
        Cycle c3 = new Bicycle();
        Cycle c4 = new Tricycle(); 

        c1.ride();
        c2.ride();
        c3.ride();
        c4.ride();
    }
}

class Cycle {
    
    void ride() {
        System.out.println("Cycle - ride(): wheels = " + wheels());
    }

    int wheels() {
        return 0;
    }
}

class Unicycle extends Cycle {
    
    @Override
    public void ride() {
        System.out.println("Unicycle - ride(): wheels = " + wheels());
    }

    @Override
    public int wheels() {
        return 1;
    }
}

class Bicycle extends Cycle {
    
    @Override
    public void ride() {
        System.out.println("Bicycle - ride(): wheels = " + wheels());
    }

    @Override
    int wheels() {
        return 2;
    }
}

class Tricycle extends Cycle {
    
    @Override
    public void ride() {
        System.out.println("Tricycle - ride(): wheels = " + wheels());
    }

    @Override
    int wheels() {
        return 3;
    }
}
