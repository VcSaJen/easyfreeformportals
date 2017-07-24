package com.vcsajen.easyfreeformportals;

import com.google.inject.Inject;
import org.spongepowered.api.Game;
import org.spongepowered.api.plugin.Plugin;
import org.spongepowered.api.event.Listener;
import org.spongepowered.api.event.game.state.GameStartedServerEvent;
import org.spongepowered.api.plugin.PluginContainer;
import org.slf4j.Logger;

/**
 * Main plugin class
 * Created by VcSaJen on 24.07.2017 18:25.
 */
@Plugin(id = "easyfreeformportals", name = "EasyFreeformPortals", description = "Create freeform portals without commands or signs!")
public class EasyFreeformPortals {

    @Inject
    private Logger logger;

    @Inject
    private Game game;

    @Inject
    private PluginContainer myPlugin;

    @Listener
    public void onServerStart(GameStartedServerEvent event) {
        // Hey! The server has started!
        // Try instantiating your logger in here.
        // (There's a guide for that)
        logger.debug("*************************");
        logger.debug("HI! MY PLUGIN IS WORKING!");
        logger.debug("*************************");
    }
}
