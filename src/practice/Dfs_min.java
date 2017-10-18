package practice;

import java.util.Scanner;

public class Dfs_min {
	
	static int[][] map;
	static int[][] visited;
	static int min;
	static int map_size;
	
	
	public static void dfs_min(int x, int y, int length) {
		
		if(x == map_size-1 && y == map_size-1) {
			if(min>length)
				min = length;
			
			return;
		}
		
		map[x][y] = 0;
		
		if(y<map_size && map[x][y+1]==1)	//오른쪽
			dfs_min(x, y+1, length+1);
		else if(x<map_size && map[x+1][y]==1)	//아래
			dfs_min(x+1, y, length+1);
		else if(y>0 && map[x][y-1]==1)			//왼쪽
			dfs_min(x, y-1, length+1);	
		else if(x>0 && map[x-1][y]==1)			//위
			dfs_min(x-1, y, length+1);
		
		//위의 조건문의 순서에 따라 써도 되고 안써도 됨
		//map[x][y] = 1;
		
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//System.out.println("맵의 크기를 입력:");
		map_size = scanner.nextInt();
		
		map = new int[map_size+1][map_size+1];
		min = map_size*map_size;
		
		//System.out.println("길을 입력: ");
		for(int i=0; i<map_size; i++)
			for(int j=0; j<map_size; j++)
				map[i][j] = scanner.nextInt();
			
		dfs_min(0, 0, 1);
		
		System.out.println("최단 거리 : " + min);
		
	}

}
