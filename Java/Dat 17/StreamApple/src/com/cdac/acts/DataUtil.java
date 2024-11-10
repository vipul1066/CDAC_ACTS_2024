package com.cdac.acts;

import java.util.ArrayList;
import java.util.List;

public class DataUtil {
	public static List<Apple> getData(){
		List<Apple> apples = new ArrayList<>();

        apples.add(new Apple(150, "Red", "Sweet"));
        apples.add(new Apple(120, "Green", "Tart"));
        apples.add(new Apple(180, "Yellow", "Sweet"));
        apples.add(new Apple(130, "Pink", "Crisp"));
        apples.add(new Apple(160, "Red", "Sour"));

        return apples;
		
	}

}
