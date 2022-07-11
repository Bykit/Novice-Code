package commonClass;

/**
 *@title: 常用类笔记-Double类
 *@description: Double类位于java.lang包,和Float类相似，Float类不再写笔记
 */

public class javaLangDouble {
    public static void main(String[] args) {
        javaLangDouble.classTest();
    }
    static void classTest(){

        /* 构造方法 */
        Double d1=new Double(43.34);
        Double d2=new Double("4135.4234");

        /* 常量 */
        System.out.println("最大指数："+Double.MAX_VALUE);
        System.out.println("最小指数："+Double.MIN_VALUE);
        System.out.println("保存负无穷大的常量："+Double.NEGATIVE_INFINITY);
        System.out.println("保存负无穷大的常量："+Double.POSITIVE_INFINITY);

        /* 常用成员方法 */
        byte b1=d1.byteValue();
        int b2=d1.compareTo(3223.32);
        boolean b3=d1.equals(13);
        int b4=d1.intValue();
        boolean b5=d1.isNaN();/*判断double值是否为非数字（NaN）值*/
        String b6=d1.toString();

        /* 常用类方法 */
        double b7=Double.valueOf("21312.321");
        double b8=Double.parseDouble("243234.323");

        /**
         * 抽象类 Number类，位于java.lang包
         * 抽象类 Number类是BigDecimal、BigInteger、Byte、Double、Float、Integer、Long和Short类的父类，
         * Number类的子类必须提供将表示的数值转换为byte、double、float、int、long和short的方法。
         * 下面为 Number类的方法，Number类的所有子类都包含下列成员方法
         */
        byte z1=d1.byteValue();
        int z2=d1.intValue();
        float z3=d1.floatValue();
        short z4=d1.shortValue();
        long z5=d1.longValue();
        double z6=d1.doubleValue();

    }
}