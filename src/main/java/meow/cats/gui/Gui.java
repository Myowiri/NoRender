package meow.cats.gui;

import meow.cats.CatGui;
import meow.cats.Config;
import meow.cats.items.BooleanButton;
import meow.cats.items.CentedText;

public class Gui extends CatGui {

    public static Gui Instance;

    public Gui() {
        Instance = this;
    }

    static{
        Instance = new Gui();
    }

    @Override
    public int getStartY(){
        return 30;
    }


    @Override
    public void addButtons(){

        buttons.add(new BooleanButton(Config.INSTANCE.fullBright, "Full Bright", v -> Config.INSTANCE.fullBright = v));

        buttons.add(new BooleanButton(Config.INSTANCE.noBlockOverlay, "No Block Overlay", v -> Config.INSTANCE.noBlockOverlay = v));
        buttons.add(new BooleanButton(Config.INSTANCE.noFire, "No Fire", v -> Config.INSTANCE.noFire = v));
        buttons.add(new BooleanButton(Config.INSTANCE.noPopAnimation, "No Pop Animation", v -> Config.INSTANCE.noPopAnimation = v));
        buttons.add(new BooleanButton(Config.INSTANCE.noPortalOverlay, "No Portal Overlay", v -> Config.INSTANCE.noPortalOverlay = v));
        buttons.add(new BooleanButton(Config.INSTANCE.noPotionIcons, "No Potion Icons", v -> Config.INSTANCE.noPotionIcons = v));
        buttons.add(new BooleanButton(Config.INSTANCE.noPumpkinOverlay, "No Pumpkin Overlay", v -> Config.INSTANCE.noPumpkinOverlay = v));
        buttons.add(new BooleanButton(Config.INSTANCE.noPowderedSnowOverlay, "No Powdered Snow Overlay", v -> Config.INSTANCE.noPowderedSnowOverlay = v));
        buttons.add(new BooleanButton(Config.INSTANCE.noVignette, "No Vignette", v -> Config.INSTANCE.noVignette = v));
        buttons.add(new BooleanButton(Config.INSTANCE.noScoreboard, "No Scoreboard", v -> Config.INSTANCE.noScoreboard = v));
        buttons.add(new BooleanButton(Config.INSTANCE.noSpyglassOverlay, "No Spyglass Overlay", v -> Config.INSTANCE.noSpyglassOverlay = v));
        buttons.add(new BooleanButton(Config.INSTANCE.noCrosshair, "No Crosshair", v -> Config.INSTANCE.noCrosshair = v));
        buttons.add(new BooleanButton(Config.INSTANCE.noTitle, "No Title", v -> Config.INSTANCE.noTitle = v));
        buttons.add(new BooleanButton(Config.INSTANCE.noHeldItemName, "No Held Item Name", v -> Config.INSTANCE.noHeldItemName = v));
        buttons.add(new BooleanButton(Config.INSTANCE.noNausea, "No Nausea", v -> Config.INSTANCE.noNausea = v));
        buttons.add(new BooleanButton(Config.INSTANCE.noLiquidOverlay, "No Liquid Overlay", v -> Config.INSTANCE.noLiquidOverlay = v));
        buttons.add(new BooleanButton(Config.INSTANCE.noArmor, "No Armor", v -> Config.INSTANCE.noArmor = v));
        buttons.add(new BooleanButton(Config.INSTANCE.noBossBar, "No Boss Bar", v -> Config.INSTANCE.noBossBar = v));
        buttons.add(new BooleanButton(Config.INSTANCE.noWeather, "No Weather", v -> Config.INSTANCE.noWeather = v));
        buttons.add(new BooleanButton(Config.INSTANCE.noWorldBorder, "No World Border", v -> Config.INSTANCE.noWorldBorder = v));
        buttons.add(new BooleanButton(Config.INSTANCE.noBlindness, "No Blindness", v -> Config.INSTANCE.noBlindness = v));
        buttons.add(new BooleanButton(Config.INSTANCE.noTextureRotations, "No Texture Rotations", v -> Config.INSTANCE.noTextureRotations = v));
        buttons.add(new BooleanButton(Config.INSTANCE.noFog, "No Fog", v -> Config.INSTANCE.noFog = v));
        buttons.add(new BooleanButton(Config.INSTANCE.noParticles, "No Particles", v -> Config.INSTANCE.noParticles = v));




    }

}
