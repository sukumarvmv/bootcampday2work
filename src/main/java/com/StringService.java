package com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController 

public class StringService {

	
	@GetMapping("/trun{st}")
	public String truncateAInFirst2Positions(@PathVariable(value = "st") String str) {
	if (str.length() <= 2)
			return str.replaceAll("A", "");

		String first2Chars = str.substring(0, 3);
		String stringMinusFirst2Chars = str.substring(3);

			return first2Chars.replaceAll("A", "") + stringMinusFirst2Chars;
	
	}
	
	@GetMapping("/aresame{st}")
	public boolean areFirstAndLastTwoCharactersTheSame(@PathVariable(value = "st") String str) {

		if (str.length() <= 1)
			return false;
		if (str.length() == 2)
			return true;

		String first2Chars = str.substring(0, 2);

		String last2Chars = str.substring(str.length() - 2);

		return first2Chars.equals(last2Chars);
	}
	
	@GetMapping("/hello{st}")
	public String  helloName(@PathVariable(value = "st") String str) {

		return "Hello"+ str;
	
	}

}
