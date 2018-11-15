package com.Designpattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理
 */
public class ProxyDemo2 {

    public static void main(String[] args) {
        UserImpl ui = new UserImpl();
        ui.add();
        ui.delete();
        System.out.println("------动态代理------");
        ProxyUser pu = new ProxyUser(ui);
        User user = (User) Proxy.newProxyInstance(ui.getClass().getClassLoader(), ui.getClass().getInterfaces(), pu);
        user.add();
        user.delete();
    }


}
interface User{
    public void add();
    public void delete();
}
class UserImpl implements User{

    @Override
    public void add() {
        //System.out.println("权限校验");
        System.out.println("添加功能");
        //System.out.println("日志记录");
    }

    @Override
    public void delete() {
        //System.out.println("权限校验");
        System.out.println("删除功能");
        //System.out.println("日志记录");
    }
}
class ProxyUser implements InvocationHandler {

    private Object target;

    public ProxyUser(Object target){

        this.target=target;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("权限校验");
        Object result = method.invoke(target, args);//执行被代理target对象的方法
        System.out.println("日志记录");
        return result;
    }
}

