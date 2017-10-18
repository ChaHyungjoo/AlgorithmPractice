package practice;

import java.util.Scanner;

public class Dfs_min2 {
	
	static int map_size;
	static int[][] map;
	static int[][] visit;
	static int min;
	
	public static void dfs(int x, int y, int length) {
		
		if(x == map_size-1 && y == map_size-1) {
			if(min>length)
				min = length;
			return;
		}
		
		map[x][y] = 0;
		
		if(y>0 && map[x][y-1] == 1)
			dfs(x, y-1, length+1);
		if(y<map_size && map[x][y+1] == 1)
			dfs(x, y+1, length+1);
		if(x<map_size && map[x+1][y] == 1)
			dfs(x+1, y, length+1);
		if(x>0 && map[x-1][y] == 1)
			dfs(x-1, y, length+1);
		
		map[x][y] = 1;
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		map_size = scanner.nextInt();
		map = new int[map_size+1][map_size+1];
		min = map_size*map_size;
		
		for(int i=0; i<map_size; i++)
			for(int j=0; j<map_size; j++)
				map[i][j] = scanner.nextInt();
		
		dfs(0,0,1);
		
		System.out.println("최단거리: " + min);

	}

}
