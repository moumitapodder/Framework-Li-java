import java.util.Stack;


public class stack {//LIFO+LAST IN FIRST OUT; elememts added in the last are poped first;;
    public static void main(String args[])
    {

    
    Stack<Integer>s= new Stack();
    s.push(1);//pushing the elements in the stack
    s.push(2);
    s.push(3);
    s.push(4);
    s.push(5);
    s.push(7);
    System.out.println(s);
    s.pop();//removing the element from first
    System.out.println(s.peek());//what's next
    System.out.println(s);

    }
}
