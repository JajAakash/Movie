//package com.movietrailer.movietrailer.dto;
//
//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//
//@JsonIgnoreProperties(ignoreUnknown = true)
//public class IMDBYou {
//	private String Title;
//	private String Released;
//	private String Director;
//	private String Actors;
//	private String Poster;
//	
//	public IMDBYou() {
//		// TODO Auto-generated constructor stub
//	 
//	  }
//	
//	public String getTitle() {
//		return Title;
//	}
//	public void setTitle(String title) {
//		Title = title;
//	}
//	public String getReleased() {
//		return Released;
//	}
//	public void setReleased(String released) {
//		Released = released;
//	}
//	public String getDirector() {
//		return Director;
//	}
//	public void setDirector(String director) {
//		Director = director;
//	}
//	public String getActors() {
//		return Actors;
//	}
//	public void setActors(String actors) {
//		Actors = actors;
//	}
//	public String getPoster() {
//		return Poster;
//	}
//	public void setPoster(String poster) {
//		Poster = poster;
//	}
//	
////	private String Title;
////	private String Title;
////	private String Title;
////	
//}
package com.movietrailer.movietrailer.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class IMDBYou {
	  //private String type;
	
	public IMDBYou() {
		
	}
	
	@JsonProperty("Actors")
	private String actors;
	
	@JsonProperty("Year")
	private Integer year;
	
	@JsonProperty("Released")
	private String released;
	
	@JsonProperty("Poster")
	private String poster;
	
	@JsonProperty("Director")
	private String director;
	
	@JsonProperty("Title")
	private String title;


	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getReleased() {
		return released;
	}
	public void setReleased(String released) {
		this.released = released;
	}
	public String getPoster() {
		return poster;
	}

	public void setPoster(String poster) {
		this.poster = poster;
	}

	public String getActors() {
		return actors;
	}

	public void setActors(String actors) {
		this.actors = actors;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}


//	@Override
//	  public Object toString() {
//	    return "Quote{" +
//	        "type='" + actors + '\'' +
//	        ", value=" + actors +
//	        '}';
//	  }

}
