package J7;

import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class j implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o f5587a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f5588b;

    public j(r rVar, o oVar) {
        this.f5588b = rVar;
        this.f5587a = oVar;
    }

    @Override // J7.l
    public final void a(Map map) {
        String str = (String) map.get("s");
        boolean equals = str.equals("ok");
        r rVar = this.f5588b;
        o oVar = this.f5587a;
        if (equals) {
            Map map2 = (Map) map.get("d");
            if (map2.containsKey("w")) {
                List list = (List) map2.get("w");
                q qVar = oVar.f5600b;
                rVar.getClass();
                if (list.contains("no_index")) {
                    StringBuilder n6 = X.c.n("Using an unspecified index. Your data will be downloaded and filtered on the client. Consider adding '", "\".indexOn\": \"" + qVar.f5608b.get("i") + '\"', "' at ");
                    n6.append(tc.b.E(qVar.f5607a));
                    n6.append(" to your security and Firebase Database rules for better performance");
                    rVar.f5637y.b0(n6.toString());
                }
            }
        }
        if (((o) rVar.f5628p.get(oVar.f5600b)) == oVar) {
            boolean equals2 = str.equals("ok");
            q3.s sVar = oVar.f5599a;
            if (equals2) {
                sVar.a(null, null);
            } else {
                rVar.f(oVar.f5600b);
                sVar.a(str, (String) map.get("d"));
            }
        }
    }
}
