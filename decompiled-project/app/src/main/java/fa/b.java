package fa;

import Db.o;
import Eb.p;
import M9.k;
import P4.Y;
import W9.e;
import ac.g;
import android.text.format.DateUtils;
import com.kt.apps.core.extensions.ExtensionsChannel;
import ea.C1108c;
import g3.C1191j;
import gb.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.l;
import org.json.JSONArray;
import org.json.JSONObject;
import qb.m;
import sb.C2012f;
import sb.q;
import x9.AbstractC2271a;

/* loaded from: classes2.dex */
public final class b extends H9.b {

    /* renamed from: a, reason: collision with root package name */
    public final k f17032a;

    /* renamed from: b, reason: collision with root package name */
    public final o f17033b;

    /* renamed from: c, reason: collision with root package name */
    public final o f17034c;

    public b(k parser) {
        l.e(parser, "parser");
        this.f17032a = parser;
        this.f17033b = android.support.v4.media.session.b.z(new com.kt.apps.core.utils.l(10));
        this.f17034c = android.support.v4.media.session.b.z(new com.kt.apps.core.utils.l(11));
    }

    @Override // H9.b
    public final i prepareExecute(Map map) {
        i i7;
        Map map2;
        String optString;
        JSONObject optJSONObject;
        String optString2;
        Object obj = map.get("extra:channel");
        boolean z8 = obj instanceof e;
        i iVar = null;
        String a9 = z8 ? ((e) obj).a() : obj instanceof ExtensionsChannel ? ((ExtensionsChannel) obj).getChannelId() : null;
        Long l10 = (Long) ((ConcurrentHashMap) this.f17034c.getValue()).get(a9);
        long longValue = l10 != null ? l10.longValue() : -1L;
        List list = (List) ((WeakHashMap) this.f17033b.getValue()).get(a9);
        if (a9 != null && a9.length() != 0 && list != null && !list.isEmpty() && DateUtils.isToday(longValue)) {
            String message = "Get cache for channel: " + a9 + ", lastGetListProgram: " + longValue + ", cache: " + list.size();
            l.e(message, "message");
            return i.l(list);
        }
        k kVar = this.f17032a;
        if (z8) {
            e channel = (e) obj;
            kVar.getClass();
            l.e(channel, "channel");
            if (kVar.d().isEmpty()) {
                String g = kVar.f6876c.g("tv_epg_mapping");
                JSONArray jSONArray = new JSONArray(g);
                String message2 = "{\"RemoteMapping\": " + g + "}";
                l.e(message2, "message");
                int length = jSONArray.length();
                for (int i10 = 0; i10 < length; i10++) {
                    JSONObject optJSONObject2 = jSONArray.optJSONObject(i10);
                    if (optJSONObject2 != null && (optString = optJSONObject2.optString("key")) != null && (optJSONObject = jSONArray.optJSONObject(i10)) != null && (optString2 = optJSONObject.optString("value")) != null) {
                        kVar.d().put(optString, optString2);
                    }
                }
                if (!kVar.d().isEmpty()) {
                    map2 = kVar.d();
                }
                map2 = (Map) AbstractC2271a.f26274a.getValue();
            } else {
                map2 = kVar.d();
            }
            String str = (String) map2.get(channel.a());
            if (str != null) {
                List<String> r02 = g.r0(str, new String[]{"|"});
                ArrayList arrayList = new ArrayList(p.S(r02, 10));
                for (String tvChannelId : r02) {
                    l.e(tvChannelId, "tvChannelId");
                    arrayList.add(new q(kVar.b(tvChannelId, true), new C1191j(channel, 25), 1));
                }
                Iterator it = arrayList.iterator();
                if (!it.hasNext()) {
                    throw new UnsupportedOperationException("Empty collection can't be reduced.");
                }
                Object next = it.next();
                while (it.hasNext()) {
                    next = ((i) next).m((i) it.next());
                }
                iVar = (i) next;
            }
            if (iVar == null) {
                String tvChannelId2 = channel.a();
                l.e(tvChannelId2, "tvChannelId");
                i7 = kVar.b(tvChannelId2, false);
            } else {
                String tvChannelId3 = channel.a();
                l.e(tvChannelId3, "tvChannelId");
                i7 = new m(new qb.g(2, kVar.b(tvChannelId3, false).m(iVar), new Y(28)), 1);
            }
        } else if (obj instanceof ExtensionsChannel) {
            ExtensionsChannel channel2 = (ExtensionsChannel) obj;
            kVar.getClass();
            l.e(channel2, "channel");
            i7 = kVar.b(channel2.getChannelId(), true);
        } else {
            i7 = i.i(new Throwable("Not supported"));
        }
        return new C2012f(i7, new C1108c(2, a9, this), lb.b.f19615d, lb.b.f19614c);
    }
}
