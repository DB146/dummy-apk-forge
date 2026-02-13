package Z9;

import P4.Y;
import W9.e;
import ac.AbstractC0796a;
import android.content.Context;
import ca.C0918a;
import com.kt.apps.core.storage.local.RoomDataBase;
import com.kt.apps.core.tv.datasource.impl.MainTVDataSource$TVChannelFromDB;
import com.kt.apps.core.tv.datasource.impl.MainTVDataSource$TVChannelURLSrc;
import com.kt.apps.core.tv.datasource.impl.MainTVDataSource$TVChannelUrlType;
import com.kt.apps.core.tv.model.TVChannel;
import com.kt.apps.core.tv.model.TVChannelLinkStream;
import com.kt.apps.core.utils.StringUtilsKt;
import com.kt.apps.core.utils.UtilsKt;
import gb.AbstractC1204a;
import hb.C1268a;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import mb.InterfaceC1655a;
import ob.C1835c;
import ob.C1837e;
import ob.C1842j;
import okhttp3.HttpUrl;
import org.json.JSONObject;
import rb.C1954a;
import sb.C2012f;
import y7.u0;

/* loaded from: classes2.dex */
public final class s implements Y9.a {

    /* renamed from: a, reason: collision with root package name */
    public final B f12299a;

    /* renamed from: b, reason: collision with root package name */
    public final D f12300b;

    /* renamed from: c, reason: collision with root package name */
    public final C0670g f12301c;

    /* renamed from: d, reason: collision with root package name */
    public final F f12302d;

    /* renamed from: e, reason: collision with root package name */
    public final H f12303e;

    /* renamed from: f, reason: collision with root package name */
    public final E f12304f;
    public final C0669f g;

    /* renamed from: h, reason: collision with root package name */
    public final t f12305h;

    /* renamed from: i, reason: collision with root package name */
    public final j f12306i;
    public final u8.c j;
    public final Cb.a k;

    /* renamed from: l, reason: collision with root package name */
    public final RoomDataBase f12307l;

    /* renamed from: m, reason: collision with root package name */
    public final Context f12308m;

    /* renamed from: n, reason: collision with root package name */
    public final Db.o f12309n;

    public s(B sctvDataSource, D vDataSourceImpl, C0670g c0670g, F vtvDataSourceImpl, H h10, E e2, C0669f c0669f, t tVar, j jVar, u8.c firebaseRemoteConfig, Cb.a tvStorage, RoomDataBase roomDataBase, Context context) {
        kotlin.jvm.internal.l.e(sctvDataSource, "sctvDataSource");
        kotlin.jvm.internal.l.e(vDataSourceImpl, "vDataSourceImpl");
        kotlin.jvm.internal.l.e(vtvDataSourceImpl, "vtvDataSourceImpl");
        kotlin.jvm.internal.l.e(firebaseRemoteConfig, "firebaseRemoteConfig");
        kotlin.jvm.internal.l.e(tvStorage, "tvStorage");
        kotlin.jvm.internal.l.e(roomDataBase, "roomDataBase");
        kotlin.jvm.internal.l.e(context, "context");
        this.f12299a = sctvDataSource;
        this.f12300b = vDataSourceImpl;
        this.f12301c = c0670g;
        this.f12302d = vtvDataSourceImpl;
        this.f12303e = h10;
        this.f12304f = e2;
        this.g = c0669f;
        this.f12305h = tVar;
        this.f12306i = jVar;
        this.j = firebaseRemoteConfig;
        this.k = tvStorage;
        this.f12307l = roomDataBase;
        this.f12308m = context;
        this.f12309n = android.support.v4.media.session.b.z(new S9.a(15));
    }

    public static final pb.p c(s sVar) {
        sVar.getClass();
        Object bVar = new tb.b(new k(sVar), 0);
        return new pb.p(new pb.l(bVar instanceof InterfaceC1655a ? ((InterfaceC1655a) bVar).a() : new ob.l(bVar, 3)));
    }

    public static final sb.q d(s sVar, TVChannel.Url url, TVChannel tVChannel) {
        TVChannel copy;
        gb.i b2;
        sVar.getClass();
        copy = tVChannel.copy((r22 & 1) != 0 ? tVChannel.tvGroup : null, (r22 & 2) != 0 ? tVChannel.logoChannel : null, (r22 & 4) != 0 ? tVChannel.tvChannelName : null, (r22 & 8) != 0 ? tVChannel.tvChannelWebDetailPage : url.getUrl(), (r22 & 16) != 0 ? tVChannel.sourceFrom : null, (r22 & 32) != 0 ? tVChannel.channelId : null, (r22 & 64) != 0 ? tVChannel.urls : null, (r22 & 128) != 0 ? tVChannel.isFreeContent : false, (r22 & 256) != 0 ? tVChannel.referer : url.getUrl(), (r22 & 512) != 0 ? tVChannel.channelNumber : 0);
        String message = "getStreamUrlByWebUrlAndSrc: " + url;
        kotlin.jvm.internal.l.e(message, "message");
        String message2 = "getStreamUrlByWebUrlAndSrc: " + tVChannel;
        kotlin.jvm.internal.l.e(message2, "message");
        String dataSource = url.getDataSource();
        if (kotlin.jvm.internal.l.a(dataSource, MainTVDataSource$TVChannelURLSrc.VTV.getValue())) {
            b2 = sVar.f12302d.b(copy, false);
        } else if (kotlin.jvm.internal.l.a(dataSource, MainTVDataSource$TVChannelURLSrc.ON_LIVE.getValue())) {
            b2 = sVar.f12305h.b(copy, false);
        } else if (kotlin.jvm.internal.l.a(dataSource, MainTVDataSource$TVChannelURLSrc.VOV.getValue())) {
            b2 = sVar.f12304f.b(copy, false);
        } else if (kotlin.jvm.internal.l.a(dataSource, MainTVDataSource$TVChannelURLSrc.HTV.getValue())) {
            b2 = sVar.g.b(copy, false);
        } else if (kotlin.jvm.internal.l.a(dataSource, MainTVDataSource$TVChannelURLSrc.VTC.getValue())) {
            b2 = sVar.f12303e.b(copy, false);
        } else if (kotlin.jvm.internal.l.a(dataSource, MainTVDataSource$TVChannelURLSrc.HY.getValue())) {
            b2 = sVar.f12301c.b(copy, false);
        } else if (kotlin.jvm.internal.l.a(dataSource, MainTVDataSource$TVChannelURLSrc.SCTV.getValue())) {
            b2 = sVar.f12299a.b(copy, false);
        } else {
            boolean a9 = kotlin.jvm.internal.l.a(dataSource, MainTVDataSource$TVChannelURLSrc.f16150V.getValue());
            D d10 = sVar.f12300b;
            b2 = a9 ? d10.b(copy, false) : kotlin.jvm.internal.l.a(dataSource, MainTVDataSource$TVChannelURLSrc.IPTV_BACKUP.getValue()) ? sVar.f12306i.b(copy, false) : d10.b(copy, false);
        }
        return new sb.q(new sb.g(b2, new m(sVar, 0), 5), new o(sVar, url, tVChannel), 2);
    }

    public static TVChannelLinkStream f(ArrayList arrayList, TVChannel tVChannel) {
        String str;
        TVChannel.Url fromUrl;
        HttpUrl httpUrl;
        ArrayList arrayList2 = new ArrayList(Eb.p.S(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            TVChannel.Url url = (TVChannel.Url) it.next();
            TVChannel.Url.Companion companion = TVChannel.Url.Companion;
            String url2 = url.getUrl();
            String value = MainTVDataSource$TVChannelUrlType.STREAM.getValue();
            String referer = url.getReferer();
            if (referer == null) {
                HttpUrl.Companion companion2 = HttpUrl.j;
                String url3 = url.getUrl();
                companion2.getClass();
                kotlin.jvm.internal.l.e(url3, "<this>");
                try {
                    httpUrl = HttpUrl.Companion.b(url3);
                } catch (IllegalArgumentException unused) {
                    httpUrl = null;
                }
                referer = httpUrl != null ? UtilsKt.toOrigin(httpUrl) : null;
                if (referer == null) {
                    str = url.getUrl();
                    fromUrl = companion.fromUrl(url2, (r15 & 2) != 0 ? MainTVDataSource$TVChannelUrlType.STREAM.getValue() : value, (r15 & 4) != 0 ? null : null, (r15 & 8) != 0 ? null : str, (r15 & 16) != 0 ? null : null, (r15 & 32) != 0 ? null : null, (r15 & 64) == 0 ? null : null);
                    arrayList2.add(fromUrl);
                }
            }
            str = referer;
            fromUrl = companion.fromUrl(url2, (r15 & 2) != 0 ? MainTVDataSource$TVChannelUrlType.STREAM.getValue() : value, (r15 & 4) != 0 ? null : null, (r15 & 8) != 0 ? null : str, (r15 & 16) != 0 ? null : null, (r15 & 32) != 0 ? null : null, (r15 & 64) == 0 ? null : null);
            arrayList2.add(fromUrl);
        }
        return new TVChannelLinkStream(tVChannel, arrayList2);
    }

    @Override // Y9.a
    public final gb.i a() {
        U9.o oVar = (U9.o) this.f12307l.D();
        oVar.getClass();
        tb.e eVar = new tb.e(android.support.v4.media.session.b.k(oVar.f9904a, true, new Ba.o(oVar, 18)), C0668e.f12265f, 1);
        Object obj = this.k.get();
        kotlin.jvm.internal.l.d(obj, "get(...)");
        u8.c remoteConfig = this.j;
        kotlin.jvm.internal.l.e(remoteConfig, "remoteConfig");
        return new sb.q(new C1954a(1, new tb.e(new tb.b(new M9.e(remoteConfig, this, (C0918a) obj, 2), 0), Y9.b.f12065a, 2), new q3.e(22, this, eVar)), C0668e.f12264e, 1).q(Ab.e.f1561c);
    }

    @Override // Y9.a
    public final gb.i b(TVChannel tvChannel, boolean z8) {
        kotlin.jvm.internal.l.e(tvChannel, "tvChannel");
        String message = "getTVFromDetail: " + new G8.m().f(tvChannel) + ", isBackup: " + z8;
        kotlin.jvm.internal.l.e(message, "message");
        List<TVChannel.Url> urls = tvChannel.getUrls();
        ArrayList arrayList = new ArrayList();
        for (Object obj : urls) {
            if (!ac.g.h0(((TVChannel.Url) obj).getUrl())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            String lowerCase = ((TVChannel.Url) next).getType().toLowerCase(Locale.ROOT);
            kotlin.jvm.internal.l.d(lowerCase, "toLowerCase(...)");
            if (lowerCase.equals(MainTVDataSource$TVChannelUrlType.STREAM.getValue())) {
                arrayList2.add(next);
            }
        }
        ArrayList arrayList3 = new ArrayList(Eb.p.S(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            TVChannel.Url url = (TVChannel.Url) it2.next();
            String url2 = url.getUrl();
            String uuid = UUID.randomUUID().toString();
            kotlin.jvm.internal.l.d(uuid, "toString(...)");
            arrayList3.add(TVChannel.Url.copy$default(url, null, null, ac.n.W(ac.n.W(ac.n.W(url2, "{uuid}", ac.n.W(uuid, "-", "")), "{time_stamp}", String.valueOf(System.currentTimeMillis())), "{time_stamp_second}", String.valueOf(System.currentTimeMillis() / 1000)), null, null, null, null, 123, null));
        }
        ArrayList arrayList4 = new ArrayList(Eb.p.S(arrayList3, 10));
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            TVChannel.Url url3 = (TVChannel.Url) it3.next();
            if (ac.g.b0(url3.getUrl(), "|Referer")) {
                String substring = url3.getUrl().substring(0, ac.g.f0(url3.getUrl(), "|Referer", 0, 6));
                kotlin.jvm.internal.l.d(substring, "substring(...)");
                url3.setUrl(substring);
            }
            arrayList4.add(url3);
        }
        List<TVChannel.Url> urls2 = tvChannel.getUrls();
        ArrayList arrayList5 = new ArrayList();
        for (Object obj2 : urls2) {
            TVChannel.Url url4 = (TVChannel.Url) obj2;
            if (!ac.g.h0(url4.getUrl())) {
                String lowerCase2 = url4.getType().toLowerCase(Locale.ROOT);
                kotlin.jvm.internal.l.d(lowerCase2, "toLowerCase(...)");
                if (lowerCase2.equals(MainTVDataSource$TVChannelUrlType.WEB_PAGE.getValue())) {
                    arrayList5.add(obj2);
                }
            }
        }
        ArrayList u02 = Eb.o.u0(arrayList5);
        if (u02.isEmpty()) {
            return gb.i.l(f(arrayList4, tvChannel));
        }
        if (!z8) {
            return new sb.g(gb.i.l(Eb.o.Y(u02)).j(new p(this, tvChannel), com.google.android.gms.common.api.f.API_PRIORITY_OTHER), new Object(), 5).o(1L);
        }
        if (u02.size() <= 1) {
            return gb.i.l(f(arrayList4, tvChannel));
        }
        if (!arrayList4.isEmpty()) {
            u02.addAll(arrayList4);
        }
        Iterator it4 = u02.iterator();
        while (it4.hasNext()) {
            String.valueOf((TVChannel.Url) it4.next());
        }
        return new C2012f(new qb.m(new qb.g(2, new qb.m(u02, 5).j(new q(this, tvChannel, arrayList4), com.google.android.gms.common.api.f.API_PRIORITY_OTHER), new Y(17)), 1), new r(this, 0), lb.b.f19615d, lb.b.f19614c);
    }

    public final ArrayList e() {
        Db.j jVar;
        Object obj;
        String url;
        u8.c cVar = this.j;
        String g = cVar.g("remote_channel_list_tv");
        if (g.length() == 0) {
            InputStream open = this.f12308m.getAssets().open("default_channel_list.json");
            kotlin.jvm.internal.l.d(open, "open(...)");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(open, AbstractC0796a.f12815a), 8192);
            try {
                String E10 = u0.E(bufferedReader);
                tc.b.o(bufferedReader, null);
                jVar = new Db.j(E10, Boolean.FALSE);
            } finally {
            }
        } else {
            jVar = new Db.j(g, Boolean.TRUE);
        }
        String str = (String) jVar.f3354a;
        boolean booleanValue = ((Boolean) jVar.f3355b).booleanValue();
        Object c10 = new G8.m().c(new JSONObject(str).getJSONArray("AllChannels").toString(), N8.a.a(List.class, MainTVDataSource$TVChannelFromDB.class).f7387b);
        kotlin.jvm.internal.l.d(c10, "fromJson(...)");
        List<MainTVDataSource$TVChannelFromDB> list = (List) c10;
        ArrayList arrayList = new ArrayList(Eb.p.S(list, 10));
        for (MainTVDataSource$TVChannelFromDB mainTVDataSource$TVChannelFromDB : list) {
            kotlin.jvm.internal.l.e(mainTVDataSource$TVChannelFromDB, "<this>");
            ArrayList X10 = Eb.o.X(mainTVDataSource$TVChannelFromDB.getUrls());
            String group = mainTVDataSource$TVChannelFromDB.getGroup();
            String name = mainTVDataSource$TVChannelFromDB.getName();
            Iterator it = X10.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.l.a(((MainTVDataSource$TVChannelFromDB.Url) obj).getType(), MainTVDataSource$TVChannelUrlType.WEB_PAGE.getValue())) {
                    break;
                }
            }
            MainTVDataSource$TVChannelFromDB.Url url2 = (MainTVDataSource$TVChannelFromDB.Url) obj;
            if (url2 == null || (url = url2.getUrl()) == null) {
                url = ((MainTVDataSource$TVChannelFromDB.Url) X10.get(0)).getUrl();
            }
            String str2 = url;
            ArrayList arrayList2 = new ArrayList(Eb.p.S(X10, 10));
            Iterator it2 = X10.iterator();
            while (it2.hasNext()) {
                MainTVDataSource$TVChannelFromDB.Url url3 = (MainTVDataSource$TVChannelFromDB.Url) it2.next();
                arrayList2.add(new TVChannel.Url(url3.getSrc(), url3.getType(), url3.getUrl(), null, null, url3.getDynamicId(), null, 88, null));
            }
            arrayList.add(new TVChannel(group, mainTVDataSource$TVChannelFromDB.getThumb(), name, str2, "MAIN_SOURCE", mainTVDataSource$TVChannelFromDB.getId(), arrayList2, false, null, mainTVDataSource$TVChannelFromDB.getChannelNumber(), 384, null));
        }
        if (booleanValue) {
            try {
                g(arrayList);
                ((C0918a) this.k.get()).f14463b.edit().putLong("version_need_refresh".concat("_refresh_version"), cVar.f("version_need_refresh")).apply();
            } catch (Throwable th) {
                com.bumptech.glide.c.n(th);
            }
        }
        return arrayList;
    }

    public final void g(ArrayList arrayList) {
        int i7 = 0;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            TVChannel tVChannel = (TVChannel) it.next();
            List<TVChannel.Url> urls = tVChannel.getUrls();
            ArrayList arrayList3 = new ArrayList(Eb.p.S(urls, 10));
            for (TVChannel.Url url : urls) {
                arrayList3.add(new e.a(url.getDataSource(), url.getType(), url.getUrl(), tVChannel.getChannelId()));
            }
            Eb.o.U(arrayList2, arrayList3);
        }
        ArrayList arrayList4 = new ArrayList(Eb.p.S(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            TVChannel tVChannel2 = (TVChannel) it2.next();
            String tvGroup = tVChannel2.getTvGroup();
            String logoChannel = tVChannel2.getLogoChannel();
            String tvChannelName = tVChannel2.getTvChannelName();
            String channelId = tVChannel2.getChannelId();
            String lowerCase = tVChannel2.getTvChannelName().toLowerCase(Locale.ROOT);
            kotlin.jvm.internal.l.d(lowerCase, "toLowerCase(...)");
            arrayList4.add(new W9.e(tvGroup, logoChannel, tvChannelName, "MAIN_SOURCE", channelId, UtilsKt.removeAllSpecialChars(StringUtilsKt.replaceVNCharsToLatinChars(lowerCase)), tVChannel2.getChannelNumber()));
        }
        RoomDataBase roomDataBase = this.f12307l;
        U9.o oVar = (U9.o) roomDataBase.D();
        oVar.getClass();
        C1837e g = android.support.v4.media.session.b.g(oVar.f9904a, new Aa.t(14, oVar, arrayList4));
        U9.s sVar = (U9.s) roomDataBase.F();
        sVar.getClass();
        C1837e g2 = android.support.v4.media.session.b.g(sVar.f9909a, new Aa.t(19, sVar, arrayList2));
        C1268a c1268a = (C1268a) this.f12309n.getValue();
        C1842j e2 = new C1835c(new AbstractC1204a[]{g, g2}, 0).e(Ab.e.f1561c);
        nb.e eVar = new nb.e(i7, new r(this, 1), new k(this));
        e2.c(eVar);
        c1268a.d(eVar);
    }
}
