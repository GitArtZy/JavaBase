package com.Designpattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * ��̬����
 */
public class ProxyDemo2 {

    public static void main(String[] args) {
        UserImpl ui = new UserImpl();
        ui.add();
        ui.delete();
        System.out.println("------��̬����------");
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
        //System.out.println("Ȩ��У��");
        System.out.println("��ӹ���");
        //System.out.println("��־��¼");
    }

    @Override
    public void delete() {
        //System.out.println("Ȩ��У��");
        System.out.println("ɾ������");
        //System.out.println("��־��¼");
    }
}
class ProxyUser implements InvocationHandler {

    private Object target;

    public ProxyUser(Object target){

        this.target=target;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Ȩ��У��");
        Object result = method.invoke(target, args);//ִ�б�����target����ķ���
        System.out.println("��־��¼");
        return result;
    }
}

