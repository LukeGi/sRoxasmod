package com.sRoxas.sroxasmod.blocks;

import com.sRoxas.sroxasmod.creativetab.sRoxasmodTabs;
import com.sRoxas.sroxasmod.item.ModItems;
import com.sRoxas.sroxasmod.item.blocks.ItemBlockLamps;
import com.sRoxas.sroxasmod.reference.Names;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.material.Material;

import static com.sRoxas.sroxasmod.blocks.BlockDecsRoxasmod.*;
import static com.sRoxas.sroxasmod.blocks.BlockDecsRoxasmod.BlockLamps;

public class BlockssRoxasmod
{
    public static void init()
    {
        purpleGemOre = new BlockGemOres("purpleGemOre", ModItems.purpleGem);
        redGemOre = new BlockGemOres("redGemOre", ModItems.redGem);
        blueGemOre = new BlockGemOres("blueGemOre", ModItems.blueGem);
        greenGemOre = new BlockGemOres("greenGemOre", ModItems.greenGem);
        pinkGemOre = new BlockGemOres("pinkGemOre", ModItems.pinkGem);
        orangeGemOre = new BlockGemOres("orangeGemOre", ModItems.orangeGem);

        chromiumOre = new BlockOres("chromiumOre");
        copperOre = new BlockOres("copperOre");
        germaniumOre = new BlockOres("germaniumOre");
        nickelOre = new BlockOres("nickelOre");
        palladiumOre = new BlockOres("palladiumOre");
        platinumOre = new BlockOres("platinumOre");
        siliconOre = new BlockOres("siliconOre");
        tinOre = new BlockOres("tinOre");
        leadOre = new BlockOres("leadOre");

        BambooPlanks = new BlockMod(Material.wood).setHardness(1.5f).setResistance(3f).setBlockName(Names.Blocks.BAMBOO_PLANKS);
        BlockOfReinforcedIron = new BlockMod(Material.iron).setHardness(3f).setResistance(10f);
        BlockOfReinforcedIron.setHarvestLevel("pickaxe", 2);
        BlockOfReinforcedIron.setBlockName(Names.Blocks.BLOCK_OF_REINFORCED_IRON);
        BlockOfReinforcedDiamondEncrustedIron = new BlockMod(Material.rock).setBlockName(Names.Blocks.BLOCK_OF_DIAMOND_ENCRUSTED_IRON);// Names.Blocks.BLOCK_OF_DIAMOND_ENCRUSTED_IRON, 3.5f, 1000000f, "pickaxe", 3);

        blockWoodenTable = new BlockWoodenTable(Material.wood).setBlockName("WoodenTable");

        doubleFurnaceIdle = new BlockDoubleFurnace(false, "doubleFurnaceIdle");
        doubleFurnaceActive = new BlockDoubleFurnace(true, "doubleFurnaceActive");

        BlockLamps = new BlockLamps().setCreativeTab(sRoxasmodTabs.sRoxasmodBlockTab).setLightLevel(1f);
    }
}
