package n7;

import android.os.Parcel;
import android.os.Parcelable;
import ma.C1654e;

/* renamed from: n7.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1710a extends G5.a {
    public static final Parcelable.Creator<C1710a> CREATOR = new C1654e(11);

    /* renamed from: a, reason: collision with root package name */
    public final String f21267a;

    /* renamed from: b, reason: collision with root package name */
    public final String f21268b;

    /* renamed from: c, reason: collision with root package name */
    public final String f21269c;

    /* renamed from: d, reason: collision with root package name */
    public final String f21270d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f21271e;

    /* renamed from: f, reason: collision with root package name */
    public final String f21272f;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f21273u;

    /* renamed from: v, reason: collision with root package name */
    public final String f21274v;

    /* renamed from: w, reason: collision with root package name */
    public int f21275w;

    /* renamed from: x, reason: collision with root package name */
    public final String f21276x;

    /* renamed from: y, reason: collision with root package name */
    public final String f21277y;

    public C1710a(String str, String str2, String str3, String str4, boolean z8, String str5, boolean z10, String str6, int i7, String str7, String str8) {
        this.f21267a = str;
        this.f21268b = str2;
        this.f21269c = str3;
        this.f21270d = str4;
        this.f21271e = z8;
        this.f21272f = str5;
        this.f21273u = z10;
        this.f21274v = str6;
        this.f21275w = i7;
        this.f21276x = str7;
        this.f21277y = str8;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int M3 = com.bumptech.glide.d.M(20293, parcel);
        com.bumptech.glide.d.H(parcel, 1, this.f21267a, false);
        com.bumptech.glide.d.H(parcel, 2, this.f21268b, false);
        com.bumptech.glide.d.H(parcel, 3, this.f21269c, false);
        com.bumptech.glide.d.H(parcel, 4, this.f21270d, false);
        com.bumptech.glide.d.O(parcel, 5, 4);
        parcel.writeInt(this.f21271e ? 1 : 0);
        com.bumptech.glide.d.H(parcel, 6, this.f21272f, false);
        com.bumptech.glide.d.O(parcel, 7, 4);
        parcel.writeInt(this.f21273u ? 1 : 0);
        com.bumptech.glide.d.H(parcel, 8, this.f21274v, false);
        int i10 = this.f21275w;
        com.bumptech.glide.d.O(parcel, 9, 4);
        parcel.writeInt(i10);
        com.bumptech.glide.d.H(parcel, 10, this.f21276x, false);
        com.bumptech.glide.d.H(parcel, 11, this.f21277y, false);
        com.bumptech.glide.d.N(M3, parcel);
    }
}
