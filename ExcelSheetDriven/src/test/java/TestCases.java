import java.io.IOException;
import java.util.ArrayList;

public class TestCases {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ExcelData E = new ExcelData();
		ArrayList<String> testData = E.addData("Selenium");
		System.out.println(testData.get(0));
		System.out.println(testData.get(1));
		System.out.println(testData.get(2));
		System.out.println(testData.get(3));
	}

}
