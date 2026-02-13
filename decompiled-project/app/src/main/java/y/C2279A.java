package y;

import F.C0267k;
import i0.C1289b;
import z.C2555g;
import z.C2570q;
import z.J0;
import z.t0;
import z.w0;

/* renamed from: y.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2279A extends kotlin.jvm.internal.m implements Rb.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26387a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f26388b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f26389c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2279A(int i7, Object obj, Object obj2) {
        super(1);
        this.f26387a = i7;
        this.f26388b = obj;
        this.f26389c = obj2;
    }

    @Override // Rb.c
    public final Object invoke(Object obj) {
        switch (this.f26387a) {
            case 0:
                ((A.i) this.f26388b).b((A.h) this.f26389c);
                return Db.q.f3365a;
            case 1:
                ((C0267k) this.f26388b).f3980a.k((C2555g) this.f26389c);
                return Db.q.f3365a;
            case 2:
                long j = ((C2570q) obj).f28067a;
                ((t0) this.f26388b).a(1, ((w0) this.f26389c).f28124d == z.V.f27944b ? C1289b.a(1, j) : C1289b.a(2, j));
                return Db.q.f3365a;
            default:
                ((Number) obj).longValue();
                J0 j02 = (J0) this.f26388b;
                float f4 = j02.f27892e;
                j02.f27892e = 0.0f;
                ((Rb.c) this.f26389c).invoke(Float.valueOf(f4));
                return Db.q.f3365a;
        }
    }
}
