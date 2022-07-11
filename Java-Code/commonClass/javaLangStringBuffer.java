package commonClass;

/**
 *@title: 常用类笔记-StringBuffer类
 *@description: StringBuffer类位于java.lang包，和 String类一样，用来代表字符串，但内部的实现方式不同，方法也不同
 */

public class javaLangStringBuffer {
    public static void main(String[] args) {
        javaLangStringBuffer.classTest();
    }
    static void classTest(){
        StringBuffer str1=new StringBuffer();/*默认容量为16个字符*/
        StringBuffer str2=new StringBuffer(10);/*该对象的初始容量*/
        StringBuffer str3=new StringBuffer("hello world!");/*赋值*/
        System.out.println(str3);
        System.out.println(str3.length());
        /*StringBuffer类有3个构造方法*/

        //str1="ewq";
        /*上面的赋值代码报错*/

        System.out.println(str3.append(12));
        str1.append("ABCDEFG");
        str2.append("不想上课");
        str3.append(123);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        /**
         * append()方法是在原字符串上追加，并不是重新赋值
         */

        System.out.println(str1.charAt(3));
        str1.setCharAt(3,'2');
        System.out.println(str1);
        str1.deleteCharAt(3);
        System.out.println(str1);
        str1.insert(3,'d');
        System.out.println(str1);
        str1.reverse();
        System.out.println(str1);
        str1.replace(3,4,"D");
        System.out.println(str1);
        /**
         * setCharAt()替换字符
         * deleteCharAt()删除字符
         * insert()插入字符串
         * reverse()翻转字符串
         * replace()替换字符串
         * ...
         */

        //String strr=str1;
        /*报错，不同类型不能直接强制转换*/

        String strr=str1.toString();
        System.out.println(strr);
        StringBuffer str4=new StringBuffer(strr);
        System.out.println(str4);
        /**
         * String类和StringBuffer的互相转换
         */

    }
}