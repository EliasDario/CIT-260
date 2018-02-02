/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.model;
import java.io.Serializable;
        
/**
 *
 * @author Elías
 */
public class RegularSceneType implements Serializable{
    private String description;
    private String Travelday; 
    private String river;
    private String mountain;
    private String weather;
    private String month;

    public RegularSceneType(String description, String Travelday, String river, String mountain, String weather, String month) {
        this.description = description;
        this.Travelday = Travelday;
        this.river = river;
        this.mountain = mountain;
        this.weather = weather;
        this.month = month;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTravelday() {
        return Travelday;
    }

    public void setTravelday(String Travelday) {
        this.Travelday = Travelday;
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
    
}

