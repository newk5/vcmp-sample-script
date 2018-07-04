package com.github.newk5.vcmp.samplescript.commands;

import com.maxorator.vcmp.java.plugin.integration.player.Player;
import com.maxorator.vcmp.java.tools.commands.CommandController;

public class AdminCommands implements CommandController {

    public AdminCommands() {

    }

    @Override
    public boolean checkAccess(Player player) {
        //check for player level here!
        return true;
    }

   

   

}
