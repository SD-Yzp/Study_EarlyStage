
/**
 * 作业3：编写递归算法程序：一列数的规则如下: 1、1、2、3、5、8、13、21、34...... 求数列的第40位数是多少。
 * @author Yin
 *
 */
public class Task03 {
	public static void main(String[]args) {
		int a=1;
		int b=1;
		Add add = new Add();
		System.out.println("数列的第40个数字为："+add.Add(a,b));
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


/*博客的答案
public class Task03{
    public static void main(String[] args) {
        int before = 0;
        int now = 1;
 
        Recursion recursion = new Recursion();
 
        System.out.println("第40个数:"+recursion.Recursion(before,now));
 
 
    }
}
class Recursion{
 
    int i=1;
 
    int Recursion(int before ,int now){
 
        if(i > 40){           //第几个数
            return before;
        }
 
        now += before;
        before = now -before;
        i++;
 
         return Recursion(before , now);
    }
}
*/