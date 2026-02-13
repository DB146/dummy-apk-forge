package J;

import K0.C0371a;
import K0.F;
import K0.o;
import V0.l;
import y0.InterfaceC2318C;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public String f5383a;

    /* renamed from: b, reason: collision with root package name */
    public F f5384b;

    /* renamed from: c, reason: collision with root package name */
    public N0.d f5385c;

    /* renamed from: d, reason: collision with root package name */
    public int f5386d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f5387e;

    /* renamed from: f, reason: collision with root package name */
    public int f5388f;
    public int g;

    /* renamed from: i, reason: collision with root package name */
    public InterfaceC2318C f5390i;
    public C0371a j;
    public boolean k;

    /* renamed from: l, reason: collision with root package name */
    public long f5391l;

    /* renamed from: m, reason: collision with root package name */
    public b f5392m;

    /* renamed from: n, reason: collision with root package name */
    public o f5393n;

    /* renamed from: o, reason: collision with root package name */
    public l f5394o;

    /* renamed from: h, reason: collision with root package name */
    public long f5389h = a.f5372a;

    /* renamed from: p, reason: collision with root package name */
    public long f5395p = V0.b.g(0, 0, 0, 0);

    public d(String str, F f4, N0.d dVar, int i7, boolean z8, int i10, int i11) {
        this.f5383a = str;
        this.f5384b = f4;
        this.f5385c = dVar;
        this.f5386d = i7;
        this.f5387e = z8;
        this.f5388f = i10;
        this.g = i11;
        long j = 0;
        this.f5391l = (j & 4294967295L) | (j << 32);
    }

    public final void a() {
        this.j = null;
        this.f5393n = null;
        this.f5394o = null;
        this.f5395p = V0.b.g(0, 0, 0, 0);
        long j = 0;
        this.f5391l = (j & 4294967295L) | (j << 32);
        this.k = false;
    }

    public final void b(InterfaceC2318C interfaceC2318C) {
        long j;
        InterfaceC2318C interfaceC2318C2 = this.f5390i;
        if (interfaceC2318C != null) {
            int i7 = a.f5373b;
            j = a.a(interfaceC2318C.k(), interfaceC2318C.f());
        } else {
            j = a.f5372a;
        }
        if (interfaceC2318C2 == null) {
            this.f5390i = interfaceC2318C;
            this.f5389h = j;
        } else if (interfaceC2318C == null || this.f5389h != j) {
            this.f5390i = interfaceC2318C;
            this.f5389h = j;
            a();
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ParagraphLayoutCache(paragraph=");
        sb2.append(this.j != null ? "<paragraph>" : "null");
        sb2.append(", lastDensity=");
        long j = this.f5389h;
        int i7 = a.f5373b;
        sb2.append((Object) ("InlineDensity(density=" + Float.intBitsToFloat((int) (j >> 32)) + ", fontScale=" + Float.intBitsToFloat((int) (j & 4294967295L)) + ')'));
        sb2.append(')');
        return sb2.toString();
    }
}
