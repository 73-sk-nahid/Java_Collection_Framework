import java.util.HashSet;
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


    }
}
