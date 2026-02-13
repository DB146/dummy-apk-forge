package A4;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f369a;

    /* renamed from: b, reason: collision with root package name */
    public int f370b;

    /* renamed from: c, reason: collision with root package name */
    public int f371c;

    /* renamed from: d, reason: collision with root package name */
    public long f372d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f373e;

    /* renamed from: f, reason: collision with root package name */
    public final n5.v f374f;
    public final n5.v g;

    /* renamed from: h, reason: collision with root package name */
    public int f375h;

    /* renamed from: i, reason: collision with root package name */
    public int f376i;

    public d(n5.v vVar, n5.v vVar2, boolean z8) {
        this.g = vVar;
        this.f374f = vVar2;
        this.f373e = z8;
        vVar2.G(12);
        this.f369a = vVar2.y();
        vVar.G(12);
        this.f376i = vVar.y();
        q3.f.g("first_chunk must be 1", vVar.h() == 1);
        this.f370b = -1;
    }

    public final boolean a() {
        int i7 = this.f370b + 1;
        this.f370b = i7;
        if (i7 == this.f369a) {
            return false;
        }
        boolean z8 = this.f373e;
        n5.v vVar = this.f374f;
        this.f372d = z8 ? vVar.z() : vVar.w();
        if (this.f370b == this.f375h) {
            n5.v vVar2 = this.g;
            this.f371c = vVar2.y();
            vVar2.H(4);
            int i10 = this.f376i - 1;
            this.f376i = i10;
            this.f375h = i10 > 0 ? vVar2.y() - 1 : -1;
        }
        return true;
    }
}
