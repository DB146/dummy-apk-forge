package com.google.android.gms.common.internal;

import a6.C0779c;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.common.internal.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1001q extends G5.a {
    public static final Parcelable.Creator<C1001q> CREATOR = new C0779c(12);

    /* renamed from: a, reason: collision with root package name */
    public final int f15095a;

    /* renamed from: b, reason: collision with root package name */
    public final int f15096b;

    /* renamed from: c, reason: collision with root package name */
    public final int f15097c;

    /* renamed from: d, reason: collision with root package name */
    public final long f15098d;

    /* renamed from: e, reason: collision with root package name */
    public final long f15099e;

    /* renamed from: f, reason: collision with root package name */
    public final String f15100f;

    /* renamed from: u, reason: collision with root package name */
    public final String f15101u;

    /* renamed from: v, reason: collision with root package name */
    public final int f15102v;

    /* renamed from: w, reason: collision with root package name */
    public final int f15103w;

    public C1001q(int i7, int i10, int i11, long j, long j10, String str, String str2, int i12, int i13) {
        this.f15095a = i7;
        this.f15096b = i10;
        this.f15097c = i11;
        this.f15098d = j;
        this.f15099e = j10;
        this.f15100f = str;
        this.f15101u = str2;
        this.f15102v = i12;
        this.f15103w = i13;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int M3 = com.bumptech.glide.d.M(20293, parcel);
        com.bumptech.glide.d.O(parcel, 1, 4);
        parcel.writeInt(this.f15095a);
        com.bumptech.glide.d.O(parcel, 2, 4);
        parcel.writeInt(this.f15096b);
        com.bumptech.glide.d.O(parcel, 3, 4);
        parcel.writeInt(this.f15097c);
        com.bumptech.glide.d.O(parcel, 4, 8);
        parcel.writeLong(this.f15098d);
        com.bumptech.glide.d.O(parcel, 5, 8);
        parcel.writeLong(this.f15099e);
        com.bumptech.glide.d.H(parcel, 6, this.f15100f, false);
        com.bumptech.glide.d.H(parcel, 7, this.f15101u, false);
        com.bumptech.glide.d.O(parcel, 8, 4);
        parcel.writeInt(this.f15102v);
        com.bumptech.glide.d.O(parcel, 9, 4);
        parcel.writeInt(this.f15103w);
        com.bumptech.glide.d.N(M3, parcel);
    }
}
