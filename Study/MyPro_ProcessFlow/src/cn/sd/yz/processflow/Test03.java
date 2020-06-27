package cn.sd.yz.processflow;

/**
 * ����
 * 1�������������Ҫװ�εĳ���������ӿڻ��߳����ࣩ
 * 2�������������Ҫװ�εĶ���
 * 3������װ���ࣺ�����˶Գ�����������ü�װ�ι��еķ���
 * 4������װ���ࣺ��װ�εĶ���
 * @author Yin
 *
 */
public class Test03 {
	public static void main(String[] args) {
		Coffee coffee = new Coffee();
		System.out.println(coffee.info()+"--->�۸�Ϊ��"+coffee.cost());
		Drink sugar = new Sugar(coffee);
		System.out.println(sugar.info()+"--->�۸�Ϊ��"+sugar.cost());
		Drink milk = new Milk(coffee);
		System.out.println(milk.info()+"--->�۸�Ϊ��"+milk.cost());
		Drink milk_sugar = new Milk(sugar);
		System.out.println(milk_sugar.info()+"--->�۸�Ϊ��"+milk_sugar.cost());
	}	
}


interface Drink{
	double cost(); //����
	String info(); //˵��
}

class Coffee implements Drink{
	
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 10;
	}

	@Override
	public String info() {
		// TODO Auto-generated method stub
		return "һ������";
	}	
}


abstract class Decorate implements Drink{
	private Drink drink;
	public Decorate(Drink drink) {
		this.drink = drink;
	}
	
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return this.drink.cost();
	}

	@Override
	public String info() {
		// TODO Auto-generated method stub
		return this.drink.info();
	}	
}


class Sugar extends Decorate{

	public Sugar(Drink drink) {
		super(drink);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return super.cost()*2;
	}

	@Override
	public String info() {
		// TODO Auto-generated method stub
		return super.info()+"������";
	}	
}


class Milk extends Decorate{

	public Milk(Drink drink) {
		super(drink);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return super.cost()*4;
	}

	@Override
	public String info() {
		// TODO Auto-generated method stub
		return super.info()+"����ţ��";
	}
	
	
}

