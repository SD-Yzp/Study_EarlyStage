package cn.yz.sd.mediator;

/**
 * 部门
 * @author Yin
 *
 */
public interface Department {
	void selfAction();  //自己的工作
	void outAction();   //需要和外部交流的工作
}
