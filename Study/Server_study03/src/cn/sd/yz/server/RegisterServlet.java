package cn.sd.yz.server;

public class RegisterServlet implements Servlet {

	@Override
	public void service(Request request, Response response) {
		response.print("注册成功");
	}

}
