package com.google.android.gms.common.api;

import a6.C0779c;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.G;
import com.google.android.gms.common.internal.ReflectedParcelable;
import h3.H;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class Status extends G5.a implements r, ReflectedParcelable {

    /* renamed from: a, reason: collision with root package name */
    public final int f14897a;

    /* renamed from: b, reason: collision with root package name */
    public final String f14898b;

    /* renamed from: c, reason: collision with root package name */
    public final PendingIntent f14899c;

    /* renamed from: d, reason: collision with root package name */
    public final F5.b f14900d;

    /* renamed from: e, reason: collision with root package name */
    public static final Status f14892e = new Status(0, null, null, null);

    /* renamed from: f, reason: collision with root package name */
    public static final Status f14893f = new Status(14, null, null, null);

    /* renamed from: u, reason: collision with root package name */
    public static final Status f14894u = new Status(8, null, null, null);

    /* renamed from: v, reason: collision with root package name */
    public static final Status f14895v = new Status(15, null, null, null);

    /* renamed from: w, reason: collision with root package name */
    public static final Status f14896w = new Status(16, null, null, null);
    public static final Parcelable.Creator<Status> CREATOR = new C0779c(10);

    public Status(int i7, String str, PendingIntent pendingIntent, F5.b bVar) {
        this.f14897a = i7;
        this.f14898b = str;
        this.f14899c = pendingIntent;
        this.f14900d = bVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f14897a == status.f14897a && G.k(this.f14898b, status.f14898b) && G.k(this.f14899c, status.f14899c) && G.k(this.f14900d, status.f14900d);
    }

    @Override // com.google.android.gms.common.api.r
    public final Status getStatus() {
        return this;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f14897a), this.f14898b, this.f14899c, this.f14900d});
    }

    public final boolean t() {
        return this.f14897a <= 0;
    }

    public final String toString() {
        q3.s sVar = new q3.s(this);
        String str = this.f14898b;
        if (str == null) {
            str = H.v(this.f14897a);
        }
        sVar.f(str, "statusCode");
        sVar.f(this.f14899c, "resolution");
        return sVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int M3 = com.bumptech.glide.d.M(20293, parcel);
        com.bumptech.glide.d.O(parcel, 1, 4);
        parcel.writeInt(this.f14897a);
        com.bumptech.glide.d.H(parcel, 2, this.f14898b, false);
        com.bumptech.glide.d.G(parcel, 3, this.f14899c, i7, false);
        com.bumptech.glide.d.G(parcel, 4, this.f14900d, i7, false);
        com.bumptech.glide.d.N(M3, parcel);
    }
}
