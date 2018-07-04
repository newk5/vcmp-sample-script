package com.github.newk5.vcmp.samplescript.commands;

import com.maxorator.vcmp.java.tools.commands.Command;
import com.maxorator.vcmp.java.plugin.integration.player.Player;
import com.maxorator.vcmp.java.tools.commands.CommandController;
import com.maxorator.vcmp.java.plugin.integration.generic.Colour;
import static com.github.newk5.vcmp.samplescript.controllers.MainController.server;

public class PlayerCommands implements CommandController {

    private final static Colour LIGHT_GREEN = new Colour(200, 255, 200);

    public PlayerCommands() {
    }

    @Override
    public boolean checkAccess(Player player) {
        return true;
    }

    @Command(usage = "<playerID>")
    public void ping(Player player, Integer id) {
        Player p = server.getPlayer(id);
        if (p != null) {
            server.sendClientMessage(player, LIGHT_GREEN, p.getName() + "'s ping: " + p.getPing());
        }
    }

}
