package commonClass;

/**
 *@title: 常用类笔记-Character类
 *@description: Character类位于java.lang包
 */

public class javaLangCharacter {
    public static void main(String[] args) {
        javaLangCharacter.classTest();
    }
    static void classTest(){
        Character mychar=new Character('a');
        /*构造方法*/

        System.out.println(Character.MAX_VALUE);
        System.out.println(Character.MIN_RADIX);
        System.out.println(Character.TYPE);
        System.out.println(Character.MATH_SYMBOL);
        System.out.println("--------------------------");
        /**
         * Character类的常量较多，具体啥意思，也不明白
         */

        char c1=Character.toUpperCase('a');
        char c2=Character.toLowerCase(c1);
        boolean b1=Character.isUpperCase('A');
        boolean b2=Character.isLowerCase('A');
        System.out.printf(c1+"%n"+c2+"%n"+b1+"%n"+b2+"%n");
        /**
         * 大小写转写的类方法，还有大小写判断的类方法
         * 其他方法和其他的包装类相似，这里没写
         */

    }
}