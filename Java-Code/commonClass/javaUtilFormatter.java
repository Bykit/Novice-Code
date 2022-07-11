package commonClass;

/**
 *@title: 常用类笔记-Formatter类
 *@description: Formatter类位于java.util包，用于数字的格式化，即按照指定格式得到一个字符串
 */

public class javaUtilFormatter {
    public static void main(String[] args) {
        javaUtilFormatter.classTest();
    }
    static void classTest(){
        String m=String.format("%d元%.1f箱%d斤",78,8.0,125);
        System.out.println(m);
        /**
         * String中的format()方法实际由创建Formatter类对象实现
         * 方法参数包括：格式化模式、值列表
         * 格式化模式是方法中使用双引号括起来的字符序列，由格式转换符和普通字符构成
         * 值列表是使用逗号分隔的变量，常量表达式
         */

        System.out.printf("%d,%o,%x,%X%n",1234,1234,1234,1234);
        /**
         * 格式化转换符
         * %d：格式化为十进制整数型
         * %0：格式化为八进制整型数
         * %x：格式化为十六进制整型数（小写）
         * %X：格式化为十六进制整型数（大写）
         * %n：换行符
         */

        System.out.printf("按千分组：%,d%n",2134793724);
        System.out.printf("按千分组且加上正号：%,+d%n",2134793724);
        /**
         * 百分号后面的 "," 和 "+" 均为转换符的修饰符
         * 逗号：按千分组
         * 加号：强制加上正号
         */

        System.out.printf("%6d%n",63);/*不加负号表示从字符左边增加空格*/
        System.out.printf("%-6d%d%n",63,34);/*加负号表示从字符右边增加空格*/
        System.out.printf("%06d结束%n",63);/*加零表示从字符左边补零*/
        /**
         * 数据的宽度就是format()返回字符串的长度
         * 上面的例子是将63格式化为宽度为6的字符串
         */

        System.out.printf("按千分组：%,f%n",21347.93724);
        System.out.printf("按千分组且加上正号：%,+f%n",2134.793724);
        System.out.printf("%20f%n",63.34);
        System.out.printf("%-20f%d%n",63.32,34);
        System.out.printf("%020f结束%n",63.23);
        System.out.printf("%.2f%n",Math.PI);/*%.nf限制小数的位数*/
        /**
         * 浮点数和整数的格式化以一样的
         * 浮点数格式化比整数多了一个，%.nf限制小数的位数
         */

        System.out.printf("%2d",12312);
        /*如果实际数字大于格式中的指定的宽度，就按数字实际宽度进行格式化*/

        /**
         * 其他常用格式化转换符
         * %s：字符串
         * %s：字符串
         * %b：逻辑型
         * %f：十进制浮点数
         * %a：十六进制浮点数
         * %e：指数形式
         * %g：通用浮点型数
         * %h：散列码
         * %%：百分比
         * %tx：日期
         */





    }
}