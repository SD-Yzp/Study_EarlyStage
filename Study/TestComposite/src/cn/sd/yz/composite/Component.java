package cn.sd.yz.composite;

/**
 * 抽象组件
 * 把部分和整体的关系用到树形结构中来表示，从而使客户端可以使用统一的方式处理部分对象和整体对象
 * @author Yin
 *
 */
public interface Component {
	void operation();
}

//叶子组件
interface Leaf extends Component {
}

//容器组件
interface Composite extends Component {
	void add(Component c);
	void remove(Component c);
	Component getChild(int index);
}