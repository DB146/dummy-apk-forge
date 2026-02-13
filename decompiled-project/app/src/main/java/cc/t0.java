package cc;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public final /* synthetic */ class t0 extends kotlin.jvm.internal.j implements Rb.f {

    /* renamed from: a, reason: collision with root package name */
    public static final t0 f14575a = new kotlin.jvm.internal.j(3, w0.class, "onAwaitInternalRegFunc", "onAwaitInternalRegFunc(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override // Rb.f
    public final Object a(Object obj, Object obj2, Object obj3) {
        Object C2;
        w0 w0Var = (w0) obj;
        if (obj2 != null) {
            throw new ClassCastException();
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = w0.f14585a;
        do {
            C2 = w0Var.C();
            if (!(C2 instanceof InterfaceC0931f0)) {
                if (C2 instanceof C0955v) {
                    throw null;
                }
                F.I(C2);
                throw null;
            }
        } while (w0Var.S(C2) < 0);
        w0Var.invokeOnCompletion(false, true, new T(w0Var));
        throw null;
    }
}
