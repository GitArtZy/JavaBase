package com.test;

public class Test3 {
    /**
     * �����ӦΪ��B��C��D
     * ------------֪ʶ��------------
     * Java���ʽת�͹����ɵ͵���ת����
     * 1�����е�byte,short,char�͵�ֵ��������Ϊint�ͣ�
     * 2�������һ����������long�ͣ���������long�ͣ�
     *
     * 3�������һ����������float�ͣ���������float�ͣ�
     *
     * 4�������һ����������double�ͣ���������double�ͣ�
     * 5����fianl���εı��������Զ��ı����ͣ���2��final���������ʱ������������߱��������Ͷ�ת����
     * --------------����--------------
     * ���1����b3=(b1+b2);�Զ�תΪint��������ȷд��Ϊb3=(byte)(b1+b2);���߽�b3����Ϊint��
     * ���2��ȷ��b6=b4+b5;b4��b5Ϊfinal���ͣ������Զ����������Ժ͵���������߱������Ͷ�������b6������������ֵ���ͣ�
     * ���3����b8=(b1+b4);��Ȼb4�����Զ���������b1�Ի��Զ����������Խ����Ҫǿת��b8=(byte)(b1+b4);
     * ���4����b7=(b2+b5); ͬ�ϡ�ͬʱע��b7��final���Σ���ֻ�ɸ�ֵһ�Σ��㲻���ٸı䡣
     * @param args
     */
    public static void main(String[] args) {
//        byte b1=1,b2=2,b3,b6,b8;
//        final byte b4=4,b5=6,b7;
//        b3=(b1+b2);  /*���1*/
//        b6=b4+b5;    /*���2*/
//        b8=(b1+b4);  /*���3*/
//        b7=(b2+b5);  /*���4*/
//        System.out.println(b3+b6);

        Integer var1=new Integer(1);
        Integer var2=var1;
        doSomething(var2);
        System.out.print(var1.intValue());
        System.out.print(var1==var2);
    }
    public static void doSomething(Integer integer){
        integer=new Integer(2);
    }

}
