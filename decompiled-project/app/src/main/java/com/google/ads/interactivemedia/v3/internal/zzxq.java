package com.google.ads.interactivemedia.v3.internal;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzxq implements WildcardType, Serializable {
    private final Type zza;
    private final Type zzb;

    public zzxq(Type[] typeArr, Type[] typeArr2) {
        int length = typeArr2.length;
        zzxm.zza(length <= 1);
        zzxm.zza(typeArr.length == 1);
        if (length != 1) {
            Type type = typeArr[0];
            type.getClass();
            zzxr.zzf(type);
            this.zzb = null;
            this.zza = zzxr.zzc(typeArr[0]);
            return;
        }
        Type type2 = typeArr2[0];
        type2.getClass();
        zzxr.zzf(type2);
        zzxm.zza(typeArr[0] == Object.class);
        this.zzb = zzxr.zzc(typeArr2[0]);
        this.zza = Object.class;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WildcardType) && zzxr.zzg(this, (WildcardType) obj);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.zzb;
        return type != null ? new Type[]{type} : zzxr.zza;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return new Type[]{this.zza};
    }

    public final int hashCode() {
        Type type = this.zzb;
        return (type != null ? type.hashCode() + 31 : 1) ^ (this.zza.hashCode() + 31);
    }

    public final String toString() {
        Type type = this.zzb;
        if (type != null) {
            return "? super ".concat(String.valueOf(zzxr.zzb(type)));
        }
        Type type2 = this.zza;
        return type2 == Object.class ? "?" : "? extends ".concat(String.valueOf(zzxr.zzb(type2)));
    }
}
