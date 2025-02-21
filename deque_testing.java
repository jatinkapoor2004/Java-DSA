
import java.util.ArrayDeque;

public class deque_testing 
{
    public static void main(String[] args) {
        ArrayDeque<Integer> dq=new ArrayDeque<>();
        dq.addFirst(10);
        dq.addFirst(20);
        dq.addLast(30);
        dq.addLast(40);
        dq.removeFirst();
        dq.removeFirst();
        dq.removeFirst();
        
        System.out.println(dq.isEmpty());
        System.out.println(dq);
    }
}
