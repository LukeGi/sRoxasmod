package com.sRoxas.sroxasmod.blocks;

import net.minecraft.block.material.Material;

/**
 * @author bluemonster122 <boo122333@gmail.com>
 */
public class BlockPlain extends BlockMod
{
    public BlockPlain(Materials material)
    {
        super(material.getMaterial());
        this.setHardness(material.getHardness());
        this.setResistance(material.getResistance());
        this.setHarvestLevel(material.getTool(),material.getLevel());
        this.setBlockName(material.name());
    }

    public enum Materials{
        bambooPlanks(Material.wood, 1.5f, 3f, "axe", 0),
        reinforcedIron(Material.iron, 3, 10, "pickaxe", 2),
        diamondReinforcedIron(Material.iron, 3.5f, 1000000, "pickaxe", 3);

        private final Material material;
        private final float hardness;
        private final float resistance;
        private final String tool;
        private final int level;

        Materials(Material material, float hardness, float resistance, String tool, int level)
        {

            this.material = material;
            this.hardness = hardness;
            this.resistance = resistance;
            this.tool = tool;
            this.level = level;
        }

        public Material getMaterial()
        {
            return material;
        }

        public float getHardness()
        {
            return hardness;
        }

        public float getResistance()
        {
            return resistance;
        }

        public String getTool()
        {
            return tool;
        }

        public int getLevel()
        {
            return level;
        }
    }
}
