package no.hvl.dat110.rest.counters;

import java.util.concurrent.atomic.AtomicLong;

import com.google.gson.Gson;

public class Todo {
	
	private static final AtomicLong count = new AtomicLong(0); 
	
    private Long id;
    private String summary;
    private String description;
    
    public Todo() {
    	id = count.incrementAndGet();
    }
    
    public Long getId() {
    	return id;
    }
    
    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

	String toJson () {
    	
    	Gson gson = new Gson();
    	    
    	String jsonInString = gson.toJson(this);
    	
    	return jsonInString;
    }

}