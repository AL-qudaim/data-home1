import java.util.Arrays;

public class home2 {
    public static void main(String[] args) {
        int [] d1={1,2,3,4,5};
        System.out.println("d1="+Arrays.toString(d1));
      int []d2=new int[5];
        System.out.println();
        //���� ���� ���� ���� ����� �������� ����� �� ���� �� �������� �������

            System.arraycopy(d1,0,d2,0,5);
            //���� ���� ���� ��� ����� ��������
            System.out.println("d2");
            for (int i = 0; i < d2.length; i++) {
                System.out.print(d2[i]+",");
            }


        }

}
