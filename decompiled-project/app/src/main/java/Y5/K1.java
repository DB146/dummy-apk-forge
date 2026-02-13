package Y5;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class K1 extends G5.a {
    public static final Parcelable.Creator<K1> CREATOR = new U5.a0(28);

    /* renamed from: a, reason: collision with root package name */
    public final int f11428a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11429b;

    /* renamed from: c, reason: collision with root package name */
    public final long f11430c;

    /* renamed from: d, reason: collision with root package name */
    public final Long f11431d;

    /* renamed from: e, reason: collision with root package name */
    public final String f11432e;

    /* renamed from: f, reason: collision with root package name */
    public final String f11433f;

    /* renamed from: u, reason: collision with root package name */
    public final Double f11434u;

    public K1(int i7, String str, long j, Long l10, Float f4, String str2, String str3, Double d10) {
        this.f11428a = i7;
        this.f11429b = str;
        this.f11430c = j;
        this.f11431d = l10;
        this.f11434u = i7 == 1 ? f4 != null ? Double.valueOf(f4.doubleValue()) : null : d10;
        this.f11432e = str2;
        this.f11433f = str3;
    }

    public K1(long j, Object obj, String str, String str2) {
        com.google.android.gms.common.internal.G.d(str);
        this.f11428a = 2;
        this.f11429b = str;
        this.f11430c = j;
        this.f11433f = str2;
        if (obj == null) {
            this.f11431d = null;
            this.f11434u = null;
            this.f11432e = null;
            return;
        }
        if (obj instanceof Long) {
            this.f11431d = (Long) obj;
            this.f11434u = null;
            this.f11432e = null;
        } else if (obj instanceof String) {
            this.f11431d = null;
            this.f11434u = null;
            this.f11432e = (String) obj;
        } else {
            if (!(obj instanceof Double)) {
                throw new IllegalArgumentException("User attribute given of un-supported type");
            }
            this.f11431d = null;
            this.f11434u = (Double) obj;
            this.f11432e = null;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public K1(L1 l12) {
        this(l12.f11444d, l12.f11445e, r4, l12.f11442b);
        String str = l12.f11443c;
    }

    public final Object t() {
        Long l10 = this.f11431d;
        if (l10 != null) {
            return l10;
        }
        Double d10 = this.f11434u;
        if (d10 != null) {
            return d10;
        }
        String str = this.f11432e;
        if (str != null) {
            return str;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        U5.a0.b(this, parcel);
    }
}
