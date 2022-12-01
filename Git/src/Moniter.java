
public class Moniter{
	public boolean isOn;
	public String name;
	public Moniter()
	{
		isOn = false;
		name=" ";
	}
	public Moniter(boolean on,String moniter)
	{
		isOn = false;
		name=moniter;
	}
	
	public void start()
	{
	isOn=true;
	}
	public void shutdown()
	{
	isOn=false;
	}
}
