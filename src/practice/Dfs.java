package practice;

import java.util.Scanner;

public class Dfs {
	
	static int vertex;
	static int edge;
	static int[][] adjacencyMatrix;
	static boolean[] visit;
	
	public static void dfs(int v) {
		
		visit[v-1] = true;
		
		for(int i=1; i<=vertex; i++) {
			
			if(adjacencyMatrix[v-1][i-1] == 1 && !visit[i-1]) {
				System.out.println(v + "���� " + i + "���� �̵�");
				dfs(i);
			}
			
		}
	}
	
	

	public static void main(String[] args) {
		 
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("������ ������ ������ �Է�:");
		
		vertex = scanner.nextInt();
		edge = scanner.nextInt();
		
		adjacencyMatrix = new int[vertex][vertex];
		visit = new boolean[vertex];
		
		for(int i=0; i<edge; i++) {
			
			System.out.println("������ �Է�:");
			int n = scanner.nextInt();
			int m = scanner.nextInt();
			
			adjacencyMatrix[n-1][m-1] = adjacencyMatrix[m-1][n-1] = 1;
			
		}
		
		
		dfs(1);
		
		

	}

}
