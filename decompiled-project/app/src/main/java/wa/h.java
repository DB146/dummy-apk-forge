package wa;

import Db.o;
import U9.k;
import U9.w;
import W9.j;
import com.kt.apps.core.storage.local.RoomDataBase;
import com.kt.apps.core.tv.usecase.GetChannelLinkStreamById;
import com.kt.apps.media.xemtv.workers.TVRecommendationWorkers;
import ea.C1108c;
import h3.C1236B;
import h3.C1249k;
import i3.p;
import java.util.LinkedHashMap;
import java.util.Set;
import kb.EnumC1437b;
import kotlin.jvm.internal.l;
import l2.H;
import qb.q;
import y7.u0;

/* loaded from: classes2.dex */
public final class h extends I9.i {
    public final P9.b g;

    /* renamed from: h, reason: collision with root package name */
    public final RoomDataBase f25841h;

    /* renamed from: i, reason: collision with root package name */
    public final p f25842i;
    public qb.b j;
    public final o k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(P9.b _repository, RoomDataBase roomDataBase, GetChannelLinkStreamById getChannelLinkStreamById, p pVar) {
        super(_repository);
        l.e(_repository, "_repository");
        l.e(roomDataBase, "roomDataBase");
        this.g = _repository;
        this.f25841h = roomDataBase;
        this.f25842i = pVar;
        this.k = android.support.v4.media.session.b.z(new f(0));
    }

    public final void c(j item) {
        int i7 = 2;
        l.e(item, "item");
        qb.b bVar = this.j;
        if (bVar != null) {
            EnumC1437b.a(bVar);
        }
        int ordinal = item.g.ordinal();
        if (ordinal != 0 && ordinal != 1) {
            if (ordinal != 2) {
                throw new Db.d(1);
            }
            W9.i iVar = W9.i.f10890a;
            P9.b bVar2 = this.g;
            bVar2.getClass();
            String id = item.f10894a;
            l.e(id, "id");
            w wVar = (w) bVar2.f8254b.getValue();
            wVar.getClass();
            q d10 = android.support.v4.media.session.b.i(wVar.f9918a, new k(id, "IPTV", wVar, i7)).d(Ab.e.f1561c);
            C1108c c1108c = new C1108c(18, this, item);
            qb.b bVar3 = new qb.b(new I9.h(this, 2), new o7.o(this, 12));
            try {
                d10.b(new nb.e(4, bVar3, c1108c));
                this.j = bVar3;
            } catch (NullPointerException e2) {
                throw e2;
            } catch (Throwable th) {
                u0.L(th);
                NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
                nullPointerException.initCause(th);
                throw nullPointerException;
            }
        }
        qb.b bVar4 = this.j;
        if (bVar4 != null) {
            add(bVar4);
        }
    }

    public final H d() {
        return (H) this.k.getValue();
    }

    public final void e() {
        C1236B c1236b = new C1236B(TVRecommendationWorkers.class);
        ((Set) c1236b.f5050c).add(TVRecommendationWorkers.class.getName());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Ia.d[] dVarArr = Ia.d.f5341a;
        linkedHashMap.put("extra:type", 3);
        C1249k c1249k = new C1249k(linkedHashMap);
        c2.i.y(c1249k);
        ((q3.p) c1236b.f5049b).f23407e = c1249k;
        this.f25842i.p(c1236b.c());
    }
}
