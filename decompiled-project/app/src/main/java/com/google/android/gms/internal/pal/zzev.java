package com.google.android.gms.internal.pal;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class zzev extends zzfg {
    public zzev(zzdu zzduVar, String str, String str2, zzr zzrVar, int i7, int i10) {
        super(zzduVar, "WepZYnT/MXyJE28LKN26NT6D3mAA2J2spDFApE1ixrQxTNXRg7wshW7BC/EU90LT", "sjYkfzJTuYKxh1jvZaP9n5dx9JGmzJotOUC/vdvgi4M=", zzrVar, i7, 73);
    }

    @Override // com.google.android.gms.internal.pal.zzfg
    public final void zza() {
        try {
            boolean booleanValue = ((Boolean) this.zzf.invoke(null, this.zzb.zzb())).booleanValue();
            zzr zzrVar = this.zze;
            int i7 = 1;
            if (true == booleanValue) {
                i7 = 2;
            }
            zzrVar.zzaf(i7);
        } catch (InvocationTargetException unused) {
            this.zze.zzaf(3);
        }
    }
}
