package com.sRoxas.sroxasmod.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

import java.util.List;
import java.util.Random;

/**
 * @author bluemonster122 <boo122333@gmail.com>
 */
public class BlockOre extends BlockMod
{
    public Ore type;

    public BlockOre(Ore type)
    {
        super(Material.rock);
        this.type = type;
        setHarvestLevel("pickaxe", type.getHarvestLevel());
        setHardness(type.harvestLevel * 2.5f);
        setResistance(5f);
        setBlockName(type.name());
    }

    @SideOnly(Side.CLIENT)
    public void getSubBlocks(int unknown, CreativeTabs tab, List subItems) {
        for (int i = 0; i < Ore.values().length; i++) {
            subItems.add(new ItemStack(this, 1, i));
        }
    }

    @Override
    public int quantityDropped(Random rand)
    {
        if (this.type.isDropsForeignObject())
            return 1 + rand.nextInt(2);
        else return 1;
    }

    @Override
    public int damageDropped(int metadata)
    {
        return metadata;
    }

    public enum Ore{
        Copper(1, 1, false),
        Tin(1, 1, false),
        RedGem(2, -1, true);


        private final int harvestLevel;
        private final int amountDropped;
        private final boolean dropsForeignObject;

        Ore(int harvestLevel, int amountDropped, boolean dropsForeignObject)
        {

            this.harvestLevel = harvestLevel;
            this.amountDropped = amountDropped;
            this.dropsForeignObject = dropsForeignObject;
        }

        public int getHarvestLevel()
        {
            return harvestLevel;
        }

        public int getAmountDropped()
        {
            return amountDropped;
        }

        public boolean isDropsForeignObject()
        {
            return dropsForeignObject;
        }
    }
}
