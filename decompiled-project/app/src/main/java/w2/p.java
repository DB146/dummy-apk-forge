package w2;

import Q.W;
import a0.C0691r;
import cc.E;
import fc.b0;
import java.util.List;
import java.util.Set;
import v2.C2133e;

/* loaded from: classes.dex */
public final class p extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ W f25700a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f25701b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0691r f25702c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(W w10, r rVar, C0691r c0691r, Hb.d dVar) {
        super(2, dVar);
        this.f25700a = w10;
        this.f25701b = rVar;
        this.f25702c = c0691r;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        return new p(this.f25700a, this.f25701b, this.f25702c, dVar);
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        p pVar = (p) create((E) obj, (Hb.d) obj2);
        Db.q qVar = Db.q.f3365a;
        pVar.invokeSuspend(qVar);
        return qVar;
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        com.bumptech.glide.c.c0(obj);
        for (C2133e c2133e : (Set) this.f25700a.getValue()) {
            r rVar = this.f25701b;
            if (!((List) ((b0) rVar.b().f24984e.f17078a).getValue()).contains(c2133e) && !this.f25702c.contains(c2133e)) {
                rVar.b().c(c2133e);
            }
        }
        return Db.q.f3365a;
    }
}
