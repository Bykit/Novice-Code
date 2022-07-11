package commonClass;

import java.util.Random;

/**
 *@title: 常用类笔记-Random类
 *@description: Random类位于java.util包，用于产生随机数，比 Math类的随机数方法更灵活
 */

public class javaUtilRandom {
    public static void main(String[] args) {
        javaUtilRandom.ClassTest();
    }
    static void ClassTest(){
        Random rd=new Random();
        System.out.println("产生十个int类型随机数");
        for (int i = 0; i < 10; i++) {
            System.out.println(rd.nextInt());
        }
        /**
         * nextInt()用于产生随机数，不是静态方法，使用需要创建对象
         */

        System.out.println("---------------------------------------");
        System.out.println("产生十个boolean类型随机数");
        for (int i = 0; i < 10; i++) {
            System.out.println(rd.nextBoolean());
        }

        System.out.println("---------------------------------------");
        System.out.println("产生十个指定范围的随机数");
        for (int i = 0; i < 10; i++) {
            System.out.println(rd.nextInt(100));
        }
        /**
         * nextInt()重载，一个参数表示产生 （零到指定参数范围） 的随机数
         */

    }
}