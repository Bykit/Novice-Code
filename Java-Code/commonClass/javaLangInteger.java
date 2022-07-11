package commonClass;

/**
 *@title: ������ʼ�-Integer��
 *@description:
 * Integer��λ��java.lang�����Ƿ�װ������������ int���࣬intΪ Integer���һ��ʵ������
 * Long��,Short��� Integer�������ͬ������ֻдInteger��ıʼ�
 */

public class javaLangInteger {
    public static void main(String[] args) {
        javaLangInteger.classTest();
    }
    static void classTest(){
        System.out.println("int���Ϳ�ȡ���ֵ��"+Integer.MAX_VALUE);
        System.out.println("int���Ϳ�ȡ��Сֵ��"+Integer.MIN_VALUE);
        System.out.println("int���͵Ķ�����λ����"+Integer.SIZE);
        System.out.println(Integer.TYPE);
        /**
         * Integer�����ĸ�����
         */

        Integer n1=new Integer(100);
        Integer n2=new Integer("100");
        int n3=n1+n2;
        System.out.println(n3);
        /**
         * Integer�����������췽��
         */

        System.out.println("---------------------------------");
        System.out.println(n1.byteValue());
        System.out.println(Integer.compare(100,232));
        System.out.println(Integer.compare(100,100));
        System.out.println(Integer.compare(100,50));
        System.out.println(Integer.valueOf("213"));
        System.out.println(Integer.parseInt("423"));
        System.out.println("1000��ʮ���Ʊ�ʾΪ��"+Integer.toString(1000));
        System.out.println("1000�Ķ����Ʊ�ʾΪ��"+Integer.toBinaryString(1000));
        System.out.println("1000��ʮ�����Ʊ�ʾΪ��"+Integer.toHexString(1000));
        System.out.println("1000�İ˽��Ʊ�ʾΪ��"+Integer.toOctalString(1000));
        /**
         * �����෽��
         */

        System.out.println("--------------------------------------");
        System.out.println(n1.equals(100));
        System.out.println(n1.compareTo(200));
        System.out.println(n1.intValue());
        System.out.println(n1.shortValue());
        System.out.println(n1.toString());
        /**
         * ���ó�Ա����
         */

        String str[]={"10","20","30","40","50"};
        int sum=0;
        for (int i = 0; i < str.length; i++) {
            int s=Integer.parseInt(str[i]);
            sum=sum+s;
            System.out.println("��ǰ�ۼӵĽ��Ϊ��"+sum);
        }
        /**
         * parseInt()�����ַ���ת int��
         */

        System.out.println("------------------------------");
        String str1[]={"10","20","30","40","50"};
        int sum1=0;
        for (int i = 0; i < str.length; i++) {
            int s=Integer.valueOf(str[i]);
            sum1=sum1+s;
            System.out.println("��ǰ�ۼӵĽ��Ϊ��"+sum1);
        }
        /**
         * valueOf()Ҳ��ת���ַ���Ϊ int��
         */
    }
}