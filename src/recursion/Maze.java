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
	
	private static final int PATHWAY = 0;		//��
	private static final int WALL = 1;		//��
	private static final int VISITABLE = 2;		//�湮 ������ ��
	private static final int VISITED = 3;		//�湮�ߴ� ��
	
	
	
	private static boolean findMazePath(int x, int y) {
		
		if(x<0 || y<0 || x>=n || y>=n)		//x, y�� ���� �迭�� ũ�⺸�� ũ�ų� ���� ��
			return false;
		else if(maze[x][y] != PATHWAY)		//��(or ó�� �������� ��)�� �ƴ� ��
			return false;
		else if(x==n-1 && y==n-1)		//x, y�� �迭�� ��(�ⱸ)�� �������� ��
			return true;
		else {
			maze[x][y] = VISITABLE;
			
			//��->��->��->�� �������� ���� recursion
			if(findMazePath(x-1, y)||findMazePath(x, y+1)||
					findMazePath(x+1, y)||findMazePath(x, y-1)) {
				return true;
			}
			
			maze[x][y] = VISITED;	//�� �ڸ��� ���ƴٴ� ǥ��
			
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
