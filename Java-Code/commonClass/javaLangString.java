package commonClass;

/**
*@title: 常用类笔记-String类
*@description: String类位于java.lang包，是一个专门用来操作字符的类
*/
public  class javaLangString {
    public static void main(String[] args) {
        System.out.print("Hello World!");
        javaLangString.createStringObject();
        javaLangString.CommonMethod();
    }

    /**
    *@title: 创建和打印输出字符串对象
    */
    static void createStringObject(){
        String aStr=null;
        /**
         * null是一个关键字，用来标识一个不确定的对象。
         * 因此可以将null赋给引用类型变量，但不可以将null赋给基本类型变量。
         * 比如：int a = null;是错误的。Ojbect o = null是正确的。
         */
        String bStr="";
        String cStr="数据结构";
        String dStr=new String("数据结构");
        /*上面两行是一样的*/

        System.out.println(aStr+bStr+cStr+dStr);
        System.out.println("电话"+123321);
        System.out.println("This is"+true);
        String a1Str="我的WeChat："+12345678;
        float xb=34.3424F;
        String a2Str="变量xb的值为："+xb;
        System.out.println(a1Str);
        System.out.println(a2Str);
        /**
         * 若有一个操作元为String类型，则加号用于连接字符串
         * 基本数据类型自动转换为字符串，引用类型自动调用所引用对象的toString()方法获得一个字符串
         * */
    }

    /**
    *@title:String类常用方法
    */
    static void CommonMethod(){
        String aStr="ABC";
        System.out.println(aStr.equals("abc"));
        System.out.println(aStr.equalsIgnoreCase("abc"));
        /**
         * equals()方法用于比较字符串是否相等，返回值为布尔型
         * equalsIgnoreCase()方法也用于比较字符串是否相等，不区分大小写
         */

        System.out.println(aStr.startsWith("a"));
        System.out.println(aStr.endsWith("C"));
        System.out.println(aStr.startsWith("B",1));
        /**
         * startsWith()方法用于判断字符串是否以指定字符串开始
         * endsWith()方法用于判断字符串是否以指定字符串结束
         * startsWith()方法还有一个重载方法，第二个参数指定开始的位置
         */

        System.out.println(aStr.compareTo("不李姐"));
        /**
         * compareTo()方法用于两字符串比较大小，依据他们在字典中的位置
         * 返回值为int类型，如果两字符串相等，则返回 0；
         */

        String bStr="abDcCDcE";
        System.out.println(bStr.length());
        System.out.println(bStr.toLowerCase());
        System.out.println(bStr.toUpperCase());
        /**
         * length()返回字符串长度
         * toLowerCase()字符串里的所有字母改为小写
         * toUpperCase()字符串里的所有字母改为大写
         */

        System.out.println(bStr.indexOf("Dc"));
        System.out.println(bStr.lastIndexOf('D'));
        System.out.println(bStr.indexOf('c',4));
        /**
         * 查找字符串
         * indexOf()用于获取指定字符串在原字符串中第一次出现的索引
         * lastIndexOf()用于获取指定字符串在原字符串中最后一次出现的索引
         * 上面两个方法都有多个重构方法
         */

        String cStr="ABCDEFG";
        System.out.println(cStr.substring(3));
        System.out.println(cStr.substring(3,5));
        /**
         * substring()截取字符串
         * 一个参数表示从索引A开始截取到最后
         * 方法重载，两个参数表示从索引A截取到索引B
         */

        String dStr="  go to school  ";
        System.out.println(dStr);
        System.out.println(dStr.trim());
        /**
         * trim()用于去掉首尾空格
         */

        String eStr="NBA_NBA_NBA";
        System.out.println(eStr.replace('N','M'));
        System.out.println(eStr.replaceAll("NB","AA"));
        System.out.println(eStr.replaceFirst("N","M"));
        /**
         * replace()替换原字符串里的指定字符
         * replaceAll()替换原字符串里的指定子字符串
         * replaceFirst()替换原字符串里的第一个子字符串
         */

        String fStr="今天、不下雨、不刮风、困";
        String[] a_fStr=fStr.split("、");
        System.out.println(fStr);
        for (int i = 0; i < a_fStr.length; i++) {
            System.out.println(a_fStr[i]);
        }
        String[] b_fStr=fStr.split("、",3);
        for (int i = 0; i < b_fStr.length; i++) {
            System.out.println(b_fStr[i]);
        }
        /**split()分割字符串
         * 第一个参数为分割规则，第二个参数为分割规则的应用次数，也为数组长度
         * 该方法有多个重载方法
         */

        String gStr=String.format("%e",16.8);
        System.out.println(gStr);
        int xa=100;
        System.out.printf("这是变量xa的值：%d%n",xa);
        System.out.printf("%s\n","A");
        /**
         * format()用于格式化字符串，是一个静态方法
         * 该方法通过调用了 Formatter类对象，并返回
         * printf()为格式化打印，不带回车功能，不是String类的方法
         * 格式化转换符（转 Formatter类笔记看）
         */
    }

}

/**
 * 一些想法
 * String类可以用来判断身份证号或手机号输入是否合法
 * 可以根据身份证号去自动填充生日、性别等信息
 */