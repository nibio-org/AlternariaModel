/**
 * Project			:	AlternariaModel
 * Organization			:	NIBIO, Ås
 * Department			:	VIPS
 * 
 * Author			:	bhabesh
 *
 * 
 * File Name			:	DataMatrix.java
 * Package Name			:	no.nibio.vips.model.alternariamodel
 * Date of creation		:	3 Mar. 2020 8:24:53 am
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

import no.nibio.vips.util.DateMap;

/**
 *
 * @author bhabesh
 */
public class DataMatrix extends DateMap{
    public final static String  LEAF_WETNESS_DURATION           =   "BT";           //  Leaf wetness 2 m, minutes per hour
    public final static String  TEMPERATURE_MEAN                =   "TM";           //  Mean Temperature
    public final static String  DAILY_DISEASE_SEVERITY_VALUE    =   "DSV";          //  Daily Disease Severity Value
}
