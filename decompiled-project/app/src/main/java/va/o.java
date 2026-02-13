package va;

import java.util.List;

/* loaded from: classes2.dex */
public final /* synthetic */ class o implements Rb.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25342a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f25343b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f25344c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f25345d;

    public /* synthetic */ o(r rVar, List list, int i7, int i10) {
        this.f25342a = i10;
        this.f25343b = rVar;
        this.f25344c = list;
        this.f25345d = i7;
    }

    @Override // Rb.a
    public final Object invoke() {
        switch (this.f25342a) {
            case 0:
                r rVar = this.f25343b;
                C2161e I02 = rVar.I0();
                M9.d extensionsConfig = (M9.d) this.f25344c.get(this.f25345d);
                kotlin.jvm.internal.l.e(extensionsConfig, "extensionsConfig");
                R9.a aVar = I02.f25318e;
                kotlin.jvm.internal.l.e(aVar, "<this>");
                String key = h3.o.p(new StringBuilder(), extensionsConfig.f6851b, "_last_refresh_data");
                kotlin.jvm.internal.l.e(key, "key");
                ((R9.b) aVar).f8941a.edit().remove(key).apply();
                rVar.I0().c(true);
                return Db.q.f3365a;
            default:
                r rVar2 = this.f25343b;
                rVar2.I0().c(true);
                rVar2.I0().d(((M9.d) this.f25344c.get(this.f25345d)).f6851b);
                return Db.q.f3365a;
        }
    }
}
