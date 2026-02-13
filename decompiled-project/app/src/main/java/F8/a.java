package F8;

import Db.q;
import E6.b;
import Eb.p;
import M1.C0405u;
import N6.B;
import N6.t0;
import P4.G;
import P4.Y;
import P4.m0;
import Y.k;
import Y3.d;
import Z9.C0665b;
import Z9.C0666c;
import Z9.C0668e;
import Z9.C0669f;
import Z9.C0670g;
import Z9.D;
import Z9.E;
import Z9.t;
import a1.i;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Point;
import android.os.Trace;
import b4.C0838i;
import cc.AbstractC0920a;
import cc.C0927d0;
import cc.F;
import cc.K0;
import cc.P;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.tasks.OnFailureListener;
import com.kt.apps.core.tv.datasource.impl.MainTVDataSource$TVChannelUrlType;
import com.kt.apps.core.tv.model.TVChannel;
import com.kt.apps.core.tv.model.TVChannelLinkStream;
import com.kt.apps.core.tv.viewmodels.BaseTVChannelViewModel;
import com.kt.apps.core.utils.UtilsKt;
import com.kt.apps.core.workers.AutoRefreshExtensionsChannelWorker;
import com.kt.apps.core.workers.TVEpgWorkers;
import da.C1065c;
import e4.EnumC1087c;
import gb.h;
import gb.j;
import gb.r;
import h3.H;
import h3.o;
import h3.s;
import h3.x;
import i4.C1345a;
import i4.C1346b;
import i4.e;
import i4.f;
import i4.g;
import j4.InterfaceC1376b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import jb.InterfaceC1390a;
import jc.C1397a;
import jc.C1398b;
import jc.C1399c;
import k5.n;
import kb.C1436a;
import kb.EnumC1437b;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.v;
import l7.C1511c;
import m4.L;
import ob.C1836d;
import ob.C1837e;
import okhttp3.FormBody;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.connection.RealCall;
import org.json.JSONArray;
import org.json.JSONObject;
import p7.C1857a;
import p7.c;
import r7.C1949e;
import sb.C2010d;
import tb.C2037a;
import tss.t.securelib.VtvUtils;
import u.C2054g;
import va.C2161e;
import y7.u0;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements c, InterfaceC1390a, j, OnFailureListener, a1.j, InterfaceC1376b, e, r, gb.c, h, n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4175a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4176b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4177c;

    public /* synthetic */ a(int i7, Object obj, Object obj2) {
        this.f4175a = i7;
        this.f4176b = obj;
        this.f4177c = obj2;
    }

    public /* synthetic */ a(String str, int i7, Object obj) {
        this.f4175a = i7;
        this.f4177c = obj;
        this.f4176b = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ a(ExecutorService executorService, Rb.a aVar) {
        this.f4175a = 17;
        this.f4176b = executorService;
        this.f4177c = (m) aVar;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [Rb.a, kotlin.jvm.internal.m] */
    @Override // a1.j
    public Object a(i iVar) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        s sVar = new s(atomicBoolean, 1);
        h3.n nVar = h3.n.f17701a;
        a1.n nVar2 = iVar.f12473c;
        if (nVar2 != null) {
            nVar2.a(sVar, nVar);
        }
        ((ExecutorService) this.f4176b).execute(new G(atomicBoolean, iVar, (m) this.f4177c));
        return q.f3365a;
    }

    @Override // i4.e
    public Object apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        g gVar = (g) this.f4176b;
        C1345a c1345a = gVar.f18415d;
        int i7 = c1345a.f18402b;
        C0838i c0838i = (C0838i) this.f4177c;
        ArrayList K10 = gVar.K(sQLiteDatabase, c0838i, i7);
        for (d dVar : d.values()) {
            if (dVar != c0838i.f13861c) {
                int size = c1345a.f18402b - K10.size();
                if (size <= 0) {
                    break;
                }
                K10.addAll(gVar.K(sQLiteDatabase, c0838i.b(dVar), size));
            }
        }
        HashMap hashMap = new HashMap();
        StringBuilder sb2 = new StringBuilder("event_id IN (");
        for (int i10 = 0; i10 < K10.size(); i10++) {
            sb2.append(((C1346b) K10.get(i10)).f18406a);
            if (i10 < K10.size() - 1) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        Cursor query = sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb2.toString(), null, null, null, null);
        while (query.moveToNext()) {
            try {
                long j = query.getLong(0);
                Set set = (Set) hashMap.get(Long.valueOf(j));
                if (set == null) {
                    set = new HashSet();
                    hashMap.put(Long.valueOf(j), set);
                }
                set.add(new f(query.getString(1), query.getString(2)));
            } catch (Throwable th) {
                query.close();
                throw th;
            }
        }
        query.close();
        ListIterator listIterator = K10.listIterator();
        while (listIterator.hasNext()) {
            C1346b c1346b = (C1346b) listIterator.next();
            if (hashMap.containsKey(Long.valueOf(c1346b.f18406a))) {
                k c10 = c1346b.f18408c.c();
                long j10 = c1346b.f18406a;
                for (f fVar : (Set) hashMap.get(Long.valueOf(j10))) {
                    c10.b(fVar.f18409a, fVar.f18410b);
                }
                listIterator.set(new C1346b(j10, c1346b.f18407b, c10.d()));
            }
        }
        return K10;
    }

    @Override // gb.c
    public void b(C1836d c1836d) {
        AbstractC0920a c1398b = new C1398b(F.C(C0927d0.f14526a, (Hb.i) this.f4176b), c1836d, 0);
        EnumC1437b.i(c1836d, new C1436a(new C1397a(c1398b)));
        c1398b.Y(1, c1398b, (N2.a) this.f4177c);
    }

    @Override // gb.r
    public void c(C2037a c2037a) {
        switch (this.f4175a) {
            case 22:
                TVEpgWorkers tVEpgWorkers = (TVEpgWorkers) this.f4177c;
                tVEpgWorkers.g.a(new M9.d("DEFAULT", "DEFAULT", M9.c.f6846a), (String) this.f4176b);
                tVEpgWorkers.g.f();
                c2037a.c(x.a());
                return;
            default:
                AbstractC0920a c1398b = new C1398b(F.C(C0927d0.f14526a, (Hb.i) this.f4176b), c2037a, 2);
                EnumC1437b.i(c2037a, new C1436a(new C1397a(c1398b)));
                c1398b.Y(1, c1398b, (N2.c) this.f4177c);
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v20, types: [q3.i, java.lang.Object, okhttp3.Callback] */
    @Override // gb.j
    public void d(C2010d c2010d) {
        HttpUrl httpUrl;
        String obj;
        TVChannel.Url fromUrl;
        String optString;
        String optString2;
        TVChannel.Url fromUrl2;
        TVChannel.Url fromUrl3;
        String str;
        Object n6;
        String str2;
        Object tVChannelLinkStream;
        TVChannel.Url fromUrl4;
        switch (this.f4175a) {
            case 6:
                TVChannel tVChannel = (TVChannel) this.f4176b;
                vc.e b2 = c2.i.h(tVChannel.getTvChannelWebDetailPage()).b();
                l.d(b2, "execute(...)");
                xc.l p02 = b2.h().p0();
                C0669f c0669f = (C0669f) this.f4177c;
                Map map = (Map) c0669f.f12272c.getValue();
                LinkedHashMap linkedHashMap = b2.f25454d;
                l.d(linkedHashMap, "cookies(...)");
                map.putAll(linkedHashMap);
                zc.e i02 = p02.i0("script");
                l.d(i02, "getElementsByTag(...)");
                Iterator it = i02.iterator();
                String str3 = null;
                while (it.hasNext()) {
                    String j02 = ((xc.l) it.next()).j0();
                    l.d(j02, "html(...)");
                    if (ac.g.b0(j02, "var link_stream = iosUrl")) {
                        Matcher matcher = Pattern.compile("(?<=var\\slink_stream\\s=\\siosUrl\\s=).*?(\".*?\")").matcher(j02);
                        while (matcher.find()) {
                            String group = matcher.group(0);
                            str3 = (group == null || (obj = ac.g.v0(group).toString()) == null) ? null : ac.g.n0(ac.g.o0(obj, "\""), "\"");
                            if (str3 != null) {
                                HttpUrl.j.getClass();
                                try {
                                    httpUrl = HttpUrl.Companion.b(str3);
                                } catch (IllegalArgumentException unused) {
                                    httpUrl = null;
                                }
                                if (httpUrl != null) {
                                    break;
                                }
                            }
                        }
                    }
                }
                if (str3 == null) {
                    c2010d.onError(new Throwable("Cannot get stream link"));
                    return;
                }
                C0665b c0665b = new C0665b(c2010d, tVChannel, 0);
                C0666c c0666c = new C0666c(c2010d, 0);
                Request.Builder builder = new Request.Builder();
                FormBody.Builder builder2 = new FormBody.Builder(0);
                builder2.a("url", str3);
                builder2.a("type", "1");
                builder2.a("is_mobile", "1");
                builder2.a("csrf_test_name", "");
                builder.d(new FormBody(builder2.f22324a, builder2.f22325b));
                builder.e(c0669f.c().getBaseUrl() + c0669f.c().getGetLinkStreamPath());
                builder.b("cookie", UtilsKt.buildCookie((Map) c0669f.f12272c.getValue()));
                builder.b("Origin", c0669f.c().getBaseUrl());
                builder.b("Referer", tVChannel.getTvChannelWebDetailPage());
                RealCall b10 = c0669f.f12270a.b(new Request(builder));
                ?? obj2 = new Object();
                obj2.f23382a = c0666c;
                obj2.f23383b = c0669f;
                obj2.f23384c = tVChannel;
                obj2.f23385d = c0665b;
                b10.d(obj2);
                return;
            case 7:
                if (c2010d.g()) {
                    return;
                }
                String valueOf = String.valueOf(System.currentTimeMillis() / 1000);
                C0670g c0670g = (C0670g) this.f4176b;
                c0670g.getClass();
                Request.Builder builder3 = new Request.Builder();
                builder3.e("https://hungyentv.vn/schedule/video/" + valueOf);
                builder3.b("Origin", "https://hungyentv.vn");
                builder3.b("Referer", "https://hungyentv.vn/");
                FormBody.Builder builder4 = new FormBody.Builder(0);
                builder4.b("item_id", "");
                builder3.d(new FormBody(builder4.f22324a, builder4.f22325b));
                Request request = new Request(builder3);
                ArrayList arrayList = new ArrayList();
                OkHttpClient.Builder a9 = c0670g.f12274a.a();
                a9.f22398i = true;
                Response e2 = new OkHttpClient(a9).b(request).e();
                if (e2.f22438C) {
                    JSONArray optJSONArray = new JSONObject(e2.f22445u.K()).optJSONArray("items");
                    if (optJSONArray == null) {
                        throw new IllegalStateException("Empty items found!");
                    }
                    int length = optJSONArray.length();
                    for (int i7 = 0; i7 < length; i7++) {
                        JSONObject optJSONObject = optJSONArray.optJSONObject(i7);
                        if (optJSONObject != null && (optString = optJSONObject.optString("ott_url")) != null && optString.length() != 0 && ac.g.b0(optString, "m3u8")) {
                            arrayList.add(optString);
                        }
                    }
                }
                if (arrayList.isEmpty()) {
                    throw new IllegalStateException("Empty link stream found!");
                }
                ArrayList arrayList2 = new ArrayList(p.S(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    fromUrl = TVChannel.Url.Companion.fromUrl((String) it2.next(), (r15 & 2) != 0 ? MainTVDataSource$TVChannelUrlType.STREAM.getValue() : null, (r15 & 4) != 0 ? null : null, (r15 & 8) != 0 ? null : null, (r15 & 16) != 0 ? null : null, (r15 & 32) != 0 ? null : null, (r15 & 64) == 0 ? null : null);
                    arrayList2.add(fromUrl);
                }
                c2010d.d(new TVChannelLinkStream((TVChannel) this.f4177c, arrayList2));
                c2010d.a();
                return;
            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                t tVar = (t) this.f4176b;
                OkHttpClient okHttpClient = tVar.f12310a;
                Request.Builder builder5 = new Request.Builder();
                TVChannel tVChannel2 = (TVChannel) this.f4177c;
                builder5.e("https://api.m.onlive.vn/broad/a/watch?bjid=" + tVChannel2.getChannelId());
                FormBody.Builder builder6 = new FormBody.Builder(0);
                builder6.a("bj_id", tVChannel2.getChannelId());
                builder6.a("broad_no", "0");
                builder6.a("agent", "web");
                builder6.a("confirm_adult", "false");
                builder6.a("player_type", "webm");
                builder6.a("mode", "live");
                builder5.d(new FormBody(builder6.f22324a, builder6.f22325b));
                Response e10 = okHttpClient.b(new Request(builder5)).e();
                tVar.c(e10);
                JSONObject jSONObject = new JSONObject(e10.f22445u.K());
                if (jSONObject.optInt("code") == -1) {
                    JSONObject optJSONObject2 = jSONObject.optJSONObject("data");
                    optString2 = optJSONObject2 != null ? optJSONObject2.optString("message") : null;
                    throw new IllegalStateException(optString2 != null ? optString2 : "No Live Player found");
                }
                JSONObject optJSONObject3 = jSONObject.optJSONObject("data");
                String optString3 = optJSONObject3 != null ? optJSONObject3.optString("broad_no") : null;
                JSONObject optJSONObject4 = jSONObject.optJSONObject("data");
                String optString4 = optJSONObject4 != null ? optJSONObject4.optString("resource_manager_url") : null;
                JSONObject optJSONObject5 = jSONObject.optJSONObject("data");
                String optString5 = optJSONObject5 != null ? optJSONObject5.optString("hls_authentication_key") : null;
                if (optString4 == null || optString4.length() == 0) {
                    JSONObject optJSONObject6 = jSONObject.optJSONObject("data");
                    optString2 = optJSONObject6 != null ? optJSONObject6.optString("message") : null;
                    throw new IllegalStateException(optString2 != null ? optString2 : "No Live Player found");
                }
                Request.Builder builder7 = new Request.Builder();
                HttpUrl.j.getClass();
                HttpUrl.Builder f4 = HttpUrl.Companion.b(optString4).f();
                f4.a("return_type", "gs_cdn_mobile_web");
                f4.a("use_cors", "true");
                f4.a("cors_origin_url", "m.onlive.vn");
                f4.a("broad_key", optString3 + "-common-hd-hls");
                builder7.f22430a = f4.b();
                Response e11 = tVar.f12310a.b(new Request(builder7)).e();
                tVar.c(e11);
                String optString6 = new JSONObject(e11.f22445u.K()).optString("view_url");
                l.b(optString6);
                fromUrl2 = TVChannel.Url.Companion.fromUrl(X.c.h(optString6, X.c.t(ac.n.S(optString6, "?", false) ? "aid=" : ac.g.b0(optString6, "?") ? "&aid=" : "?aid=", optString5)), (r15 & 2) != 0 ? MainTVDataSource$TVChannelUrlType.STREAM.getValue() : null, (r15 & 4) != 0 ? null : null, (r15 & 8) != 0 ? null : null, (r15 & 16) != 0 ? null : null, (r15 & 32) != 0 ? null : null, (r15 & 64) == 0 ? null : null);
                c2010d.d(new TVChannelLinkStream(tVChannel2, u0.x(fromUrl2)));
                c2010d.a();
                return;
            case 9:
            default:
                C0927d0 c0927d0 = C0927d0.f14526a;
                K0 k02 = P.f14499b;
                k02.getClass();
                EnumC1437b.i(c2010d, new C1436a(new C1397a(F.A(c0927d0, b.w(k02, (Hb.i) this.f4176b), 3, new C1399c((C0405u) this.f4177c, c2010d, null)))));
                return;
            case 10:
                TVChannel tVChannel3 = (TVChannel) this.f4177c;
                D t5 = (D) this.f4176b;
                l.e(t5, "t");
                ConcurrentHashMap concurrentHashMap = t5.f12234c;
                try {
                    if (concurrentHashMap.isEmpty()) {
                        vc.f h10 = c2.i.h("https://vieon.vn/");
                        h10.a(concurrentHashMap);
                        concurrentHashMap.putAll(h10.b().f25454d);
                    }
                    vc.f h11 = c2.i.h(tVChannel3.getTvChannelWebDetailPage());
                    vc.d dVar = h11.f25473a;
                    h11.a(concurrentHashMap);
                    dVar.d("accept", "application/json, text/javascript, */*; q=0.01");
                    dVar.d("accept-encoding", "gzip, deflate, br");
                    dVar.d("accept-language", "en-US,en;q=0.9,vi;q=0.8");
                    dVar.d("cache-control", "no-cache");
                    dVar.d("pragma", "no-cache");
                    dVar.d("user-agent", "Mozilla/5.0 (Linux; Android 10; SM-A205U) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/90.0.4430.210 Mobile Safari/537.36");
                    dVar.d("referer", tVChannel3.getTvChannelWebDetailPage());
                    dVar.d("origin", UtilsKt.getBaseUrl(tVChannel3.getTvChannelWebDetailPage()));
                    vc.e b11 = h11.b();
                    concurrentHashMap.putAll(b11.f25454d);
                    Object p03 = b11.h().p0();
                    if (c2010d.g()) {
                        return;
                    }
                    c2010d.d(p03);
                    c2010d.a();
                    return;
                } catch (Exception e12) {
                    if (c2010d.g()) {
                        return;
                    }
                    c2010d.onError(e12);
                    return;
                }
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                TVChannel tVChannel4 = (TVChannel) this.f4176b;
                E e13 = (E) this.f4177c;
                try {
                    vc.e b12 = c2.i.h(tVChannel4.getTvChannelWebDetailPage()).b();
                    l.d(b12, "execute(...)");
                    LinkedHashMap linkedHashMap2 = e13.f12237b;
                    LinkedHashMap linkedHashMap3 = b12.f25454d;
                    l.d(linkedHashMap3, "cookies(...)");
                    linkedHashMap2.putAll(linkedHashMap3);
                    xc.l p04 = b12.h().p0();
                    ArrayList arrayList3 = new ArrayList();
                    zc.e m02 = p04.m0("script");
                    l.d(m02, "select(...)");
                    Iterator it3 = m02.iterator();
                    while (it3.hasNext()) {
                        Matcher matcher2 = Pattern.compile("(?<=url: \").*?(?=\")").matcher(((xc.l) it3.next()).j0());
                        while (matcher2.find()) {
                            String group2 = matcher2.group(0);
                            if (group2 != null) {
                                arrayList3.add(group2);
                            }
                        }
                    }
                    ArrayList arrayList4 = new ArrayList(p.S(arrayList3, 10));
                    Iterator it4 = arrayList3.iterator();
                    while (it4.hasNext()) {
                        fromUrl3 = TVChannel.Url.Companion.fromUrl((String) it4.next(), (r15 & 2) != 0 ? MainTVDataSource$TVChannelUrlType.STREAM.getValue() : null, (r15 & 4) != 0 ? null : null, (r15 & 8) != 0 ? null : null, (r15 & 16) != 0 ? null : null, (r15 & 32) != 0 ? null : null, (r15 & 64) == 0 ? null : null);
                        arrayList4.add(fromUrl3);
                    }
                    c2010d.d(new TVChannelLinkStream(tVChannel4, arrayList4));
                    c2010d.a();
                    return;
                } catch (Exception e14) {
                    c2010d.onError(e14);
                    return;
                }
            case 12:
                String str4 = (String) this.f4176b;
                Z9.F f10 = (Z9.F) this.f4177c;
                try {
                    vc.f h12 = c2.i.h(str4);
                    h12.a(f10.f12242c);
                    vc.e b13 = h12.b();
                    l.b(b13);
                    LinkedHashMap linkedHashMap4 = f10.f12242c;
                    linkedHashMap4.clear();
                    LinkedHashMap linkedHashMap5 = b13.f25454d;
                    l.d(linkedHashMap5, "cookies(...)");
                    linkedHashMap4.putAll(linkedHashMap5);
                    xc.l p05 = b13.h().p0();
                    ArrayList arrayList5 = new ArrayList();
                    vc.i.A("list_channel");
                    zc.e m10 = H.m(new zc.h("list_channel", 2, false), p05);
                    l.d(m10, "getElementsByClass(...)");
                    Iterator it5 = m10.iterator();
                    while (it5.hasNext()) {
                        xc.l lVar = (xc.l) ((xc.l) it5.next()).i0("a").b();
                        l.b(lVar);
                        String o10 = lVar.o("href");
                        l.d(o10, "attr(...)");
                        String o11 = lVar.o("alt");
                        l.d(o11, "attr(...)");
                        xc.l lVar2 = (xc.l) lVar.i0("img").b();
                        l.b(lVar2);
                        String o12 = lVar2.o("src");
                        l.d(o12, "attr(...)");
                        Matcher matcher3 = Pattern.compile("[*?<=vtv\\d]*?(\\d+)").matcher(o10);
                        ArrayList arrayList6 = new ArrayList();
                        while (matcher3.find()) {
                            String group3 = matcher3.group(0);
                            if (group3 != null) {
                                arrayList6.add(group3);
                            }
                        }
                        if (arrayList6.isEmpty()) {
                            str = null;
                        } else {
                            try {
                                str = (String) arrayList6.get(1);
                            } catch (Exception unused2) {
                                Locale locale = Locale.ROOT;
                                String lowerCase = o11.toLowerCase(locale);
                                l.d(lowerCase, "toLowerCase(...)");
                                String lowerCase2 = ac.n.W(ac.n.W(lowerCase, "[^\\dA-Za-z ]", ""), "\\s+", "+").toLowerCase(locale);
                                l.d(lowerCase2, "toLowerCase(...)");
                                str = ac.g.v0(ac.g.o0(lowerCase2, "hd")).toString();
                            }
                        }
                        if (str == null) {
                            String lowerCase3 = ac.n.W(o11, " ", "").toLowerCase(Locale.ROOT);
                            l.d(lowerCase3, "toLowerCase(...)");
                            str = ac.g.o0(lowerCase3, "hd");
                        }
                        arrayList5.add(new TVChannel("VTV", o12, o11, o10, "VTV_BACKUP", str, null, false, null, 0, 960, null));
                    }
                    if (c2010d.g()) {
                        return;
                    }
                    c2010d.d(arrayList5);
                    f10.f12241b.e("VTV_BACKUP", arrayList5);
                    U9.m C2 = f10.f12240a.C();
                    ArrayList arrayList7 = new ArrayList(p.S(arrayList5, 10));
                    Iterator it6 = arrayList5.iterator();
                    while (it6.hasNext()) {
                        TVChannel tVChannel5 = (TVChannel) it6.next();
                        arrayList7.add(new W9.d(tVChannel5.getChannelId(), tVChannel5.getTvChannelName(), tVChannel5.getSourceFrom(), tVChannel5.getTvGroup()));
                    }
                    C2.getClass();
                    C1837e g = android.support.v4.media.session.b.g(C2.f9902a, new Aa.t(13, C2, arrayList7));
                    nb.e eVar = new nb.e(0, C0668e.f12268w, new Y(18));
                    g.c(eVar);
                    new C2054g().a(eVar);
                    c2010d.a();
                    return;
                } catch (Exception e15) {
                    if (c2010d.g()) {
                        return;
                    }
                    C1949e c1949e = (C1949e) Y6.i.e().c(C1949e.class);
                    if (c1949e == null) {
                        throw new NullPointerException("FirebaseCrashlytics component is not present.");
                    }
                    Map emptyMap = Collections.emptyMap();
                    v7.p pVar = c1949e.f23806a;
                    pVar.f25161o.f25819a.a(new G(pVar, e15, emptyMap, 13));
                    if (e15 instanceof IOException) {
                        c2010d.onError(e15);
                        return;
                    } else {
                        c2010d.onError(new Throwable(X.c.t("Error when connect to ", str4)));
                        return;
                    }
                }
            case 13:
                Z9.F f11 = (Z9.F) this.f4176b;
                TVChannel tVChannel6 = (TVChannel) this.f4177c;
                try {
                    String str5 = "https:" + VtvUtils.f24560a.getLinkLive(ac.g.o0(ac.g.o0(ac.g.o0(tVChannel6.getChannelId(), "hd"), "-"), "-hd"), true);
                    OkHttpClient okHttpClient2 = f11.f12244e;
                    Request.Builder builder8 = new Request.Builder();
                    builder8.e(str5);
                    Response e16 = okHttpClient2.b(new Request(builder8)).e();
                    while (true) {
                        List list = (List) Z9.F.f12239f.getValue();
                        int i10 = e16.f22442d;
                        Headers headers = e16.f22444f;
                        if (list.contains(Integer.valueOf(i10))) {
                            String b14 = headers.b("Location");
                            if (b14 == null) {
                                b14 = headers.b("location");
                            }
                            if (b14 != null && ac.g.b0(b14, ".m3u8")) {
                                str2 = b14;
                            }
                        } else {
                            str2 = str5;
                        }
                    }
                    fromUrl4 = TVChannel.Url.Companion.fromUrl(str2, (r15 & 2) != 0 ? MainTVDataSource$TVChannelUrlType.STREAM.getValue() : null, (r15 & 4) != 0 ? null : null, (r15 & 8) != 0 ? null : tVChannel6.getTvChannelWebDetailPage(), (r15 & 16) != 0 ? null : UtilsKt.getBaseUrl(tVChannel6.getTvChannelWebDetailPage()), (r15 & 32) != 0 ? null : null, (r15 & 64) == 0 ? null : null);
                    tVChannelLinkStream = new TVChannelLinkStream(tVChannel6, u0.x(fromUrl4));
                } catch (Throwable th) {
                    n6 = com.bumptech.glide.c.n(th);
                }
                if (c2010d.g()) {
                    return;
                }
                c2010d.d(tVChannelLinkStream);
                c2010d.a();
                n6 = q.f3365a;
                Throwable a10 = Db.m.a(n6);
                if (a10 == null || c2010d.g()) {
                    return;
                }
                c2010d.onError(a10);
                return;
        }
    }

    @Override // j4.InterfaceC1376b
    public Object e() {
        switch (this.f4175a) {
            case 18:
                g gVar = (g) ((h4.i) this.f4176b).f17750c;
                gVar.getClass();
                Iterable iterable = (Iterable) this.f4177c;
                if (!iterable.iterator().hasNext()) {
                    return null;
                }
                gVar.l().compileStatement("DELETE FROM events WHERE _id in " + g.U(iterable)).execute();
                return null;
            default:
                h4.i iVar = (h4.i) this.f4176b;
                iVar.getClass();
                Iterator it = ((HashMap) this.f4177c).entrySet().iterator();
                while (it.hasNext()) {
                    ((g) iVar.f17755i).P(((Integer) r2.getValue()).intValue(), EnumC1087c.INVALID_PAYLOD, (String) ((Map.Entry) it.next()).getKey());
                }
                return null;
        }
    }

    @Override // gb.h
    public void f(qb.c cVar) {
        AbstractC0920a c1398b = new C1398b(F.C(C0927d0.f14526a, (Hb.i) this.f4176b), cVar, 1);
        EnumC1437b.i(cVar, new C1436a(new C1397a(c1398b)));
        c1398b.Y(1, c1398b, (N2.b) this.f4177c);
    }

    @Override // p7.c
    public Object g(T6.a aVar) {
        switch (this.f4175a) {
            case 0:
                String str = (String) this.f4176b;
                C1857a c1857a = (C1857a) this.f4177c;
                try {
                    Trace.beginSection(str);
                    return c1857a.f23123f.g(aVar);
                } finally {
                    Trace.endSection();
                }
            default:
                return new C1511c((Y6.i) aVar.a(Y6.i.class), (Executor) aVar.g((p7.p) this.f4176b), (Executor) aVar.g((p7.p) this.f4177c));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a7  */
    @Override // k5.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public t0 h(int i7, m0 m0Var, int[] iArr) {
        int i10;
        int i11;
        Object[] objArr;
        int i12;
        int i13;
        int i14;
        int i15;
        Point point;
        int i16;
        int i17;
        Object[] objArr2;
        Object obj = this.f4176b;
        Object obj2 = this.f4177c;
        int i18 = 4;
        boolean z8 = true;
        switch (this.f4175a) {
            case 27:
                int i19 = ((int[]) obj2)[i7];
                k5.i iVar = (k5.i) obj;
                int i20 = iVar.f19013w;
                if (i20 == Integer.MAX_VALUE || (i12 = iVar.f19014x) == Integer.MAX_VALUE) {
                    i18 = 4;
                    i10 = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
                } else {
                    int i21 = Integer.MAX_VALUE;
                    int i22 = 0;
                    while (i22 < m0Var.f8106a) {
                        L l10 = m0Var.f8109d[i22];
                        int i23 = l10.f20068E;
                        if (i23 > 0 && (i13 = l10.f20069F) > 0) {
                            if (iVar.f19015y) {
                                if ((i23 > i13 ? z8 : false) != (i20 > i12 ? z8 : false)) {
                                    i15 = i20;
                                    i14 = i12;
                                    int i24 = i23 * i15;
                                    int i25 = i13 * i14;
                                    point = i24 < i25 ? new Point(i14, n5.D.f(i25, i23)) : new Point(n5.D.f(i24, i13), i15);
                                    i16 = l10.f20068E;
                                    i17 = i16 * i13;
                                    if (i16 >= ((int) (point.x * 0.98f)) && i13 >= ((int) (point.y * 0.98f)) && i17 < i21) {
                                        i21 = i17;
                                    }
                                }
                            }
                            i14 = i20;
                            i15 = i12;
                            int i242 = i23 * i15;
                            int i252 = i13 * i14;
                            if (i242 < i252) {
                            }
                            i16 = l10.f20068E;
                            i17 = i16 * i13;
                            if (i16 >= ((int) (point.x * 0.98f))) {
                                i21 = i17;
                            }
                        }
                        i22++;
                        z8 = true;
                        i18 = 4;
                    }
                    i10 = i21;
                }
                N6.r.e(i18, "initialCapacity");
                Object[] objArr3 = new Object[i18];
                int i26 = 0;
                int i27 = 0;
                boolean z10 = false;
                while (i26 < m0Var.f8106a) {
                    int b2 = m0Var.f8109d[i26].b();
                    k5.p pVar = new k5.p(i7, m0Var, i26, iVar, iArr[i26], i19, i10 == Integer.MAX_VALUE || (b2 != -1 && b2 <= i10));
                    int i28 = i27 + 1;
                    if (objArr3.length < i28) {
                        objArr = Arrays.copyOf(objArr3, B.f(objArr3.length, i28));
                    } else if (z10) {
                        objArr = (Object[]) objArr3.clone();
                    } else {
                        i11 = 1;
                        objArr3[i27] = pVar;
                        i26 += i11;
                        i27++;
                    }
                    objArr3 = objArr;
                    i11 = 1;
                    z10 = false;
                    objArr3[i27] = pVar;
                    i26 += i11;
                    i27++;
                }
                return N6.H.D(i27, objArr3);
            default:
                N6.F f4 = N6.H.f7232b;
                N6.r.e(4, "initialCapacity");
                Object[] objArr4 = new Object[4];
                int i29 = 0;
                int i30 = 0;
                boolean z11 = false;
                while (i29 < m0Var.f8106a) {
                    k5.m mVar = new k5.m(i7, m0Var, i29, (k5.i) obj2, iArr[i29], (String) obj);
                    int i31 = i30 + 1;
                    if (objArr4.length < i31) {
                        objArr2 = Arrays.copyOf(objArr4, B.f(objArr4.length, i31));
                    } else if (z11) {
                        objArr2 = (Object[]) objArr4.clone();
                    } else {
                        objArr4[i30] = mVar;
                        i29++;
                        i30++;
                    }
                    objArr4 = objArr2;
                    z11 = false;
                    objArr4[i30] = mVar;
                    i29++;
                    i30++;
                }
                return N6.H.D(i30, objArr4);
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception it) {
        l.e(it, "it");
        ((AtomicInteger) this.f4176b).incrementAndGet();
        C2010d c2010d = (C2010d) this.f4177c;
        if (c2010d.g()) {
            return;
        }
        c2010d.onError(it);
    }

    @Override // jb.InterfaceC1390a
    public void run() {
        switch (this.f4175a) {
            case 1:
                C2161e c2161e = (C2161e) this.f4176b;
                if (c2161e.a().d() instanceof y9.G) {
                    return;
                }
                M9.d dVar = (M9.d) this.f4177c;
                c2.q.o(c2161e.f25317d, dVar.f6851b, dVar.f6850a, new Db.j[0]);
                c2161e.a().l(new y9.G(dVar));
                return;
            case 3:
                StringBuilder sb2 = new StringBuilder();
                String str = (String) this.f4176b;
                String message = o.p(sb2, str, " - Complete insert");
                M9.k t5 = (M9.k) this.f4177c;
                l.e(t5, "t");
                l.e(message, "message");
                ((ConcurrentHashMap) t5.f6880h.getValue()).remove(str);
                t5.e().remove(str);
                t5.f();
                return;
            case 4:
                String message2 = "Complete epg: {config: " + ((M9.d) this.f4177c).f6851b + ", }";
                l.e((M9.k) this.f4176b, "t");
                l.e(message2, "message");
                return;
            case 5:
                Map map = (Map) ((P9.c) this.f4176b).f8258d.getValue();
                W9.c cVar = (W9.c) this.f4177c;
                map.remove(cVar.f10858a);
                String.valueOf(cVar);
                return;
            case 14:
                C1065c c1065c = (C1065c) this.f4176b;
                ArrayList arrayList = (ArrayList) this.f4177c;
                c1065c.f16612d.lock();
                try {
                    c1065c.g = null;
                    c1065c.setCacheData(arrayList);
                    c1065c.f16614f.set(false);
                    c1065c.f16613e.signalAll();
                    return;
                } finally {
                    c1065c.f16612d.unlock();
                }
            case 15:
                BaseTVChannelViewModel.getListTVChannel$lambda$3((BaseTVChannelViewModel) this.f4176b, (ArrayList) this.f4177c);
                return;
            case 16:
                BaseTVChannelViewModel.getLinkStreamForChannel$lambda$5((v) this.f4176b, (BaseTVChannelViewModel) this.f4177c);
                return;
            default:
                M9.d dVar2 = (M9.d) this.f4177c;
                String message3 = "Complete refresh extensions: " + dVar2.f6851b;
                AutoRefreshExtensionsChannelWorker t10 = (AutoRefreshExtensionsChannelWorker) this.f4176b;
                l.e(t10, "t");
                l.e(message3, "message");
                O5.b.H(t10.f16175f, dVar2);
                return;
        }
    }
}
