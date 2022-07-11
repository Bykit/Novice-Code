
/*Java�Ļ����﷨*/

/* Eclipse
 * ����ע�Ϳ�ݼ���ctrl+shift+/
 * ����ע��ȡ����ctrl+shift+\
 * ����ע�Ϳ�ݼ��� ctrl+shift+c �� ctrl+/  (ȡ��Ҳ��һ���Ŀ�ݼ�)*/

/*�����ؼ���
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

/* һ����ʶ��
 * 1.����ĸ�����֣��»��ߣ���Ԫ���ţ���ɣ�û�г�������
 * 2.��ʶ����һ���ַ�����Ϊ����
 * 3.��ʶ�������ǹؼ��֣�Ҳ������true,false,null
 * 4.(�Ǳ�Ҫ)Ϊ��߳���Ŀɶ��ԣ���Ҫ����һЩ�淶
 */

/*�������������ڣ����ݵ������븳ֵ����ʼ����*/

import org.junit.Test;

import java.lang.*;

/*1.������������*/
//ö�ٶ���ʹ��enum�ؼ��֣���class��interface��ͬ�ȵ�λ��ö���п��Զ��巽��
//ö�ٸ�ʽ��[���η�]+enum+��ʶ��{ö�ٳ��������Ÿ�������}
enum weekday{
	A,B,D;			//�г���������ö�ٳ���
	public static String today(weekday a){
		return switch (a) {
			case A -> "��һ";
			case B -> "�ܶ�";
			default -> "�Լ����ֻ�";
		};
	}
}



public class javaGrammar{


	public static void main(String[] args) {
		
		/*������Ҫ��final����*/
		final int YOUTH_AGE;		/*������������ʽ��final+��������+��ʶ����*/
		YOUTH_AGE=18;				/*������ֵ*/
		final int AGE=20;			/*�����͸�ֵ����ʼ�������Ժ�ƴ��һ�����*/
		System.out.println(YOUTH_AGE);
		System.out.println(AGE);
		
		/*��������Ҫ���η�����*/
		byte byt;					/*������������ʽ����������+��ʶ����*/
		byt=123;					/*������ֵ*/
		short shor=1234;			/*�����͸�ֵ����ʼ����������һ�����*/
		int in=12345;
		
		/*��byte��short��int������long��float��double�ĸ�ֵ��ҪL,F,D*/		
		long lon=12343556546324L;
		float fla=342.32F;
		double dou =34356346345.23432D;
		
		char cha='��';
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

		weekday ac=weekday.A;			//ö�����ͱ�����ֵ
		System.out.println(ac);			//�Զ�����toString()����,��ӡö�����ݶ�Ӧ������
		System.out.println(weekday.today(weekday.D));		//����ö���еķ���

		fanfa.fanx("�ٺٺ�");

	}
	
/*2.������������ */
	public static void yinyong() {
		
		/*��1������ */
		String[] hello; 					/* �������������ʽ����������[]+�����ʶ���� */
		hello = new String[5]; 				/* ����ĳ�ʼ��������ֵ��ֻ�������鳤�ȣ� */
		hello[0] = "����"; 					/* ����ĸ�ֵ */
		
		
		int[] ina = new int[5]; 			/* �����ͳ�ʼ��������ֵ��������һ����� */
		ina[1]=15;
		
		int[] inb = { 1, 2, 3, 4, 5 }; 		/* �����ͳ�ʼ������ֵ��,������ֵ����ȷ�����鳤�� */
		
		
		System.out.println(hello[0]);
		System.out.println(ina[1]);
		System.out.println(inb[1]);
		
		//���������ͳ�ʼ��������д��
		int inc[];					//����
		inc=new int[5];				//��ʼ��������ֵ��
		float ind[]=new float[5];	//�����ͳ�ʼ����ͬһ�����
		inc[3]=5;
		ind[4]=8;
		System.out.println(inc[3]+ind[4]);
		
		//��ά����
		int[][] ine=new int[2][3];	//�����ͳ�ʼ��������ֵ��
		ine[1][2]=4;
		
		int[][] inf= {{1,2,3},{4,3,2}};	//�����ͳ�ʼ������ֵ��
		
		System.out.println(ine[1][2]);
		System.out.println(inf[1][2]);
		
		//(2)��
		Object obj;					//����Object��
		obj=new Object();			//��ĳ�ʼ����ʵ������
		Object oba=new Object();	//�����ͳ�ʼ��������ͬһ�����
		System.out.println(obj);	//?���ﲻ�����������ʲô
		System.out.println(oba);	
		
		//(3)�ӿ�
//		List lisa;					//����һ��List�ӿ�
//		lisa=new ArrayList();		//�ӿڵĳ�ʼ��
//		List lisb=new ArrayList();	//�����ͳ�ʼ��������ͬһ�����
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
		 * 1��int���Ͷ�������飬��ʼ��Ĭ����0
		 * 2��String���Ͷ�������飬Ĭ��ֵ��null
		 * 4��double���Ͷ�������飬Ĭ��ֵ��0.0
		 * 5��float���Ͷ�������飬Ĭ��ֵ��0.0
		 * 6��boolean���Ͷ�������飬Ĭ��ֵ��false
		 */

	}	
	
}


//�����������������ı�д
//1.�������
//��ʽ��[���η�]+class+������ʶ��+[<���ͱ�ʶ>]+[extends+�����ʶ��]+[implements+�ӿ��б�]{}
//�����ű�ʾ��ѡ�����η�����public,abstract,final
//���ͱ�ʶ�����͵��βΣ������ڷ����е��β�
class anote{/*����*/}
//public class bnote{/*����*/}		//public����������Լ����ļ���ͬ��������
//final public class cnote{/*����*/}
class dnote extends anote{/*����*/}
//class enote implements List{/*����*/}
abstract class fnote{/*����*/}
class BLNL<T> {				//TΪ���͵��β�
	private T sh;			//����T���͵ĳ�Ա����

	public BLNL(T sh) {		//���幹�췽���������Ĳ�������ΪT����
		this.sh = sh;
	}

	public T getSh() {		//����get������������������ΪT����
		return sh;
	}

	public void setSh(T sh) {	//����set�����������Ĳ�������ΪT����
		this.sh = sh;
	}
}
//������Ĵ��θ�ʽ��BLNL<String> str=new BLNL<>();
	
//2.����ı�д
//��1����Ա�����ı�д
//��ʽ��[����Ȩ�����η�]+[static]+[final]+��������+������ʶ��
//�����ű�ʾ��ѡ��Ȩ�����η�����public,protected,private
//mian�����ı���Ϊ�ֲ��������ֲ���������ʹ��public,protected,private��static���η���ֻ��ʹ��final���η�
class apple{
	public String color;				//��Ա�����ı�д
	public static int count;			//��Ա����
	public final boolean MATURE=true;	//��Ա����	
}

//��2����Ա�����ı�д
//������ʽ��[Ȩ�����η�]+[static]+[final]+[synchronized]+[<���ͱ�ʶ>]+��������ֵ����+������ʶ����[�����б�]��+[throws �쳣��]{}
//�������д��������ı���Ϊ�ֲ�������������˵��
//throws�ؼ��֣����ϼ��׳��쳣���ɷ��������ߴ���
//synchronized�ؼ��֣�������������߳�ִ�����֮ǰ���������ø÷������̶߳��ᱻ��ֹ��
//���ͱ�ʶ�������÷���Ϊ���ͷ��������������͵��β�
class fanfa{
	public void unadd() {};
	void yichang() throws NumberFormatException{}
	public final static int add(int a,int b) {
		int sum=a+b;
		return sum;
	}
	synchronized void tongbu(){}
	public static <E> void fanx(E a){			//E����object�ֻ࣬�д��κ�ϵͳ�Ż�ȥȷ��E������
		System.out.println(a+"\t"+a.getClass().getSimpleName());
	}
	<A,S,D> void fas(A a,S b,D c){}				//ͬһ�������Զ���������
}

//(3)�ڲ���
//Java���������ڲ������࣬��Ϊ��Ա�ڲ���
//�ڷ����嶨����࣬��Ϊ�ֲ��ڲ��࣬��Ч��ΧΪ��������


//�ġ��ӿڵ�������ӿ���ı�д
//��Java�Ľӿ���һ������ĳ����࣬�ӿڵ����з�����û�з����壩
//1.�ӿڵ�����
//��ʽ��[���η�]+interface+�ӿ�����ʶ��+[<���ͱ�ʶ>]+[extends+���ӿ����б�]{}
interface intera{/*�ӿ���*/}
interface interb extends intera{/*�ӿ���*/}
//public interface interc extends interb{/*�ӿ���*/}	//public�Ľӿڱ���Ҫ���Լ����ļ�����

//2.�ӿ���ı�д
//�ӿ����ɳ�������ͷ�������������
//����������[public]+[static]+[final]+��������ʶ��
//����������[public]+[abstract]+������ʶ��+��[�����б�]��	
interface yuan{
	final float PI=3.1415F;
	float getArea(float r);			//ע�ⷽ������д������
	float getCir(float r);
}


//�塢������������������ת��
class count{
	void counta() {
//1.��ֵ�������=
		int i=1;
		int a,b;
		a=b=2;	//abͬʱ��ֵ
		fanfa fa1=new fanfa();	//��������
		
//2.�����������+��-��*��/��%���Ӽ��˳���ȡ�ࣩ
//������Ϊ����ֵ�ͣ����ﲻ���ۣ�
		int c=1+2;	//��

//3.��ϵ�������<��>��==��!=��>=��<=��С�ڡ����ڡ����ڡ������ڡ����ڵ��ڡ�С�ڵ��ڣ�
//������Ϊboolean��
		boolean d=(3>2);
		boolean e=(2==3);		//�ر�ע����ڹ�ϵ���������Ҫд�ɸ�ֵ�����

//4.�߼��������!��^��&��|��&&��||��ȡ������򡢷Ǽ���롢�Ǽ��򡢼���롢����
//�������Ϊboolean�Ͷ���������ҲΪboolean��
		boolean f=true^false;
		boolean g=!true;
		
//5.λ�����
//��1���߼�λ�������~��&��|��^��ȡ�����롢�����
//��2����λ�������<<�����ƣ���λ��0���룩��>>�����ƣ���λ�����λ����>>>�����ƣ���λ��0���룩
//λ�����ǶԲ��������Զ�����λΪ��λ�����в���������
//������Ϊ������
		int h=5&-4;
		int j=3|6;
		int k=-2<<3;		//�粻����������̣������������ϣ����ﲻ׸��
		int l=4>>>2;		//4�ļ�����ײ��ʾ�Ķ����������ƶ�2λ

//6.�����������instanceof�ؼ���
//�����ж϶����Ƿ�Ϊĳһ������
//������Ϊboolean
		fanfa n=new fanfa();
		boolean m=n instanceof fanfa;	//�ж�n�Ƿ�����fanfa����
		
//7.�����������++��--��?:��[]��.
		int o1=1,o2=2;
		int p1=2+(++o1);		//o1����+1����ִ��2+o1
		int p2=2+(o2++);		//��ִ��2+o2��o2����+1
		//?:��Ԫ�������ʽ���߼����ʽ�����ʽ1�����ʽ2
		int q=(3<4?4:2);
		//[]������������������������
		//.���ڷ������Ա������ʵ����Ա

//8.����������ȼ�
//���ﲻ׸����ϸ���뷭��

//9.��������ת��
//��1��������������֮���ת��
//�����������͵ͼ����͵��߼����͵�����byte��short,char,int,long,float,double
//�Զ���������ת�����ͼ���߼���������ת��
//���������ʽ�У������byte��int��float��double�͵����ݣ���ͼ����ͻ��Զ�ת����ͬ�߼����ͣ��ٽ��м���
		byte a1=54;
		char a2='c';
		int a3=3242;
		float a4=324.32F;
		float a5=a1+a2*a3+a4;	//a1,a2,a3���Զ�ת��Ϊfloat�ͣ�ע��a5���ܶ���Ϊint��
//ǿ����������ת��
//���ڸ߼�����������ͼ���������ת�������ܻᵼ����������;��Ƚ��ͣ���Ҫ����ʹ��
		int b1=(int)7.5;
		byte b2=(byte)342;
//��2���ַ�����������������֮��Ļ���ת��		��δѧϰ��
//��3��������������֮��Ļ���ת��				��δѧϰ��
	}
}


//����������䣨д�ڷ������ڣ�
//1.��֧��䣨if��䡢switch��䣩
//2.ѭ����䣨forѭ����䡢whileѭ����䣩
//3.��ת��䣨break��ת��䡢continue��ת��䡢return��ת��䣩

class contro {
	void contr01() {
//(1)if���
//��ʽ1��if�����ʽ��{Java���}		
//��ʽ2��if�����ʽ��{Java���}else{Java���}		
//��ʽ3��if�����ʽ��{Java���}else if�����ʽ��{Java���}........
		if(3>4) {/*java���*/}else {/*java���*/}
		if(1<2) {/*java���*/};
		if(4>2) {}else if(3<2) {}

//��2��switch���
//��ʽ:	switch(���ʽ) {
//		case �������ʽ1:/*java���*/;[break];
//		case �������ʽ2:/*java���*/;[break];
//		case �������ʽ3:/*java���*/;[break];
//		default:/*java���*/;
//	}
		switch(1+1) {
		case 1:/*java���*/;break;
		case 3:/*java���*/;break;
		default:/*java���*/;
		}
		
//��3��forѭ�����
//��ʽ��for(��ʼ�����;ѭ���������������){java���}
		for(int iw=1;iw<10;iw++) {
			/*java���*/
		}
		
//(4)whileѭ�����
//��ʽ1��while�����ʽ��{/*java���*/}
//��ʽ2��do{/*java���*/}while;
		int qe=1;
		while(qe<3) {
			qe++;
		}
		int we=1;
		do {
			we=we+1;
		}while(we<3);		//ע�������while����û�з����ţ���ѭ������ǰ������	
		
		contr2();
	}
//��5����ת���break��continue��return
//break����ֹѭ���������������
//continue����������ѭ��
//return����һ���������أ����ѿ���Ȩ�������������������
	int contr2() {
		int er=1;
		while(er<2) {
			er++;
			if(3<4) {continue;}		//��������ѭ��
			er--;
		}
		while(er<4) {
			er++;
			if(3==3)break;			//��ֹwhileѭ��
			er--;
		}
		return 3;
	}
	
}

//�ߡ�������䣨д�ڷ������ڣ�

//��1��try...catch���
//��ʽ1��try{���ܲ����쳣�Ĵ���}catch(�쳣�� �쳣����){�쳣�������}...�������д���catch
//��ʽ2��try{���ܲ����쳣�Ĵ���}catch(�쳣�� �쳣����){�쳣�������}finally{Java���}
//�쳣����Ƕ��ʹ��
class yichang {
	void yichang1(){
		try {
			int a=3/0;					//�׳��쳣
		}catch (Exception E){			//�����쳣����󣬽�ס�쳣
			System.out.println(E.getMessage());		//ͨ���쳣��Ķ��󣬵�����Ӧ�ķ�����������Ϣ
			int b=10;									//����Ҳ����дһЩ��������
		}finally {
			int c=7;									//���۽������������ִ��finally����
		}
	}
}

//��2��throw���
//��ʽ1��throw+�쳣�����
//��ʽ2��throw+new �쳣�ࣨ����
//�����׳��쳣�����
class yic2{
	void yi23(){
		try {
			Exception yc=new Exception();	//����һ���쳣����
			throw yc;						//�׳��쳣�����
			//throw new Exception();			//�׳��쳣�����
		}catch (Exception a){
			int we=2;
		}
		synchronized (new Object()){int r=0;}
	}
}

//��3��synchronized�ؼ���
//��ʽ��synchronized (��ǰ����){Java���;}
//�������ó����ĳ�������Ϊͬ�����򣬵�һ���߳�ִ����δ���ʱ���������߳���Ҫ�ȴ�
class yic4{
	void yi24(){
		synchronized (new Object()){int r=0;}
	}
}

//��4��super�ؼ���
//���ڵ��ø���Ĺ��췽������ʽ��super([�����б�])
//���ڲ��������б����صĳ�Ա��������ʽ��super.��Ա������
//����ʹ�ø����б����ǵĳ�Ա��������ʽ��super.��Ա������([�����б�])

















	
	