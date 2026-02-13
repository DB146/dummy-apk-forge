package ha;

import Aa.t;
import Db.o;
import Eb.p;
import Eb.v;
import Eb.w;
import I2.AbstractC0315d;
import I2.H;
import P4.C0463k;
import U9.k;
import Y5.C0658x;
import ac.n;
import com.kt.apps.core.storage.local.RoomDataBase;
import com.kt.apps.core.utils.StringUtilsKt;
import com.kt.apps.core.utils.UtilsKt;
import com.kt.apps.core.utils.l;
import ea.C1111f;
import ea.C1112g;
import g3.C1191j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentMap;
import mb.InterfaceC1655a;
import ob.m;
import qb.AbstractC1909a;
import y.S;
import y7.u0;

/* loaded from: classes2.dex */
public final class i extends C9.h {

    /* renamed from: e, reason: collision with root package name */
    public static final o f17917e = android.support.v4.media.session.b.z(new l(12));

    /* renamed from: b, reason: collision with root package name */
    public final RoomDataBase f17918b;

    /* renamed from: c, reason: collision with root package name */
    public final Ra.c f17919c;

    /* renamed from: d, reason: collision with root package name */
    public final o f17920d;

    static {
        android.support.v4.media.session.b.z(new l(13));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(RoomDataBase roomDataBase, Ra.c cVar) {
        super(3);
        kotlin.jvm.internal.l.e(roomDataBase, "roomDataBase");
        this.f17918b = roomDataBase;
        this.f17919c = cVar;
        this.f17920d = android.support.v4.media.session.b.z(new l(14));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.lang.String] */
    public static String L(String str, String str2, String str3, boolean z8) {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.l.d(lowerCase, "toLowerCase(...)");
        List r02 = ac.g.r0(lowerCase, new String[]{" "});
        ArrayList arrayList = new ArrayList();
        for (Object obj : r02) {
            if (!ac.g.h0((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str4 = (String) it.next();
            String removeAllSpecialChars = UtilsKt.removeAllSpecialChars(str4);
            Eb.o.U(arrayList2, !kotlin.jvm.internal.l.a(str4, removeAllSpecialChars) ? u0.y(str4, removeAllSpecialChars) : u0.x(str4));
        }
        if (arrayList2.size() <= 1) {
            return "";
        }
        ArrayList arrayList3 = new ArrayList(p.S(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        int i7 = 0;
        while (it2.hasNext()) {
            Object next = it2.next();
            int i10 = i7 + 1;
            if (i7 < 0) {
                u0.M();
                throw null;
            }
            String str5 = (String) next;
            String b2 = z8 ? S.b("MATCH '*", str5, (i7 == arrayList2.size() - 1 || i7 == 0) ? "*'" : " *'") : S.b("LIKE '%", str5, "%'");
            arrayList3.add(A3.c.j(" OR ", str2, " ", b2) + (!ac.g.h0(str3) ? A3.c.j("OR ", str3, " ", b2) : ""));
            i7 = i10;
        }
        Iterator it3 = arrayList3.iterator();
        if (!it3.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        String next2 = it3.next();
        while (it3.hasNext()) {
            String str6 = (String) it3.next();
            next2 = next2;
            if (!ac.g.b0(next2, str6)) {
                next2 = X.c.h(next2, str6);
            }
        }
        return next2;
    }

    public final ConcurrentMap K() {
        Object value = this.f17920d.getValue();
        kotlin.jvm.internal.l.d(value, "getValue(...)");
        return (ConcurrentMap) value;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.jvm.internal.v, java.lang.Object] */
    @Override // C9.h
    public final gb.f v(Map map) {
        Collection collection;
        String str;
        Object obj = map.get("extra:default_history");
        Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        Object obj2 = map.get("extra:query");
        String str2 = obj2 instanceof String ? (String) obj2 : null;
        if (str2 == null) {
            str2 = "";
        }
        String obj3 = ac.g.v0(str2).toString();
        Object obj4 = map.get("extra:limit");
        Integer num = obj4 instanceof Integer ? (Integer) obj4 : null;
        int intValue = num != null ? num.intValue() : 1500;
        Object obj5 = map.get("extra:offset");
        Integer num2 = obj5 instanceof Integer ? (Integer) obj5 : null;
        int intValue2 = num2 != null ? num2.intValue() : 0;
        Object obj6 = map.get("extra:filter");
        String str3 = obj6 instanceof String ? (String) obj6 : null;
        Locale locale = Locale.ROOT;
        String lowerCase = obj3.toLowerCase(locale);
        kotlin.jvm.internal.l.d(lowerCase, "toLowerCase(...)");
        String obj7 = ac.g.v0(UtilsKt.removeAllSpecialChars(lowerCase)).toString();
        ?? obj8 = new Object();
        String lowerCase2 = obj3.toLowerCase(locale);
        kotlin.jvm.internal.l.d(lowerCase2, "toLowerCase(...)");
        obj8.f19134a = ac.g.v0(StringUtilsKt.replaceVNCharsToLatinChars(lowerCase2)).toString();
        while (ac.g.b0((CharSequence) obj8.f19134a, "  ")) {
            obj8.f19134a = ac.g.v0(n.W((String) obj8.f19134a, "  ", " ")).toString();
        }
        String lowerCase3 = obj3.toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.l.d(lowerCase3, "toLowerCase(...)");
        List r02 = ac.g.r0(StringUtilsKt.replaceVNCharsToLatinChars(lowerCase3), new String[]{" "});
        ArrayList arrayList = new ArrayList();
        for (Object obj9 : r02) {
            String str4 = (String) obj9;
            if (!ac.g.h0(str4) && str4.length() > 0) {
                arrayList.add(obj9);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str5 = (String) it.next();
            String removeAllSpecialChars = UtilsKt.removeAllSpecialChars(str5);
            Eb.o.U(arrayList2, !kotlin.jvm.internal.l.a(str5, removeAllSpecialChars) ? u0.y(removeAllSpecialChars, str5) : u0.x(str5));
        }
        String lowerCase4 = obj3.toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.l.d(lowerCase4, "toLowerCase(...)");
        String removeAllSpecialChars2 = UtilsKt.removeAllSpecialChars(lowerCase4);
        while (ac.g.b0(removeAllSpecialChars2, "  ")) {
            removeAllSpecialChars2 = ac.g.v0(n.W(removeAllSpecialChars2, "  ", " ")).toString();
        }
        String L = L(removeAllSpecialChars2, "searchKey", "", false);
        String replaceVNCharsToLatinChars = StringUtilsKt.replaceVNCharsToLatinChars(ac.g.v0(removeAllSpecialChars2).toString());
        String message = removeAllSpecialChars2.length() == 0 ? "SELECT * FROM TVChannelFts4" : L.length() > 0 ? h3.o.n("SELECT * FROM TVChannelFts4 WHERE ", ac.g.n0(ac.g.v0(L).toString(), "OR"), " OR searchKey LIKE '%", replaceVNCharsToLatinChars, "%'") : S.b("SELECT * FROM TVChannelFts4 WHERE searchKey LIKE '%", replaceVNCharsToLatinChars, "%'");
        kotlin.jvm.internal.l.e(message, "message");
        RoomDataBase roomDataBase = this.f17918b;
        U9.o oVar = (U9.o) roomDataBase.D();
        oVar.getClass();
        TreeMap treeMap = H.f5039w;
        H a9 = AbstractC0315d.a(0, message);
        String l10 = a9.l();
        String str6 = removeAllSpecialChars2;
        tb.b k = android.support.v4.media.session.b.k(oVar.f9904a, true, new k(l10, new C1191j(l10, new Ba.o(a9, 15)), oVar, 1));
        vb.n nVar = Ab.e.f1561c;
        Object eVar = new tb.e(k.f(nVar), f.f17912f, 0);
        gb.p eVar2 = new tb.e(new tb.f(new pb.p(new pb.g(eVar instanceof InterfaceC1655a ? ((InterfaceC1655a) eVar).a() : new ob.l(eVar, 3), new C0463k(this, 26), 1)), null, v.f3891a), new C1112g(3, arrayList2, obj8), 1);
        U9.d y10 = roomDataBase.y();
        String L10 = L(obj3, "tvChannelName", "categoryName", true);
        String obj10 = str3 != null ? ac.g.v0(str3).toString() : null;
        String b2 = (obj10 == null || ac.g.h0(obj10) || kotlin.jvm.internal.l.a(str3, "all_iptv")) ? "" : S.b(" AND configSourceUrl='", str3, "'");
        boolean z8 = booleanValue;
        StringBuilder o10 = A3.c.o("SELECT extensionSourceId as configSourceUrl, tvGroup as categoryName, tvChannelName, logoChannel, tvStreamLink, sourceFrom FROM ExtensionsChannelFts4 WHERE (tvChannelName MATCH '*", obj3, "*' OR categoryName MATCH '*", obj3, "*'");
        h3.o.v(o10, L10, ")", b2, " LIMIT ");
        o10.append(intValue);
        o10.append(" OFFSET ");
        o10.append(intValue2);
        String query = o10.toString();
        kotlin.jvm.internal.l.e("Query: {queryStr: " + query + "}", "message");
        kotlin.jvm.internal.l.e(query, "query");
        y10.getClass();
        H a10 = AbstractC0315d.a(0, query);
        String l11 = a10.l();
        tb.e eVar3 = new tb.e(new tb.b(android.support.v4.media.session.b.k(y10.f9854a, true, new t(9, l11, new C1191j(l11, new Ba.o(a10, 15)))).f(nVar), 1), new g(0, (Object) obj8, arrayList2), 1);
        m mVar = new m(1, new qb.n(new AbstractC1909a(this.f17919c.h(w.f3892a)), f.f17910d, 1), eVar2);
        if (!kotlin.jvm.internal.l.a(str3, "tv")) {
            if (z8 || str6.length() == 0) {
                eVar2 = mVar;
            } else {
                if (!kotlin.jvm.internal.l.a(str3, "all_iptv")) {
                    String obj11 = str3 != null ? ac.g.v0(str3).toString() : null;
                    if (obj11 == null || ac.g.h0(obj11)) {
                        gb.p[] pVarArr = {eVar2, eVar3};
                        int i7 = gb.d.f17483a;
                        ob.l lVar = new ob.l(pVarArr, 1);
                        C0658x c0658x = lb.b.f19612a;
                        lb.b.a(com.google.android.gms.common.api.f.API_PRIORITY_OTHER, "maxConcurrency");
                        eVar2 = new m(2, new pb.i(new pb.c(lVar, c0658x), new C1265a(0)), null);
                    }
                }
                eVar2 = eVar3;
            }
        }
        Object mVar2 = new m(4, new tb.e(eVar2, f.f17911e, 1), new C1111f(3, this, obj3));
        if (obj7.length() > 0 && !ac.g.h0(obj7) && (collection = (Collection) K().get(obj7)) != null && !collection.isEmpty()) {
            Object obj12 = K().get(obj7);
            kotlin.jvm.internal.l.b(obj12);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj13 : (Iterable) obj12) {
                e eVar4 = (e) obj13;
                if (eVar4 instanceof d) {
                    str = ((d) eVar4).f17903b.g();
                } else if (eVar4 instanceof C1266b) {
                    str = ((C1266b) eVar4).f17899b.f10234a;
                } else {
                    if (!(eVar4 instanceof C1267c)) {
                        throw new Db.d(1);
                    }
                    str = ((C1267c) eVar4).f17902b.f10859b;
                }
                Object obj14 = linkedHashMap.get(str);
                if (obj14 == null) {
                    obj14 = new ArrayList();
                    linkedHashMap.put(str, obj14);
                }
                ((List) obj14).add(obj13);
            }
            mVar2 = new tb.e(gb.p.c(linkedHashMap), new R7.b(mVar2, 19), 2);
        }
        return new qb.d(mVar2, 1);
    }
}
