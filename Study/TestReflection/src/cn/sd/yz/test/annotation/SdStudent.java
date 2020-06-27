package cn.sd.yz.test.annotation;

@SdTable("sd.table")
public class SdStudent {
	@SdField(columnName="id",type="int",length=10)
	private int id;
	@SdField(columnName="uname",type="varchar",length=10)
	private String uname;
	@SdField(columnName="age",type="int",length=3)
	private int age;
	
	public SdStudent() {
	
	}

	public SdStudent(int id, String uname, int age) {
		super();
		this.id = id;
		this.uname = uname;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}
