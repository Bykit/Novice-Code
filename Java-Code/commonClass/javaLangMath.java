package commonClass;

/**
 *@title: 常用类笔记-Math类
 *@description: Math类位于java.lang包，包含许多用来科学计算的类方法(静态方法)
 */

public class javaLangMath {
    public static void main(String[] args) {
        javaLangMath.ClassTest();

    }

    static void ClassTest(){
        System.out.println(Math.E);
        System.out.println(Math.PI);
        /**
         * Math类有两个静态的常量，E、PI
         * 分别为自然常数e,圆周率 π
         */

        System.out.printf(
                "返回参数a的绝对值："+Math.abs(-2323)+"%n"+
                "返回参数a、b的最大值："+Math.max(10,100)+"%n"+
                "返回参数a、b的最小值："+Math.min(10,100)+"%n"+
                "返回参数a的b次幂："+Math.pow(10,3)+"%n"+
                "返回参数a的平方根："+Math.sqrt(100)+"%n"+
                "返回参数a的对数："+Math.log(100)+"%n"+
                "返回参数a、b的最大值："+Math.max(10,100)+"%n"+
                "返回参数a的正弦值："+Math.sin(10)+"%n"+
                "产生一个0到1的随机数（不包括0和1）："+Math.random()+"%n"
        );
        /**
         * 上面打印的为常用方法
         */

    }
}