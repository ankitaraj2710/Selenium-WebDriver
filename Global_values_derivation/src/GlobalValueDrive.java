import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class GlobalValueDrive {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

Properties prop=new Properties();//Properties class is used to give the information about other files
//To provide values from external file 1st make an object of FileInputStream to pass the location of the file.
FileInputStream fis =new FileInputStream("C:\\Users\\User\\Desktop\\Testing\\Global_values_derivation\\src\\data.properties");

prop.load(fis);//load method will load all the values from external file

System.out.println(prop.getProperty("browser"));//through getProperty we can retrieve the value by passing the key value

System.out.println(prop.getProperty("url"));

prop.setProperty("browser", "firefox");// setProperty is used to change the value/ to set the new value to the attribute saved in the file. 

System.out.println(prop.getProperty("browser"));

//similar to input stream FileOutputStream is used to store back the values which are changed through java file simply we can store the changed value.
FileOutputStream fos =new FileOutputStream("C:\\Users\\User\\Desktop\\Testing\\Global_values_derivation\\src\\data.properties");

prop.store(fos, null);

}



}




