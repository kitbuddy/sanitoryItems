package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controllers {

	@RequestMapping(value= "/getAll", method = RequestMethod.GET	 )
	public sanitoryItemsImpl getAllSanitoryItems(){

		sanitoryItemsImpl s = new sanitoryItemsImpl();

		s.getItemsList();
		return s;		





	}

}
