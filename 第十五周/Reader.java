package Lab;

import java.util.Scanner;

/**
 * Created by Wean on 2016/9/3.
 */
public class Reader {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a;
        a=sc.nextInt();
        int b[]=new int[a];
        int c[]=new int[a];
        for (int i = 0; i <a ; i++) {
            b[i]=sc.nextInt();
            c[i]=1;
        }
        for (int j=0;j<a;j++){
            for (int i=0;i<j;i++){
                if (b[i]==b[j]){
                    c[j]=c[i];
                    c[j]++;
                }
            }
        }
        for (int i = 0; i <a ; i++) {
            System.out.print(c[i]+" ");
        }
/*
5
1 3 2 1 3

1 1 1 2 2

�ж�a��i��֮ǰ��Ԫ����û����a��i����ͬ�ģ���ͬ�ټ�һ����Ӧ��c[i]��
 */
    }
}
