package net.emportex.magic;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockSore extends Block {

	protected BlockSore(Material material) {
		super(material);
		this.setHardness(3F);
		this.setLightLevel(3.0F);
	}

}