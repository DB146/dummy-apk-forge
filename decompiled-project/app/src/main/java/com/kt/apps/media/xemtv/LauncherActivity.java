package com.kt.apps.media.xemtv;

import W1.G;
import android.content.Intent;
import android.graphics.RenderEffect;
import android.graphics.Shader;
import android.os.Build;
import android.os.Bundle;
import com.kt.apps.media.xemtv.ui.main.MainActivity;
import com.kt.apps.media.xemtv.ui_mobile.MobileMainActivity;

/* loaded from: classes2.dex */
public final class LauncherActivity extends G {
    @Override // W1.G, c.AbstractActivityC0867k, k1.h, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getPackageManager().hasSystemFeature("android.hardware.type.television") || getPackageManager().hasSystemFeature("android.software.leanback")) {
            startActivity(new Intent(this, (Class<?>) MainActivity.class).addFlags(268435456));
        } else {
            startActivity(new Intent(this, (Class<?>) MobileMainActivity.class).addFlags(268435456));
        }
        if (Build.VERSION.SDK_INT >= 31) {
            RenderEffect.createBlurEffect(5.0f, 5.0f, Shader.TileMode.CLAMP);
        }
        finish();
    }
}
