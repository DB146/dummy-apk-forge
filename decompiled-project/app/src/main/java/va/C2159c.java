package va;

import A9.AbstractC0074d;
import A9.C0121o2;
import A9.O0;
import A9.P0;
import W1.C0558a;
import W1.U;
import android.content.Context;
import com.kt.apps.core.storage.local.RoomDataBase;
import com.kt.apps.media.xemtv.beta.R;
import ea.C1112g;
import fb.AbstractC1148b;
import gb.AbstractC1204a;
import hb.C1268a;
import i1.C1290a;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import l1.AbstractC1449a;
import ob.C1835c;
import ob.C1837e;
import ob.C1842j;
import r7.C1947c;

/* renamed from: va.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2159c extends F {

    /* renamed from: B0, reason: collision with root package name */
    public final M9.d f25307B0;
    public final C0121o2 C0;

    /* renamed from: D0, reason: collision with root package name */
    public final C1268a f25308D0;

    /* renamed from: E0, reason: collision with root package name */
    public final RoomDataBase f25309E0;

    /* renamed from: F0, reason: collision with root package name */
    public final o f25310F0;

    /* renamed from: G0, reason: collision with root package name */
    public final o f25311G0;

    /* renamed from: H0, reason: collision with root package name */
    public M9.t f25312H0;

    /* renamed from: I0, reason: collision with root package name */
    public final O0 f25313I0;

    public C2159c(M9.d extensions, C0121o2 progressBarManager, C1268a c1268a, RoomDataBase roomDataBase, o oVar, o oVar2) {
        kotlin.jvm.internal.l.e(extensions, "extensions");
        kotlin.jvm.internal.l.e(progressBarManager, "progressBarManager");
        this.f25307B0 = extensions;
        this.C0 = progressBarManager;
        this.f25308D0 = c1268a;
        this.f25309E0 = roomDataBase;
        this.f25310F0 = oVar;
        this.f25311G0 = oVar2;
        vc.i.o(this, kotlin.jvm.internal.w.a(C2161e.class), new C2158b(this, 0), new C2158b(this, 1), new C2158b(this, 2));
        this.f25313I0 = vc.i.o(this, kotlin.jvm.internal.w.a(wa.h.class), new C2158b(this, 3), new C2158b(this, 4), new C2158b(this, 5));
    }

    @Override // va.F, W1.C
    public final void R(Context context) {
        kotlin.jvm.internal.l.e(context, "context");
        super.R(context);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [A9.d, A9.P0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v1, types: [A9.d, A9.P0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [A9.d, A9.P0, java.lang.Object] */
    @Override // A9.C0092h1
    public final void q0(ArrayList arrayList) {
        ?? abstractC0074d = new AbstractC0074d(0L);
        abstractC0074d.f1099a = 2L;
        abstractC0074d.f1101c = "Cập nhật";
        abstractC0074d.g = null;
        abstractC0074d.f1102d = "Cập nhật lại danh sách kênh";
        abstractC0074d.f930h = null;
        abstractC0074d.f1100b = null;
        abstractC0074d.f931i = 524289;
        abstractC0074d.j = 524289;
        abstractC0074d.k = 1;
        abstractC0074d.f932l = 1;
        abstractC0074d.f929f = 112;
        arrayList.add(abstractC0074d);
        ?? abstractC0074d2 = new AbstractC0074d(0L);
        abstractC0074d2.f1099a = 1L;
        abstractC0074d2.f1101c = "Xoá nguồn IPTV";
        abstractC0074d2.g = null;
        abstractC0074d2.f1102d = "Sau khi xoá nguồn sẽ không còn tồn tại";
        abstractC0074d2.f930h = null;
        abstractC0074d2.f1100b = null;
        abstractC0074d2.f931i = 524289;
        abstractC0074d2.j = 524289;
        abstractC0074d2.k = 1;
        abstractC0074d2.f932l = 1;
        abstractC0074d2.f929f = 112;
        arrayList.add(abstractC0074d2);
        ?? abstractC0074d3 = new AbstractC0074d(0L);
        abstractC0074d3.f1099a = 3L;
        abstractC0074d3.f1101c = "Trờ về";
        abstractC0074d3.g = null;
        abstractC0074d3.f1102d = null;
        abstractC0074d3.f930h = null;
        abstractC0074d3.f1100b = null;
        abstractC0074d3.f931i = 524289;
        abstractC0074d3.j = 524289;
        abstractC0074d3.k = 1;
        abstractC0074d3.f932l = 1;
        abstractC0074d3.f929f = 112;
        arrayList.add(abstractC0074d3);
    }

    @Override // A9.C0092h1
    public final q3.n r0() {
        return new q3.n(1, this.f25307B0.f6850a, "Bạn có thể cập nhật hoặc xoá nguồn IPTV tại đây", "Nguồn IPTV", AbstractC1449a.getDrawable(i0(), R.drawable.round_insert_link_64));
    }

    @Override // A9.C0092h1
    public final void s0(P0 p02) {
        Long valueOf = p02 != null ? Long.valueOf(p02.f1099a) : null;
        C1268a c1268a = this.f25308D0;
        C0121o2 c0121o2 = this.C0;
        M9.d dVar = this.f25307B0;
        if (valueOf != null && valueOf.longValue() == 1) {
            c0121o2.b();
            RoomDataBase roomDataBase = this.f25309E0;
            U9.d y10 = roomDataBase.y();
            String sourceId = dVar.f6851b;
            y10.getClass();
            kotlin.jvm.internal.l.e(sourceId, "sourceId");
            C1837e g = android.support.v4.media.session.b.g(y10.f9854a, new U9.b(sourceId, 0));
            U9.h z8 = roomDataBase.z();
            z8.getClass();
            C1837e g2 = android.support.v4.media.session.b.g(z8.f9862a, new U9.e(z8, dVar, 0));
            U9.w H10 = roomDataBase.H();
            H10.getClass();
            String sourceId2 = dVar.f6851b;
            kotlin.jvm.internal.l.e(sourceId2, "sourceId");
            C1842j b2 = new C1835c(new AbstractC1204a[]{g, g2, android.support.v4.media.session.b.g(H10.f9918a, new U9.b(sourceId2, 7))}, 1).e(Ab.e.f1561c).b(AbstractC1148b.a());
            nb.e eVar = new nb.e(0, new C1290a(this, 25), new C1947c(this, 11));
            b2.c(eVar);
            c1268a.d(eVar);
            return;
        }
        if (valueOf != null && valueOf.longValue() == 3) {
            U j = g0().j();
            j.getClass();
            C0558a c0558a = new C0558a(j);
            c0558a.i(this);
            c0558a.e(false);
            return;
        }
        if (valueOf != null && valueOf.longValue() == 2) {
            c0121o2.b();
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            M9.t tVar = this.f25312H0;
            if (tVar == null) {
                kotlin.jvm.internal.l.j("parserExtensionsSource");
                throw null;
            }
            sb.w n6 = tVar.j(dVar).q(Ab.e.f1561c).n(AbstractC1148b.a());
            nb.h hVar = new nb.h(new C1112g(16, this, atomicBoolean), new o7.o(this, 10), lb.b.f19614c);
            n6.b(hVar);
            c1268a.d(hVar);
        }
    }
}
