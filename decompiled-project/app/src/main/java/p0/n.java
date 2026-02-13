package p0;

import ia.C1358d;
import l0.InterfaceC1445d;

/* loaded from: classes.dex */
public final class n extends kotlin.jvm.internal.m implements Rb.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23014a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f23015b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(o oVar, int i7) {
        super(1);
        this.f23014a = i7;
        this.f23015b = oVar;
    }

    /* JADX WARN: Type inference failed for: r10v3, types: [Rb.a, kotlin.jvm.internal.m] */
    @Override // Rb.c
    public final Object invoke(Object obj) {
        switch (this.f23014a) {
            case 0:
                o oVar = this.f23015b;
                oVar.f23018d = true;
                oVar.f23020f.invoke();
                return Db.q.f3365a;
            default:
                InterfaceC1445d interfaceC1445d = (InterfaceC1445d) obj;
                o oVar2 = this.f23015b;
                b bVar = oVar2.f23016b;
                float f4 = oVar2.k;
                float f10 = oVar2.f23023l;
                Q7.h u3 = interfaceC1445d.u();
                long D10 = u3.D();
                u3.x().i();
                try {
                    ((C1358d) u3.f8695b).t(f4, f10, 0L);
                    bVar.a(interfaceC1445d);
                    u3.x().g();
                    u3.U(D10);
                    return Db.q.f3365a;
                } catch (Throwable th) {
                    u3.x().g();
                    u3.U(D10);
                    throw th;
                }
        }
    }
}
