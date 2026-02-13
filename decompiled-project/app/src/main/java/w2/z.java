package w2;

import cc.E;
import v2.C2133e;
import x.C2229B;
import x.L;
import x.O;
import x.i0;

/* loaded from: classes.dex */
public final class z extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public int f25749a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f25750b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ O f25751c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C2133e f25752d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(float f4, O o10, C2133e c2133e, Hb.d dVar) {
        super(2, dVar);
        this.f25750b = f4;
        this.f25751c = o10;
        this.f25752d = c2133e;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        return new z(this.f25750b, this.f25751c, this.f25752d, dVar);
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((z) create((E) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006c, code lost:
    
        if (r9 == r0) goto L27;
     */
    @Override // Jb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a9;
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f25749a;
        Db.q qVar = Db.q.f3365a;
        O o10 = this.f25751c;
        float f4 = this.f25750b;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            if (f4 > 0.0f) {
                this.f25749a = 1;
                if (o10.R(f4, o10.f25964b.getValue(), this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i7 != 1) {
                if (i7 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.c.c0(obj);
                return qVar;
            }
            com.bumptech.glide.c.c0(obj);
        }
        if (f4 == 0.0f) {
            this.f25749a = 2;
            i0 i0Var = o10.f25967e;
            if (i0Var != null) {
                Object value = o10.f25965c.getValue();
                C2133e c2133e = this.f25752d;
                if (!kotlin.jvm.internal.l.a(value, c2133e) || !kotlin.jvm.internal.l.a(o10.f25964b.getValue(), c2133e)) {
                    a9 = C2229B.a(o10.f25973y, new L(null, c2133e, o10, i0Var), this);
                }
            }
            a9 = qVar;
            if (a9 == aVar) {
                return aVar;
            }
        }
        return qVar;
    }
}
