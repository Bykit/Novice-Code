package commonClass;

import java.util.Random;

/**
 *@title: ������ʼ�-Random��
 *@description: Random��λ��java.util�������ڲ������������ Math�����������������
 */

public class javaUtilRandom {
    public static void main(String[] args) {
        javaUtilRandom.ClassTest();
    }
    static void ClassTest(){
        Random rd=new Random();
        System.out.println("����ʮ��int���������");
        for (int i = 0; i < 10; i++) {
            System.out.println(rd.nextInt());
        }
        /**
         * nextInt()���ڲ�������������Ǿ�̬������ʹ����Ҫ��������
         */

        System.out.println("---------------------------------------");
        System.out.println("����ʮ��boolean���������");
        for (int i = 0; i < 10; i++) {
            System.out.println(rd.nextBoolean());
        }

        System.out.println("---------------------------------------");
        System.out.println("����ʮ��ָ����Χ�������");
        for (int i = 0; i < 10; i++) {
            System.out.println(rd.nextInt(100));
        }
        /**
         * nextInt()���أ�һ��������ʾ���� ���㵽ָ��������Χ�� �������
         */

    }
}