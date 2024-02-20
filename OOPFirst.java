import java.util.Scanner;

class Student {
    public String rollNo;
    public int age;
    public String name;
    public String address;
    public int phone;

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
}

class Result extends Student {
    public float mark1;
    public float mark2;
    public float mark3;
    public double result;

    public float getMark1() {
        return mark1;
    }

    public void setMark1(float mark1) {
        this.mark1 = mark1;
    }

    public float getMark2() {
        return mark1;
    }

    public void setMark2(float mark2) {
        this.mark2 = mark2;
    }

    public float getMark3() {
        return mark3;
    }

    public void setMark3(float mark3) {
        this.mark3 = mark3;
    }

    public double totalNo(float mark1, float mark2, float mark3) {
        result = mark1 + mark2 + mark3;
        return result;
    }
}

public class OOPFirst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student stu = new Student();
        Result res = new Result();

        String rollNo = sc.nextLine();
        int age = sc.nextInt();
        sc.nextLine();
        String name = sc.nextLine();
        String address = sc.nextLine();
        int phone = sc.nextInt();

        float mark1 = sc.nextFloat();
        float mark2 = sc.nextFloat();
        float mark3 = sc.nextFloat();

        stu.setRollNo(rollNo);
        stu.setAge(age);
        stu.setName(name);
        stu.setAddress(address);
        stu.setPhone(phone);

        System.out.println("");
        System.out.println(stu.getRollNo());
        System.out.println(stu.getAge());
        System.out.println(stu.getName());
        System.out.println(stu.getAddress());
        System.out.println(stu.getPhone());
        System.out.println("");

        res.setMark1(mark1);
        res.setMark2(mark2);
        res.setMark3(mark3);
        System.out.println("");

        System.out.println(res.totalNo(res.getMark1(), res.getMark2(), res.getMark3()));
        System.out.println("");
    }
}