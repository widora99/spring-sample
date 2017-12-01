package com.sample.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SampleController {

	/**
	 * 通常の画面表示のサンプル
	 * 
	 * @return
	 */
	@RequestMapping(path = "/sample", method = RequestMethod.GET)
	public ModelAndView mavSample(HttpServletRequest request, HttpServletResponse response) throws Exception {

		ModelAndView mav = new ModelAndView("sample");
		mav.addObject("sample", "");

		return mav;
	}


	/**
	 * jsonレスポンスのサンプル
	 * 
	 * @param val
	 */
	@RequestMapping(path = "/sample/{val}/**", method = RequestMethod.POST, produces = "application/json; charset=UTF-8")
	@ResponseBody
	public String jsonSample(@PathVariable() String val) throws Exception {

		String json = "{\"data\": \"hoge\"}";
		return json;
	}

	
}
