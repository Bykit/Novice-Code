package commonClass;

import java.util.Date;
import java.util.Locale;

/**
*@title: ������ʼ�-Date��
*@description: Date��λ��java.util�������ڴ���ʱ��������
*/
public class javaUtilDate {
    public static void main(String[] args) {
        javaUtilDate.ConstructionMethod();
    }

    static void ConstructionMethod(){
        Date today=new Date();
        System.out.println(today);
        Date data1=new Date(1000);
        Date data2=new Date(-1000);
        System.out.println(data1);
        System.out.println(data2);
        /**
         * �޲����Ĺ��췽�������ص�ǰ������ʱ��
         * �������Ĺ��췽������1970��1��1�գ��������ʱ�䣩��������
         * �����1000��ʾ1000���룬Ҳ����һ��
         */

        System.out.printf("��YYYY+MM+DD��ʽ��ʾ���ڣ�"+"%tF"+"\n",today);
        System.out.printf("��MM/DD/YY��ʽ��ʾ���ڣ�"+"%tD"+"\n",today);
        System.out.printf("��HH:MM:SS AM(ʮ��Сʱ��)��ʽ��ʾ���ڣ�"+"%tr"+"\n",today);
        System.out.printf("��HH:MM:SS(��ʮ��Сʱ��)��ʽ��ʾ���ڣ�"+"%tT"+"\n",today);
        System.out.printf("��HH:MM(��ʮ��Сʱ��)��ʽ��ʾ���ڣ�"+"%tR"+"\n",today);
        /**
         * ���ں�ʱ��ĸ�ʽ�����
         */

        System.out.printf(Locale.US,"��ȡ�·ݼ�ƣ�"+"%tb"+"%n",today);
        System.out.printf(Locale.US,"��ȡ�·�ȫ�ƣ�"+"%tB"+"%n",today);
        System.out.printf("��ȡ�·ݼ�ƣ�"+"%tb"+"%n",today);
        System.out.printf("��ȡ�·�ȫ�ƣ�"+"%tB"+"%n",today);
        System.out.printf(Locale.US,"��ȡ���ڼ�ƣ�"+"%ta"+"%n",today);
        System.out.printf(Locale.US,"��ȡ����ȫ�ƣ�"+"%tA"+"%n",today);
        System.out.printf("��ȡ���ڼ�ƣ�"+"%ta"+"%n",today);
        System.out.printf("��ȡ����ȫ�ƣ�"+"%tA"+"%n",today);
        System.out.printf("��ȡ�꣺"+"%tY"+"%n",today);
        System.out.printf("��ȡ�����λ��"+"%ty"+"%n",today);
        System.out.printf("��ȡ��ǰ��λ��"+"%tC"+"%n",today);
        System.out.printf("��ȡ�£�"+"%tm"+"%n",today);
        System.out.printf("��ȡ�գ�"+"%td"+"%n",today);
        System.out.printf("��ȡ�գ�������λǰ�治���㣩��"+"%te"+"%n",today);
        System.out.printf("��ȡtodayʱ��Ϊ����ĵڼ��죺"+"%tj"+"%n",today);
        /**
         * ���ڵĸ�ʽ�����
         */

        System.out.printf("��ȡ24Сʱ�Ƶ�Сʱ��"+"%tH"+"%n",today);
        System.out.printf("��ȡ24Сʱ�Ƶ�Сʱ��������λ���治��0����"+"%tk"+"%n",today);
        System.out.printf("��ȡ12Сʱ�Ƶ�Сʱ��"+"%tI"+"%n",today);
        System.out.printf("��ȡ12Сʱ�Ƶ�Сʱ��������λ���治��0����"+"%tl"+"%n",today);
        System.out.printf("��ȡ���ӣ�"+"%tM"+"%n",today);
        System.out.printf("��ȡ�룺"+"%tS"+"%n",today);
        System.out.printf("��ȡ3λ���룺"+"%tL"+"%n",today);
        System.out.printf("��ȡ9λ���룺"+"%tM"+"%n",today);
        System.out.printf("��ʾ�������ǣ�"+"%tp"+"%n",today);
        System.out.printf(Locale.US,"��ʾ�������ǣ�"+"%tp"+"%n",today);
        /**
         * ʱ��ĸ�ʽ�����
         */
    }
}

/**
 * һЩ�뷨
 * Date�����дһ������ʱ���
 */