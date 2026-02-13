package K2;

import cc.E;

/* loaded from: classes.dex */
public final class o extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public kotlin.jvm.internal.v f6062a;

    /* renamed from: b, reason: collision with root package name */
    public int f6063b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.v f6064c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p f6065d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(kotlin.jvm.internal.v vVar, p pVar, Hb.d dVar) {
        super(2, dVar);
        this.f6064c = vVar;
        this.f6065d = pVar;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        return new o(this.f6064c, this.f6065d, dVar);
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((o) create((E) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        kotlin.jvm.internal.v vVar;
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f6063b;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            kotlin.jvm.internal.v vVar2 = this.f6064c;
            this.f6062a = vVar2;
            this.f6063b = 1;
            Object a9 = this.f6065d.a(this);
            if (a9 == aVar) {
                return aVar;
            }
            vVar = vVar2;
            obj = a9;
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            vVar = this.f6062a;
            com.bumptech.glide.c.c0(obj);
        }
        vVar.f19134a = obj;
        return Db.q.f3365a;
    }
}
