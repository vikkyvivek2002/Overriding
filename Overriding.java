class parent
{
	public void show ()
	{
		System.out.println("Parent class ");
	}
}
class Child extends parent 
{
	public void show ()
	{
		System.out.println("Overriding parent class :");
	}
}
public class Overriding {

	public static void main(String[] args) {
		
		Child obj = new Child();
		obj.show();

	}

}
