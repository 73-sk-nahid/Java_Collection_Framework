
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LearnCollectionClass {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(40);
        list.add(40);
        list.add(30);
        list.add(40);
        list.add(10);
        list.add(50);
        list.add(40);
        list.add(40);
        list.add(20);

        System.out.println("Minimum Value is: " +Collections.min(list));
        System.out.println("Maximum Value is: " +Collections.max(list));
        System.out.println("Frequency of 40: "+Collections.frequency(list, 40));
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list, Comparator.reverseOrder());
        System.out.println(list);

        List<Student> students = new ArrayList<>();
        students.add(new Student("Sheikh", 12));
        students.add(new Student("Nahid", 10));
        students.add(new Student("Ahmed", 15));

        Student s1 = new Student("Sk. Nahid", 73);
        Student s2 = new Student("Rakib", 67);
        
        System.out.println(s1.compareTo(s2));  //6

        System.out.println(students);
        Collections.sort(students);
        System.out.println(students);


    }
}
