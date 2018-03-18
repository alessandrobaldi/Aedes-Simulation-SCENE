/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.study.scenary.entities;

import java.util.Date;


/**
 *
 * @author alessandro
 */
public class Eggs {
   private int days = 0;
   private Date executionTime;
   private House house;
   
   public Eggs(){
   	super();
       this.executionTime = new Date();
 	}
   
    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }
    
    public Date getExecutionTime() {
		return executionTime;
	}

	public void setExecutionTime(Date executionTime) {
		this.executionTime = executionTime;
	}

	public House getHouse() {
		return house;
	}

	public void setHouse(House house) {
		this.house = house;
	}

   
}
