package D5;

import A0.AbstractC0017g;
import A0.F0;
import A0.L;
import A9.U2;
import A9.V0;
import B0.i1;
import Eb.p;
import Eb.v;
import G3.C0280b;
import G3.E;
import G3.F;
import G3.InterfaceC0279a;
import G3.t;
import G3.y;
import H2.C;
import H2.K;
import H2.T;
import H2.i0;
import H2.s0;
import J7.r;
import L7.B;
import L7.C0381a;
import L7.C0385e;
import M1.C0389d;
import M1.S;
import M1.U;
import M1.b0;
import M1.c0;
import N6.AbstractC0443p;
import N6.o0;
import N6.p0;
import Q.C0480b;
import T7.s;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import b3.AbstractC0826a;
import b3.AbstractC0829d;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.kt.apps.core.utils.ActivityUtilsKt;
import com.kt.apps.media.xemtv.App;
import com.kt.apps.media.xemtv.beta.R;
import com.kt.apps.media.xemtv.ui.playback.PlaybackActivity;
import com.kt.apps.media.xemtv.workers.TVRecommendationWorkers;
import fc.Q;
import j0.o;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.locks.ReentrantLock;
import jb.InterfaceC1393d;
import jb.InterfaceC1394e;
import ob.C1833a;
import ob.C1837e;
import ob.C1838f;
import ob.C1842j;
import ob.m;
import org.json.JSONObject;
import t8.C2034c;
import tss.r.core.ads.database.AdsDatabase;
import vb.n;
import x0.AbstractC2256a;
import y9.G;

/* loaded from: classes.dex */
public final class i implements InterfaceC1393d, i1, U2, X3.a, F6.c, t, InterfaceC0279a, E, C, s0, InterfaceC1394e, J7.a, O7.f, B, o {

    /* renamed from: c, reason: collision with root package name */
    public static i f3254c;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3255a;

    /* renamed from: b, reason: collision with root package name */
    public Object f3256b;

    public i(int i7) {
        this.f3255a = i7;
        switch (i7) {
            case 3:
                this.f3256b = C0480b.o(Boolean.FALSE);
                return;
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                this.f3256b = new W3.k(500L);
                return;
            case 16:
                this.f3256b = new LinkedHashMap();
                return;
            case 23:
                return;
            case 24:
                this.f3256b = Q.c(c0.f6659b);
                return;
            default:
                this.f3256b = new TreeSet(AbstractC0017g.f223b);
                return;
        }
    }

    public i(B7.d dVar) {
        this.f3255a = 7;
        this.f3256b = new File((File) dVar.f2212c, "com.crashlytics.settings.json");
    }

    public i(Context context) {
        this.f3255a = 0;
        b a9 = b.a(context);
        this.f3256b = a9;
        a9.b();
        a9.c();
    }

    public /* synthetic */ i(Object obj, int i7) {
        this.f3255a = i7;
        this.f3256b = obj;
    }

    public static synchronized i z(Context context) {
        i iVar;
        synchronized (i.class) {
            Context applicationContext = context.getApplicationContext();
            synchronized (i.class) {
                iVar = f3254c;
                if (iVar == null) {
                    iVar = new i(applicationContext);
                    f3254c = iVar;
                }
            }
            return iVar;
        }
        return iVar;
    }

    public synchronized void A() {
        b bVar = (b) this.f3256b;
        ReentrantLock reentrantLock = bVar.f3236a;
        reentrantLock.lock();
        try {
            bVar.f3237b.edit().clear().apply();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // L7.B
    public void a(String str) {
        L7.j jVar = (L7.j) this.f3256b;
        ((Q7.h) jVar.j).p("App check token changed, triggering app check token refresh", null, new Object[0]);
        r rVar = (r) jVar.f6358d;
        rVar.f5637y.p("App check token refreshed.", null, new Object[0]);
        rVar.f5631s = str;
        if (rVar.a()) {
            if (str != null) {
                rVar.i(false);
                return;
            }
            tc.b.z(rVar.a(), "Must be connected to send unauth.", new Object[0]);
            tc.b.z(rVar.f5631s == null, "App check token must not be set.", new Object[0]);
            rVar.n("unappcheck", false, Collections.emptyMap(), null);
        }
    }

    @Override // jb.InterfaceC1393d
    public void accept(Object obj) {
        switch (this.f3255a) {
            case 2:
                W9.j it = (W9.j) obj;
                kotlin.jvm.internal.l.e(it, "it");
                String.valueOf(it);
                PlaybackActivity t5 = (PlaybackActivity) this.f3256b;
                kotlin.jvm.internal.l.e(t5, "t");
                t5.x().d().e(t5, new Aa.b(new Aa.i(t5, 2), 1));
                t5.x().c(it);
                return;
            case 17:
                List it2 = (List) obj;
                kotlin.jvm.internal.l.e(it2, "it");
                ((I9.i) this.f3256b).b().l(new G(it2));
                String.valueOf(it2);
                return;
            default:
                kotlin.jvm.internal.l.e((Throwable) obj, "it");
                kotlin.jvm.internal.l.e((M9.t) this.f3256b, "t");
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0151, code lost:
    
        if (r4.moveToFirst() != false) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0153, code lost:
    
        r6 = b3.e.a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0157, code lost:
    
        if (r6 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0159, code lost:
    
        r5.add(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0162, code lost:
    
        throw new java.lang.NullPointerException();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:150:0x04b7  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0194 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x016b A[Catch: IllegalArgumentException -> 0x016f, TRY_LEAVE, TryCatch #0 {IllegalArgumentException -> 0x016f, blocks: (B:13:0x0132, B:15:0x014d, B:21:0x0163, B:31:0x016b), top: B:12:0x0132 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01ab  */
    /* JADX WARN: Type inference failed for: r0v24, types: [b3.g, java.lang.Object, b3.c] */
    /* JADX WARN: Type inference failed for: r4v11, types: [b3.g, java.lang.Object, b3.c] */
    /* JADX WARN: Type inference failed for: r5v0, types: [Eb.v] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r5v22, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v4, types: [E6.e] */
    @Override // jb.InterfaceC1394e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object apply(Object obj) {
        ?? r52;
        Iterator it;
        Object obj2;
        App app;
        long b2;
        Cursor query;
        switch (this.f3255a) {
            case 18:
                List it2 = (List) obj;
                kotlin.jvm.internal.l.e(it2, "it");
                Context context = ((TVRecommendationWorkers) this.f3256b).g;
                Uri parse = Uri.parse(ActivityUtilsKt.getDefScheme(context) + "://tv/favourite");
                try {
                    kotlin.jvm.internal.l.e(context, "context");
                    query = context.getContentResolver().query(b3.h.f13826a, AbstractC0829d.f13818a, null, null, null);
                    r52 = new ArrayList();
                    if (query != null) {
                        break;
                    }
                    if (query != null) {
                        query.close();
                    }
                } catch (IllegalArgumentException unused) {
                    r52 = v.f3891a;
                }
                it = r52.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj2 = null;
                    } else {
                        obj2 = it.next();
                        if (kotlin.jvm.internal.l.a(((b3.e) obj2).f13820a.getAsString("internal_provider_id"), "tvChannelIMedia")) {
                        }
                    }
                }
                b3.e eVar = (b3.e) obj2;
                q3.c cVar = eVar != null ? new q3.c(27, (byte) 0) : new q3.c(eVar);
                app = App.f16184z;
                if (app != null) {
                    kotlin.jvm.internal.l.j("app");
                    throw null;
                }
                Resources resources = app.getResources();
                kotlin.jvm.internal.l.d(resources, "getResources(...)");
                kotlin.jvm.internal.l.d(TVRecommendationWorkers.g(resources, R.drawable.app_icon_fg).toString(), "toString(...)");
                ((ContentValues) cVar.f23371b).put("display_name", "Truyền hình".toString());
                cVar.f23372c = Uri.parse("android.resource://" + context.getPackageName() + "/drawable/app_icon_fg");
                ((ContentValues) cVar.f23371b).put("description", "iMedia".toString());
                ((ContentValues) cVar.f23371b).put("internal_provider_id", "tvChannelIMedia");
                ((ContentValues) cVar.f23371b).put("app_link_intent_uri", parse == null ? null : parse.toString());
                b3.e g = cVar.g();
                if (eVar == null) {
                    b2 = new E6.e(context, 6).h(g);
                } else {
                    new E6.e(context, 6).j(eVar.b(), g);
                    b2 = eVar.b();
                }
                ArrayList t5 = android.support.v4.media.session.b.t(context, Long.valueOf(b2));
                ?? eVar2 = new E6.e(context, 6);
                ArrayList arrayList = new ArrayList();
                Iterator it3 = t5.iterator();
                while (true) {
                    String str = "interaction_type";
                    if (it3.hasNext()) {
                        Object next = it3.next();
                        Integer asInteger = ((b3.g) next).f13817a.getAsInteger("interaction_type");
                        if ((asInteger == null ? -1 : asInteger.intValue()) == 4) {
                            arrayList.add(next);
                        }
                    } else {
                        Iterator it4 = arrayList.iterator();
                        while (true) {
                            boolean hasNext = it4.hasNext();
                            Context context2 = eVar2.f3734b;
                            if (!hasNext) {
                                String str2 = str;
                                boolean isEmpty = it2.isEmpty();
                                C1838f c1838f = C1838f.f22215a;
                                if (!isEmpty) {
                                    Iterator it5 = it2.iterator();
                                    while (it5.hasNext()) {
                                        W9.j jVar = (W9.j) it5.next();
                                        AbstractC0826a abstractC0826a = new AbstractC0826a();
                                        Uri parse2 = Uri.parse(jVar.f10898e);
                                        ContentValues contentValues = (ContentValues) abstractC0826a.f3094a;
                                        Iterator it6 = it5;
                                        String str3 = jVar.f10894a;
                                        contentValues.put("content_id", str3);
                                        abstractC0826a.M(parse2);
                                        ((ContentValues) abstractC0826a.f3094a).put("title", jVar.f10896c);
                                        abstractC0826a.O(0);
                                        ((ContentValues) abstractC0826a.f3094a).put("channel_id", Long.valueOf(b2));
                                        abstractC0826a.G(parse2);
                                        abstractC0826a.K(true);
                                        String str4 = str2;
                                        ((ContentValues) abstractC0826a.f3094a).put(str4, (Integer) 4);
                                        ((ContentValues) abstractC0826a.f3094a).put("duration_millis", (Integer) 0);
                                        abstractC0826a.E(parse2);
                                        abstractC0826a.N(Calendar.getInstance(Locale.TAIWAN).getTime());
                                        abstractC0826a.F(true);
                                        abstractC0826a.E(parse2);
                                        abstractC0826a.L(Uri.parse(ActivityUtilsKt.getDefScheme(context) + "://iptv/channel/" + str3));
                                        ?? obj3 = new Object();
                                        obj3.f13817a = (ContentValues) abstractC0826a.f3094a;
                                        eVar2.i(obj3);
                                        str2 = str4;
                                        it5 = it6;
                                    }
                                    String str5 = str2;
                                    ArrayList arrayList2 = new ArrayList();
                                    Iterator it7 = t5.iterator();
                                    while (it7.hasNext()) {
                                        Object next2 = it7.next();
                                        Integer asInteger2 = ((b3.g) next2).f13817a.getAsInteger(str5);
                                        if ((asInteger2 == null ? -1 : asInteger2.intValue()) == 0) {
                                            arrayList2.add(next2);
                                        }
                                    }
                                    Iterator it8 = arrayList2.iterator();
                                    while (it8.hasNext()) {
                                        long a9 = ((b3.g) it8.next()).a();
                                        if (Build.VERSION.SDK_INT >= 26) {
                                            context2.getContentResolver().delete(ContentUris.withAppendedId(b3.i.f13827a, a9), null, null);
                                        }
                                    }
                                    ArrayList arrayList3 = new ArrayList();
                                    Iterator it9 = t5.iterator();
                                    while (it9.hasNext()) {
                                        Object next3 = it9.next();
                                        Integer asInteger3 = ((b3.g) next3).f13817a.getAsInteger(str5);
                                        if ((asInteger3 == null ? -1 : asInteger3.intValue()) == 0) {
                                            arrayList3.add(next3);
                                        }
                                    }
                                    Iterator it10 = arrayList3.iterator();
                                    while (it10.hasNext()) {
                                        b3.g gVar = (b3.g) it10.next();
                                        AbstractC0826a abstractC0826a2 = new AbstractC0826a();
                                        ((ContentValues) abstractC0826a2.f3094a).put("content_id", gVar.f13817a.getAsString("content_id"));
                                        ContentValues contentValues2 = gVar.f13817a;
                                        String asString = contentValues2.getAsString("logo_uri");
                                        abstractC0826a2.M(asString == null ? null : Uri.parse(asString));
                                        ((ContentValues) abstractC0826a2.f3094a).put("title", contentValues2.getAsString("title"));
                                        abstractC0826a2.O(0);
                                        Long asLong = gVar.f13817a.getAsLong("channel_id");
                                        ((ContentValues) abstractC0826a2.f3094a).put("channel_id", Long.valueOf(asLong == null ? -1L : asLong.longValue()));
                                        String asString2 = contentValues2.getAsString("thumbnail_uri");
                                        abstractC0826a2.G(asString2 == null ? null : Uri.parse(asString2));
                                        abstractC0826a2.K(true);
                                        ((ContentValues) abstractC0826a2.f3094a).put(str5, (Integer) 0);
                                        ((ContentValues) abstractC0826a2.f3094a).put("duration_millis", (Integer) 0);
                                        abstractC0826a2.N(Calendar.getInstance(Locale.TAIWAN).getTime());
                                        abstractC0826a2.F(true);
                                        String asString3 = contentValues2.getAsString("poster_art_uri");
                                        abstractC0826a2.E(asString3 == null ? null : Uri.parse(asString3));
                                        String asString4 = contentValues2.getAsString("intent_uri");
                                        abstractC0826a2.L(asString4 == null ? null : Uri.parse(asString4));
                                        ?? obj4 = new Object();
                                        obj4.f13817a = (ContentValues) abstractC0826a2.f3094a;
                                        eVar2.i(obj4);
                                    }
                                }
                                return c1838f;
                            }
                            String str6 = str;
                            long a10 = ((b3.g) it4.next()).a();
                            if (Build.VERSION.SDK_INT >= 26) {
                                context2.getContentResolver().delete(ContentUris.withAppendedId(b3.i.f13827a, a10), null, null);
                            }
                            str = str6;
                        }
                    }
                }
            default:
                List<Jc.a> ads = (List) obj;
                kotlin.jvm.internal.l.e(ads, "ads");
                long currentTimeMillis = System.currentTimeMillis();
                Kc.d dVar = (Kc.d) this.f3256b;
                dVar.f6230d = currentTimeMillis;
                Db.o oVar = dVar.f6229c;
                Hc.d y10 = ((AdsDatabase) oVar.getValue()).y();
                y10.getClass();
                C1842j e2 = android.support.v4.media.session.b.g(y10.f4927a, new Ba.i(2)).e(Ab.e.f1561c);
                Hc.d y11 = ((AdsDatabase) oVar.getValue()).y();
                ArrayList arrayList4 = new ArrayList(p.S(ads, 10));
                for (Jc.a bannerAd : ads) {
                    kotlin.jvm.internal.l.e(bannerAd, "bannerAd");
                    arrayList4.add(new Ic.b(bannerAd.f5779a, bannerAd.f5780b, bannerAd.f5781c, bannerAd.f5782d, bannerAd.f5783e, bannerAd.f5784f, bannerAd.f5785u, bannerAd.f5786v, bannerAd.f5787w, bannerAd.f5788x, bannerAd.f5789y, bannerAd.f5790z, bannerAd.f5771A, bannerAd.f5772B, bannerAd.f5773C, bannerAd.f5774D, bannerAd.f5775E));
                }
                y11.getClass();
                C1837e g2 = android.support.v4.media.session.b.g(y11.f4927a, new Aa.t(5, y11, arrayList4));
                n nVar = Ab.e.f1561c;
                C1833a c1833a = new C1833a(0, e2, g2.e(nVar));
                Ic.a aVar = new Ic.a(1, dVar.f6230d, System.currentTimeMillis());
                Hc.b x2 = ((AdsDatabase) oVar.getValue()).x();
                x2.getClass();
                return new tb.f(new m(gb.p.c(ads), new C1833a(0, c1833a, android.support.v4.media.session.b.g(x2.f4923a, new Aa.t(4, x2, aVar)).e(nVar))), new Kc.a(0, ads), null);
        }
        if (!query.moveToNext()) {
            if (query != null) {
            }
            it = r52.iterator();
            while (true) {
                if (it.hasNext()) {
                }
            }
            b3.e eVar3 = (b3.e) obj2;
            if (eVar3 != null) {
            }
            app = App.f16184z;
            if (app != null) {
            }
        }
    }

    @Override // j0.o
    public long b() {
        return ((N.r) this.f3256b).f7071b;
    }

    @Override // H2.C
    public void c(Object obj, int i7, int i10) {
        ((V0) this.f3256b).f4599a.f(obj, i7, i10);
    }

    @Override // H2.C
    public void d(int i7, int i10) {
        ((V0) this.f3256b).f4599a.i(i7, i10);
    }

    @Override // H2.C
    public void e(int i7, int i10) {
        ((V0) this.f3256b).f4599a.c(i7, i10);
    }

    @Override // G3.InterfaceC0279a
    public com.bumptech.glide.load.data.e f(AssetManager assetManager, String str) {
        return new com.bumptech.glide.load.data.j(assetManager, str, 1);
    }

    @Override // H2.s0
    public int g() {
        androidx.recyclerview.widget.a aVar = (androidx.recyclerview.widget.a) this.f3256b;
        return aVar.f13717n - aVar.M();
    }

    @Override // G3.E
    public com.bumptech.glide.load.data.e h(Uri uri) {
        return new com.bumptech.glide.load.data.a((ContentResolver) this.f3256b, uri, 1);
    }

    @Override // X3.a
    public Object i() {
        B7.d dVar = (B7.d) this.f3256b;
        return new C3.r((F3.e) dVar.f2210a, (F3.e) dVar.f2211b, (F3.e) dVar.f2212c, (F3.e) dVar.f2213d, (C3.n) dVar.f2214e, (C3.n) dVar.f2215f, (Q7.h) dVar.g);
    }

    @Override // H2.s0
    public int j(View view) {
        return ((androidx.recyclerview.widget.a) this.f3256b).D(view) - ((ViewGroup.MarginLayoutParams) ((T) view.getLayoutParams())).leftMargin;
    }

    @Override // H2.C
    public void k(int i7, int i10) {
        ((V0) this.f3256b).f4599a.h(i7, i10);
    }

    @Override // O7.f
    public Object l(C0385e c0385e, Object obj, Object obj2) {
        return ((C0381a) obj2).b(((C0385e) this.f3256b).i(c0385e), (s) obj);
    }

    @Override // G3.t
    public G3.s m(y yVar) {
        switch (this.f3255a) {
            case 10:
                return new C0280b(0, (AssetManager) this.f3256b, this);
            default:
                return new F(this);
        }
    }

    public void n(L l10) {
        if (!l10.F()) {
            AbstractC2256a.b("DepthSortedSet.add called on an unattached node");
        }
        ((F0) this.f3256b).add(l10);
    }

    @Override // H2.s0
    public View o(int i7) {
        return ((androidx.recyclerview.widget.a) this.f3256b).x(i7);
    }

    @Override // J7.a
    public void onSuccess(String str) {
        ((TaskCompletionSource) this.f3256b).setResult(str);
    }

    @Override // H2.s0
    public int p() {
        return ((androidx.recyclerview.widget.a) this.f3256b).L();
    }

    @Override // J7.a
    public void q(String str) {
        ((TaskCompletionSource) this.f3256b).setException(new Exception(str));
    }

    @Override // H2.s0
    public int r(View view) {
        return ((androidx.recyclerview.widget.a) this.f3256b).G(view) + ((ViewGroup.MarginLayoutParams) ((T) view.getLayoutParams())).rightMargin;
    }

    public void s(M2.a migration) {
        kotlin.jvm.internal.l.e(migration, "migration");
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f3256b;
        Integer valueOf = Integer.valueOf(migration.f6743a);
        Object obj = linkedHashMap.get(valueOf);
        if (obj == null) {
            obj = new TreeMap();
            linkedHashMap.put(valueOf, obj);
        }
        TreeMap treeMap = (TreeMap) obj;
        int i7 = migration.f6744b;
        if (treeMap.containsKey(Integer.valueOf(i7))) {
            Log.w("ROOM", "Overriding migration " + treeMap.get(Integer.valueOf(i7)) + " with " + migration);
        }
        treeMap.put(Integer.valueOf(i7), migration);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [N6.p0, N6.p] */
    public p0 t() {
        Map f4 = ((N6.r) this.f3256b).f();
        o0 o0Var = new o0();
        ?? abstractC0443p = new AbstractC0443p();
        Q5.e.k(f4.isEmpty());
        abstractC0443p.f7329d = f4;
        abstractC0443p.f7331f = o0Var;
        return abstractC0443p;
    }

    public String toString() {
        switch (this.f3255a) {
            case 1:
                return ((F0) this.f3256b).toString();
            default:
                return super.toString();
        }
    }

    public b0 u() {
        return (b0) ((fc.b0) this.f3256b).getValue();
    }

    public JSONObject v() {
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        FileInputStream fileInputStream2 = null;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Checking for cached settings...", null);
        }
        try {
            File file = (File) this.f3256b;
            if (file.exists()) {
                fileInputStream = new FileInputStream(file);
                try {
                    try {
                        jSONObject = new JSONObject(v7.g.i(fileInputStream));
                        fileInputStream2 = fileInputStream;
                    } catch (Exception e2) {
                        e = e2;
                        Log.e("FirebaseCrashlytics", "Failed to fetch cached settings", e);
                        v7.g.b(fileInputStream, "Error while closing settings cache file.");
                        return null;
                    }
                } catch (Throwable th) {
                    th = th;
                    fileInputStream2 = fileInputStream;
                    v7.g.b(fileInputStream2, "Error while closing settings cache file.");
                    throw th;
                }
            } else {
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Settings file does not exist.", null);
                }
                jSONObject = null;
            }
            v7.g.b(fileInputStream2, "Error while closing settings cache file.");
            return jSONObject;
        } catch (Exception e10) {
            e = e10;
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            v7.g.b(fileInputStream2, "Error while closing settings cache file.");
            throw th;
        }
    }

    public boolean w(L l10) {
        if (!l10.F()) {
            AbstractC2256a.b("DepthSortedSet.remove called on an unattached node");
        }
        return ((F0) this.f3256b).remove(l10);
    }

    public void x(int i7) {
        RecyclerView recyclerView = (RecyclerView) this.f3256b;
        View childAt = recyclerView.getChildAt(i7);
        if (childAt != null) {
            i0 M3 = RecyclerView.M(childAt);
            K k = recyclerView.f13612A;
            if (k != null && M3 != null) {
                k.j(M3);
            }
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i7);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        if (r6.f6658a > r2.f6658a) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void y(b0 newState) {
        fc.b0 b0Var;
        Object value;
        b0 b0Var2;
        kotlin.jvm.internal.l.e(newState, "newState");
        do {
            b0Var = (fc.b0) this.f3256b;
            value = b0Var.getValue();
            b0Var2 = (b0) value;
            if (!(b0Var2 instanceof U ? true : kotlin.jvm.internal.l.a(b0Var2, c0.f6659b))) {
                if (!(b0Var2 instanceof C0389d)) {
                    if (!(b0Var2 instanceof S)) {
                        throw new Db.d(1);
                    }
                }
            }
            b0Var2 = newState;
        } while (!b0Var.h(value, b0Var2));
    }

    @Override // F6.c
    public Object zza() {
        return new E6.j(((E6.e) ((C2034c) this.f3256b).f24513b).f3734b);
    }
}
