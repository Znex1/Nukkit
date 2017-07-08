package cn.nukkit.event.vehicle;

import cn.nukkit.entity.item.EntityVehicle;
import cn.nukkit.event.Event;
import cn.nukkit.event.HandlerList;

/**
 * Created by larryTheCoder at 7/5/2015.
 * <p>
 * Nukkit Project
 */
public abstract class VehicleEvent extends Event {
    
    private static final HandlerList handlers = new HandlerList();

    public static HandlerList getHandlers() {
        return handlers;
    }

    private final EntityVehicle vehicle;

    public VehicleEvent(EntityVehicle vehicle) {
        this.vehicle = vehicle;
    }

    public EntityVehicle getVehicle() {
        return vehicle;
    }
}