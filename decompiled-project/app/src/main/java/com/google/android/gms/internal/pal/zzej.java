package com.google.android.gms.internal.pal;

/* loaded from: classes.dex */
public final class zzej extends zzfg {
    public zzej(zzdu zzduVar, String str, String str2, zzr zzrVar, int i7, int i10) {
        super(zzduVar, "C6OPKdOx6rUdfDdOmaUimt8yM1FrOv7bKCITdJ0Uo74WwXDfvXouJ4oz4kHBjTSk", "dTWRHHPyYq/fNXOTAS/wjayGzv2SlrSwyDcB+vX+h5Q=", zzrVar, i7, 5);
    }

    @Override // com.google.android.gms.internal.pal.zzfg
    public final void zza() {
        this.zze.zzm(-1L);
        this.zze.zzl(-1L);
        int[] iArr = (int[]) this.zzf.invoke(null, this.zzb.zzb());
        synchronized (this.zze) {
            try {
                this.zze.zzm(iArr[0]);
                this.zze.zzl(iArr[1]);
                int i7 = iArr[2];
                if (i7 != Integer.MIN_VALUE) {
                    this.zze.zzk(i7);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
