package E9;

import android.content.Context;
import kotlin.jvm.internal.l;
import m4.C1549C;

/* loaded from: classes2.dex */
public final class g extends c {

    /* renamed from: u, reason: collision with root package name */
    public final Context f3818u;

    /* renamed from: v, reason: collision with root package name */
    public final e f3819v;

    /* renamed from: w, reason: collision with root package name */
    public C9.b f3820w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context _application, e _audioFocusManager, P9.c _historyManager) {
        super(_application, _audioFocusManager, _historyManager);
        l.e(_application, "_application");
        l.e(_audioFocusManager, "_audioFocusManager");
        l.e(_historyManager, "_historyManager");
        this.f3818u = _application;
        this.f3819v = _audioFocusManager;
    }

    @Override // E9.c
    public final void e() {
        C1549C c1549c = this.f3807c;
        if (c1549c == null || this.f3820w == null) {
            if (c1549c != null) {
                c1549c.y0();
            }
            C1549C c1549c2 = this.f3807c;
            if (c1549c2 != null) {
                c1549c2.l0();
            }
            this.f3807c = a();
            C1549C c1549c3 = this.f3807c;
            l.b(c1549c3);
            this.f3820w = new C9.b(this.f3818u, c1549c3);
        }
    }
}
