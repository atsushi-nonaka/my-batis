package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.Sample;
import com.example.service.SampleService;

@Controller
@RequestMapping("")
public class SampleController {
	
	@Autowired
	private SampleService service;
	
	@RequestMapping("")
	public String init(Model model) {
		List<Sample> sampleList = service.findAll();
		model.addAttribute("sampleList", sampleList);
		return "sample";
	}
}
