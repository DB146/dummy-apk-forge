package l2;

import Y5.C0658x;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: b, reason: collision with root package name */
    public static final C0658x f19205b = new C0658x(13);

    /* renamed from: a, reason: collision with root package name */
    public final Object f19206a;

    public c0() {
        this.f19206a = new AtomicReference(null);
    }

    public c0(d0 store, a0 factory, o2.c defaultCreationExtras) {
        kotlin.jvm.internal.l.e(store, "store");
        kotlin.jvm.internal.l.e(factory, "factory");
        kotlin.jvm.internal.l.e(defaultCreationExtras, "defaultCreationExtras");
        this.f19206a = new q3.n(store, factory, defaultCreationExtras);
    }

    public Y a(kotlin.jvm.internal.e eVar) {
        String b2 = eVar.b();
        if (b2 == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        return ((q3.n) this.f19206a).l(eVar, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b2));
    }
}
