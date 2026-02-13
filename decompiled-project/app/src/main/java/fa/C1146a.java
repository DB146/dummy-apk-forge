package fa;

import Db.o;
import Eb.p;
import M9.h;
import M9.k;
import Z9.m;
import com.kt.apps.core.extensions.ExtensionsChannel;
import com.kt.apps.core.utils.l;
import ea.C1112g;
import gb.d;
import gb.i;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import sb.C2009c;
import sb.g;
import sb.q;
import u8.c;

/* renamed from: fa.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1146a extends H9.b {

    /* renamed from: d, reason: collision with root package name */
    public static final o f17028d = android.support.v4.media.session.b.z(new l(9));

    /* renamed from: a, reason: collision with root package name */
    public final k f17029a;

    /* renamed from: b, reason: collision with root package name */
    public final c f17030b;

    /* renamed from: c, reason: collision with root package name */
    public final o f17031c;

    public C1146a(k parser, c firebaseRemoteConfig) {
        kotlin.jvm.internal.l.e(parser, "parser");
        kotlin.jvm.internal.l.e(firebaseRemoteConfig, "firebaseRemoteConfig");
        this.f17029a = parser;
        this.f17030b = firebaseRemoteConfig;
        this.f17031c = android.support.v4.media.session.b.z(new l(8));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // H9.b
    public final i prepareExecute(Map map) {
        Map map2;
        String optString;
        JSONObject optJSONObject;
        String optString2;
        o oVar = this.f17031c;
        Object obj = map.get("extra:channel");
        boolean z8 = obj instanceof String;
        h hVar = h.f6862b;
        int i7 = 1;
        k kVar = this.f17029a;
        if (!z8) {
            if (!(obj instanceof ExtensionsChannel)) {
                return i.i(new Throwable("Null params not supported"));
            }
            ExtensionsChannel channel = (ExtensionsChannel) obj;
            Object obj2 = map.get("extra:channel_type");
            r5 = obj2 instanceof M9.c ? (M9.c) obj2 : null;
            if (r5 == null) {
                r5 = M9.c.f6848c;
            }
            kVar.getClass();
            kotlin.jvm.internal.l.e(channel, "channel");
            return new g(new q(kVar.b(channel.getChannelId(), true), hVar, 0), new M9.i(Calendar.getInstance(Locale.getDefault()).getTimeInMillis(), r5 == M9.c.f6846a), i7);
        }
        String channelId = (String) obj;
        kVar.getClass();
        kotlin.jvm.internal.l.e(channelId, "channelId");
        i gVar = new g(new q(kVar.b(channelId, false), hVar, 0), new M9.i(Calendar.getInstance(Locale.getDefault()).getTimeInMillis(), true), i7);
        if (((Map) oVar.getValue()).isEmpty()) {
            String g = this.f17030b.g("tv_epg_mapping");
            JSONArray jSONArray = new JSONArray(g);
            String message = "{\"RemoteMapping\": " + g + "}";
            kotlin.jvm.internal.l.e(message, "message");
            int length = jSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject optJSONObject2 = jSONArray.optJSONObject(i10);
                if (optJSONObject2 != null && (optString = optJSONObject2.optString("key")) != null && (optJSONObject = jSONArray.optJSONObject(i10)) != null && (optString2 = optJSONObject.optString("value")) != null) {
                    ((Map) oVar.getValue()).put(optString, optString2);
                }
            }
            if (!((Map) oVar.getValue()).isEmpty()) {
                map2 = (Map) oVar.getValue();
            }
            map2 = (Map) f17028d.getValue();
        } else {
            map2 = (Map) oVar.getValue();
        }
        String str = (String) map2.get(obj);
        if (str != null) {
            List<String> r02 = ac.g.r0(str, new String[]{"|"});
            ArrayList arrayList = new ArrayList(p.S(r02, 10));
            for (String channelId2 : r02) {
                kotlin.jvm.internal.l.e(channelId2, "channelId");
                arrayList.add(new q(new g(new q(kVar.b(channelId2, false), hVar, 0), new M9.i(Calendar.getInstance(Locale.getDefault()).getTimeInMillis(), true), i7), new C1112g(1, this, (String) obj), 1));
            }
            Iterator it = arrayList.iterator();
            if (!it.hasNext()) {
                throw new UnsupportedOperationException("Empty collection can't be reduced.");
            }
            Object next = it.next();
            while (it.hasNext()) {
                next = ((i) next).m((i) it.next());
            }
            r5 = (i) next;
        }
        if (r5 != null) {
            gVar = new C2009c(i.k(r5, gVar), d.f17483a);
        }
        return new g(gVar, new m((String) obj, 1), 5);
    }
}
