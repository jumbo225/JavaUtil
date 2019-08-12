package examples;

class Simple{
	public void me(int i)
	{
		System.out.println("Hai"+i);
	}
}

public class ReflectionForName {
	public static void main(String[] args) {
		try{
			Class c=Class.forName("examples.Simple");
			System.out.println(c.getName());
			examples.Simple s=(Simple)c.newInstance();
			s.me(4);
			System.out.println("hello");			
		}catch(Exception e)
		{
			e.printStackTrace();
		}		
	}

}

