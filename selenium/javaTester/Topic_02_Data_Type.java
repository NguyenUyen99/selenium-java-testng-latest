package javaTester;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Topic_02_Data_Type {

	public static void main(String[] args) {
		//I- Kiểu dữ liệu nguyên thủy (Primitive)
		// Số nguyên: byte, short, int, long (Không có phần thập phân)
		// Kích thước/Độ rộng để lưu trữ từ nhỏ đến lớn
		byte bNumber = 127;
		
		short sNumber = 32000;
		
		int iNumber = 499233299;
		
		long lNumber = 82828;
		// Số thực: fload, double (có phần thập phân)
		float studentPoint = 9.5f;
		
		double employeeSalary = 35.6d;
		// Logic: boolean
		boolean status = true; //Nam
		status = false; // nữ
		// Ký tự: char
		char a='A';
		
		// II- Kiểu dữ liệu tham chiếu (Reference)
		// Class
		FirefoxDriver driver = new FirefoxDriver();
		// Interface
		WebElement firstnameTextbox;
		// String
		String firstName = "Automation Testing";
		// Object
		Object peple;
		// Array
		String[] studentName = {"Trang","Uyen" , "Tuyet"};
		// Collection: List/ Set/ Queue
		List<WebElement> checkboxes = driver.findElements(By.cssSelector(""));
		// Map
		Map<String, Integer> student = new HashMap<String, Integer>();
	}

}
