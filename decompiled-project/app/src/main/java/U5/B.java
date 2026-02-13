package U5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class B extends AbstractC0544l {
    public static final Parcelable.Creator<B> CREATOR = new T(6);

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f9692a;

    /* renamed from: b, reason: collision with root package name */
    public final Double f9693b;

    /* renamed from: c, reason: collision with root package name */
    public final String f9694c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f9695d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f9696e;

    /* renamed from: f, reason: collision with root package name */
    public final L f9697f;

    /* renamed from: u, reason: collision with root package name */
    public final W f9698u;

    /* renamed from: v, reason: collision with root package name */
    public final C0538f f9699v;

    /* renamed from: w, reason: collision with root package name */
    public final Long f9700w;

    public B(byte[] bArr, Double d10, String str, ArrayList arrayList, Integer num, L l10, String str2, C0538f c0538f, Long l11) {
        com.google.android.gms.common.internal.G.g(bArr);
        this.f9692a = bArr;
        this.f9693b = d10;
        com.google.android.gms.common.internal.G.g(str);
        this.f9694c = str;
        this.f9695d = arrayList;
        this.f9696e = num;
        this.f9697f = l10;
        this.f9700w = l11;
        if (str2 != null) {
            try {
                this.f9698u = W.a(str2);
            } catch (V e2) {
                throw new IllegalArgumentException(e2);
            }
        } else {
            this.f9698u = null;
        }
        this.f9699v = c0538f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof B)) {
            return false;
        }
        B b2 = (B) obj;
        if (Arrays.equals(this.f9692a, b2.f9692a) && com.google.android.gms.common.internal.G.k(this.f9693b, b2.f9693b) && com.google.android.gms.common.internal.G.k(this.f9694c, b2.f9694c)) {
            ArrayList arrayList = this.f9695d;
            ArrayList arrayList2 = b2.f9695d;
            if (((arrayList == null && arrayList2 == null) || (arrayList != null && arrayList2 != null && arrayList.containsAll(arrayList2) && arrayList2.containsAll(arrayList))) && com.google.android.gms.common.internal.G.k(this.f9696e, b2.f9696e) && com.google.android.gms.common.internal.G.k(this.f9697f, b2.f9697f) && com.google.android.gms.common.internal.G.k(this.f9698u, b2.f9698u) && com.google.android.gms.common.internal.G.k(this.f9699v, b2.f9699v) && com.google.android.gms.common.internal.G.k(this.f9700w, b2.f9700w)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.f9692a)), this.f9693b, this.f9694c, this.f9695d, this.f9696e, this.f9697f, this.f9698u, this.f9699v, this.f9700w});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int M3 = com.bumptech.glide.d.M(20293, parcel);
        com.bumptech.glide.d.A(parcel, 2, this.f9692a, false);
        com.bumptech.glide.d.B(parcel, 3, this.f9693b);
        com.bumptech.glide.d.H(parcel, 4, this.f9694c, false);
        com.bumptech.glide.d.L(parcel, 5, this.f9695d, false);
        com.bumptech.glide.d.E(parcel, 6, this.f9696e);
        com.bumptech.glide.d.G(parcel, 7, this.f9697f, i7, false);
        W w10 = this.f9698u;
        com.bumptech.glide.d.H(parcel, 8, w10 == null ? null : w10.f9730a, false);
        com.bumptech.glide.d.G(parcel, 9, this.f9699v, i7, false);
        com.bumptech.glide.d.F(parcel, 10, this.f9700w);
        com.bumptech.glide.d.N(M3, parcel);
    }
}
