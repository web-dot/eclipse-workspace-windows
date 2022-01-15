package com.sample;
import java.util.ArrayList;
import java.util.List;

import com.sample.model.LiquorType;
public class LiquorService {
	public List getAvailableBrands(LiquorType type) {
		List brands = new ArrayList();
		if(type.equals(LiquorType.WINE)) {
			brands.add("Addrians Vinyard");
			brands.add("J. P Chenet");
		}
		else if(type.equals(LiquorType.WHISKY)) {
			brands.add("Jhonny Walker");
		}
		else if(type.equals(LiquorType.BEER)) {
			brands.add("Corona");
		}
		else {
			brands.add("no brands available");
		}
		return brands;
	}
}
