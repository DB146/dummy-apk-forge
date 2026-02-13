package A8;

import M1.InterfaceC0394i;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class N {

    /* renamed from: a, reason: collision with root package name */
    public final Hb.i f567a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0394i f568b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReference f569c;

    /* renamed from: d, reason: collision with root package name */
    public final K f570d;

    public N(Hb.i backgroundDispatcher, InterfaceC0394i dataStore) {
        kotlin.jvm.internal.l.e(backgroundDispatcher, "backgroundDispatcher");
        kotlin.jvm.internal.l.e(dataStore, "dataStore");
        this.f567a = backgroundDispatcher;
        this.f568b = dataStore;
        this.f569c = new AtomicReference();
        this.f570d = new K(0, new K(3, dataStore.getData(), new H(3, null, 0)), this);
        cc.F.B(cc.F.b(backgroundDispatcher), null, 0, new G(this, null), 3);
    }
}
