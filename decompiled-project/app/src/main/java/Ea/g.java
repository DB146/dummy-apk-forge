package Ea;

import Db.q;
import Eb.v;
import Q.W;
import Z9.C0665b;
import Z9.C0666c;
import Z9.C0669f;
import ac.n;
import android.os.Bundle;
import com.kt.apps.core.extensions.ExtensionsChannel;
import com.kt.apps.core.tv.model.TVChannel;
import com.kt.apps.core.utils.UtilsKt;
import com.kt.apps.media.xemtv.ui_mobile.MobileMainActivity;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.r;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.ResponseBody;
import v2.C2133e;
import v2.s;

/* loaded from: classes2.dex */
public final /* synthetic */ class g implements Rb.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3835a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3836b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3837c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f3838d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f3839e;

    public /* synthetic */ g(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.f3835a = i7;
        this.f3836b = obj;
        this.f3837c = obj2;
        this.f3838d = obj3;
        this.f3839e = obj4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [M9.b] */
    @Override // Rb.c
    public final Object invoke(Object obj) {
        q qVar = q.f3365a;
        Object obj2 = this.f3839e;
        Object obj3 = this.f3838d;
        Object obj4 = this.f3837c;
        Object obj5 = this.f3836b;
        switch (this.f3835a) {
            case 0:
                s NavHost = (s) obj;
                kotlin.jvm.internal.l.e(NavHost, "$this$NavHost");
                Fa.a[] aVarArr = Fa.a.f4179a;
                c2.i.g(NavHost, "Home", new Y.e(-727402328, new h((W) obj3, (W) obj2, (MobileMainActivity) obj5, (List) obj4), true));
                c2.i.g(NavHost, "Player", b.f3826a);
                return qVar;
            case 1:
                String str = (String) obj5;
                String str2 = (String) obj4;
                String str3 = (String) obj3;
                T2.a _connection = (T2.a) obj;
                kotlin.jvm.internal.l.e(_connection, "_connection");
                T2.c R10 = _connection.R("SELECT * FROM ExtensionChannelDatabaseViews INNER JOIN ExtensionsConfig ON extensionSourceId=sourceUrl WHERE tvGroup=? AND channelId=? AND tvChannelName=? ");
                try {
                    R10.y(1, str);
                    R10.y(2, str2);
                    R10.y(3, str3);
                    int h10 = P2.j.h(R10, "tvGroup");
                    int h11 = P2.j.h(R10, "logoChannel");
                    int h12 = P2.j.h(R10, "tvChannelName");
                    int h13 = P2.j.h(R10, "tvStreamLink");
                    int h14 = P2.j.h(R10, "sourceFrom");
                    int h15 = P2.j.h(R10, "channelId");
                    int h16 = P2.j.h(R10, "channelPreviewProviderId");
                    int h17 = P2.j.h(R10, "isHls");
                    int h18 = P2.j.h(R10, "catchupSource");
                    int h19 = P2.j.h(R10, "userAgent");
                    int h20 = P2.j.h(R10, "referer");
                    int h21 = P2.j.h(R10, "props");
                    int h22 = P2.j.h(R10, "extensionSourceId");
                    int h23 = P2.j.h(R10, "sourceName");
                    int h24 = P2.j.h(R10, "sourceUrl");
                    int h25 = P2.j.h(R10, "type");
                    LinkedHashMap linkedHashMap = null;
                    if (R10.J()) {
                        String j = R10.j(h10);
                        String j10 = R10.j(h11);
                        String j11 = R10.j(h12);
                        String j12 = R10.j(h13);
                        String j13 = R10.j(h14);
                        String j14 = R10.j(h15);
                        long x2 = R10.x(h16);
                        boolean z8 = ((int) R10.x(h17)) != 0;
                        String j15 = R10.j(h18);
                        String j16 = R10.j(h19);
                        String j17 = R10.j(h20);
                        String j18 = R10.E(h21) ? null : R10.j(h21);
                        T9.a aVar = ((U9.d) obj2).f9856c;
                        if (j18 != null) {
                            aVar.getClass();
                            linkedHashMap = T9.a.b(j18);
                        }
                        ExtensionsChannel extensionsChannel = new ExtensionsChannel(j, j10, j11, j12, j13, j14, x2, z8, j15, j16, j17, linkedHashMap, R10.j(h22));
                        String j19 = R10.j(h23);
                        String j20 = R10.j(h24);
                        String j21 = R10.j(h25);
                        aVar.getClass();
                        linkedHashMap = new M9.b(extensionsChannel, new M9.d(j19, j20, T9.a.a(j21)));
                    }
                    return linkedHashMap;
                } finally {
                    R10.close();
                }
            case 2:
                ResponseBody body = (ResponseBody) obj;
                kotlin.jvm.internal.l.e(body, "body");
                String W10 = n.W(ac.g.v0(body.K()).toString(), "https //", "https://");
                C0669f c0669f = (C0669f) obj5;
                c0669f.getClass();
                Request.Builder builder = new Request.Builder();
                builder.e(W10);
                builder.a("Origin", ac.g.o0(c0669f.c().getBaseUrl(), "/"));
                builder.a("Referer", ((TVChannel) obj4).getTvChannelWebDetailPage());
                builder.a("Cookie", UtilsKt.buildCookie((Map) c0669f.f12272c.getValue()));
                builder.a("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/106.0.0.0 Safari/537.36");
                HttpUrl.j.getClass();
                builder.a("Host", HttpUrl.Companion.b(W10).f22338d);
                c0669f.f12270a.b(new Request(builder)).d(new Q7.h((C0666c) obj2, W10, (C0665b) obj3, 19));
                return qVar;
            default:
                C2133e it = (C2133e) obj;
                kotlin.jvm.internal.l.e(it, "it");
                ((r) obj5).f19130a = true;
                ((y2.f) obj4).a((v2.q) obj3, (Bundle) obj2, it, v.f3891a);
                return qVar;
        }
    }
}
