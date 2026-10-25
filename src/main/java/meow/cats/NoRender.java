package meow.cats;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.ModInitializer;

import net.minecraft.resources.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NoRender implements ClientModInitializer {
	public static final String MOD_ID = "no-render";

	@Override
	public void onInitializeClient() {
		Config.load();
		Runtime.getRuntime().addShutdownHook(new Thread(() -> Config.save()));
	}

	public static Identifier id(String path) {
		return Identifier.fromNamespaceAndPath(MOD_ID, path);
	}
}
