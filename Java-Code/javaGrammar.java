
/*Java的基础语法*/

/* Eclipse
 * 多行注释快捷键：ctrl+shift+/
 * 多行注释取消：ctrl+shift+\
 * 单行注释快捷键： ctrl+shift+c 或 ctrl+/  (取消也是一样的快捷键)*/

/*〇、关键字
 * abstract assert
 * boolean break byte
 * case catch char class const continue
 * default do double
 * else enum extends
 * final float for
 * goto
 * if implements import instanceof int interface
 * long
 * native new
 * package private protected public
 * return
 * short static strictfp super switch synchronized
 * this throw throws transient try
 * void volatile
 * while*/

/* 一、标识符
 * 1.由字母，数字，下划线，美元符号，组成，没有长度限制
 * 2.标识符第一个字符不能为数字
 * 3.标识符不能是关键字，也不能是true,false,null
 * 4.(非必要)为提高程序的可读性，需要遵守一些规范
 */

/*二、（方法体内）数据的声明与赋值（初始化）*/

import org.junit.Test;

import java.lang.*;

/*1.基本数据类型*/
//枚举定义使用enum关键字，和class和interface是同等地位，枚举中可以定义方法
//枚举格式：[修饰符]+enum+标识符{枚举常量（逗号隔开）；}
enum weekday{
	A,B,D;			//列出所包含的枚举常量
	public static String today(weekday a){
		return switch (a) {
			case A -> "周一";
			case B -> "周二";
			default -> "自己看手机";
		};
	}
}



public class javaGrammar{


	public static void main(String[] args) {
		
		/*常量需要用final修饰*/
		final int YOUTH_AGE;		/*常量声明（格式：final+数据类型+标识符）*/
		YOUTH_AGE=18;				/*常量赋值*/
		final int AGE=20;			/*声明和赋值（初始化）可以合拼在一条语句*/
		System.out.println(YOUTH_AGE);
		System.out.println(AGE);
		
		/*变量不需要修饰符修饰*/
		byte byt;					/*变量声明（格式：数据类型+标识符）*/
		byt=123;					/*变量赋值*/
		short shor=1234;			/*声明和赋值（初始化）可以在一条语句*/
		int in=12345;
		
		/*除byte，short，int，对于long，float，double的赋值都要L,F,D*/		
		long lon=12343556546324L;
		float fla=342.32F;
		double dou =34356346345.23432D;
		
		char cha='虎';
		boolean bool=true;

		System.out.println(byt);
		System.out.println(shor);
		System.out.println(in);
		System.out.println(lon);
		System.out.println(fla);
		System.out.println(dou);
		System.out.println(cha);
		System.out.println(bool);
		
		yinyong();

		weekday ac=weekday.A;			//枚举类型变量赋值
		System.out.println(ac);			//自动调用toString()方法,打印枚举数据对应的名字
		System.out.println(weekday.today(weekday.D));		//调用枚举中的方法

		fanfa.fanx("嘿嘿嘿");

	}
	
/*2.引用数据类型 */
	public static void yinyong() {
		
		/*（1）数组 */
		String[] hello; 					/* 数组的声明（格式：数据类型[]+数组标识符） */
		hello = new String[5]; 				/* 数组的初始化（不赋值，只声明数组长度） */
		hello[0] = "测试"; 					/* 数组的赋值 */
		
		
		int[] ina = new int[5]; 			/* 声明和初始化（不赋值）可以在一条语句 */
		ina[1]=15;
		
		int[] inb = { 1, 2, 3, 4, 5 }; 		/* 声明和初始化（赋值）,根据数值个数确定数组长度 */
		
		
		System.out.println(hello[0]);
		System.out.println(ina[1]);
		System.out.println(inb[1]);
		
		//数组声明和初始化的其他写法
		int inc[];					//声明
		inc=new int[5];				//初始化（不赋值）
		float ind[]=new float[5];	//声明和初始化在同一条语句
		inc[3]=5;
		ind[4]=8;
		System.out.println(inc[3]+ind[4]);
		
		//多维数组
		int[][] ine=new int[2][3];	//声明和初始化（不赋值）
		ine[1][2]=4;
		
		int[][] inf= {{1,2,3},{4,3,2}};	//声明和初始化（赋值）
		
		System.out.println(ine[1][2]);
		System.out.println(inf[1][2]);
		
		//(2)类
		Object obj;					//声明Object类
		obj=new Object();			//类的初始化（实例化）
		Object oba=new Object();	//声明和初始化可以在同一条语句
		System.out.println(obj);	//?这里不明白输出的是什么
		System.out.println(oba);	
		
		//(3)接口
//		List lisa;					//声明一个List接口
//		lisa=new ArrayList();		//接口的初始化
//		List lisb=new ArrayList();	//声明和初始化可以在同一条语句
//		System.out.println(lisa);
//		System.out.println(lisb);
		
		System.out.println(fanfa.add(3,4));

		int[] ab=new int[10];
		for (int i = 0; i < 10; i++) {
			System.out.print(ab[i]+"\t");
		}
		System.out.println();
		String[] ab2=new String[10];
		for (int i = 0; i < 10; i++) {
			System.out.print(ab2[i]+"\t");
		}
		/**
		 * 1、int类型定义的数组，初始化默认是0
		 * 2、String类型定义的数组，默认值是null
		 * 4、double类型定义的数组，默认值是0.0
		 * 5、float类型定义的数组，默认值是0.0
		 * 6、boolean类型定义的数组，默认值是false
		 */

	}	
	
}


//三、类的声明与类体的编写
//1.类的声明
//格式：[修饰符]+class+类名标识符+[<泛型标识>]+[extends+父类标识符]+[implements+接口列表]{}
//方括号表示可选，修饰符包括public,abstract,final
//泛型标识：类型的形参，类型于方法中的形参
class anote{/*类体*/}
//public class bnote{/*类体*/}		//public的类必须在自己的文件（同名）定义
//final public class cnote{/*类体*/}
class dnote extends anote{/*类体*/}
//class enote implements List{/*类体*/}
abstract class fnote{/*类体*/}
class BLNL<T> {				//T为类型的形参
	private T sh;			//定义T类型的成员变量

	public BLNL(T sh) {		//定义构造方法，方法的参数类型为T类型
		this.sh = sh;
	}

	public T getSh() {		//定义get方法，方法返回类型为T类型
		return sh;
	}

	public void setSh(T sh) {	//定义set方法，方法的参数类型为T类型
		this.sh = sh;
	}
}
//泛型类的传参格式：BLNL<String> str=new BLNL<>();
	
//2.类体的编写
//（1）成员变量的编写
//格式：[访问权限修饰符]+[static]+[final]+变量类型+变量标识符
//方括号表示可选，权限修饰符包括public,protected,private
//mian方法的变量为局部变量，局部变量不能使用public,protected,private，static修饰符，只能使用final修饰符
class apple{
	public String color;				//成员变量的编写
	public static int count;			//成员变量
	public final boolean MATURE=true;	//成员常量	
}

//（2）成员方法的编写
//声明格式：[权限修饰符]+[static]+[final]+[synchronized]+[<泛型标识>]+方法返回值类型+方法标识符（[参数列表]）+[throws 异常类]{}
//方法体编写：方法体的变量为局部变量，上面有说明
//throws关键字：向上级抛出异常，由方法调用者处理
//synchronized关键字：调用这个方法线程执行完成之前，其他调用该方法的线程都会被阻止。
//泛型标识：声明该方法为泛型方法，泛型是类型的形参
class fanfa{
	public void unadd() {};
	void yichang() throws NumberFormatException{}
	public final static int add(int a,int b) {
		int sum=a+b;
		return sum;
	}
	synchronized void tongbu(){}
	public static <E> void fanx(E a){			//E属于object类，只有传参后，系统才会去确定E的类型
		System.out.println(a+"\t"+a.getClass().getSimpleName());
	}
	<A,S,D> void fas(A a,S b,D c){}				//同一方法可以定义多个泛型
}

//(3)内部类
//Java允许在类内部定义类，称为成员内部类
//在方法体定义的类，称为局部内部类，有效范围为方法体内


//四、接口的声明与接口体的编写
//（Java的接口是一个特殊的抽象类，接口的所有方法都没有方法体）
//1.接口的声明
//格式：[修饰符]+interface+接口名标识符+[<泛型标识>]+[extends+父接口名列表]{}
interface intera{/*接口体*/}
interface interb extends intera{/*接口体*/}
//public interface interc extends interb{/*接口体*/}	//public的接口必须要在自己的文件定义

//2.接口体的编写
//接口体由常量定义和方法定义两部分
//常量声明：[public]+[static]+[final]+常量名标识符
//方法声明：[public]+[abstract]+方法标识符+（[参数列表]）	
interface yuan{
	final float PI=3.1415F;
	float getArea(float r);			//注意方法不用写方括号
	float getCir(float r);
}


//五、数据运算与数据类型转换
class count{
	void counta() {
//1.赋值运算符：=
		int i=1;
		int a,b;
		a=b=2;	//ab同时赋值
		fanfa fa1=new fanfa();	//创建对象
		
//2.算数运算符：+、-、*、/、%（加减乘除和取余）
//运算结果为：数值型（这里不讨论）
		int c=1+2;	//略

//3.关系运算符：<、>、==、!=、>=、<=（小于、大于、等于、不等于、大于等于、小于等于）
//运算结果为boolean型
		boolean d=(3>2);
		boolean e=(2==3);		//特别注意等于关系运算符，不要写成赋值运算符

//4.逻辑运算符：!、^、&、|、&&、||（取反、异或、非简洁与、非简洁或、简洁与、简洁或）
//运算对象为boolean型对象，运算结果也为boolean型
		boolean f=true^false;
		boolean g=!true;
		
//5.位运算符
//（1）逻辑位运算符：~、&、|、^（取反、与、或、异或）
//（2）移位运算符：<<（左移，低位添0补齐）、>>（右移，高位添符号位）、>>>（右移，高位添0补齐）
//位运算是对操作数，以二进制位为单位，进行操作和运算
//运算结果为整数型
		int h=5&-4;
		int j=3|6;
		int k=-2<<3;		//如不明白运算过程，请查阅相关资料，这里不赘述
		int l=4>>>2;		//4的计算机底层表示的二进制向右移动2位

//6.对象运算符：instanceof关键字
//用于判断对象是否为某一类类型
//运算结果为boolean
		fanfa n=new fanfa();
		boolean m=n instanceof fanfa;	//判断n是否属于fanfa类型
		
//7.其他运算符：++、--、?:、[]、.
		int o1=1,o2=2;
		int p1=2+(++o1);		//o1先自+1，再执行2+o1
		int p2=2+(o2++);		//先执行2+o2，o2再自+1
		//?:三元运算符格式：逻辑表达式？表达式1：表达式2
		int q=(3<4?4:2);
		//[]用于声明、建立、访问数组
		//.用于访问类成员或对象的实例成员

//8.运算符的优先级
//这里不赘述，细节请翻书

//9.数据类型转换
//（1）基本数据类型之间的转换
//基本数据类型低级类型到高级类型的排序：byte，short,char,int,long,float,double
//自动数据类型转换：低级向高级数据类型转换
//在算术表达式中，如果有byte，int，float，double型的数据，则低级类型会自动转成相同高级类型，再进行计算
		byte a1=54;
		char a2='c';
		int a3=3242;
		float a4=324.32F;
		float a5=a1+a2*a3+a4;	//a1,a2,a3会自动转换为float型，注意a5不能定义为int型
//强制数据类型转换
//用于高级数据类型向低级数据类型转换，可能会导致数据溢出和精度降低，需要谨慎使用
		int b1=(int)7.5;
		byte b2=(byte)342;
//（2）字符串与其他数据类型之间的互相转换		（未学习）
//（3）引用数据类型之间的互相转换				（未学习）
	}
}


//六、控制语句（写在方法体内）
//1.分支语句（if语句、switch语句）
//2.循环语句（for循环语句、while循环语句）
//3.跳转语句（break跳转语句、continue跳转语句、return跳转语句）

class contro {
	void contr01() {
//(1)if语句
//格式1：if（表达式）{Java语句}		
//格式2：if（表达式）{Java语句}else{Java语句}		
//格式3：if（表达式）{Java语句}else if（表达式）{Java语句}........
		if(3>4) {/*java语句*/}else {/*java语句*/}
		if(1<2) {/*java语句*/};
		if(4>2) {}else if(3<2) {}

//（2）switch语句
//格式:	switch(表达式) {
//		case 常量表达式1:/*java语句*/;[break];
//		case 常量表达式2:/*java语句*/;[break];
//		case 常量表达式3:/*java语句*/;[break];
//		default:/*java语句*/;
//	}
		switch(1+1) {
		case 1:/*java语句*/;break;
		case 3:/*java语句*/;break;
		default:/*java语句*/;
		}
		
//（3）for循环语句
//格式：for(初始化语句;循环条件；迭代语句){java语句}
		for(int iw=1;iw<10;iw++) {
			/*java语句*/
		}
		
//(4)while循环语句
//格式1：while（表达式）{/*java语句*/}
//格式2：do{/*java语句*/}while;
		int qe=1;
		while(qe<3) {
			qe++;
		}
		int we=1;
		do {
			we=we+1;
		}while(we<3);		//注意这里的while后面没有方括号，它循环的是前面的语句	
		
		contr2();
	}
//（5）跳转语句break、continue、return
//break：终止循环或其他控制语句
//continue：结束本次循环
//return：从一个方法返回，并把控制权交给交给调用它的语句
	int contr2() {
		int er=1;
		while(er<2) {
			er++;
			if(3<4) {continue;}		//结束本次循环
			er--;
		}
		while(er<4) {
			er++;
			if(3==3)break;			//终止while循环
			er--;
		}
		return 3;
	}
	
}

//七、特殊语句（写在方法体内）

//（1）try...catch语句
//格式1：try{可能产生异常的代码}catch(异常类 异常对象){异常处理代码}...后面可以写多个catch
//格式2：try{可能产生异常的代码}catch(异常类 异常对象){异常处理代码}finally{Java语句}
//异常可以嵌套使用
class yichang {
	void yichang1(){
		try {
			int a=3/0;					//抛出异常
		}catch (Exception E){			//设置异常类对象，接住异常
			System.out.println(E.getMessage());		//通过异常类的对象，调用相应的方法输出相关信息
			int b=10;									//这里也可以写一些其他操作
		}finally {
			int c=7;									//无论结果怎样，都会执行finally语句块
		}
	}
}

//（2）throw语句
//格式1：throw+异常类对象；
//格式2：throw+new 异常类（）；
//用于抛出异常类对象
class yic2{
	void yi23(){
		try {
			Exception yc=new Exception();	//创建一个异常对象
			throw yc;						//抛出异常类对象
			//throw new Exception();			//抛出异常类对象
		}catch (Exception a){
			int we=2;
		}
		synchronized (new Object()){int r=0;}
	}
}

//（3）synchronized关键字
//格式：synchronized (当前对象){Java语句;}
//用于设置程序的某个代码块为同步区域，当一个线程执行这段代码时，其他的线程需要等待
class yic4{
	void yi24(){
		synchronized (new Object()){int r=0;}
	}
}

//（4）super关键字
//用于调用父类的构造方法，格式：super([参数列表])
//用于操作父类中被隐藏的成员变量，格式：super.成员变量名
//用于使用父类中被覆盖的成员方法，格式：super.成员方法名([参数列表])

















	
	