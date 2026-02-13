package com.google.android.gms.common.internal;

import android.os.Parcel;
import com.google.android.gms.internal.common.zza;

/* loaded from: classes.dex */
public final class W extends zza implements B {
    @Override // com.google.android.gms.common.internal.B
    public final int zzc() {
        Parcel zzB = zzB(2, zza());
        int readInt = zzB.readInt();
        zzB.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.common.internal.B
    public final P5.a zzd() {
        Parcel zzB = zzB(1, zza());
        P5.a h10 = P5.b.h(zzB.readStrongBinder());
        zzB.recycle();
        return h10;
    }
}
