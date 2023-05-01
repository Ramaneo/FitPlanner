package com.fitplanner.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.annotation.PostConstruct;


@RestController
@RequestMapping("/fitplanner")
public class FitplannerRestController {

		
		@PostConstruct
		public void init() {
			
		}
		
	
}
