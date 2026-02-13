package V4;

import N6.H;
import N6.r;
import N6.y0;
import java.util.List;
import java.util.Map;
import r4.C1936h;

/* loaded from: classes.dex */
public final class i extends m {

    /* renamed from: d, reason: collision with root package name */
    public final int f10082d;

    /* renamed from: e, reason: collision with root package name */
    public final long f10083e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f10084f;
    public final boolean g;

    /* renamed from: h, reason: collision with root package name */
    public final long f10085h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f10086i;
    public final int j;
    public final long k;

    /* renamed from: l, reason: collision with root package name */
    public final int f10087l;

    /* renamed from: m, reason: collision with root package name */
    public final long f10088m;

    /* renamed from: n, reason: collision with root package name */
    public final long f10089n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f10090o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f10091p;

    /* renamed from: q, reason: collision with root package name */
    public final C1936h f10092q;

    /* renamed from: r, reason: collision with root package name */
    public final H f10093r;

    /* renamed from: s, reason: collision with root package name */
    public final H f10094s;

    /* renamed from: t, reason: collision with root package name */
    public final y0 f10095t;

    /* renamed from: u, reason: collision with root package name */
    public final long f10096u;

    /* renamed from: v, reason: collision with root package name */
    public final h f10097v;

    public i(int i7, String str, List list, long j, boolean z8, long j10, boolean z10, int i10, long j11, int i11, long j12, long j13, boolean z11, boolean z12, boolean z13, C1936h c1936h, List list2, List list3, h hVar, Map map) {
        super(str, list, z11);
        this.f10082d = i7;
        this.f10085h = j10;
        this.g = z8;
        this.f10086i = z10;
        this.j = i10;
        this.k = j11;
        this.f10087l = i11;
        this.f10088m = j12;
        this.f10089n = j13;
        this.f10090o = z12;
        this.f10091p = z13;
        this.f10092q = c1936h;
        this.f10093r = H.F(list2);
        this.f10094s = H.F(list3);
        this.f10095t = y0.b(map);
        if (!list3.isEmpty()) {
            d dVar = (d) r.l(list3);
            this.f10096u = dVar.f10070e + dVar.f10068c;
        } else if (list2.isEmpty()) {
            this.f10096u = 0L;
        } else {
            f fVar = (f) r.l(list2);
            this.f10096u = fVar.f10070e + fVar.f10068c;
        }
        this.f10083e = j != -9223372036854775807L ? j >= 0 ? Math.min(this.f10096u, j) : Math.max(0L, this.f10096u + j) : -9223372036854775807L;
        this.f10084f = j >= 0;
        this.f10097v = hVar;
    }

    @Override // O4.a
    public final Object a(List list) {
        return this;
    }
}
