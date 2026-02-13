package U5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: U5.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0545m extends G5.a {
    public static final Parcelable.Creator<C0545m> CREATOR = new T(26);

    /* renamed from: a, reason: collision with root package name */
    public final EnumC0535c f9774a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f9775b;

    /* renamed from: c, reason: collision with root package name */
    public final W f9776c;

    /* renamed from: d, reason: collision with root package name */
    public final I f9777d;

    public C0545m(String str, String str2, Boolean bool, String str3) {
        EnumC0535c a9;
        I i7 = null;
        if (str == null) {
            a9 = null;
        } else {
            try {
                a9 = EnumC0535c.a(str);
            } catch (H | V | C0534b e2) {
                throw new IllegalArgumentException(e2);
            }
        }
        this.f9774a = a9;
        this.f9775b = bool;
        this.f9776c = str2 == null ? null : W.a(str2);
        if (str3 != null) {
            i7 = I.a(str3);
        }
        this.f9777d = i7;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0545m)) {
            return false;
        }
        C0545m c0545m = (C0545m) obj;
        return com.google.android.gms.common.internal.G.k(this.f9774a, c0545m.f9774a) && com.google.android.gms.common.internal.G.k(this.f9775b, c0545m.f9775b) && com.google.android.gms.common.internal.G.k(this.f9776c, c0545m.f9776c) && com.google.android.gms.common.internal.G.k(t(), c0545m.t());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9774a, this.f9775b, this.f9776c, t()});
    }

    public final I t() {
        I i7 = this.f9777d;
        if (i7 != null) {
            return i7;
        }
        Boolean bool = this.f9775b;
        if (bool == null || !bool.booleanValue()) {
            return null;
        }
        return I.RESIDENT_KEY_REQUIRED;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int M3 = com.bumptech.glide.d.M(20293, parcel);
        EnumC0535c enumC0535c = this.f9774a;
        com.bumptech.glide.d.H(parcel, 2, enumC0535c == null ? null : enumC0535c.f9742a, false);
        com.bumptech.glide.d.y(parcel, 3, this.f9775b);
        W w10 = this.f9776c;
        com.bumptech.glide.d.H(parcel, 4, w10 == null ? null : w10.f9730a, false);
        com.bumptech.glide.d.H(parcel, 5, t() != null ? t().f9714a : null, false);
        com.bumptech.glide.d.N(M3, parcel);
    }
}
