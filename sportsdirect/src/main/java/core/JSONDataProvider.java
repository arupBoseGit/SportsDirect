package core;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


import com.google.common.reflect.TypeToken;


//public class JSONDataProvider implements ITestData{
	
//	private Reader reader;
//	private Gson gson;
//	
//	public JSONDataProvider(String filepath) throws Exception {
//		reader = new FileReader(filepath);
//		gson =new Gson();
//	}
//	@Override
//	public List<HashMap<String, String>> getAllData(String testName) {
//		// TODO Auto-generated method stub
//		Type type =new TypeToken<HashMap<String, ArrayList<HashMap>>>(){}.getType();
//		HashMap<String, ArrayList<HashMap>> testData = gson.fromJson(reader,type);
//		ArrayList testDataList = testData.get(testData);
//		for(Object test : testDataList) {
//			if((Map)test.get("testname").equals(testName)) {
//				return (List<HashMap<String, String>>)((Map)test).get("iteration");
//				}
//		}
//		
//		return null;
//	}

//}
