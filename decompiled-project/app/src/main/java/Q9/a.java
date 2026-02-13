package Q9;

import A9.S2;
import Eb.o;
import Eb.p;
import P4.C0474w;
import P4.Z;
import P4.r;
import Q7.h;
import Rb.e;
import U2.c;
import Z9.C0669f;
import Z9.E;
import a0.AbstractC0688o;
import a4.C0762m;
import a4.C0770u;
import a8.C0785b;
import ac.g;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import android.view.Display;
import b4.C0838i;
import c8.d;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.kt.apps.core.service.CloudMessagingService;
import com.kt.apps.core.tv.model.ChannelSourceConfig;
import com.kt.apps.core.tv.model.TVChannel;
import com.kt.apps.core.utils.blurry.BlurFactor;
import com.kt.apps.core.workers.TVEpgWorkers;
import com.kt.apps.voiceselector.ui.VoiceSearchActivity;
import e4.C1085a;
import e4.EnumC1087c;
import f.C1117a;
import f.InterfaceC1118b;
import gb.j;
import h3.H;
import h3.u;
import h4.k;
import h7.C1256b;
import h7.C1257c;
import h7.C1259e;
import h7.C1260f;
import ha.C1265a;
import j4.InterfaceC1376b;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import jb.InterfaceC1390a;
import jb.InterfaceC1394e;
import k5.x;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.m;
import m4.C1562c0;
import m4.SurfaceHolderCallbackC1596z;
import m4.q0;
import m4.v0;
import n4.C1703a;
import n5.AbstractC1705a;
import n5.i;
import o5.t;
import okhttp3.EventListener;
import okhttp3.HttpUrl;
import sb.C2010d;
import tb.C2037a;
import vc.f;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements InterfaceC1390a, InterfaceC1118b, OnFailureListener, j, OnSuccessListener, InterfaceC1376b, SuccessContinuation, c, InterfaceC1394e, i, EventListener.Factory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8706a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8707b;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ a(e eVar) {
        this.f8706a = 9;
        this.f8707b = (m) eVar;
    }

    public /* synthetic */ a(Object obj, int i7) {
        this.f8706a = i7;
        this.f8707b = obj;
    }

    public /* synthetic */ a(C1703a c1703a, r rVar, C0474w c0474w, IOException iOException, boolean z8) {
        this.f8706a = 24;
        this.f8707b = c0474w;
    }

    public /* synthetic */ a(C1703a c1703a, Object obj, int i7) {
        this.f8706a = i7;
        this.f8707b = obj;
    }

    public Z a(h hVar) {
        Z3.b bVar = (Z3.b) this.f8707b;
        String w10 = android.support.v4.media.session.b.w("CctTransportBackend");
        boolean isLoggable = Log.isLoggable(w10, 4);
        URL url = (URL) hVar.f8695b;
        if (isLoggable) {
            Log.i(w10, String.format("Making request to: %s", url));
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(bVar.g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", "datatransport/3.3.0 android/");
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = (String) hVar.f8697d;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    R7.a aVar = bVar.f12143a;
                    C0762m c0762m = (C0762m) hVar.f8696c;
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
                    d dVar = (d) aVar.f8927b;
                    c8.e eVar = new c8.e(bufferedWriter, dVar.f14446a, dVar.f14447b, dVar.f14448c, dVar.f14449d);
                    eVar.h(c0762m);
                    eVar.j();
                    eVar.f14451b.flush();
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    Integer valueOf = Integer.valueOf(responseCode);
                    String w11 = android.support.v4.media.session.b.w("CctTransportBackend");
                    if (Log.isLoggable(w11, 4)) {
                        Log.i(w11, String.format("Status Code: %d", valueOf));
                    }
                    android.support.v4.media.session.b.l(httpURLConnection.getHeaderField("Content-Type"), "CctTransportBackend", "Content-Type: %s");
                    android.support.v4.media.session.b.l(httpURLConnection.getHeaderField("Content-Encoding"), "CctTransportBackend", "Content-Encoding: %s");
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new Z(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new Z(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream gZIPInputStream = "gzip".equals(httpURLConnection.getHeaderField("Content-Encoding")) ? new GZIPInputStream(inputStream) : inputStream;
                        try {
                            Z z8 = new Z(responseCode, null, C0770u.a(new BufferedReader(new InputStreamReader(gZIPInputStream))).f12687a);
                            if (gZIPInputStream != null) {
                                gZIPInputStream.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return z8;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } catch (C0785b e2) {
            e = e2;
            android.support.v4.media.session.b.m(e, "CctTransportBackend", "Couldn't encode request, returning with 400");
            return new Z(400, null, 0L);
        } catch (ConnectException e10) {
            e = e10;
            android.support.v4.media.session.b.m(e, "CctTransportBackend", "Couldn't open connection, returning with 500");
            return new Z(500, null, 0L);
        } catch (UnknownHostException e11) {
            e = e11;
            android.support.v4.media.session.b.m(e, "CctTransportBackend", "Couldn't open connection, returning with 500");
            return new Z(500, null, 0L);
        } catch (IOException e12) {
            e = e12;
            android.support.v4.media.session.b.m(e, "CctTransportBackend", "Couldn't encode request, returning with 400");
            return new Z(400, null, 0L);
        }
    }

    @Override // jb.InterfaceC1394e
    public Object apply(Object obj) {
        Throwable it = (Throwable) obj;
        l.e(it, "it");
        TVEpgWorkers t5 = (TVEpgWorkers) this.f8707b;
        l.e(t5, "t");
        return new u();
    }

    @Override // U2.c
    public U2.d b(U2.b bVar) {
        Context context = (Context) this.f8707b;
        A4.c callback = (A4.c) bVar.f9510e;
        l.e(callback, "callback");
        String str = (String) bVar.f9509d;
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
        }
        return new V2.h(context, str, callback, true, true);
    }

    public void c() {
        m mVar = (m) this.f8707b;
        synchronized (AbstractC0688o.f12405b) {
            try {
                List list = (List) AbstractC0688o.g;
                l.e(list, "<this>");
                ArrayList arrayList = new ArrayList(p.S(list, 10));
                boolean z8 = false;
                for (Object obj : list) {
                    boolean z10 = true;
                    if (!z8 && l.a(obj, mVar)) {
                        z8 = true;
                        z10 = false;
                    }
                    if (z10) {
                        arrayList.add(obj);
                    }
                }
                AbstractC0688o.g = arrayList;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // gb.j
    public void d(C2010d c2010d) {
        switch (this.f8706a) {
            case 5:
                ArrayList arrayList = new ArrayList();
                C0669f c0669f = (C0669f) this.f8707b;
                vc.e b2 = c2.i.h(c0669f.c().getBaseUrl() + "/" + c0669f.c().getMainPagePath()).b();
                l.d(b2, "execute(...)");
                Map map = (Map) c0669f.f12272c.getValue();
                LinkedHashMap linkedHashMap = b2.f25454d;
                l.d(linkedHashMap, "cookies(...)");
                map.putAll(linkedHashMap);
                xc.l p02 = b2.h().p0();
                vc.i.A("panel-wrapper pw-livetv");
                zc.e m10 = H.m(new zc.h("panel-wrapper pw-livetv", 2, false), p02);
                l.d(m10, "getElementsByClass(...)");
                Iterator it = m10.iterator();
                while (it.hasNext()) {
                    xc.l lVar = (xc.l) ((xc.l) it.next()).i0("a").b();
                    if (lVar != null) {
                        String o10 = lVar.o("href");
                        l.d(o10, "attr(...)");
                        xc.l lVar2 = (xc.l) lVar.i0("img").b();
                        String o11 = lVar2 != null ? lVar2.o("src") : null;
                        Pattern compile = Pattern.compile("(xem-kenh-|truyen-hinh-|-full|-hd|hd|.html|-sd|sd)");
                        l.d(compile, "compile(...)");
                        String replaceAll = compile.matcher(o10).replaceAll("");
                        l.d(replaceAll, "replaceAll(...)");
                        Pattern compile2 = Pattern.compile("(-\\d{2,})");
                        l.d(compile2, "compile(...)");
                        String replaceAll2 = compile2.matcher(replaceAll).replaceAll("");
                        l.d(replaceAll2, "replaceAll(...)");
                        String lowerCase = replaceAll2.toLowerCase(Locale.ROOT);
                        l.d(lowerCase, "toLowerCase(...)");
                        arrayList.add(new TVChannel("HTV", o11 == null ? "" : o11, lowerCase, X.c.h(c0669f.c().getBaseUrl(), o10), "HTV_BACKUP", lowerCase, null, false, null, 0, 960, null));
                    }
                }
                HashSet hashSet = new HashSet();
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    if (hashSet.add(((TVChannel) next).getTvChannelWebDetailPage())) {
                        arrayList2.add(next);
                    }
                }
                c2010d.d(arrayList2);
                c2010d.a();
                return;
            case 6:
            default:
                Z9.H h10 = (Z9.H) this.f8707b;
                try {
                    f h11 = c2.i.h(g.o0(h10.c().getBaseUrl(), "/") + "/" + h10.c().getMainPagePath());
                    LinkedHashMap linkedHashMap2 = h10.f12251d;
                    vc.d dVar = h11.f25473a;
                    h11.a(linkedHashMap2);
                    dVar.d("Origin", g.o0(h10.c().getBaseUrl(), "/"));
                    dVar.d("Referer", h10.c().getBaseUrl() + "/" + h10.c().getMainPagePath());
                    dVar.d("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/106.0.0.0 Safari/537.36");
                    vc.e b10 = h11.b();
                    l.d(b10, "execute(...)");
                    LinkedHashMap linkedHashMap3 = b10.f25454d;
                    l.d(linkedHashMap3, "cookies(...)");
                    linkedHashMap2.putAll(linkedHashMap3);
                    xc.l p03 = b10.h().p0();
                    vc.i.A("barTVChannels");
                    xc.l lVar3 = (xc.l) android.support.v4.media.session.b.F(p03, xc.l.class).filter(new zc.f(new zc.h("barTVChannels", 8, false), p03, 0)).findFirst().orElse(null);
                    l.b(lVar3);
                    ArrayList arrayList3 = new ArrayList();
                    zc.e i02 = lVar3.i0("a");
                    l.d(i02, "getElementsByTag(...)");
                    Iterator it3 = i02.iterator();
                    while (it3.hasNext()) {
                        xc.l lVar4 = (xc.l) ((xc.l) it3.next()).i0("img").b();
                        l.b(lVar4);
                        String o12 = lVar4.o("onclick");
                        l.d(o12, "attr(...)");
                        String o13 = lVar4.o("src");
                        l.d(o13, "attr(...)");
                        String substring = o12.substring(g.f0(o12, "(", 0, 6) + 1, g.f0(o12, ")", 0, 6));
                        l.d(substring, "substring(...)");
                        ArrayList arrayList4 = new ArrayList();
                        Iterator it4 = g.r0(substring, new String[]{","}).iterator();
                        while (it4.hasNext()) {
                            String lowerCase2 = g.p0(g.v0((String) it4.next()).toString(), "'").toLowerCase(Locale.ROOT);
                            l.d(lowerCase2, "toLowerCase(...)");
                            arrayList4.add(lowerCase2);
                        }
                        arrayList3.add(new TVChannel("VTC", o13, (String) arrayList4.get(1), h10.c().getBaseUrl(), "VTC_BACKUP", (String) arrayList4.get(0), null, false, null, 0, 960, null));
                    }
                    h10.f12249b.e("VTC_BACKUP", arrayList3);
                    c2010d.d(arrayList3);
                } catch (Exception e2) {
                    c2010d.onError(e2);
                }
                c2010d.a();
                return;
            case 7:
                E e10 = (E) this.f8707b;
                ArrayList arrayList5 = new ArrayList();
                try {
                    f h12 = c2.i.h(((ChannelSourceConfig) e10.f12238c.getValue()).getBaseUrl());
                    LinkedHashMap linkedHashMap4 = e10.f12237b;
                    h12.a(linkedHashMap4);
                    vc.e b11 = h12.b();
                    l.b(b11);
                    LinkedHashMap linkedHashMap5 = b11.f25454d;
                    l.d(linkedHashMap5, "cookies(...)");
                    linkedHashMap4.putAll(linkedHashMap5);
                    zc.e m02 = b11.h().p0().m0(".row .col");
                    l.d(m02, "select(...)");
                    Iterator it5 = m02.iterator();
                    while (it5.hasNext()) {
                        xc.l lVar5 = (xc.l) it5.next();
                        try {
                            String o14 = ((xc.l) lVar5.i0("a").get(0)).o("href");
                            l.d(o14, "attr(...)");
                            HttpUrl.j.getClass();
                            String str = (String) o.e0(HttpUrl.Companion.b(o14).f22340f);
                            String o15 = ((xc.l) lVar5.i0("source").get(0)).o("srcset");
                            l.d(o15, "attr(...)");
                            arrayList5.add(new TVChannel("VOV", o15, str, o14, "VOV_BACKUP", str, null, false, null, 0, 960, null));
                            e10.f12236a.e("VOV_BACKUP", arrayList5);
                        } catch (Exception unused) {
                        }
                    }
                    c2010d.d(arrayList5);
                    c2010d.a();
                    return;
                } catch (Exception e11) {
                    c2010d.onError(e11);
                    return;
                }
        }
    }

    @Override // j4.InterfaceC1376b
    public Object e() {
        SQLiteDatabase l10;
        int i7 = 1;
        boolean z8 = false;
        Object obj = this.f8707b;
        switch (this.f8706a) {
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                i4.g gVar = (i4.g) ((i4.c) obj);
                gVar.getClass();
                int i10 = C1085a.f16776e;
                r8.o oVar = new r8.o(7, z8);
                oVar.f23858c = null;
                oVar.f23859d = new ArrayList();
                oVar.f23860e = null;
                oVar.f23857b = "";
                HashMap hashMap = new HashMap();
                l10 = gVar.l();
                l10.beginTransaction();
                try {
                    C1085a c1085a = (C1085a) i4.g.V(l10.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new M9.e(gVar, hashMap, oVar, 11));
                    l10.setTransactionSuccessful();
                    return c1085a;
                } finally {
                }
            case 12:
                i4.g gVar2 = (i4.g) ((i4.d) obj);
                long b2 = gVar2.f18413b.b() - gVar2.f18415d.f18404d;
                l10 = gVar2.l();
                l10.beginTransaction();
                try {
                    String[] strArr = {String.valueOf(b2)};
                    Cursor rawQuery = l10.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr);
                    while (rawQuery.moveToNext()) {
                        try {
                            gVar2.P(rawQuery.getInt(0), EnumC1087c.MESSAGE_TOO_OLD, rawQuery.getString(1));
                        } catch (Throwable th) {
                            rawQuery.close();
                            throw th;
                        }
                    }
                    rawQuery.close();
                    int delete = l10.delete("events", "timestamp_ms < ?", strArr);
                    l10.setTransactionSuccessful();
                    l10.endTransaction();
                    return Integer.valueOf(delete);
                } finally {
                }
            case 13:
                i4.g gVar3 = (i4.g) ((h4.i) obj).f17755i;
                l10 = gVar3.l();
                l10.beginTransaction();
                try {
                    l10.compileStatement("DELETE FROM log_event_dropped").execute();
                    l10.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + gVar3.f18413b.b()).execute();
                    l10.setTransactionSuccessful();
                    return null;
                } finally {
                }
            default:
                k kVar = (k) obj;
                Iterator it = ((Iterable) ((i4.g) kVar.f17763b).F(new C1265a(i7))).iterator();
                while (it.hasNext()) {
                    kVar.f17764c.a((C0838i) it.next(), 1, false);
                }
                return null;
        }
    }

    public void f(Display display) {
        t tVar = (t) this.f8707b;
        tVar.getClass();
        if (display != null) {
            long refreshRate = (long) (1.0E9d / display.getRefreshRate());
            tVar.k = refreshRate;
            tVar.f22036l = (refreshRate * 80) / 100;
        } else {
            AbstractC1705a.S("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            tVar.k = -9223372036854775807L;
            tVar.f22036l = -9223372036854775807L;
        }
    }

    @Override // f.InterfaceC1118b
    public void h(Object obj) {
        String str;
        C1117a c1117a = (C1117a) obj;
        int i7 = VoiceSearchActivity.f16250d0;
        Log.d("RowsSupportFragment", "result: " + c1117a);
        int i10 = c1117a.f16903a;
        VoiceSearchActivity voiceSearchActivity = (VoiceSearchActivity) this.f8707b;
        if (i10 == -1) {
            Intent intent = c1117a.f16904b;
            ArrayList<String> stringArrayListExtra = intent != null ? intent.getStringArrayListExtra("android.speech.extra.RESULTS") : null;
            La.g gVar = voiceSearchActivity.f16255Z;
            if (gVar == null) {
                l.j("voiceSelectorManager");
                throw null;
            }
            if (stringArrayListExtra == null || (str = (String) o.Z(stringArrayListExtra)) == null) {
                str = "";
            }
            gVar.g.e(new Pa.c(str));
            Log.d("RowsSupportFragment", "result: " + stringArrayListExtra);
            voiceSearchActivity.finish();
            voiceSearchActivity.overridePendingTransition(0, 0);
            return;
        }
        Pa.b bVar = Pa.b.f8263d;
        if (i10 != 0) {
            La.g gVar2 = voiceSearchActivity.f16255Z;
            if (gVar2 == null) {
                l.j("voiceSelectorManager");
                throw null;
            }
            gVar2.g.e(bVar);
            voiceSearchActivity.finish();
            voiceSearchActivity.overridePendingTransition(0, 0);
            return;
        }
        La.g gVar3 = voiceSearchActivity.f16255Z;
        if (gVar3 == null) {
            l.j("voiceSelectorManager");
            throw null;
        }
        gVar3.g.e(bVar);
        voiceSearchActivity.finish();
        voiceSearchActivity.overridePendingTransition(0, 0);
    }

    @Override // n5.i
    public void invoke(Object obj) {
        switch (this.f8706a) {
            case 19:
                ((v0) obj).g((C1562c0) this.f8707b);
                return;
            case 20:
                ((v0) obj).k((x) this.f8707b);
                return;
            case 21:
                ((v0) obj).m((a5.c) this.f8707b);
                return;
            case 22:
                ((v0) obj).g(((SurfaceHolderCallbackC1596z) this.f8707b).f20525a.f19842a0);
                return;
            case 23:
                ((v0) obj).K((F4.c) this.f8707b);
                return;
            case 24:
                n4.j jVar = (n4.j) obj;
                jVar.getClass();
                jVar.f21128v = ((C0474w) this.f8707b).f8150a;
                return;
            case BlurFactor.DEFAULT_RADIUS /* 25 */:
                ((n4.j) obj).f21120n = (q0) this.f8707b;
                return;
            default:
                n4.j jVar2 = (n4.j) obj;
                int i7 = jVar2.f21130x;
                q4.d dVar = (q4.d) this.f8707b;
                jVar2.f21130x = i7 + dVar.g;
                jVar2.f21131y += dVar.f23452e;
                return;
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exception) {
        switch (this.f8706a) {
            case 3:
                l.e(exception, "exception");
                C2037a c2037a = (C2037a) this.f8707b;
                if (c2037a.g()) {
                    return;
                }
                c2037a.a(exception);
                return;
            default:
                C1260f c1260f = (C1260f) this.f8707b;
                c1260f.a();
                c1260f.f17851e = c1260f.f17851e == -1 ? 30L : c1260f.f17851e * 2 < 960 ? c1260f.f17851e * 2 : 960L;
                c1260f.f17850d = c1260f.f17849c.schedule(new S2(c1260f, 28), c1260f.f17851e, TimeUnit.SECONDS);
                return;
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        ((Aa.t) this.f8707b).invoke(obj);
    }

    @Override // jb.InterfaceC1390a
    public void run() {
        int i7 = CloudMessagingService.f16116C;
        CloudMessagingService t5 = (CloudMessagingService) this.f8707b;
        l.e(t5, "t");
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        C1259e c1259e = (C1259e) this.f8707b;
        C1256b c1256b = (C1256b) obj;
        c1259e.f17843i.execute(new Aa.j(16, c1259e, c1256b));
        c1259e.f17845m = c1256b;
        h7.k kVar = c1259e.f17841f;
        kVar.getClass();
        C1256b a9 = c1256b instanceof C1256b ? c1256b : C1256b.a(c1256b.f17829a);
        kVar.f17865e = a9.f17830b + ((long) (a9.f17831c * 0.5d)) + 300000;
        long j = kVar.f17865e;
        long j10 = a9.f17830b;
        long j11 = a9.f17831c;
        if (j > j10 + j11) {
            kVar.f17865e = (j10 + j11) - 60000;
        }
        if (kVar.a()) {
            C1260f c1260f = kVar.f17861a;
            long j12 = kVar.f17865e;
            kVar.f17862b.getClass();
            c1260f.b(j12 - System.currentTimeMillis());
        }
        Iterator it = c1259e.f17839d.iterator();
        if (it.hasNext()) {
            throw h3.o.j(it);
        }
        C1257c a10 = C1257c.a(c1256b);
        Iterator it2 = c1259e.f17838c.iterator();
        while (it2.hasNext()) {
            H7.b bVar = (H7.b) it2.next();
            bVar.f4900a.execute(new Aa.j(2, bVar.f4901b, a10));
        }
        return Tasks.forResult(c1256b);
    }
}
