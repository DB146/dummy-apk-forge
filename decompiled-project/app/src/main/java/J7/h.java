package J7;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class h implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f5579a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f5580b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f5581c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t f5582d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r f5583e;

    public h(r rVar, String str, long j, p pVar, t tVar) {
        this.f5583e = rVar;
        this.f5579a = str;
        this.f5580b = j;
        this.f5581c = pVar;
        this.f5582d = tVar;
    }

    @Override // J7.l
    public final void a(Map map) {
        r rVar = this.f5583e;
        boolean H10 = rVar.f5637y.H();
        Q7.h hVar = rVar.f5637y;
        if (H10) {
            hVar.p(this.f5579a + " response: " + map, null, new Object[0]);
        }
        HashMap hashMap = rVar.f5626n;
        long j = this.f5580b;
        if (((p) hashMap.get(Long.valueOf(j))) == this.f5581c) {
            rVar.f5626n.remove(Long.valueOf(j));
            t tVar = this.f5582d;
            String str = (String) map.get("s");
            if (str.equals("ok")) {
                tVar.a(null, null);
            } else {
                tVar.a(str, (String) map.get("d"));
            }
        } else if (hVar.H()) {
            hVar.p("Ignoring on complete for put " + j + " because it was removed already.", null, new Object[0]);
        }
        rVar.b();
    }
}
