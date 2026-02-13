package ka;

import A9.N2;
import Db.j;
import Db.o;
import Eb.B;
import ac.e;
import ac.n;
import com.bumptech.glide.d;
import hb.C1268a;
import i1.C1290a;
import ia.C1358d;
import ja.InterfaceC1389a;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.jvm.internal.l;
import l2.X;
import ma.C1651b;
import ma.C1653d;
import ma.EnumC1650a;
import ma.f;
import nb.h;
import sb.C2010d;
import y7.u0;

/* loaded from: classes2.dex */
public final class c implements InterfaceC1389a {

    /* renamed from: f, reason: collision with root package name */
    public static final e f19063f = new e("var\\s+stream_urls\\s*=\\s*\\[(.*?)\\];");

    /* renamed from: a, reason: collision with root package name */
    public final C1653d f19064a;

    /* renamed from: b, reason: collision with root package name */
    public final R9.a f19065b;

    /* renamed from: c, reason: collision with root package name */
    public final o f19066c;

    /* renamed from: d, reason: collision with root package name */
    public C1653d f19067d;

    /* renamed from: e, reason: collision with root package name */
    public final o f19068e;

    public c(C1653d c1653d, R9.a keyValueStorage) {
        l.e(keyValueStorage, "keyValueStorage");
        this.f19064a = c1653d;
        this.f19065b = keyValueStorage;
        this.f19066c = android.support.v4.media.session.b.z(new com.kt.apps.core.utils.l(15));
        this.f19067d = c1653d;
        b();
        try {
            u8.c e2 = u8.c.e();
            b bVar = new b(this, 0);
            X x2 = e2.f24888h;
            synchronized (x2) {
                ((LinkedHashSet) x2.f19194b).add(bVar);
                x2.j();
            }
        } catch (Throwable th) {
            com.bumptech.glide.c.n(th);
        }
        this.f19068e = android.support.v4.media.session.b.z(new N2(this, 25));
    }

    public final Map a() {
        return (Map) this.f19068e.getValue();
    }

    public final void b() {
        C1268a c1268a = (C1268a) this.f19066c.getValue();
        C1435a c1435a = new C1435a(this, 1);
        h hVar = new h(new C1358d(this, 1), new C1290a(this, 5), lb.b.f19614c);
        try {
            C2010d c2010d = new C2010d(hVar);
            hVar.c(c2010d);
            try {
                c1435a.d(c2010d);
            } catch (Throwable th) {
                u0.L(th);
                c2010d.onError(th);
            }
            c1268a.d(hVar);
        } catch (NullPointerException e2) {
            throw e2;
        } catch (Throwable th2) {
            u0.L(th2);
            d.t(th2);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th2);
            throw nullPointerException;
        }
    }

    public final C1651b c(xc.l lVar) {
        Object n6;
        long currentTimeMillis;
        Object n8;
        String str;
        String str2;
        String str3;
        String o02;
        String b2;
        LinkedHashMap I6 = B.I(new j("link", "a"), new j("league", ".gmd-tournament-header .gmd-match-league"), new j("date", ".gmd-tournament-header .gmd-match-date"), new j("homeTeamLogo", ".gmd-content_match .gmd-home_team .team-logo-group img"), new j("homeTeamName", ".gmd-content_match .gmd-home_team .team-name-group p"), new j("awayTeamLogo", ".gmd-content_match .gmd-away_team .team-logo-group img"), new j("awayTeamName", ".gmd-content_match .gmd-away_team .team-name-group p"));
        for (Map.Entry entry : this.f19067d.f20828d.entrySet()) {
            if (((CharSequence) entry.getValue()).length() > 0) {
                I6.put(entry.getKey(), entry.getValue());
            }
        }
        try {
            n6 = lVar.y().z("data-fid");
        } catch (Throwable th) {
            n6 = com.bumptech.glide.c.n(th);
        }
        if (n6 instanceof Db.l) {
            n6 = null;
        }
        String str4 = (String) n6;
        try {
            currentTimeMillis = Long.parseLong(lVar.y().z("data-runtime"));
        } catch (Exception unused) {
            currentTimeMillis = System.currentTimeMillis() / 1000;
        }
        long j = currentTimeMillis;
        lVar.y().z("data-day");
        try {
            n8 = lVar.y().z("data-week");
        } catch (Throwable th2) {
            n8 = com.bumptech.glide.c.n(th2);
        }
        String str5 = "";
        if (n8 instanceof Db.l) {
            n8 = "";
        }
        String str6 = (String) n8;
        Object obj = I6.get("link");
        l.b(obj);
        xc.l n02 = lVar.n0((String) obj);
        String str7 = (n02 == null || (b2 = n02.b("href")) == null) ? "" : b2;
        Object obj2 = I6.get("league");
        l.b(obj2);
        String str8 = (String) lVar.m0((String) obj2).stream().map(new wc.b(6)).collect(wc.l.k(" "));
        l.d(str8, "text(...)");
        Object obj3 = I6.get("date");
        l.b(obj3);
        String str9 = (String) lVar.m0((String) obj3).stream().map(new wc.b(6)).collect(wc.l.k(" "));
        l.d(str9, "text(...)");
        Object obj4 = I6.get("homeTeamLogo");
        l.b(obj4);
        xc.l n03 = lVar.n0((String) obj4);
        if (n03 == null || (str = n03.o("src")) == null) {
            str = "";
        }
        Object obj5 = I6.get("homeTeamName");
        l.b(obj5);
        xc.l n04 = lVar.n0((String) obj5);
        if (n04 == null || (str2 = n04.o0()) == null) {
            str2 = "";
        }
        Object obj6 = I6.get("awayTeamLogo");
        l.b(obj6);
        xc.l n05 = lVar.n0((String) obj6);
        if (n05 == null || (str3 = n05.o("src")) == null) {
            str3 = "";
        }
        Object obj7 = I6.get("awayTeamName");
        l.b(obj7);
        xc.l n06 = lVar.n0((String) obj7);
        if (n06 != null && (o02 = n06.o0()) != null) {
            str5 = o02;
        }
        return new C1651b(new f(n.W(str2, "\n", " "), X.c.h(str4, "_home"), str8, str), new f(n.W(str5, "\n", " "), X.c.h(str4, "_away"), str8, str3), str9, j, str6, str7, EnumC1650a.f20812a, str8, str7);
    }
}
