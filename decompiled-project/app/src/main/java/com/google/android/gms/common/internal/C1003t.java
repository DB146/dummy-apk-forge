package com.google.android.gms.common.internal;

import a6.C0779c;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: com.google.android.gms.common.internal.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1003t extends G5.a {
    public static final Parcelable.Creator<C1003t> CREATOR = new C0779c(11);

    /* renamed from: a, reason: collision with root package name */
    public final int f15112a;

    /* renamed from: b, reason: collision with root package name */
    public List f15113b;

    public C1003t(int i7, List list) {
        this.f15112a = i7;
        this.f15113b = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int M3 = com.bumptech.glide.d.M(20293, parcel);
        com.bumptech.glide.d.O(parcel, 1, 4);
        parcel.writeInt(this.f15112a);
        com.bumptech.glide.d.L(parcel, 2, this.f15113b, false);
        com.bumptech.glide.d.N(M3, parcel);
    }
}
