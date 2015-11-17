package config;

import java.io.File;

import net.minecraftforge.common.config.Configuration;
import util.GameLogger;

public class Adversusconfig extends Configuration {

	private static String dir;

	private static Configuration config;
	
	public static void createAdversusConfig(){
		
		dir = GameLogger.getFilePath() + "mm/Configs/";
		File file = new File(dir + "ConfiurationFile.cfg");
		config = new Configuration(file);
		
		config.load();
		config.save();

	}

}
