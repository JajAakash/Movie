package com.movietrailer.movietrailer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.movietrailer.movietrailer.service.IMDBYouService;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@RestController
@CrossOrigin
public class IMYouApi {
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	IMDBYouService imdbYouService;
	
	@RequestMapping(value="/movieDetails/{movieName}",method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)

	public @ResponseBody List<Object> getMovie(@PathVariable String movieName){
		logger.info(" request for Movie {}");
		List<Object> IMDBYoutubeData= imdbYouService.ImdbYoutubeData(movieName);
		
		return IMDBYoutubeData;
	}
	
	
}
