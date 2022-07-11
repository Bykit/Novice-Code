package commonClass;

/**
 *@title: 常用类笔记-Byte类
 *@description: Byte类位于java.lang包
 */

public class javaLangByte {
    public static void main(String[] args) {
        javaLangByte.classTest();
    }
    static void classTest(){
        //Byte b=new Byte(15);
        /*报错，int型没转byte型*/
        byte myb=15;
        Byte b1=new Byte(myb);
        Byte b2=new Byte("12");
        Byte b3;
        /**
         * 两个构造方法
         */

        byte b4=b1.byteValue();
        int b5=b1.compareTo(b2);
        double b6=b1.doubleValue();
        int b7=b1.intValue();
        boolean b11=b1.equals(b2);
        String b9=b1.toString();
        /**
         * 常用成员方法
         */

        byte b8=Byte.parseByte("55");
        byte b12=Byte.valueOf("122");
        String b10=Byte.toString(b1);
        /**
         * 常用类方法
         */

        System.out.println("byte类型的最大值为："+Byte.MAX_VALUE);
        System.out.println("byte类型的最小值为："+Byte.MIN_VALUE);
        System.out.println("byte类型的二进制位数："+Byte.SIZE);
        System.out.println(Byte.TYPE);
        /**
         * Byte类的常量
         */

    }
}