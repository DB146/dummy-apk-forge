package M1;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class H extends Jb.i implements Rb.c {

    /* renamed from: a, reason: collision with root package name */
    public Serializable f6587a;

    /* renamed from: b, reason: collision with root package name */
    public int f6588b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.v f6589c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Q f6590d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.t f6591e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(kotlin.jvm.internal.v vVar, Q q10, kotlin.jvm.internal.t tVar, Hb.d dVar) {
        super(1, dVar);
        this.f6589c = vVar;
        this.f6590d = q10;
        this.f6591e = tVar;
    }

    @Override // Jb.a
    public final Hb.d create(Hb.d dVar) {
        return new H(this.f6589c, this.f6590d, this.f6591e, dVar);
    }

    @Override // Rb.c
    public final Object invoke(Object obj) {
        return ((H) create((Hb.d) obj)).invokeSuspend(Db.q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        kotlin.jvm.internal.v vVar;
        kotlin.jvm.internal.t tVar;
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f6588b;
        kotlin.jvm.internal.t tVar2 = this.f6591e;
        kotlin.jvm.internal.v vVar2 = this.f6589c;
        Q q10 = this.f6590d;
        try {
        } catch (C0388c unused) {
            Object obj2 = vVar2.f19134a;
            this.f6587a = tVar2;
            this.f6588b = 3;
            obj = q10.j(obj2, true, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            this.f6587a = vVar2;
            this.f6588b = 1;
            obj = q10.i(this);
            if (obj == aVar) {
                return aVar;
            }
            vVar = vVar2;
        } else {
            if (i7 != 1) {
                if (i7 == 2) {
                    tVar = (kotlin.jvm.internal.t) this.f6587a;
                    com.bumptech.glide.c.c0(obj);
                    tVar.f19132a = ((Number) obj).intValue();
                    return Db.q.f3365a;
                }
                if (i7 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                tVar2 = (kotlin.jvm.internal.t) this.f6587a;
                com.bumptech.glide.c.c0(obj);
                tVar2.f19132a = ((Number) obj).intValue();
                return Db.q.f3365a;
            }
            vVar = (kotlin.jvm.internal.v) this.f6587a;
            com.bumptech.glide.c.c0(obj);
        }
        vVar.f19134a = obj;
        a0 g = q10.g();
        this.f6587a = tVar2;
        this.f6588b = 2;
        obj = g.a();
        if (obj == aVar) {
            return aVar;
        }
        tVar = tVar2;
        tVar.f19132a = ((Number) obj).intValue();
        return Db.q.f3365a;
    }
}
