package na;

import Db.j;
import Eb.B;
import ac.g;
import gb.i;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.l;
import ma.C1651b;
import ma.EnumC1650a;

/* loaded from: classes2.dex */
public final class a extends H9.b {

    /* renamed from: a, reason: collision with root package name */
    public final b f21329a;

    /* renamed from: b, reason: collision with root package name */
    public final b f21330b;

    public a(b bVar, b bVar2) {
        this.f21329a = bVar;
        this.f21330b = bVar2;
    }

    @Override // H9.b
    public final i prepareExecute(Map map) {
        Object obj;
        Object obj2;
        Object obj3 = map.get("extra:team_name");
        l.c(obj3, "null cannot be cast to non-null type kotlin.String");
        String str = (String) obj3;
        String lowerCase = str.toLowerCase(Locale.ROOT);
        l.d(lowerCase, "toLowerCase(...)");
        List r02 = g.r0(lowerCase, new String[]{" "});
        EnumC1650a enumC1650a = EnumC1650a.f20812a;
        b bVar = this.f21329a;
        bVar.getClass();
        List list = (List) bVar.execute(B.G(new j("extra:source_from", EnumC1650a.f20812a))).d();
        Iterator it = list.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            String lowerCase2 = ((C1651b) obj2).a().toLowerCase(Locale.ROOT);
            l.d(lowerCase2, "toLowerCase(...)");
            int size = r02.size();
            Iterator it2 = r02.iterator();
            while (it2.hasNext()) {
                if (g.b0(lowerCase2, (String) it2.next())) {
                    size--;
                }
            }
            if (size == 0) {
                break;
            }
        }
        C1651b c1651b = (C1651b) obj2;
        if (c1651b == null) {
            Iterator it3 = list.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                Object next = it3.next();
                String lowerCase3 = ((C1651b) next).f20821v.toLowerCase(Locale.ROOT);
                l.d(lowerCase3, "toLowerCase(...)");
                int size2 = r02.size();
                Iterator it4 = r02.iterator();
                while (it4.hasNext()) {
                    if (g.b0(lowerCase3, (String) it4.next())) {
                        size2--;
                    }
                }
                if (size2 == 0) {
                    obj = next;
                    break;
                }
            }
            c1651b = (C1651b) obj;
        }
        return c1651b == null ? i.i(new Throwable("No available match for team: ".concat(str))) : this.f21330b.a(c1651b);
    }
}
