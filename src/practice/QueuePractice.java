package practice;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueuePractice {

	public static void main(String[] args) {
		
		int[] n = {3, 5, 1, 8, 2};
		
		//Queue<Integer> q = new LinkedList<>();
		PriorityQueue<Integer> q = new PriorityQueue<>(n.length, Collections.reverseOrder());
		
		for(int i=0; i<n.length; i++)
			q.offer(n[i]);
		
		System.out.println(q.poll());
		

	}

}
