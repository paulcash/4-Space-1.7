package mattparks.mods.MattparksCore;

import java.io.File;
import java.util.logging.Level;

import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.FMLLog;

public class ConfigManager
{
    public static boolean loaded;

    public static Configuration configuration;
    public static boolean capesEnabled;
    
    // MERCURY
    public static int dimensionIDMercury;
    public static int MercuryTierLevel;

    public static int idItemMercuryBasic;

    public static int idArmorIridiumHelmet;
    public static int idArmorIridiumChestplate;
    public static int idArmorIridiumLeggings;
    public static int idArmorIridiumBoots;
    
    public static int idToolIridiumSword;
    public static int idToolIridiumPickaxe;
    public static int idToolIridiumAxe;
    public static int idToolIridiumSpade;
    public static int idToolIridiumHoe;
    
    public static int idBlockMercuryGrass;
    public static int idBlockMercuryDirt;
    public static int idBlockMercuryStone;
    public static int idBlockMercuryBrick;
    public static int idBlockMercuryIridiumBlock;
    public static int idBlockMercuryMeteorBlock;
    public static int idBlockMercuryIridiumOre;
    public static int idBlockMercuryTinOre;
    public static int idBlockMercuryGoldOre;
    public static int idBlockMercuryCopperOre;
    public static int idBlockMercuryMeteorOre;
    
    public static int idBlockCaravanModule;
    public static int idBlockCaravanModulePart;

    public static boolean mercuryGenerateOtherMods;
    
    // VENUS
    public static int idItemVenusBasic;
    public static int idItemVenusSulfurBattery;
    public static int idItemVenusUraniumBattery;
    public static int idItemVenusRod;
    public static int idVurnBerry;

    public static int idArmorSulfurHelmet;
    public static int idArmorSulfurChestplate;
    public static int idArmorSulfurLeggings;
    public static int idArmorSulfurBoots;
    public static int idArmorGemHelmet;
    public static int idArmorGemChestplate;
    public static int idArmorGemLeggings;
    public static int idArmorGemBoots;
    public static int idJetpack;
    public static int idPJetpack;

    public static int idToolSulfurSword;
    public static int idToolSulfurPickaxe;
    public static int idToolSulfurAxe;
    public static int idToolSulfurSpade;
    public static int idToolSulfurHoe;
    public static int idToolGemSword;
    public static int idToolGemPickaxe;
    public static int idToolGemAxe;
    public static int idToolGemSpade;
    public static int idToolGemHoe;

    public static int idBlockEvolvedBlazeEgg;
    public static int idBlockVenusGrass;
    public static int idBlockVenusDirt;
    public static int idBlockVenusStone;
    public static int idBlockVenusBrick;
    public static int idBlockVenusRedGemBlock;
    public static int idBlockVenusSulfurBlock;
    public static int idBlockVenusSulfurOre;
    public static int idBlockVenusRedGemOre;
    public static int idBlockVenusIronOre;
    public static int idBlockVenusCoalOre;
    public static int idBlockVenusTinOre;
    public static int idBlockVenusCopperOre;
    public static int idBlockVenusCrystalOre;
    public static int idBlockVenusUraniumOre;
    public static int idBlockFossilizedPlantOre;
    public static int idBlockVurnBerryBush;
    public static int idBlockVenusUraniumBlock;
    public static int idBlockVenusCrystalBlock;
    
    public static int idEntityEvolvedBlaze;
    public static int idEntityVenusianVillager;

    public static int dimensionIDVenus;
    public static int VenusTierLevel;
    public static boolean venusGenerateOtherMods;
    public static boolean disableVenusVillageGen;
    
    
    public ConfigManager(File file)
    {
        if (!ConfigManager.loaded)
        {
            ConfigManager.configuration = new Configuration(file);
            this.setDefaultValues();
        }
    }

    private void setDefaultValues()
    {
        try
        {
            ConfigManager.configuration.load();
            ConfigManager.capesEnabled = ConfigManager.configuration.get("Capes", "Enable Mattparks Capes", true).getBoolean(true);

            //MERCURY
            ConfigManager.idArmorIridiumHelmet = ConfigManager.configuration.get(Configuration.CATEGORY_ITEM, "idArmorIridiumHelmet", 7841).getInt(7841);
            ConfigManager.idArmorIridiumChestplate = ConfigManager.configuration.get(Configuration.CATEGORY_ITEM, "idArmorIridiumChestplate", 7842).getInt(7842);
            ConfigManager.idArmorIridiumLeggings = ConfigManager.configuration.get(Configuration.CATEGORY_ITEM, "idArmorIridiumLeggings", 7843).getInt(7843);
            ConfigManager.idArmorIridiumBoots = ConfigManager.configuration.get(Configuration.CATEGORY_ITEM, "idArmorIridiumBoots", 7844).getInt(7844);
            ConfigManager.idToolIridiumSword = ConfigManager.configuration.get(Configuration.CATEGORY_ITEM, "idToolIridiumSword", 7845).getInt(7845);
            ConfigManager.idToolIridiumPickaxe = ConfigManager.configuration.get(Configuration.CATEGORY_ITEM, "idToolIridiumPickaxe", 7846).getInt(7846);
            ConfigManager.idToolIridiumSpade = ConfigManager.configuration.get(Configuration.CATEGORY_ITEM, "idToolIridiumSpade", 7847).getInt(7847);
            ConfigManager.idToolIridiumHoe = ConfigManager.configuration.get(Configuration.CATEGORY_ITEM, "idToolIridiumHoe", 7848).getInt(7848);
            ConfigManager.idToolIridiumAxe = ConfigManager.configuration.get(Configuration.CATEGORY_ITEM, "idToolIridiumAxe", 7849).getInt(7849);

            ConfigManager.idItemMercuryBasic = ConfigManager.configuration.get(Configuration.CATEGORY_ITEM, "idItemMercuryItemBasic", 7850).getInt(7850);
            
            ConfigManager.idBlockMercuryGrass = ConfigManager.configuration.get(Configuration.CATEGORY_BLOCK, "idBlockMercuryGrass", 493).getInt(493);
            ConfigManager.idBlockMercuryDirt = ConfigManager.configuration.get(Configuration.CATEGORY_BLOCK, "idBlockMercuryDirt", 494).getInt(494);
            ConfigManager.idBlockMercuryStone = ConfigManager.configuration.get(Configuration.CATEGORY_BLOCK, "idBlockMercuryStone", 495).getInt(495);
            ConfigManager.idBlockMercuryBrick = ConfigManager.configuration.get(Configuration.CATEGORY_BLOCK, "idBlockMercuryVrick", 496).getInt(496);
            ConfigManager.idBlockMercuryIridiumBlock = ConfigManager.configuration.get(Configuration.CATEGORY_BLOCK, "idBlockMercuryIridiumBlock", 497).getInt(497);
            ConfigManager.idBlockMercuryGoldOre = ConfigManager.configuration.get(Configuration.CATEGORY_BLOCK, "idBlockMercuryGoldOre", 498).getInt(498);
            ConfigManager.idBlockMercuryMeteorOre = ConfigManager.configuration.get(Configuration.CATEGORY_BLOCK, "idBlockMercuryMeteorOre", 499).getInt(499);
            ConfigManager.idBlockMercuryMeteorBlock = ConfigManager.configuration.get(Configuration.CATEGORY_BLOCK, "idBlockMercuryMeteorBlock", 500).getInt(500);
            ConfigManager.idBlockMercuryIridiumOre = ConfigManager.configuration.get(Configuration.CATEGORY_BLOCK, "idBlockMercuryIridiumOre", 501).getInt(501);
            ConfigManager.idBlockMercuryTinOre = ConfigManager.configuration.get(Configuration.CATEGORY_BLOCK, "idBlockMercuryTinOre", 502).getInt(502);
            ConfigManager.idBlockMercuryCopperOre = ConfigManager.configuration.get(Configuration.CATEGORY_BLOCK, "idBlockMercuryCopperOre", 503).getInt(503);
            ConfigManager.idBlockCaravanModule = ConfigManager.configuration.get(Configuration.CATEGORY_BLOCK, "idBlockCaravanModule", 504).getInt(504);
            ConfigManager.idBlockCaravanModulePart = ConfigManager.configuration.get(Configuration.CATEGORY_BLOCK, "idBlockCaravanModulePart", 505).getInt(505);
            
            ConfigManager.dimensionIDMercury = ConfigManager.configuration.get(Configuration.CATEGORY_GENERAL, "Mercury Dimension ID", -40).getInt(-40);
            ConfigManager.MercuryTierLevel = ConfigManager.configuration.get(Configuration.CATEGORY_GENERAL, "Mercury Tier Level", 2).getInt(2);
            ConfigManager.mercuryGenerateOtherMods = ConfigManager.configuration.get(Configuration.CATEGORY_GENERAL, "Generate other mod's features on Mercury", false).getBoolean(false);        
        
            //VENUS
            ConfigManager.idItemVenusUraniumBattery = ConfigManager.configuration.get(Configuration.CATEGORY_ITEM, "idItemVenusUraniumBattery", 7860).getInt(7860);
            
            ConfigManager.idVurnBerry = ConfigManager.configuration.get(Configuration.CATEGORY_ITEM, "idVurnBerry", 7870).getInt(7870);
            ConfigManager.idItemVenusSulfurBattery = ConfigManager.configuration.get(Configuration.CATEGORY_ITEM, "idItemVenusSulfurBattery", 7871).getInt(7871);
            ConfigManager.idItemVenusRod = ConfigManager.configuration.get(Configuration.CATEGORY_ITEM, "idItemVenusRod", 7872).getInt(7872);
            ConfigManager.idArmorGemHelmet = ConfigManager.configuration.get(Configuration.CATEGORY_ITEM, "idArmorGemHelmet", 7873).getInt(7873);
            ConfigManager.idArmorGemChestplate = ConfigManager.configuration.get(Configuration.CATEGORY_ITEM, "idArmorGemChestplate", 7874).getInt(7874);
            ConfigManager.idArmorGemLeggings = ConfigManager.configuration.get(Configuration.CATEGORY_ITEM, "idArmorGemLeggings", 7875).getInt(7875);
            ConfigManager.idArmorGemBoots = ConfigManager.configuration.get(Configuration.CATEGORY_ITEM, "idArmorGemBoots", 7876).getInt(7876);
            ConfigManager.idArmorSulfurHelmet = ConfigManager.configuration.get(Configuration.CATEGORY_ITEM, "idArmorSulfurHelmet", 7877).getInt(7877);
            ConfigManager.idArmorSulfurChestplate = ConfigManager.configuration.get(Configuration.CATEGORY_ITEM, "idArmorSulfurChestplate", 7878).getInt(7878);
            ConfigManager.idArmorSulfurLeggings = ConfigManager.configuration.get(Configuration.CATEGORY_ITEM, "idArmorSulfurLeggings", 7879).getInt(7879);
            ConfigManager.idArmorSulfurBoots = ConfigManager.configuration.get(Configuration.CATEGORY_ITEM, "idArmorSulfurBoots", 7880).getInt(7880);
            ConfigManager.idJetpack = ConfigManager.configuration.get(Configuration.CATEGORY_ITEM, "idArmorJetpack", 7881).getInt(7881);       
            ConfigManager.idPJetpack = ConfigManager.configuration.get(Configuration.CATEGORY_ITEM, "idArmorPJetpack", 7882).getInt(7882);
            ConfigManager.idToolGemSword = ConfigManager.configuration.get(Configuration.CATEGORY_ITEM, "idToolGemSword", 7883).getInt(7883);
            ConfigManager.idToolGemPickaxe = ConfigManager.configuration.get(Configuration.CATEGORY_ITEM, "idToolGemPickaxe", 7884).getInt(7884);
            ConfigManager.idToolGemSpade = ConfigManager.configuration.get(Configuration.CATEGORY_ITEM, "idToolGemSpade", 7885).getInt(7885);
            ConfigManager.idToolGemHoe = ConfigManager.configuration.get(Configuration.CATEGORY_ITEM, "idToolGemHoe", 7886).getInt(7886);
            ConfigManager.idToolGemAxe = ConfigManager.configuration.get(Configuration.CATEGORY_ITEM, "idToolGemAxe", 7887).getInt(7887);
            ConfigManager.idToolSulfurSword = ConfigManager.configuration.get(Configuration.CATEGORY_ITEM, "idToolSulfurSword", 7888).getInt(7888);
            ConfigManager.idToolSulfurPickaxe = ConfigManager.configuration.get(Configuration.CATEGORY_ITEM, "idToolSulfurPickaxe", 7889).getInt(7889);
            ConfigManager.idToolSulfurSpade = ConfigManager.configuration.get(Configuration.CATEGORY_ITEM, "idToolSulfurSpade", 7890).getInt(7890);
            ConfigManager.idToolSulfurHoe = ConfigManager.configuration.get(Configuration.CATEGORY_ITEM, "idToolSulfurHoe", 7891).getInt(7891);
            ConfigManager.idToolSulfurAxe = ConfigManager.configuration.get(Configuration.CATEGORY_ITEM, "idToolSulfurAxe", 7892).getInt(7892);

            ConfigManager.idItemVenusBasic = ConfigManager.configuration.get(Configuration.CATEGORY_ITEM, "idItemVenusItemBasic", 7893).getInt(7893);
            
            ConfigManager.idBlockVenusGrass = ConfigManager.configuration.get(Configuration.CATEGORY_BLOCK, "idBlockVenusGrass", 760).getInt(760);
            ConfigManager.idBlockVenusDirt = ConfigManager.configuration.get(Configuration.CATEGORY_BLOCK, "idBlockVenusDirt", 761).getInt(761);
            ConfigManager.idBlockVenusStone = ConfigManager.configuration.get(Configuration.CATEGORY_BLOCK, "idBlockVenusStone", 762).getInt(762);
            ConfigManager.idBlockVenusBrick = ConfigManager.configuration.get(Configuration.CATEGORY_BLOCK, "idBlockVenusBrick", 763).getInt(763);
            ConfigManager.idBlockEvolvedBlazeEgg = ConfigManager.configuration.get(Configuration.CATEGORY_BLOCK, "idBlockEvolvedBlazeEgg", 764).getInt(764);
            ConfigManager.idBlockVenusRedGemBlock = ConfigManager.configuration.get(Configuration.CATEGORY_BLOCK, "idBlockVenusRedGemBlock", 765).getInt(765);
            ConfigManager.idBlockVenusSulfurBlock = ConfigManager.configuration.get(Configuration.CATEGORY_BLOCK, "idBlockVenusSulfurBlock", 766).getInt(766);
            ConfigManager.idBlockVenusSulfurOre = ConfigManager.configuration.get(Configuration.CATEGORY_BLOCK, "idBlockVenusSulfurOre", 767).getInt(767);
            ConfigManager.idBlockVenusRedGemOre = ConfigManager.configuration.get(Configuration.CATEGORY_BLOCK, "idBlockVenusRedGemOre", 768).getInt(768);
            ConfigManager.idBlockVenusIronOre = ConfigManager.configuration.get(Configuration.CATEGORY_BLOCK, "idBlockVenusIronOre", 769).getInt(769);
            ConfigManager.idBlockVenusCoalOre = ConfigManager.configuration.get(Configuration.CATEGORY_BLOCK, "idBlockVenusCoalOre", 770).getInt(770);
            ConfigManager.idBlockVenusTinOre = ConfigManager.configuration.get(Configuration.CATEGORY_BLOCK, "idBlockVenusTinOre", 771).getInt(771);
            ConfigManager.idBlockVenusCopperOre = ConfigManager.configuration.get(Configuration.CATEGORY_BLOCK, "idBlockVenusCopperOre", 772).getInt(772);
            ConfigManager.idBlockVenusCrystalOre = ConfigManager.configuration.get(Configuration.CATEGORY_BLOCK, "idBlockVenusCrystalOre", 773).getInt(773);
            ConfigManager.idBlockVenusUraniumOre = ConfigManager.configuration.get(Configuration.CATEGORY_BLOCK, "idBlockVenusUraniumOre", 774).getInt(774);
            ConfigManager.idBlockFossilizedPlantOre = ConfigManager.configuration.get(Configuration.CATEGORY_BLOCK, "idBlockVenusFossilizedPlantOre", 775).getInt(775);
            ConfigManager.idBlockVurnBerryBush = ConfigManager.configuration.get(Configuration.CATEGORY_BLOCK, "idBlockVurnBerryBush", 776).getInt(776);
            ConfigManager.idBlockVenusUraniumBlock = ConfigManager.configuration.get(Configuration.CATEGORY_BLOCK, "idBlockVenusUraniumBlock", 777).getInt(777);
            ConfigManager.idBlockVenusCrystalBlock = ConfigManager.configuration.get(Configuration.CATEGORY_BLOCK, "idBlockVenusCrystalBlock", 778).getInt(778);
            
            ConfigManager.idEntityEvolvedBlaze = ConfigManager.configuration.get("Entities", "idEntityEvolvedBlaze", 193).getInt(193);
            ConfigManager.idEntityVenusianVillager = ConfigManager.configuration.get("Entities", "idEntityVenusianVillager", 194).getInt(194);

            ConfigManager.dimensionIDVenus = ConfigManager.configuration.get(Configuration.CATEGORY_GENERAL, "Venus Dimension ID", -41).getInt(-41);
	        ConfigManager.VenusTierLevel = ConfigManager.configuration.get(Configuration.CATEGORY_GENERAL, "Venus Tier Level", 2).getInt(2);
            ConfigManager.venusGenerateOtherMods = ConfigManager.configuration.get(Configuration.CATEGORY_GENERAL, "Generate other mod's features on Venus", false).getBoolean(false);        
            ConfigManager.disableVenusVillageGen = ConfigManager.configuration.get(Configuration.CATEGORY_GENERAL, "Disable Venus Village Gen", false).getBoolean(false);  
        }
        catch (final Exception e)
        {
            FMLLog.log(Level.SEVERE, e, "Mattparks Config has a problem loading it's configuration");
        }
        finally
        {
            ConfigManager.configuration.save();
            ConfigManager.loaded = true;
        }
    }
}