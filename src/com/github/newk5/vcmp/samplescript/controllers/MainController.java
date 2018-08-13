package com.github.newk5.vcmp.samplescript.controllers;

import com.github.newk5.vcmp.samplescript.commands.AdminCommands;
import com.github.newk5.vcmp.samplescript.commands.PlayerCommands;
import com.maxorator.vcmp.java.plugin.integration.RootEventHandler;
import com.maxorator.vcmp.java.plugin.integration.placeable.CheckPoint;
import com.maxorator.vcmp.java.plugin.integration.placeable.GameObject;
import com.maxorator.vcmp.java.plugin.integration.placeable.Pickup;
import com.maxorator.vcmp.java.plugin.integration.player.Player;
import com.maxorator.vcmp.java.plugin.integration.server.Server;
import com.maxorator.vcmp.java.plugin.integration.vehicle.Vehicle;
import com.maxorator.vcmp.java.tools.commands.CommandRegistry;
import com.maxorator.vcmp.java.tools.timers.TimerRegistry;

public class MainController extends RootEventHandler {

    public static final int COLOUR_YELLOWISH = 0xFFFF5500;

    private ClientDataController onClientData;
    protected CommandRegistry commandRegistry;
    protected TimerRegistry timerRegistry;
    public static Server server;

    public MainController(Server server) {
        super(server);
        this.server = server;
        this.timerRegistry = new TimerRegistry();
        this.onClientData = new ClientDataController();
        this.commandRegistry = new CommandRegistry(server);

        this.commandRegistry.addController(new PlayerCommands());
        this.commandRegistry.addController(new AdminCommands());

    }

    @Override
    public void onServerLoadScripts() {

    }
    
    

    public void onPlayerWeaponChange(Player p, int oldWep, int newWep) {

    }

    public void onPlayerMove(Player player, float lastX, float lastY, float lastZ, float newX, float newY, float newZ) {

    }

    public void onPlayerHealthChange(Player player, float lastHP, float newHP) {

    }

    public void onPlayerArmourChange(Player player, float lastArmour, float newArmour) {

    }

    @Override
    public void onPlayerConnect(Player player) {
        server.sendClientMessage(player, COLOUR_YELLOWISH, "Welcome to the server " + player.getName() + "!");
    }

    @Override
    public void onPlayerModuleList(Player player, String list) {

    }

    @Override
    public boolean onServerInitialise() {

        return true;
    }

    @Override
    public void onServerUnloadScripts() {

    }

    @Override
    public void onServerFrame() {
        timerRegistry.process();
    }

    @Override
    public String onIncomingConnection(String name, String password, String ip) {
        return name;
    }

    @Override
    public void onPlayerSpawn(Player player) {

    }

    @Override
    public void onPlayerDisconnect(Player player, int reason) {

    }

    @Override
    public void onPlayerEnterVehicle(Player player, Vehicle vehicle, int slot) {

    }

    @Override
    public void onPlayerExitVehicle(Player player, Vehicle vehicle) {

    }

    @Override
    public void onVehicleExplode(Vehicle vehicle) {

    }

    @Override
    public boolean onPlayerCommand(Player player, String message) {
        return commandRegistry.processCommand(player, message);
    }

    @Override
    public void onPlayerCrashReport(Player player, String crashLog) {

    }

    @Override
    public void onCheckPointExited(CheckPoint checkPoint, Player player) {

    }

    @Override
    public void onCheckPointEntered(CheckPoint checkPoint, Player player) {

    }

    @Override
    public void onPickupRespawn(Pickup pickup) {

    }

    @Override
    public void onPickupPicked(Pickup pickup, Player player) {

    }

    @Override
    public boolean onPickupPickAttempt(Pickup pickup, Player player) {

        return true;
    }

    @Override
    public void onObjectTouched(GameObject object, Player player) {

    }

    @Override
    public void onObjectShot(GameObject object, Player player, int weaponId) {

    }

    @Override
    public void onVehicleRespawn(Vehicle vehicle) {

    }

    @Override
    public void onVehicleUpdate(Vehicle vehicle, int updateType) {

    }

    @Override
    public void onPlayerSpectate(Player player, Player spectated) {

    }

    @Override
    public void onPlayerKeyBindUp(Player player, int keyBindIndex) {

    }

    @Override
    public void onPlayerKeyBindDown(Player player, int keyBindIndex) {

    }

    @Override
    public boolean onPlayerPrivateMessage(Player player, Player recipient, String message) {

        return true;
    }

    @Override
    public boolean onPlayerMessage(Player player, String message) {

        return true;
    }

    @Override
    public void onPlayerAwayChange(Player player, boolean isAway) {

    }

    @Override
    public void onPlayerEndTyping(Player player) {

    }

    @Override
    public void onPlayerBeginTyping(Player player) {

    }

    @Override
    public void onPlayerGameKeysChange(Player player, int oldKeys, int newKeys) {

    }

    @Override
    public void onPlayerCrouchChange(Player player, boolean isCrouching) {

    }

    @Override
    public void onPlayerOnFireChange(Player player, boolean isOnFire) {

    }

    @Override
    public void onPlayerActionChange(Player player, int oldAction, int newAction) {

    }

    @Override
    public void onPlayerStateChange(Player player, int oldState, int newState) {

    }

    @Override
    public void onPlayerNameChange(Player player, String oldName, String newName) {

    }

    @Override
    public boolean onPlayerRequestEnterVehicle(Player player, Vehicle vehicle, int slot) {

        return true;
    }

    @Override
    public void onPlayerUpdate(Player player, int updateType) {

    }

    @Override
    public void onPlayerDeath(Player player, Player killer, int reason, int bodyPart) {

    }

    @Override
    public boolean onPlayerRequestSpawn(Player player) {

        return true;
    }

    @Override
    public boolean onPlayerRequestClass(Player player, int classIndex) {

        return true;
    }

    @Override
    public void onClientScriptData(Player player, byte[] data) {
        this.onClientData.onClientScriptData(player, data);
    }

    @Override
    public void onPluginCommand(int identifier, String message) {

    }

    @Override
    public void onServerShutdown() {

    }

}
