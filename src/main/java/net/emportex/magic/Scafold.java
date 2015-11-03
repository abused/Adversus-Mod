package net.emportex.magic;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Scafold extends Block {

	protected Scafold(Material material) {
		super(material);
		this.setHardness(0.0F);
	}

	@Override
	public boolean isOpaqueCube()
	{
	return false;
	}
}
