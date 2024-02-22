class Modifier {
    private int roll;
    protected int age;
    public String name;

    Modifier(int roll, int age, String name) {
        this.roll = roll;
        this.age = age;
        this.name = name;
    }

    public int getRoll() {
        return roll;
    }
}

class testModifier extends Modifier {
    public void message() {
        int rollValue = getRoll(); // Access the roll field using the getter method
        System.out.println("Roll: " + rollValue);
    }
}

public class AccessModifier {
    public static void main(String[] args) {
        Modifier modifier = new Modifier(23, 23, "Waleed");
        testModifier testmodifier = new testModifier();
        testmodifier.message();
    }
}
