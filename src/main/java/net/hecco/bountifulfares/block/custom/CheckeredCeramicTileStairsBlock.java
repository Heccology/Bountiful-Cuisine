package net.hecco.bountifulfares.block.custom;

import net.hecco.bountifulfares.block.interfaces.DyeableCeramicBlockInterface;
import net.hecco.bountifulfares.block.ModBlocks;
import net.hecco.bountifulfares.block.entity.CeramicTilesBlockEntity;
import net.hecco.bountifulfares.item.ModItems;
import net.hecco.bountifulfares.item.custom.ArtisanBrushItem;
import net.hecco.bountifulfares.util.ModItemTags;
import net.minecraft.block.BlockState;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.enums.BlockHalf;
import net.minecraft.block.enums.StairShape;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

public class CheckeredCeramicTileStairsBlock extends StairsBlock implements DyeableCeramicBlockInterface {
    public CheckeredCeramicTileStairsBlock(BlockState baseBlockState, Settings settings) {
        super(baseBlockState, settings);
        this.setDefaultState(this.stateManager.getDefaultState().with(FACING, Direction.NORTH).with(HALF, BlockHalf.BOTTOM).with(SHAPE, StairShape.STRAIGHT).with(WATERLOGGED, false));

    }
    @Override
    public ItemStack getPickStack(BlockView world, BlockPos pos, BlockState state) {
        if (CeramicTilesBlockEntity.getColor(world, pos) != CeramicTilesBlockEntity.DEFAULT_COLOR) {
            ItemStack stack = super.getPickStack(world, pos, state);
            return pickBlock(world,pos,stack);
        } else {
            return new ItemStack(ModBlocks.CHECKERED_CERAMIC_TILE_STAIRS);
        }
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        ItemStack itemStack = player.getStackInHand(hand);
        int oldColor = CeramicTilesBlockEntity.getColor(world, pos);
        if ((itemStack.isIn(ModItemTags.DYES) //|| itemStack.isIn(ModItemTags.ELS_AND_LS_DYES)
        ) && CeramicTilesBlockEntity.getColor(world, pos) != CeramicTilesBlockEntity.DEFAULT_COLOR) {
            world.setBlockState(pos, ModBlocks.CERAMIC_TILE_STAIRS.getStateWithProperties(state), 2);
            world.playSound(player, player.getX(), player.getY(), player.getZ(), SoundEvents.ITEM_DYE_USE, SoundCategory.BLOCKS, 1.0F, 0.8F + world.random.nextFloat());
            if (world.getBlockEntity(pos) instanceof CeramicTilesBlockEntity ceramicTilesBlockEntity) {
                ceramicTilesBlockEntity.color = oldColor;
                ceramicTilesBlockEntity.markDirty();
                return ActionResult.SUCCESS;
            }
        }
        if (itemStack.isOf(ModItems.ARTISAN_BRUSH) && itemStack.getSubNbt(ArtisanBrushItem.DISPLAY_KEY) != null) {
            int brushColor = itemStack.getSubNbt(ArtisanBrushItem.DISPLAY_KEY).getInt(ArtisanBrushItem.COLOR_KEY);
            world.removeBlock(pos, false);
            world.setBlockState(pos, this.getStateWithProperties(state));
            world.playSound(player, player.getX(), player.getY(), player.getZ(), SoundEvents.ITEM_DYE_USE, SoundCategory.BLOCKS, 1.0F, 0.8F + (world.random.nextFloat() / 3));
            if (world.getBlockEntity(pos) instanceof CeramicTilesBlockEntity ceramicTilesBlockEntity && ceramicTilesBlockEntity.color != brushColor) {
                ceramicTilesBlockEntity.color = brushColor;
                ceramicTilesBlockEntity.markDirty();
                return ActionResult.SUCCESS;

            }
        }
        return ActionResult.PASS;
    }
}
