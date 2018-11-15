package com.Designpattern;

public class ProxyDemo extends AbstractObject{
    @Override
    public void option() {
        System.out.println("ÒµÎñÂß¼­");
    }
}
abstract class AbstractObject{

    public abstract void option();

}
class ProxyObject extends AbstractObject{

    ProxyDemo p = new ProxyDemo();
    @Override
    public void option() {
        System.out.println("before");
        p.option();
        System.out.println("after");
    }
}
class Client{
    public static void main(String[] args) {
        ProxyObject po = new ProxyObject();
        po.option();
    }
}
