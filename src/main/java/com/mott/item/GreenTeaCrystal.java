package com.mott.item;

import com.mott.listener.SoundEventListener;
import com.mott.registry.ItemGroupRegistry;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class GreenTeaCrystal extends Item {

    public GreenTeaCrystal() {
        super(new Item.Settings().group(ItemGroupRegistry.COMMON_GROUP));
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        world.playSound((PlayerEntity)null, user.getX(), user.getY(), user.getZ(), SoundEventListener.GIEGIE_SOUND, SoundCategory.PLAYERS, 0.5F, world.random.nextFloat() * 0.1F + 0.9F);
        return super.use(world, user, hand);
    }
}
