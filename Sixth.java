
class PersonalInfo {
    private String name;
    private int age;

    public PersonalInfo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void viewPersonalInfo() {
        System.out.println("Name is: " + name);
        System.out.println("Age: " + age);
    }

}

class studentInfo extends PersonalInfo {
    private String studentId;

    public studentInfo(String name, int age, String studentId) {
        super(name, age);
        this.studentId = studentId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    @Override
    public void viewPersonalInfo() {
        super.viewPersonalInfo();
        System.out.println("Student Id: " + studentId);
    }

}

public class Sixth {
    public static void main(String[] args) {
        // Creating a Person object
        PersonalInfo person = new PersonalInfo("waleed", 23);
        studentInfo student = new studentInfo("waleed ahmed", 23, "BSE20S055");
        student.viewPersonalInfo();

        System.out.println("");
        // Accessing fields using getter methods
        System.out.println("Initial Information:");
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        // Updating information using setter methods
        person.setName("Waleed Ahmed Ghori");
        person.setAge(30);

        // Displaying updated information
        System.out.println("\nUpdated Information:");
        person.viewPersonalInfo();
    }
}
