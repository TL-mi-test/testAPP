package com.example;

import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.entity.PersonPhoneSearch;
import com.example.repository.PersonPhoneSearchRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
public class PersonPhoneSearchController {
	@Autowired
	PersonPhoneSearchRepository personPhoneSearchRepository;

	@RequestMapping("/personPhoneSearch")
	public String index(Model model) {
		Iterable <PersonPhoneSearch> personPhoneSearch = personPhoneSearchRepository.findPersonPhoneListAll();

		int personPhoneCount = 0;
		ObjectMapper mapper = new ObjectMapper();
		String personPhoneJson = new String();
		try {
			personPhoneJson = mapper.writeValueAsString(personPhoneSearch);
		} catch (JsonProcessingException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

		Iterator<PersonPhoneSearch> it = personPhoneSearch.iterator();

		while(it.hasNext()){
			it.next();
			personPhoneCount++;

		}
		model.addAttribute("dataSize", personPhoneCount);
		model.addAttribute("data", personPhoneSearch);
		model.addAttribute("dataString", personPhoneJson);

		return "index";
	}
}