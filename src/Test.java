interface I{
    void m1();
}
class A {
    public void m2(){
        System.out.println("m2-A");
    }
}
public class Test {
    public static void main(String[] args){
        A a = new A();
        I i = a :: m2;
        i.m1();

    }
}
