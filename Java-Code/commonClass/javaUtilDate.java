package commonClass;

import java.util.Date;
import java.util.Locale;

/**
*@title: 常用类笔记-Date类
*@description: Date类位于java.util包，用于处理时间类数据
*/
public class javaUtilDate {
    public static void main(String[] args) {
        javaUtilDate.ConstructionMethod();
    }

    static void ConstructionMethod(){
        Date today=new Date();
        System.out.println(today);
        Date data1=new Date(1000);
        Date data2=new Date(-1000);
        System.out.println(data1);
        System.out.println(data2);
        /**
         * 无参数的构造方法，返回当前本机的时间
         * 带参数的构造方法，以1970年1月1日（格尔威治时间）与参数相加
         * 上面的1000表示1000毫秒，也就是一秒
         */

        System.out.printf("以YYYY+MM+DD格式显示日期："+"%tF"+"\n",today);
        System.out.printf("以MM/DD/YY格式显示日期："+"%tD"+"\n",today);
        System.out.printf("以HH:MM:SS AM(十二小时制)格式显示日期："+"%tr"+"\n",today);
        System.out.printf("以HH:MM:SS(二十四小时制)格式显示日期："+"%tT"+"\n",today);
        System.out.printf("以HH:MM(二十四小时制)格式显示日期："+"%tR"+"\n",today);
        /**
         * 日期和时间的格式化输出
         */

        System.out.printf(Locale.US,"获取月份简称："+"%tb"+"%n",today);
        System.out.printf(Locale.US,"获取月份全称："+"%tB"+"%n",today);
        System.out.printf("获取月份简称："+"%tb"+"%n",today);
        System.out.printf("获取月份全称："+"%tB"+"%n",today);
        System.out.printf(Locale.US,"获取星期简称："+"%ta"+"%n",today);
        System.out.printf(Locale.US,"获取星期全称："+"%tA"+"%n",today);
        System.out.printf("获取星期简称："+"%ta"+"%n",today);
        System.out.printf("获取星期全称："+"%tA"+"%n",today);
        System.out.printf("获取年："+"%tY"+"%n",today);
        System.out.printf("获取年后两位："+"%ty"+"%n",today);
        System.out.printf("获取年前两位："+"%tC"+"%n",today);
        System.out.printf("获取月："+"%tm"+"%n",today);
        System.out.printf("获取日："+"%td"+"%n",today);
        System.out.printf("获取日（不足两位前面不补零）："+"%te"+"%n",today);
        System.out.printf("获取today时间为今年的第几天："+"%tj"+"%n",today);
        /**
         * 日期的格式化输出
         */

        System.out.printf("获取24小时制的小时："+"%tH"+"%n",today);
        System.out.printf("获取24小时制的小时（不足两位后面不补0）："+"%tk"+"%n",today);
        System.out.printf("获取12小时制的小时："+"%tI"+"%n",today);
        System.out.printf("获取12小时制的小时（不足两位后面不补0）："+"%tl"+"%n",today);
        System.out.printf("获取分钟："+"%tM"+"%n",today);
        System.out.printf("获取秒："+"%tS"+"%n",today);
        System.out.printf("获取3位毫秒："+"%tL"+"%n",today);
        System.out.printf("获取9位毫秒："+"%tM"+"%n",today);
        System.out.printf("显示上下午标记："+"%tp"+"%n",today);
        System.out.printf(Locale.US,"显示上下午标记："+"%tp"+"%n",today);
        /**
         * 时间的格式化输出
         */
    }
}

/**
 * 一些想法
 * Date类可以写一个倒计时软件
 */