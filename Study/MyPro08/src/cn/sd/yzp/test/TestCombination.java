package cn.sd.yzp.test;

/**
 * 测试对象的组合
 * @author Yin
 *
 */
public class TestCombination {
	public static void main(String[] args) {
		Computer computer = new Computer();
		computer.cpu=new Cpu();
		computer.memory=new Memory();
		computer.mainBorad=new MainBorad();
		computer.work();
	}
}


class Cpu{
	public void run() {
		System.out.println("quickly....");
	}
}

class MainBorad{
	public void connect() {
		System.out.println("connect....");
	}
}

class Memory{
	public void store() {
		System.out.println("store....");
	}
}

class Computer{
	Cpu cpu;
	Memory memory;
	MainBorad mainBorad;
	
	public void work() {
		cpu.run();
		memory.store();
		mainBorad.connect();
	}
}