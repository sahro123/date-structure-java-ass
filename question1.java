public class question1 {

    public static void main(String[] args) {

        student student1 = new student(
                "100", "sahro", 20,
                "network and security", 3.5);

       student student2 = new student(
                "101", "Ayaan", 21,
                "application", 2.8);

student student3 = new student(
                "102", "maan", 19,
                "Software Engineering", 1.7);

       student student4 = new student(
                "103", "Hodan", 22,
                "multi media", 3.9);


        System.out.println("universalty "
                + student.universityName);

        System.out.println();

        student1.displayInfo();
        student2.displayInfo();
        student3.displayInfo();
        student4.displayInfo();
    }
}