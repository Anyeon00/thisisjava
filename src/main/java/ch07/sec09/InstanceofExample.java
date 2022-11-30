package ch07.sec09;

public class InstanceofExample {
    public static void personInfo(Person person) {
        System.out.println("name: " + person.name);
        person.walk();

        if (person instanceof Student student) {
            System.out.println("studentnO: " + student.studentNO);
            student.study();
        }

        System.out.println();

        Person p2 = new Student("김길동", 10);
        personInfo(p2);

    }
}
