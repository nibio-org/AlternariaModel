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
    private           DataMatrix  dataMatrix;
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
        ModelConfiguration config   = this.getConfiguration("/weatherdata_leaf_wetness_temperature.json");
        AlternariaModel instance = new AlternariaModel();
        instance.setConfiguration(config);
        List<Result> result = instance.getResult();
        assertNotNull(result);
        
        for(Result res:result)
        {
            System.out.println(res.toString());
        }

        
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
     */
    @org.junit.jupiter.api.Test
    public void testGetLicense() {
        System.out.println("getLicense");
        AlternariaModel instance = new AlternariaModel();
        String expResult = "";
        String result = instance.getLicense();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getWarningStatusInterpretation method, of class AlternariaModel.
     */
    @org.junit.jupiter.api.Test
    public void testGetWarningStatusInterpretation_0args() {
        System.out.println("getWarningStatusInterpretation");
        AlternariaModel instance = new AlternariaModel();
        String expResult = "";
        String result = instance.getWarningStatusInterpretation();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getWarningStatusInterpretation method, of class AlternariaModel.
     */
    @org.junit.jupiter.api.Test
    public void testGetWarningStatusInterpretation_String() {
        System.out.println("getWarningStatusInterpretation");
        String language = "";
        AlternariaModel instance = new AlternariaModel();
        String expResult = "";
        String result = instance.getWarningStatusInterpretation(language);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getModelUsage method, of class AlternariaModel.
     */
    @org.junit.jupiter.api.Test
    public void testGetModelUsage_0args() {
        System.out.println("getModelUsage");
        AlternariaModel instance = new AlternariaModel();
        String expResult = "";
        String result = instance.getModelUsage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getModelUsage method, of class AlternariaModel.
     */
    @org.junit.jupiter.api.Test
    public void testGetModelUsage_String() {
        System.out.println("getModelUsage");
        String language = "";
        AlternariaModel instance = new AlternariaModel();
        String expResult = "";
        String result = instance.getModelUsage(language);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSampleConfig method, of class AlternariaModel.
     */
    @org.junit.jupiter.api.Test
    public void testGetSampleConfig() {
        System.out.println("getSampleConfig");
        AlternariaModel instance = new AlternariaModel();
        String expResult = "";
        String result = instance.getSampleConfig();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setConfiguration method, of class AlternariaModel.
     */
    @org.junit.jupiter.api.Test
    public void testSetConfiguration() throws Exception {
        System.out.println("setConfiguration");
        ModelConfiguration config = this.getConfiguration("/weatherdata_leaf_wetness_temperature.json");
        AlternariaModel instance = new AlternariaModel();
        instance.setConfiguration(config);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    
        private ModelConfiguration getConfiguration(String fileName)
    {
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

            
            return config;
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        } 
    }
}
