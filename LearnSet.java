import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LearnSet {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);        
        set.add(50);
        System.out.println(set);  //[50, 20, 40, 10, 30]

        set.add(20); //trying to add duplicate value
        System.out.println(set);  //[50, 20, 40, 10, 30] its avoiding the duplicate value

        set.remove(50); //it will remove this value
        System.out.println(set); //[20, 40, 10, 30]

        System.out.println(set.contains(50));  //false; it will check for 50 in the array return will be boolean

        System.out.println(set.size());
        set.clear();
        System.out.println(set);



        //in LinkedHashSet data adds in a liked way means in a order way
        Set<Integer> set1 = new LinkedHashSet<>();

        set1.add(10);
        set1.add(20);
        set1.add(30);
        set1.add(40);        
        set1.add(50);
        System.out.println(set1);  //[10, 20, 30, 40, 50]

        set1.add(20); //trying to add duplicate value
        System.out.println(set1);  //[10, 20, 30, 40, 50] its avoiding the duplicate value

        set1.remove(50); //it will remove this value
        System.out.println(set1); //[10, 20, 30, 40]

        System.out.println(set1.contains(50));  //false; it will check for 50 in the array return will be boolean

        System.out.println(set1.size());
        set1.clear();
        System.out.println(set1);
    }
}
