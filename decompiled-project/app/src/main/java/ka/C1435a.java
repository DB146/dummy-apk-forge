package ka;

import Db.q;
import G8.m;
import L9.d;
import ac.g;
import com.kt.apps.core.utils.JsoupResponse;
import com.kt.apps.core.utils.JsoupUtilsKt;
import gb.j;
import h3.H;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import ma.C1653d;
import org.json.JSONObject;
import sb.C2010d;
import xc.l;
import zc.e;

/* renamed from: ka.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C1435a implements j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19059a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f19060b;

    public /* synthetic */ C1435a(c cVar, int i7) {
        this.f19059a = i7;
        this.f19060b = cVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c1, code lost:
    
        if (r3 == null) goto L38;
     */
    @Override // gb.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(C2010d c2010d) {
        Object n6;
        Iterator<String> keys;
        switch (this.f19059a) {
            case 0:
                c cVar = this.f19060b;
                ArrayList arrayList = new ArrayList();
                try {
                    JsoupResponse jsoupParse = JsoupUtilsKt.jsoupParse(cVar.f19064a.f20825a, cVar.a(), new Db.j[0]);
                    cVar.a().putAll(jsoupParse.getCookie());
                    l body = jsoupParse.getBody();
                    String str = cVar.f19067d.f20827c;
                    if (str != null) {
                        if (g.v0(str).toString().length() <= 0) {
                            str = null;
                            break;
                        }
                    }
                    str = ".matches__item";
                    e m02 = body.m0(str);
                    kotlin.jvm.internal.l.d(m02, "select(...)");
                    Iterator<E> it = m02.iterator();
                    kotlin.jvm.internal.l.d(it, "iterator(...)");
                    while (it.hasNext()) {
                        Object next = it.next();
                        kotlin.jvm.internal.l.d(next, "next(...)");
                        try {
                            arrayList.add(cVar.c((l) next));
                        } catch (Exception unused) {
                        }
                    }
                    if (arrayList.isEmpty()) {
                        if (c2010d.g()) {
                            return;
                        } else {
                            c2010d.onError(new d(1));
                        }
                    } else {
                        if (c2010d.g()) {
                            return;
                        }
                        c2010d.d(arrayList);
                        Map value = cVar.a();
                        R9.b bVar = (R9.b) cVar.f19065b;
                        bVar.getClass();
                        kotlin.jvm.internal.l.e(value, "value");
                        bVar.f8941a.edit().putString("extra:cookie_91phut", new m().f(value)).apply();
                    }
                    c2010d.a();
                    return;
                } catch (Exception e2) {
                    if (c2010d.g()) {
                        return;
                    }
                    c2010d.onError(H.A(3, e2));
                    return;
                }
            default:
                c cVar2 = this.f19060b;
                try {
                    JSONObject jSONObject = new JSONObject(u8.c.e().g("football_parser_config"));
                    JSONObject optJSONObject = jSONObject.optJSONObject("selections");
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    if (optJSONObject != null && (keys = optJSONObject.keys()) != null) {
                        while (keys.hasNext()) {
                            String next2 = keys.next();
                            linkedHashMap.put(next2, optJSONObject.optString(next2));
                        }
                    }
                    C1653d c1653d = cVar2.f19064a;
                    String optString = jSONObject.optString("url", c1653d.f20825a);
                    kotlin.jvm.internal.l.d(optString, "optString(...)");
                    String str2 = c1653d.f20826b;
                    String str3 = "";
                    if (str2 == null) {
                        str2 = "";
                    }
                    String optString2 = jSONObject.optString("regex", str2);
                    String str4 = c1653d.f20827c;
                    if (str4 != null) {
                        str3 = str4;
                    }
                    c2010d.d(new C1653d(optString, optString2, jSONObject.optString("itemClassName", str3), linkedHashMap, 8));
                    c2010d.a();
                    n6 = q.f3365a;
                } catch (Throwable th) {
                    n6 = com.bumptech.glide.c.n(th);
                }
                Throwable a9 = Db.m.a(n6);
                if (a9 != null) {
                    c2010d.onError(a9);
                    return;
                }
                return;
        }
    }
}
