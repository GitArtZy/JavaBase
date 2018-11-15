package com.recursion;

import java.io.File;

//列出某个目录下所有的子目录和文件
/*  
 * time:2012.12.2  
 * author:王金宇
 * description：列出某个目录下所有的子目录和文件
 */  
public class ListDir {
    static void getDir(String strPath) throws Exception {  
        try {
            File f = new File(strPath);  
            if (f.isDirectory()) {  
                File[] fList = f.listFiles();  
                for (int j = 0; j < fList.length; j++) {  
                    if (fList[j].isDirectory()) {  
                        System.out.println(fList[j].getPath());  
                        getDir(fList[j].getPath()); // 在getDir函数里面又调用了getDir函数本身  
                    }  
                }  
                for (int j = 0; j < fList.length; j++) {  
            
                    if (fList[j].isFile()) {  
                        System.out.println(fList[j].getPath());  
                    }  
                }  
            }  
        } catch (Exception e) {  
            System.out.println("Error： " + e);  
        }  
  
    }  
    public static void main(String[] args) {  
        String strPath = "E:";  
        System.out.println(strPath);  
        try {  
            getDir(strPath);  
        } catch (Exception e) {  
        }  
    }  
} 
