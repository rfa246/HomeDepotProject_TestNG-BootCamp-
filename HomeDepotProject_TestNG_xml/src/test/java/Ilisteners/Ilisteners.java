package Ilisteners;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;


import Common.utilities;

public class Ilisteners extends utilities implements ITestListener{

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		this.driver = ((utilities)result.getInstance()).driver;
		try {
			Screenshot("skip");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		this.driver = ((utilities)result.getInstance()).driver;
		try {
			Screenshot("Success");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		this.driver = ((utilities)result.getInstance()).driver;
		try {
			Screenshot("Fail");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
