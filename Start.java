import java.lang.*;
public class Start
{
	public static void main(String[]args)
	{
		PassengerAirliner obj1=new PassengerAirliner();
		obj1.setManufacturer("Boeing");
		obj1.setMaxAltitude(44947.0);
		obj1.setMaxSpeed(988);
		obj1.setPassengerCapacity(524);
		obj1.showDetails();
		AirTransporter obj2=new AirTransporter("AirBus",300000.0,650.0);
		obj2.showDetails();
	}
	
}