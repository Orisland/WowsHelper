/**
  * Copyright 2022 json.cn 
  */
package org.orisland.wows.doMain.SinglePlayer;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class Main_battery {

    private int max_frags_battle;
    private int frags;
    private long hits;
    private long max_frags_ship_id;
    private long shots;

}