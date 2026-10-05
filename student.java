public class student {

    private String studentId;
    private String name;
    private int age;
    private String department;
    private double gpa;

    static String universityName = "jamhuriya University";

    public student(String studentId, String name, int age,
                   String department, double gpa) {

        this.studentId = studentId;
        this.name = name;
        this.department = department;

        setAge(age);
        setGpa(gpa);
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
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
        if (age > 0) {
            this.age = age;
        }
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        if (gpa >= 0 && gpa <= 4) {
            this.gpa = gpa;
        }
    }

    public void displayInfo() {

        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Department: " + department);
        System.out.println("GPA: " + gpa);

        if (gpa >= 2.0) {
            System.out.println("Student: Passed");
        } else {
            System.out.println("Student: Failed");
        }

        System.out.println();
    }
}