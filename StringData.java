import java.util.*;
import java.io.File;

public class StringData
{
	private static String[] dataSet = null;

	public static String[] getData()
	{
		if (dataSet == null)
		{
			dataSet = new String[17576];
			int index = 0;
			for(char x = 'a'; x <= 'z'; x++)
				for(char y = 'a'; y <= 'z'; y++)
					for(char z = 'a'; z <= 'z'; z++)
						dataSet[index++] = "" + x + y + z;
		}
		return dataSet;
	}
}