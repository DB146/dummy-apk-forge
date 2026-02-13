package l2;

import java.util.HashMap;
import java.util.List;

/* renamed from: l2.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1464h implements InterfaceC1477v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19214a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f19215b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f19216c;

    public C1464h(InterfaceC1462f defaultLifecycleObserver, InterfaceC1477v interfaceC1477v) {
        kotlin.jvm.internal.l.e(defaultLifecycleObserver, "defaultLifecycleObserver");
        this.f19215b = defaultLifecycleObserver;
        this.f19216c = interfaceC1477v;
    }

    public C1464h(InterfaceC1478w interfaceC1478w) {
        this.f19215b = interfaceC1478w;
        C1460d c1460d = C1460d.f19207c;
        Class<?> cls = interfaceC1478w.getClass();
        C1458b c1458b = (C1458b) c1460d.f19208a.get(cls);
        this.f19216c = c1458b == null ? c1460d.a(cls, null) : c1458b;
    }

    public C1464h(C1481z c1481z, q3.s sVar) {
        this.f19215b = c1481z;
        this.f19216c = sVar;
    }

    @Override // l2.InterfaceC1477v
    public final void onStateChanged(InterfaceC1479x interfaceC1479x, r rVar) {
        switch (this.f19214a) {
            case 0:
                int i7 = AbstractC1463g.f19213a[rVar.ordinal()];
                InterfaceC1462f interfaceC1462f = (InterfaceC1462f) this.f19215b;
                switch (i7) {
                    case 1:
                        interfaceC1462f.getClass();
                        break;
                    case 2:
                        interfaceC1462f.onStart(interfaceC1479x);
                        break;
                    case 3:
                        interfaceC1462f.n(interfaceC1479x);
                        break;
                    case 4:
                        interfaceC1462f.getClass();
                        break;
                    case 5:
                        interfaceC1462f.onStop(interfaceC1479x);
                        break;
                    case 6:
                        interfaceC1462f.getClass();
                        break;
                    case 7:
                        throw new IllegalArgumentException("ON_ANY must not been send by anybody");
                    default:
                        throw new Db.d(1);
                }
                InterfaceC1477v interfaceC1477v = (InterfaceC1477v) this.f19216c;
                if (interfaceC1477v != null) {
                    interfaceC1477v.onStateChanged(interfaceC1479x, rVar);
                    return;
                }
                return;
            case 1:
                if (rVar == r.ON_START) {
                    ((C1481z) this.f19215b).f(this);
                    ((q3.s) this.f19216c).E();
                    return;
                }
                return;
            default:
                HashMap hashMap = ((C1458b) this.f19216c).f19200a;
                List list = (List) hashMap.get(rVar);
                InterfaceC1478w interfaceC1478w = (InterfaceC1478w) this.f19215b;
                C1458b.a(list, interfaceC1479x, rVar, interfaceC1478w);
                C1458b.a((List) hashMap.get(r.ON_ANY), interfaceC1479x, rVar, interfaceC1478w);
                return;
        }
    }
}
