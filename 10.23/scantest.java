//����
import java.util.Scanner;


class scantest
{
	public static void main(String[] a)
	{/*
			//scannerʵ����
			Scanner scan=new Scanner(System.in);
			//����������ͣ�����%d��ת����
			//int num1=scan.nextInt();
			//System.out.println(num1);


			System.out.println("�������������:>");
			String name = scan.next();
			System.out.println(name);

			System.out.println("�������������:>");
			int age=scan.nextInt();
			System.out.println(age);
			*/
/*
			//scannerʵ����
			Scanner scan=new Scanner(System.in);



			System.out.println("�����������ĩ�ɼ�");
			int result = scan.nextInt();
			if(result==100)
				System.out.println("����һ��BMW");
			else if(result>80 && result<=99)
		        System.out.println("����ipone pro max");
			else if(result>=60 && result<=80)
				System.out.println("����ipad");
			else
				System.out.println("ȥ������");
*/
/*
//scannerʵ���� 
			Scanner scan=new Scanner(System.in);


			System.out.println("��������������");
			int num1=scan.nextInt();
			int num2=scan.nextInt();
			int num3=scan.nextInt();
			int max=num1>num2?num1:num2;
			max=max>num3?max:num3;

			System.out.println("���ֵ��:>"+max);
			*/


			//scannerʵ����
			Scanner scan=new Scanner(System.in);
			
			System.out.println("������������:>(��λ��cm)");
			int height=scan.nextInt();

			System.out.println("��������ĲƸ�:>(��λ����)");
			int money=scan.nextInt();

			System.out.println("��˧��? (true or false)");
			Boolean handsome=scan.nextBoolean();

			if(height>180 && money>1000 && handsome==true)
				System.out.println("��һ��Ҫ�޸�������");
			else if(height>180 || money>1000 || handsome==true)
				System.out.println("�ް�");
			else
				System.out.println("����");
	}
}