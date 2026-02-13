package Y5;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class O1 extends G5.a {
    public static final Parcelable.Creator<O1> CREATOR = new U5.a0(29);

    /* renamed from: A, reason: collision with root package name */
    public final int f11488A;

    /* renamed from: B, reason: collision with root package name */
    public final boolean f11489B;

    /* renamed from: C, reason: collision with root package name */
    public final boolean f11490C;

    /* renamed from: D, reason: collision with root package name */
    public final Boolean f11491D;

    /* renamed from: E, reason: collision with root package name */
    public final long f11492E;

    /* renamed from: F, reason: collision with root package name */
    public final List f11493F;

    /* renamed from: G, reason: collision with root package name */
    public final String f11494G;

    /* renamed from: H, reason: collision with root package name */
    public final String f11495H;

    /* renamed from: I, reason: collision with root package name */
    public final String f11496I;

    /* renamed from: J, reason: collision with root package name */
    public final boolean f11497J;

    /* renamed from: K, reason: collision with root package name */
    public final long f11498K;
    public final int L;

    /* renamed from: M, reason: collision with root package name */
    public final String f11499M;

    /* renamed from: N, reason: collision with root package name */
    public final int f11500N;

    /* renamed from: O, reason: collision with root package name */
    public final long f11501O;

    /* renamed from: P, reason: collision with root package name */
    public final String f11502P;

    /* renamed from: Q, reason: collision with root package name */
    public final String f11503Q;

    /* renamed from: R, reason: collision with root package name */
    public final long f11504R;

    /* renamed from: S, reason: collision with root package name */
    public final int f11505S;

    /* renamed from: a, reason: collision with root package name */
    public final String f11506a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11507b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11508c;

    /* renamed from: d, reason: collision with root package name */
    public final String f11509d;

    /* renamed from: e, reason: collision with root package name */
    public final long f11510e;

    /* renamed from: f, reason: collision with root package name */
    public final long f11511f;

    /* renamed from: u, reason: collision with root package name */
    public final String f11512u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f11513v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f11514w;

    /* renamed from: x, reason: collision with root package name */
    public final long f11515x;

    /* renamed from: y, reason: collision with root package name */
    public final String f11516y;

    /* renamed from: z, reason: collision with root package name */
    public final long f11517z;

    public O1(String str, String str2, String str3, long j, String str4, long j10, long j11, String str5, boolean z8, boolean z10, String str6, long j12, int i7, boolean z11, boolean z12, Boolean bool, long j13, List list, String str7, String str8, String str9, boolean z13, long j14, int i10, String str10, int i11, long j15, String str11, String str12, long j16, int i12) {
        com.google.android.gms.common.internal.G.d(str);
        this.f11506a = str;
        this.f11507b = true == TextUtils.isEmpty(str2) ? null : str2;
        this.f11508c = str3;
        this.f11515x = j;
        this.f11509d = str4;
        this.f11510e = j10;
        this.f11511f = j11;
        this.f11512u = str5;
        this.f11513v = z8;
        this.f11514w = z10;
        this.f11516y = str6;
        this.f11517z = j12;
        this.f11488A = i7;
        this.f11489B = z11;
        this.f11490C = z12;
        this.f11491D = bool;
        this.f11492E = j13;
        this.f11493F = list;
        this.f11494G = str7;
        this.f11495H = str8;
        this.f11496I = str9;
        this.f11497J = z13;
        this.f11498K = j14;
        this.L = i10;
        this.f11499M = str10;
        this.f11500N = i11;
        this.f11501O = j15;
        this.f11502P = str11;
        this.f11503Q = str12;
        this.f11504R = j16;
        this.f11505S = i12;
    }

    public O1(String str, String str2, String str3, String str4, long j, long j10, String str5, boolean z8, boolean z10, long j11, String str6, long j12, int i7, boolean z11, boolean z12, Boolean bool, long j13, ArrayList arrayList, String str7, String str8, String str9, boolean z13, long j14, int i10, String str10, int i11, long j15, String str11, String str12, long j16, int i12) {
        this.f11506a = str;
        this.f11507b = str2;
        this.f11508c = str3;
        this.f11515x = j11;
        this.f11509d = str4;
        this.f11510e = j;
        this.f11511f = j10;
        this.f11512u = str5;
        this.f11513v = z8;
        this.f11514w = z10;
        this.f11516y = str6;
        this.f11517z = j12;
        this.f11488A = i7;
        this.f11489B = z11;
        this.f11490C = z12;
        this.f11491D = bool;
        this.f11492E = j13;
        this.f11493F = arrayList;
        this.f11494G = str7;
        this.f11495H = str8;
        this.f11496I = str9;
        this.f11497J = z13;
        this.f11498K = j14;
        this.L = i10;
        this.f11499M = str10;
        this.f11500N = i11;
        this.f11501O = j15;
        this.f11502P = str11;
        this.f11503Q = str12;
        this.f11504R = j16;
        this.f11505S = i12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int M3 = com.bumptech.glide.d.M(20293, parcel);
        com.bumptech.glide.d.H(parcel, 2, this.f11506a, false);
        com.bumptech.glide.d.H(parcel, 3, this.f11507b, false);
        com.bumptech.glide.d.H(parcel, 4, this.f11508c, false);
        com.bumptech.glide.d.H(parcel, 5, this.f11509d, false);
        com.bumptech.glide.d.O(parcel, 6, 8);
        parcel.writeLong(this.f11510e);
        com.bumptech.glide.d.O(parcel, 7, 8);
        parcel.writeLong(this.f11511f);
        com.bumptech.glide.d.H(parcel, 8, this.f11512u, false);
        com.bumptech.glide.d.O(parcel, 9, 4);
        parcel.writeInt(this.f11513v ? 1 : 0);
        com.bumptech.glide.d.O(parcel, 10, 4);
        parcel.writeInt(this.f11514w ? 1 : 0);
        com.bumptech.glide.d.O(parcel, 11, 8);
        parcel.writeLong(this.f11515x);
        com.bumptech.glide.d.H(parcel, 12, this.f11516y, false);
        com.bumptech.glide.d.O(parcel, 14, 8);
        parcel.writeLong(this.f11517z);
        com.bumptech.glide.d.O(parcel, 15, 4);
        parcel.writeInt(this.f11488A);
        com.bumptech.glide.d.O(parcel, 16, 4);
        parcel.writeInt(this.f11489B ? 1 : 0);
        com.bumptech.glide.d.O(parcel, 18, 4);
        parcel.writeInt(this.f11490C ? 1 : 0);
        com.bumptech.glide.d.y(parcel, 21, this.f11491D);
        com.bumptech.glide.d.O(parcel, 22, 8);
        parcel.writeLong(this.f11492E);
        com.bumptech.glide.d.J(parcel, 23, this.f11493F);
        com.bumptech.glide.d.H(parcel, 25, this.f11494G, false);
        com.bumptech.glide.d.H(parcel, 26, this.f11495H, false);
        com.bumptech.glide.d.H(parcel, 27, this.f11496I, false);
        com.bumptech.glide.d.O(parcel, 28, 4);
        parcel.writeInt(this.f11497J ? 1 : 0);
        com.bumptech.glide.d.O(parcel, 29, 8);
        parcel.writeLong(this.f11498K);
        com.bumptech.glide.d.O(parcel, 30, 4);
        parcel.writeInt(this.L);
        com.bumptech.glide.d.H(parcel, 31, this.f11499M, false);
        com.bumptech.glide.d.O(parcel, 32, 4);
        parcel.writeInt(this.f11500N);
        com.bumptech.glide.d.O(parcel, 34, 8);
        parcel.writeLong(this.f11501O);
        com.bumptech.glide.d.H(parcel, 35, this.f11502P, false);
        com.bumptech.glide.d.H(parcel, 36, this.f11503Q, false);
        com.bumptech.glide.d.O(parcel, 37, 8);
        parcel.writeLong(this.f11504R);
        com.bumptech.glide.d.O(parcel, 38, 4);
        parcel.writeInt(this.f11505S);
        com.bumptech.glide.d.N(M3, parcel);
    }
}
