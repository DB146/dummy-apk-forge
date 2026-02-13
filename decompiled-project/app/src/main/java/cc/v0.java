package cc;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public final /* synthetic */ class v0 extends kotlin.jvm.internal.j implements Rb.f {

    /* renamed from: a, reason: collision with root package name */
    public static final v0 f14584a = new kotlin.jvm.internal.j(3, w0.class, "registerSelectForOnJoin", "registerSelectForOnJoin(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v5, types: [Rb.c, hc.k] */
    @Override // Rb.f
    public final Object a(Object obj, Object obj2, Object obj3) {
        boolean z8;
        w0 w0Var = (w0) obj;
        if (obj2 != null) {
            throw new ClassCastException();
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = w0.f14585a;
        while (true) {
            Object C2 = w0Var.C();
            if (!(C2 instanceof InterfaceC0931f0)) {
                z8 = false;
                break;
            }
            if (w0Var.S(C2) >= 0) {
                z8 = true;
                break;
            }
        }
        if (!z8) {
            throw null;
        }
        w0Var.invokeOnCompletion(false, true, new hc.k());
        throw null;
    }
}
