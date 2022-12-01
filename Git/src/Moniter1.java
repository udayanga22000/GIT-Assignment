
public class Moniter1 {

	public static void main(String[] args) {
		Moniter moniter1 = new Moniter();
		moniter1.start();
		Moniter moniter2 = new Moniter(false,"Moniter2");
		
		if(moniter1.isOn)
		{
		System.out.println("Moniter1 is on");
		}
		if(moniter2.isOn)
		{
		System.out.println("Moniter2 is on");
		}
		else
		{
			System.out.println("Moniter2 is off");
		}
		System.out.println(moniter1.name);
		System.out.println(moniter2.name);
	
	}

}
