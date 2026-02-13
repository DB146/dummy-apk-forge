package com.kt.apps.core.utils;

import java.util.Map;

/* loaded from: classes2.dex */
public final class JsoupResponse {
    private final xc.l body;
    private final Map<String, String> cookie;

    public JsoupResponse(xc.l body, Map<String, String> cookie) {
        kotlin.jvm.internal.l.e(body, "body");
        kotlin.jvm.internal.l.e(cookie, "cookie");
        this.body = body;
        this.cookie = cookie;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ JsoupResponse copy$default(JsoupResponse jsoupResponse, xc.l lVar, Map map, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            lVar = jsoupResponse.body;
        }
        if ((i7 & 2) != 0) {
            map = jsoupResponse.cookie;
        }
        return jsoupResponse.copy(lVar, map);
    }

    public final xc.l component1() {
        return this.body;
    }

    public final Map<String, String> component2() {
        return this.cookie;
    }

    public final JsoupResponse copy(xc.l body, Map<String, String> cookie) {
        kotlin.jvm.internal.l.e(body, "body");
        kotlin.jvm.internal.l.e(cookie, "cookie");
        return new JsoupResponse(body, cookie);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JsoupResponse)) {
            return false;
        }
        JsoupResponse jsoupResponse = (JsoupResponse) obj;
        return kotlin.jvm.internal.l.a(this.body, jsoupResponse.body) && kotlin.jvm.internal.l.a(this.cookie, jsoupResponse.cookie);
    }

    public final xc.l getBody() {
        return this.body;
    }

    public final Map<String, String> getCookie() {
        return this.cookie;
    }

    public int hashCode() {
        return this.cookie.hashCode() + (this.body.hashCode() * 31);
    }

    public String toString() {
        return "JsoupResponse(body=" + this.body + ", cookie=" + this.cookie + ")";
    }
}
