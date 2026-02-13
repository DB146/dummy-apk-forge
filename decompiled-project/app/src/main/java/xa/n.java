package xa;

import Eb.B;
import Y5.A;
import l2.H;
import ma.C1651b;
import ma.EnumC1650a;
import y9.C;
import y9.G;

/* loaded from: classes2.dex */
public final class n extends C {

    /* renamed from: a, reason: collision with root package name */
    public final f f26308a;

    /* renamed from: b, reason: collision with root package name */
    public final Db.o f26309b = android.support.v4.media.session.b.z(new wa.f(5));

    /* renamed from: c, reason: collision with root package name */
    public final Db.o f26310c = android.support.v4.media.session.b.z(new wa.f(6));

    public n(f fVar) {
        this.f26308a = fVar;
    }

    public final void a() {
        f fVar = this.f26308a;
        Object cacheData = fVar.f26292a.getCacheData();
        na.b bVar = fVar.f26292a;
        if (cacheData != null) {
            H d10 = d();
            Object cacheData2 = bVar.getCacheData();
            kotlin.jvm.internal.l.b(cacheData2);
            d10.l(new G(cacheData2));
            return;
        }
        d().l(new Object());
        gb.i execute = bVar.execute(B.G(new Db.j("extra:source_from", EnumC1650a.f20812a)));
        k kVar = new k(this, 0);
        l lVar = new l(this, 0);
        A a9 = lb.b.f19614c;
        execute.getClass();
        nb.h hVar = new nb.h(kVar, lVar, a9);
        execute.b(hVar);
        add(hVar);
    }

    public final void b(C1651b footballMatch) {
        kotlin.jvm.internal.l.e(footballMatch, "footballMatch");
        c().l(new Object());
        gb.i a9 = this.f26308a.f26293b.a(footballMatch);
        m mVar = new m(this, 0);
        k kVar = new k(this, 1);
        A a10 = lb.b.f19614c;
        a9.getClass();
        nb.h hVar = new nb.h(mVar, kVar, a10);
        a9.b(hVar);
        add(hVar);
    }

    public final H c() {
        return (H) this.f26310c.getValue();
    }

    public final H d() {
        return (H) this.f26309b.getValue();
    }
}
