package d;

import Db.q;
import Jb.i;
import P3.p;
import cc.E;

/* loaded from: classes.dex */
public final class g extends i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f16293a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f16294b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(f fVar, boolean z8, Hb.d dVar) {
        super(2, dVar);
        this.f16293a = fVar;
        this.f16294b = z8;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        return new g(this.f16293a, this.f16294b, dVar);
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        g gVar = (g) create((E) obj, (Hb.d) obj2);
        q qVar = q.f3365a;
        gVar.invokeSuspend(qVar);
        return qVar;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [Rb.a, kotlin.jvm.internal.j] */
    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        p pVar;
        Ib.a aVar = Ib.a.f5345a;
        com.bumptech.glide.c.c0(obj);
        f fVar = this.f16293a;
        boolean z8 = this.f16294b;
        if (!z8 && !fVar.g && fVar.f14068a && (pVar = fVar.f16292f) != null) {
            pVar.c();
        }
        fVar.f14068a = z8;
        ?? r32 = fVar.f14070c;
        if (r32 != 0) {
            r32.invoke();
        }
        return q.f3365a;
    }
}
