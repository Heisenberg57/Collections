import java.util.*;

public class Student {
    private int id;
    private String name;
    private int marks;

    public Student(int id,String name,int marks){
        this.id=id;
        this.name=name;
        this.marks=marks;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public int getMarks(){
        return marks;
    }

    public String toString(){
        return id+" - "+name+" - "+marks;
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(521,"Thomas Muller",75));
        students.add(new Student(522,"Lionel Messi",100));
        students.add(new Student(523,"Roberto Firmino",75));
        students.add(new Student(524,"Franceso Totti",85));
        students.add(new Student(525,"Dennis Bergkmap",90));

        System.out.println("Students in List");

        for(Student s:students){
            System.out.println(s);
        }
        System.out.println();

        Map<Integer,String> studentMap = new HashMap<>();
        for(Student s:students){
            studentMap.put(s.getId(),s.getName());
        }

        System.out.println("Map of Student IDs to Names:");
        for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
        System.out.println();

        Set<Integer> uniqueMarks = new HashSet<>();
        for(Student s:students){
            uniqueMarks.add(s.getMarks());
        }

        System.out.println("Unique Marks (Set)");

        for(int mark:uniqueMarks){
            System.out.println(mark);
        }

    }
}
