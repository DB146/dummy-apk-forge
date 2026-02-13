package com.google.ads.interactivemedia.v3.internal;

import P5.b;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzmu extends zzmx {
    private final zzjl zza;
    private final zzjs zzb;

    public zzmu(Context context, Executor executor, zzm zzmVar) {
        zzjp zzjpVar = new zzjp(context, executor, zzmVar);
        this.zza = zzjpVar;
        this.zzb = new zzjs(zzjpVar);
    }

    @Deprecated
    private final P5.a zzt(P5.a aVar, P5.a aVar2, boolean z8) {
        try {
            Uri uri = (Uri) b.F(aVar);
            Context context = (Context) b.F(aVar2);
            return new b(z8 ? this.zzb.zzb(uri, context) : this.zzb.zza(uri, context, null, null));
        } catch (zzjt unused) {
            return null;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzmy
    public final int zzb() {
        zzjl zzjlVar = this.zza;
        if (!(zzjlVar instanceof zzjp)) {
            return -1;
        }
        zzjl zza = ((zzjp) zzjlVar).zza();
        if (zza instanceof zzjr) {
            return 1;
        }
        return zza instanceof zzji ? 2 : -1;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzmy
    @Deprecated
    public final P5.a zzc(P5.a aVar, P5.a aVar2) {
        return zzt(aVar, aVar2, false);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzmy
    @Deprecated
    public final P5.a zzd(P5.a aVar, P5.a aVar2) {
        return zzt(aVar, aVar2, true);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzmy
    @Deprecated
    public final String zze(P5.a aVar, String str) {
        return ((zzjp) this.zza).zze((Context) b.F(aVar), str, null, null);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzmy
    @Deprecated
    public final String zzf(P5.a aVar) {
        return zzg(aVar, null);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzmy
    @Deprecated
    public final String zzg(P5.a aVar, byte[] bArr) {
        return this.zza.zzg((Context) b.F(aVar), bArr);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzmy
    public final String zzh(P5.a aVar, P5.a aVar2, P5.a aVar3, P5.a aVar4) {
        return this.zza.zze((Context) b.F(aVar), (String) b.F(aVar2), (View) b.F(aVar3), (Activity) b.F(aVar4));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzmy
    public final String zzi(P5.a aVar) {
        return ((zzjp) this.zza).zzg((Context) b.F(aVar), null);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzmy
    public final String zzj() {
        return "ms";
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzmy
    public final String zzk(P5.a aVar, P5.a aVar2, P5.a aVar3) {
        return this.zza.zzh((Context) b.F(aVar), (View) b.F(aVar2), (Activity) b.F(aVar3));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzmy
    public final void zzl(P5.a aVar) {
        this.zzb.zzc((MotionEvent) b.F(aVar));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzmy
    public final void zzm(P5.a aVar) {
        this.zza.zzn((View) b.F(aVar));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzmy
    @Deprecated
    public final void zzn(String str, String str2) {
        this.zzb.zzd(str, str2);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzmy
    @Deprecated
    public final void zzo(String str) {
        this.zzb.zze(str);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzmy
    @Deprecated
    public final boolean zzp(P5.a aVar) {
        return this.zzb.zzg((Uri) b.F(aVar));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzmy
    @Deprecated
    public final boolean zzq(P5.a aVar) {
        return this.zzb.zzf((Uri) b.F(aVar));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzmy
    public final boolean zzr() {
        return this.zza.zzq();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzmy
    public final boolean zzs() {
        return this.zza.zzs();
    }
}
