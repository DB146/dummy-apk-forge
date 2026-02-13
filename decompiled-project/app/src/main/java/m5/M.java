package m5;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
import n5.AbstractC1705a;

/* loaded from: classes.dex */
public final class M implements InterfaceC1603G {

    /* renamed from: a, reason: collision with root package name */
    public final long f20555a;

    /* renamed from: b, reason: collision with root package name */
    public final C1619p f20556b;

    /* renamed from: c, reason: collision with root package name */
    public final int f20557c;

    /* renamed from: d, reason: collision with root package name */
    public final S f20558d;

    /* renamed from: e, reason: collision with root package name */
    public final L f20559e;

    /* renamed from: f, reason: collision with root package name */
    public volatile Object f20560f;

    public M(InterfaceC1616m interfaceC1616m, Uri uri, int i7, L l10) {
        Map emptyMap = Collections.emptyMap();
        AbstractC1705a.o(uri, "The uri must be set.");
        C1619p c1619p = new C1619p(uri, 1, null, emptyMap, 0L, -1L, null, 1);
        this.f20558d = new S(interfaceC1616m);
        this.f20556b = c1619p;
        this.f20557c = i7;
        this.f20559e = l10;
        this.f20555a = P4.r.f8129b.getAndIncrement();
    }

    @Override // m5.InterfaceC1603G
    public final void b() {
        this.f20558d.f20580b = 0L;
        C1618o c1618o = new C1618o(this.f20558d, this.f20556b);
        try {
            c1618o.l();
            Uri w10 = this.f20558d.f20579a.w();
            w10.getClass();
            this.f20560f = this.f20559e.g(w10, c1618o);
        } finally {
            n5.D.g(c1618o);
        }
    }

    @Override // m5.InterfaceC1603G
    public final void d() {
    }
}
