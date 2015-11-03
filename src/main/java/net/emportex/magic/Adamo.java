package net.emportex.magic;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Adamo extends Block {

	protected Adamo(Material material) {
		super(material);
		this.setLightLevel(0.5F);
		this.setHardness(1.0F);
	}

}
