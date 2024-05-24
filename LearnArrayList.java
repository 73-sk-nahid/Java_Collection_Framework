import java.util.*;
public class LearnArrayList {
    public static void main(String[] args){
        ArrayList<String> studentsName = new ArrayList<>();
        studentsName.add("Nahid Sheikh");
        studentsName.add("Sk. Nahid");
        System.out.println(studentsName);

        //While initialize ArrayList its size become 10.
        // after filing up 10 array size its increase by using below formula
        // size = n + n/2 + 1 , so in next it will be 10 + 5 + 1 = 16

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println("\nNormal Print Method");
        System.out.println(list);

        System.out.println("\nUsing for-loop");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("\nusing for-each method");
        for (Integer element : list) {
            System.out.println(element);
        }


        System.out.println("\nUsing Iterator method");
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }    
}