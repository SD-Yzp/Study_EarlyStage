package cn.sd.yz1;
/**
 * 测试数组
 * @author Yin
 *
 */
public class Test01 {
	public static void main(String[] args) {
		int[] arr01 = new int[10];  //索引下标[0,length-1]：0,1,2,3,4,5,6,7,8,9
		String arr02[]=new String[5];
	
		for(int i=0;i<10;i++) {
			arr01[i]=10*i;
			System.out.println(arr01[i]);
		}
		
		
		User[] arr03 = new User[3];
		arr03[0]=new User(100,"jojo1");
		arr03[1]=new User(101,"jojo2");
		arr03[2]=new User(102,"jojo3");
		
		for(int i=0;i<=arr03.length-1;i++) {
			System.out.println(arr03[i].getId()+arr03[i].getName());
		}
	}
}

class User{
	private int id;
	private String name;
	
	
	public User(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}