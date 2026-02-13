package oa;

import M9.t;
import Y5.B;
import com.kt.apps.core.storage.local.RoomDataBase;
import da.C1065c;
import da.C1066d;
import db.InterfaceC1070c;
import ea.C1113h;
import fa.C1146a;
import v9.C2156a;
import va.C2161e;
import xa.n;

/* loaded from: classes2.dex */
public final class k implements InterfaceC1070c {

    /* renamed from: a, reason: collision with root package name */
    public final j f22192a;

    /* renamed from: b, reason: collision with root package name */
    public final l f22193b;

    /* renamed from: c, reason: collision with root package name */
    public final int f22194c;

    public k(j jVar, l lVar, int i7) {
        this.f22192a = jVar;
        this.f22193b = lVar;
        this.f22194c = i7;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [w9.a, C9.h] */
    @Override // Cb.a
    public final Object get() {
        l lVar = this.f22193b;
        int i7 = this.f22194c;
        if (i7 == 0) {
            j jVar = lVar.f22195a;
            K9.c.a(jVar.f22171c);
            R9.a storage = (R9.a) jVar.j.get();
            u8.c remoteConfig = (u8.c) jVar.f22177l.get();
            kotlin.jvm.internal.l.e(storage, "storage");
            kotlin.jvm.internal.l.e(remoteConfig, "remoteConfig");
            new B(16);
            ?? hVar = new C9.h(3);
            android.support.v4.media.session.b.z(new com.kt.apps.core.utils.l(27));
            return new v9.b(new C2156a(hVar));
        }
        j jVar2 = this.f22192a;
        if (i7 == 1) {
            t parserExtensionsSource = (t) jVar2.f22179n.get();
            RoomDataBase roomDataBase = (RoomDataBase) jVar2.k.get();
            lVar.getClass();
            j jVar3 = lVar.f22195a;
            C1146a c1146a = new C1146a((M9.k) jVar3.f22178m.get(), (u8.c) jVar3.f22177l.get());
            fa.b bVar = new fa.b((M9.k) jVar3.f22178m.get());
            O9.a b2 = jVar2.b();
            R9.a storage2 = (R9.a) jVar2.j.get();
            I9.j jVar4 = new I9.j(new Ra.c((RoomDataBase) jVar3.k.get()), new Ra.b((P9.c) jVar3.f22164G.get()));
            kotlin.jvm.internal.l.e(parserExtensionsSource, "parserExtensionsSource");
            kotlin.jvm.internal.l.e(roomDataBase, "roomDataBase");
            kotlin.jvm.internal.l.e(storage2, "storage");
            return new C2161e(parserExtensionsSource, roomDataBase, c1146a, bVar, b2, storage2, jVar4);
        }
        if (i7 == 2) {
            return new wa.h((P9.b) jVar2.L.get(), (RoomDataBase) jVar2.k.get(), lVar.a(), jVar2.d());
        }
        if (i7 == 3) {
            return new n(new xa.f(new na.b(lVar.b(), 1), new na.b(lVar.b(), 0), new na.a(new na.b(lVar.b(), 1), new na.b(lVar.b(), 0))));
        }
        if (i7 == 4) {
            RoomDataBase roomDataBase2 = (RoomDataBase) jVar2.k.get();
            lVar.getClass();
            j jVar5 = lVar.f22195a;
            return new Ba.h(roomDataBase2, new ha.i((RoomDataBase) jVar5.k.get(), new Ra.c((RoomDataBase) jVar5.k.get())), jVar2.b(), lVar.a());
        }
        if (i7 != 5) {
            throw new AssertionError(i7);
        }
        j jVar6 = lVar.f22195a;
        C1065c c1065c = (C1065c) jVar6.f22191z.get();
        j jVar7 = lVar.f22195a;
        ta.c cVar = new ta.c(new C1113h(c1065c, new C1066d(jVar7.c()), lVar.a(), new C1146a((M9.k) jVar7.f22178m.get(), (u8.c) jVar7.f22177l.get()), new fa.b((M9.k) jVar7.f22178m.get()), new R7.a((RoomDataBase) jVar6.k.get())), jVar2.d());
        cVar.actionLogger = jVar7.b();
        return cVar;
    }
}
