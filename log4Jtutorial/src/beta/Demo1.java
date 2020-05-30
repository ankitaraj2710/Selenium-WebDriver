package beta;
import org.apache.logging.log4j.*;

public class Demo1 {

//LogManager is the api and getLogger is the function of it.
	//below step is make an object log 
	//getLOgger accepts an argument the name of the class where you use it.
	private static Logger log =LogManager.getLogger(Demo1.class.getName());
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//To print an output different ways can use
		
		log.debug("Button is clicked");
		if(5>4)
			log.info("Button is displayed");
		
			log.error("Button is displayed\"");
		
		log.fatal("Button is missing");
		

	}

}
