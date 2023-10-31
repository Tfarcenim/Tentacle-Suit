package tfar.tentaclesuit;

import net.minecraftforge.fml.common.Mod;

@Mod(TentacleSuit.MOD_ID)
public class TentacleSuitForge {
    
    public TentacleSuitForge() {


        // This method is invoked by the Forge mod loader when it is ready
        // to load your mod. You can access Forge and Common code in this
        // project.
    
        // Use Forge to bootstrap the Common mod.
        TentacleSuit.init();
        
    }
}