package commonClass;

/**
 *@title: ������ʼ�-Double��
 *@description: Double��λ��java.lang��,��Float�����ƣ�Float�಻��д�ʼ�
 */

public class javaLangDouble {
    public static void main(String[] args) {
        javaLangDouble.classTest();
    }
    static void classTest(){

        /* ���췽�� */
        Double d1=new Double(43.34);
        Double d2=new Double("4135.4234");

        /* ���� */
        System.out.println("���ָ����"+Double.MAX_VALUE);
        System.out.println("��Сָ����"+Double.MIN_VALUE);
        System.out.println("���渺�����ĳ�����"+Double.NEGATIVE_INFINITY);
        System.out.println("���渺�����ĳ�����"+Double.POSITIVE_INFINITY);

        /* ���ó�Ա���� */
        byte b1=d1.byteValue();
        int b2=d1.compareTo(3223.32);
        boolean b3=d1.equals(13);
        int b4=d1.intValue();
        boolean b5=d1.isNaN();/*�ж�doubleֵ�Ƿ�Ϊ�����֣�NaN��ֵ*/
        String b6=d1.toString();

        /* �����෽�� */
        double b7=Double.valueOf("21312.321");
        double b8=Double.parseDouble("243234.323");

        /**
         * ������ Number�࣬λ��java.lang��
         * ������ Number����BigDecimal��BigInteger��Byte��Double��Float��Integer��Long��Short��ĸ��࣬
         * Number�����������ṩ����ʾ����ֵת��Ϊbyte��double��float��int��long��short�ķ�����
         * ����Ϊ Number��ķ�����Number����������඼�������г�Ա����
         */
        byte z1=d1.byteValue();
        int z2=d1.intValue();
        float z3=d1.floatValue();
        short z4=d1.shortValue();
        long z5=d1.longValue();
        double z6=d1.doubleValue();

    }
}