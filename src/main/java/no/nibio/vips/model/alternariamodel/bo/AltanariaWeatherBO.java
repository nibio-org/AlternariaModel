/**
 * Project			:	AlternariaModel
 * Organization			:	NIBIO, Ås
 * Department			:	VIPS
 *
 * Author			:	bhabesh
 *
 *
 * File Name			:	AltanariaWeather.java
 * Package Name			:	no.nibio.vips.model.alternariamodel
 * Date of creation		:	4 Mar. 2020 1:28:14 pm
 * Date of modification :
 *
 * Summary			:
 *
 */
/*
 * 

Copyright (c) 2016 NIBIO <http://www.nibio.no/>. 
            
This file is part of AlternariaModel.  
AlternariaModel is free software: you can redistribute it and/or modify  
it under the terms of the NIBIO Open Source License as published by  
NIBIO, either version 1 of the License, or (at your option) any 
later version. 

AlternariaModel is distributed in the hope that it will be useful, 
but WITHOUT ANY WARRANTY; without even the implied warranty of 
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the 
NIBIO Open Source License for more details. 

You should have received a copy of the NIBIO Open Source License 
along with AlternariaModel.  If not, see <http://www.nibio.no/licenses/>.

 */
package no.nibio.vips.model.alternariamodel.bo;

import no.nibio.vips.entity.WeatherObservation;

/**
 *
 * @author bhabesh
 */
public class AltanariaWeatherBO
{

    
    /**
     * BT : Leaf wetness TM : Temperature mean
     */
    private WeatherObservation weatherObservation;
    private String             observationType;

    public AltanariaWeatherBO() {}

    public AltanariaWeatherBO(WeatherObservation weatherObservation, String observationType)
    {
        this.weatherObservation = weatherObservation;
        this.observationType = observationType;
    }

    
    /**
     * @return the weatherObservation
     */
    public WeatherObservation getWeatherObservation()
    {
        return weatherObservation;
    }

    /**
     * @param weatherObservation the weatherObservation to set
     */
    public void setWeatherObservation(WeatherObservation weatherObservation)
    {
        this.weatherObservation = weatherObservation;
    }

    /**
     * @return the observationType
     */
    public String getObservationType()
    {
        return observationType;
    }

    /**
     * @param observationType the observationType to set
     */
    public void setObservationType(String observationType)
    {
        this.observationType = observationType;
    }

    @Override
    public String toString()
    {
        return "AltanariaWeatherBO{" + "weatherObservation=" + weatherObservation + ", observationType=" + observationType + '}';
    }
    
    
    
}
