package com.google.android.gms.internal.p002firebaseauthapi;

import X.c;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzqa {
    private final Class<?> zza;
    private final Class<?> zzb;

    private zzqa(Class<?> cls, Class<?> cls2) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzqa)) {
            return false;
        }
        zzqa zzqaVar = (zzqa) obj;
        return zzqaVar.zza.equals(this.zza) && zzqaVar.zzb.equals(this.zzb);
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb);
    }

    public final String toString() {
        return c.i(this.zza.getSimpleName(), " with primitive type: ", this.zzb.getSimpleName());
    }
}
