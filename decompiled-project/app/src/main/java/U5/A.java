package U5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class A extends G5.a {
    public static final Parcelable.Creator<A> CREATOR = new T(5);

    /* renamed from: a, reason: collision with root package name */
    public final E f9690a;

    /* renamed from: b, reason: collision with root package name */
    public final r f9691b;

    public A(String str, int i7) {
        com.google.android.gms.common.internal.G.g(str);
        try {
            this.f9690a = E.a(str);
            try {
                this.f9691b = r.a(i7);
            } catch (C0549q e2) {
                throw new IllegalArgumentException(e2);
            }
        } catch (D e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof A)) {
            return false;
        }
        A a9 = (A) obj;
        return this.f9690a.equals(a9.f9690a) && this.f9691b.equals(a9.f9691b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9690a, this.f9691b});
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Enum, U5.a] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int M3 = com.bumptech.glide.d.M(20293, parcel);
        this.f9690a.getClass();
        com.bumptech.glide.d.H(parcel, 2, "public-key", false);
        com.bumptech.glide.d.E(parcel, 3, Integer.valueOf(this.f9691b.f9784a.a()));
        com.bumptech.glide.d.N(M3, parcel);
    }
}
