package AbstractTest;

/**
 * @Description TODO
 * @Author Yin
 * @Date 2020/6/10 11:07
 * @Version 1.0
 **/
public abstract class Person {
    public char sex = 'm';
}
class A extends Person{
    public char sex = 's';
    public char name = 'f';

    public char getName() {
        return name;
    }
}
