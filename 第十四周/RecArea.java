import java.util.Scanner;
import java.util.HashSet;
public class RecArea{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //Ҫ�����εĸ���
        HashSet<UnitGrid> set = new HashSet<UnitGrid>();
        int[] axis = new int[4];
        for(int i = 1; i <= n; i++){
            for(int j = 0; j < 4; j++){
                axis[j] = sc.nextInt();
            }
            set.addAll(transferToUniteGrid(axis[0], axis[1], axis[2], axis[3]));
        }
        System.out.println(set.size());
    }
 
    private static HashSet<UnitGrid> transferToUniteGrid(int x1, int y1, int x2, int y2){
        HashSet<UnitGrid> set = new HashSet<UnitGrid>();
        //����������������Ա�֤x1<x2,y1<y2��
        int temp;
        if(x1 > x2){
            temp = x1;
            x1 = x2;
            x2 = temp;
        }
        if(y1 > y2){
            temp = y1;
            y1 = y2;
            y2 = temp;
        }
        for(int i = x1; i < x2; i++){//�������Ͻ�
            for(int j = y1; j < y2; j++){
                set.add(new UnitGrid(i,j));
            }
        }
        return set;
    }
 
}
 
class UnitGrid{
    int x, y; //�����½ǵ�����������һ��UnitGrid
    public UnitGrid(int x, int y){
        this.x = x;
        this.y = y;
    }
 
    //��дequals�����������½�����һ�£������
    @Override
    public boolean equals(Object o){
        if(o == null) return false;
        if(!(o instanceof UnitGrid)) return false;
        UnitGrid ug = (UnitGrid)o;
        if((this.x == ug.x) && (this.y == ug.y)){
            return true;
        }
        return false;
    }
 
    //��дhashCode������
    @Override
    public int hashCode(){
        //�������UnitGrid��x,y��ȣ���ΪͬһԪ��
        int result = 17;
        return (37*result + this.x)*37+this.y;
    }
}