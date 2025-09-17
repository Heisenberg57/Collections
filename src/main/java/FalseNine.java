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
        List<FalseNine> falsenine = new ArrayList<>();
        falsenine.add(new FalseNine(521,"Thomas Muller",75));
        falsenine.add(new FalseNine(522,"Lionel Messi",100));
        falsenine.add(new FalseNine(523,"Roberto Firmino",75));
        falsenine.add(new FalseNine(524,"Franceso Totti",85));
        falsenine.add(new FalseNine(525,"Dennis Bergkmap",90));

        System.out.println("False 9s in List");

        for(FalseNine s:falsenine){
            System.out.println(s);
        }
        System.out.println();

        Map<Integer,String> falseMap = new HashMap<>();
        for(FalseNine s:falsenine){
            falseMap.put(s.getId(),s.getName());
        }

        System.out.println("Map of False 9s IDs to Names:");
        for (Map.Entry<Integer, String> entry : falseMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
        System.out.println();

        Set<Integer> uniqueMarks = new HashSet<>();
        for(FalseNine s:falsenine){
            uniqueMarks.add(s.getMarks());
        }

        System.out.println("Unique Marks (Set)");

        for(int mark:uniqueMarks){
            System.out.println(mark);
        }

    }
}
