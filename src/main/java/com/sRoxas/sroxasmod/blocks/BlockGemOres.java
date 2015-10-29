package com.sRoxas.sroxasmod.blocks;

import com.sRoxas.sroxasmod.creativetab.sRoxasmodTabs;
import com.sRoxas.sroxasmod.item.ModItems;
import com.sRoxas.sroxasmod.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockGemOres extends Block
{
    private String name;
    private Item dropped;

    protected BlockGemOres(String type, Item dropped)
    {
        super(Material.rock);
        this.setCreativeTab(sRoxasmodTabs.sRoxasmodBlockTab);
        this.setStepSound(soundTypeStone);
        this.setHardness(2.5F);
        this.setResistance(10.0F);
        this.textureName = Reference.MOD_ID + ":" + type;
        this.setHarvestLevel("pickaxe", 2);
        this.name = type;
        this.dropped = dropped;
        this.setBlockName(type);
    }

    public int quantityDropped(Random random)
    {
        if (this.name.equals("purpleGemOre") || this.name.equals("redGemOre") || this.name.equals("blueGemOre") || this.name.equals("greenGemOre") || this.name.equals("pinkGemOre") || this.name.equals("orageGemOre"))
        {
            return random.nextInt(3 - 1 + 1) + 1;
        } else
        {
            return 0;
        }
    }

    public Item getItemDropped(int i, Random random, int j)
    {
        return this.dropped;
    }
}
