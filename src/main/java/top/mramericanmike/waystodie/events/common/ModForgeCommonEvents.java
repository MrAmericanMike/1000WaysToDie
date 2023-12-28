package top.mramericanmike.waystodie.events.common;

import net.minecraft.world.entity.player.Player;
import net.minecraftforge.event.entity.living.LivingEntityUseItemEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import top.mramericanmike.waystodie.utils.ModUtils;

@Mod.EventBusSubscriber(modid = ModUtils.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ModForgeCommonEvents {

	@SubscribeEvent
	public static void onLivingEntityUseItemEventFinish(LivingEntityUseItemEvent.Finish event) {
		if (event.getEntity() instanceof Player thePlayer) {
			if (!thePlayer.level().isClientSide()) {
				ModUtils.LOGGER.info(event.getResultStack().getItem().toString());
				if (event.getResultStack().getItem().isEdible()) {
					ModUtils.LOGGER.info("Finished");
				}
			}
		}
	}

}
