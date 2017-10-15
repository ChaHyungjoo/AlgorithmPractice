package recursion;

public class Maze {
	
	private static int n = 8;
	private static int[][] maze = {
			{0, 0, 0, 0, 0, 0, 0, 1},
			{0, 1, 1, 0, 1, 1, 0, 1},
			{0, 0, 0, 1, 0, 0, 0, 1},
			{0, 1, 0, 0, 1, 1, 0, 0},
			{0, 1, 1, 1, 0, 0, 1, 1},
			{0, 1, 0, 0, 0, 1, 0, 1},
			{0, 0, 0, 1, 0, 0, 0, 1},
			{0, 1, 1, 1, 0, 1, 0, 0},
	};
	
	private static final int PATHWAY = 0;		//길
	private static final int WALL = 1;		//벽
	private static final int VISITABLE = 2;		//방문 가능한 길
	private static final int VISITED = 3;		//방문했던 길
	
	
	
	private static boolean findMazePath(int x, int y) {
		
		if(x<0 || y<0 || x>=n || y>=n)		//x, y의 값이 배열의 크기보다 크거나 작을 때
			return false;
		else if(maze[x][y] != PATHWAY)		//길(or 처음 지나가는 길)이 아닐 때
			return false;
		else if(x==n-1 && y==n-1)		//x, y가 배열의 끝(출구)에 도달했을 때
			return true;
		else {
			maze[x][y] = VISITABLE;
			
			//북->동->남->서 방향으로 돌며 recursion
			if(findMazePath(x-1, y)||findMazePath(x, y+1)||
					findMazePath(x+1, y)||findMazePath(x, y-1)) {
				return true;
			}
			
			maze[x][y] = VISITED;	//이 자리를 거쳤다는 표시
			
			return false;
		}
		
	}
	
	private static void printMaze() {
		
		for(int i=0; i<maze.length; i++) {
			for(int j=0; j<maze.length; j++)
				System.out.print(maze[i][j]+" ");
			
			System.out.println("");
		}
		
	}
	
	
	public static void main(String[] args) {
		
		Maze.printMaze();
		System.out.println("=======================================");
		System.out.println(Maze.findMazePath(0, 0));
		Maze.printMaze();
		

	}

}
