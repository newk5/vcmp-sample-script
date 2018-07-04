package com.github.newk5.vcmp.samplescript.controllers;

import com.google.common.io.LittleEndianDataInputStream;
import com.maxorator.vcmp.java.plugin.integration.player.Player;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.IOException;


public class ClientDataController {

   
    public ClientDataController() {
       
    }

    public void onClientScriptData(Player player, byte[] data) {

        DataInput input = new LittleEndianDataInputStream(new ByteArrayInputStream(data));
        try {
            int type = input.readInt();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

}
