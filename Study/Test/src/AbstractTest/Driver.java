package AbstractTest;

/**
 * @Description TODO
 * @Author Yin
 * @Date 2020/6/10 11:09
 * @Version 1.0
 **/
public class Driver {
    String v = "g";
    public void drive(Person p){
        if(p instanceof A){
            System.out.println(((A)p).sex+v);
        }
    }

    public static void main(String[] args) {
        A a = new A();
        Driver driver = new Driver();
        driver.drive(a);
    }
}
