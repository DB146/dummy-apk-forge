package com.google.android.material.datepicker;

import a6.C0779c;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new C0779c(19);

    /* renamed from: a, reason: collision with root package name */
    public final p f15294a;

    /* renamed from: b, reason: collision with root package name */
    public final p f15295b;

    /* renamed from: c, reason: collision with root package name */
    public final d f15296c;

    /* renamed from: d, reason: collision with root package name */
    public final p f15297d;

    /* renamed from: e, reason: collision with root package name */
    public final int f15298e;

    /* renamed from: f, reason: collision with root package name */
    public final int f15299f;

    /* renamed from: u, reason: collision with root package name */
    public final int f15300u;

    public b(p pVar, p pVar2, d dVar, p pVar3, int i7) {
        Objects.requireNonNull(pVar, "start cannot be null");
        Objects.requireNonNull(pVar2, "end cannot be null");
        Objects.requireNonNull(dVar, "validator cannot be null");
        this.f15294a = pVar;
        this.f15295b = pVar2;
        this.f15297d = pVar3;
        this.f15298e = i7;
        this.f15296c = dVar;
        if (pVar3 != null && pVar.f15360a.compareTo(pVar3.f15360a) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (pVar3 != null && pVar3.f15360a.compareTo(pVar2.f15360a) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i7 < 0 || i7 > x.c(null).getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        }
        this.f15300u = pVar.f(pVar2) + 1;
        this.f15299f = (pVar2.f15362c - pVar.f15362c) + 1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f15294a.equals(bVar.f15294a) && this.f15295b.equals(bVar.f15295b) && Objects.equals(this.f15297d, bVar.f15297d) && this.f15298e == bVar.f15298e && this.f15296c.equals(bVar.f15296c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f15294a, this.f15295b, this.f15297d, Integer.valueOf(this.f15298e), this.f15296c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeParcelable(this.f15294a, 0);
        parcel.writeParcelable(this.f15295b, 0);
        parcel.writeParcelable(this.f15297d, 0);
        parcel.writeParcelable(this.f15296c, 0);
        parcel.writeInt(this.f15298e);
    }
}
