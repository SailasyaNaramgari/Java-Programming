import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class Student1{
    int age;
    String name;

    public Student1( int age, String name) {
        this.name = name;
        this.age = age;
    } //constructor

    @Override
    public String toString() {
        return "Student1{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
public class Sorting1 {
    public static void main(String[] args) {

        Comparator<Student1> com = new Comparator<Student1>() {
            public int compare(Student1 i, Student1 j) {
                if (i.age > j.age)
                    return 1;
                else
                    return -1;
            }
        };
        //using lambda
        //Comparator<Student1> com = (i, j) -> i.age > j.age?1:-1;


        List<Student1> studs = new ArrayList<>();
        studs.add(new Student1(20, "lasya"));
        studs.add(new Student1(21, "sai"));
        studs.add(new Student1(17, "neha"));
        studs.add(new Student1(29, "navin"));
        studs.add(new Student1(18, "alex"));

        Collections.sort(studs,com);

        for(Student1 s : studs)
            System.out.println(s);
    }
}