package abstractionAssignment;

public class Desktop implements Hardware,Software{

	// Multiple Inheritance
	public void desktopModel()
	
	{
		System.out.println("800");
	}
	
    public void hardwareResources()
	
	{
		System.out.println("900");
	}
    public void softwareResources()
    {
    	System.out.println("1000");
    }
	
	public static void main(String[] args) {
	Desktop desk = new Desktop();
	desk.desktopModel();
	desk.hardwareResources();
	desk.softwareResources();
	}

}
