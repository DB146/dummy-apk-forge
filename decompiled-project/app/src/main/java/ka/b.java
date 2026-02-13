package ka;

import u8.e;
import v8.C2155i;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19061a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f19062b;

    public /* synthetic */ b(Object obj, int i7) {
        this.f19061a = i7;
        this.f19062b = obj;
    }

    private final void b(e eVar) {
    }

    private final void c(u8.a aVar) {
    }

    public final void a(e eVar) {
        switch (this.f19061a) {
            case 0:
                return;
            default:
                C2155i c2155i = (C2155i) this.f19062b;
                synchronized (c2155i) {
                    c2155i.f25238d = true;
                }
                ((C2155i) this.f19062b).g(eVar);
                return;
        }
    }
}
