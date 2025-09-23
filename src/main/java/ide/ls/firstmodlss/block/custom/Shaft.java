package ide.ls.firstmodlss.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class Shaft extends Power{

    public static final EnumProperty<Direction.Axis> AXIS = BlockStateProperties.AXIS;
    protected static final VoxelShape DIR_X = Block.box(0.0, 6.0, 6.0, 16.0, 10.0, 10.0);
    protected static final VoxelShape DIR_Y = Block.box(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);
    protected static final VoxelShape DIR_Z = Block.box(6.0, 6.0, 0.0, 10.0, 10.0, 16.0);

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(AXIS);
    }
    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        Direction clickedFace = context.getClickedFace();
        return this.defaultBlockState().setValue(AXIS, clickedFace.getAxis());
    }

    @Override
    protected VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        Direction.Axis direction = state.getValue(AXIS);


        return switch (direction) {
            case X -> DIR_X;
            case Y -> DIR_Y;
            case Z -> DIR_Z;

        };
    }

    public Shaft(Properties properties) {
        super(properties);
        this.registerDefaultState(this.stateDefinition.any().setValue(AXIS, Direction.Axis.Y ));
    }
}
