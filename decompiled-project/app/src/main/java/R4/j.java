package R4;

import m4.L;
import m5.C1619p;
import m5.InterfaceC1616m;
import m5.S;
import n5.AbstractC1705a;
import q3.s;
import s4.C1979g;

/* loaded from: classes.dex */
public final class j extends e {

    /* renamed from: A, reason: collision with root package name */
    public volatile boolean f8912A;

    /* renamed from: x, reason: collision with root package name */
    public final d f8913x;

    /* renamed from: y, reason: collision with root package name */
    public s f8914y;

    /* renamed from: z, reason: collision with root package name */
    public long f8915z;

    public j(InterfaceC1616m interfaceC1616m, C1619p c1619p, L l10, int i7, Object obj, d dVar) {
        super(interfaceC1616m, c1619p, 2, l10, i7, obj, -9223372036854775807L, -9223372036854775807L);
        this.f8913x = dVar;
    }

    @Override // m5.InterfaceC1603G
    public final void b() {
        if (this.f8915z == 0) {
            this.f8913x.a(this.f8914y, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            C1619p b2 = this.f8870b.b(this.f8915z);
            S s3 = this.f8877w;
            C1979g c1979g = new C1979g(s3, b2.f20632e, s3.d(b2));
            while (!this.f8912A) {
                try {
                    int e2 = this.f8913x.f8860a.e(c1979g, d.f8859x);
                    boolean z8 = false;
                    AbstractC1705a.m(e2 != 1);
                    if (e2 == 0) {
                        z8 = true;
                    }
                    if (!z8) {
                        break;
                    }
                } finally {
                    this.f8915z = c1979g.f24055d - this.f8870b.f20632e;
                }
            }
        } finally {
            c2.i.f(this.f8877w);
        }
    }

    @Override // m5.InterfaceC1603G
    public final void d() {
        this.f8912A = true;
    }
}
