package com.IO;

import java.io.*;
import java.util.Scanner;

public class Demo2_IO {
    public static void main(String[] args) throws IOException {
        //Demo1();
        //Demo2();
        //Demo3();
        //Demo4();
        //Demo5();
        //Demo6();
        //Demo7();
        //Demo8();
        //Demo9();
        Demo10();


    }

    private static void Demo10() throws IOException {
        //������¼������ݿ�������ǰ��Ŀ�µ�text.txt�ļ���,����¼�����ݵ�����quitʱ���˳�
        Scanner sc = new Scanner(System.in);
        FileOutputStream fos = new FileOutputStream("text.txt");
        System.out.println("������:");
        while(true) {
            String line = sc.nextLine();
            if("quit".equals(line))
                break;
            fos.write(line.getBytes());
            fos.write("\r\n".getBytes());
        }

        fos.close();
    }

    private static void Demo9() throws IOException {
        //�ڿ���̨¼���ļ���·��,���ļ���������ǰ��Ŀ��
        Scanner sc = new Scanner(System.in);
        System.out.println("������һ���ļ�·��");
        String line = sc.nextLine();				//������¼����ļ�·���洢��line��
        File file = new File(line);					//��װ��File����
        FileInputStream fis = new FileInputStream(file);
        FileOutputStream fos = new FileOutputStream(file.getName());

        int len;
        byte[] arr = new byte[8192];				//���建����
        while((len = fis.read(arr)) != -1) {
            fos.write(arr,0,len);
        }

        fis.close();
        fos.close();
    }

    private static void Demo8() throws IOException {
        //try finallyǶ��
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream("aaa.txt");
            fos = new FileOutputStream("bbb.txt");
            int b;
            while((b = fis.read()) != -1) {
                fos.write(b);
            }
        } finally {
            try {
                if(fis != null)
                    fis.close();
            }finally {
                if(fos != null)
                    fos.close();
            }
        }
    }

    private static void Demo7() throws IOException {
        /**
         * �ֽ�����ȡ���ĵ�����
         * 	* �ֽ����ڶ����ĵ�ʱ���п��ܻ�����������,�������
         * * �ֽ���д�����ĵ�����
         * 	* �ֽ���ֱ�Ӳ������ֽ�,����д�����ı��뽫�ַ���ת�����ֽ�����
         * 	* д���س����� write("\r\n".getBytes());
         */
        FileOutputStream fos = new FileOutputStream("zzz.txt");
        fos.write("���ǣ����Բ�д������û��Ҫ".getBytes());
    }

    private static void Demo6() throws IOException {
        /**
         * A:����˼��
         * 	* �ֽ���һ�ζ�дһ��������ٶ����Ա�һ�ζ�дһ���ֽڵ��ٶȿ�ܶ࣬
         * 	* ���Ǽ��������������Ļ�����Ч����java��������Ƶ�ʱ��
         * 	* Ҳ���ǵ������������˼��(װ�����ģʽ���潲��)�������ṩ���ֽڻ�������
         * * B.BufferedInputStream
         * 	* BufferedInputStream������һ��������(����)
         * 	* ��BufferedInputStream�ж�ȡһ���ֽ�ʱ
         * 	* BufferedInputStream��һ���Դ��ļ��ж�ȡ8192��, ���ڻ�������, ���ظ�����һ��
         * 	* �����ٴζ�ȡʱ, �Ͳ������ļ���, ֱ�Ӵӻ������л�ȡ
         * 	* ֱ�������������еĶ���ʹ�ù�, �����´��ļ��ж�ȡ8192��
         * * C.BufferedOutputStream
         * 	* BufferedOutputStreamҲ������һ��������(����)
         * 	* ����������д���ֽ�ʱ, ����ֱ��д���ļ�, ��д����������
         * 	* ֱ��������д��, BufferedOutputStream�Ż�ѻ������е�����һ����д���ļ���
         */
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("jspС��.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("�½�jspС��.txt"));

        int b;
        while((b=bis.read())!=-1){
            bos.write(b);
        }
        bis.close();
        bos.close();
    }

    private static void Demo5() throws IOException {
        FileInputStream fis = new FileInputStream("jspС��.txt");	//��������������
        FileOutputStream fos = new FileOutputStream("�½�jspС��.txt");//�������������
        int len;
        byte[] arr = new byte[1024 * 8];					//�Զ����ֽ�����
        while((len = fis.read(arr)) != -1) {
            //fos.write(arr);
            fos.write(arr, 0, len);							//д���ֽ�����д����Ч���ֽڸ���
        }
        fis.close();
        fos.close();
    }

    //���Ƽ�ʹ��Ч��̫��
    private static void Demo4() throws IOException {
        FileInputStream fis = new FileInputStream("jspС��.txt");	//��������������
        FileOutputStream fos = new FileOutputStream("�½�jspС��.txt");//�������������
        int b;
        while((b = fis.read()) != -1) {
            fos.write(b);
        }
        fis.close();
        fos.close();
    }

    private static void Demo3() throws IOException {
        FileOutputStream fos = new FileOutputStream("yyy.txt",true);	//���û��bbb.txt,�ᴴ����һ��
        //fos.write(97);						//��Ȼд������һ��int��,������д����ʱ��Ὣǰ���24��0ȥ��,����д����һ��byte
        fos.write(98);
        fos.write(99);
        fos.close();
    }

    private static void Demo2() throws IOException {
        //���û��yyy.txt,�ᴴ����һ��
        FileOutputStream fos = new FileOutputStream("yyy.txt");
        //��Ȼд������һ��int��,������д����ʱ��Ὣǰ���24��0ȥ��,����д������һ��byte
        fos.write(97);
        fos.write(98);
        fos.write(99);
        fos.close();
    }

    /**
     * IO��(read()��������ֵΪʲô��int)
     * * read()������ȡ����һ���ֽ�,Ϊʲô������int,������byte
     * *
     * 		��Ϊ�ֽ����������Բ����������͵��ļ�,����ͼƬ��Ƶ��,��Щ�ļ��ײ㶼���Զ�������ʽ�Ĵ洢��,
     * 		���ÿ�ζ�ȡ������byte,�п����ڶ����м��ʱ������111111111
     * 		��ô��11111111��byte���͵�-1,���ǵĳ���������-1�ͻ�ֹͣ������,��������ݾͶ�������,
     * 		�����ڶ�ȡ��ʱ����int���ͽ���,���11111111������ǰ�油��
     * 		24��0����4���ֽ�,��ôbyte���͵�-1�ͱ��int���͵�255���������Ա�֤�������ݶ���,
     * 		��������ǵ�-1����int����
     * @throws IOException
     */
    private static void Demo1() throws IOException {
        FileInputStream fis = new FileInputStream("aaa.txt");	//����һ���ļ�����������,������aaa.txt
        int b;													//�������,��¼ÿ�ζ������ֽ�
        while((b = fis.read()) != -1) {							//��ÿ�ζ������ֽڸ�ֵ��b���ж��Ƿ���-1
            System.out.println(b);								//��ӡÿһ���ֽ�
        }
        fis.close();											//�ر����ͷ���Դ
    }
}
