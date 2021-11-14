package consumer_manage;

public class ConsumerList 
{
	    CMUtility CMU=new CMUtility();
	 
		private Consumer[] consumers;
		private int total;
		
		//构造器
		public ConsumerList(int ListTotal)
		{
			this.total=0;
			consumers=new Consumer[ListTotal];
		}
		//添加客户
		public boolean addConsumer(Consumer consumer) 
		{
			if(this.total>=this.consumers.length)
			{
				return false;
			}
			consumers[total]=consumer;
			total++;
			return true;
		}
		//修改客户信息
		public boolean replaceConsumer(int index, Consumer consumer)
		{
			if(index<0 || index>=total)
			{
				return false;
			}
			consumers[total]=consumer;
			return true;
		}
		//删除客户信息
		public boolean deleteConsumer(int index)
		{
			if (index<0 || index>=total) 
			{
				return false;
			}
			for(int i=index;i<total;i++)
			{
				consumers[i]=consumers[i+1];
			}
			total--;
			return true;
		}
		//显示所有客户信息
		public Consumer[] getAllConsumers() 
		{
			Consumer[] consumers1=new Consumer[total];
			for(int i=0;i<total;i++)
			{
				consumers1[i]=consumers[i];
			}
			
			return consumers1;
		}
		//查询某个客户信息
		public Consumer getConsumer(int index) 
		{
			if(index<0 || index>=total)
			{
				return null;
			}
			return consumers[index];
		}
		//获取客户总数
		public int getTotal()
		{
			return total;
		}

		
		
		
		
	
}
