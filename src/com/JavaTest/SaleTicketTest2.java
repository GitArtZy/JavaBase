package com.JavaTest;

class SaleTicket2 implements Runnable{
	
	static int num=50;
	
	
	@Override
	public void run() {
		while(true){
			
			synchronized ("锁") {				
				if(num>0){
					System.out.println(Thread.currentThread().getName()+"售出了第"+num+"号票");
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					num--;
				}else{
					System.out.println("售罄了..");
					break;
				}
			}
			
		}
	}
}

public class SaleTicketTest2 {
	public static void main(String[] args) {
		SaleTicket2 saleTicket2= new SaleTicket2();
		
		Thread thread1= new Thread(saleTicket2,"第一号窗口");
		Thread thread2= new Thread(saleTicket2,"第二号窗口");
		Thread thread3= new Thread(saleTicket2,"第三号窗口");
		thread1.start();
		thread2.start();
		thread3.start();
	}
	

}
