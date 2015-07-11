package core;

public class CustomerBo implements Service {
	/* (non-Javadoc)
	 * @see core.Customer#display(java.lang.String)
	 */
	@Override
	public void display(String user)
	{
		
		System.out.println("from Customer class WELCOME "+user);
	}

}
