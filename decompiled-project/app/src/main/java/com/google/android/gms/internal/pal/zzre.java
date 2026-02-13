package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public final class zzre {
    private ArrayList zza = new ArrayList();
    private zzrb zzb = zzrb.zza;
    private Integer zzc = null;

    public final zzre zza(zzkj zzkjVar, int i7, zzks zzksVar) {
        ArrayList arrayList = this.zza;
        if (arrayList == null) {
            throw new IllegalStateException("addEntry cannot be called after build()");
        }
        arrayList.add(new zzrg(zzkjVar, i7, zzksVar, null));
        return this;
    }

    public final zzre zzb(zzrb zzrbVar) {
        if (this.zza == null) {
            throw new IllegalStateException("setAnnotations cannot be called after build()");
        }
        this.zzb = zzrbVar;
        return this;
    }

    public final zzre zzc(int i7) {
        if (this.zza == null) {
            throw new IllegalStateException("setPrimaryKeyId cannot be called after build()");
        }
        this.zzc = Integer.valueOf(i7);
        return this;
    }

    public final zzri zzd() {
        if (this.zza == null) {
            throw new IllegalStateException("cannot call build() twice");
        }
        Integer num = this.zzc;
        if (num != null) {
            int intValue = num.intValue();
            ArrayList arrayList = this.zza;
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                int i10 = i7 + 1;
                if (((zzrg) arrayList.get(i7)).zza() != intValue) {
                    i7 = i10;
                }
            }
            throw new GeneralSecurityException("primary key ID is not present in entries");
        }
        zzri zzriVar = new zzri(this.zzb, Collections.unmodifiableList(this.zza), this.zzc, null);
        this.zza = null;
        return zzriVar;
    }
}
