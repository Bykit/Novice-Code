package commonClass;

/**
 *@title: ������ʼ�-Boolean��
 *@description: Boolean��λ��java.lang�������ѻ�����������boolean��װ��һ��������
 */

public class javaLangBoolean {
    public static void main(String[] args) {
        javaLangBoolean.classTest();
    }
    static void classTest(){
        Boolean b1=new Boolean(true);
        Boolean b2=new Boolean("true");
        System.out.println(b1);
        System.out.println(b2);
        /**
         * 2�����췽��
         */

        System.out.println("-------------------------");
        boolean b3=b1.booleanValue();
        boolean b4=b1.equals(false);
        String s1=b2.toString();
        System.out.printf(b1+"%n"+b4+"%n"+s1+"%n");
        /**
         * ��Ա����
         */

        System.out.println("-------------------------");
        boolean b5=Boolean.parseBoolean("true");
        boolean b6=Boolean.valueOf("true");
        String s2=Boolean.toString(true);
        System.out.printf(b5+"%n"+b6+"%n"+s2+"%n");
        /**
         * �෽��
         * parseBoolean()������ valueOf()���������԰��ַ���ת�� boolean��
         */

        System.out.println("-------------------------");
        System.out.printf(Boolean.TRUE+"%n"+Boolean.FALSE+"%n"+Boolean.TYPE+"%n");
        /*Boolean�����������*/
    }
}