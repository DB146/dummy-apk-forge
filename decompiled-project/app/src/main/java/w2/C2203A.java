package w2;

import Q.C0479a0;
import cc.E;
import v2.C2133e;
import x.AbstractC2232b;
import x.C2229B;
import x.G;
import x.O;
import x.i0;
import x.o0;

/* renamed from: w2.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2203A extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public int f25658a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f25659b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ O f25660c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C2133e f25661d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i0 f25662e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2203A(O o10, C2133e c2133e, i0 i0Var, Hb.d dVar) {
        super(2, dVar);
        this.f25660c = o10;
        this.f25661d = c2133e;
        this.f25662e = i0Var;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        C2203A c2203a = new C2203A(this.f25660c, this.f25661d, this.f25662e, dVar);
        c2203a.f25659b = obj;
        return c2203a;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C2203A) create((E) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0046, code lost:
    
        if (r0 == r6) goto L17;
     */
    @Override // Jb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a9;
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f25658a;
        Db.q qVar = Db.q.f3365a;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            E e2 = (E) this.f25659b;
            O o10 = this.f25660c;
            Object value = o10.f25965c.getValue();
            C2133e c2133e = this.f25661d;
            if (kotlin.jvm.internal.l.a(value, c2133e)) {
                long longValue = ((Number) this.f25662e.f26107l.getValue()).longValue() / 1000000;
                C0479a0 c0479a0 = o10.f25970v;
                float e10 = c0479a0.e();
                o0 k = AbstractC2232b.k((int) (c0479a0.e() * ((float) longValue)), null, 6);
                s sVar = new s(e2, o10, c2133e);
                this.f25658a = 2;
                if (AbstractC2232b.c(e10, 0.0f, k, sVar, this, 4) == aVar) {
                    return aVar;
                }
            } else {
                this.f25658a = 1;
                i0 i0Var = o10.f25967e;
                if (i0Var != null) {
                    a9 = C2229B.a(o10.f25973y, new G(null, c2133e, o10, i0Var), this);
                }
                a9 = qVar;
                if (a9 == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i7 != 1 && i7 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.c.c0(obj);
        }
        return qVar;
    }
}
