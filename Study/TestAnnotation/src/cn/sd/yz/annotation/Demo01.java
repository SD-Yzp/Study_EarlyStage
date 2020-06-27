package cn.sd.yz.annotation;


//@MyAnnotation01  放在类的前面会报错
public class Demo01 {
	
	@MyAnnotation01(age=18,studentName="老尹",id=1001,
			schools= {"北京大学","中国石油大学"})
	public void test1() {
		
	}
	
	@MyAnnotation02("aaa")  //当注解内容只有一个时，可以不用标识符
	public void test2() {
		
	}
}
