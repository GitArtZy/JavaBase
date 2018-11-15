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
        //将键盘录入的数据拷贝到当前项目下的text.txt文件中,键盘录入数据当遇到quit时就退出
        Scanner sc = new Scanner(System.in);
        FileOutputStream fos = new FileOutputStream("text.txt");
        System.out.println("请输入:");
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
        //在控制台录入文件的路径,将文件拷贝到当前项目下
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个文件路径");
        String line = sc.nextLine();				//将键盘录入的文件路径存储在line中
        File file = new File(line);					//封装成File对象
        FileInputStream fis = new FileInputStream(file);
        FileOutputStream fos = new FileOutputStream(file.getName());

        int len;
        byte[] arr = new byte[8192];				//定义缓冲区
        while((len = fis.read(arr)) != -1) {
            fos.write(arr,0,len);
        }

        fis.close();
        fos.close();
    }

    private static void Demo8() throws IOException {
        //try finally嵌套
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
         * 字节流读取中文的问题
         * 	* 字节流在读中文的时候有可能会读到半个中文,造成乱码
         * * 字节流写出中文的问题
         * 	* 字节流直接操作的字节,所以写出中文必须将字符串转换成字节数组
         * 	* 写出回车换行 write("\r\n".getBytes());
         */
        FileOutputStream fos = new FileOutputStream("zzz.txt");
        fos.write("不是，可以不写，但是没必要".getBytes());
    }

    private static void Demo6() throws IOException {
        /**
         * A:缓冲思想
         * 	* 字节流一次读写一个数组的速度明显比一次读写一个字节的速度快很多，
         * 	* 这是加入了数组这样的缓冲区效果，java本身在设计的时候，
         * 	* 也考虑到了这样的设计思想(装饰设计模式后面讲解)，所以提供了字节缓冲区流
         * * B.BufferedInputStream
         * 	* BufferedInputStream内置了一个缓冲区(数组)
         * 	* 从BufferedInputStream中读取一个字节时
         * 	* BufferedInputStream会一次性从文件中读取8192个, 存在缓冲区中, 返回给程序一个
         * 	* 程序再次读取时, 就不用找文件了, 直接从缓冲区中获取
         * 	* 直到缓冲区中所有的都被使用过, 才重新从文件中读取8192个
         * * C.BufferedOutputStream
         * 	* BufferedOutputStream也内置了一个缓冲区(数组)
         * 	* 程序向流中写出字节时, 不会直接写到文件, 先写到缓冲区中
         * 	* 直到缓冲区写满, BufferedOutputStream才会把缓冲区中的数据一次性写到文件里
         */
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("jsp小结.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("新建jsp小结.txt"));

        int b;
        while((b=bis.read())!=-1){
            bos.write(b);
        }
        bis.close();
        bos.close();
    }

    private static void Demo5() throws IOException {
        FileInputStream fis = new FileInputStream("jsp小结.txt");	//创建输入流对象
        FileOutputStream fos = new FileOutputStream("新建jsp小结.txt");//创建输出流对象
        int len;
        byte[] arr = new byte[1024 * 8];					//自定义字节数组
        while((len = fis.read(arr)) != -1) {
            //fos.write(arr);
            fos.write(arr, 0, len);							//写出字节数组写出有效个字节个数
        }
        fis.close();
        fos.close();
    }

    //不推荐使用效率太低
    private static void Demo4() throws IOException {
        FileInputStream fis = new FileInputStream("jsp小结.txt");	//创建输入流对象
        FileOutputStream fos = new FileOutputStream("新建jsp小结.txt");//创建输出流对象
        int b;
        while((b = fis.read()) != -1) {
            fos.write(b);
        }
        fis.close();
        fos.close();
    }

    private static void Demo3() throws IOException {
        FileOutputStream fos = new FileOutputStream("yyy.txt",true);	//如果没有bbb.txt,会创建出一个
        //fos.write(97);						//虽然写出的是一个int数,但是在写出的时候会将前面的24个0去掉,所以写出的一个byte
        fos.write(98);
        fos.write(99);
        fos.close();
    }

    private static void Demo2() throws IOException {
        //如果没有yyy.txt,会创建出一个
        FileOutputStream fos = new FileOutputStream("yyy.txt");
        //虽然写出的是一个int数,但是在写出的时候会将前面的24个0去掉,所以写出的是一个byte
        fos.write(97);
        fos.write(98);
        fos.write(99);
        fos.close();
    }

    /**
     * IO流(read()方法返回值为什么是int)
     * * read()方法读取的是一个字节,为什么返回是int,而不是byte
     * *
     * 		因为字节输入流可以操作任意类型的文件,比如图片音频等,这些文件底层都是以二进制形式的存储的,
     * 		如果每次读取都返回byte,有可能在读到中间的时候遇到111111111
     * 		那么这11111111是byte类型的-1,我们的程序是遇到-1就会停止不读了,后面的数据就读不到了,
     * 		所以在读取的时候用int类型接收,如果11111111会在其前面补上
     * 		24个0凑足4个字节,那么byte类型的-1就变成int类型的255了这样可以保证整个数据读完,
     * 		而结束标记的-1就是int类型
     * @throws IOException
     */
    private static void Demo1() throws IOException {
        FileInputStream fis = new FileInputStream("aaa.txt");	//创建一个文件输入流对象,并关联aaa.txt
        int b;													//定义变量,记录每次读到的字节
        while((b = fis.read()) != -1) {							//将每次读到的字节赋值给b并判断是否是-1
            System.out.println(b);								//打印每一个字节
        }
        fis.close();											//关闭流释放资源
    }
}
