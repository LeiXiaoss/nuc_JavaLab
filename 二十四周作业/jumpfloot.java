import java.util.Scanner;

public class jumpfloor {
	 
	/*
	 * С����ÿһ����Ծֻ������ѡ��һ������һ�����ݵ���� i �����ݣ���ʱС���ܴ��ڵ� i-1 �����ݣ����������������ݵ���� i �����ݣ���ʱС���ܴ��ڵ� i-2 �����ݡ�

���ǣ�i �����ݵ������ܺ�������ǰ i-1 �����ݵ���������f(i-1)��ǰ i-2 �����ݵ���������f(i-2)����Ϊֻ�����ֿ����ԣ����ԣ�f(i)=f(i-1)+f(i-2);

�������ƣ����Եݹ����n����������֮�͡�
	 */
	public static void main(String[] args) {
		int  n = 10;
		jumpfloor jf = new jumpfloor();
		System.out.println(jf.jump(n));
	}
	public int jump(int n)
	{
		int i[] = {0,1,2};
		
		if(n<0){
			System.out.println("�����¥���������˳�");
			return 0;
		}	
		if(n<3)
		{
			return i[n];
		}else{
			return jump(n-1)+jump(n-2);
		}
	}

}
