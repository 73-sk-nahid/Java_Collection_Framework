import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class LearnStack {
    public static void main(String[] args){
        Stack<String> animals = new Stack<>();

        animals.push("Cat");
        animals.push("Dog");
        animals.push("Tiger");
        animals.push("Lion");
        animals.push("Elephant");

        //will show the last in value
        System.out.println(animals.peek());

        System.out.println("Old Stack: "+animals);
        //delete the last inserted value
        animals.pop();
        System.out.println("New Stack: "+animals);

        System.out.println(animals.peek());
    }    
}