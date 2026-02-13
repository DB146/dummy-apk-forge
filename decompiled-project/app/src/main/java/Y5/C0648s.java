package Y5;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: Y5.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0648s extends G5.a {
    public static final Parcelable.Creator<C0648s> CREATOR = new U5.a0(23);

    /* renamed from: a, reason: collision with root package name */
    public final String f11929a;

    /* renamed from: b, reason: collision with root package name */
    public final r f11930b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11931c;

    /* renamed from: d, reason: collision with root package name */
    public final long f11932d;

    public C0648s(C0648s c0648s, long j) {
        com.google.android.gms.common.internal.G.g(c0648s);
        this.f11929a = c0648s.f11929a;
        this.f11930b = c0648s.f11930b;
        this.f11931c = c0648s.f11931c;
        this.f11932d = j;
    }

    public C0648s(String str, r rVar, String str2, long j) {
        this.f11929a = str;
        this.f11930b = rVar;
        this.f11931c = str2;
        this.f11932d = j;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f11930b);
        String str = this.f11931c;
        int length = String.valueOf(str).length();
        String str2 = this.f11929a;
        StringBuilder sb2 = new StringBuilder(length + 13 + String.valueOf(str2).length() + 8 + valueOf.length());
        h3.o.v(sb2, "origin=", str, ",name=", str2);
        return h3.o.p(sb2, ",params=", valueOf);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        U5.a0.a(this, parcel, i7);
    }
}
