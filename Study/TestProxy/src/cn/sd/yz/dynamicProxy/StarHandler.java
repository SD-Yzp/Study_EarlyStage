package cn.sd.yz.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理
 * 需要的时候过来抄即可
 * @author Yin
 *
 */
public class StarHandler implements InvocationHandler{

	private Star star;
	
	public StarHandler(Star star) {
		super();
		this.star = star;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object object = null;
		
		System.out.println("真正的方法执行前！");
		System.out.println("面谈，签合同，预付款，订机票");
		
		if(method.getName().equals("sing")) {			
			object = method.invoke(star, args);
		}
		
		System.out.println("真正的方法执行后！");
		System.out.println("收尾款");
		
		return object;
	}

}
