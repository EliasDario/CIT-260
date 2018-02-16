/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.model;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;
        
/**
 *
 * @author Elías
 */
public class RegularSceneType implements Serializable{
    private String description;
    private double travelDay; 
    private String river;
    private String mountain;
    private String weather;
    private String month;
    private ArrayList<Location>location = new ArrayList<Location>();
    private ArrayList<Animal> animal = new ArrayList<Animal>();
    

    public RegularSceneType(String description, double travelDay, String river, String mountain, String weather, String month, ArrayList<Location> location, ArrayList<Animal> animal) {

        this.description = description;
        this.travelDay = travelDay;
        this.river = river;
        this.mountain = mountain;
        this.weather = weather;
        this.month = month;
        this.location = location;
        this.animal = animal;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public double getTravelDay() {
        return travelDay;
        
    }

    public void setTravelDay(double travelDay) {
        this.travelDay = travelDay;

    }

    public String getRiver() {
        return river;
    }

    public void setRiver(String river) {
        this.river = river;
    }

    public String getMountain() {
        return mountain;
    }

    public void setMountain(String mountain) {
        this.mountain = mountain;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public ArrayList<Location> getLocation() {
        return location;
    }

    public void setLocation(ArrayList<Location> location) {
        this.location = location;
    }

    public ArrayList<Animal> getAnimal() {
        return animal;
    }

    public void setAnimal(ArrayList<Animal> animal) {
        this.animal = animal;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.description);
        hash = 17 * hash + (int) (Double.doubleToLongBits(this.travelDay) ^ (Double.doubleToLongBits(this.travelDay) >>> 32));
        hash = 17 * hash + Objects.hashCode(this.river);
        hash = 17 * hash + Objects.hashCode(this.mountain);
        hash = 17 * hash + Objects.hashCode(this.weather);
        hash = 17 * hash + Objects.hashCode(this.month);
        hash = 17 * hash + Objects.hashCode(this.location);
        hash = 17 * hash + Objects.hashCode(this.animal);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final RegularSceneType other = (RegularSceneType) obj;
        if (Double.doubleToLongBits(this.travelDay) != Double.doubleToLongBits(other.travelDay)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.river, other.river)) {
            return false;
        }
        if (!Objects.equals(this.mountain, other.mountain)) {
            return false;
        }
        if (!Objects.equals(this.weather, other.weather)) {
            return false;
        }
        if (!Objects.equals(this.month, other.month)) {
            return false;
        }
        if (!Objects.equals(this.location, other.location)) {
            return false;
        }
        if (!Objects.equals(this.animal, other.animal)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "RegularSceneType{" + "description=" + description + ", travelDay=" + travelDay + ", river=" + river + ", mountain=" + mountain + ", weather=" + weather + ", month=" + month + ", location=" + location + ", animal=" + animal + '}';
    }

    
}

