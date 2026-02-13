package d;

import Db.q;
import Jb.i;
import P3.p;
import cc.E;
import fc.C1157d;
import fc.C1168o;
import kotlin.jvm.internal.r;

/* loaded from: classes.dex */
public final class e extends i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public r f16285a;

    /* renamed from: b, reason: collision with root package name */
    public int f16286b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f16287c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Rb.e f16288d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p f16289e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, Rb.e eVar, p pVar, Hb.d dVar) {
        super(2, dVar);
        this.f16287c = fVar;
        this.f16288d = eVar;
        this.f16289e = pVar;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        return new e(this.f16287c, this.f16288d, this.f16289e, dVar);
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((E) obj, (Hb.d) obj2)).invokeSuspend(q.f3365a);
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [kotlin.jvm.internal.r, java.lang.Object] */
    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        r rVar;
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f16286b;
        boolean z8 = true;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            if (this.f16287c.f14068a) {
                ?? obj2 = new Object();
                C1168o c1168o = new C1168o(new C1157d((ec.d) this.f16289e.f7842c, z8), new d(obj2, null));
                this.f16285a = obj2;
                this.f16286b = 1;
                if (this.f16288d.invoke(c1168o, this) == aVar) {
                    return aVar;
                }
                rVar = obj2;
            }
            return q.f3365a;
        }
        if (i7 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        rVar = this.f16285a;
        com.bumptech.glide.c.c0(obj);
        if (!rVar.f19130a) {
            throw new IllegalStateException("You must collect the progress flow");
        }
        return q.f3365a;
    }
}
