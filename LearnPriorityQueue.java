import java.util.Comparator;
import java.util.PriorityQueue;

public class LearnPriorityQueue {
    public static void main(String[] args){
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        priorityQueue.offer(30);
        priorityQueue.offer(20);
        priorityQueue.offer(10);
        priorityQueue.offer(40);
        System.out.println(priorityQueue); //it will print the minimum value at first using minHip

        priorityQueue.poll(); //it will remove the minHip value
        System.out.println(priorityQueue);

        PriorityQueue<Integer> priorityQueue1 = new PriorityQueue<>(Comparator.reverseOrder());
        //Comparator.reverseOrder() will implement the MaxHip method
        priorityQueue1.offer(30);
        priorityQueue1.offer(20);
        priorityQueue1.offer(10);
        priorityQueue1.offer(40);
        System.out.println(priorityQueue1); //it will print the maximum value at first using minHip

        priorityQueue1.poll(); //it will remove the minHip value
        System.out.println(priorityQueue1);
    }
}
