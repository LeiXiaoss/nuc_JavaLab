
public class Robot {
	 public int countWays(int x, int y) {  
	        
	        int dp[][]=new int[x][y];  
	        dp[0][0] = 0;                      //��(0,0)��ʼ��  
	        for(int i = 0;i < x;i ++){  
	            dp[i][0] = 1;                  //��Ϊ�����������ߣ��ҽ��䶼���Ϊһ�������������Ҫһ�Σ�  
	        }  
	        for(int i = 0;i < y;i ++){  
	            dp[0][i] = 1;                   //��Ϊ�����������ߣ��ҽ��䶼���Ϊһ�������������Ҫһ��  
	        }  
	        for(int i = 1;i < x;i ++){  
	            for(int j = 1;j < y;j ++){  
	                dp[i][j] = dp[i-1][j] + dp[i][j-1];//�ߵ�(i,j)������һ������һ��  
	            }  
	        }  
	        return dp[x-1][y-1];  
	    }  
	 
	 
	 public static void main(String[] args) {
		Robot r = new Robot();
		System.out.println(r.countWay(3,3));
	}
	 
	 
	 public int countWay(int x, int y) {  
	         
	        if(x==1||y==1){  
	            return 1;  
	        }  
	        return countWays(x-1,y)+countWays(x,y-1);  
	    }  

}
