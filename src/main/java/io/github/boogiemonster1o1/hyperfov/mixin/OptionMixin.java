package io.github.boogiemonster1o1.hyperfov.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.options.GameOptions;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(EnvType.CLIENT)
@Mixin(GameOptions.Option.class)
public class OptionMixin {
    @Shadow private float max;

    @Inject(method = "<init>(Ljava/lang/String;ZZFFF)V", at = @At(value="TAIL"))
    private void increaseMaxFov(String enumName, int ordinal, String name, boolean bl, boolean bl2, float min, float max, float increment, CallbackInfo ci){
        if(this.equals(GameOptions.Option.FIELD_OF_VIEW)){
            this.max += 150;
        }
    }
}
