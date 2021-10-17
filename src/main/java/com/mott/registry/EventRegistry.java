package com.mott.registry;

import com.mott.block.ToiletBlock;
import com.mott.entity.FutaCowEntity;
import com.mott.entity.block.SitToiletEntity;
import com.mott.event.CowJarCallback;
import com.mott.listener.BlockListener;
import net.fabricmc.fabric.api.event.player.UseBlockCallback;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.passive.CowEntity;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

import static com.mott.listener.EntityListener.*;

public class EventRegistry {

    public static void reigsterEvent() {
        CowJarCallback.EVENT.register((entity, source) -> {
            if (source.getSource() == DamageSource.ANVIL.getSource()) {
                if (entity instanceof CowEntity || entity instanceof FutaCowEntity) {
                    BlockPos pos = entity.getBlockPos();
                    World world = entity.getEntityWorld();
                    BlockState blockBelow = world.getBlockState(pos);
                    if (blockBelow.getBlock() == BlockListener.JAR) {
                        world.setBlockState(pos, BlockListener.COW_JAR.getDefaultState());
                        entity.remove(Entity.RemovalReason.KILLED);
                    }
                }
            }
            return ActionResult.SUCCESS;
        });

        UseBlockCallback.EVENT.register((player, world, hand, hitResult) -> {
            if(world.isClient) {
                return ActionResult.PASS;
            }

            if(!world.canPlayerModifyAt(player, hitResult.getBlockPos())) {
                return ActionResult.PASS;
            }

            BlockState s = world.getBlockState(hitResult.getBlockPos());
            Block b = world.getBlockState(hitResult.getBlockPos()).getBlock();

            if((b instanceof ToiletBlock) && !SitToiletEntity.OCCUPIED.containsKey(new Vec3d(hitResult.getBlockPos().getX(), hitResult.getBlockPos().getY(), hitResult.getBlockPos().getZ())) && player.getStackInHand(hand).isEmpty())
            {
                Vec3d comparePos = new Vec3d(player.getBlockPos().getX(), player.getBlockPos().getY() + 1.0D, player.getBlockPos().getZ());

                if(hitResult.getSide() != Direction.UP || SitToiletEntity.OCCUPIED.containsKey(comparePos)) {
                    return ActionResult.PASS;
                }

                SitToiletEntity sit = SIT_TOILET_ENTITY_TYPE.create(world);
                Vec3d pos = new Vec3d(hitResult.getBlockPos().getX(), hitResult.getBlockPos().getY()+ 1.0D, hitResult.getBlockPos().getZ());

                SitToiletEntity.OCCUPIED.put(pos, player.getBlockPos());
                sit.updatePosition(pos.getX(), pos.getY(), pos.getZ());
                world.spawnEntity(sit);
                player.startRiding(sit);
                return ActionResult.SUCCESS;
            }

            return ActionResult.PASS;
        });
    }
}
