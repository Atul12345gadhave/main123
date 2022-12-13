package liistener;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;


public class listnerNeoStox implements ITestListener {

private void ontestSucess(ITestResult result) {
	
	String methodname = result.getName();
	
	Reporter.log("TC"+methodname+" is pass sucessfully", true);

}		
	public void onTestFailure(ITestResult result) {
			
			Reporter.log("TC"+result.getName()+" is fail sucessfully", true);
		}


private void ontsetskipp(ITestResult result) {
	
	
	Reporter.log("TC"+result.getName()+" is skipp plz check", true);
}

}
