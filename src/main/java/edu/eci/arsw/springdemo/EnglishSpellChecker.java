package edu.eci.arsw.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnglishSpellChecker implements SpellChecker {

	@Autowired
	public String checkSpell(String text) {		
		return "Checked with english checker:"+text;
	}

        
}
