package com.bekiryuksel;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/new")
public class TilesController {

	
	@RequestMapping(value="/hakkim",method = RequestMethod.GET)
	public String hakkimizda(){
		return "hakkimizda";
	}
	
	@RequestMapping(value="/iletim", method=RequestMethod.GET)
	public String iletisim(){
		return "iletisim";
	}
	
	@RequestMapping(value="/urun",method = RequestMethod.GET)
	public String urunler(){
		return "urunler";
	}
	
}
