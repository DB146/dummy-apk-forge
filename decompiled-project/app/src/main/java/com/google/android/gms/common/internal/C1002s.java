package com.google.android.gms.common.internal;

import a6.C0779c;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.common.internal.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1002s extends G5.a {
    public static final Parcelable.Creator<C1002s> CREATOR = new C0779c(15);

    /* renamed from: a, reason: collision with root package name */
    public final int f15107a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f15108b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f15109c;

    /* renamed from: d, reason: collision with root package name */
    public final int f15110d;

    /* renamed from: e, reason: collision with root package name */
    public final int f15111e;

    public C1002s(int i7, boolean z8, boolean z10, int i10, int i11) {
        this.f15107a = i7;
        this.f15108b = z8;
        this.f15109c = z10;
        this.f15110d = i10;
        this.f15111e = i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int M3 = com.bumptech.glide.d.M(20293, parcel);
        com.bumptech.glide.d.O(parcel, 1, 4);
        parcel.writeInt(this.f15107a);
        com.bumptech.glide.d.O(parcel, 2, 4);
        parcel.writeInt(this.f15108b ? 1 : 0);
        com.bumptech.glide.d.O(parcel, 3, 4);
        parcel.writeInt(this.f15109c ? 1 : 0);
        com.bumptech.glide.d.O(parcel, 4, 4);
        parcel.writeInt(this.f15110d);
        com.bumptech.glide.d.O(parcel, 5, 4);
        parcel.writeInt(this.f15111e);
        com.bumptech.glide.d.N(M3, parcel);
    }
}
