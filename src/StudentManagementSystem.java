import java.util.*;

class StudentManager {

    private Map<Integer, Student> students;
    private Map<String, Set<Student>> courseStudentMap;

    public StudentManager() {
        this.students = new HashMap<>();
        this.courseStudentMap = new HashMap<>();
    }

    public void addStudent(Student student) {
        students.put(student.getId(), student);

        for (String course : student.getCourses()) {
            courseStudentMap.putIfAbsent(course, new HashSet<>());
            courseStudentMap.get(course).add(student);
        }
    }

    public void removeStudent(Integer id) {
        Student student = students.get(id);
        if (student != null) {
            for (String course : student.getCourses()) {
                Set<Student> enrolledStudents = courseStudentMap.get(course);
                if (enrolledStudents != null) {
                    enrolledStudents.remove(student);
                }
            }
            students.remove(id);
        }
    }

    public void updateStudentName(Integer id, String name) {
        Student student = students.get(id);
        if (student != null) {
            student.setName(name);
        }
    }

    public void updateStudentAge(Integer id, Integer age) {
        Student student = students.get(id);
        if (student != null) {
            student.setAge(age);
        }
    }

    public void addCourseToStudent(Integer id, String course) {
        Student student = students.get(id);
        if (student != null) {
            student.addCourse(course);
            courseStudentMap.putIfAbsent(course, new HashSet<>());
            courseStudentMap.get(course).add(student);
        }
    }

    public void removeCourseFromStudent(Integer id, String course) {
        Student student = students.get(id);
        if (student != null) {
            student.removeCourse(course);

            Set<Student> enrolledStudents = courseStudentMap.get(course);
            if (enrolledStudents != null) {
                enrolledStudents.remove(student);
            }
        }
    }

    public List<Student> getAllStudentsSortedById() {
        List<Student> sortedStudents = new ArrayList<>(students.values());
        sortedStudents.sort(Comparator.comparing(Student::getId));
        return sortedStudents;
    }

    public Student getStudentById(Integer id) {
        return students.get(id);
    }

    public Set<Student> getStudentsByCourse(String course) {
        return courseStudentMap.getOrDefault(course, new HashSet<>());
    }

    // Bonus: get students sorted by name using TreeSet
    public Set<Student> getAllStudentsSortedByName() {
        Set<Student> sortedByName = new TreeSet<>(Comparator.comparing(Student::getName));
        sortedByName.addAll(students.values());
        return sortedByName;
    }
}

class Student {

    private Integer id;
    private String name;
    private Integer age;
    private Set<String> courses;

    public Student(Integer id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.courses = new HashSet<>();
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Set<String> getCourses() {
        return courses;
    }

    public void addCourse(String course) {
        this.courses.add(course);
    }

    public void removeCourse(String course) {
        this.courses.remove(course);
    }

    @Override
    public String toString() {
        return "Student{"
                + "id=" + id
                + ", name='" + name + '\''
                + ", age=" + age
                + ", courses=" + courses
                + '}';
    }
}

public class StudentManagementSystem {

    public static void main(String[] args) {
        StudentManager manager = new StudentManager();

        Student student1 = new Student(101, "John Doe", 20);
        Student student2 = new Student(102, "Jane Smith", 21);
        Student student3 = new Student(103, "Bob Johnson", 22);

        manager.addStudent(student1);
        manager.addStudent(student2);
        manager.addStudent(student3);

        manager.addCourseToStudent(101, "Java Programming");
        manager.addCourseToStudent(101, "Database Systems");
        manager.addCourseToStudent(102, "Java Programming");
        manager.addCourseToStudent(102, "Web Development");
        manager.addCourseToStudent(103, "Data Structures");
        manager.addCourseToStudent(103, "Algorithms");

        System.out.println("All students sorted by ID:");
        for (Student student : manager.getAllStudentsSortedById()) {
            System.out.println(student);
        }
        System.out.println();

        System.out.println("Student with ID 102:");
        System.out.println(manager.getStudentById(102));
        System.out.println();

        manager.updateStudentName(101, "John Smith");
        manager.updateStudentAge(101, 21);
        System.out.println("Updated student 101:");
        System.out.println(manager.getStudentById(101));
        System.out.println();

        manager.addCourseToStudent(103, "Java Programming");
        System.out.println("Updated courses for student 103:");
        System.out.println(manager.getStudentById(103).getCourses());
        System.out.println();

        System.out.println("Students enrolled in 'Java Programming':");
        for (Student student : manager.getStudentsByCourse("Java Programming")) {
            System.out.println(student);
        }
        System.out.println();

        manager.addCourseToStudent(101, "Java Programming");
        System.out.println("Student 101 courses after adding a duplicate course:");
        System.out.println(manager.getStudentById(101).getCourses());
        System.out.println();

        System.out.println("All students sorted by name:");
        for (Student student : manager.getAllStudentsSortedByName()) {
            System.out.println(student);
        }
        System.out.println();

        manager.removeStudent(102);
        System.out.println("Students after removing ID 102:");
        for (Student student : manager.getAllStudentsSortedById()) {
            System.out.println(student);
        }
    }
}
