//scan����
import java,util,Scanner;
//scanʵ����
Scanner scan=new Scanner(System.in);

class jizhang
{
	public static void main(String[] s)
	 {
		    //Ǯ
			int money=10000;
			//��ӡ�û�����
			do
			{
				System.out.println("--------------------��ͥ��֧�������--------------------");
				System.out.println("                           1����֧��ϸ                      ");
				System.out.println("                           2���Ǽ�����                      ");
				System.out.println("                           3���Ǽ�֧��                      ");
				System.out.println("                           4����       ��                      ");
				System.out.println("                             ѡ��1-4��                      ");
				int choose=scan.nextInt();
				switch()
				{
						case 1:
							break;
						case 2:
							System.out.println("��������:>");
							System.out.println("��������˵��:>");
							break;
						case 3:
							System.out.println("����֧��:>");
							System.out.println("����֧��˵��:>");
							break;
						case 4:
							System.out.println("�˳��ɹ�");
							break;
						default:
							System.out.println("����������������������");
							break;
				}
			}
			while (choose==4);
	 }
}