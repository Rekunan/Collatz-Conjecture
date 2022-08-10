import java.util.*;

public class linkedListQueue {
	private LinkedList<Integer> queue = new LinkedList<Integer>();
	private int queueRear;

	public linkedListQueue(int x, int y) {
		queue.add(x);
		queue.add(y);
		queueRear = 1;
	}
	
	public linkedListQueue(int x) {
		queue.add(x);
	}

	public boolean addQueue(int n) {
		queueRear++;
		if(queueRear >= queue.size()) {
			queue.addLast(n);
			queueRear = 0;
		}
		else {
			queue.addLast(n);
		}
		return true;
		
	}

	public boolean deleteQueue() {
		if(!this.isEmptyQueue()){
			queue.removeFirst();
			return true;
		} else {
			System.out.println("This queue is empty.");
			return false;
		}
	}

	public int size() {
		return queue.size();
	}

	public boolean isEmptyQueue() {
		return queue.size() == 0;
	}

	public int front() {
		return queue.getFirst();
	}

	public int back() {
		return queue.getLast();
	}

	public String toString() {
		String yes = "[";
		for(int i = 0; i < queue.size() - 2; i++) {
			yes += queue.get(i) + ", ";
		}
		yes += queue.get(queue.size() - 1) + "]";
		return yes;
	}

	public int get(int n){
		return queue.get(n);
	}
}