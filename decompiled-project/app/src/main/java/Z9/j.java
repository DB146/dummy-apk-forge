package Z9;

import android.net.Uri;
import com.kt.apps.core.extensions.ExtensionsChannel;
import com.kt.apps.core.tv.datasource.impl.MainTVDataSource$TVChannelURLSrc;
import com.kt.apps.core.tv.datasource.impl.MainTVDataSource$TVChannelUrlType;
import com.kt.apps.core.tv.model.TVChannel;
import com.kt.apps.core.tv.model.TVChannelLinkStream;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import sb.C2012f;
import x9.AbstractC2271a;
import y7.u0;

/* loaded from: classes2.dex */
public final class j implements Y9.a {

    /* renamed from: a, reason: collision with root package name */
    public final M9.t f12280a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f12281b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f12282c;

    /* renamed from: d, reason: collision with root package name */
    public final Db.o f12283d;

    public j(M9.t parserExtensionsSource, G8.m mVar) {
        kotlin.jvm.internal.l.e(parserExtensionsSource, "parserExtensionsSource");
        this.f12280a = parserExtensionsSource;
        this.f12281b = new LinkedHashMap();
        this.f12282c = new LinkedHashMap();
        this.f12283d = android.support.v4.media.session.b.z(new S9.a(14));
    }

    @Override // Y9.a
    public final gb.i a() {
        return sb.h.f24268a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10, types: [H9.a, java.lang.Object] */
    @Override // Y9.a
    public final gb.i b(TVChannel tvChannel, boolean z8) {
        Object obj;
        Object obj2;
        Object n6;
        Object obj3;
        TVChannel.Url c10;
        kotlin.jvm.internal.l.e(tvChannel, "tvChannel");
        Iterator<T> it = tvChannel.getUrls().iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            TVChannel.Url url = (TVChannel.Url) obj2;
            if (kotlin.jvm.internal.l.a(url.getType(), "web") && kotlin.jvm.internal.l.a(url.getDataSource(), MainTVDataSource$TVChannelURLSrc.IPTV_BACKUP.getValue())) {
                break;
            }
        }
        TVChannel.Url url2 = (TVChannel.Url) obj2;
        if (url2 == null) {
            return gb.i.i(new Exception("No link found"));
        }
        String url3 = url2.getUrl();
        List list = (List) this.f12281b.get(url3);
        Long l10 = (Long) this.f12282c.get(url3);
        TVChannelLinkStream tVChannelLinkStream = (list == null || l10 == null || System.currentTimeMillis() - l10.longValue() >= 21600000 || (c10 = c(tvChannel, list)) == null) ? null : new TVChannelLinkStream(tvChannel, u0.x(c10));
        if (tVChannelLinkStream != null) {
            return gb.i.l(tVChannelLinkStream);
        }
        M9.c cVar = M9.c.f6846a;
        String obj4 = ac.g.v0(url2.getUrl()).toString();
        String url4 = url2.getUrl();
        try {
            Uri parse = Uri.parse(url4);
            List<String> pathSegments = parse.getPathSegments();
            kotlin.jvm.internal.l.d(pathSegments, "getPathSegments(...)");
            ListIterator<String> listIterator = pathSegments.listIterator(pathSegments.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    obj3 = null;
                    break;
                }
                obj3 = listIterator.previous();
                String str = (String) obj3;
                kotlin.jvm.internal.l.b(str);
                if (str.length() > 0) {
                    break;
                }
            }
            n6 = (String) obj3;
            if (n6 == null) {
                n6 = parse.getHost();
                kotlin.jvm.internal.l.b(n6);
            }
        } catch (Throwable th) {
            n6 = com.bumptech.glide.c.n(th);
        }
        List r02 = ac.g.r0(ac.g.n0(url4, "https"), new String[]{"/"});
        ListIterator listIterator2 = r02.listIterator(r02.size());
        while (true) {
            if (!listIterator2.hasPrevious()) {
                break;
            }
            Object previous = listIterator2.previous();
            if (((String) previous).length() > 0) {
                obj = previous;
                break;
            }
        }
        String str2 = (String) obj;
        if (str2 != null) {
            url4 = str2;
        }
        if (n6 instanceof Db.l) {
            n6 = url4;
        }
        return new C2012f(new qb.m(this.f12280a.i(new M9.d((String) n6, obj4, cVar)), 1).f(new Object()).j(new C0671h(this, tvChannel), com.google.android.gms.common.api.f.API_PRIORITY_OTHER), new i(this, url2, tvChannel), lb.b.f19615d, lb.b.f19614c);
    }

    public final TVChannel.Url c(TVChannel tVChannel, List list) {
        Object obj;
        TVChannel.Url fromUrl;
        Map map;
        String optString;
        JSONObject optJSONObject;
        String optString2;
        Db.o oVar = this.f12283d;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            ExtensionsChannel extensionsChannel = (ExtensionsChannel) obj;
            if (kotlin.jvm.internal.l.a(extensionsChannel.getChannelId(), tVChannel.getChannelId())) {
                break;
            }
            if (((Map) oVar.getValue()).isEmpty()) {
                u8.c e2 = u8.c.e();
                kotlin.jvm.internal.l.d(e2, "getInstance()");
                JSONArray jSONArray = new JSONArray(e2.g("tv_epg_mapping"));
                int length = jSONArray.length();
                for (int i7 = 0; i7 < length; i7++) {
                    JSONObject optJSONObject2 = jSONArray.optJSONObject(i7);
                    if (optJSONObject2 != null && (optString = optJSONObject2.optString("key")) != null && (optJSONObject = jSONArray.optJSONObject(i7)) != null && (optString2 = optJSONObject.optString("value")) != null) {
                        ((Map) oVar.getValue()).put(optString, optString2);
                    }
                }
                if (!((Map) oVar.getValue()).isEmpty()) {
                    map = (Map) oVar.getValue();
                }
                map = (Map) AbstractC2271a.f26274a.getValue();
            } else {
                map = (Map) oVar.getValue();
            }
            if (ac.n.T((String) map.get(tVChannel.getChannelId()), extensionsChannel.getChannelId(), true) || ac.n.T((String) ((Map) AbstractC2271a.f26274a.getValue()).get(tVChannel.getChannelId()), extensionsChannel.getChannelId(), true)) {
                break;
            }
        }
        ExtensionsChannel extensionsChannel2 = (ExtensionsChannel) obj;
        if (extensionsChannel2 == null) {
            return null;
        }
        TVChannel.Url.Companion companion = TVChannel.Url.Companion;
        String W10 = ac.n.W(ac.n.W(ac.h.R(extensionsChannel2.getTvStreamLink()), "\t", ""), " ", "");
        Map<String, String> props = extensionsChannel2.getProps();
        if (props == null) {
            props = Eb.w.f3892a;
        }
        fromUrl = companion.fromUrl(W10, (r15 & 2) != 0 ? MainTVDataSource$TVChannelUrlType.STREAM.getValue() : null, (r15 & 4) != 0 ? null : "iptv-backup", (r15 & 8) != 0 ? null : null, (r15 & 16) != 0 ? null : null, (r15 & 32) != 0 ? null : null, (r15 & 64) == 0 ? props : null);
        return fromUrl;
    }
}
