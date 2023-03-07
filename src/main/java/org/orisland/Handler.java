package org.orisland;

import Tool.JsonTool;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import net.mamoe.mirai.Bot;
import net.mamoe.mirai.console.command.CommandSenderOnMessage;
import net.mamoe.mirai.event.*;
import net.mamoe.mirai.event.events.FriendMessageEvent;
import net.mamoe.mirai.event.events.GroupMessageEvent;

import net.mamoe.mirai.event.events.MessageEvent;
import net.mamoe.mirai.message.data.*;
import org.orisland.wows.ApiConfig;
import org.orisland.wows.dataPack.StringToMeaningful;
import org.orisland.wows.doMain.ShipDataObj;
import org.orisland.wows.doMain.SingleShipDataSimple;


import java.io.IOException;
import java.util.List;

import static org.orisland.wows.DataInit.initDataRefresh;
import static org.orisland.wows.DataInit.initPrImg;
import static org.orisland.wows.dataPack.DiffData.accountRecordAt;
import static org.orisland.wows.dataPack.PlayerData.*;
import static org.orisland.wows.dataPack.PrData.*;
import static org.orisland.wows.dataPack.ShipData.*;
import static org.orisland.wows.dataPack.DiffData.diffShip;

/**
 * @Author: zhaolong
 * @Time: 3:07 下午
 * @Date: 2021年07月03日 15:07
 **/
public class Handler extends SimpleListenerHost {
    @EventHandler
    public ListeningStatus friendListener(FriendMessageEvent event) throws IOException {

        return ListeningStatus.LISTENING;
    }


    @EventHandler
    public ListeningStatus groupListener(GroupMessageEvent event) throws IOException {



        return ListeningStatus.LISTENING;
    }

    @EventHandler
    public ListeningStatus bothEven(MessageEvent event) throws IOException {

        return ListeningStatus.LISTENING;
    }


}
