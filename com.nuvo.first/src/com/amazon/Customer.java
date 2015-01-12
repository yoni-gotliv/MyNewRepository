package com.amazon;


public class Customer implements Comparable<Customer>{
     
    private int id;
    private String name;
     
    public Customer(int i, String n){
        this.id=i;
        this.name=n;
    }
 
    public int getId() {
        return id;
    }
 
    public String getName() {
        return name;
    }

	@Override
	public int compareTo(Customer o) {
		// TODO Auto-generated method stub
//		return this.getId()-o.getId();
		return o.getId()-this.getId();
	}
     
}
