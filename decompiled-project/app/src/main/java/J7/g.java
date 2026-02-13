package J7;

import L7.AbstractC0382b;
import java.util.Map;

/* loaded from: classes.dex */
public final class g implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f5577a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f5578b;

    public g(r rVar, boolean z8) {
        this.f5578b = rVar;
        this.f5577a = z8;
    }

    @Override // J7.l
    public final void a(Map map) {
        String str = (String) map.get("s");
        boolean equals = str.equals("ok");
        r rVar = this.f5578b;
        if (equals) {
            rVar.f5622h = m.f5594e;
            rVar.f5612C = 0;
            rVar.i(this.f5577a);
            return;
        }
        rVar.f5629q = null;
        rVar.f5630r = true;
        L7.j jVar = rVar.f5616a;
        jVar.getClass();
        jVar.j(AbstractC0382b.f6324c, Boolean.FALSE);
        Q7.h hVar = rVar.f5637y;
        hVar.p(h3.o.n("Authentication failed: ", str, " (", (String) map.get("d"), ")"), null, new Object[0]);
        rVar.g.f(2);
        if (str.equals("invalid_token")) {
            int i7 = rVar.f5612C + 1;
            rVar.f5612C = i7;
            if (i7 >= 3) {
                K7.a aVar = rVar.f5638z;
                aVar.f6203i = aVar.f6199d;
                hVar.b0("Provided authentication credentials are invalid. This usually indicates your FirebaseApp instance was not initialized correctly. Make sure your google-services.json file has the correct firebase_url and api_key. You can re-download google-services.json from https://console.firebase.google.com/.");
            }
        }
    }
}
