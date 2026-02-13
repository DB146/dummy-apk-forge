package com.google.android.gms.common.api;

import a6.C0779c;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.G;
import com.google.android.gms.common.internal.ReflectedParcelable;

/* loaded from: classes.dex */
public final class Scope extends G5.a implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new C0779c(9);

    /* renamed from: a, reason: collision with root package name */
    public final int f14890a;

    /* renamed from: b, reason: collision with root package name */
    public final String f14891b;

    public Scope(int i7, String str) {
        G.e(str, "scopeUri must not be null or empty");
        this.f14890a = i7;
        this.f14891b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f14891b.equals(((Scope) obj).f14891b);
    }

    public final int hashCode() {
        return this.f14891b.hashCode();
    }

    public final String toString() {
        return this.f14891b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int M3 = com.bumptech.glide.d.M(20293, parcel);
        com.bumptech.glide.d.O(parcel, 1, 4);
        parcel.writeInt(this.f14890a);
        com.bumptech.glide.d.H(parcel, 2, this.f14891b, false);
        com.bumptech.glide.d.N(M3, parcel);
    }
}
