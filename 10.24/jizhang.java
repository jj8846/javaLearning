//scan导包
import java,util,Scanner;
//scan实例化
Scanner scan=new Scanner(System.in);

class jizhang
{
	public static void main(String[] s)
	 {
		    //钱
			int money=10000;
			//打印用户界面
			do
			{
				System.out.println("--------------------家庭收支记账软件--------------------");
				System.out.println("                           1、收支明细                      ");
				System.out.println("                           2、登记收入                      ");
				System.out.println("                           3、登记支出                      ");
				System.out.println("                           4、退       出                      ");
				System.out.println("                             选择（1-4）                      ");
				int choose=scan.nextInt();
				switch()
				{
						case 1:
							break;
						case 2:
							System.out.println("本次收入:>");
							System.out.println("本次收入说明:>");
							break;
						case 3:
							System.out.println("本次支出:>");
							System.out.println("本次支出说明:>");
							break;
						case 4:
							System.out.println("退出成功");
							break;
						default:
							System.out.println("您的输入有误，请重新输入");
							break;
				}
			}
			while (choose==4);
	 }
}