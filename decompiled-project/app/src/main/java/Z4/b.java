package Z4;

import java.util.ArrayList;
import m4.L;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f12152a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12153b;

    /* renamed from: c, reason: collision with root package name */
    public final long f12154c;

    /* renamed from: d, reason: collision with root package name */
    public final String f12155d;

    /* renamed from: e, reason: collision with root package name */
    public final int f12156e;

    /* renamed from: f, reason: collision with root package name */
    public final int f12157f;
    public final int g;

    /* renamed from: h, reason: collision with root package name */
    public final int f12158h;

    /* renamed from: i, reason: collision with root package name */
    public final String f12159i;
    public final L[] j;
    public final int k;

    /* renamed from: l, reason: collision with root package name */
    public final String f12160l;

    /* renamed from: m, reason: collision with root package name */
    public final String f12161m;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f12162n;

    /* renamed from: o, reason: collision with root package name */
    public final long[] f12163o;

    /* renamed from: p, reason: collision with root package name */
    public final long f12164p;

    public b(String str, String str2, int i7, String str3, long j, String str4, int i10, int i11, int i12, int i13, String str5, L[] lArr, ArrayList arrayList, long[] jArr, long j10) {
        this.f12160l = str;
        this.f12161m = str2;
        this.f12152a = i7;
        this.f12153b = str3;
        this.f12154c = j;
        this.f12155d = str4;
        this.f12156e = i10;
        this.f12157f = i11;
        this.g = i12;
        this.f12158h = i13;
        this.f12159i = str5;
        this.j = lArr;
        this.f12162n = arrayList;
        this.f12163o = jArr;
        this.f12164p = j10;
        this.k = arrayList.size();
    }

    public final b a(L[] lArr) {
        long[] jArr = this.f12163o;
        return new b(this.f12160l, this.f12161m, this.f12152a, this.f12153b, this.f12154c, this.f12155d, this.f12156e, this.f12157f, this.g, this.f12158h, this.f12159i, lArr, this.f12162n, jArr, this.f12164p);
    }

    public final long b(int i7) {
        if (i7 == this.k - 1) {
            return this.f12164p;
        }
        long[] jArr = this.f12163o;
        return jArr[i7 + 1] - jArr[i7];
    }
}
