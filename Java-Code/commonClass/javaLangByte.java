package commonClass;

/**
 *@title: ������ʼ�-Byte��
 *@description: Byte��λ��java.lang��
 */

public class javaLangByte {
    public static void main(String[] args) {
        javaLangByte.classTest();
    }
    static void classTest(){
        //Byte b=new Byte(15);
        /*����int��ûתbyte��*/
        byte myb=15;
        Byte b1=new Byte(myb);
        Byte b2=new Byte("12");
        Byte b3;
        /**
         * �������췽��
         */

        byte b4=b1.byteValue();
        int b5=b1.compareTo(b2);
        double b6=b1.doubleValue();
        int b7=b1.intValue();
        boolean b11=b1.equals(b2);
        String b9=b1.toString();
        /**
         * ���ó�Ա����
         */

        byte b8=Byte.parseByte("55");
        byte b12=Byte.valueOf("122");
        String b10=Byte.toString(b1);
        /**
         * �����෽��
         */

        System.out.println("byte���͵����ֵΪ��"+Byte.MAX_VALUE);
        System.out.println("byte���͵���СֵΪ��"+Byte.MIN_VALUE);
        System.out.println("byte���͵Ķ�����λ����"+Byte.SIZE);
        System.out.println(Byte.TYPE);
        /**
         * Byte��ĳ���
         */

    }
}