package net.emportex.magic;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Bedrockore extends Block {

	protected Bedrockore(Material material) {
		super(material);
		this.setLightLevel(3.0F);
		this.setHardness(6.0F);
	}

}
