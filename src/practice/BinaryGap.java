package practice;

public class BinaryGap {
	
	
	public static int solution(int N) {
        
        String a = Integer.toBinaryString(N);
        
        String[] b = a.split("1");
        
        int tmp = 0;
        
        for(int i=0; i<b.length; i++) {
        	if(b[i].length()>tmp)
        		tmp = b[i].length();
        }
        
        
        return tmp;
    }
	
	public static void main(String[] args) {
		
		System.out.println(solution(20));
		
		
		
		
	}

}
