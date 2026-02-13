package com.google.android.gms.internal.pal;

import P5.b;
import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes.dex */
public class zzft {
    protected zzfr zza;

    @Deprecated
    public final String zza(Context context, String str) {
        return this.zza.zze(new b(context), "");
    }

    @Deprecated
    public final String zzb(Context context, byte[] bArr) {
        return this.zza.zzg(new b(context), null);
    }

    public final String zzc(Context context, View view, Activity activity) {
        return this.zza.zzk(new b(context), new b(null), new b(activity));
    }

    public final void zzd(MotionEvent motionEvent) {
        this.zza.zzl(new b(motionEvent));
    }
}
