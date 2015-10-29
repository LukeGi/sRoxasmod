package com.sRoxas.sroxasmod.blocks;

/**
 * @author bluemonster122 <boo122333@gmail.com>
 */
public class BlockRegistry
{
    public static BlockMod[] materials = new BlockMod[BlockPlain.Materials.values().length];

    public static void init(){
        for (int i = 0; i < BlockPlain.Materials.values().length; i++)
            materials[i] = new BlockPlain(BlockPlain.Materials.values()[i]);
    }
}
