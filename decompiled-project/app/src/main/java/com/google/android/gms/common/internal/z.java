package com.google.android.gms.common.internal;

import a6.C0779c;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.common.zza;

/* loaded from: classes.dex */
public final class z extends G5.a {
    public static final Parcelable.Creator<z> CREATOR = new C0779c(14);

    /* renamed from: a, reason: collision with root package name */
    public final int f15127a;

    /* renamed from: b, reason: collision with root package name */
    public final IBinder f15128b;

    /* renamed from: c, reason: collision with root package name */
    public final F5.b f15129c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f15130d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f15131e;

    public z(int i7, IBinder iBinder, F5.b bVar, boolean z8, boolean z10) {
        this.f15127a = i7;
        this.f15128b = iBinder;
        this.f15129c = bVar;
        this.f15130d = z8;
        this.f15131e = z10;
    }

    public final boolean equals(Object obj) {
        Object zzaVar;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        if (this.f15129c.equals(zVar.f15129c)) {
            Object obj2 = null;
            IBinder iBinder = this.f15128b;
            if (iBinder == null) {
                zzaVar = null;
            } else {
                int i7 = AbstractBinderC0985a.f15057a;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                zzaVar = queryLocalInterface instanceof InterfaceC0997m ? (InterfaceC0997m) queryLocalInterface : new zza(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
            }
            IBinder iBinder2 = zVar.f15128b;
            if (iBinder2 != null) {
                int i10 = AbstractBinderC0985a.f15057a;
                IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                obj2 = queryLocalInterface2 instanceof InterfaceC0997m ? (InterfaceC0997m) queryLocalInterface2 : new zza(iBinder2, "com.google.android.gms.common.internal.IAccountAccessor");
            }
            if (G.k(zzaVar, obj2)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int M3 = com.bumptech.glide.d.M(20293, parcel);
        com.bumptech.glide.d.O(parcel, 1, 4);
        parcel.writeInt(this.f15127a);
        com.bumptech.glide.d.C(parcel, 2, this.f15128b);
        com.bumptech.glide.d.G(parcel, 3, this.f15129c, i7, false);
        com.bumptech.glide.d.O(parcel, 4, 4);
        parcel.writeInt(this.f15130d ? 1 : 0);
        com.bumptech.glide.d.O(parcel, 5, 4);
        parcel.writeInt(this.f15131e ? 1 : 0);
        com.bumptech.glide.d.N(M3, parcel);
    }
}
