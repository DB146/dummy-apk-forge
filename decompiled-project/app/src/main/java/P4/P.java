package P4;

import A0.G0;
import F.C0257a;
import android.net.Uri;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.Map;
import m5.C1619p;
import m5.InterfaceC1603G;
import m5.InterfaceC1616m;
import n5.AbstractC1705a;
import s4.C1979g;
import s4.InterfaceC1982j;
import z4.C2591d;

/* loaded from: classes.dex */
public final class P implements InterfaceC1603G {

    /* renamed from: A, reason: collision with root package name */
    public final /* synthetic */ T f7894A;

    /* renamed from: a, reason: collision with root package name */
    public final Uri f7895a;

    /* renamed from: b, reason: collision with root package name */
    public final m5.S f7896b;

    /* renamed from: c, reason: collision with root package name */
    public final G0 f7897c;

    /* renamed from: d, reason: collision with root package name */
    public final T f7898d;

    /* renamed from: e, reason: collision with root package name */
    public final N7.a f7899e;

    /* renamed from: u, reason: collision with root package name */
    public volatile boolean f7901u;

    /* renamed from: w, reason: collision with root package name */
    public long f7903w;

    /* renamed from: x, reason: collision with root package name */
    public C1619p f7904x;

    /* renamed from: y, reason: collision with root package name */
    public c0 f7905y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f7906z;

    /* renamed from: f, reason: collision with root package name */
    public final C0257a f7900f = new Object();

    /* renamed from: v, reason: collision with root package name */
    public boolean f7902v = true;

    /* JADX WARN: Type inference failed for: r1v2, types: [F.a, java.lang.Object] */
    public P(T t5, Uri uri, InterfaceC1616m interfaceC1616m, G0 g02, T t10, N7.a aVar) {
        this.f7894A = t5;
        this.f7895a = uri;
        this.f7896b = new m5.S(interfaceC1616m);
        this.f7897c = g02;
        this.f7898d = t10;
        this.f7899e = aVar;
        r.f8129b.getAndIncrement();
        this.f7904x = a(0L);
    }

    public final C1619p a(long j) {
        Collections.emptyMap();
        String str = this.f7894A.f7946w;
        Map map = T.f7911a0;
        Uri uri = this.f7895a;
        AbstractC1705a.o(uri, "The uri must be set.");
        return new C1619p(uri, 1, null, map, j, -1L, str, 6);
    }

    @Override // m5.InterfaceC1603G
    public final void b() {
        InterfaceC1616m interfaceC1616m;
        int i7;
        int i10 = 0;
        while (i10 == 0 && !this.f7901u) {
            try {
                long j = this.f7900f.f3957a;
                C1619p a9 = a(j);
                this.f7904x = a9;
                long d10 = this.f7896b.d(a9);
                if (d10 != -1) {
                    d10 += j;
                    T t5 = this.f7894A;
                    t5.f7916D.post(new O(t5, 2));
                }
                long j10 = d10;
                this.f7894A.f7918F = J4.b.a(this.f7896b.f20579a.n());
                m5.S s3 = this.f7896b;
                J4.b bVar = this.f7894A.f7918F;
                if (bVar == null || (i7 = bVar.f5522f) == -1) {
                    interfaceC1616m = s3;
                } else {
                    interfaceC1616m = new C0469q(s3, i7, this);
                    T t10 = this.f7894A;
                    t10.getClass();
                    c0 C2 = t10.C(new S(0, true));
                    this.f7905y = C2;
                    C2.a(T.f7912b0);
                }
                long j11 = j;
                this.f7897c.L(interfaceC1616m, this.f7895a, this.f7896b.f20579a.n(), j, j10, this.f7898d);
                if (this.f7894A.f7918F != null) {
                    InterfaceC1982j interfaceC1982j = (InterfaceC1982j) this.f7897c.f28c;
                    if (interfaceC1982j instanceof C2591d) {
                        ((C2591d) interfaceC1982j).f28262q = true;
                    }
                }
                if (this.f7902v) {
                    G0 g02 = this.f7897c;
                    long j12 = this.f7903w;
                    InterfaceC1982j interfaceC1982j2 = (InterfaceC1982j) g02.f28c;
                    interfaceC1982j2.getClass();
                    interfaceC1982j2.a(j11, j12);
                    this.f7902v = false;
                }
                while (true) {
                    long j13 = j11;
                    while (i10 == 0 && !this.f7901u) {
                        try {
                            N7.a aVar = this.f7899e;
                            synchronized (aVar) {
                                while (!aVar.f7385a) {
                                    aVar.wait();
                                }
                            }
                            G0 g03 = this.f7897c;
                            C0257a c0257a = this.f7900f;
                            InterfaceC1982j interfaceC1982j3 = (InterfaceC1982j) g03.f28c;
                            interfaceC1982j3.getClass();
                            C1979g c1979g = (C1979g) g03.f29d;
                            c1979g.getClass();
                            i10 = interfaceC1982j3.e(c1979g, c0257a);
                            j11 = this.f7897c.H();
                            if (j11 > this.f7894A.f7947x + j13) {
                                break;
                            }
                        } catch (InterruptedException unused) {
                            throw new InterruptedIOException();
                        }
                    }
                    this.f7899e.a();
                    T t11 = this.f7894A;
                    t11.f7916D.post(t11.f7915C);
                }
                if (i10 == 1) {
                    i10 = 0;
                } else if (this.f7897c.H() != -1) {
                    this.f7900f.f3957a = this.f7897c.H();
                }
                c2.i.f(this.f7896b);
            } catch (Throwable th) {
                if (i10 != 1 && this.f7897c.H() != -1) {
                    this.f7900f.f3957a = this.f7897c.H();
                }
                c2.i.f(this.f7896b);
                throw th;
            }
        }
    }

    @Override // m5.InterfaceC1603G
    public final void d() {
        this.f7901u = true;
    }
}
