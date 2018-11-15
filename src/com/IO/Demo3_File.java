package com.IO;


import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo3_File {
    private static String path= "D:\\Ѹ������\\�½��ļ���";
    private static String path1="E:\\�½��ļ���";
    private static String path2="D:\\Ѹ������\\�½��ļ���\\�½��ı��ĵ�.txt";
    public static void main(String[] args) {
//        List<String> filelist = new ArrayList<>();
//        List<String> fileList = getFileList(path1,filelist);
//        for (String str:fileList
//            ) {
//            if(!str.endsWith("torrent")&&!str.endsWith("jpg")){
//                System.out.println(str);
//            }
//       }
        List<String> strings = readFileList(path2);
        Collections.sort(strings);
        for (String s:strings
             ) {
            System.out.println(s);
        }

    }
    public static List<String> getFileList(String strPath,List<String> filelist) {
        File dir = new File(strPath);
        File[] files = dir.listFiles(); // ���ļ�Ŀ¼���ļ�ȫ����������
        if (files != null) {
            for (int i = 0; i < files.length; i++) {
                String fileName = files[i].getName();
                if (files[i].isDirectory()) { // �ж����ļ������ļ���
                    getFileList(files[i].getAbsolutePath(),filelist); // ��ȡ�ļ�����·��
                } else if (fileName.contains(".")) { // �ж��ļ����Ƿ���.��β
                    String strFileName = files[i].getName();
                    //System.out.println(strFileName);
                    filelist.add(strFileName);
                } else {
                    continue;
                }
            }
        }
        return filelist;
    }

    public static List<String> readFileList(String strPath){

        File file = new File(strPath);
        BufferedReader br = null;
        List<String> list = new ArrayList<>();
        try {
                 String b;
                 br = new BufferedReader(new FileReader(file));
                 while((b=br.readLine())!=null){
                     list.add(b);
                     System.out.println(b);
                 }


        }catch (IOException e){
                 e.printStackTrace();
        }finally {

        }
        return list;
    }
}
