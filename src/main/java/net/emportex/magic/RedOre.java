package net.emportex.magic;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class RedOre extends Block {

	protected RedOre(Material material) {
		super(material);
		this.setHardness(3.0F);
		this.setLightLevel(0.3F);
	}

}