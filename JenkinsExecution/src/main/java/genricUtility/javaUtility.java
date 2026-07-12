package genricUtility;

import java.time.LocalDateTime;
import java.util.Random;
import java.util.UUID;

public class javaUtility {
	/**
	 * This method is use to capture the date and time
	 * @return
	 */
	public String dateAndTime() {
		String time =LocalDateTime.now().toString().replace(":", "_");
		return time;
		
			
		}
	/**
	 * This mehod is use to generate random numbers.
	 * @return
	 */
	public int randomNumbers() {
		Random random = new Random();
	int randomNumbe=	random.nextInt(10000);
		return randomNumbe;
	}
	
	/**
	 * This method is use to Generate random String data.
	 * @return
	 */
	public String randomData() {
		String data=UUID.randomUUID().toString().replace("[^a-zA-Z]", "");
		return data;
	}
	}


