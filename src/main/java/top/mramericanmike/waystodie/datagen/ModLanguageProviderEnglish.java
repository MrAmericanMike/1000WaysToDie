package top.mramericanmike.waystodie.datagen;

import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;

public class ModLanguageProviderEnglish extends LanguageProvider {
	public ModLanguageProviderEnglish(PackOutput output, String modid) {
		super(output, modid, "en_us");
	}

	@Override
	protected void addTranslations() {
		add("waystodie.died", "died...");
	}
}
