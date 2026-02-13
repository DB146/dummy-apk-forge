package lb;

import java.util.concurrent.Callable;
import jb.InterfaceC1394e;
import jb.InterfaceC1396g;

/* renamed from: lb.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class CallableC1516a implements Callable, InterfaceC1396g, InterfaceC1394e {

    /* renamed from: a, reason: collision with root package name */
    public final Object f19611a;

    public CallableC1516a(Object obj) {
        this.f19611a = obj;
    }

    @Override // jb.InterfaceC1394e
    public final Object apply(Object obj) {
        return this.f19611a;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f19611a;
    }

    @Override // jb.InterfaceC1396g
    public final Object get() {
        return this.f19611a;
    }
}
