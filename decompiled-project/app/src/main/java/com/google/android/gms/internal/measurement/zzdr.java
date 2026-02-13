package com.google.android.gms.internal.measurement;

import P5.b;
import Q5.d;
import Y5.D0;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.G;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzdr extends zzeq {
    final /* synthetic */ Context zza;
    final /* synthetic */ Bundle zzb;
    final /* synthetic */ zzfb zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdr(zzfb zzfbVar, Context context, Bundle bundle) {
        super(zzfbVar, true);
        this.zza = context;
        this.zzb = bundle;
        Objects.requireNonNull(zzfbVar);
        this.zzc = zzfbVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeq
    public final void zza() {
        try {
            Context context = this.zza;
            G.g(context);
            String a9 = D0.a(context);
            Resources resources = context.getResources();
            if (TextUtils.isEmpty(a9)) {
                a9 = D0.a(context);
            }
            int identifier = resources.getIdentifier("google_analytics_force_disable_updates", "bool", a9);
            Boolean bool = null;
            if (identifier != 0) {
                try {
                    bool = Boolean.valueOf(resources.getBoolean(identifier));
                } catch (Resources.NotFoundException unused) {
                }
            }
            zzfb zzfbVar = this.zzc;
            zzfbVar.zzR(zzfbVar.zzc(context, bool == null || !bool.booleanValue()));
            if (zzfbVar.zzQ() == null) {
                Log.w(zzfbVar.zzO(), "Failed to connect to measurement client.");
                return;
            }
            int a10 = d.a(context, ModuleDescriptor.MODULE_ID);
            zzdd zzddVar = new zzdd(130000L, Math.max(a10, r0), Boolean.TRUE.equals(bool) || d.d(context, ModuleDescriptor.MODULE_ID, false) < a10, this.zzb, D0.a(context));
            zzcr zzQ = zzfbVar.zzQ();
            G.g(zzQ);
            zzQ.initialize(new b(context), zzddVar, this.zzh);
        } catch (Exception e2) {
            this.zzc.zzN(e2, true, false);
        }
    }
}
