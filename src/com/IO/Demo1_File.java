package com.IO;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

public class Demo1_File {

    public static void main(String[] args) throws IOException {
        //Demo1();
        //Demo2();
        //Demo3();
        //Demo4();
        //Demo5();
        //Demo6();
        //Demo7();
        //�ж�D��Ŀ¼���Ƿ��к�׺��Ϊ.txt���ļ�������У���������ļ�����
        File file  = new File("D:\\zy\\����\\java\\java�ܽ�\\JAVA�ܽ�_2");
        System.out.println("----��ȡD���ļ����µ��ļ����ļ���---");
        String[] list = file.list();
        for (String str:list
             ) {
            if(str.contains(".txt")){
                System.out.println(str);
            }
        }
        System.out.println("----��ȡD���ļ����µ��ļ����ļ��ж���---");
        File[] files = file.listFiles();
        for (File f:files
             ) {
            if(f.isFile()&&f.getName().contains(".txt")){
                System.out.println(f);
            }
        }
        System.out.println("--�ļ����ƹ�������ʹ��---");
        String[] strlist = file.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                File f = new File(dir,name);
                return f.isFile()&&f.getName().contains(".txt");
            }
        });
        for (String str:strlist
             ) {
            System.out.println(str);
        }


    }

    private static void Demo7() {
        File file3  = new File("D:\\zy\\����\\java\\java�ܽ�\\JAVA�ܽ�_2");
        System.out.println("----��ȡָ��Ŀ¼�µ������ļ������ļ��е���������-----");
        String[] list = file3.list();
        for (String str:list
             ) {
            System.out.println(str);
        }
        System.out.println("-------��ȡָ��Ŀ¼�µ������ļ������ļ��е�File����-----");
        File[] files = file3.listFiles();
        for (File f:files
             ) {
            System.out.println(f);
        }
    }

    private static void Demo6() {
        File file1  = new File("xxx.txt");
        File file2  = new File("C:\\Users\\SkyRe\\Desktop\\����.txt");

        System.out.println("��ȡ����·��");
        System.out.println(file1.getAbsolutePath());
        System.out.println(file2.getAbsolutePath());
        System.out.println("��ȡ�����·��");
        System.out.println(file1.getPath());
        System.out.println(file2.getPath());
    }

    private static void Demo5() {
        //���ɾ��һ���ļ��У��ļ��б����ǿյģ�
        File dir1  = new File("aaa");
        System.out.println(dir1.delete());
    }

    private static void Demo4() throws IOException {
        File file  = new File("xxx.txt");
        System.out.println(file.createNewFile());
        File dir1  = new File("aaa");
        System.out.println(dir1.mkdir());
        File dir2  = new File("aaa\\ccc");
        System.out.println(dir2.mkdirs());
    }

    private static void Demo3() {
        File parent = new File("C:\\Users\\SkyRe\\Desktop");
        String child = "����.txt";
        File file = new File(parent,child);
        System.out.println(file.exists());
    }

    private static void Demo2() {
        String parent = "C:\\Users\\SkyRe\\Desktop";
        String child = "����.txt";
        File file = new File(parent,child);
        System.out.println(file.exists());
    }

    private static void Demo1() {
        File file  = new File("C:\\Users\\SkyRe\\Desktop\\����.txt");
        System.out.println(file.exists());
    }

}
