package com.google.android.gms.internal.pal;

import P5.a;
import P5.b;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import r5.C1942a;

/* loaded from: classes.dex */
public final class zzfn extends zzfq {
    private final zzcq zza;
    private final zzcs zzb;
    private final zzcv zzc;
    private boolean zzd = false;

    @Deprecated
    public zzfn(String str, Context context, boolean z8) {
        zzcu zzl = zzcu.zzl("h.3.2.2/n.android.3.2.2", context, false);
        this.zza = zzl;
        this.zzc = new zzcv(zzl);
        this.zzb = zzcs.zzl(context);
    }

    @Deprecated
    private final a zzs(a aVar, a aVar2, boolean z8) {
        try {
            Uri uri = (Uri) b.F(aVar);
            Context context = (Context) b.F(aVar2);
            return new b(z8 ? this.zzc.zzb(uri, context) : this.zzc.zza(uri, context, null, null));
        } catch (zzcw unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.pal.zzfr
    public final int zzb() {
        return this.zza instanceof zzcu ? 1 : -1;
    }

    @Override // com.google.android.gms.internal.pal.zzfr
    @Deprecated
    public final a zzc(a aVar, a aVar2) {
        return zzs(aVar, aVar2, false);
    }

    @Override // com.google.android.gms.internal.pal.zzfr
    @Deprecated
    public final a zzd(a aVar, a aVar2) {
        return zzs(aVar, aVar2, true);
    }

    @Override // com.google.android.gms.internal.pal.zzfr
    @Deprecated
    public final String zze(a aVar, String str) {
        return ((zzcr) this.zza).zza((Context) b.F(aVar), str, null, null);
    }

    @Override // com.google.android.gms.internal.pal.zzfr
    @Deprecated
    public final String zzf(a aVar) {
        return zzg(aVar, null);
    }

    @Override // com.google.android.gms.internal.pal.zzfr
    @Deprecated
    public final String zzg(a aVar, byte[] bArr) {
        Context context = (Context) b.F(aVar);
        String zzc = this.zza.zzc(context, bArr);
        zzcs zzcsVar = this.zzb;
        if (zzcsVar == null || !this.zzd) {
            return zzc;
        }
        String zzm = this.zzb.zzm(zzc, zzcsVar.zzc(context, bArr));
        this.zzd = false;
        return zzm;
    }

    @Override // com.google.android.gms.internal.pal.zzfr
    public final String zzh(a aVar, a aVar2, a aVar3, a aVar4) {
        return this.zza.zza((Context) b.F(aVar), (String) b.F(aVar2), (View) b.F(aVar3), (Activity) b.F(aVar4));
    }

    @Override // com.google.android.gms.internal.pal.zzfr
    public final String zzi(a aVar) {
        return this.zza.zzb((Context) b.F(aVar));
    }

    @Override // com.google.android.gms.internal.pal.zzfr
    public final String zzj() {
        return "ms";
    }

    @Override // com.google.android.gms.internal.pal.zzfr
    public final String zzk(a aVar, a aVar2, a aVar3) {
        return this.zza.zzd((Context) b.F(aVar), (View) b.F(aVar2), (Activity) b.F(aVar3));
    }

    @Override // com.google.android.gms.internal.pal.zzfr
    public final void zzl(a aVar) {
        this.zzc.zzc((MotionEvent) b.F(aVar));
    }

    @Override // com.google.android.gms.internal.pal.zzfr
    public final void zzm(a aVar) {
        this.zza.zzf((View) b.F(aVar));
    }

    @Override // com.google.android.gms.internal.pal.zzfr
    @Deprecated
    public final void zzn(String str, String str2) {
        this.zzc.zzd(str, str2);
    }

    @Override // com.google.android.gms.internal.pal.zzfr
    @Deprecated
    public final void zzo(String str) {
        this.zzc.zze(str);
    }

    @Override // com.google.android.gms.internal.pal.zzfr
    @Deprecated
    public final boolean zzp(a aVar) {
        return this.zzc.zzg((Uri) b.F(aVar));
    }

    @Override // com.google.android.gms.internal.pal.zzfr
    @Deprecated
    public final boolean zzq(a aVar) {
        return this.zzc.zzf((Uri) b.F(aVar));
    }

    @Override // com.google.android.gms.internal.pal.zzfr
    @Deprecated
    public final boolean zzr(String str, boolean z8) {
        zzcs zzcsVar = this.zzb;
        if (zzcsVar == null) {
            return false;
        }
        zzcsVar.zzp(new C1942a(str, z8));
        this.zzd = true;
        return true;
    }
}
