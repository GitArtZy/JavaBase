package com.JavaTest;

class SaleTicket2 implements Runnable{
	
	static int num=50;
	
	
	@Override
	public void run() {
		while(true){
			
			synchronized ("��") {				
				if(num>0){
					System.out.println(Thread.currentThread().getName()+"�۳��˵�"+num+"��Ʊ");
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					num--;
				}else{
					System.out.println("������..");
					break;
				}
			}
			
		}
	}
}

public class SaleTicketTest2 {
	public static void main(String[] args) {
		SaleTicket2 saleTicket2= new SaleTicket2();
		
		Thread thread1= new Thread(saleTicket2,"��һ�Ŵ���");
		Thread thread2= new Thread(saleTicket2,"�ڶ��Ŵ���");
		Thread thread3= new Thread(saleTicket2,"�����Ŵ���");
		thread1.start();
		thread2.start();
		thread3.start();
	}
	

}
