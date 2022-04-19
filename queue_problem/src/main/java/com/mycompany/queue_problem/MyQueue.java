package com.mycompany.queue_problem;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Washington Yandun @WashingtonYandun
 */
public class MyQueue {
    Queue queue;
    int quantum = 35;

    public MyQueue() {
        // List of Process
        queue = new LinkedList<Process>();
    }
    
    public boolean add(Process newProcess){
        return this.queue.add(newProcess);
    }
    
    public Process peek(){
        return (Process)this.queue.peek();
    }
    
    public Process poll(){
        return (Process)this.queue.poll();
    }
    
    public Process remove(){
        return (Process)this.queue.remove();
    }
    
    public boolean empty(){
        return this.queue.isEmpty();
    }
    
    public int size(){
        return this.queue.size();
    }
    
    @Override
    public String toString() {
        String result = "";
        for (Object p : this.queue) {
            result += p.toString() + "\n";
        }
        return result;
    }
    
}
