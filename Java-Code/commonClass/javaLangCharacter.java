package commonClass;

/**
 *@title: ������ʼ�-Character��
 *@description: Character��λ��java.lang��
 */

public class javaLangCharacter {
    public static void main(String[] args) {
        javaLangCharacter.classTest();
    }
    static void classTest(){
        Character mychar=new Character('a');
        /*���췽��*/

        System.out.println(Character.MAX_VALUE);
        System.out.println(Character.MIN_RADIX);
        System.out.println(Character.TYPE);
        System.out.println(Character.MATH_SYMBOL);
        System.out.println("--------------------------");
        /**
         * Character��ĳ����϶࣬����ɶ��˼��Ҳ������
         */

        char c1=Character.toUpperCase('a');
        char c2=Character.toLowerCase(c1);
        boolean b1=Character.isUpperCase('A');
        boolean b2=Character.isLowerCase('A');
        System.out.printf(c1+"%n"+c2+"%n"+b1+"%n"+b2+"%n");
        /**
         * ��Сдתд���෽�������д�Сд�жϵ��෽��
         * ���������������İ�װ�����ƣ�����ûд
         */

    }
}