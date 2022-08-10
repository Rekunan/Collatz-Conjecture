import java.util.*;
import java.io.*;

class Main {
	// private static final Scanner console = new Scanner(System.in);

	public static void main(String[] args) {
		// int n = 0;
		// try {
		// 	File myObj = new File("collatzConjecture.txt");
		// 	if (myObj.createNewFile()) {
		// 		System.out.println("File created: " + myObj.getName());
		// 	} else {
		// 		System.out.println("File already exists.");
		// 	}
		// } catch (IOException e) {
		// 	System.out.println("An error occurred.");
		// 	e.printStackTrace();
		// }
		// try {
		// 	FileWriter myWriter = new FileWriter("collatzConjecture.txt", true);
		// 	for (int i = 0; i < 10000; i++) {
		// 		n = (int) (Math.random() * 9998 + 2);
		// 		collatzConjecture(n);
		// 	}
		// 	myWriter.close();
		// } catch (IOException e) {
		// 	System.out.println("An error occurred.");
		// 	e.printStackTrace();
		// }

		// arrayQueue queue = new arrayQueue(1);
		// System.out.println("Initial Queue");
		// System.out.println(queue);
		// for(int i=2; i<9; i++) {
		// 	queue.addQueue(i);
		// 	System.out.println(queue);
		// }
		// queue.addQueue(9);
		// System.out.println(queue);
		// queue.deleteQueue();
		// System.out.println(queue);
		// queue.addQueue(9);
		// System.out.println(queue);
		// queue.addQueue(10);
		// System.out.println(queue);
		// for(int i=0; i<9; i++) {
		// 	queue.deleteQueue();
		// 	System.out.println(queue);
		// }

		// arrayQueue queue = new arrayQueue(8);
		// int n = 8;
		// for(int i=0; i<19; i++) {
		// 	if(check(n)) {
		// 		queue.addQueue((n-1)/3);
		// 	}
		// 	queue.addQueue(2*n);
		// 	System.out.println("Deleted: " + queue.front());
		// 	queue.deleteQueue();
		// 	n = queue.front();
		// }

		linkedListQueue queue = new linkedListQueue(8);
		int n = 8;
		for(int i=0; i<19; i++) {
			System.out.println("Deleted: " + queue.front());
			if(check(n)) {
				queue.addQueue((n-1)/3);
				System.out.println("Added: " + (n-1)/3);
			}
			System.out.println("Added: " + 2*n);
			queue.addQueue(2*n);
			queue.deleteQueue();
			n = queue.front();
		}
	}

	public static void collatzConjecture(int n) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		int placeholder = n;
		list.add(n);
		while (n != 1) {
			if (n % 2 == 0) {
				n /= 2;
			} else {
				n = 3 * n + 1;
			}
			list.add(n);
		}
		try {
			FileWriter myWriter = new FileWriter("collatzConjecture.txt", true);
			myWriter.append(placeholder + ":\n");
			System.out.println("Successfully wrote: " + placeholder + ": to the file.");
			myWriter.append(list.size() + "\n\n");
			System.out.println("Successfully wrote: " + list.size() + " to the file.");
			myWriter.close();
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}

	// checks if the non-even option is correct
	public static boolean check(double n) {
		n = (n - 1) / 3;
		return (n == (int) n && n % 2 != 0);
	}
}