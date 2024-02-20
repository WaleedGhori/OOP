// Runtime/Dynamic/Method overridding
class dynamicPolymorhism {
    public void callTheName() {
        System.out.println("I have multiple name like Runtime/Dynamic/Method Overriding polymorphism");
    }
}

class runtimePoly extends dynamicPolymorhism {
    @Override
    public void callTheName() {
        System.out.println(
                "I have multiple name like Runtime/Dynamic/Method Overriding polymorphism under the runtimePolymorphism!");
    }
}

public class fifth {
    public static void main(String[] args) {
        dynamicPolymorhism poly1 = new runtimePoly();
        dynamicPolymorhism poly2 = new dynamicPolymorhism();
        poly1.callTheName();
        poly2.callTheName();
    }
}
