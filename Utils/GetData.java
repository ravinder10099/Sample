package Utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class GetData {
	
	public static String FromProperties(String filename, String key)
	{
		String value = null;
		try
		{
			File f = new File("./Configuration/"+filename+".properties");
			FileInputStream FIS = new FileInputStream(f);
			Properties prop = new Properties();
			prop.load(FIS);
			value = (String) prop.get(key);
		}
		catch(Exception e)
		{
			e.printStackTrace();
						
		}
	
	return value;
}
}


