package commonClass;

/**
 *@title: 常用类笔记-Integer类
 *@description:
 * Integer类位于java.lang包，是封装基本数据类型 int的类，int为 Integer类的一个实例对象
 * Long类,Short类和 Integer类基本相同，所以只写Integer类的笔记
 */

public class javaLangInteger {
    public static void main(String[] args) {
        javaLangInteger.classTest();
    }
    static void classTest(){
        System.out.println("int类型可取最大值："+Integer.MAX_VALUE);
        System.out.println("int类型可取最小值："+Integer.MIN_VALUE);
        System.out.println("int类型的二进制位数："+Integer.SIZE);
        System.out.println(Integer.TYPE);
        /**
         * Integer类有四个常量
         */

        Integer n1=new Integer(100);
        Integer n2=new Integer("100");
        int n3=n1+n2;
        System.out.println(n3);
        /**
         * Integer类有两个构造方法
         */

        System.out.println("---------------------------------");
        System.out.println(n1.byteValue());
        System.out.println(Integer.compare(100,232));
        System.out.println(Integer.compare(100,100));
        System.out.println(Integer.compare(100,50));
        System.out.println(Integer.valueOf("213"));
        System.out.println(Integer.parseInt("423"));
        System.out.println("1000的十进制表示为："+Integer.toString(1000));
        System.out.println("1000的二进制表示为："+Integer.toBinaryString(1000));
        System.out.println("1000的十六进制表示为："+Integer.toHexString(1000));
        System.out.println("1000的八进制表示为："+Integer.toOctalString(1000));
        /**
         * 常用类方法
         */

        System.out.println("--------------------------------------");
        System.out.println(n1.equals(100));
        System.out.println(n1.compareTo(200));
        System.out.println(n1.intValue());
        System.out.println(n1.shortValue());
        System.out.println(n1.toString());
        /**
         * 常用成员方法
         */

        String str[]={"10","20","30","40","50"};
        int sum=0;
        for (int i = 0; i < str.length; i++) {
            int s=Integer.parseInt(str[i]);
            sum=sum+s;
            System.out.println("当前累加的结果为："+sum);
        }
        /**
         * parseInt()用于字符串转 int型
         */

        System.out.println("------------------------------");
        String str1[]={"10","20","30","40","50"};
        int sum1=0;
        for (int i = 0; i < str.length; i++) {
            int s=Integer.valueOf(str[i]);
            sum1=sum1+s;
            System.out.println("当前累加的结果为："+sum1);
        }
        /**
         * valueOf()也能转换字符串为 int型
         */
    }
}