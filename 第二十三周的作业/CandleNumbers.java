public class CandleNumbers {

	public static void main(String[] args) {
		int candleNumbers = 0,i,j;
		for( i = 1;i<=236;i++)
		{
			for( j= i;j<=236;j++)
			{
				for(int a=i;a<=j;a++)
				{
					candleNumbers +=a;
					
				}
				if(candleNumbers == 236)
				{
					System.out.println("��"+i+"�꿪ʼ�������");
				}else
				{
					candleNumbers = 0;
				}
			}
			
			
		}
		System.out.println("����");
	}

}
