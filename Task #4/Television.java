/** 
*The purpose of this class is to model a television
*Jordan Vu September 24, 2020
*/
/*****Task #1 Creating a New Class*********/
public class Television 
{
	//Declare two constant fields listed in the UML Diagram
	private final String MANUFACTURER;
	private final int SCREEN_SIZE;
	
	//Declare the 3 remaining fields listed in the UML Diagram
	private boolean powerOn;
	private int channel;
	private int volume;
	
/*****Task #2 Writing a Constructor*********/
	//Create a constructor definition that has two parameters,
	//a manufacturer's brand and a screen size.
	//These parameters will bring in information
	public Television (String brand, int screen)
	{
		//Assign values, from the parameters to the corresponding fields
		MANUFACTURER = brand;
		SCREEN_SIZE = screen;
		
		//Initialize powerOn to false
		powerOn = false;
		
		//Initialize volume to 20
		volume = 20;
		
		//Initialize channel to 2
		channel = 2;
	}
	
/*****Task #3 Methods *********/
	
	//Define accessor method, getVolume
	public int getVolume()
	{
		return volume;
	}
	
	//Definre accessor method, getChannel
	public int getChannel()
	{
		return channel;
	}
	
	//Define accessor method, getManufacturer
	public String getManufacturer()
	{
		return MANUFACTURER;
	}
	
	//Define accessor method, getScreenSize
	public int getScreenSize()
	{
		return SCREEN_SIZE;
	}
	
	//Define mutator method, setChannel
	public void setChannel(int chan)
	{
		channel = chan;
	}
	//Define mutator method, power
	public void power()
	{
		powerOn = !powerOn;
		
	}
	
	//Define two mutator methods to change the volume
	
	//increase volume by 1
	public void increaseVolume()
	{
		volume+=1;
	}
	
	//decrease volume by 1
	public void decreaseVolume()
	{
		volume -=1;
	}
	
}
