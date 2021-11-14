package consumer_manage;

public class Consumer 
{
		private String name;
		private String sex;
		private int age;
		private String telephone;
		private String email;
		
		//属性get方法书写
		public String getName()
		{
			return this.name;
		}
		public String getSex()
		{
			return this.sex;
		}
		public int getAge()
		{
			return this.age;
		}
		public String getTelephone()
		{
			return this.telephone;
		}
		public String getEmail()
		{
			return this.email;
		}
		
		//set属性设置
		public  void setName(String name)
		{
			this.name=name;
		}
		public void setSex(String sex) 
		{
			this.sex = sex;
		}
		public void setAge(int age) 
		{
			this.age = age;
		}
		public void setTelephone(String telephone) 
		{
			this.telephone = telephone;
		}
		public void setEmail(String email) 
		{
			this.email = email;
		}
		
		
		//构造器设置
		public Consumer(String name, String sex, int age, String telephone, String email) 
		{
			this.name = name;
			this.sex = sex;
			this.age = age;
			this.telephone = telephone;
			this.email = email;
		}
		
		
		
		
}
