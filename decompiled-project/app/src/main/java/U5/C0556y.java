package U5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: U5.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0556y extends AbstractC0544l {
    public static final Parcelable.Creator<C0556y> CREATOR = new T(2);

    /* renamed from: a, reason: collision with root package name */
    public final C f9799a;

    /* renamed from: b, reason: collision with root package name */
    public final F f9800b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f9801c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f9802d;

    /* renamed from: e, reason: collision with root package name */
    public final Double f9803e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f9804f;

    /* renamed from: u, reason: collision with root package name */
    public final C0545m f9805u;

    /* renamed from: v, reason: collision with root package name */
    public final Integer f9806v;

    /* renamed from: w, reason: collision with root package name */
    public final L f9807w;

    /* renamed from: x, reason: collision with root package name */
    public final EnumC0537e f9808x;

    /* renamed from: y, reason: collision with root package name */
    public final C0538f f9809y;

    public C0556y(C c10, F f4, byte[] bArr, ArrayList arrayList, Double d10, ArrayList arrayList2, C0545m c0545m, Integer num, L l10, String str, C0538f c0538f) {
        com.google.android.gms.common.internal.G.g(c10);
        this.f9799a = c10;
        com.google.android.gms.common.internal.G.g(f4);
        this.f9800b = f4;
        com.google.android.gms.common.internal.G.g(bArr);
        this.f9801c = bArr;
        com.google.android.gms.common.internal.G.g(arrayList);
        this.f9802d = arrayList;
        this.f9803e = d10;
        this.f9804f = arrayList2;
        this.f9805u = c0545m;
        this.f9806v = num;
        this.f9807w = l10;
        if (str != null) {
            try {
                this.f9808x = EnumC0537e.a(str);
            } catch (C0536d e2) {
                throw new IllegalArgumentException(e2);
            }
        } else {
            this.f9808x = null;
        }
        this.f9809y = c0538f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0556y)) {
            return false;
        }
        C0556y c0556y = (C0556y) obj;
        if (com.google.android.gms.common.internal.G.k(this.f9799a, c0556y.f9799a) && com.google.android.gms.common.internal.G.k(this.f9800b, c0556y.f9800b) && Arrays.equals(this.f9801c, c0556y.f9801c) && com.google.android.gms.common.internal.G.k(this.f9803e, c0556y.f9803e)) {
            ArrayList arrayList = this.f9802d;
            ArrayList arrayList2 = c0556y.f9802d;
            if (arrayList.containsAll(arrayList2) && arrayList2.containsAll(arrayList)) {
                ArrayList arrayList3 = this.f9804f;
                ArrayList arrayList4 = c0556y.f9804f;
                if (((arrayList3 == null && arrayList4 == null) || (arrayList3 != null && arrayList4 != null && arrayList3.containsAll(arrayList4) && arrayList4.containsAll(arrayList3))) && com.google.android.gms.common.internal.G.k(this.f9805u, c0556y.f9805u) && com.google.android.gms.common.internal.G.k(this.f9806v, c0556y.f9806v) && com.google.android.gms.common.internal.G.k(this.f9807w, c0556y.f9807w) && com.google.android.gms.common.internal.G.k(this.f9808x, c0556y.f9808x) && com.google.android.gms.common.internal.G.k(this.f9809y, c0556y.f9809y)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9799a, this.f9800b, Integer.valueOf(Arrays.hashCode(this.f9801c)), this.f9802d, this.f9803e, this.f9804f, this.f9805u, this.f9806v, this.f9807w, this.f9808x, this.f9809y});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int M3 = com.bumptech.glide.d.M(20293, parcel);
        com.bumptech.glide.d.G(parcel, 2, this.f9799a, i7, false);
        com.bumptech.glide.d.G(parcel, 3, this.f9800b, i7, false);
        com.bumptech.glide.d.A(parcel, 4, this.f9801c, false);
        com.bumptech.glide.d.L(parcel, 5, this.f9802d, false);
        com.bumptech.glide.d.B(parcel, 6, this.f9803e);
        com.bumptech.glide.d.L(parcel, 7, this.f9804f, false);
        com.bumptech.glide.d.G(parcel, 8, this.f9805u, i7, false);
        com.bumptech.glide.d.E(parcel, 9, this.f9806v);
        com.bumptech.glide.d.G(parcel, 10, this.f9807w, i7, false);
        EnumC0537e enumC0537e = this.f9808x;
        com.bumptech.glide.d.H(parcel, 11, enumC0537e == null ? null : enumC0537e.f9746a, false);
        com.bumptech.glide.d.G(parcel, 12, this.f9809y, i7, false);
        com.bumptech.glide.d.N(M3, parcel);
    }
}
