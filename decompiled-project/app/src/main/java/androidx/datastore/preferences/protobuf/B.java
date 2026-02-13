package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class B {
    public static void a(Object obj, long j) {
        AbstractC0799b abstractC0799b = (AbstractC0799b) ((InterfaceC0818v) j0.f13421c.h(obj, j));
        if (abstractC0799b.f13378a) {
            abstractC0799b.f13378a = false;
        }
    }

    public static InterfaceC0818v b(Object obj, long j) {
        InterfaceC0818v interfaceC0818v = (InterfaceC0818v) j0.f13421c.h(obj, j);
        if (((AbstractC0799b) interfaceC0818v).f13378a) {
            return interfaceC0818v;
        }
        U u3 = (U) interfaceC0818v;
        int i7 = u3.f13357c;
        U o10 = u3.o(i7 == 0 ? 10 : i7 * 2);
        j0.o(obj, j, o10);
        return o10;
    }
}
