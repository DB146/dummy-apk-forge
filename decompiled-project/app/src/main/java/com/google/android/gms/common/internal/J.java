package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.internal.common.zzb;
import com.google.android.gms.internal.common.zzc;

/* loaded from: classes.dex */
public final class J extends zzb {

    /* renamed from: a, reason: collision with root package name */
    public AbstractC0990f f15028a;

    /* renamed from: b, reason: collision with root package name */
    public final int f15029b;

    public J(AbstractC0990f abstractC0990f, int i7) {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
        this.f15028a = abstractC0990f;
        this.f15029b = i7;
    }

    @Override // com.google.android.gms.internal.common.zzb
    public final boolean zza(int i7, Parcel parcel, Parcel parcel2, int i10) {
        int i11 = this.f15029b;
        if (i7 == 1) {
            int readInt = parcel.readInt();
            IBinder readStrongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) zzc.zza(parcel, Bundle.CREATOR);
            zzc.zzb(parcel);
            G.h(this.f15028a, "onPostInitComplete can be called only once per call to getRemoteService");
            this.f15028a.onPostInitHandler(readInt, readStrongBinder, bundle, i11);
            this.f15028a = null;
        } else if (i7 == 2) {
            parcel.readInt();
            zzc.zzb(parcel);
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        } else {
            if (i7 != 3) {
                return false;
            }
            int readInt2 = parcel.readInt();
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            N n6 = (N) zzc.zza(parcel, N.CREATOR);
            zzc.zzb(parcel);
            AbstractC0990f abstractC0990f = this.f15028a;
            G.h(abstractC0990f, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            G.g(n6);
            AbstractC0990f.zzj(abstractC0990f, n6);
            Bundle bundle2 = n6.f15033a;
            G.h(this.f15028a, "onPostInitComplete can be called only once per call to getRemoteService");
            this.f15028a.onPostInitHandler(readInt2, readStrongBinder2, bundle2, i11);
            this.f15028a = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
