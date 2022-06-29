
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Runner {

	
	
	public static Logger LOGGER = LogManager.getLogger();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LOGGER.debug("Testing logger writing to an errors file");
		LOGGER.info("Testing logger that prints to the console");	
	}
	
	public void logMessage(String message) {
		
		LOGGER.debug(message);
		
		
		}

}
