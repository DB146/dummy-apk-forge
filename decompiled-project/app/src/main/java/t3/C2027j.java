package t3;

import Db.q;
import h3.z;
import q3.p;

/* renamed from: t3.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2027j extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f24474a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2027j(p pVar, Hb.d dVar) {
        super(2, dVar);
        this.f24474a = pVar;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        return new C2027j(this.f24474a, dVar);
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        C2027j c2027j = (C2027j) create((m3.c) obj, (Hb.d) obj2);
        q qVar = q.f3365a;
        c2027j.invokeSuspend(qVar);
        return qVar;
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        com.bumptech.glide.c.c0(obj);
        String str = k.f24475a;
        z.e().a(str, "Constraints changed for " + this.f24474a);
        return q.f3365a;
    }
}
