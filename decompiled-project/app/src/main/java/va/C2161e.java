package va;

import A0.G0;
import A9.C0163z1;
import com.kt.apps.core.storage.local.RoomDataBase;
import fa.C1146a;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.Map;
import l2.AbstractC1456G;
import mb.InterfaceC1655a;
import y7.u0;

/* renamed from: va.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2161e extends y9.C {

    /* renamed from: a, reason: collision with root package name */
    public final M9.t f25314a;

    /* renamed from: b, reason: collision with root package name */
    public final RoomDataBase f25315b;

    /* renamed from: c, reason: collision with root package name */
    public final fa.b f25316c;

    /* renamed from: d, reason: collision with root package name */
    public final O9.a f25317d;

    /* renamed from: e, reason: collision with root package name */
    public final R9.a f25318e;

    /* renamed from: f, reason: collision with root package name */
    public final I9.j f25319f;
    public final Db.o g = android.support.v4.media.session.b.z(new C0163z1(26));

    /* renamed from: h, reason: collision with root package name */
    public final Db.o f25320h = android.support.v4.media.session.b.z(new C0163z1(27));

    /* renamed from: i, reason: collision with root package name */
    public final Db.o f25321i;
    public l2.H j;
    public final Db.o k;

    /* renamed from: l, reason: collision with root package name */
    public final Db.o f25322l;

    /* renamed from: m, reason: collision with root package name */
    public nb.h f25323m;

    /* renamed from: n, reason: collision with root package name */
    public final Db.o f25324n;

    /* renamed from: o, reason: collision with root package name */
    public M9.d f25325o;

    public C2161e(M9.t tVar, RoomDataBase roomDataBase, C1146a c1146a, fa.b bVar, O9.a aVar, R9.a aVar2, I9.j jVar) {
        this.f25314a = tVar;
        this.f25315b = roomDataBase;
        this.f25316c = bVar;
        this.f25317d = aVar;
        this.f25318e = aVar2;
        this.f25319f = jVar;
        c(true);
        this.f25321i = android.support.v4.media.session.b.z(new C0163z1(28));
        this.k = android.support.v4.media.session.b.z(new C0163z1(29));
        this.f25322l = android.support.v4.media.session.b.z(new I9.a(0));
        this.f25324n = android.support.v4.media.session.b.z(new I9.a(1));
    }

    public final l2.H a() {
        return (l2.H) this.f25324n.getValue();
    }

    public final l2.H b() {
        return (l2.H) this.g.getValue();
    }

    public final void c(boolean z8) {
        if (!z8 && (b().d() instanceof y9.G)) {
            b().l(b().d());
            return;
        }
        b().l(new Object());
        U9.h z10 = this.f25315b.z();
        z10.getClass();
        qb.q d10 = android.support.v4.media.session.b.i(z10.f9862a, new Ba.o(z10, 16)).d(Ab.e.f1561c);
        qb.b bVar = new qb.b(new I9.c(this, 1), new I9.e(this, 1));
        d10.b(bVar);
        add(bVar);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [l2.H, java.lang.Object, l2.G] */
    /* JADX WARN: Type inference failed for: r1v20, types: [l2.H, l2.G] */
    public final l2.H d(String configId) {
        kotlin.jvm.internal.l.e(configId, "configId");
        Db.o oVar = this.f25320h;
        if (((Map) oVar.getValue()).get(configId) != null) {
            Object obj = ((Map) oVar.getValue()).get(configId);
            kotlin.jvm.internal.l.b(obj);
            Collection collection = (Collection) ((WeakReference) obj).get();
            if (collection != null && !collection.isEmpty()) {
                Object obj2 = ((Map) oVar.getValue()).get(configId);
                kotlin.jvm.internal.l.b(obj2);
                Object obj3 = ((WeakReference) obj2).get();
                kotlin.jvm.internal.l.b(obj3);
                return new AbstractC1456G(new y9.G(obj3));
            }
        }
        ?? abstractC1456G = new AbstractC1456G();
        abstractC1456G.l(new Object());
        U9.h z8 = this.f25315b.z();
        z8.getClass();
        Object nVar = new qb.n(android.support.v4.media.session.b.i(z8.f9862a, new Aa.t(10, configId, z8)).d(Ab.e.f1561c), new I9.f(this), 0);
        pb.g gVar = new pb.g(nVar instanceof InterfaceC1655a ? ((InterfaceC1655a) nVar).a() : new ob.l(nVar, 2), I9.b.f5315e, 1);
        qb.b bVar = new qb.b(new G0(this, configId, (Object) abstractC1456G, 17), new q3.e(11, abstractC1456G, this));
        try {
            gVar.a(new pb.o(bVar, 0));
            add(bVar);
            return abstractC1456G;
        } catch (NullPointerException e2) {
            throw e2;
        } catch (Throwable th) {
            u0.L(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public final l2.H get_listProgramForChannel() {
        return (l2.H) this.f25322l.getValue();
    }

    public final l2.H get_programmeForChannelLiveData() {
        return (l2.H) this.k.getValue();
    }
}
