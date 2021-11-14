package consumer_manage;

import java.text.BreakIterator;
import java.util.Scanner;

public class ConsumerView 
{
	    //ConsumerList\CMU的实例化 
		ConsumerList consumerList=new ConsumerList(5);
	    CMUtility CMU=new CMUtility();
		//进入主菜单 
		public void enterMainMenu()
		{
			
			//input作为菜单输入值
			char input;
			head:do
			{
				System.out.println("----------客户信息管理软件----------");
				System.out.println();
				System.out.println("\t"+" 1.添加客户"+"\t\t\t");
				System.out.println("\t"+" 2.修改客户"+"\t\t\t");
				System.out.println("\t"+" 3.删除客户"+"\t\t\t");
				System.out.println("\t"+" 4.客户列表"+"\t\t\t");
				System.out.println("\t"+" 5.退	 出"+"\t\t\t");
				System.out.println();
				System.out.println("请选择(1-5):");
				input=CMU.readMenuSelection();
				switch(input)
				{
				     case '1':
				    	 addNewConsumer();
				    	 break;
				     case '2':
				    	 modifyConsumer();
				    	 break;
				     case '3':deleteConsumer();
				    	 break;
				     case '4':
				    	 listAllConsumers();
				    	 break;
				     case '5':
				    	 char end=withdraw();
				    	 if(end=='N')
				    		 break;
				    	 else
				    	 {
				    		 break head;
				    	 }
				}
			}while(input != '5');
			
		}
		//添加新客户
		private void addNewConsumer()
		{
			System.out.println();
			System.out.println("----------添加客户---------");
			System.out.print("姓名:");
			String name=CMU.readString(5);
			System.out.print("性别:");
			String sex=CMU.readString(5);
			System.out.print("年龄:");
			int age=CMU.readInt();
			System.out.print("电话:");
			String telephone=CMU.readString(20);
			System.out.print("邮箱:");
			String email=CMU.readString(20);
			boolean end=consumerList.addConsumer(new Consumer(name,sex, age, telephone, email));
			if(end==true)
				System.out.println("----------添加完成----------");
			else
				System.out.println("----------添加失败----------");
			
			
		}
		//修改客户信息
		private void modifyConsumer()
		{
			System.out.println();
			System.out.println("----------修改客户---------");
			System.out.print("请选择要修改客户编号(-1退出):");
			int input=CMU.readInt();
			if(input == -1)
			{
				System.out.println("----------退出成功-----------");
				return ;
			}
			else
			{
				
				Consumer consumer=consumerList.getConsumer(input-1);
				if(consumer==null)
					{
						System.out.println();
					 	System.out.println("----------修改失败----------");
					 	System.out.println();
					 	return ;
					}
				System.out.print("姓名("+consumer.getName()+"):");
				consumer.setName(CMU.readString(5, consumer.getName()));
				System.out.print("性别("+consumer.getSex()+"):");
				consumer.setSex(CMU.readString(5, consumer.getSex()));
				System.out.print("年龄("+consumer.getAge()+"):");
				consumer.setAge(CMU.readInt(consumer.getAge()));
				System.out.print("电话("+consumer.getTelephone()+"):");
				consumer.setTelephone(CMU.readString(20, consumer.getTelephone()));
				System.out.print("邮箱("+consumer.getEmail()+"):");
				consumer.setEmail(CMU.readString(20, consumer.getEmail()));
				
				boolean end=consumerList.replaceConsumer(input, consumer);
				if(end ==true)
				      System.out.println("----------修改完成----------");
				else
					System.out.println("----------修改失败----------");
			}
		}
		//删除客户
		private void deleteConsumer()
		{
			System.out.println("请输入要删除的客户的序号:");
			int input=CMU.readInt();
			System.out.println("确认要删除吗？(Y/N)");
			char result=CMU.readConfirmSelection();
			if(result=='N')
				return;
			boolean end=consumerList.deleteConsumer(input);
			if(end==false)
			{
				System.out.println();
				System.out.println("输入有误，删除失败");
				System.out.println();
			}
			else
			{
				System.out.println();
				System.out.println("删除成功");
				System.out.println();
			}
		}
		//列出所有客户 
		private void listAllConsumers()
		{
			System.out.println();
			System.out.println("---------客户列表---------");
			System.out.println("编号\t姓名\t性别\t年龄\t电话\t\t邮箱\t\t\t\t ");
			for(int i=0;i<consumerList.getTotal();i++)
			{
				Consumer consumer1=consumerList.getAllConsumers()[i];
				System.out.println("  "+i+1+"\t"+consumer1.getName()+"\t"+consumer1.getSex()+"\t"+consumer1.getAge()+"\t"+consumer1.getTelephone()+"\t"+consumer1.getEmail());
			}
		}
		//退出程序
		private char withdraw()
		{
			System.out.println("确认退出吗？(Y/N)");
			char end=CMU.readConfirmSelection();
			return end;
		}
}
