package com.bekiryuksel;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

@SuppressWarnings("deprecation")
public class Tiles2Controller extends MultiActionController {

	
	public ModelAndView hak(HttpServletRequest req , HttpServletResponse resp){
			
		ModelAndView model = new ModelAndView("hakkimizda");
		return model;
	}
	
	public ModelAndView ilet(HttpServletRequest req, HttpServletResponse resp )
	{
		
		ModelAndView vi = new ModelAndView("iletisim");
		return vi;
	}
	
	public ModelAndView urunis(HttpServletRequest req, HttpServletResponse res){
		ModelAndView ty = new ModelAndView("urunler");
		
			req.setAttribute("verim1","MVC DELIP GECIYORUM");
		return ty;
	}
}
