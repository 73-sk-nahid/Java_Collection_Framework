
import java.util.ArrayDeque;

public class LearnArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();

        arrayDeque.offer(10); //it will add value to array
        arrayDeque.offerFirst(20); //it will add value at first position by pushing
        arrayDeque.offerLast(30); //it will add value at last position
        arrayDeque.offer(40);  //it will add value to array

        System.out.println(arrayDeque);

        System.out.println("Select Value" +arrayDeque.peek());  //it will peek value from array
        System.out.println("Select First Value: " +arrayDeque.peekFirst());  //it will peek first value from array
        System.out.println("Select Last Value: " +arrayDeque.peekLast()); //it will peek last value from array

        System.out.println("Poll value: " +arrayDeque.poll());  //it will poll first value by default
        System.out.println("Poll First Value: " +arrayDeque.pollFirst()); //it will poll first value forcefully
        System.out.println("Poll Last Value: " +arrayDeque.pollLast()); //it will poll last value forcefully
        System.out.println("Remain Array: " +arrayDeque);
    }
    
}
