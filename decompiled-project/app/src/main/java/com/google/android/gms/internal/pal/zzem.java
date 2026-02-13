package com.google.android.gms.internal.pal;

import java.io.IOException;
import r5.C1942a;
import r5.C1943b;

/* loaded from: classes.dex */
public final class zzem extends zzfg {
    public zzem(zzdu zzduVar, String str, String str2, zzr zzrVar, int i7, int i10) {
        super(zzduVar, "ysEnh8zkgcN8WwINs5FP7vGybZW2TtVSX36HO6emvdUrcCkVbC9hrF5Pe5ZSZx3i", "3LpdW89cIASEFv5WvS5ZDEWsiVGQitP33SL3WZgJ6zE=", zzrVar, i7, 24);
    }

    private final void zzc() {
        C1943b zzh = this.zzb.zzh();
        if (zzh == null) {
            return;
        }
        try {
            C1942a e2 = zzh.e();
            String zzd = zzdx.zzd(e2.f23785a);
            if (zzd != null) {
                synchronized (this.zze) {
                    this.zze.zzs(zzd);
                    this.zze.zzr(e2.f23786b);
                    this.zze.zzac(6);
                }
            }
        } catch (IOException unused) {
        }
    }

    @Override // com.google.android.gms.internal.pal.zzfg, java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        zze();
        return null;
    }

    @Override // com.google.android.gms.internal.pal.zzfg
    public final void zza() {
        if (this.zzb.zzq()) {
            zzc();
            return;
        }
        synchronized (this.zze) {
            this.zze.zzs((String) this.zzf.invoke(null, this.zzb.zzb()));
        }
    }

    @Override // com.google.android.gms.internal.pal.zzfg
    public final Void zze() {
        if (this.zzb.zzr()) {
            super.zze();
            return null;
        }
        if (this.zzb.zzq()) {
            zzc();
        }
        return null;
    }
}
