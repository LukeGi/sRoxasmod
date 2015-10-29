package com.sRoxas.sroxasmod.blocks;

import com.sRoxas.sroxasmod.creativetab.sRoxasmodTabs;
import com.sRoxas.sroxasmod.utility.IconHelper;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

public class BlockMod extends Block
{
    public BlockMod(Material material)
    {
        super(material);
        setCreativeTab(sRoxasmodTabs.sRoxasmodBlockTab);
    }

    @Override
    public Block setBlockName(String bn)
    {
        GameRegistry.registerBlock(this, bn);
        return super.setBlockName(bn);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister ir)
    {
        blockIcon = IconHelper.forBlock(ir, this);
    }
}
