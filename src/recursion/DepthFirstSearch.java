package recursion;

import java.util.Scanner;

public class DepthFirstSearch {
	
	static int[][] adjacencyMatrix;		//�������
	static boolean[] visit;		//�湮Ȯ�� �迭
	static int vCount;		//������ ��
	static int eCount;		//������ ��
	
	
	public static void dfs(int v) {
		
		visit[v-1] = true;
		
		for(int i=1; i<=vCount; i++) {
			if(adjacencyMatrix[v-1][i-1]==1 && !visit[i-1]) {
				System.out.println(v + "���� " + i + "�� �̵�");
				dfs(i);
			}
		}
	}
	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("������ ������ ���� �Է����ּ���:");
		vCount = scanner.nextInt();
		eCount = scanner.nextInt();
		
		adjacencyMatrix = new int[vCount][vCount];
		visit = new boolean[vCount];
		
		for(int i=0; i<eCount; i++) {
			System.out.println("������ �Է����ּ���:");
			int n = scanner.nextInt();
			int m = scanner.nextInt();
			
			adjacencyMatrix[n-1][m-1] = adjacencyMatrix[m-1][n-1] = 1;		//������ ������Ŀ� �ʱ�ȭ ������
		}
		
		dfs(1);
		
		
	}

}
