package commonClass;

import java.util.Scanner;

/**
*@title: ������ʼ�-Scanner��
*@description: Scanner��λ��java.util��������ʵ�ֳ���Ա�����룬
*/

public class javaUtilScanner {
    public static void main(String[] args) {
        //javaUtilScanner.inputTest();
        /*��ע�͵���һ�У���ִ����һ�У��������׳��쳣�󣬺��治������������*/
        //javaUtilScanner.OtherTests();
        javaUtilScanner.hntouTask();
    }

    static void inputTest(){
        Scanner scan = new Scanner(System.in);
        /* ���췽�����ڣ���˵��������������ݣ�System.in(��������)*/

        System.out.print("�������������0��");
        System.out.println("��next�������գ���������0��"+scan.next());

        System.out.print("�������������1��");
        String str1=scan.next();
        System.out.println("��next�������գ���������1��"+str1);
        /**
         * next()���������ڷ��ؽ��յ��ַ���������ֵΪstring
         * 1��һ��Ҫ��ȡ����Ч�ַ���ſ��Խ������롣
         * 2����������Ч�ַ�֮ǰ�����Ŀհף�next() �������Զ�����ȥ����
         * 3��ֻ��������Ч�ַ���Ž����������Ŀհ���Ϊ�ָ������߽�������
         * 4��next() ���ܵõ����пո���ַ�����
         */

        System.out.print("�������������2��");
        System.out.println("��next�������գ���������2��"+scan.next());
        /*next()�ظ�ʹ�ã�������һ������*/

        Scanner scan2 = new Scanner(System.in);
        System.out.print("�������������3��");
        System.out.println("��next�������գ���������3��"+scan2.nextLine());
        /**
         * nextLine()Ҳ���ڷ��ؽ��յ��ַ�������next()��ͬ
         * 1����EnterΪ������,Ҳ����˵ nextLine()�������ص�������س�֮ǰ�������ַ���
         * 2�����Ի�ÿհס�
         */

        try {
            scan2.close();
            System.out.print("���������������4��");
            System.out.println("��next�������գ���������4��"+scan2.nextLine());
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        /**
         * close()���ڹر�Scanner����
         * ���������׳��쳣
         */

    }

    static void OtherTests(){
        Scanner scan=new Scanner(System.in);
        System.out.print("����1��");

        System.out.println("����������Ƿ�Ϊ�ַ�����" + scan.hasNext());
        System.out.println("����������Ƿ�Ϊ�ַ�����" + scan.hasNextLine());
        System.out.println("����������Ƿ�Ϊ�����ͣ�" + scan.hasNextBoolean());
        System.out.println("����������Ƿ�Ϊint�ͣ�" + scan.hasNextInt());
        System.out.println("���������Ϊ��" + scan.next());

        System.out.println("-----------------------------------------");

        System.out.println("���������Ϊ��" + scan.next());
        System.out.println("����������Ƿ�Ϊ�ַ�����" + scan.hasNext());
        System.out.println("����������Ƿ�Ϊ�ַ�����" + scan.hasNextLine());
        System.out.println("����������Ƿ�Ϊ�����ͣ�" + scan.hasNextBoolean());
        System.out.println("����������Ƿ�Ϊint�ͣ�" + scan.hasNextInt());
        /*�۲���δ���ģ��ȽϺ����������*/
        /*���룺��Ϊ��һ�������Ѿ���ȡ�����ˣ����Բ�����ȥ��hasNext()�ȷ���ȥ�жϣ���Ҫ�������µ�����*/

        /**
         * hasNext()��hasNextLine()�������ݺ��ж��Ƿ�ΪString���ͣ�����ֵΪ������
         * (ע����hasxXxx()�жϣ���nextXxx()�ö�ȡ),��Ȼ�ͻᱻҪ���������룬��ʱ����㡣
         * ���Ҫ���� int �� float ���͵����ݣ��� Scanner ����Ҳ��֧�֣�
         * ����������֮ǰ�����ʹ�� hasNextXxx() ����������֤����ʹ�� nextXxx() ����ȡ��
         */

        System.out.println("-----------------------------------------");

        Scanner scan1 = new Scanner(System.in);
        System.out.print("����������");
        if (scan1.hasNextInt()) {
            /* �ж�������Ƿ������� */
            System.out.println("�������ݣ�" + scan1.nextInt());
        } else {
            System.out.println("����Ĳ���������");
        }

        System.out.print("����С����");
        Scanner scan2 = new Scanner(System.in);
        if (scan2.hasNextFloat()) {
            // �ж�������Ƿ���С��
            System.out.println("С�����ݣ�" + scan2.nextFloat());
        } else {
            System.out.println("����Ĳ���С����");
        }
        scan.close();

    }

    static void hntouTask(){
        /**
         * ��ҵ�⣬һֱû��ͨ�����ԣ���Ϊ����һ��ð��
         */
        Scanner a1=new Scanner(System.in);
        System.out.println("��¼���϶������Ϣ��");
        System.out.println("������������");
        String q1=a1.nextLine();

        System.out.println("���������䣺");
        String q2=a1.nextLine();

        System.out.println("�������Ա�");
        String q3=a1.nextLine();

        System.out.println("���������أ�");
        String q4=a1.nextLine();

        System.out.println("�������ַ��");
        String q5=a1.nextLine();

        System.out.println("�������Ƿ��ѻ飺");
        String q6=a1.nextLine();

        System.out.println("��Ϣ���£�");

        System.out.println("\t������"+q1);
        System.out.println("\t���䣺"+q2+"��");
        System.out.println("\t�Ա�"+q3);
        System.out.println("\t���أ�"+q4+"kg");
        System.out.println("\t��ַ��"+q5);
        System.out.println("\t���"+q6);
    }
}