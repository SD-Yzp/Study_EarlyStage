
/**
 * ��ҵ3����д�ݹ��㷨����һ�����Ĺ�������: 1��1��2��3��5��8��13��21��34...... �����еĵ�40λ���Ƕ��١�
 * @author Yin
 *
 */
public class Task03 {
	public static void main(String[]args) {
		int a=1;
		int b=1;
		Add add = new Add();
		System.out.println("���еĵ�40������Ϊ��"+add.Add(a,b));
	}
}

class Add{
	int i = 3;
	  int Add(int n1,int n2){		
		int a = n1;
		int b = n2;		
		int sum = a+b;
		if(i==40) {
			return sum;
		}	
		i++;
		return Add(b,sum);		
	}
}


/*���͵Ĵ�
public class Task03{
    public static void main(String[] args) {
        int before = 0;
        int now = 1;
 
        Recursion recursion = new Recursion();
 
        System.out.println("��40����:"+recursion.Recursion(before,now));
 
 
    }
}
class Recursion{
 
    int i=1;
 
    int Recursion(int before ,int now){
 
        if(i > 40){           //�ڼ�����
            return before;
        }
 
        now += before;
        before = now -before;
        i++;
 
         return Recursion(before , now);
    }
}
*/