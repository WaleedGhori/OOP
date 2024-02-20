// compile time polymorphism
class compilePolymorphism {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }

}

public class fourth {
    public static void main(String[] args) {
        compilePolymorphism compilepolymorphism = new compilePolymorphism();
        System.out.println(compilepolymorphism.add(5, 5));
        System.out.println(compilepolymorphism.add(5, 5, 5));
        System.out.println(compilepolymorphism.add(5.333, 5.666));
    }
}
