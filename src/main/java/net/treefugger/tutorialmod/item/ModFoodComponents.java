package net.treefugger.tutorialmod.item;

import net.minecraft.component.type.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent CANNED_FOOD = new FoodComponent.Builder().snack().nutrition(3).saturationModifier(0.25f).build();
}
