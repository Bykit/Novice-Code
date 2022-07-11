package commonClass;

import java.util.Scanner;

/**
*@title: 常用类笔记-Scanner类
*@description: Scanner类位于java.util包，用于实现程序员的输入，
*/

public class javaUtilScanner {
    public static void main(String[] args) {
        //javaUtilScanner.inputTest();
        /*先注释掉上一行，再执行下一行，不晓得抛出异常后，后面不能输入数据了*/
        //javaUtilScanner.OtherTests();
        javaUtilScanner.hntouTask();
    }

    static void inputTest(){
        Scanner scan = new Scanner(System.in);
        /* 构造方法用于，从说明从哪里接收数据，System.in(键盘输入)*/

        System.out.print("请输入测试数据0：");
        System.out.println("（next方法接收）测试数据0："+scan.next());

        System.out.print("请输入测试数据1：");
        String str1=scan.next();
        System.out.println("（next方法接收）测试数据1："+str1);
        /**
         * next()：方法用于返回接收的字符串，返回值为string
         * 1、一定要读取到有效字符后才可以结束输入。
         * 2、对输入有效字符之前遇到的空白，next() 方法会自动将其去掉。
         * 3、只有输入有效字符后才将其后面输入的空白作为分隔符或者结束符。
         * 4、next() 不能得到带有空格的字符串。
         */

        System.out.print("请输入测试数据2：");
        System.out.println("（next方法接收）测试数据2："+scan.next());
        /*next()重复使用，进行下一次输入*/

        Scanner scan2 = new Scanner(System.in);
        System.out.print("请输入测试数据3：");
        System.out.println("（next方法接收）测试数据3："+scan2.nextLine());
        /**
         * nextLine()也用于返回接收的字符串，和next()不同
         * 1、以Enter为结束符,也就是说 nextLine()方法返回的是输入回车之前的所有字符。
         * 2、可以获得空白。
         */

        try {
            scan2.close();
            System.out.print("请再输入测试数据4：");
            System.out.println("（next方法接收）测试数据4："+scan2.nextLine());
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        /**
         * close()用于关闭Scanner对象
         * 上面代码会抛出异常
         */

    }

    static void OtherTests(){
        Scanner scan=new Scanner(System.in);
        System.out.print("测试1：");

        System.out.println("输入的数据是否为字符串：" + scan.hasNext());
        System.out.println("输入的数据是否为字符串：" + scan.hasNextLine());
        System.out.println("输入的数据是否为布尔型：" + scan.hasNextBoolean());
        System.out.println("输入的数据是否为int型：" + scan.hasNextInt());
        System.out.println("输入的数据为：" + scan.next());

        System.out.println("-----------------------------------------");

        System.out.println("输入的数据为：" + scan.next());
        System.out.println("输入的数据是否为字符串：" + scan.hasNext());
        System.out.println("输入的数据是否为字符串：" + scan.hasNextLine());
        System.out.println("输入的数据是否为布尔型：" + scan.hasNextBoolean());
        System.out.println("输入的数据是否为int型：" + scan.hasNextInt());
        /*观察这段代码的，比较和上面的区别*/
        /*猜想：因为第一段数据已经读取出来了，所以不能再去用hasNext()等方法去判断，被要求输入新的数据*/

        /**
         * hasNext()和hasNextLine()接收数据后，判断是否为String类型，返回值为布尔型
         * (注意先hasxXxx()判断，再nextXxx()用读取),不然就会被要求重新输入，暂时不李姐。
         * 如果要输入 int 或 float 类型的数据，在 Scanner 类中也有支持，
         * 但是在输入之前最好先使用 hasNextXxx() 方法进行验证，再使用 nextXxx() 来读取：
         */

        System.out.println("-----------------------------------------");

        Scanner scan1 = new Scanner(System.in);
        System.out.print("输入整数：");
        if (scan1.hasNextInt()) {
            /* 判断输入的是否是整数 */
            System.out.println("整数数据：" + scan1.nextInt());
        } else {
            System.out.println("输入的不是整数！");
        }

        System.out.print("输入小数：");
        Scanner scan2 = new Scanner(System.in);
        if (scan2.hasNextFloat()) {
            // 判断输入的是否是小数
            System.out.println("小数数据：" + scan2.nextFloat());
        } else {
            System.out.println("输入的不是小数！");
        }
        scan.close();

    }

    static void hntouTask(){
        /**
         * 作业题，一直没有通过测试，因为少了一个冒号
         */
        Scanner a1=new Scanner(System.in);
        System.out.println("请录入嫦娥个人信息：");
        System.out.println("请输入姓名：");
        String q1=a1.nextLine();

        System.out.println("请输入年龄：");
        String q2=a1.nextLine();

        System.out.println("请输入性别：");
        String q3=a1.nextLine();

        System.out.println("请输入体重：");
        String q4=a1.nextLine();

        System.out.println("请输入地址：");
        String q5=a1.nextLine();

        System.out.println("请输入是否已婚：");
        String q6=a1.nextLine();

        System.out.println("信息如下：");

        System.out.println("\t姓名："+q1);
        System.out.println("\t年龄："+q2+"岁");
        System.out.println("\t性别："+q3);
        System.out.println("\t体重："+q4+"kg");
        System.out.println("\t地址："+q5);
        System.out.println("\t婚否："+q6);
    }
}