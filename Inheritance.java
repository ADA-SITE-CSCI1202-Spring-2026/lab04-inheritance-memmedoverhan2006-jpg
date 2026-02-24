class Person {
    String firstName;
    String lastName;
    String gender;

    public Person(String firstName, String lastName, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String toString() {
        return firstName + " " + lastName + ", Gender: " + gender;
    }

    public boolean equals(Person p) {
        if (p == null) return false;
        return firstName.equals(p.firstName) && lastName.equals(p.lastName) && gender.equals(p.gender);
    }
}

public class Inheritance extends Person {
    String department;
    String[] courses;

    public Inheritance(String firstName, String lastName, String gender, String department, String[] courses) {
        super(firstName, lastName, gender);
        this.department = department;
        this.courses = courses;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String[] getCourses() {
        return courses;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public String toString() {
        String courseList = "";
        for (int i = 0; i < courses.length; i++) {
            courseList += courses[i];
            if (i < courses.length - 1) {
                courseList += ", ";
            }
        }
        return super.toString() + ", Department: " + department + ", Courses: " + courseList;
    }

    public boolean equals(Inheritance t) {
        if (t == null) return false;
        if (!super.equals(t)) return false;
        if (!department.equals(t.department)) return false;
        if (courses.length != t.courses.length) return false;
        for (int i = 0; i < courses.length; i++) {
            if (!courses[i].equals(t.courses[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String[] courses = {"Math", "Physics"};
        Inheritance teacher = new Inheritance("John", "Doe", "Male", "Science", courses);

        System.out.println(teacher.toString());
    }
}