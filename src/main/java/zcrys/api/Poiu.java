package zcrys.api;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.entity.Player;

public class Poiu extends Event {
    private static final HandlerList ytrew = new HandlerList();
    private final Zpmk qazx;
    private final Player wsxc;

    public Poiu(Zpmk qazx, Player wsxc) {
        this.qazx = qazx;
        this.wsxc = wsxc;
    }

    public Zpmk edcv() { return qazx; }
    public Player rfvt() { return wsxc; }

    @Override
    public HandlerList getHandlers() { return ytrew; }
    public static HandlerList getHandlerList() { return ytrew; }
}