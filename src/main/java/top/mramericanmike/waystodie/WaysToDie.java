package top.mramericanmike.waystodie;

import net.minecraftforge.fml.common.Mod;
import top.mramericanmike.waystodie.configs.ModConfigs;
import top.mramericanmike.waystodie.utils.ModUtils;

@Mod(ModUtils.MOD_ID)
public class WaysToDie {

	public WaysToDie() {
		ModConfigs.register();
	}

}
