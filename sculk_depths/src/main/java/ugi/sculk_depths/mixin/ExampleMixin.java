package ugi.sculk_depths.mixin;

import com.llamalad7.mixinextras.sugar.Share;
import com.llamalad7.mixinextras.sugar.ref.LocalRef;
import finalforeach.cosmicreach.gamestates.MainMenu;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import static ugi.sculk_depths.SculkDepths.LOGGER;

@Mixin(MainMenu.class)
public abstract class ExampleMixin {
    @Inject(method = "create", at = @At("HEAD"))
    private void injectCreateAtHead(CallbackInfo ci, @Share("someSharedLocal") LocalRef<String> sharedLocalRef) {
        sharedLocalRef.set("Hello from Mixin Extras!");
    }

    @Inject(method = "create", at = @At(value = "INVOKE", target = "Lcom/badlogic/gdx/utils/Array;add(Ljava/lang/Object;)V", ordinal = 0))
    private void injectCreateAtInvoke(CallbackInfo ci, @Share("someSharedLocal") LocalRef<String> sharedLocalRef) {
        LOGGER.info(sharedLocalRef.get());
    }

    @Inject(method = "create", at = @At("HEAD"))
    private void injected(CallbackInfo ci) {
        LOGGER.info("Created!");
    }
}
