package com.cdac.acts;

import java.util.ArrayList;
import java.util.List;

public class DataUtil {
	
	public static List<Apple> getData(){
		List<Apple> addList = new ArrayList<>();
		addList.add(new Apple(150, "Red", "Sweet"));
        addList.add(new Apple(120, "Green", "Sour"));
        addList.add(new Apple(180, "Yellow", "Sweet"));
        addList.add(new Apple(160, "Red", "Tart"));
        addList.add(new Apple(140, "Green", "Sweet"));
        addList.add(new Apple(130, "Yellow", "Sour"));
         
		return addList;
	}

}
