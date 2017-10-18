package solution;

import java.util.Scanner;

public class DepthFirstSearch3 {
    static int[][] map; //map을 나타내는 배열 
    static int[][] visited; 
    static int map_size; //map의 Size
    static int min;
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        map_size = Integer.parseInt(scan.nextLine().trim()); //map의 size를 입력받는다.
        map = new int[map_size+1][map_size+1]; //map의 배열의 크기를 입력받은 map_size크기로 만든다.
        min = map_size * map_size;
        //이동할 수 있는 path를 입력받기 위해 for문을 사용.
        for(int i = 0; i < map_size; i++) {
            for(int j = 0; j < map_size; j++) {
                map[i][j] = scan.nextInt();
            }
        }
        
        depthfirstSearch(0,0,1);
        
        System.out.println("최단 거리 : " + min);
        
        
        //=====================================================
        for(int i=0; i<map.length-1; i++) {
        	for(int j=0; j<map.length-1; j++)
        		System.out.print(map[i][j]+" ");
        	
        	System.out.println("");
        }
    }
    
    //dfs알고리즘 시작
    public static void depthfirstSearch(int x, int y, int length) {
        
        if(x == map_size -1 && y == map_size -1){
            if (min > length) min = length;		//여러 개 중 작은 lenght가 min으로 대입되어 base case에 걸려 출력
            return; 
        }
    
        map[y][x] = 0;	//방문 했음을 표시하기 위해 0을 대입, 이게 없으면 x나 y가 무한히 커져서 stack overflow 걸림
            
        //왼쪽으로 이동할 경우
        if(x > 0 && map[y][x-1] == 1) {
            depthfirstSearch(x-1, y, length+1);
        }
            
        //오른쪽으로 이동할 경우
        if(x < map_size && map[y][x+1] == 1) {
            depthfirstSearch(x+1, y, length+1);
        }
        //아래로 이동할 경우
        if(y < map_size && map[y+1][x] == 1) {
            depthfirstSearch(x, y+1, length+1);
        }
        //위로 이동할 경우
        if(y > 0 && map[y-1][x] == 1) {
            depthfirstSearch(x, y-1, length+1);
        }
        
        map[y][x] = 1;	//지나간 자리를 다시 원상태로 돌리기 위해 1을 대입
    }
}