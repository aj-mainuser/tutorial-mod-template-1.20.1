package aj.tutorial_mod.item;

import aj.tutorial_mod.TutorialMod;
import aj.tutorial_mod.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;


public class ModItemGroups {

    public static final ItemGroup RUBY_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(TutorialMod.MOD_ID, "ruby"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ruby"))
                    .icon(() -> new ItemStack(ModItems.RUBY)).entries((displayContext, entries) -> {
                        entries.add(ModItems.RUBY);
                        entries.add(ModItems.RAW_RUBY);

                        entries.add(ModBlocks.RUBY_BLOCK);
                        entries.add(ModBlocks.RAW_RUBY_BLOCK);

                        entries.add(ModItems.OPAL);
                        entries.add(ModItems.RAW_OPAL);

                        entries.add(ModBlocks.OPAL_BLOCK);
                        entries.add(ModBlocks.RAW_OPAL_BLOCK);



            }).build());


    public static void registerItemGroups() {
        TutorialMod.LOGGER.info("Resistering Item Groups for "+ TutorialMod.MOD_ID);
    }
}
