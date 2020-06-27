package cn.sd.yz.user;

import cn.sd.yz.server.core.Request;
import cn.sd.yz.server.core.Response;
import cn.sd.yz.server.core.Servlet;

public class OthersServlet implements Servlet {

	@Override
	public void service(Request request, Response response) {		
		response.print("色图给我康康");
	}

}
