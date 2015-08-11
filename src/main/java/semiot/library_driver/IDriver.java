package semiot.library_driver;

public interface IDriver {
	
	public boolean initialize();
	
	public void run();
	
	public String getDriverName();
	
}
