package cn.sd.yz.test;

import java.io.FileReader;
import java.net.URL;
import java.util.List;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

/**
 * 测试脚本引擎执行javascript代码
 * @author Yin
 *
 */
public class Demo01 {
	public static void main(String[] args) throws Exception {
		//获得脚本引擎对象
		ScriptEngineManager sem = new ScriptEngineManager();
		ScriptEngine engine = sem.getEngineByName("javascript");
		
		//定义变量
		engine.put("msg", "she is a good girl");
		String str = "var user = { name:'yingying', age:18, schools:['南开','天大'] };";
		str += "print(user.name);";
		
		//执行脚本
		engine.eval(str);
		engine.eval("msg = 'yingying is a good girl';");
		System.out.println(engine.get("msg"));
		System.out.println("--------分隔符----------------");
		
		
		//定义函数
		engine.eval("function add(a,b){var sum = a+b;return sum;}");
		//取得调用接口
		Invocable jsInvoke = (Invocable) engine;
		//执行脚本中定义的方法
		Object result1 = jsInvoke.invokeFunction("add", new Object[] {13,20});
		System.out.println(result1);
		
		//导入其他java包，使用其他包中的java类。如需要深入了解细节，可以详细学习Rhino语法
		String jsCode = "var list=java.util.Arrays.asList([\"北京尚学堂\",\"清华大学\",\"北京大学\"]);";
		engine.eval(jsCode);
		
		List<String> list2 = (List<String>) engine.get("list");
		for(String temp:list2) {
			System.out.println(temp);
		}
		
		//执行一个js文件(我们将a.js至于项目的src下即可)
		URL url = Demo01.class.getClassLoader().getResource("a.js");
		FileReader fr = new FileReader(url.getPath());
		engine.eval(fr);
		fr.close();   //由于只是测试，就不那么规范了，实际使用时要使用try catch finally！
	
	
	}
}
