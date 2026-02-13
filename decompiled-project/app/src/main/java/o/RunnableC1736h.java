package o;

import android.view.View;
import n.InterfaceC1676j;
import n.MenuC1678l;

/* renamed from: o.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1736h implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final C1732f f21498a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1740j f21499b;

    public RunnableC1736h(C1740j c1740j, C1732f c1732f) {
        this.f21499b = c1740j;
        this.f21498a = c1732f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC1676j interfaceC1676j;
        C1740j c1740j = this.f21499b;
        MenuC1678l menuC1678l = c1740j.f21517c;
        if (menuC1678l != null && (interfaceC1676j = menuC1678l.f20958e) != null) {
            interfaceC1676j.g(menuC1678l);
        }
        View view = (View) c1740j.f21522v;
        if (view != null && view.getWindowToken() != null) {
            C1732f c1732f = this.f21498a;
            if (!c1732f.b()) {
                if (c1732f.f21013e != null) {
                    c1732f.d(0, 0, false, false);
                }
            }
            c1740j.f21510G = c1732f;
        }
        c1740j.f21512I = null;
    }
}
