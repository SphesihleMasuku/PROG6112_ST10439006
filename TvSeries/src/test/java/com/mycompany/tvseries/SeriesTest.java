package com.mycompany.tvseries;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;

//CODE ATTRIDUTION 
//Title: Introdution to Node.Js Test Runner
// Author : w3schools 
// Date : 01/09/2025
// Version : 
//Availability : https://www.w3schools.com/nodejs/nodejs_test_runner.asp

public class SeriesTest {

    private Series series;
     
    
    //gets the test date from the series class 
    @BeforeEach
    public void setUp() {
        series = new Series();
        series.addDummyData();
    }

    @Test // test if series data is added 
    public void testAddSeries() {
        int initialSize = series.getSeriesList().size();

        SeriesModel newSeries = new SeriesModel("S004", "Dark", "16", "26");
        series.getSeriesList().add(newSeries);

        assertEquals(initialSize + 1, series.getSeriesList().size());
        assertTrue(series.getSeriesList().contains(newSeries));
    }

    @Test// thes if the series being search is found
    public void testSearchSeriesFound() {
        SeriesModel found = series.findSeriesById("S001");
        assertNotNull(found);
        assertEquals("Breaking Bad", found.getSeriesName());
    }

    @Test//test the sries that is not found 
    public void testSearchSeriesNotFound() {
        SeriesModel found = series.findSeriesById("S999");
        assertNull(found);
    }

    @Test// test the data that is being updated 
    public void testUpdateSeries() {
        SeriesModel s = series.findSeriesById("S002");
        assertNotNull(s);

        s.setSeriesName("Stranger Things Updated");
        s.setSeriesAge("15");
        s.setSeriesNumberOfEpisodes("40");

        assertEquals("Stranger Things Updated", s.getSeriesName());
        assertEquals("15", s.getSeriesAge());
        assertEquals("40", s.getSeriesNumberOfEpisodes());
    }

    @Test // tests for deleted series 
    public void testDeleteSeries() {
        int initialSize = series.getSeriesList().size();

        SeriesModel s = series.findSeriesById("S003");
        assertNotNull(s);

        series.getSeriesList().remove(s);

        assertEquals(initialSize - 1, series.getSeriesList().size());
        assertNull(series.findSeriesById("S003"));
    }
}
