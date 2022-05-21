package org.orisland.wows;

import com.fasterxml.jackson.databind.JsonNode;
import org.orisland.Plugin;

import java.io.File;

public class ApiConfig {
    /**
     * app id
     * url:<a href="https://developers.wargaming.net/applications/">申请AppId</a>
     */
    public static String APPID = "";

    //TODO: 等插件完成后再考虑是否增加正确的中文语言环境，至少不是动物园,wg的脑子一定是抽了
//    2022年5月22日02:05:13， NH4帮我整理了一份较为粗略的船只数据.
    /**
     * "cs" — Čeština
     * "de" — Deutsch
     * "en" — English (默认)
     * "es" — Español
     * "fr" — Français
     * "ja" — 日本語
     * "pl" — Polski
     * "ru" — Русский
     * "th" — ไทย
     * "zh-tw" — 繁體中文
     * "tr" — Türkçe
     * "zh-cn" — 中文
     * "pt-br" — Português do Brasil
     * "es-mx" — Español (México)
     */
    public static String API_LANGUAGE = "en";

    /**
     * 用昵称查用户
     * server-appid-昵称
     */
    public static final String NICKNAME_ACCOUNTID = "https://api.worldofwarships.%s/wows/account/list/?application_id=%s&search=%s";

    /**
     * 用id查用户(唯一)
     * server-appid-uid
     */
    public static final String ACCOUNTID_ACCOUNTINFO = "https://api.worldofwarships.%s/wows/account/info/?application_id=%s&account_id=%s";

    /**
     * 查询单个指定船的信息(唯一)
     * server-appid-shipid-language
     */
    public static final String SHIPID_SHIPIINFO = "https://api.worldofwarships.%s/wows/encyclopedia/ships/?application_id=%s&ship_id=%s&language=%s";

    /**
     * wowsnumber的名片
     * uid
     */
    public static final String ACCOUNT_CARD = "https://static.wows-numbers.com/wows/%s.png";

    /**
     * 船只期望数据
     * 获取用户pr和指定船的pr的数据源
     */
    public static final String Wows_Pr = "https://api.wows-numbers.com/personal/rating/expected/json/";

    /**
     * 按日期查询玩家数据
     * 获取指定日期的玩家数据,不指定日期为当前日期,没有就向上翻一个月
     * dates允许输入以逗号分割的日期YYYYMMDD,YYYYMMDD
     * server-appid-uid-dates-language
     */
    public static final String DATE_PLAYERINFO = "https://api.worldofwarships.%s/wows/account/statsbydate/?application_id=%s&account_id=%s&dates=%s&language=%s";

    /**
     *获取指定用户的所有船只战绩信息或指定船只信息
     * server-appid-uid-shipid-language
     */
    public static final String ACCOUNT_SHIP = "https://api.worldofwarships.%s/wows/ships/stats/?application_id=%s&account_id=%s&ship_id=%s&language=%s";

    /**
     * 读取本地的翻译文件
     */
    public static JsonNode LOCAL_SHIP_INFO = null;

    /**
     * 本地玩家数据地址
     */
    public static final String dataDir = Plugin.INSTANCE.getDataFolder() + File.separator;

    /**
     * 配置文件地址
     */
    public static final String configDir = Plugin.INSTANCE.getConfigFolder() + File.separator;

    /**
     * server
     * 欧服，亚服，美服，俄服
     */
    public static enum Server{
        EU, ASIA, NA, RU
    }

    /**
     * 读取本地船只预期数据
     */
    public static JsonNode ShipExpected;

    //=============================以下api暂未使用
    //窝窝屎的各种server-> server
    public static final String WOWS_numbers= "https://%s.wows-numbers.com/player/";

    //窝窝屎最近战绩
    //查最近开的船战绩,wowsnumber渠道->server-船种/单船-uid-date-类型
    public static final String WOWS_numbers_ships_types = "https://%s.wows-numbers.com/user/snapshot/%s.ajax?accountId=%s&date=%s&type=%s";

}
