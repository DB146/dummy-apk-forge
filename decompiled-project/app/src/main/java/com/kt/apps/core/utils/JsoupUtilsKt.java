package com.kt.apps.core.utils;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class JsoupUtilsKt {
    private static final int MAX_RETRY_COUNT = 2;

    public static final uc.a jsoupConnect(String url, Map<String, String> cookie, Db.j[] header, int i7) {
        kotlin.jvm.internal.l.e(url, "url");
        kotlin.jvm.internal.l.e(cookie, "cookie");
        kotlin.jvm.internal.l.e(header, "header");
        if (i7 == 0) {
            throw new L9.d(0);
        }
        try {
            vc.f h10 = c2.i.h(url);
            vc.d dVar = h10.f25473a;
            dVar.f25457h = true;
            dVar.d("User-agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/106.0.0.0 Safari/537.36");
            for (Db.j jVar : header) {
                h10.f25473a.d((String) jVar.f3354a, (String) jVar.f3355b);
            }
            h10.a(cookie);
            return h10;
        } catch (InterruptedException unused) {
            return jsoupConnect$default(url, cookie, (Db.j[]) Arrays.copyOf(header, header.length), 0, 8, null);
        }
    }

    public static /* synthetic */ uc.a jsoupConnect$default(String str, Map map, Db.j[] jVarArr, int i7, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            i7 = 2;
        }
        return jsoupConnect(str, map, jVarArr, i7);
    }

    public static final JsoupResponse jsoupParse(String url, Map<String, String> cookie, Db.j... header) {
        kotlin.jvm.internal.l.e(url, "url");
        kotlin.jvm.internal.l.e(cookie, "cookie");
        kotlin.jvm.internal.l.e(header, "header");
        NetworkUtilsKt.trustEveryone();
        vc.f fVar = (vc.f) jsoupConnect$default(url, cookie, (Db.j[]) Arrays.copyOf(header, header.length), 0, 8, null);
        vc.d dVar = fVar.f25473a;
        dVar.getClass();
        dVar.f25456f = 10000;
        fVar.f25473a.f25457h = true;
        vc.e b2 = fVar.b();
        kotlin.jvm.internal.l.d(b2, "execute(...)");
        xc.l p02 = b2.h().p0();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(cookie);
        LinkedHashMap linkedHashMap2 = b2.f25454d;
        kotlin.jvm.internal.l.d(linkedHashMap2, "cookies(...)");
        linkedHashMap.putAll(linkedHashMap2);
        return new JsoupResponse(p02, linkedHashMap);
    }
}
