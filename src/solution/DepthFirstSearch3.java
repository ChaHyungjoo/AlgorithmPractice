package solution;

import java.util.Scanner;

public class DepthFirstSearch3 {
    static int[][] map; //map�� ��Ÿ���� �迭 
    static int[][] visited; 
    static int map_size; //map�� Size
    static int min;
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        map_size = Integer.parseInt(scan.nextLine().trim()); //map�� size�� �Է¹޴´�.
        map = new int[map_size+1][map_size+1]; //map�� �迭�� ũ�⸦ �Է¹��� map_sizeũ��� �����.
        min = map_size * map_size;
        //�̵��� �� �ִ� path�� �Է¹ޱ� ���� for���� ���.
        for(int i = 0; i < map_size; i++) {
            for(int j = 0; j < map_size; j++) {
                map[i][j] = scan.nextInt();
            }
        }
        
        depthfirstSearch(0,0,1);
        
        System.out.println("�ִ� �Ÿ� : " + min);
        
        
        //=====================================================
        for(int i=0; i<map.length-1; i++) {
        	for(int j=0; j<map.length-1; j++)
        		System.out.print(map[i][j]+" ");
        	
        	System.out.println("");
        }
    }
    
    //dfs�˰��� ����
    public static void depthfirstSearch(int x, int y, int length) {
        
        if(x == map_size -1 && y == map_size -1){
            if (min > length) min = length;		//���� �� �� ���� lenght�� min���� ���ԵǾ� base case�� �ɷ� ���
            return; 
        }
    
        map[y][x] = 0;	//�湮 ������ ǥ���ϱ� ���� 0�� ����, �̰� ������ x�� y�� ������ Ŀ���� stack overflow �ɸ�
            
        //�������� �̵��� ���
        if(x > 0 && map[y][x-1] == 1) {
            depthfirstSearch(x-1, y, length+1);
        }
            
        //���������� �̵��� ���
        if(x < map_size && map[y][x+1] == 1) {
            depthfirstSearch(x+1, y, length+1);
        }
        //�Ʒ��� �̵��� ���
        if(y < map_size && map[y+1][x] == 1) {
            depthfirstSearch(x, y+1, length+1);
        }
        //���� �̵��� ���
        if(y > 0 && map[y-1][x] == 1) {
            depthfirstSearch(x, y-1, length+1);
        }
        
        map[y][x] = 1;	//������ �ڸ��� �ٽ� �����·� ������ ���� 1�� ����
    }
}