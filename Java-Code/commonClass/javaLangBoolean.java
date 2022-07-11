package commonClass;

/**
 *@title: 常用类笔记-Boolean类
 *@description: Boolean类位于java.lang包，它把基本数据类型boolean包装在一个对象里
 */

public class javaLangBoolean {
    public static void main(String[] args) {
        javaLangBoolean.classTest();
    }
    static void classTest(){
        Boolean b1=new Boolean(true);
        Boolean b2=new Boolean("true");
        System.out.println(b1);
        System.out.println(b2);
        /**
         * 2个构造方法
         */

        System.out.println("-------------------------");
        boolean b3=b1.booleanValue();
        boolean b4=b1.equals(false);
        String s1=b2.toString();
        System.out.printf(b1+"%n"+b4+"%n"+s1+"%n");
        /**
         * 成员方法
         */

        System.out.println("-------------------------");
        boolean b5=Boolean.parseBoolean("true");
        boolean b6=Boolean.valueOf("true");
        String s2=Boolean.toString(true);
        System.out.printf(b5+"%n"+b6+"%n"+s2+"%n");
        /**
         * 类方法
         * parseBoolean()方法和 valueOf()方法都可以把字符串转成 boolean型
         */

        System.out.println("-------------------------");
        System.out.printf(Boolean.TRUE+"%n"+Boolean.FALSE+"%n"+Boolean.TYPE+"%n");
        /*Boolean类的三个常量*/
    }
}