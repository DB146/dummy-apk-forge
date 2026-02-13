package S4;

import m5.K;
import n5.AbstractC1705a;

/* loaded from: classes.dex */
public final class d implements K {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f9081a;

    @Override // m5.K
    public void a() {
        h hVar = this.f9081a;
        hVar.f9108P.a();
        A3.e eVar = hVar.f9110R;
        if (eVar != null) {
            throw eVar;
        }
    }

    public void b() {
        long j;
        h hVar = this.f9081a;
        synchronized (AbstractC1705a.f21159i) {
            try {
                j = AbstractC1705a.j ? AbstractC1705a.k : -9223372036854775807L;
            } catch (Throwable th) {
                throw th;
            }
        }
        hVar.f9119a0 = j;
        hVar.y(true);
    }
}
