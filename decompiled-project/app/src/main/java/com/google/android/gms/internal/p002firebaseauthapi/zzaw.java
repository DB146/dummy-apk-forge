package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.AbstractMap;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzaw extends zzaj {
    private final /* synthetic */ zzat zza;

    public zzaw(zzat zzatVar) {
        this.zza = zzatVar;
    }

    @Override // java.util.List
    public final /* synthetic */ Object get(int i7) {
        int i10;
        Object[] objArr;
        Object[] objArr2;
        i10 = this.zza.zzc;
        zzw.zza(i7, i10);
        objArr = this.zza.zzb;
        int i11 = i7 * 2;
        Object obj = objArr[i11];
        Objects.requireNonNull(obj);
        objArr2 = this.zza.zzb;
        Object obj2 = objArr2[i11 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        int i7;
        i7 = this.zza.zzc;
        return i7;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzai
    public final boolean zze() {
        return true;
    }
}
