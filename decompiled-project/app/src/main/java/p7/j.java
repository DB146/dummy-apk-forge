package p7;

import e8.InterfaceC1098a;
import e8.InterfaceC1099b;
import e8.InterfaceC1100c;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class j implements InterfaceC1100c, InterfaceC1099b {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f23140a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayDeque f23141b;

    /* renamed from: c, reason: collision with root package name */
    public final q7.k f23142c;

    public j() {
        q7.k kVar = q7.k.f23543a;
        this.f23140a = new HashMap();
        this.f23141b = new ArrayDeque();
        this.f23142c = kVar;
    }

    public final synchronized void a(Executor executor, InterfaceC1098a interfaceC1098a) {
        try {
            executor.getClass();
            if (!this.f23140a.containsKey(Y6.b.class)) {
                this.f23140a.put(Y6.b.class, new ConcurrentHashMap());
            }
            ((ConcurrentHashMap) this.f23140a.get(Y6.b.class)).put(interfaceC1098a, executor);
        } catch (Throwable th) {
            throw th;
        }
    }
}
