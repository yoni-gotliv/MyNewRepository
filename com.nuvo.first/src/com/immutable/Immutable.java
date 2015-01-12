package com.immutable;

public class Immutable {
	
    private final String name;
    private final String mobile;

    public Immutable(String name, String mobile) {
        this.name = name;
        this.mobile = mobile;
    }
  
    public String getName(){
        return name;
    }
  
    public String getMobile(){
        return mobile;
    }

    
}
