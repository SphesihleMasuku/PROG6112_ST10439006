/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tvseries;

/**
 *
 * @author Siphesihle Masuku
 */
public class SeriesModel {
     // declation of the variables 
    public String SeriesId;
    public String SeriesName;
    public String SeriesAge;
    public String SeriesNumberOfEpisodes;
    
    //constructer 

    public SeriesModel(String SeriesId, String SeriesName, String SeriesAge, String SeriesNumberOfEpisodes) {
        this.SeriesId = SeriesId;
        this.SeriesName = SeriesName;
        this.SeriesAge = SeriesAge;
        this.SeriesNumberOfEpisodes = SeriesNumberOfEpisodes;
    }
    
    
    //Getter
    public String getSeriesId() {
        return SeriesId;
    }

    public String getSeriesName() {
        return SeriesName;
    }

    public String getSeriesAge() {
        return SeriesAge;
    }

    public String getSeriesNumberOfEpisodes() {
        return SeriesNumberOfEpisodes;
    }
    
    
    //Setter
    public void setSeriesId(String SeriesId) {
        this.SeriesId = SeriesId;
    }

    public void setSeriesName(String SeriesName) {
        this.SeriesName = SeriesName;
    }

    public void setSeriesAge(String SeriesAge) {
        this.SeriesAge = SeriesAge;
    }

    public void setSeriesNumberOfEpisodes(String SeriesNumberOfEpisodes) {
        this.SeriesNumberOfEpisodes = SeriesNumberOfEpisodes;
    }
    
    
    @Override
    public String toString (){
        return "Series ID: " + SeriesId
                + "Series Name" + SeriesName 
                + "Age restriction " + SeriesAge 
                + "Number of episodes " + SeriesNumberOfEpisodes ;
    }

}
