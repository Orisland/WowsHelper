package org.orisland;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import net.mamoe.mirai.console.command.CommandManager;
import net.mamoe.mirai.console.plugin.jvm.JavaPlugin;
import net.mamoe.mirai.console.plugin.jvm.JvmPluginDescriptionBuilder;
import net.mamoe.mirai.event.GlobalEventChannel;
import org.orisland.wows.command.Account;
import org.orisland.wows.command.Bind;
import org.orisland.wows.command.Help;
import org.orisland.wows.command.PluginController;

import static org.orisland.wows.DataInit.init;

@Slf4j
public final class Plugin extends JavaPlugin {
    public static final Plugin INSTANCE = new Plugin();
    private Plugin() {
//        引入日志插件前置
        super(new JvmPluginDescriptionBuilder("top.orisland.wows", "0.2.5")
                .name("Wows")
                .author("Orisland")
                .dependsOn("net.mamoe.mirai-slf4j-bridge", true)
                .build());
    }

    @SneakyThrows
    @Override
    public void onEnable() {
        log.info("Wows Plugin Loaded!");
        init();

        CommandManager.INSTANCE.registerCommand(PluginController.INSTANCE, false);
        CommandManager.INSTANCE.registerCommand(Account.INSTANCE, false);
        CommandManager.INSTANCE.registerCommand(Bind.INSTANCE, false);
        CommandManager.INSTANCE.registerCommand(Help.INSTANCE, false);


        GlobalEventChannel.INSTANCE.registerListenerHost(new Handler());
    }
}