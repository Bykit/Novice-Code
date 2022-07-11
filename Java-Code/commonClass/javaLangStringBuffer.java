package commonClass;

/**
 *@title: ������ʼ�-StringBuffer��
 *@description: StringBuffer��λ��java.lang������ String��һ�������������ַ��������ڲ���ʵ�ַ�ʽ��ͬ������Ҳ��ͬ
 */

public class javaLangStringBuffer {
    public static void main(String[] args) {
        javaLangStringBuffer.classTest();
    }
    static void classTest(){
        StringBuffer str1=new StringBuffer();/*Ĭ������Ϊ16���ַ�*/
        StringBuffer str2=new StringBuffer(10);/*�ö���ĳ�ʼ����*/
        StringBuffer str3=new StringBuffer("hello world!");/*��ֵ*/
        System.out.println(str3);
        System.out.println(str3.length());
        /*StringBuffer����3�����췽��*/

        //str1="ewq";
        /*����ĸ�ֵ���뱨��*/

        System.out.println(str3.append(12));
        str1.append("ABCDEFG");
        str2.append("�����Ͽ�");
        str3.append(123);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        /**
         * append()��������ԭ�ַ�����׷�ӣ����������¸�ֵ
         */

        System.out.println(str1.charAt(3));
        str1.setCharAt(3,'2');
        System.out.println(str1);
        str1.deleteCharAt(3);
        System.out.println(str1);
        str1.insert(3,'d');
        System.out.println(str1);
        str1.reverse();
        System.out.println(str1);
        str1.replace(3,4,"D");
        System.out.println(str1);
        /**
         * setCharAt()�滻�ַ�
         * deleteCharAt()ɾ���ַ�
         * insert()�����ַ���
         * reverse()��ת�ַ���
         * replace()�滻�ַ���
         * ...
         */

        //String strr=str1;
        /*������ͬ���Ͳ���ֱ��ǿ��ת��*/

        String strr=str1.toString();
        System.out.println(strr);
        StringBuffer str4=new StringBuffer(strr);
        System.out.println(str4);
        /**
         * String���StringBuffer�Ļ���ת��
         */

    }
}