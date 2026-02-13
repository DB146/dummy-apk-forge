package u0;

import cc.C0944m;
import i0.C1289b;
import y0.InterfaceC2345m;
import z.C2561j;
import z.p0;
import z.w0;

/* loaded from: classes.dex */
public final class w extends kotlin.jvm.internal.m implements Rb.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24807a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f24808b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(Object obj, int i7) {
        super(1);
        this.f24807a = i7;
        this.f24808b = obj;
    }

    @Override // Rb.c
    public final Object invoke(Object obj) {
        i0.c q02;
        switch (this.f24807a) {
            case 0:
                Throwable th = (Throwable) obj;
                v vVar = (v) this.f24808b;
                C0944m c0944m = vVar.f24803c;
                if (c0944m != null) {
                    c0944m.d(th);
                }
                vVar.f24803c = null;
                return Db.q.f3365a;
            case 1:
                long j = ((C1289b) obj).f18172a;
                y.r rVar = (y.r) this.f24808b;
                if (rVar.f26513G) {
                    rVar.f26514H.invoke();
                }
                return Db.q.f3365a;
            case 2:
                C2561j c2561j = ((p0) this.f24808b).f28063T;
                c2561j.f28008G = (InterfaceC2345m) obj;
                if (c2561j.f28010I && (q02 = c2561j.q0()) != null && !c2561j.r0(q02, c2561j.f28011J)) {
                    c2561j.f28009H = true;
                    c2561j.s0();
                }
                c2561j.f28010I = false;
                return Db.q.f3365a;
            default:
                long j10 = ((C1289b) obj).f18172a;
                w0 w0Var = (w0) this.f24808b;
                return new C1289b(w0.a(w0Var, w0Var.j, j10, w0Var.f28128i));
        }
    }
}
