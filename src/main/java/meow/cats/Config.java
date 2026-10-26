package meow.cats;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import net.fabricmc.loader.api.FabricLoader;

import java.awt.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class Config {

    private static final Gson GSON = new GsonBuilder()
            .setPrettyPrinting()
            .registerTypeAdapter(Color.class, new com.google.gson.JsonSerializer<Color>() {
                @Override
                public com.google.gson.JsonElement serialize(
                        Color color,
                        java.lang.reflect.Type type,
                        com.google.gson.JsonSerializationContext context) {
                    return new com.google.gson.JsonPrimitive(color.getRGB());
                }
            })
            .registerTypeAdapter(Color.class, new com.google.gson.JsonDeserializer<Color>() {
                @Override
                public Color deserialize(
                        com.google.gson.JsonElement json,
                        java.lang.reflect.Type type,
                        com.google.gson.JsonDeserializationContext context) {
                    return new Color(json.getAsInt(), true);
                }
            })
            .create();

    private static final Path PATH =
            FabricLoader.getInstance().getConfigDir().resolve("NoRender.json");

    public boolean fullBright = false;
    public boolean noBlockOverlay = true;
    public boolean noFire = true;
    public boolean noPopAnimation = true;
    public boolean noPortalOverlay = true;
    public boolean noPotionIcons = false;
    public boolean noPumpkinOverlay = true;
    public boolean noPowderedSnowOverlay = true;
    public boolean noVignette = false;
    public boolean noScoreboard = false;
    public boolean noSpyglassOverlay = false;
    public boolean noCrosshair  = false;
    public boolean noTitle = false;
    public boolean noHeldItemName = false;
    public boolean noNausea  = false;
    public boolean noLiquidOverlay = true;
    public boolean noArmor = false;
    public boolean noBossBar = false;
    public boolean noWeather = false;
    public boolean noWorldBorder = false;
    public boolean noBlindness = true;
    public boolean noTextureRotations = false;
    public boolean noFog = false;
    public boolean noParticles = false;

    public static Config INSTANCE = new Config();

    public static void load() {
        try {
            File file = PATH.toFile();

            if (file.exists()) {
                INSTANCE = GSON.fromJson(new FileReader(file), Config.class);
                if (INSTANCE == null) {
                    INSTANCE = new Config();
                }
            } else {
                INSTANCE = new Config();
                save();
                return;
            }
            save();
        } catch (Exception e) {
            e.printStackTrace();
            INSTANCE = new Config();
        }
    }

    public static void save() {
        try {
            Files.createDirectories(PATH.getParent());

            try (Writer writer = Files.newBufferedWriter(PATH)) {
                GSON.toJson(INSTANCE, writer);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}