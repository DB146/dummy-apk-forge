package na;

import Db.j;
import Eb.B;
import N6.y0;
import ac.e;
import com.kt.apps.core.utils.NetworkUtilsKt;
import gb.i;
import ia.C1358d;
import ja.InterfaceC1389a;
import java.util.Map;
import ka.C1435a;
import ka.c;
import kotlin.jvm.internal.l;
import ma.C1651b;
import ma.EnumC1650a;
import qb.m;
import sb.C2012f;

/* loaded from: classes2.dex */
public final class b extends H9.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21331a;

    /* renamed from: b, reason: collision with root package name */
    public final y0 f21332b;

    public /* synthetic */ b(y0 y0Var, int i7) {
        this.f21331a = i7;
        this.f21332b = y0Var;
    }

    public i a(C1651b match) {
        l.e(match, "match");
        EnumC1650a sourceFrom = match.f20820u;
        l.e(sourceFrom, "sourceFrom");
        return execute(B.H(new j("extra:source_from", sourceFrom), new j("extra:match", match)));
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [kotlin.jvm.internal.v, java.lang.Object] */
    @Override // H9.b
    public final i prepareExecute(Map map) {
        switch (this.f21331a) {
            case 0:
                Object obj = map.get("extra:source_from");
                l.c(obj, "null cannot be cast to non-null type com.kt.apps.football.model.FootballDataSourceFrom");
                Object obj2 = this.f21332b.get((EnumC1650a) obj);
                l.b(obj2);
                Object obj3 = map.get("extra:match");
                l.c(obj3, "null cannot be cast to non-null type com.kt.apps.football.model.FootballMatch");
                C1651b c1651b = (C1651b) obj3;
                c cVar = (c) ((InterfaceC1389a) obj2);
                ?? obj4 = new Object();
                obj4.f19134a = c.f19063f;
                String str = cVar.f19067d.f20826b;
                if (str != null && str.length() != 0) {
                    String str2 = cVar.f19067d.f20826b;
                    l.b(str2);
                    obj4.f19134a = new e(str2);
                }
                return new m(new M9.e(c1651b, cVar, (Object) obj4, 12), 2);
            default:
                Object obj5 = map.get("extra:source_from");
                l.c(obj5, "null cannot be cast to non-null type com.kt.apps.football.model.FootballDataSourceFrom");
                InterfaceC1389a interfaceC1389a = (InterfaceC1389a) this.f21332b.get((EnumC1650a) obj5);
                l.b(interfaceC1389a);
                NetworkUtilsKt.trustEveryone();
                return new C2012f(new m(new C1435a((c) interfaceC1389a, 0), 2), new C1358d(this, 5), lb.b.f19615d, lb.b.f19614c);
        }
    }
}
