/**
 * Project			:	AlternariaModel
 * Organization			:	NIBIO, Ås
 * Department			:	VIPS
 * 
 * Author			:	bhabesh
 *
 * 
 * File Name			:	AlternariaModel.java
 * Package Name			:	no.nibio.vips.model.alternariamodel
 * Date of creation		:	28 Feb. 2020 6:41:52 pm
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

package no.nibio.vips.model.alternariamodel;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;
import no.nibio.vips.entity.ModelConfiguration;
import no.nibio.vips.entity.Result;
import no.nibio.vips.entity.WeatherObservation;
import no.nibio.vips.i18n.I18nImpl;
import no.nibio.vips.model.ConfigValidationException;
import no.nibio.vips.model.Model;
import no.nibio.vips.model.ModelExcecutionException;
import no.nibio.vips.model.ModelId;
import no.nibio.vips.util.ModelUtil;
import no.nibio.vips.util.WeatherUtil;

/**
 *
 * @author bhabesh
 */
public class AlternariaModel extends I18nImpl implements Model{
  public final static ModelId   MODEL_ID    =   new ModelId("ALTERNARIA");
  public final static int       THRESHOLD   =   30;
  
  private   final   ModelUtil   modelUtil;
  private           DataMatrix  dataMatrix;
  
  private           TimeZone    timeZone;
  
  public AlternariaModel()
  {
      super("no.nibio.vips.model.alternariamodel.texts");
      this.modelUtil    = new ModelUtil();
  }
          
    @Override
    public List<Result> getResult() throws ModelExcecutionException
    {
        /**
         * method name : getResult
         * @param      :
         * @return     : java.util.List<no.nibio.vips.entity.Result>
         *
         * purpose     :
         *
         * date        : Expression date is undefined on line 20, column 19 in Templates/Classes/Code/GeneratedMethodBody. Expression time is undefined on line 20, column 27 in Templates/Classes/Code/GeneratedMethodBody.
         */
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                //TODO write proper list of result object
        
        //Date            currentDate     =   this.dataMatrix.getFirstDateWithParameterValue(DataMatrix.LEAF_WETNESS_DURATION);
        List<Result>    dummyResult     =   new ArrayList<>();
        
        
        return dummyResult;
    }


    @Override
    public ModelId getModelId()
    {
        /**
         * method name : getModelId
         * @param      : 
         * @return     : no.nibio.vips.model.ModelId
         *
         * purpose     :
         *
         * date        : Expression date is undefined on line 20, column 19 in Templates/Classes/Code/GeneratedMethodBody. Expression time is undefined on line 20, column 27 in Templates/Classes/Code/GeneratedMethodBody.
         */
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return AlternariaModel.MODEL_ID;
    }

    /**
     * 
     * @return 
     */
    @Override
    public String getModelName()
    {
        /**
         * method name : getModelName
         * @param      :
         * @return     : java.lang.String
         *
         * purpose     :
         *
         * date        : Expression date is undefined on line 20, column 19 in Templates/Classes/Code/GeneratedMethodBody. Expression time is undefined on line 20, column 27 in Templates/Classes/Code/GeneratedMethodBody.
         */
        return this.getModelName(Model.DEFAULT_LANGUAGE);
    }

    /**
     * 
     * @param language
     * @return 
     */
    @Override
    public String getModelName(String language)
    {
        /**
         * method name : getModelName
         * @param      :
         * @return     : java.lang.String
         *
         * purpose     :
         *
         * date        : Expression date is undefined on line 20, column 19 in Templates/Classes/Code/GeneratedMethodBody. Expression time is undefined on line 20, column 27 in Templates/Classes/Code/GeneratedMethodBody.
         */
        return this.getText("name", language);
    }

    @Override
    public String getLicense()
    {
        /**
         * method name : getLicense
         * @param      :
         * @return     : java.lang.String
         *
         * purpose     :
         *
         * date        : Expression date is undefined on line 20, column 19 in Templates/Classes/Code/GeneratedMethodBody. Expression time is undefined on line 20, column 27 in Templates/Classes/Code/GeneratedMethodBody.
         */
        return "TODO - License Text";
    }

    @Override
    public String getCopyright()
    {
        /**
         * method name : getCopyright
         * @param      :
         * @return     : java.lang.String
         *
         * purpose     :
         *
         * date        : Expression date is undefined on line 20, column 19 in Templates/Classes/Code/GeneratedMethodBody. Expression time is undefined on line 20, column 27 in Templates/Classes/Code/GeneratedMethodBody.
         */
        return "(c) 2020 NIBIO (http://www.nibio.no/). Contact: post@nibio.no";
    }

    @Override
    public String getModelDescription()
    {
        /**
         * method name : getModelDescription
         * @param      :
         * @return     : java.lang.String
         *
         * purpose     :
         *
         * date        : Expression date is undefined on line 20, column 19 in Templates/Classes/Code/GeneratedMethodBody. Expression time is undefined on line 20, column 27 in Templates/Classes/Code/GeneratedMethodBody.
         */
        return this.getModelDescription(Model.DEFAULT_LANGUAGE);
    }

    /**
     * 
     * @param language
     * @return 
     */
    @Override
    public String getModelDescription(String language)
    {
        /**
         * method name : getModelDescription
         * @param      :
         * @return     : java.lang.String
         *
         * purpose     :
         *
         * date        : Expression date is undefined on line 20, column 19 in Templates/Classes/Code/GeneratedMethodBody. Expression time is undefined on line 20, column 27 in Templates/Classes/Code/GeneratedMethodBody.
         */
        try
        {
            return this.modelUtil.getTextWithBase64EncodedImages(this.getText("description", language), this.getClass());
        }
        catch (IOException ex)
        {
            return this.getText("description", language);
        }
    }

    @Override
    public String getWarningStatusInterpretation()
    {
        /**
         * method name : getWarningStatusInterpretation
         * @param      :
         * @return     : java.lang.String
         *
         * purpose     :
         *
         * date        : Expression date is undefined on line 20, column 19 in Templates/Classes/Code/GeneratedMethodBody. Expression time is undefined on line 20, column 27 in Templates/Classes/Code/GeneratedMethodBody.
         */
        return this.getWarningStatusInterpretation(Model.DEFAULT_LANGUAGE);
    }

    @Override
    public String getWarningStatusInterpretation(String language)
    {
        /**
         * method name : getWarningStatusInterpretation
         * @param      :
         * @return     : java.lang.String
         *
         * purpose     :
         *
         * date        : Expression date is undefined on line 20, column 19 in Templates/Classes/Code/GeneratedMethodBody. Expression time is undefined on line 20, column 27 in Templates/Classes/Code/GeneratedMethodBody.
         */
        return this.getText("statusInterpretation", language);
    }

    @Override
    public String getModelUsage()
    {
        /**
         * method name : getModelUsage
         * @param      :
         * @return     : java.lang.String
         *
         * purpose     :
         *
         * date        : Expression date is undefined on line 20, column 19 in Templates/Classes/Code/GeneratedMethodBody. Expression time is undefined on line 20, column 27 in Templates/Classes/Code/GeneratedMethodBody.
         */
        return this.getModelUsage(Model.DEFAULT_LANGUAGE);
    }

    @Override
    public String getModelUsage(String language)
    {
        /**
         * method name : getModelUsage
         * @param      :
         * @return     : java.lang.String
         *
         * purpose     :
         *
         * date        : Expression date is undefined on line 20, column 19 in Templates/Classes/Code/GeneratedMethodBody. Expression time is undefined on line 20, column 27 in Templates/Classes/Code/GeneratedMethodBody.
         */
        return this.getText("usage", language);
    }

    /**
     * TODO
     * @return 
     */
    @Override
    public String getSampleConfig()
    {
        /**
         * method name : getSampleConfig
         * @param      :
         * @return     : java.lang.String
         *
         * purpose     :
         *
         * date        : Expression date is undefined on line 20, column 19 in Templates/Classes/Code/GeneratedMethodBody. Expression time is undefined on line 20, column 27 in Templates/Classes/Code/GeneratedMethodBody.
         */
        return "TODO";
    }

    /**
     * method name : setConfiguration
     * @param      :
     * @return     : void
     *
     * purpose     :
     *
     * date        : Expression date is undefined on line 20, column 19 in Templates/Classes/Code/GeneratedMethodBody. Expression time is undefined on line 20, column 27 in Templates/Classes/Code/GeneratedMethodBody.
     */
    @Override
    public void setConfiguration(ModelConfiguration config) throws ConfigValidationException
    {

        
        List<WeatherObservation>    altenariaWeatherListDaily                       =   new ArrayList<WeatherObservation>();
        
                                    dataMatrix                                      =   new DataMatrix();
        ObjectMapper                mapper                                          =   new ObjectMapper();
                                    timeZone                                        =   TimeZone.getTimeZone((String)config.getConfigParameter("timeZone"));
                                    

        WeatherUtil                 weatherUtil                                     =   new WeatherUtil();
        List<WeatherObservation>    observations                                    =   mapper.convertValue
                                                                                        (
                                                                                                config.getConfigParameter("observations")
                                                                                            ,   new TypeReference<List<WeatherObservation>>(){}
                                                                                        );
        List<WeatherObservation>    altenariaWeatherLIstHourly_tm                   =   new ArrayList<WeatherObservation>();
        List<WeatherObservation>    altenariaWeatherLIstHourly_lw                   =   new ArrayList<WeatherObservation>();
           
        Date                        dateHourlyTm_currentDay                         =   null; 
        Date                        dateHourlyTm_previousDay                        =   null; 
        Date                        dateHourlyLw_currentDay                         =   null; 
        Date                        dateHourlyLw_previousDay                        =   null; 
        
       
        int count = 0;
                                        
        for(WeatherObservation weatherObj: observations)
        {
                

                switch(weatherObj.getElementMeasurementTypeId())
                {
                
                    case    DataMatrix.TEMPERATURE_MEAN:
                        dateHourlyTm_currentDay                                     =   trimmedDate(weatherObj.getTimeMeasured());
                        if(weatherObj.getLogIntervalId().equals(WeatherObservation.LOG_INTERVAL_ID_1H))
                        {
                            WeatherObservation      altanariaWeatherBO_tm_hourly    =   weatherObj;
                            if  (
                                        (null != dateHourlyTm_currentDay )
                                    &&  (null != dateHourlyTm_previousDay)
                                    &&  dateHourlyTm_currentDay.after   (
                                                                            dateHourlyTm_previousDay
                                                                        )
                                )
                            {
                                double counterTMHourly     =    0;
                                //TODO calculation of accumulation value and add to daily
                                for(WeatherObservation wo: altenariaWeatherLIstHourly_tm)
                                {
                                    counterTMHourly                 =       counterTMHourly + wo.getValue();
                                }
                                //average value of temperature for a day
                                dataMatrix.setParamDoubleValueForDate   (       dateHourlyTm_currentDay
                                                                            ,   DataMatrix.TEMPERATURE_MEAN
                                                                            ,   (
                                                                                    counterTMHourly
                                                                                    /
                                                                                    altenariaWeatherLIstHourly_tm.size()
                                                                                )
                                                                        );

                                    //discard old value for next day and start fresh
                                    altenariaWeatherLIstHourly_tm  =        new ArrayList<WeatherObservation>();
                            }

                                    altenariaWeatherLIstHourly_tm.add(altanariaWeatherBO_tm_hourly);
                        }

                        if(weatherObj.getLogIntervalId().equals(WeatherObservation.LOG_INTERVAL_ID_1D))
                        {
                                    if  (
                                                (null == dataMatrix.getParamDoubleValueForDate(dateHourlyTm_currentDay, DataMatrix.TEMPERATURE_MEAN) )
                                            || 
                                                ((dataMatrix.getParamDoubleValueForDate(dateHourlyTm_currentDay, DataMatrix.TEMPERATURE_MEAN)).intValue() == 0)
                                        )
                            {
                                dataMatrix.setParamDoubleValueForDate   (
                                                                                dateHourlyTm_currentDay
                                                                            ,   DataMatrix.TEMPERATURE_MEAN
                                                                            ,   weatherObj.getValue()
                                                                        );
                            }
                        }
                        
                        dateHourlyTm_previousDay = dateHourlyTm_currentDay;
                        break; 
                    
                    
                    
                    case    DataMatrix.LEAF_WETNESS_DURATION:
                        dateHourlyLw_currentDay                                     =   trimmedDate(weatherObj.getTimeMeasured());
                        if(weatherObj.getLogIntervalId().equals(WeatherObservation.LOG_INTERVAL_ID_1H))
                        {
                            WeatherObservation      altanariaWeatherBO_lw_hourly    =   weatherObj;
                            if(
                                        null != dateHourlyLw_currentDay
                                    &&  null != dateHourlyLw_previousDay 
                                    &&  dateHourlyLw_currentDay.after(dateHourlyLw_previousDay)
                                )
                            {
                                int counterLwHourly     = 0;
                                for(WeatherObservation wo: altenariaWeatherLIstHourly_lw)
                                {
                                    if(wo.getValue()    >= THRESHOLD )
                                    {
                                        counterLwHourly = counterLwHourly + 1;
                                    }

                                }

                                dataMatrix.setParamIntValueForDate(
                                                                        dateHourlyLw_currentDay
                                                                    ,   DataMatrix.LEAF_WETNESS_DURATION
                                                                    ,   counterLwHourly
                                                                   );
                                
                                altenariaWeatherLIstHourly_lw   =   new ArrayList<WeatherObservation>();
                            }

                                altenariaWeatherLIstHourly_lw.add(altanariaWeatherBO_lw_hourly);
                        }
                                dateHourlyLw_previousDay = dateHourlyLw_currentDay;
                        break;
                                
                    
                }

            //Setting DSV values to dataMatrix
            setDSV(
                        dataMatrix
                    ,   dateHourlyTm_previousDay
                    ,   DataMatrix.TEMPERATURE_MEAN
                    ,   dateHourlyLw_previousDay
                    ,   DataMatrix.LEAF_WETNESS_DURATION
                   );
            
            
            
        }
    }

  
    
    /**
     * method name  : getDSV
     * @param temp
     * @param lw
     * @return 
     * purpose      :   DSV (Daily Severity Value) calculation based on mean temperature
     *                  and Leaf Wetness
     */
    public int getDSV_DAILY(double temp, int lw )
    {
        int dsvResult = 0;

        if ((temp >= 10  && temp <= 17) && (lw <= 6))                   dsvResult  =    0;
        if ((temp >= 10  && temp <= 17) && (lw >= 7  && lw  <= 15 ))    dsvResult  =    1;
        if ((temp >= 10  && temp <= 17) && (lw >= 16 && lw  <= 20 ))    dsvResult  =    2;
        if ((temp >= 10  && temp <= 17) && (lw > 21 ))                  dsvResult  =    3;
        
        if ((temp >= 18  && temp <= 20) && (lw <= 3 ))                  dsvResult =     0;
        if ((temp >= 18  && temp <= 20) && (lw >= 4  && lw <= 8 ))      dsvResult =     1;
        if ((temp >= 18  && temp <= 20) && (lw >= 9  && lw <= 15))      dsvResult =     2;
        if ((temp >= 18  && temp <= 20) && (lw >= 16 && lw <= 22))      dsvResult =     3;
        if ((temp >= 18  && temp <= 20) && (lw >= 23))                  dsvResult =     4;
        
        if ((temp >= 21  && temp <= 25) && (lw <= 2 ))                  dsvResult =     0;
        if ((temp >= 21  && temp <= 25) && (lw >= 3  && lw <= 5 ))      dsvResult =     1;
        if ((temp >= 21  && temp <= 25) && (lw >= 6  && lw <= 12))      dsvResult =     2;
        if ((temp >= 21  && temp <= 25) && (lw >= 13 && lw <= 20))      dsvResult =     3;
        if ((temp >= 21  && temp <= 25) && (lw >= 21))                  dsvResult =     4;
        
        if ((temp >= 26  && temp <= 29) && (lw <= 3))                   dsvResult =     0;
        if ((temp >= 26  && temp <= 29) && (lw >= 4  && lw <= 8))       dsvResult =     1;
        if ((temp >= 26  && temp <= 29) && (lw >= 9  && lw <= 15))      dsvResult =     2;
        if ((temp >= 26  && temp <= 29) && (lw >= 16 && lw <= 22))      dsvResult =     3;
        if ((temp >= 26  && temp <= 29) && (lw >= 23 ))                 dsvResult =     4;
        
        
        return dsvResult;
    }
    
    /**
     * Get a trimmed date without hour,minute,second,milli second
     * @param date
     * @return 
     */
    private Date trimmedDate(Date date)
    {
        Date        resultDate  = date; 
        Calendar     calendar   =  Calendar.getInstance();
        calendar.setTime(resultDate);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE,0);
        calendar.set(Calendar.SECOND,0);
        calendar.set(Calendar.MILLISECOND,0);
        return   calendar.getTime();
    }

    /**
     * Set DSV values to the DataMatrix in HashMap
     * @param dataMatrix
     * @param tmDate
     * @param tmFlag
     * @param lwDate
     * @param lwFlag 
     */
    private void setDSV(
                                DataMatrix dataMatrix
                            ,   Date tmDate
                            ,   String tmFlag
                            ,   Date lwDate
                            ,   String lwFlag
                        )
    {
        int     resultDSV           =   0;
        double  meanTeamperature    =   0.0;
        int     leafWetnessHour     =   0;
        
        if((null != tmDate) && (null != lwDate))
        {
            if(tmDate.compareTo(lwDate) == 0)
            {
                meanTeamperature        =       (null ==  dataMatrix.getParamDoubleValueForDate(tmDate, tmFlag))
                                            ?   meanTeamperature
                                            :   dataMatrix.getParamDoubleValueForDate(tmDate, tmFlag);
                leafWetnessHour         =       (null == dataMatrix.getParamIntValueForDate(lwDate, lwFlag))
                                            ?   leafWetnessHour
                                            :   dataMatrix.getParamIntValueForDate(lwDate, lwFlag);
                
                if(meanTeamperature != 0.0 && leafWetnessHour != 0)
                {
                    resultDSV               =   getDSV_DAILY(meanTeamperature, leafWetnessHour);
                    //Set DSV into data matrix
                    dataMatrix.setParamIntValueForDate(lwDate, DataMatrix.DAILY_DISEASE_SEVERITY_VALUE, resultDSV);

                }

            }
        }
        
    }
    
    
}
