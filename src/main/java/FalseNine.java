import java.util.*;

public class FalseNine {
    private int id;
    private String name;
    private int marks;

    public FalseNine(int id, String name, int marks){
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
        List<FalseNine> students = new ArrayList<>();
        students.add(new FalseNine(521,"Thomas Muller",75));
        students.add(new FalseNine(522,"Lionel Messi",100));
        students.add(new FalseNine(523,"Roberto Firmino",75));
        students.add(new FalseNine(524,"Franceso Totti",85));
        students.add(new FalseNine(525,"Dennis Bergkmap",90));

        System.out.println("Students in List");

        for(FalseNine s:students){
            System.out.println(s);
        }
        System.out.println();

        Map<Integer,String> studentMap = new HashMap<>();
        for(FalseNine s:students){
            studentMap.put(s.getId(),s.getName());
        }

        System.out.println("Map of Student IDs to Names:");
        for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
        System.out.println();

        Set<Integer> uniqueMarks = new HashSet<>();
        for(FalseNine s:students){
            uniqueMarks.add(s.getMarks());
        }

        System.out.println("Unique Marks (Set)");

        for(int mark:uniqueMarks){
            System.out.println(mark);
        }

    }
}
