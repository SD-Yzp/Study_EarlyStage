package cn.sd.yz.processflow;

/**
 * 咖啡
 * 1、抽象组件：需要装饰的抽象组件（接口或者抽象父类）
 * 2、具体组件：需要装饰的对象
 * 3、抽象装饰类：包含了对抽象组件的引用及装饰共有的方法
 * 4、具体装饰类：被装饰的对象
 * @author Yin
 *
 */
public class Test03 {
	public static void main(String[] args) {
		Coffee coffee = new Coffee();
		System.out.println(coffee.info()+"--->价格为："+coffee.cost());
		Drink sugar = new Sugar(coffee);
		System.out.println(sugar.info()+"--->价格为："+sugar.cost());
		Drink milk = new Milk(coffee);
		System.out.println(milk.info()+"--->价格为："+milk.cost());
		Drink milk_sugar = new Milk(sugar);
		System.out.println(milk_sugar.info()+"--->价格为："+milk_sugar.cost());
	}	
}


interface Drink{
	double cost(); //费用
	String info(); //说明
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
		return "一杯咖啡";
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
		return super.info()+"加了糖";
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
		return super.info()+"加了牛奶";
	}
	
	
}

