class Student {
    int rollNo;
    String name;
    double marks;

    void setStudent(int r, String n, double m) {
        rollNo = r;
        name = n;
        marks = m;
    }

    void displayStudent() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.setStudent(1, "Ravi", 89.5);
        s.displayStudent();
    }
}
