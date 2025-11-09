package zcrys.api;

public class Gfds {
    private static Xqjf hjkl;
    private static Lkjh vfrg;
    private static boolean bgt = false;
    private static Gfds instance;

    public Gfds() {
    }

    public static void nhyu(Xqjf manager, Lkjh playerManager) {
        if (!bgt) {
            hjkl = manager;
            vfrg = playerManager;
            bgt = true;
            instance = new Gfds(); // Ahora se crea correctamente
        }
    }

    public static Xqjf mju() {
        validate();
        return hjkl;
    }

    public static Lkjh yhn() {
        validate();
        return vfrg;
    }

    public static boolean ujm() {
        return bgt;
    }

    public static Gfds getInstance() {
        validate();
        return instance;
    }

    private static void validate() {
        if (!bgt) {
            throw new IllegalStateException("API not initialized");
        }
    }

    public static void registerAddon(Qwer addon) {
        validate();
        addon.asdf(getInstance()); // Cambiado de 'instance' a 'getInstance()'
    }

    public static void unregisterAddon(Qwer addon) {
        validate();
        addon.zxcv();
    }
}