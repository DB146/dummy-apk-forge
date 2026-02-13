package J7;

import java.util.Map;

/* loaded from: classes.dex */
public final class k implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f5589a;

    public k(r rVar) {
        this.f5589a = rVar;
    }

    @Override // J7.l
    public final void a(Map map) {
        String str = (String) map.get("s");
        if (str.equals("ok")) {
            return;
        }
        String str2 = (String) map.get("d");
        r rVar = this.f5589a;
        if (rVar.f5637y.H()) {
            rVar.f5637y.p(h3.o.n("Failed to send stats: ", str, " (message: ", str2, ")"), null, new Object[0]);
        }
    }
}
