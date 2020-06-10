/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package no.nibio.vips.model.alternariamodel;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.MappingJsonFactory;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import no.nibio.vips.entity.ModelConfiguration;
import no.nibio.vips.entity.Result;
import no.nibio.vips.entity.WeatherObservation;
import no.nibio.vips.model.ModelId;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author bhabesh
 */
public class AlternariaModelTest {
    private             DataMatrix  dataMatrix;
    private             String      FILE_WEATHER_DATA_FILE_01       =   "/dataset01/weatherdata_leaf_wetness_temperature.json";
    private             String      FILE_WEATHER_DATA_RESET_01      =   "/dataset01/reset_dates.json"; 
    
    private             String      FILE_WEATHER_DATA_FILE_02       =   "/dataset02/weatherdata_leaf_wetness_temperature_02.json";  
    private             String      FILE_WEATHER_DATA_RESET_02      =   "/dataset02/reset_dates_02.json";  
 
    private             String      FILE_WEATHER_DATA_FILE_03       =   "/dataset03/weatherdata_leaf_wetness_temperature_03.json";  
    private             String      FILE_WEATHER_DATA_RESET_03      =   "/dataset03/reset_dates_03.json";  
    
    private             String      FILE_WEATHER_DATA_FILE_04       =   "/dataset04/weatherdata_leaf_wetness_temperature_04_staion_id_11.json";  
    private             String      FILE_WEATHER_DATA_RESET_04      =   "/dataset04/reset_dates_04.json"; 
    
    private             String      FILE_WEATHER_DATA_FILE_05       =   "/dataset05/weatherdata_leaf_wetness_temperature_05_staion_id_11.json";  
    private             String      FILE_WEATHER_DATA_RESET_05      =   "/dataset05/reset_dates_05.json";

    private             String      FILE_WEATHER_DATA_FILE_06       =   "/dataset06/weatherdata_leaf_wetness_temperature_06_staion_id_118.json";  
    private             String      FILE_WEATHER_DATA_RESET_06      =   "/dataset06/reset_dates_06.json";

    private             String      FILE_WEATHER_DATA_FILE_07       =   "/dataset07/weatherdata_leaf_wetness_temperature_07_staion_id_118.json";  
    private             String      FILE_WEATHER_DATA_RESET_07      =   "/dataset07/reset_dates_07.json";
    
    private     final   String      CONST_TEST_DATA_01              =   "TEST_DATA_01";  
    private     final   String      CONST_TEST_DATA_02              =   "TEST_DATA_02";  
    private     final   String      CONST_TEST_DATA_03              =   "TEST_DATA_03";  
    private     final   String      CONST_TEST_DATA_04              =   "TEST_DATA_04"; 
    private     final   String      CONST_TEST_DATA_05              =   "TEST_DATA_05";
    private     final   String      CONST_TEST_DATA_06              =   "TEST_DATA_06";
    private     final   String      CONST_TEST_DATA_07              =   "TEST_DATA_07";
    
    private     final   String      EFFECTED_FILE_WEATHER_TEST_DATA =   CONST_TEST_DATA_04;
    
    public AlternariaModelTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getResult method, of class AlternariaModel.
     */
    @org.junit.jupiter.api.Test
    public void testGetResult() throws Exception {
        System.out.println("getResult");
        ModelConfiguration config   = this.getConfiguration(getWeatherDataFile());
        config.setConfigParameter("sprayingDates", this.getConfigurationSprayingDates(getResetDataFile())); 
        AlternariaModel instance = new AlternariaModel();
        instance.setConfiguration(config);
        List<Result> result = instance.getResult();
        assertNotNull(result);
       
       /* 
        for(Result res:result)
        {
            // LOGGER.log(Level.INFO, res.toString());
            System.out.println(res.toString());
        }
       */ 
        
        
    }

    /**
     * Test of getModelId method, of class AlternariaModel.
     */
    @org.junit.jupiter.api.Test
    public void testGetModelId() {
        System.out.println("getModelId");
        AlternariaModel     instance    = new AlternariaModel();
        ModelId             expResult   = new ModelId(AlternariaModel.NAME_MODEL_ID);
        ModelId             result      = instance.getModelId();
        assertEquals(expResult.toString(), result.toString());
    }

    /**
     * Test of getModelName method, of class AlternariaModel.
     */
    @org.junit.jupiter.api.Test
    public void testGetModelName_0args() {
        System.out.println("getModelName");
        AlternariaModel instance = new AlternariaModel();
        String result = instance.getModelName();
        assertNotNull(result);
    }

    /**
     * Test of getModelName method, of class AlternariaModel.
     */
    @org.junit.jupiter.api.Test
    public void testGetModelName_String() {
        System.out.println("getModelName");
        String language = "";
        AlternariaModel instance = new AlternariaModel();
        String result = instance.getModelName(language);
        assertNotNull(result);
    }

    /**
     * Test of getLicense method, of class AlternariaModel.
     * TODO - Recheck the functionality
     */
    @org.junit.jupiter.api.Test
    public void testGetLicense() {
        System.out.println("getLicense");
        AlternariaModel instance = new AlternariaModel();
        String expResult = "";
        String result = instance.getLicense();
        assertNotNull(result);
    }

    /**
     * Test of getCopyright method, of class AlternariaModel.
     */
    @org.junit.jupiter.api.Test
    public void testGetCopyright() {
        System.out.println("getCopyright");
        AlternariaModel instance = new AlternariaModel();
        String expResult = "";
        String result = instance.getCopyright();
        assertNotNull(result);
    }

    /**
     * Test of getModelDescription method, of class AlternariaModel.
     */
    @org.junit.jupiter.api.Test
    public void testGetModelDescription_0args() {
        System.out.println("getModelDescription");
        AlternariaModel instance = new AlternariaModel();
        String expResult = "";
        String result = instance.getModelDescription();
        assertNotNull(result);
    }

    /**
     * Test of getModelDescription method, of class AlternariaModel.
     */
    @org.junit.jupiter.api.Test
    public void testGetModelDescription_String() {
        System.out.println("getModelDescription");
        String language = "";
        AlternariaModel instance = new AlternariaModel();
        String expResult = "";
        String result = instance.getModelDescription(language);
        assertNotNull(result);
  
    }

    /**
     * Test of getWarningStatusInterpretation method, of class AlternariaModel.
     * TODO - Recheck the functionality
     */
    @org.junit.jupiter.api.Test
    public void testGetWarningStatusInterpretation_0args() {
        System.out.println("getWarningStatusInterpretation");
        AlternariaModel instance = new AlternariaModel();
        String expResult = "";
        String result = instance.getWarningStatusInterpretation();
        assertNotNull(result);


    }

    /**
     * Test of getWarningStatusInterpretation method, of class AlternariaModel.
     * TODO - Recheck the functionality
     */
    @org.junit.jupiter.api.Test
    public void testGetWarningStatusInterpretation_String() {
        System.out.println("getWarningStatusInterpretation");
        String language = "";
        AlternariaModel instance = new AlternariaModel();
        String expResult = "";
        String result = instance.getWarningStatusInterpretation(language);
        assertNotNull(result);
 
    }

    /**
     * Test of getModelUsage method, of class AlternariaModel.
     * TODO - Recheck the functionality
     */
    @org.junit.jupiter.api.Test
    public void testGetModelUsage_0args() {
        System.out.println("getModelUsage");
        AlternariaModel instance = new AlternariaModel();
        String expResult = "";
        String result = instance.getModelUsage();
        assertNotNull(result);
    }

    /**
     * Test of getModelUsage method, of class AlternariaModel.
     * TODO - Recheck the functionality
     */
    @org.junit.jupiter.api.Test
    public void testGetModelUsage_String() {
        System.out.println("getModelUsage");
        String language = "";
        AlternariaModel instance = new AlternariaModel();
        String expResult = "";
        String result = instance.getModelUsage(language);
        assertNotNull(result);
    }

    /**
     * Test of getSampleConfig method, of class AlternariaModel.
     * TODO - Recheck the functionality
     */
    @org.junit.jupiter.api.Test
    public void testGetSampleConfig() {
        System.out.println("getSampleConfig");
        AlternariaModel instance = new AlternariaModel();
        String expResult = "";
        String result = instance.getSampleConfig();
        assertNotNull(result);
    }

    /**
     * Test of setConfiguration method, of class AlternariaModel.
     */
    @org.junit.jupiter.api.Test
    public void testSetConfiguration() throws Exception {
        System.out.println("setConfiguration");
        ModelConfiguration config = this.getConfiguration(getWeatherDataFile());
        config.setConfigParameter("sprayingDates", this.getConfigurationSprayingDates(getResetDataFile()));
        AlternariaModel instance = new AlternariaModel();
        instance.setConfiguration(config);
        assertNotNull(instance);
    }
    
    
    private ModelConfiguration getConfiguration(String fileName)
    {
        List<Date> sprayingDates  =  new ArrayList<Date>();
        try {
            
            ModelConfiguration config = new ModelConfiguration();
            config.setModelId(AlternariaModel.MODEL_ID.toString());
            
            
            config.setConfigParameter("timeZone", "Europe/Oslo");
            BufferedInputStream inputStream = new BufferedInputStream(this.getClass().getResourceAsStream(fileName));
            JsonFactory f = new MappingJsonFactory();
            JsonParser jp = f.createParser(inputStream);
            JsonNode all = jp.readValueAsTree();
            List<WeatherObservation> observations = new ArrayList<>();
            ObjectMapper mapper = new ObjectMapper();

            Date firstDate = null;
            Date lastDate = null;
            if(all.isArray())
            {
                for(JsonNode node : all){
                    Date timeMeasured = (Date)mapper.convertValue(node.get("timeMeasured").asText(), new TypeReference<Date>(){});
                    if(firstDate == null || firstDate.compareTo(timeMeasured) > 0)
                    {
                        firstDate = timeMeasured;
                    }
                    if(lastDate == null || lastDate.compareTo(timeMeasured) < 0)
                    {
                        lastDate = timeMeasured;
                    }
                    //System.out.println(node.toString());
                    WeatherObservation observation = new WeatherObservation();
                    observation.setTimeMeasured(timeMeasured);
                    observation.setLogIntervalId(node.get("logIntervalId").asInt());
                    observation.setElementMeasurementTypeId(node.get("elementMeasurementTypeId").asText());
                    observation.setValue(node.get("value").asDouble());
                    observations.add(observation);
                }

            }
            else
            {
                fail("Data input from file is not a JSON array");
            }
            config.setConfigParameter("observations", observations);
            
            
            try{
                
            }
            catch(Exception ex)
            {
                
            }

            
            return config;
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        } 
    }
        
        
    private List<Date> getConfigurationSprayingDates(String fileName)
    {
        
        try {
            List<Date> sprayingDates  =  new ArrayList<Date>();
   
            BufferedInputStream inputStream = new BufferedInputStream(this.getClass().getResourceAsStream(fileName));
            JsonFactory f = new MappingJsonFactory();
            JsonParser jp = f.createParser(inputStream);
            JsonNode all = jp.readValueAsTree();
            
            ObjectMapper mapper = new ObjectMapper();

            Date firstDate = null;
            Date lastDate = null;
            if(null != all)
            {
                if(all.isArray())
                {
                    for(JsonNode node : all){

                        Date timeMeasuredForSpray = (Date)mapper.convertValue(node, new TypeReference<Date>(){});
                        //System.out.println("Spraying Date : "+timeMeasuredForSpray);
                        if(timeMeasuredForSpray != null )
                        {
                            sprayingDates.add(timeMeasuredForSpray);
                        }

                    }

                }
                else
                {
                    fail("Data input from file is not a JSON array for list of spraying dates");
                }
            }

            
            return sprayingDates;
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        } 
    }
    
    /**
     * 
     * @return 
     */
    private String getWeatherDataFile()
    {
        switch (EFFECTED_FILE_WEATHER_TEST_DATA)
        {
            case    CONST_TEST_DATA_01:
                        return FILE_WEATHER_DATA_FILE_01;
            case    CONST_TEST_DATA_02:
                        return FILE_WEATHER_DATA_FILE_02;
            case    CONST_TEST_DATA_03:
                        return FILE_WEATHER_DATA_FILE_03;
            case    CONST_TEST_DATA_04:
                        return FILE_WEATHER_DATA_FILE_04;  
            case    CONST_TEST_DATA_05:
                        return FILE_WEATHER_DATA_FILE_05;  
            case    CONST_TEST_DATA_06:
                        return FILE_WEATHER_DATA_FILE_06; 
            case    CONST_TEST_DATA_07:
                        return FILE_WEATHER_DATA_FILE_07;                          
            default:
                        return "N/A";
                        
        }
    }
        
     private String getResetDataFile()
    {
        switch (EFFECTED_FILE_WEATHER_TEST_DATA)
        {
            case    CONST_TEST_DATA_01:
                        return FILE_WEATHER_DATA_RESET_01;
            case    CONST_TEST_DATA_02:
                        return FILE_WEATHER_DATA_RESET_02;
            case    CONST_TEST_DATA_03:
                        return FILE_WEATHER_DATA_RESET_03;
            case    CONST_TEST_DATA_04:
                        return FILE_WEATHER_DATA_RESET_04;
            case    CONST_TEST_DATA_05:
                        return FILE_WEATHER_DATA_RESET_05;
            case    CONST_TEST_DATA_06:
                        return FILE_WEATHER_DATA_RESET_06;
            case    CONST_TEST_DATA_07:
                        return FILE_WEATHER_DATA_RESET_07;                        
                        
                        
            default:
                        return "N/A";
                        
        }   
            
    }
}
