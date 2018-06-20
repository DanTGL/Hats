package hat.armor;

import hat.render.ModelFedora;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ArmorHat extends ItemArmor {
	
	public static ArmorMaterial material = EnumHelper.addArmorMaterial("fedora", "hats:fedora", 10, new int[] {10, 10, 10, 10}, 10, SoundEvents.BLOCK_ANVIL_BREAK, 10);
	
	public ArmorHat() {
		super(material, 1, EntityEquipmentSlot.HEAD);
		this.setRegistryName("hats:fedora");
		this.setUnlocalizedName("fedora");
		this.setCreativeTab(CreativeTabs.COMBAT);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public ModelBiped getArmorModel(EntityLivingBase entity, ItemStack itemstack, EntityEquipmentSlot slot, ModelBiped defaultModel) {
		ModelFedora model = new ModelFedora();
		
		//model.setRotateAngle(new ModelRenderer(model), entity.rotationYaw, entity.rotationYaw, 0);
		return model;
	}
	
}
