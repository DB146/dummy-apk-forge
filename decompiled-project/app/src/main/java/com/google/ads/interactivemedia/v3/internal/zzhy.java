package com.google.ads.interactivemedia.v3.internal;

import P3.p;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.ads.interactivemedia.v3.api.AdsRenderingSettings;
import l1.AbstractC1449a;
import o7.o;

/* loaded from: classes.dex */
public final class zzhy {
    private final Context zza;
    private AdsRenderingSettings zzb;

    public zzhy(Context context, AdsRenderingSettings adsRenderingSettings) {
        this.zza = context;
        this.zzb = adsRenderingSettings;
    }

    public final void zza(String str) {
        if (this.zzb.getEnableCustomTabs()) {
            Context context = this.zza;
            o b2 = new p(7).b();
            Uri parse = Uri.parse(str);
            Intent intent = (Intent) b2.f22101b;
            intent.setData(parse);
            AbstractC1449a.startActivity(context, intent, null);
            return;
        }
        Context context2 = this.zza;
        if (str == null || str.length() <= 0) {
            return;
        }
        Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str));
        if (!(context2 instanceof Activity)) {
            intent2.setFlags(268435456);
        }
        context2.startActivity(intent2);
    }

    public final void zzb(AdsRenderingSettings adsRenderingSettings) {
        this.zzb = adsRenderingSettings;
    }
}
