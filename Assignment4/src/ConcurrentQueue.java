import java.util.LinkedList;
import java.util.Queue;

public class ConcurrentQueue<T>{
    Queue<T> queue;
    public Object objLock = new Object();

    public ConcurrentQueue(Queue<T> queue) {
        queue = new LinkedList<T>();
    }

    public void add(T data) {
        synchronized (objLock){
            queue.add(data);
        }
    }

    public T remove(){
        synchronized (objLock){
            return queue.remove();
        }
    }

    public T peek(){
        synchronized (objLock){
            return queue.peek();
        }
    }
    public boolean isEmpty(){
        synchronized (objLock){
            return queue.isEmpty();
        }
    }

}
