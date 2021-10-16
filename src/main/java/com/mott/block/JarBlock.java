package com.mott.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class JarBlock extends Block {

    public static final DirectionProperty FACING = Properties.HORIZONTAL_FACING;
    private static final VoxelShape SHAPE = Block.createCuboidShape(4.8, 0, 4.8, 11.2, 8.0, 11.2);
    public static final BooleanProperty LOWERED = BooleanProperty.of("lowered");
    public static final BooleanProperty HAS_COLOR = BooleanProperty.of("has_color");

    public JarBlock() {
        super(FabricBlockSettings.of(Material.GLASS).sounds(BlockSoundGroup.GLASS).strength(1.5F, 3.0F));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        super.appendProperties(builder);
        builder.add(FACING);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        if (shouldBlockRenderLowered(world, pos)) {
            return SHAPE.offset(0, -0.05, 0);
        }
        return SHAPE;
    }

    @Override
    public BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.MODEL;
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext context) {
        BlockState state = getDefaultState().with(FACING, context.getPlayerFacing().getOpposite());
        if (state.contains(LOWERED)) {
            state = state.with(LOWERED, shouldBeLoweredUpon(context.getWorld().getBlockState(context.getBlockPos().down())));
        }
        return state.contains(HAS_COLOR) ? state.with(HAS_COLOR, false) : state;
    }

    public static boolean shouldBlockRenderLowered(BlockView world, BlockPos pos) {
        return shouldBeLoweredUpon(world.getBlockState(pos.down()));
    }

    private static boolean shouldBeLoweredUpon(BlockState stateBelow) {
        Block blockBelow = stateBelow.getBlock();
        return blockBelow instanceof JarBlock;
    }

}
