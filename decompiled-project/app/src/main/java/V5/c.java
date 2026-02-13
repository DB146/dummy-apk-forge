package V5;

import U5.a0;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class c extends G5.a {
    public static final Parcelable.Creator<c> CREATOR = new a0(7);

    /* renamed from: a, reason: collision with root package name */
    public final a f10174a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10175b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10176c;

    static {
        new c("unavailable");
        new c("unused");
    }

    public c(int i7, String str, String str2) {
        try {
            this.f10174a = t(i7);
            this.f10175b = str;
            this.f10176c = str2;
        } catch (b e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public c(String str) {
        this.f10175b = str;
        this.f10174a = a.STRING;
        this.f10176c = null;
    }

    public static a t(int i7) {
        for (a aVar : a.values()) {
            if (i7 == aVar.f10173a) {
                return aVar;
            }
        }
        throw new Exception(A3.c.f(i7, "ChannelIdValueType ", " not supported"));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        a aVar = cVar.f10174a;
        a aVar2 = this.f10174a;
        if (!aVar2.equals(aVar)) {
            return false;
        }
        int ordinal = aVar2.ordinal();
        if (ordinal == 0) {
            return true;
        }
        if (ordinal == 1) {
            return this.f10175b.equals(cVar.f10175b);
        }
        if (ordinal != 2) {
            return false;
        }
        return this.f10176c.equals(cVar.f10176c);
    }

    public final int hashCode() {
        int i7;
        int hashCode;
        a aVar = this.f10174a;
        int hashCode2 = aVar.hashCode() + 31;
        int ordinal = aVar.ordinal();
        if (ordinal == 1) {
            i7 = hashCode2 * 31;
            hashCode = this.f10175b.hashCode();
        } else {
            if (ordinal != 2) {
                return hashCode2;
            }
            i7 = hashCode2 * 31;
            hashCode = this.f10176c.hashCode();
        }
        return hashCode + i7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int M3 = com.bumptech.glide.d.M(20293, parcel);
        int i10 = this.f10174a.f10173a;
        com.bumptech.glide.d.O(parcel, 2, 4);
        parcel.writeInt(i10);
        com.bumptech.glide.d.H(parcel, 3, this.f10175b, false);
        com.bumptech.glide.d.H(parcel, 4, this.f10176c, false);
        com.bumptech.glide.d.N(M3, parcel);
    }
}
