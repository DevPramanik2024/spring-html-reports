package com.ninja.spring_jar_html_reports;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class springjarhtmlreport
{
	@RequestMapping("/test")
	public String test()
	
	{
	return "This is test File";
	}
	

	@RequestMapping("/home")
	public String home()
	
	{
	return "This is home file";
	}
	
	@RequestMapping("/save")
	public String save()
	
	{
	return "This is save file";
	}
	
	
}
