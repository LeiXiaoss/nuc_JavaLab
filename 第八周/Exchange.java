import java.util.*;

public class Exchange {
    public int exchangeOddEven(int x) {
        // write code here
          int a = (x&0b10101010101010101010101010101010)>>1;
               //��ȡ����λ������һλ
                int b = (x&0b01010101010101010101010101010101)<<1;
                //���߽��л�����õ����
                return a|b;
    }
}