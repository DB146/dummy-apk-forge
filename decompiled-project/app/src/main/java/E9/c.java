package E9;

import A9.C0163z1;
import A9.N2;
import Db.j;
import Db.o;
import Eb.B;
import Eb.p;
import Hc.e;
import I2.C0330t;
import N6.F;
import N6.H;
import N6.t0;
import N6.y0;
import P4.A;
import P4.AbstractC0453a;
import P4.C0466n;
import P4.Y;
import P4.g0;
import R7.a;
import U4.m;
import V4.c;
import a3.C0723O;
import ac.AbstractC0796a;
import ac.n;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.exoplayer2.source.dash.DashMediaSource$Factory;
import com.google.android.exoplayer2.source.rtsp.RtspMediaSource$Factory;
import com.kt.apps.core.utils.NetworkUtilsKt;
import com.kt.apps.core.utils.UtilsKt;
import com.kt.apps.media.xemtv.App;
import ea.C1108c;
import i1.C1290a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.internal.l;
import l2.X;
import m4.AbstractC1571h;
import m4.B0;
import m4.C1548B;
import m4.C1549C;
import m4.C1551E;
import m4.C1558a0;
import m4.C1562c0;
import m4.C1582m0;
import m4.C1585o;
import m4.P;
import m4.Q;
import m4.T;
import m4.U;
import m4.V;
import m4.W;
import m4.q0;
import m4.r0;
import m4.v0;
import n5.AbstractC1705a;
import n5.D;
import o4.C1791e;
import okhttp3.HttpUrl;
import org.json.JSONObject;
import q3.s;
import r4.C1934f;
import r4.InterfaceC1926E;
import r4.q;
import t8.C2034c;
import x9.AbstractC2271a;

/* loaded from: classes2.dex */
public abstract class c implements Application.ActivityLifecycleCallbacks {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f3804f = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Context f3805a;

    /* renamed from: b, reason: collision with root package name */
    public final P9.c f3806b;

    /* renamed from: c, reason: collision with root package name */
    public C1549C f3807c;

    /* renamed from: d, reason: collision with root package name */
    public final o f3808d;

    /* renamed from: e, reason: collision with root package name */
    public final o f3809e;

    static {
        android.support.v4.media.session.b.z(new C0163z1(15));
    }

    public c(Context _application, e _audioFocusManager, P9.c _historyManager) {
        l.e(_application, "_application");
        l.e(_audioFocusManager, "_audioFocusManager");
        l.e(_historyManager, "_historyManager");
        this.f3805a = _application;
        this.f3806b = _historyManager;
        android.support.v4.media.session.b.z(new C0163z1(16));
        this.f3808d = android.support.v4.media.session.b.z(new C0163z1(17));
        this.f3809e = android.support.v4.media.session.b.z(new N2(this, 5));
        ((App) _application).registerActivityLifecycleCallbacks(this);
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [m4.Q, m4.S] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, m4.b0] */
    public static C1558a0 b(i iVar, Map map, LinkedHashMap linkedHashMap) {
        String str;
        String str2;
        String str3;
        W w10;
        String str4;
        Object obj;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        int i7 = 1;
        String str10 = iVar.f3822b;
        int length = str10.length();
        String str11 = iVar.f3821a;
        if (length == 0) {
            str10 = UtilsKt.getBaseUrl(str11);
        }
        Bundle e2 = com.bumptech.glide.c.e();
        if (linkedHashMap != null) {
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                e2.putString((String) entry.getKey(), (String) entry.getValue());
            }
        }
        if (str10.length() > 0) {
            e2.putString("extra:referer", str10);
        }
        X x2 = new X(i7);
        x2.f19194b = Uri.parse(ac.g.v0(str11).toString());
        x2.f19196d = e2;
        W w11 = new W(x2);
        ?? obj2 = new Object();
        obj2.f20239a = map != null ? (String) map.get("extra:media_title") : null;
        obj2.f20242d = map != null ? (String) map.get("extra:media_album_artist") : null;
        obj2.f20241c = map != null ? (String) map.get("extra:media_album_title") : null;
        if (map == null || (str = (String) map.get("extra:media_thumb")) == null) {
            str = "";
        }
        obj2.f20247l = Uri.parse(str);
        obj2.g = map != null ? (String) map.get("extra:media_description") : null;
        obj2.f20243e = map != null ? (String) map.get("extra:media_title") : null;
        String str12 = iVar.f3823c;
        j jVar = new j("extra:media_id", (map == null || (str9 = (String) map.get("extra:media_id")) == null) ? str12 : str9);
        if (map != null) {
            str3 = (String) map.get("extra:media_title");
            str2 = str12;
        } else {
            str2 = str12;
            str3 = null;
        }
        j jVar2 = new j("extra:media_title", str3);
        j jVar3 = new j("extra:media_album_artist", map != null ? (String) map.get("extra:media_album_artist") : null);
        j jVar4 = new j("extra:media_album_title", map != null ? (String) map.get("extra:media_album_title") : null);
        j jVar5 = new j("extra:media_thumb", map != null ? (String) map.get("extra:media_thumb") : null);
        j jVar6 = new j("extra:media_description", map != null ? (String) map.get("extra:media_description") : null);
        if (map != null) {
            str4 = (String) map.get("extra:media_duration");
            w10 = w11;
        } else {
            w10 = w11;
            str4 = null;
        }
        j jVar7 = new j("extra:media_duration", str4);
        if (map != null) {
            str5 = (String) map.get("extra:media_current_position");
            obj = "extra:media_id";
        } else {
            obj = "extra:media_id";
            str5 = null;
        }
        j jVar8 = new j("extra:media_current_position", str5);
        if (map != null) {
            str7 = (String) map.get("extra:media_source_type");
            str6 = str11;
        } else {
            str6 = str11;
            str7 = null;
        }
        obj2.f20238G = com.bumptech.glide.c.f(jVar, jVar2, jVar3, jVar4, jVar5, jVar6, jVar7, jVar8, new j("extra:media_source_type", str7), new j("extra:media_last_play_time", map != null ? (String) map.get("extra:media_last_play_time") : null), new j("extra:referer", str10), new j("extra:is_hls", Boolean.valueOf(iVar.f3824d)));
        obj2.f20252q = Boolean.TRUE;
        C1562c0 c1562c0 = new C1562c0(obj2);
        String obj3 = ac.g.v0(str6).toString();
        C1558a0 c1558a0 = C1558a0.f20217u;
        P p10 = new P();
        S2.b bVar = new S2.b();
        List emptyList = Collections.emptyList();
        t0 t0Var = t0.f7341e;
        W w12 = W.f20184c;
        Uri parse = obj3 == null ? null : Uri.parse(obj3);
        AbstractC1705a.m(((Uri) bVar.f8987e) == null || ((UUID) bVar.f8986d) != null);
        L7.j a9 = new C1558a0("", new Q(p10), parse != null ? new V(parse, null, ((UUID) bVar.f8986d) != null ? new T(bVar) : null, null, emptyList, null, t0Var) : null, new U(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), C1562c0.f20268W, w12).a();
        String str13 = (map == null || (str8 = (String) map.get(obj)) == null) ? str2 : str8;
        str13.getClass();
        a9.f6356b = str13;
        a9.f6364m = w10;
        a9.k = c1562c0;
        return a9.b();
    }

    public static W9.b c(C1558a0 c1558a0) {
        String string;
        C1562c0 c1562c0 = c1558a0.f20226d;
        Bundle bundle = c1562c0.f20318V;
        if (bundle != null) {
            Set<String> keySet = bundle.keySet();
            l.d(keySet, "keySet(...)");
            for (String str : keySet) {
                String message = "key: " + str + ", value: " + bundle.get(str);
                l.e(message, "message");
            }
        }
        try {
            Bundle bundle2 = c1562c0.f20318V;
            String str2 = "IPTV";
            if (bundle2 != null && (string = bundle2.getString("extra:media_source_type", "IPTV")) != null) {
                str2 = string;
            }
            return W9.b.valueOf(str2);
        } catch (Exception unused) {
            return W9.b.f10855a;
        }
    }

    public final C1549C a() {
        C1585o c1585o = new C1585o(this.f3805a);
        AbstractC1705a.m(!c1585o.f20468u);
        c1585o.j = 2;
        C1791e c1791e = (C1791e) this.f3808d.getValue();
        AbstractC1705a.m(!c1585o.f20468u);
        c1791e.getClass();
        c1585o.f20457h = c1791e;
        c1585o.f20458i = true;
        AbstractC1705a.m(!c1585o.f20468u);
        c1585o.k = true;
        AbstractC1705a.m(!c1585o.f20468u);
        c1585o.f20468u = true;
        return new C1549C(c1585o);
    }

    /* JADX WARN: Type inference failed for: r6v24, types: [com.google.android.exoplayer2.source.hls.HlsMediaSource$Factory] */
    /* JADX WARN: Type inference failed for: r6v42, types: [kotlin.jvm.internal.v, java.lang.Object] */
    public void d(List linkStreams, boolean z8, Map itemMetaData, v0 v0Var, Map map) {
        int i7;
        String str;
        String str2;
        AbstractC0453a a9;
        String str3;
        InterfaceC1926E c0330t;
        InterfaceC1926E interfaceC1926E;
        q qVar;
        q k;
        boolean z10 = true;
        l.e(linkStreams, "linkStreams");
        l.e(itemMetaData, "itemMetaData");
        e();
        NetworkUtilsKt.trustEveryone();
        ArrayList arrayList = new ArrayList(p.S(linkStreams, 10));
        Iterator it = linkStreams.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            C0723O c0723o = new C0723O();
            if (map == null || (str = (String) map.get("user-agent")) == null) {
                str = map != null ? (String) map.get("http-user-agent") : null;
                if (str == null) {
                    str = AbstractC2271a.a();
                }
            }
            c0723o.f12522f = str;
            c0723o.f12519c = z10;
            c0723o.f12520d = z10;
            String str4 = map != null ? (String) map.get("referer") : null;
            if (str4 == null || str4.length() == 0) {
                str4 = null;
            }
            if (str4 == null) {
                str4 = map != null ? (String) map.get("http-referer") : null;
                if (str4 == null || str4.length() == 0) {
                    str4 = null;
                }
                if (str4 == null) {
                    str4 = iVar.f3822b;
                    if (str4.length() <= 0) {
                        str4 = null;
                    }
                    if (str4 == null) {
                        str4 = UtilsKt.getBaseUrl(iVar.f3821a);
                    }
                }
            }
            if (str4.length() == 0) {
                str4 = UtilsKt.getBaseUrl(((i) Eb.o.Y(linkStreams)).f3821a);
            }
            boolean b02 = ac.g.b0(str4, "auth_key");
            try {
                HttpUrl.Companion companion = HttpUrl.j;
                String obj = ac.g.v0(str4).toString();
                companion.getClass();
                str2 = HttpUrl.Companion.b(obj).f22338d;
            } catch (Exception unused) {
                str2 = "";
            }
            LinkedHashMap I6 = B.I(new j("Origin", UtilsKt.getBaseUrl(str4)), new j("Referer", ac.g.v0(str4).toString()));
            if (b02) {
                I6.put("Host", str2);
            }
            iVar.getClass();
            if (map != null) {
                String str5 = (String) map.get("user-agent");
                if (str5 != null) {
                    I6.put("user-agent", str5);
                } else {
                    String str6 = (String) map.get("http-user-agent");
                    if (str6 != null) {
                        I6.put("user-agent", str6);
                        I6.put("http-user-agent", str6);
                    }
                }
            }
            c0723o.f12520d = z10;
            c0723o.f12519c = z10;
            if (!I6.containsKey("user-agent")) {
                I6.put("user-agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/106.0.0.0 Safari/537.36");
            }
            c0723o.f12522f = (String) I6.get("user-agent");
            C1108c c1108c = (C1108c) c0723o.f12521e;
            synchronized (c1108c) {
                c1108c.f16830b = null;
                ((HashMap) c1108c.f16831c).clear();
                ((HashMap) c1108c.f16831c).putAll(I6);
            }
            if (z8 || ac.g.b0(iVar.f3821a, ".m3u8")) {
                final C2034c c2034c = new C2034c(c0723o, 12);
                a9 = new A(c2034c) { // from class: com.google.android.exoplayer2.source.hls.HlsMediaSource$Factory

                    /* renamed from: a, reason: collision with root package name */
                    public final a f14718a;

                    /* renamed from: f, reason: collision with root package name */
                    public final X f14723f = new X();

                    /* renamed from: c, reason: collision with root package name */
                    public final e f14720c = new e(16);

                    /* renamed from: d, reason: collision with root package name */
                    public final Y f14721d = c.f10044C;

                    /* renamed from: b, reason: collision with root package name */
                    public final U4.c f14719b = U4.j.f9546a;
                    public final Y5.B g = new Y5.B(14);

                    /* renamed from: e, reason: collision with root package name */
                    public final h8.e f14722e = new h8.e(12);

                    /* renamed from: i, reason: collision with root package name */
                    public final int f14725i = 1;
                    public final long j = -9223372036854775807L;

                    /* renamed from: h, reason: collision with root package name */
                    public final boolean f14724h = true;

                    {
                        this.f14718a = new a(c2034c, 6);
                    }

                    @Override // P4.A
                    /* renamed from: b, reason: merged with bridge method [inline-methods] */
                    public final m a(C1558a0 c1558a0) {
                        c1558a0.f20224b.getClass();
                        V4.p pVar = this.f14720c;
                        List list = c1558a0.f20224b.f20181e;
                        if (!list.isEmpty()) {
                            pVar = new s(21, pVar, list, false);
                        }
                        U4.c cVar = this.f14719b;
                        q e2 = this.f14723f.e(c1558a0);
                        Y5.B b2 = this.g;
                        this.f14721d.getClass();
                        a aVar = this.f14718a;
                        return new m(c1558a0, aVar, cVar, this.f14722e, e2, b2, new c(aVar, b2, pVar), this.j, this.f14724h, this.f14725i);
                    }
                }.a(b(iVar, itemMetaData, I6));
            } else if (n.Y(iVar.f3821a, "rtp", false) || n.Y(iVar.f3821a, "rtsp", false)) {
                RtspMediaSource$Factory rtspMediaSource$Factory = new RtspMediaSource$Factory();
                rtspMediaSource$Factory.f14727b = true;
                a9 = rtspMediaSource$Factory.a(b(iVar, itemMetaData, null));
            } else if (n.Y(iVar.f3821a, "udp", false)) {
                A4.p pVar = new A4.p(15);
                A1.d dVar = new A1.d(new A4.p(16), 28);
                Object obj2 = new Object();
                Y5.B b2 = new Y5.B(14);
                C1558a0 b10 = b(iVar, itemMetaData, I6);
                b10.f20224b.getClass();
                b10.f20224b.getClass();
                T t5 = b10.f20224b.f20179c;
                if (t5 == null || D.f21141a < 18) {
                    qVar = q.f23775a;
                } else {
                    synchronized (obj2) {
                        try {
                            k = !t5.equals(null) ? X.k(t5) : null;
                            k.getClass();
                        } finally {
                        }
                    }
                    qVar = k;
                }
                a9 = new P4.W(b10, pVar, dVar, qVar, b2, 1048576);
            } else if (ac.g.b0(iVar.f3821a, ".mpd")) {
                String str7 = map != null ? (String) map.get("inputstream.adaptive.license_key") : null;
                ?? obj3 = new Object();
                UUID CLEARKEY_UUID = AbstractC1571h.f20385d;
                l.d(CLEARKEY_UUID, "WIDEVINE_UUID");
                if (str7 == null || str7.length() == 0) {
                    str3 = null;
                } else {
                    String message = "licenseUriStr: ".concat(str7);
                    l.e(message, "message");
                    try {
                    } catch (Exception unused2) {
                        CLEARKEY_UUID = AbstractC1571h.f20384c;
                        l.d(CLEARKEY_UUID, "CLEARKEY_UUID");
                        C0723O c0723o2 = new C0723O();
                        c0723o2.f12519c = true;
                        String str8 = (String) I6.get("user-agent");
                        if (str8 == null) {
                            str8 = AbstractC2271a.a();
                        }
                        c0723o2.f12522f = str8;
                        c0723o2.f12519c = true;
                        c0723o2.f12520d = true;
                        c0330t = new C0330t(str7, true, c0723o2);
                    }
                    if (new JSONObject(str7).optJSONArray("keys") != null) {
                        CLEARKEY_UUID = AbstractC1571h.f20384c;
                        l.d(CLEARKEY_UUID, "CLEARKEY_UUID");
                        byte[] bytes = str7.getBytes(AbstractC0796a.f12815a);
                        l.d(bytes, "getBytes(...)");
                        interfaceC1926E = new C1290a(bytes, 19);
                        obj3.f19134a = new C1934f(CLEARKEY_UUID, interfaceC1926E, new HashMap(), false, new int[0], false, new Y5.B(14));
                        str3 = str7;
                    } else {
                        String str9 = (String) map.get("inputstream.adaptive.license_type");
                        if (str9 == null || !ac.g.b0(str9, "widevine")) {
                            throw new Exception("Invalid license key");
                            break;
                        }
                        CLEARKEY_UUID = AbstractC1571h.f20384c;
                        l.d(CLEARKEY_UUID, "CLEARKEY_UUID");
                        C0723O c0723o3 = new C0723O();
                        c0723o3.f12519c = true;
                        String str10 = (String) I6.get("user-agent");
                        if (str10 == null) {
                            str10 = AbstractC2271a.a();
                        }
                        c0723o3.f12522f = str10;
                        c0723o3.f12519c = true;
                        c0723o3.f12520d = true;
                        c0330t = new C0330t(str7, true, c0723o3);
                        interfaceC1926E = c0330t;
                        obj3.f19134a = new C1934f(CLEARKEY_UUID, interfaceC1926E, new HashMap(), false, new int[0], false, new Y5.B(14));
                        str3 = str7;
                    }
                }
                DashMediaSource$Factory dashMediaSource$Factory = new DashMediaSource$Factory(new S4.j(c0723o), c0723o);
                dashMediaSource$Factory.f14716e = new a(this);
                if (((C1934f) obj3.f19134a) != null) {
                    dashMediaSource$Factory.f14714c = new A1.d((Object) obj3, 16);
                }
                L7.j a10 = b(iVar, itemMetaData, I6).a();
                S2.b bVar = new S2.b(CLEARKEY_UUID);
                bVar.f8984b = false;
                bVar.f8985c = false;
                F f4 = H.f7232b;
                bVar.g = H.F(t0.f7341e);
                if (str3 != null && str3.length() != 0) {
                    bVar.f8987e = Uri.parse(str3);
                    String str11 = (String) I6.get("user-agent");
                    if (str11 == null) {
                        str11 = AbstractC2271a.a();
                    }
                    LinkedHashMap I10 = B.I(new j("user-agent", str11));
                    try {
                        HttpUrl.j.getClass();
                        I10.put("Host", HttpUrl.Companion.b(str3).f22338d);
                    } catch (Exception unused3) {
                    }
                    bVar.f8988f = y0.b(I10);
                    bVar.f8983a = false;
                }
                a10.f6360f = new T(bVar).a();
                a9 = dashMediaSource$Factory.a(a10.b());
            } else if (ac.g.b0(iVar.f3821a, ".mp4")) {
                a9 = new C0466n(new C2034c(c0723o, 12)).a(b(iVar, itemMetaData, I6));
            } else {
                a9 = new C0466n(new C2034c(c0723o, 12)).a(b(iVar, itemMetaData, I6));
            }
            arrayList.add(a9);
            z10 = true;
        }
        boolean z11 = false;
        if (arrayList.isEmpty()) {
            q0 q0Var = new q0("No media source found", new Throwable("No media source found"), 2000, SystemClock.elapsedRealtime());
            if (v0Var != null) {
                v0Var.i(q0Var);
                return;
            } else {
                ((v0) this.f3809e.getValue()).i(q0Var);
                return;
            }
        }
        C1549C c1549c = this.f3807c;
        if (c1549c != null) {
            c1549c.E0();
            c1549c.E0();
            c1549c.a0(c1549c.f19872w0);
            c1549c.W();
            c1549c.f19835T++;
            ArrayList arrayList2 = c1549c.f19819C;
            if (!arrayList2.isEmpty()) {
                int size = arrayList2.size();
                for (int i10 = size - 1; i10 >= 0; i10--) {
                    arrayList2.remove(i10);
                }
                g0 g0Var = c1549c.f19840Y;
                int[] iArr = g0Var.f8043b;
                int[] iArr2 = new int[iArr.length - size];
                int i11 = 0;
                int i12 = 0;
                while (i11 < iArr.length) {
                    int i13 = iArr[i11];
                    if (i13 < 0 || i13 >= size) {
                        i7 = 1;
                        int i14 = i11 - i12;
                        if (i13 >= 0) {
                            i13 -= size;
                        }
                        iArr2[i14] = i13;
                    } else {
                        i7 = 1;
                        i12++;
                    }
                    i11 += i7;
                }
                c1549c.f19840Y = new g0(iArr2, new Random(g0Var.f8042a.nextLong()));
            }
            ArrayList arrayList3 = new ArrayList();
            for (int i15 = 0; i15 < arrayList.size(); i15++) {
                C1582m0 c1582m0 = new C1582m0((AbstractC0453a) arrayList.get(i15), c1549c.f19820D);
                arrayList3.add(c1582m0);
                arrayList2.add(i15, new C1548B(c1582m0.f20436b, c1582m0.f20435a.f8144C));
            }
            c1549c.f19840Y = c1549c.f19840Y.a(arrayList3.size());
            B0 b03 = new B0(arrayList2, c1549c.f19840Y);
            boolean p10 = b03.p();
            int i16 = b03.f19810d;
            if (!p10 && -1 >= i16) {
                throw new IllegalStateException();
            }
            int a11 = b03.a(c1549c.f19834S);
            r0 h02 = c1549c.h0(c1549c.f19872w0, b03, c1549c.i0(b03, a11, -9223372036854775807L));
            int i17 = h02.f20486e;
            if (a11 != -1 && i17 != 1) {
                i17 = (b03.p() || a11 >= i16) ? 4 : 2;
            }
            r0 g = h02.g(i17);
            c1549c.f19875y.f19951v.a(17, new C1551E(arrayList3, c1549c.f19840Y, a11, D.M(-9223372036854775807L))).b();
            if (!c1549c.f19872w0.f20483b.f8157a.equals(g.f20483b.f8157a) && !c1549c.f19872w0.f20482a.p()) {
                z11 = true;
            }
            c1549c.C0(g, 0, 1, z11, 4, c1549c.X(g), -1, false);
        }
        C1549C c1549c2 = this.f3807c;
        if (c1549c2 != null) {
            c1549c2.m0((v0) this.f3809e.getValue());
        }
        C1549C c1549c3 = this.f3807c;
        if (c1549c3 != null) {
            c1549c3.K((v0) this.f3809e.getValue());
        }
        if (v0Var != null) {
            C1549C c1549c4 = this.f3807c;
            if (c1549c4 != null) {
                c1549c4.m0(v0Var);
            }
            C1549C c1549c5 = this.f3807c;
            if (c1549c5 != null) {
                c1549c5.f19877z.a(v0Var);
            }
        }
        C1549C c1549c6 = this.f3807c;
        if (c1549c6 != null) {
            c1549c6.q0(true);
        }
        C1549C c1549c7 = this.f3807c;
        if (c1549c7 != null) {
            c1549c7.k0();
        }
    }

    public abstract void e();

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        l.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        l.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        C1558a0 k;
        l.e(activity, "activity");
        C1549C c1549c = this.f3807c;
        if (c1549c == null || (k = c1549c.k()) == null) {
            return;
        }
        C1549C c1549c2 = this.f3807c;
        l.b(c1549c2);
        if (c1549c2.j() > 120000) {
            C1549C c1549c3 = this.f3807c;
            l.b(c1549c3);
            if (c1549c3.Q() > 60000) {
                C1549C c1549c4 = this.f3807c;
                l.b(c1549c4);
                long Q3 = c1549c4.Q();
                C1549C c1549c5 = this.f3807c;
                l.b(c1549c5);
                long j = c1549c5.j();
                W9.b type = c(k);
                l.e(type, "type");
                C1562c0 mediaMetadata = k.f20226d;
                l.d(mediaMetadata, "mediaMetadata");
                W requestMetadata = k.f20228f;
                l.d(requestMetadata, "requestMetadata");
                String mediaId = k.f20223a;
                l.d(mediaId, "mediaId");
                this.f3806b.a(new W9.c(mediaId, String.valueOf(mediaMetadata.f20321c), String.valueOf(mediaMetadata.f20323e), String.valueOf(mediaMetadata.f20330z), Q3, j, false, String.valueOf(mediaMetadata.f20325u), String.valueOf(requestMetadata.f20189a), type, System.currentTimeMillis()), 0L);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        C1549C c1549c;
        l.e(activity, "activity");
        if (!ac.g.b0(activity.getClass().getName(), "PlaybackActivity") || (c1549c = this.f3807c) == null) {
            return;
        }
        c1549c.q0(true);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        l.e(activity, "activity");
        l.e(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        l.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        C1549C c1549c;
        l.e(activity, "activity");
        if (!ac.g.b0(activity.getClass().getName(), "PlaybackActivity") || (c1549c = this.f3807c) == null) {
            return;
        }
        c1549c.y0();
    }
}
