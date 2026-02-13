package Y5;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: Y5.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0609e extends G5.a {
    public static final Parcelable.Creator<C0609e> CREATOR = new U5.a0(20);

    /* renamed from: a, reason: collision with root package name */
    public String f11711a;

    /* renamed from: b, reason: collision with root package name */
    public String f11712b;

    /* renamed from: c, reason: collision with root package name */
    public K1 f11713c;

    /* renamed from: d, reason: collision with root package name */
    public long f11714d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f11715e;

    /* renamed from: f, reason: collision with root package name */
    public String f11716f;

    /* renamed from: u, reason: collision with root package name */
    public final C0648s f11717u;

    /* renamed from: v, reason: collision with root package name */
    public long f11718v;

    /* renamed from: w, reason: collision with root package name */
    public C0648s f11719w;

    /* renamed from: x, reason: collision with root package name */
    public final long f11720x;

    /* renamed from: y, reason: collision with root package name */
    public final C0648s f11721y;

    public C0609e(C0609e c0609e) {
        com.google.android.gms.common.internal.G.g(c0609e);
        this.f11711a = c0609e.f11711a;
        this.f11712b = c0609e.f11712b;
        this.f11713c = c0609e.f11713c;
        this.f11714d = c0609e.f11714d;
        this.f11715e = c0609e.f11715e;
        this.f11716f = c0609e.f11716f;
        this.f11717u = c0609e.f11717u;
        this.f11718v = c0609e.f11718v;
        this.f11719w = c0609e.f11719w;
        this.f11720x = c0609e.f11720x;
        this.f11721y = c0609e.f11721y;
    }

    public C0609e(String str, String str2, K1 k12, long j, boolean z8, String str3, C0648s c0648s, long j10, C0648s c0648s2, long j11, C0648s c0648s3) {
        this.f11711a = str;
        this.f11712b = str2;
        this.f11713c = k12;
        this.f11714d = j;
        this.f11715e = z8;
        this.f11716f = str3;
        this.f11717u = c0648s;
        this.f11718v = j10;
        this.f11719w = c0648s2;
        this.f11720x = j11;
        this.f11721y = c0648s3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int M3 = com.bumptech.glide.d.M(20293, parcel);
        com.bumptech.glide.d.H(parcel, 2, this.f11711a, false);
        com.bumptech.glide.d.H(parcel, 3, this.f11712b, false);
        com.bumptech.glide.d.G(parcel, 4, this.f11713c, i7, false);
        long j = this.f11714d;
        com.bumptech.glide.d.O(parcel, 5, 8);
        parcel.writeLong(j);
        boolean z8 = this.f11715e;
        com.bumptech.glide.d.O(parcel, 6, 4);
        parcel.writeInt(z8 ? 1 : 0);
        com.bumptech.glide.d.H(parcel, 7, this.f11716f, false);
        com.bumptech.glide.d.G(parcel, 8, this.f11717u, i7, false);
        long j10 = this.f11718v;
        com.bumptech.glide.d.O(parcel, 9, 8);
        parcel.writeLong(j10);
        com.bumptech.glide.d.G(parcel, 10, this.f11719w, i7, false);
        com.bumptech.glide.d.O(parcel, 11, 8);
        parcel.writeLong(this.f11720x);
        com.bumptech.glide.d.G(parcel, 12, this.f11721y, i7, false);
        com.bumptech.glide.d.N(M3, parcel);
    }
}
