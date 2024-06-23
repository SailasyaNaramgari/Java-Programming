import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args){
        Map<String, Integer> students = new HashMap<>(); //map is a interface
        //String is for key and integer is for values
        // we can use HashTable instead of HashMap. The diff is HashTable is synchronized

        students.put("Lasya",98);
        students.put("Navin",88);
        students.put("Harsh",79);
        students.put("Sushil",86);
        students.put("lasya",91); //keys (set) cannot be repeated , values (list) can

        System.out.println(students); //no sequence order
        System.out.println(students.get("Lasya"));
        System.out.println(students.keySet());//gives all the keys



        //to get all the values
        for(String key : students.keySet()){
            System.out.println(key+" : "+students.get(key));
        }

    }
}
