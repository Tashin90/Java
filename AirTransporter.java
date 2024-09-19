import java.lang.*;
public class AirTransporter
{
	private String manufacturer;
	private double maxAltitude;
	private double maxSpeed;
	public AirTransporter()
	{
		//System.out.println("Default constractor");
	}
	public AirTransporter(String manufacturer,double maxAltitude,double maxSpeed)
	{
	this.manufacturer=manufacturer;
	this.maxAltitude=maxAltitude;
	this.maxSpeed=maxSpeed;
	}
	public void setManufacturer(String manufacturer)
	{
		this.manufacturer=manufacturer;
	}
	public String getManufacturer()
	{
		return manufacturer;
	}
	public void setMaxAltitude(double maxAltitude)
	{
		this.maxAltitude=maxAltitude;
	}
	public double getMaxAltitude()
	{
		return maxAltitude;
	}
	public void setMaxSpeed(double maxSpeed)
	{
		this.maxSpeed=maxSpeed;
	}
	public double getMaxSpeed()
	{
		return maxSpeed;
	}
	public void showDetails()
	{
		System.out.println("Air Transporter Details");
		System.out.println("Manufacturer:"+ manufacturer);
		System.out.println("Maximum Altitude:"+ maxAltitude+"ft");
		System.out.println("Maximum Speed:"+ maxSpeed+"KM/Hr");
	}
	
}