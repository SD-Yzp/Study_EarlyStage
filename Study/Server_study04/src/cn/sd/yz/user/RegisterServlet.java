package cn.sd.yz.user;

import cn.sd.yz.server.core.Request;
import cn.sd.yz.server.core.Response;
import cn.sd.yz.server.core.Servlet;

public class RegisterServlet implements Servlet {

	@Override
	public void service(Request request, Response response) {
		response.print("<html>");
		response.print("<head>");
		response.print("<meta http-equiv=\"content-type\" content=\"text/html;charset=utf-8\">");
		response.print("<title>");
		response.print("注册成功");
		response.print("</title>");
		response.print("</head>");
		response.print("<body>");
		response.print("欢迎回来："+request.getParameterValue("uname"));
		response.print("你的选择是：");

		String[] vs = request.getParameterValues("fav");
		for(String v:vs) {
			if(v.equals("0")) {
				response.print("萝莉型");
			}
			if(v.equals("1")) {
				response.print("豪放型");
			}
			if(v.equals("2")) {
				response.print("经济节约型");
			}
			
		}
		
		response.print("</body>");
		response.print("</html>");
	}

}
