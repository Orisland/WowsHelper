/**
  * Copyright 2022 json.cn 
  */
package org.orisland.wows.doMain.singleShipData;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class Torpedoes {

    private int max_frags_battle;
    private int frags;
    private int hits;
    private int shots;


}