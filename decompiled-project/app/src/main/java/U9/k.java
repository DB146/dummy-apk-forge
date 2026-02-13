package U9;

import Eb.B;
import Z9.C0665b;
import Z9.C0666c;
import Z9.H;
import a0.C0691r;
import com.kt.apps.core.tv.model.TVChannel;
import g3.C1191j;
import java.util.ArrayList;
import java.util.List;
import okhttp3.HttpUrl;
import okhttp3.Request;
import sb.C2010d;
import u.T;
import v2.C2133e;

/* loaded from: classes2.dex */
public final /* synthetic */ class k implements Rb.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9895a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9896b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f9897c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f9898d;

    public /* synthetic */ k(Object obj, Object obj2, Object obj3, int i7) {
        this.f9895a = i7;
        this.f9896b = obj;
        this.f9897c = obj2;
        this.f9898d = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.util.Map, u.T, u.e] */
    @Override // Rb.c
    public final Object invoke(Object obj) {
        T2.c R10;
        W9.c cVar;
        W9.b bVar;
        W9.j jVar;
        W9.i iVar;
        switch (this.f9895a) {
            case 0:
                String str = (String) this.f9896b;
                String str2 = (String) this.f9897c;
                l lVar = (l) this.f9898d;
                T2.a _connection = (T2.a) obj;
                kotlin.jvm.internal.l.e(_connection, "_connection");
                R10 = _connection.R("SELECT * from HistoryMediaItemDTO WHERE itemId = ? AND linkPlay = ?");
                try {
                    R10.y(1, str);
                    R10.y(2, str2);
                    int h10 = P2.j.h(R10, "itemId");
                    int h11 = P2.j.h(R10, "category");
                    int h12 = P2.j.h(R10, "displayName");
                    int h13 = P2.j.h(R10, "thumb");
                    int h14 = P2.j.h(R10, "currentPosition");
                    int h15 = P2.j.h(R10, "contentDuration");
                    int h16 = P2.j.h(R10, "isLiveStreaming");
                    int h17 = P2.j.h(R10, "description");
                    int h18 = P2.j.h(R10, "linkPlay");
                    int h19 = P2.j.h(R10, "type");
                    int h20 = P2.j.h(R10, "lastViewTime");
                    if (R10.J()) {
                        String j = R10.j(h10);
                        String j10 = R10.j(h11);
                        String j11 = R10.j(h12);
                        String j12 = R10.j(h13);
                        long x2 = R10.x(h14);
                        long x10 = R10.x(h15);
                        boolean z8 = ((int) R10.x(h16)) != 0;
                        String j13 = R10.j(h17);
                        String j14 = R10.j(h18);
                        String str3 = R10.j(h19);
                        lVar.f9901c.getClass();
                        kotlin.jvm.internal.l.e(str3, "str");
                        try {
                            bVar = W9.b.valueOf(str3);
                        } catch (Exception unused) {
                            bVar = W9.b.f10855a;
                        }
                        cVar = new W9.c(j, j10, j11, j12, x2, x10, z8, j13, j14, bVar, R10.x(h20));
                    } else {
                        cVar = null;
                    }
                    return cVar;
                } finally {
                }
            case 1:
                C1191j c1191j = (C1191j) this.f9897c;
                o oVar = (o) this.f9898d;
                T2.a _connection2 = (T2.a) obj;
                kotlin.jvm.internal.l.e(_connection2, "_connection");
                R10 = _connection2.R((String) this.f9896b);
                try {
                    ((Ba.o) c1191j.f17441b).invoke(R10);
                    int g = P2.j.g(R10, "tvGroup");
                    int a9 = P2.j.a(R10, "logoChannel");
                    int a10 = P2.j.a(R10, "tvChannelName");
                    int a11 = P2.j.a(R10, "sourceFrom");
                    int a12 = P2.j.a(R10, "channelId");
                    int a13 = P2.j.a(R10, "searchKey");
                    int a14 = P2.j.a(R10, "channelNumber");
                    int i7 = 0;
                    ?? t5 = new T(0);
                    while (R10.J()) {
                        String j15 = R10.j(a12);
                        if (!t5.containsKey(j15)) {
                            t5.put(j15, new ArrayList());
                        }
                    }
                    R10.reset();
                    oVar.a(_connection2, t5);
                    ArrayList arrayList = new ArrayList();
                    while (R10.J()) {
                        if (g == -1) {
                            throw new IllegalStateException("Missing value for a NON-NULL column 'tvGroup', found NULL value instead.");
                        }
                        String j16 = R10.j(g);
                        if (a9 == -1) {
                            throw new IllegalStateException("Missing value for a NON-NULL column 'logoChannel', found NULL value instead.");
                        }
                        String j17 = R10.j(a9);
                        if (a10 == -1) {
                            throw new IllegalStateException("Missing value for a NON-NULL column 'tvChannelName', found NULL value instead.");
                        }
                        String j18 = R10.j(a10);
                        if (a11 == -1) {
                            throw new IllegalStateException("Missing value for a NON-NULL column 'sourceFrom', found NULL value instead.");
                        }
                        String j19 = R10.j(a11);
                        if (a12 == -1) {
                            throw new IllegalStateException("Missing value for a NON-NULL column 'channelId', found NULL value instead.");
                        }
                        String j20 = R10.j(a12);
                        if (a13 == -1) {
                            throw new IllegalStateException("Missing value for a NON-NULL column 'searchKey', found NULL value instead.");
                        }
                        W9.e eVar = new W9.e(j16, j17, j18, j19, j20, R10.j(a13), a14 == -1 ? i7 : (int) R10.x(a14));
                        Object E10 = B.E(R10.j(a12), t5);
                        kotlin.jvm.internal.l.d(E10, "getValue(...)");
                        arrayList.add(new W9.g(eVar, (List) E10));
                        i7 = 0;
                    }
                    return arrayList;
                } catch (Throwable th) {
                    throw th;
                }
            case 2:
                String str4 = (String) this.f9896b;
                String str5 = (String) this.f9897c;
                w wVar = (w) this.f9898d;
                T2.a _connection3 = (T2.a) obj;
                kotlin.jvm.internal.l.e(_connection3, "_connection");
                R10 = _connection3.R("SELECT * FROM VIDEOFAVORITEDTO where id=? AND type=?");
                try {
                    R10.y(1, str4);
                    R10.y(2, str5);
                    int h21 = P2.j.h(R10, "id");
                    int h22 = P2.j.h(R10, "url");
                    int h23 = P2.j.h(R10, "title");
                    int h24 = P2.j.h(R10, "category");
                    int h25 = P2.j.h(R10, "logoUrl");
                    int h26 = P2.j.h(R10, "sourceFrom");
                    int h27 = P2.j.h(R10, "type");
                    if (R10.J()) {
                        String j21 = R10.j(h21);
                        String j22 = R10.j(h22);
                        String j23 = R10.j(h23);
                        String j24 = R10.j(h24);
                        String j25 = R10.j(h25);
                        String j26 = R10.j(h26);
                        String str6 = R10.j(h27);
                        wVar.f9920c.getClass();
                        kotlin.jvm.internal.l.e(str6, "str");
                        try {
                            iVar = W9.i.valueOf(str6);
                        } catch (Exception unused2) {
                            iVar = W9.i.f10892c;
                        }
                        jVar = new W9.j(j21, j22, j23, j24, j25, j26, iVar);
                    } else {
                        jVar = null;
                    }
                    return jVar;
                } finally {
                }
            case 3:
                String m3u8Url = (String) obj;
                kotlin.jvm.internal.l.e(m3u8Url, "m3u8Url");
                C2010d c2010d = (C2010d) this.f9897c;
                C0665b c0665b = new C0665b(c2010d, (TVChannel) this.f9898d, 1);
                C0666c c0666c = new C0666c(c2010d, 2);
                H h28 = (H) this.f9896b;
                h28.getClass();
                Request.Builder builder = new Request.Builder();
                builder.e(m3u8Url);
                builder.a("Origin", ac.g.o0(h28.c().getBaseUrl(), "/"));
                builder.a("Referer", h28.c().getBaseUrl());
                builder.a("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/106.0.0.0 Safari/537.36");
                HttpUrl.j.getClass();
                builder.a("Host", HttpUrl.Companion.b(m3u8Url).f22338d);
                h28.f12248a.b(new Request(builder)).d(new Q7.h(c0666c, c0665b, m3u8Url, 20));
                return Db.q.f3365a;
            default:
                C2133e c2133e = (C2133e) this.f9897c;
                C0691r c0691r = (C0691r) this.f9896b;
                c0691r.add(c2133e);
                return new Z.f((w2.r) this.f9898d, c2133e, c0691r, 2);
        }
    }
}
