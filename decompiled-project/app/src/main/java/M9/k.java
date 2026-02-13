package M9;

import A9.N2;
import U9.u;
import com.kt.apps.core.storage.local.RoomDataBase;
import com.kt.apps.core.utils.UtilsKt;
import gb.AbstractC1204a;
import hb.C1268a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import mb.InterfaceC1655a;
import ob.C1833a;
import ob.C1837e;
import okhttp3.OkHttpClient;

/* loaded from: classes2.dex */
public final class k {
    public static final h k = new h(7);

    /* renamed from: l, reason: collision with root package name */
    public static k f6873l;

    /* renamed from: a, reason: collision with root package name */
    public final OkHttpClient f6874a;

    /* renamed from: b, reason: collision with root package name */
    public final RoomDataBase f6875b;

    /* renamed from: c, reason: collision with root package name */
    public final u8.c f6876c;

    /* renamed from: d, reason: collision with root package name */
    public final C1268a f6877d;

    /* renamed from: e, reason: collision with root package name */
    public final Db.o f6878e;

    /* renamed from: f, reason: collision with root package name */
    public final Db.o f6879f;
    public final u g;

    /* renamed from: h, reason: collision with root package name */
    public final Db.o f6880h;

    /* renamed from: i, reason: collision with root package name */
    public final Db.o f6881i;
    public final Db.o j;

    public k(OkHttpClient okHttpClient, R9.a storage, RoomDataBase roomDataBase, u8.c firebaseRemoteConfig, C1268a c1268a) {
        kotlin.jvm.internal.l.e(storage, "storage");
        kotlin.jvm.internal.l.e(roomDataBase, "roomDataBase");
        kotlin.jvm.internal.l.e(firebaseRemoteConfig, "firebaseRemoteConfig");
        this.f6874a = okHttpClient;
        this.f6875b = roomDataBase;
        this.f6876c = firebaseRemoteConfig;
        this.f6877d = c1268a;
        this.f6878e = android.support.v4.media.session.b.z(new I9.a(13));
        this.f6879f = android.support.v4.media.session.b.z(new N2(this, 12));
        this.g = roomDataBase.G();
        this.f6880h = android.support.v4.media.session.b.z(new I9.a(14));
        this.f6881i = android.support.v4.media.session.b.z(new I9.a(15));
        this.j = android.support.v4.media.session.b.z(new I9.a(16));
        f6873l = this;
    }

    public final void a(d config, String str) {
        kotlin.jvm.internal.l.e(config, "config");
        List r02 = ac.g.r0(str, new String[]{","});
        ArrayList arrayList = new ArrayList();
        for (Object obj : r02) {
            if (!ac.g.h0(ac.g.v0((String) obj).toString())) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            Db.o oVar = this.f6880h;
            if (((ConcurrentHashMap) oVar.getValue()).get(str2) == null || (e().get(str2) != g.f6860b && e().get(str2) != g.f6859a)) {
                ((ConcurrentHashMap) oVar.getValue()).put(str2, c(config, str2));
                e().put(str2, g.f6859a);
            }
        }
    }

    public final gb.i b(String channelId, boolean z8) {
        if (!z8) {
            channelId = ac.g.n0(UtilsKt.removeAllSpecialChars(channelId), "viechannel");
        }
        Db.o oVar = this.f6879f;
        if (z8) {
            U9.t tVar = (U9.t) oVar.getValue();
            tVar.getClass();
            kotlin.jvm.internal.l.e(channelId, "channelId");
            return android.support.v4.media.session.b.k(tVar.f9911a, true, new U9.b(channelId, 4)).g();
        }
        U9.t tVar2 = (U9.t) oVar.getValue();
        tVar2.getClass();
        kotlin.jvm.internal.l.e(channelId, "channelId");
        return android.support.v4.media.session.b.k(tVar2.f9911a, true, new U9.b(channelId, 5)).g();
    }

    public final ob.k c(d dVar, String epgUrl) {
        U9.t tVar = (U9.t) this.f6879f.getValue();
        String configId = dVar.f6851b;
        tVar.getClass();
        kotlin.jvm.internal.l.e(configId, "configId");
        kotlin.jvm.internal.l.e(epgUrl, "epgUrl");
        C1837e g = android.support.v4.media.session.b.g(tVar.f9911a, new Aa.t(20, configId, epgUrl));
        Db.o oVar = this.f6878e;
        Object e2 = new C1833a(0, new C1837e(g.b((gb.o) oVar.getValue()).e((gb.o) oVar.getValue()), 2), new C1837e(new qb.m(new e(this, epgUrl, dVar, 0), 2).g(new j(this)), 2).b((gb.o) oVar.getValue())).e((gb.o) oVar.getValue());
        return new ob.k(new C1837e(new pb.g(e2 instanceof InterfaceC1655a ? ((InterfaceC1655a) e2).a() : new ob.l(e2, 0), new q3.e(15, this, epgUrl), 1), 1).a(new F8.a(epgUrl, 3, this)), new q3.l(15, this, epgUrl, false), lb.b.f19614c);
    }

    public final ConcurrentHashMap d() {
        return (ConcurrentHashMap) this.j.getValue();
    }

    public final ConcurrentHashMap e() {
        return (ConcurrentHashMap) this.f6881i.getValue();
    }

    public final void f() {
        Db.o oVar = this.f6880h;
        if (((ConcurrentHashMap) oVar.getValue()).isEmpty()) {
            return;
        }
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) oVar.getValue();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : concurrentHashMap.entrySet()) {
            if (e().get(entry.getKey()) == g.f6859a) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        if (linkedHashMap.isEmpty()) {
            linkedHashMap = null;
        }
        if (linkedHashMap == null) {
            return;
        }
        int i7 = 0;
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            String str = (String) entry2.getKey();
            AbstractC1204a abstractC1204a = (AbstractC1204a) entry2.getValue();
            A1.d dVar = new A1.d(this, 24);
            j jVar = new j(this);
            abstractC1204a.getClass();
            nb.e eVar = new nb.e(0, jVar, dVar);
            abstractC1204a.c(eVar);
            this.f6877d.d(eVar);
            e().put(str, g.f6860b);
            i7++;
            if (i7 > 3) {
                return;
            }
        }
    }
}
