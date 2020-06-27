package cn.sd.yz.user;

import cn.sd.yz.server.core.Request;
import cn.sd.yz.server.core.Response;
import cn.sd.yz.server.core.Servlet;

public class LoginServlet implements Servlet{

	public void service(Request request, Response response) {
		//关注了内容
		response.print("<html>");
		response.print("<head>");
		response.print("<meta http-equiv=\"content-type\" content=\"text/html;charset=utf-8\">");
		response.print("<title>");
		response.print("第一个servlet");
		response.print("</title>");
		response.print("</head>");
		response.print("<body>");
		response.print("欢迎回来："+request.getParameterValue("uname"));
		response.print("</body>");
		response.print("</html>");
	}
}
