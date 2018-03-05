package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class sanitoryItemsImpl implements sanitoryItemsData {

	@Override
	public List<sanitoryItems> getItemsList() {
		
		sanitoryItems sItems1 = new sanitoryItems();
		sanitoryItems sItems2 = new sanitoryItems();
		sanitoryItems sItems3 = new sanitoryItems();
		
		List<sanitoryItems> sitemList = new ArrayList<sanitoryItems>();		
		
		sItems1.setId(1);
		sItems1.setName("item1");
		sItems1.setPrice(100);
		
		sItems2.setId(2);
		sItems2.setName("item2");
		sItems2.setPrice(200);
		
		sItems3.setId(3);
		sItems3.setName("item3");
		sItems3.setPrice(300);
		
		sitemList.add(sItems1);
		sitemList.add(sItems2);
		sitemList.add(sItems3);
		
		return sitemList;
	}

}
