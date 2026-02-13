package o2;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class d extends c {
    public /* synthetic */ d(int i7) {
        this(C1779a.f21662b);
    }

    public d(c initialExtras) {
        l.e(initialExtras, "initialExtras");
        LinkedHashMap initialExtras2 = initialExtras.f21663a;
        l.e(initialExtras2, "initialExtras");
        this.f21663a.putAll(initialExtras2);
    }

    @Override // o2.c
    public final Object a(InterfaceC1780b interfaceC1780b) {
        return this.f21663a.get(interfaceC1780b);
    }
}
