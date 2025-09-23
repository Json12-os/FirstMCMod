package ide.ls.firstmodlss.block.custom;

import ide.ls.firstmodlss.block.ModBlockStateProperties;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;

public class Power extends Block {
    public static final BooleanProperty POWERED_MECH = ModBlockStateProperties.POWERED_MECH;

    public Power(Properties properties) {
        super(properties);
    }

    @Override
    public void animateTick(BlockState state, Level level, BlockPos pos, RandomSource random) {
        super.animateTick(state, level, pos, random);

        // Chance to spawn a particle each tick
        if (random.nextFloat() < 0.2F) { // 20% chance
            double x = pos.getX() + 0.5 + (random.nextDouble() - 0.5);
            double y = pos.getY() + 0.0; // slightly above block
            double z = pos.getZ() + 0.5 + (random.nextDouble() - 0.5);

            level.addParticle( ParticleTypes.ASH, x, y, z, random.nextFloat(), random.nextFloat(), random.nextFloat());
        }
        if (random.nextFloat() < 0.05F) { // 20% chance
            double x = pos.getX() + 0.5 + (random.nextDouble() - 0.5);
            double y = pos.getY() + 0.0; // slightly above block
            double z = pos.getZ() + 0.5 + (random.nextDouble() - 0.5);

            level.addParticle( ParticleTypes.CLOUD, x, y, z, random.nextFloat(), random.nextFloat(), random.nextFloat());
        }
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(POWERED_MECH);
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return this.defaultBlockState().setValue(POWERED_MECH, Boolean.valueOf(false));
    }
}
