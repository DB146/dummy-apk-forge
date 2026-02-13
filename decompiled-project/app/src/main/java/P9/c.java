package P9;

import A9.N2;
import Ab.e;
import Db.o;
import U9.k;
import com.kt.apps.core.storage.local.RoomDataBase;
import hb.InterfaceC1269b;
import hb.InterfaceC1270c;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.l;
import lb.CallableC1516a;
import ob.C1833a;
import ob.C1842j;
import ob.m;
import qb.g;
import qb.q;
import t8.C2034c;
import vb.C2170d;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final RoomDataBase f8255a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1270c f8256b;

    /* renamed from: c, reason: collision with root package name */
    public final o f8257c;

    /* renamed from: d, reason: collision with root package name */
    public final o f8258d;

    public c(RoomDataBase roomDataBase, InterfaceC1270c disposable) {
        l.e(roomDataBase, "roomDataBase");
        l.e(disposable, "disposable");
        this.f8255a = roomDataBase;
        this.f8256b = disposable;
        this.f8257c = android.support.v4.media.session.b.z(new N2(this, 14));
        this.f8258d = android.support.v4.media.session.b.z(new I9.a(22));
    }

    public final void a(W9.c cVar, long j) {
        U9.l lVar = (U9.l) this.f8257c.getValue();
        lVar.getClass();
        String itemId = cVar.f10858a;
        l.e(itemId, "itemId");
        String streamLink = cVar.f10865i;
        l.e(streamLink, "streamLink");
        tb.b k = android.support.v4.media.session.b.k(lVar.f9899a, true, new k(itemId, streamLink, lVar, 0));
        TimeUnit timeUnit = TimeUnit.SECONDS;
        C2170d c2170d = e.f1560b;
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(c2170d, "scheduler is null");
        C1842j e2 = new C1833a(3, new m(2, new q(new g(1, new tb.c(k, j, timeUnit, c2170d), new C2034c(cVar, 28)), new CallableC1516a(cVar), 1), cVar), new q3.c(18, cVar, this, false)).e(e.f1561c);
        F8.a aVar = new F8.a(5, this, cVar);
        nb.e eVar = new nb.e(0, new q3.e(17, this, cVar), aVar);
        e2.c(eVar);
        o oVar = this.f8258d;
        InterfaceC1269b interfaceC1269b = (InterfaceC1269b) ((Map) oVar.getValue()).get(itemId);
        if (interfaceC1269b != null) {
            interfaceC1269b.b();
        }
        ((Map) oVar.getValue()).put(itemId, eVar);
        this.f8256b.d(eVar);
    }
}
