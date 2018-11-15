package com.training;

import java.util.*;
import java.lang.*;

//题目：输入任意（用户，成绩）序列，可以获得成绩从高到低或从低到高的排列,相同成绩
//输入多行，先输入要排序的人的个数，然后输入排序方法0（降序）或者1（升序）再分别输入他们的名字和成绩，以一个空格隔开
//按照指定方式输出名字和成绩，名字和成绩之间以一个空格隔开
public class Search {



    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()){

            int usernum = sc.nextInt();
            int option = sc.nextInt();

            ArrayList<Student> list = new ArrayList<>();
            for (int i=1;i<=usernum;i++){

                list.add(new Student(sc.next(),sc.nextInt()));

            }
            if(option==0){
                Collections.sort(list, new Comparator<Student>() {
                    @Override
                    public int compare(Student o1, Student o2) {
                        return o2.scope-o1.scope;
                    }
                });

            }
            if(option==1){
                Collections.sort(list, new Comparator<Student>() {
                    @Override
                    public int compare(Student o1, Student o2) {
                        return o1.scope-o2.scope;
                    }
                });
            }
            for (int i = 0; i < list.size(); i++) {
               System.out.println(list.get(i).name+" "+list.get(i).scope);
}

        }



    }

}

 class Student {

    public String name;
    public int scope;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScope() {
        return scope;
    }

    public void setScope(int scope) {
        this.scope = scope;
    }

    public Student(String name, int scope) {
        this.name = name;
        this.scope = scope;
    }
}