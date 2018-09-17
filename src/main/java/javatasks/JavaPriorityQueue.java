package javatasks;

import java.util.*;

class Student {
    private int id;
    private String name;
    private double cgpa;

    Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCgpa() {
        return cgpa;
    }
}

class Priorities {
    List<Student> getStudents(List<String> events) {
        Comparator<Student> comp = (student, student2) -> {
            if (student2.getCgpa() != student.getCgpa()) {
                return Double.compare(student2.getCgpa(), student.getCgpa());
            }
            if (!student2.getName().equals(student.getName())) {
                return student.getName().compareTo(student2.getName());
            }
            return Integer.compare(student.getId(), student2.getId());
        };
        PriorityQueue<Student> queue = new PriorityQueue<>(5, comp);

        for (String event : events) {
            if (event.equals("SERVED")) {
                if (!queue.isEmpty()) {
                    queue.remove();
                }
            } else {
                String[] values = event.split(" ");
                Student s = new Student(Integer.valueOf(values[3]), values[1], Double.valueOf(values[2]));
                queue.add(s);
            }
        }
        List<Student> studentList = new ArrayList<>();
        while (!queue.isEmpty()) {
            studentList.add(queue.remove());
        }
        return studentList;
    }
}

public class JavaPriorityQueue {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        List<String> events = new ArrayList<>();
        events.add("ENTER Bidhan 3.75 50");
        events.add("ENTER Rijul 3.8 24");
        events.add("ENTER Shafaet 3.7 35");
        events.add("SERVED");
        events.add("SERVED");
        events.add("ENTER Samiha 3.85 36");
        events.add("SERVED");
        events.add("ENTER Ratul 3.9 42");
        events.add("ENTER Tanvir 3.6 46");
        events.add("ENTER Anik 3.95 49");
        events.add("ENTER Nisha 3.95 50");
        events.add("SERVED");
        events.add("SERVED");
        events.add("SERVED");
        events.add("SERVED");
        events.add("SERVED");
        events.add("SERVED");
        events.add("SERVED");
        events.add("SERVED");


        List<Student> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st : students) {
                System.out.println(st.getName());
            }
        }
    }

}

