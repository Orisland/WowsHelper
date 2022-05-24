package org.orisland.wows.doMain;

import com.fasterxml.jackson.databind.JsonNode;
import lombok.Data;
import lombok.ToString;
import org.orisland.wows.doMain.Pr.ShipPr;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static org.orisland.wows.DataPack.ShipData.SearchShipIdToShipInfo;

@Data
@ToString
public class ShipDataObj {
    private Integer battle;
    private String winRate;
    private String aveDmg;
    private String aveXp;
    private String KD;
    private String hitRate;
    private ShipPr PR;
    private String surviveWinRate;


//    =====================

    private Long shoot;
    private Long hit;
    private Long wins;
    private Long Dmg;
    private Long kill;
    private Long sink;
    private Long Xp;
    private Long survive;
    private Long surviveWin;

//    =====================

    private String shipId;
    private SingleShip ship;

    /**
     * 数据为需要的内容
     */
    public void update(){
        sink = battle - survive;

        double winrate = (wins * 1.0 / battle * 1.0) * 100;
        BigDecimal winRate = new BigDecimal(winrate).setScale(2, RoundingMode.HALF_UP);
        this.winRate = winRate + "%";

        double avedmg = Dmg * 1.0 / battle;
        BigDecimal aveDmg = new BigDecimal(avedmg).setScale(0, RoundingMode.HALF_UP);
        this.aveDmg = String.valueOf(aveDmg);

        if (sink == 0){
            sink = 1L;
        }
        double KD = kill * 1.0 / sink;

        BigDecimal kd = new BigDecimal(KD).setScale(2, RoundingMode.UP);
        this.KD = String.valueOf(kd);

        double avexp = Xp * 1.0 / battle;
        BigDecimal aveXp = new BigDecimal(avexp).setScale(0, RoundingMode.UP);
        this.aveXp = String.valueOf(aveXp);

        double hitrate = (hit * 1.0 / shoot) * 100;
        BigDecimal hitRate = new BigDecimal(hitrate).setScale(2, RoundingMode.HALF_UP);
        this.hitRate = hitRate + "%";

        double surviveWinrate = (surviveWin * 1.0 / battle) * 100;
        BigDecimal surviveWinRate = new BigDecimal(surviveWinrate).setScale(2, RoundingMode.HALF_UP);
        this.surviveWinRate = surviveWinRate  + "%";
    }
}