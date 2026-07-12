package genricUtility;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {

	int startingPoint= 0;
	int upperlimt= 2;
	@Override
	public boolean retry(ITestResult result) {
		if (startingPoint<upperlimt) {
			startingPoint++;
	
		return true;
	}
		return false;
	
	

}
}
