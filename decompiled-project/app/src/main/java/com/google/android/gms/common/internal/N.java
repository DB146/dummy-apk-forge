package com.google.android.gms.common.internal;

import a6.C0779c;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class N extends G5.a {
    public static final Parcelable.Creator<N> CREATOR = new C0779c(16);

    /* renamed from: a, reason: collision with root package name */
    public Bundle f15033a;

    /* renamed from: b, reason: collision with root package name */
    public F5.d[] f15034b;

    /* renamed from: c, reason: collision with root package name */
    public int f15035c;

    /* renamed from: d, reason: collision with root package name */
    public C0993i f15036d;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int M3 = com.bumptech.glide.d.M(20293, parcel);
        com.bumptech.glide.d.z(parcel, 1, this.f15033a, false);
        com.bumptech.glide.d.K(parcel, 2, this.f15034b, i7);
        com.bumptech.glide.d.O(parcel, 3, 4);
        parcel.writeInt(this.f15035c);
        com.bumptech.glide.d.G(parcel, 4, this.f15036d, i7, false);
        com.bumptech.glide.d.N(M3, parcel);
    }
}
