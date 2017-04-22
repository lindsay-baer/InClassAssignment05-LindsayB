package com.example.android.inclassassignment05_lindsayb;

import java.io.Serializable;

public class Planet implements Serializable
{
    private String planetName;
    private String planetSize;
    private boolean liveOnPlanet;
    private String additionalInfo;

    public Planet(String planetName, String planetSize, boolean liveOnPlanet, String additionalInfo) {
        this.planetName = planetName;
        this.planetSize = planetSize;
        this.liveOnPlanet = liveOnPlanet;
        this.additionalInfo = additionalInfo;
    }

    public String getPlanetName() {
        return planetName;
    }

    public void setPlanetName(String planetName) {
        this.planetName = planetName;
    }

    public String getPlanetSize() {
        return planetSize;
    }

    public void setPlanetSize(String planetSize) {
        this.planetSize = planetSize;
    }

    public String getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public boolean isLiveOnPlanet() {
        return liveOnPlanet;
    }

    public void setLiveOnPlanet(boolean liveOnPlanet) {
        this.liveOnPlanet = liveOnPlanet;
    }

    @Override
    public String toString() {
        return "Planet Name: " + planetName  + '\n' +
                "Planet Size: " + planetSize + '\n' +
                "Can you live on this planet? " + liveOnPlanet + '\n' +
                "More Information: " + additionalInfo;

    }
}