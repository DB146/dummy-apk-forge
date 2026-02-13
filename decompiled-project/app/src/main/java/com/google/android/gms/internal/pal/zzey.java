package com.google.android.gms.internal.pal;

/* loaded from: classes.dex */
public final class zzey extends zzfg {
    private final StackTraceElement[] zzi;

    public zzey(zzdu zzduVar, String str, String str2, zzr zzrVar, int i7, int i10, StackTraceElement[] stackTraceElementArr) {
        super(zzduVar, "d2tnKFzXPwiZyQGi+81r0jKuUmc/wF2bs8mf3rZLUgisIeswnimQDm/skPYjpEo4", "e/DvqiTz4SkFtBEBn/3V8Pr2h2slHO4xuLOBAItCJ4w=", zzrVar, i7, 45);
        this.zzi = stackTraceElementArr;
    }

    @Override // com.google.android.gms.internal.pal.zzfg
    public final void zza() {
        StackTraceElement[] stackTraceElementArr = this.zzi;
        if (stackTraceElementArr != null) {
            zzdn zzdnVar = new zzdn((String) this.zzf.invoke(null, stackTraceElementArr));
            synchronized (this.zze) {
                try {
                    this.zze.zzG(zzdnVar.zza.longValue());
                    if (zzdnVar.zzb.booleanValue()) {
                        this.zze.zzad(true != zzdnVar.zzc.booleanValue() ? 2 : 1);
                    } else {
                        this.zze.zzad(3);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
