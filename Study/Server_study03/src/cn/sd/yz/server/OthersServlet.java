package cn.sd.yz.server;

public class OthersServlet implements Servlet {

	@Override
	public void service(Request request, Response response) {
		response.print("色图给我康康");
	}

}
