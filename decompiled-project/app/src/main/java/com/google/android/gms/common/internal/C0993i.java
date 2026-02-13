package com.google.android.gms.common.internal;

import a6.C0779c;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.common.internal.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0993i extends G5.a {
    public static final Parcelable.Creator<C0993i> CREATOR = new C0779c(17);

    /* renamed from: a, reason: collision with root package name */
    public final C1002s f15067a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f15068b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f15069c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f15070d;

    /* renamed from: e, reason: collision with root package name */
    public final int f15071e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f15072f;

    public C0993i(C1002s c1002s, boolean z8, boolean z10, int[] iArr, int i7, int[] iArr2) {
        this.f15067a = c1002s;
        this.f15068b = z8;
        this.f15069c = z10;
        this.f15070d = iArr;
        this.f15071e = i7;
        this.f15072f = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int M3 = com.bumptech.glide.d.M(20293, parcel);
        com.bumptech.glide.d.G(parcel, 1, this.f15067a, i7, false);
        com.bumptech.glide.d.O(parcel, 2, 4);
        parcel.writeInt(this.f15068b ? 1 : 0);
        com.bumptech.glide.d.O(parcel, 3, 4);
        parcel.writeInt(this.f15069c ? 1 : 0);
        com.bumptech.glide.d.D(parcel, 4, this.f15070d, false);
        com.bumptech.glide.d.O(parcel, 5, 4);
        parcel.writeInt(this.f15071e);
        com.bumptech.glide.d.D(parcel, 6, this.f15072f, false);
        com.bumptech.glide.d.N(M3, parcel);
    }
}
