/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.study.scenary.entities;

import java.io.Serializable;

import org.kie.api.definition.type.Expires;
import org.kie.api.definition.type.Role;

@Role(Role.Type.EVENT)
@Expires("38d")

/**
 *
 * @author alessandro
 */
public class Mosquito implements Serializable{

   private static final long serialVersionUID = 1L;
   private int days = 0;
   private boolean controlfly = false;
   private boolean controleggs = false;
   private int mosquitoId;
   private String nameHouse = "";
   private int houseId;
   private House house;
    
   	
   	public int getMosquitoId(){
   		return this.mosquitoId;
   	}
   	
    public int getDays() {
        return days;
    }

    public boolean isControlfly() {
        return controlfly;
    }

    public void setControlfly(boolean controlfly) {
        this.controlfly = controlfly;
    }

    public boolean isControleggs() {
        return controleggs;
    }

    public void setControleggs(boolean controleggs) {
        this.controleggs = controleggs;
    }

    public void setDays(int days) {
        this.days = days;
    }

	public String getNameHouse() {
		return nameHouse;
	}

	public void setNameHouse(String nameHouse) {
		this.nameHouse = nameHouse;
	}
	
	public String toString(){
		return "Id: " + this.getMosquitoId() + " houseId: " + this.getNameHouse() + " dias restantes: " + this.days;
	}

	public int getHouseId() {
		return houseId;
	}

	public void setHouseId(int houseId) {
		this.houseId = houseId;
	}

	public House getHouse() {
		return house;
	}

	public void setHouse(House house) {
		this.house = house;
	}
   
}
