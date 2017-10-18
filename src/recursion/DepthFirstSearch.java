package recursion;

import java.util.Scanner;

public class DepthFirstSearch {
	
	static int[][] adjacencyMatrix;		//인접행렬
	static boolean[] visit;		//방문확인 배열
	static int vCount;		//정점의 수
	static int eCount;		//간선의 수
	
	
	public static void dfs(int v) {
		
		visit[v-1] = true;
		
		for(int i=1; i<=vCount; i++) {
			if(adjacencyMatrix[v-1][i-1]==1 && !visit[i-1]) {
				System.out.println(v + "에서 " + i + "로 이동");
				dfs(i);
			}
		}
	}
	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("정점과 간선의 수를 입력해주세요:");
		vCount = scanner.nextInt();
		eCount = scanner.nextInt();
		
		adjacencyMatrix = new int[vCount][vCount];
		visit = new boolean[vCount];
		
		for(int i=0; i<eCount; i++) {
			System.out.println("간선을 입력해주세요:");
			int n = scanner.nextInt();
			int m = scanner.nextInt();
			
			adjacencyMatrix[n-1][m-1] = adjacencyMatrix[m-1][n-1] = 1;		//간선을 인접행렬에 초기화 시켜줌
		}
		
		dfs(1);
		
		
	}

}
