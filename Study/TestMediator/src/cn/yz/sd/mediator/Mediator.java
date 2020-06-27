package cn.yz.sd.mediator;

/**
 * 中介者
 * 负责各部门之间的交流
 * @author Yin
 *
 */
public interface Mediator {
	void register(String dname, Department d);
	void commond(String dname);
}
