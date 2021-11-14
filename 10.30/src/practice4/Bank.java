package practice4;

public class Bank 
{
		private Customer[] customers;
		private int numerOfCustomer;
		public Bank()
		{
			this.customers=new Customer[1000];
			this.numerOfCustomer=0;
		}
		
		public void addCustomer(String firstName,String lastName)
		{
				customers[numerOfCustomer]=new Customer(firstName, lastName);
				this.numerOfCustomer++;
		}
		public int getNuberOfCustomers()
		{
			return this.numerOfCustomer;
		}
		public Customer getCustomers(int index)
		{
			if(index>=0 && index<this.numerOfCustomer)
			    return this.customers[this.numerOfCustomer];
			else
				return null;
		}
}
