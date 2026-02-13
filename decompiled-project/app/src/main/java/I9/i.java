package I9;

import Db.o;
import U9.w;
import g3.C1191j;
import kotlin.jvm.internal.l;
import l2.H;
import qb.q;
import y9.C;
import y9.E;

/* loaded from: classes2.dex */
public abstract class i extends C {

    /* renamed from: a, reason: collision with root package name */
    public final P9.b f5327a;

    /* renamed from: b, reason: collision with root package name */
    public final o f5328b;

    /* renamed from: c, reason: collision with root package name */
    public final o f5329c;

    /* renamed from: d, reason: collision with root package name */
    public nb.e f5330d;

    /* renamed from: e, reason: collision with root package name */
    public final o f5331e;

    /* renamed from: f, reason: collision with root package name */
    public nb.e f5332f;

    public i(P9.b repository) {
        l.e(repository, "repository");
        this.f5327a = repository;
        this.f5328b = android.support.v4.media.session.b.z(new a(2));
        this.f5329c = android.support.v4.media.session.b.z(new a(3));
        this.f5331e = android.support.v4.media.session.b.z(new a(4));
    }

    public final void a() {
        if (b().d() instanceof E) {
            return;
        }
        b().l(new Object());
        w wVar = (w) this.f5327a.f8254b.getValue();
        wVar.getClass();
        q d10 = android.support.v4.media.session.b.i(wVar.f9918a, new Ba.o(wVar, 19)).d(Ab.e.f1561c);
        D5.i iVar = new D5.i(this, 17);
        C1191j c1191j = new C1191j(this, 18);
        d10.getClass();
        qb.b bVar = new qb.b(iVar, c1191j);
        d10.b(bVar);
        add(bVar);
    }

    public final H b() {
        return (H) this.f5328b.getValue();
    }
}
