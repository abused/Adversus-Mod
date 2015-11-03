package net.emportex.magic;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Lamp2 extends Block {

	protected Lamp2(Material material) {
		super(material);
		this.setHardness(1.0F);
		this.setLightLevel(8.0F);
	}

}
