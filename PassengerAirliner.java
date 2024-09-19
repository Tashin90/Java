import java.lang.*;
public class PassengerAirliner extends AirTransporter
{
	private int passengerCapacity;
	
	public PassengerAirliner()
	{
		//System.out.println("Default con");
	}
	public PassengerAirliner(int passengerCapacity,String manufacturer,double maxAltitude,double maxSpeed)
	{
	super(manufacturer,maxAltitude,maxSpeed);
	this.passengerCapacity=passengerCapacity;
	}
	
	public void setPassengerCapacity(int passengerCapacity)
	{
		this.passengerCapacity=passengerCapacity;
	}
	public int getPassengerCapacity()
	{
		return passengerCapacity;
	}
	public void showDetails()
	{
		super.showDetails();
		System.out.println("Passenger Capacity:"+passengerCapacity);
	}
}