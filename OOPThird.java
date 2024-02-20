
class One {
    public int one;
    public String firstName;
    public String roll;

    One(int one, String firstName) {
        this.one = one;
        this.firstName = firstName;
    }

    public void setRoll(String roll) {
        this.roll = roll;
    }

    public String getRoll() {
        return roll;
    }
}

class Second extends One {
    public String secondName;

    Second(int one, String firstName, String secondName) {
        super(one, firstName);
        this.secondName = secondName;
    }

}

class Third extends One {
    public String thirdName;

    Third(int one, String firstName, String thirdName) {
        super(one, firstName);
        this.thirdName = thirdName;
    }
}

public class OOPThird {
    public static void main(String[] args) {
        Second second = new Second(22, "FirstSecond", "Second");
        Third third = new Third(22, "FirstThird", "Third");
        second.setRoll("BSE-20S-055");

        System.out.println(second.one + " " + second.firstName + " " + second.secondName + " " + second.roll);
        System.out.println(second.one + " " + second.firstName + " " + second.secondName + " " + second.getRoll());
        System.out.println(third.one + " " + third.firstName + " " + third.thirdName);

    }
}
