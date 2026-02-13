package xa;

import A9.C0098j;
import A9.C0107l0;
import A9.O0;
import Eb.B;
import W1.l0;
import android.os.Bundle;
import android.view.View;
import hb.C1268a;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.w;
import l2.AbstractC1456G;
import l2.C1465i;
import l2.H;
import ma.C1651b;
import ma.C1652c;
import y9.D;

/* loaded from: classes2.dex */
public final class i extends p {

    /* renamed from: r2, reason: collision with root package name */
    public static final /* synthetic */ int f26297r2 = 0;

    /* renamed from: o2, reason: collision with root package name */
    public Kc.d f26299o2;

    /* renamed from: q2, reason: collision with root package name */
    public C1465i f26301q2;

    /* renamed from: n2, reason: collision with root package name */
    public final O0 f26298n2 = vc.i.o(this, w.a(n.class), new h(this, 0), new h(this, 1), new h(this, 2));

    /* renamed from: p2, reason: collision with root package name */
    public final C1268a f26300p2 = new Object();

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, hb.a] */
    public i() {
        new C0098j(new C0107l0(4));
    }

    @Override // y9.AbstractC2456A
    public final AbstractC1456G J0() {
        int i7 = L9.c.f6423d;
        return new AbstractC1456G(new D(U9.j.l(6, null)));
    }

    @Override // y9.AbstractC2456A, A9.C0085f2, W1.C
    public final void V() {
        super.V();
        this.f26300p2.e();
    }

    @Override // y9.AbstractC2456A, A9.C0085f2, W1.C
    public final void d0(View view, Bundle bundle) {
        C1652c c1652c;
        kotlin.jvm.internal.l.e(view, "view");
        super.d0(view, bundle);
        O0 o02 = this.f26298n2;
        ((n) o02.getValue()).a();
        Bundle bundle2 = this.f10300u;
        if (bundle2 != null && (c1652c = (C1652c) bundle2.getParcelable("extra:football_match")) != null) {
            m1(c1652c);
        }
        this.f26301q2 = new C1465i(this, 1);
        H c10 = ((n) o02.getValue()).c();
        l0 H10 = H();
        C1465i c1465i = this.f26301q2;
        kotlin.jvm.internal.l.b(c1465i);
        c10.e(H10, c1465i);
        ((n) o02.getValue()).d().e(H(), new Ba.j(new Ba.o(this, 25), 6));
    }

    public final void m1(C1652c c1652c) {
        List<ma.g> list = c1652c.f20824b;
        ArrayList arrayList = new ArrayList(Eb.p.S(list, 10));
        for (ma.g gVar : list) {
            String str = gVar.f20834a;
            arrayList.add(new E9.i(str, gVar.f20835b, str, true));
        }
        C1651b c1651b = c1652c.f20823a;
        Db.j jVar = new Db.j("extra:media_id", c1651b.f20822w);
        Db.j jVar2 = new Db.j("extra:media_title", c1651b.a());
        String str2 = c1651b.f20821v;
        X0(arrayList, B.H(jVar, jVar2, new Db.j("extra:media_description", str2), new Db.j("extra:media_album_title", str2), new Db.j("extra:media_thumb", c1651b.f20815b.f20833d), new Db.j("extra:media_album_artist", c1651b.f20820u.name())), null, true, c1651b.b(), true);
    }
}
