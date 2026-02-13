package Ba;

import l2.InterfaceC1470n;
import l2.e0;
import o2.C1779a;

/* loaded from: classes2.dex */
public final class r extends kotlin.jvm.internal.m implements Rb.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2274a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2275b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(Db.g gVar, int i7) {
        super(0);
        this.f2274a = i7;
        this.f2275b = gVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Db.g, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [Db.g, java.lang.Object] */
    @Override // Rb.a
    public final Object invoke() {
        switch (this.f2274a) {
            case 0:
                return ((e0) this.f2275b.getValue()).s();
            default:
                e0 e0Var = (e0) this.f2275b.getValue();
                InterfaceC1470n interfaceC1470n = e0Var instanceof InterfaceC1470n ? (InterfaceC1470n) e0Var : null;
                return interfaceC1470n != null ? interfaceC1470n.o() : C1779a.f21662b;
        }
    }
}
