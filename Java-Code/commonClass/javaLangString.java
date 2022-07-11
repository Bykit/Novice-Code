package commonClass;

/**
*@title: ������ʼ�-String��
*@description: String��λ��java.lang������һ��ר�����������ַ�����
*/
public  class javaLangString {
    public static void main(String[] args) {
        System.out.print("Hello World!");
        javaLangString.createStringObject();
        javaLangString.CommonMethod();
    }

    /**
    *@title: �����ʹ�ӡ����ַ�������
    */
    static void createStringObject(){
        String aStr=null;
        /**
         * null��һ���ؼ��֣�������ʶһ����ȷ���Ķ���
         * ��˿��Խ�null�����������ͱ������������Խ�null�����������ͱ�����
         * ���磺int a = null;�Ǵ���ġ�Ojbect o = null����ȷ�ġ�
         */
        String bStr="";
        String cStr="���ݽṹ";
        String dStr=new String("���ݽṹ");
        /*����������һ����*/

        System.out.println(aStr+bStr+cStr+dStr);
        System.out.println("�绰"+123321);
        System.out.println("This is"+true);
        String a1Str="�ҵ�WeChat��"+12345678;
        float xb=34.3424F;
        String a2Str="����xb��ֵΪ��"+xb;
        System.out.println(a1Str);
        System.out.println(a2Str);
        /**
         * ����һ������ԪΪString���ͣ���Ӻ����������ַ���
         * �������������Զ�ת��Ϊ�ַ��������������Զ����������ö����toString()�������һ���ַ���
         * */
    }

    /**
    *@title:String�ೣ�÷���
    */
    static void CommonMethod(){
        String aStr="ABC";
        System.out.println(aStr.equals("abc"));
        System.out.println(aStr.equalsIgnoreCase("abc"));
        /**
         * equals()�������ڱȽ��ַ����Ƿ���ȣ�����ֵΪ������
         * equalsIgnoreCase()����Ҳ���ڱȽ��ַ����Ƿ���ȣ������ִ�Сд
         */

        System.out.println(aStr.startsWith("a"));
        System.out.println(aStr.endsWith("C"));
        System.out.println(aStr.startsWith("B",1));
        /**
         * startsWith()���������ж��ַ����Ƿ���ָ���ַ�����ʼ
         * endsWith()���������ж��ַ����Ƿ���ָ���ַ�������
         * startsWith()��������һ�����ط������ڶ�������ָ����ʼ��λ��
         */

        System.out.println(aStr.compareTo("�����"));
        /**
         * compareTo()�����������ַ����Ƚϴ�С�������������ֵ��е�λ��
         * ����ֵΪint���ͣ�������ַ�����ȣ��򷵻� 0��
         */

        String bStr="abDcCDcE";
        System.out.println(bStr.length());
        System.out.println(bStr.toLowerCase());
        System.out.println(bStr.toUpperCase());
        /**
         * length()�����ַ�������
         * toLowerCase()�ַ������������ĸ��ΪСд
         * toUpperCase()�ַ������������ĸ��Ϊ��д
         */

        System.out.println(bStr.indexOf("Dc"));
        System.out.println(bStr.lastIndexOf('D'));
        System.out.println(bStr.indexOf('c',4));
        /**
         * �����ַ���
         * indexOf()���ڻ�ȡָ���ַ�����ԭ�ַ����е�һ�γ��ֵ�����
         * lastIndexOf()���ڻ�ȡָ���ַ�����ԭ�ַ��������һ�γ��ֵ�����
         * ���������������ж���ع�����
         */

        String cStr="ABCDEFG";
        System.out.println(cStr.substring(3));
        System.out.println(cStr.substring(3,5));
        /**
         * substring()��ȡ�ַ���
         * һ��������ʾ������A��ʼ��ȡ�����
         * �������أ�����������ʾ������A��ȡ������B
         */

        String dStr="  go to school  ";
        System.out.println(dStr);
        System.out.println(dStr.trim());
        /**
         * trim()����ȥ����β�ո�
         */

        String eStr="NBA_NBA_NBA";
        System.out.println(eStr.replace('N','M'));
        System.out.println(eStr.replaceAll("NB","AA"));
        System.out.println(eStr.replaceFirst("N","M"));
        /**
         * replace()�滻ԭ�ַ������ָ���ַ�
         * replaceAll()�滻ԭ�ַ������ָ�����ַ���
         * replaceFirst()�滻ԭ�ַ�����ĵ�һ�����ַ���
         */

        String fStr="���졢�����ꡢ���η硢��";
        String[] a_fStr=fStr.split("��");
        System.out.println(fStr);
        for (int i = 0; i < a_fStr.length; i++) {
            System.out.println(a_fStr[i]);
        }
        String[] b_fStr=fStr.split("��",3);
        for (int i = 0; i < b_fStr.length; i++) {
            System.out.println(b_fStr[i]);
        }
        /**split()�ָ��ַ���
         * ��һ������Ϊ�ָ���򣬵ڶ�������Ϊ�ָ�����Ӧ�ô�����ҲΪ���鳤��
         * �÷����ж�����ط���
         */

        String gStr=String.format("%e",16.8);
        System.out.println(gStr);
        int xa=100;
        System.out.printf("���Ǳ���xa��ֵ��%d%n",xa);
        System.out.printf("%s\n","A");
        /**
         * format()���ڸ�ʽ���ַ�������һ����̬����
         * �÷���ͨ�������� Formatter����󣬲�����
         * printf()Ϊ��ʽ����ӡ�������س����ܣ�����String��ķ���
         * ��ʽ��ת������ת Formatter��ʼǿ���
         */
    }

}

/**
 * һЩ�뷨
 * String����������ж����֤�Ż��ֻ��������Ƿ�Ϸ�
 * ���Ը������֤��ȥ�Զ�������ա��Ա����Ϣ
 */