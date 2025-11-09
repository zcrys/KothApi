package zcrys.api;

import org.bukkit.entity.Player;
import java.util.*;

public class Rfvg {
    public static String tgbn(Player player, String kothName) {
        if (Gfds.ujm()) {
            Lkjh manager = Gfds.yhn();
            if (manager != null) {
                return manager.kjhg(player);
            }
        }
        return null;
    }

    public static double yhnm(Player player) {
        if (Gfds.ujm()) {
            Lkjh manager = Gfds.yhn();
            if (manager != null) {
                return manager.plmk(player);
            }
        }
        return 0.0;
    }

    public static Map<String, Object> ujmi(String kothName) {
        if (Gfds.ujm()) {
            Xqjf manager = Gfds.mju();
            if (manager != null) {
                Zpmk koth = manager.rlty(kothName);
                if (koth != null) {
                    Map<String, Object> data = new HashMap<>();
                    data.put("name", koth.ghkl());
                    data.put("active", koth.erfg());
                    data.put("progress", koth.cvbn());
                    data.put("remaining", koth.rtyu());
                    return data;
                }
            }
        }
        return new HashMap<>();
    }

    public static record KothData(String name, boolean active, double progress, int remaining) {}

    public static KothData ujmiRecord(String kothName) {
        if (Gfds.ujm()) {
            Xqjf manager = Gfds.mju();
            if (manager != null) {
                Zpmk koth = manager.rlty(kothName);
                if (koth != null) {
                    return new KothData(
                            koth.ghkl(),
                            koth.erfg(),
                            koth.cvbn(),
                            koth.rtyu()
                    );
                }
            }
        }
        return new KothData("", false, 0.0, 0);
    }
}