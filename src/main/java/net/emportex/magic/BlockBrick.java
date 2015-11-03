package net.emportex.magic;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockBrick extends Block {

	protected BlockBrick(Material material) {
		super(material);
		this.setHardness(2.0F);
		this.setLightLevel(2.0F);
	}

}
