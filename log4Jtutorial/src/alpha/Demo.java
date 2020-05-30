package alpha;
import org.apache.logging.log4j.*;

public class Demo {

//LogManager is the api and getLogger is the function of it.
	//below step is make an object log 
	//getLOgger accepts an argument the name of the class where you use it.
	private static Logger log =LogManager.getLogger(Demo.class.getName());
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//To print an output different ways can use
		
		log.debug("I am Debugging");
		if(5>4)
			log.info("Object id present");
		
			log.error("Object is not present");
		
		log.fatal("This is fatal");
		

	}

}
