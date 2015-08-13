package semiot.library_driver;

public interface IDriver {
	
	public boolean initialize(WAMPClient wampClient);
	
	public void run();
	
	public String getDriverName();
	
}
