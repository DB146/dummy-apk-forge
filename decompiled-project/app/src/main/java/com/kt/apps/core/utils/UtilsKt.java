package com.kt.apps.core.utils;

import Db.m;
import Eb.B;
import ac.n;
import android.net.Uri;
import com.kt.apps.media.xemtv.App;
import h3.o;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Calendar;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;
import jb.InterfaceC1393d;
import okhttp3.HttpUrl;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* loaded from: classes2.dex */
public final class UtilsKt {
    private static final int DAY_MILLIS = 86400000;
    public static final int HOUR_MILLIS = 3600000;
    private static final int MINUTE_MILLIS = 60000;
    private static final int SECOND_MILLIS = 1000;

    public static final String buildCookie(Map<String, String> map) {
        kotlin.jvm.internal.l.e(map, "<this>");
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            sb2.append(entry.getKey());
            sb2.append("=");
            sb2.append(entry.getValue());
            sb2.append("; ");
        }
        String sb3 = sb2.toString();
        kotlin.jvm.internal.l.d(sb3, "toString(...)");
        return ac.g.o0(ac.g.v0(sb3).toString(), ";");
    }

    public static final String decompress(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        Charset forName = Charset.forName("UTF-8");
        kotlin.jvm.internal.l.d(forName, "forName(...)");
        byte[] bytes = str.getBytes(forName);
        kotlin.jvm.internal.l.d(bytes, "getBytes(...)");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new GZIPInputStream(new ByteArrayInputStream(bytes)), "UTF-8"));
        String str2 = "";
        while (true) {
            String readLine = bufferedReader.readLine();
            kotlin.jvm.internal.l.b(readLine);
            str2 = str2 + ((Object) readLine);
        }
    }

    public static final void doOnSuccess(Response response, Rb.c success, Rb.c error) {
        ResponseBody responseBody;
        kotlin.jvm.internal.l.e(response, "<this>");
        kotlin.jvm.internal.l.e(success, "success");
        kotlin.jvm.internal.l.e(error, "error");
        int i7 = response.f22442d;
        if (!response.f22438C || 200 > i7 || i7 >= 300 || (responseBody = response.f22445u) == null) {
            error.invoke(new Throwable(o.l(i7, "Not success with code: ")));
        } else {
            success.invoke(responseBody);
        }
    }

    public static final int dpToPx(int i7) {
        App app = App.f16183y;
        if (app != null) {
            return (int) (app.getResources().getDisplayMetrics().scaledDensity * i7);
        }
        kotlin.jvm.internal.l.j("app");
        throw null;
    }

    public static final String getBaseUrl(String str) {
        Object n6;
        kotlin.jvm.internal.l.e(str, "<this>");
        try {
            HttpUrl.j.getClass();
            n6 = toOrigin(HttpUrl.Companion.b(str));
        } catch (Throwable th) {
            n6 = com.bumptech.glide.c.n(th);
        }
        if (m.a(n6) != null) {
            Uri parse = Uri.parse(str);
            n6 = X.c.j(parse.getScheme(), "://", parse.getHost(), "/");
        }
        return (String) n6;
    }

    public static final Map<String, String> getHeaderFromLinkStream(String referer, String host) {
        kotlin.jvm.internal.l.e(referer, "referer");
        kotlin.jvm.internal.l.e(host, "host");
        LinkedHashMap I6 = B.I(new Db.j("accept-encoding", "gzip, deflate, br"), new Db.j("accept-language", "vi-VN,vi;q=0.9,fr-FR;q=0.8,fr;q=0.7,en-US;q=0.6,en;q=0.5,am;q=0.4,en-AU;q=0.3"), new Db.j("origin", ac.g.v0(getBaseUrl(referer)).toString().length() > 0 ? getBaseUrl(referer) : ac.g.o0(referer, "/")), new Db.j("referer", referer), new Db.j("sec-fetch-dest", "empty"), new Db.j("sec-fetch-site", "cross-site"), new Db.j("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/106.0.0.0 Safari/537.36"));
        if (host.length() > 0) {
            Uri.parse(host).getHost();
        }
        return I6;
    }

    public static final String getTAG(Object obj) {
        kotlin.jvm.internal.l.e(obj, "<this>");
        String simpleName = obj.getClass().getSimpleName();
        if (simpleName.length() <= 23) {
            return simpleName;
        }
        String substring = simpleName.substring(0, 23);
        kotlin.jvm.internal.l.d(substring, "substring(...)");
        return substring;
    }

    public static final String getTimeAgo(long j) {
        if (j < 1000000000000L) {
            j *= SECOND_MILLIS;
        }
        long timeInMillis = Calendar.getInstance(Locale.getDefault()).getTimeInMillis() - j;
        if (timeInMillis < 60000) {
            return (timeInMillis / SECOND_MILLIS) + "s";
        }
        if (timeInMillis < 120000) {
            return "1m";
        }
        if (timeInMillis < 3000000) {
            return (timeInMillis / MINUTE_MILLIS) + "m";
        }
        if (timeInMillis < 5400000) {
            return "1h";
        }
        if (timeInMillis < 86400000) {
            return (timeInMillis / 3600000) + "hrs";
        }
        if (timeInMillis < 172800000) {
            return "Yesterday";
        }
        return (timeInMillis / DAY_MILLIS) + "d";
    }

    public static final <T> gb.i log(gb.i iVar, Rb.a action, final Rb.c actionLogError) {
        kotlin.jvm.internal.l.e(iVar, "<this>");
        kotlin.jvm.internal.l.e(action, "action");
        kotlin.jvm.internal.l.e(actionLogError, "actionLogError");
        action.invoke();
        new InterfaceC1393d() { // from class: com.kt.apps.core.utils.UtilsKt$log$1
            @Override // jb.InterfaceC1393d
            public final void accept(Throwable it) {
                kotlin.jvm.internal.l.e(it, "it");
                Rb.c.this.invoke(it);
            }
        };
        return iVar;
    }

    public static final String removeAllSpecialChars(String str) {
        kotlin.jvm.internal.l.e(str, "<this>");
        Pattern compile = Pattern.compile("[^0-9a-zA-Z+áàảãạăắằẳẵặâấầẩẫậeéèẻẽẹêếềểễệđíìỉĩịóòỏõọôốồổỗộơớờởỡợúùủũụưứừửữự& ]");
        kotlin.jvm.internal.l.d(compile, "compile(...)");
        String replaceAll = compile.matcher(str).replaceAll("");
        kotlin.jvm.internal.l.d(replaceAll, "replaceAll(...)");
        return ac.g.v0(n.W(n.W(replaceAll, "\\s+", "+"), "-", "")).toString();
    }

    public static final String toOrigin(String str) {
        kotlin.jvm.internal.l.e(str, "<this>");
        HttpUrl.j.getClass();
        return toOrigin(HttpUrl.Companion.b(str));
    }

    public static final String toOrigin(HttpUrl httpUrl) {
        kotlin.jvm.internal.l.e(httpUrl, "<this>");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(httpUrl.f22335a);
        sb2.append("://");
        return o.p(sb2, httpUrl.f22338d, "/");
    }
}
