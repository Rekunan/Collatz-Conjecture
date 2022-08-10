public class arrayQueue {
	private int[] queue = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	private int queueFront = 0;
	private int maxQueueSize = 20;
	private int queueRear;

	public arrayQueue(int x, int y, int z, int w) {
		queue[0] = x;
		queue[1] = y;
		queue[2] = z;
		queue[3] = w;
		queueRear = queue.length - 1;
	}

	public arrayQueue(int x, int y, int z) {
		queue[0] = x;
		queue[1] = y;
		queue[2] = z;
		queueRear = queue.length - 1;
	}

	public arrayQueue(int x, int y) {
		queue[0] = x;
		queue[1] = y;
		queueRear = queue.length - 1;
	}

	public arrayQueue(int x) {
		queue[0] = x;
	}

	public boolean addQueue(int n) {
		if(queue[queueRear]==0) {
			return false;
		}
		if(!this.isFullQueue()) {
			queueRear++;
			if(queueRear >= maxQueueSize) {
				queue[0] = n;
				queueRear = 0;
			}
			else {
				queue[queueRear] = n;
			}
			return true;
		} else {
			System.out.println("The queue is full.");
			return false;
		}
	}

	public boolean deleteQueue() {
		if(!this.isEmptyQueue()){
			queue[queueFront] = 0;
			queueFront++;
			// queueFront = 0;
			return true;
		} else {
			System.out.println("This queue is empty.");
			return false;
		}
	}

	public int size() {
		return queue.length;
	}

	public boolean isEmptyQueue() {
		return queueFront == queueRear && queue[queueFront] == 0;
	}

	public boolean isFullQueue() {
		int count = 0;
		for(int i=0; i<maxQueueSize; i++) {
			if(queue[i]==0) {
				count++;
			}
		}
		if(count == 0) {
			return true;
		} else {
			return false;
		}
	}

	public int front() {
		return queue[queueFront];
	}

	public int back() {
		return queue[queueRear];
	}

	public String toString() {
		return "[" + queue[0] + ", " + queue[1] + ", " + queue[2] + ", " + queue[3] + ", " + queue[4] + ", " + queue[5] + ", " + queue[6] + ", " +  queue[7] + "]";
	}

	public int get(int n){
		return queue[n];
	}
}