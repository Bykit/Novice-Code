package commonClass;

/**
 *@title: ������ʼ�-Math��
 *@description: Math��λ��java.lang�����������������ѧ������෽��(��̬����)
 */

public class javaLangMath {
    public static void main(String[] args) {
        javaLangMath.ClassTest();

    }

    static void ClassTest(){
        System.out.println(Math.E);
        System.out.println(Math.PI);
        /**
         * Math����������̬�ĳ�����E��PI
         * �ֱ�Ϊ��Ȼ����e,Բ���� ��
         */

        System.out.printf(
                "���ز���a�ľ���ֵ��"+Math.abs(-2323)+"%n"+
                "���ز���a��b�����ֵ��"+Math.max(10,100)+"%n"+
                "���ز���a��b����Сֵ��"+Math.min(10,100)+"%n"+
                "���ز���a��b���ݣ�"+Math.pow(10,3)+"%n"+
                "���ز���a��ƽ������"+Math.sqrt(100)+"%n"+
                "���ز���a�Ķ�����"+Math.log(100)+"%n"+
                "���ز���a��b�����ֵ��"+Math.max(10,100)+"%n"+
                "���ز���a������ֵ��"+Math.sin(10)+"%n"+
                "����һ��0��1���������������0��1����"+Math.random()+"%n"
        );
        /**
         * �����ӡ��Ϊ���÷���
         */

    }
}