package SandhyaJava8Practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConvertingArrayListtoHashMap {
	
	public static void main(String[] args)
    {
      
	List<ListItems> arrayConvertingToMapList = new ArrayList<ListItems>();
	
	arrayConvertingToMapList.add(new ListItems(1,"Sandya"));
	arrayConvertingToMapList.add(new ListItems(2,"rani"));
	
	Map<Integer,String> mapvaluefromList = new HashMap<Integer,String>();
	
	arrayConvertingToMapList.forEach(
			
			(arrayConvertingToMap) -> { 
				
				mapvaluefromList.put(arrayConvertingToMap.getKey() , arrayConvertingToMap.getValue());
				
				});
	
	System.out.print(mapvaluefromList);
	
    }
}
