
public class Student {
    
    private String name;
    private int age;

    
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
  
        Student student = new Student("John Doe", 20);

        student.displayInfo();

        student.setName("Jane Smith");
        student.setAge(22);

        System.out.println("Updated Info:");
        student.displayInfo();
    }
}
