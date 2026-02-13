package Ba;

import A9.C0163z1;
import A9.N2;
import Eb.B;
import Y5.A;
import com.kt.apps.core.storage.local.RoomDataBase;
import com.kt.apps.core.tv.usecase.GetChannelLinkStreamById;
import hb.InterfaceC1269b;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import l2.H;
import vb.C2170d;
import y9.C;
import y9.E;

/* loaded from: classes2.dex */
public final class h extends C {

    /* renamed from: a, reason: collision with root package name */
    public final RoomDataBase f2250a;

    /* renamed from: b, reason: collision with root package name */
    public final ha.i f2251b;

    /* renamed from: c, reason: collision with root package name */
    public final O9.a f2252c;

    /* renamed from: d, reason: collision with root package name */
    public final GetChannelLinkStreamById f2253d;

    /* renamed from: e, reason: collision with root package name */
    public final Db.o f2254e;

    /* renamed from: f, reason: collision with root package name */
    public InterfaceC1269b f2255f;
    public String g;

    /* renamed from: h, reason: collision with root package name */
    public final Db.o f2256h;

    /* renamed from: i, reason: collision with root package name */
    public final Db.o f2257i;
    public AtomicReference j;
    public final Db.o k;

    public h(RoomDataBase roomDataBase, ha.i iVar, O9.a aVar, GetChannelLinkStreamById getChannelLinkStreamById) {
        kotlin.jvm.internal.l.e(roomDataBase, "roomDataBase");
        this.f2250a = roomDataBase;
        this.f2251b = iVar;
        this.f2252c = aVar;
        this.f2253d = getChannelLinkStreamById;
        this.f2254e = android.support.v4.media.session.b.z(new C0163z1(7));
        this.f2256h = android.support.v4.media.session.b.z(new N2(this, 3));
        this.f2257i = android.support.v4.media.session.b.z(new C0163z1(8));
        this.k = android.support.v4.media.session.b.z(new C0163z1(9));
    }

    public static void d(h hVar) {
        String str = hVar.g;
        if ((str == null || ac.g.h0(str)) && hVar.g == null) {
            e(hVar, "", null, 6);
        }
    }

    public static void e(h hVar, String str, String str2, int i7) {
        if ((i7 & 2) != 0) {
            str2 = null;
        }
        if (str == null) {
            hVar.getClass();
            return;
        }
        String str3 = hVar.g;
        if (kotlin.jvm.internal.l.a(str3 != null ? ac.g.v0(str3).toString() : null, ac.g.v0(str).toString()) && (hVar.b().d() instanceof E)) {
            return;
        }
        hVar.b().l(new Object());
        hVar.g = str;
        InterfaceC1269b interfaceC1269b = hVar.f2255f;
        if (interfaceC1269b != null) {
            interfaceC1269b.b();
            hVar.getCompositeDisposable().c(interfaceC1269b);
        }
        ha.i iVar = hVar.f2251b;
        iVar.getClass();
        String lowerCase = str.toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.l.d(lowerCase, "toLowerCase(...)");
        Db.j jVar = new Db.j("extra:query", lowerCase);
        Db.j jVar2 = new Db.j("extra:limit", 1500);
        Db.j jVar3 = new Db.j("extra:offset", 0);
        if (str2 == null) {
            str2 = "";
        }
        qb.r h10 = iVar.h(B.H(jVar, jVar2, jVar3, new Db.j("extra:filter", str2)));
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        C2170d c2170d = Ab.e.f1560b;
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(c2170d, "scheduler is null");
        qb.f fVar = new qb.f(h10, Math.max(0L, 300L), timeUnit, c2170d);
        A1.d dVar = new A1.d(hVar, 5);
        Y5.B b2 = lb.b.f19615d;
        A a9 = lb.b.f19614c;
        qb.r rVar = new qb.r(new qb.r(fVar, b2, b2, a9, dVar), new d(hVar, 3), b2, a9, a9);
        qb.b bVar = new qb.b(new e(hVar, 3), new c(hVar, 4));
        rVar.b(bVar);
        hVar.f2255f = bVar;
        hVar.add(bVar);
    }

    public final b a() {
        return (b) this.f2256h.getValue();
    }

    public final H b() {
        return (H) this.f2254e.getValue();
    }

    public final H c() {
        return (H) this.f2257i.getValue();
    }
}
