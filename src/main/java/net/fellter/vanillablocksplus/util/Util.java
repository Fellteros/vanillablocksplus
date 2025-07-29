package net.fellter.vanillablocksplus.util;

import java.security.SecureRandom;
import java.util.List;
import java.util.Random;

import net.minecraft.particle.ParticleEffect;
import net.minecraft.particle.ParticleType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;

public final class Util {
	public static void addParticleClient(List<Box> boundingBoxes, World world, BlockPos pos, ParticleType<?> particleType, double velocityX, double velocityY, double velocityZ, double offset) {
		Random random = new SecureRandom();

		boundingBoxes.forEach(box -> {
			Direction direction = Direction.random(world.random);
			double x = pos.getX();
			double y = pos.getY();
			double z = pos.getZ();

			switch (direction) {
				case UP -> {
					x += box.minX + random.nextDouble(box.maxX - box.minX);
					y += box.maxY + offset;
					z += box.minZ + random.nextDouble(box.maxZ - box.minZ);
				}
				case DOWN -> {
					x += (box.minX + random.nextDouble(box.maxX - box.minX));
					y += box.minY - offset;
					z += (box.minZ + random.nextDouble(box.maxZ - box.minZ));
				}
				case EAST -> {
					x += box.maxX + offset;
					y += box.minY + random.nextDouble(box.maxY - box.minY);
					z += box.minX + random.nextDouble(box.maxZ - box.minZ);
				}
				case WEST -> {
					x += box.minX - offset;
					y += box.minY + random.nextDouble(box.maxY - box.minY);
					z += box.minX + random.nextDouble(box.maxZ - box.minZ);
				}
				case NORTH -> {
					x += box.minX + random.nextDouble(box.maxX - box.minX);
					y += box.minY + random.nextDouble(box.maxY - box.minY);
					z += box.minZ - offset;
				}
				case SOUTH -> {
					x += box.minX + random.nextDouble(box.maxX - box.minX);
					y += box.minY + random.nextDouble(box.maxY - box.minY);
					z += box.maxZ + offset;
				}
			}

			world.addParticleClient((ParticleEffect) particleType, x, y, z, velocityX, velocityY, velocityZ);
		});
	}

	public static void addParticleClient(List<Box> boundingBoxes, World world, BlockPos pos, ParticleType<?> particleType, double velocityX, double velocityY, double velocityZ) {
		addParticleClient(boundingBoxes, world, pos, particleType, velocityX, velocityY, velocityZ, 0);
	}
}
