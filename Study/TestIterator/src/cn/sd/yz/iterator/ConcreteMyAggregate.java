package cn.sd.yz.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 自定义的聚合类
 * @author Yin
 *
 */
public class ConcreteMyAggregate {
	private List<Object> list = new ArrayList<Object>();
	
	public void addObject(Object obj) {
		list.add(obj);
	}
	
	public void removeObject(Object obj) {
		list.remove(obj);
	}
	
	public List<Object> getList() {
		return list;
	}



	public void setList(List<Object> list) {
		this.list = list;
	}
	
	public MyIterator createIterator() {
		return new ConcreteIterator();
	}

	private class ConcreteIterator implements MyIterator{
		private int cursor;  //定义游标用于记录遍历时的位置
		@Override
		public void first() {
			cursor=0;
		}

		@Override
		public void next() {
			cursor++;
		}

		@Override
		public boolean hasNext() {
			if(cursor<list.size()) {
				return true;
			}
			return false;
		}

		@Override
		public boolean isFirst() {
			if(cursor==0) {
				return true;
			}
			return false;
		}

		@Override
		public boolean isLast() {
			if(cursor==list.size()-1) {
				return true;
			}
			return false;
		}

		@Override
		public Object getCurrentObject() {
			return list.get(cursor);
		}
		
	}
}
