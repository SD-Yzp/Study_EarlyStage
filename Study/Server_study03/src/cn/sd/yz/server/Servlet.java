package cn.sd.yz.server;

/**
 * 服务器小脚本接口
 * @author Yin
 *
 */
public interface Servlet {
	void service(Request request, Response response);
//	void doGet(Request request, Response response);
//	void doPost(Request request, Response response);
}
