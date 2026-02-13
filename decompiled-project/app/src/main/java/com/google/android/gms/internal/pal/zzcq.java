package com.google.android.gms.internal.pal;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes.dex */
public interface zzcq {
    String zza(Context context, String str, View view, Activity activity);

    String zzb(Context context);

    @Deprecated
    String zzc(Context context, byte[] bArr);

    String zzd(Context context, View view, Activity activity);

    void zze(MotionEvent motionEvent);

    void zzf(View view);
}
