package Z9;

import com.kt.apps.core.tv.model.TVChannel;
import com.kt.apps.core.utils.StringUtilsKt;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.ConcurrentHashMap;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class D implements Y9.a {

    /* renamed from: a, reason: collision with root package name */
    public final u8.c f12232a;

    /* renamed from: b, reason: collision with root package name */
    public final OkHttpClient f12233b;

    /* renamed from: c, reason: collision with root package name */
    public final ConcurrentHashMap f12234c;

    /* renamed from: d, reason: collision with root package name */
    public final Db.o f12235d;

    public D(u8.c firebaseRemoteConfig, OkHttpClient okHttpClient) {
        kotlin.jvm.internal.l.e(firebaseRemoteConfig, "firebaseRemoteConfig");
        this.f12232a = firebaseRemoteConfig;
        this.f12233b = okHttpClient;
        this.f12234c = new ConcurrentHashMap();
        android.support.v4.media.session.b.z(new S9.a(18));
        this.f12235d = android.support.v4.media.session.b.z(new S9.a(19));
    }

    public static final String c(D d10, Date date, Date date2, String str, String str2) {
        String str3 = (String) d10.f12235d.getValue();
        String date3 = date.toString();
        kotlin.jvm.internal.l.d(date3, "toString(...)");
        String W10 = ac.n.W(str3, "{time_stamp}", date3);
        String date4 = date2.toString();
        kotlin.jvm.internal.l.d(date4, "toString(...)");
        String W11 = ac.n.W(ac.n.W(ac.n.W(W10, "{time_stamp_exp}", date4), "{random_id}", str), "{jti}", str2);
        String message = "profileStr: ".concat(W11);
        kotlin.jvm.internal.l.e(message, "message");
        return StringUtilsKt.sha256Hash(W11);
    }

    public static final ArrayList d(D d10, String str, TVChannel tVChannel, String str2, String str3) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        String g = d10.f12232a.g("vieon_api_url");
        if (g.length() == 0) {
            g = "https://api.vieon.vn/backend/cm/v5/slug/livetv/detail?platform=web&ui=012021";
        }
        Request.Builder builder = new Request.Builder();
        builder.e(g);
        builder.b("Accept", "application/json, text/plain, */*");
        builder.b("Accept-Language", "vi-VN,vi;q=0.9,fr-FR;q=0.8,fr;q=0.7,en-US;q=0.6,en;q=0.5,am;q=0.4,en-AU;q=0.3");
        builder.b("Authorization", str);
        builder.b("Connection", "keep-alive");
        builder.b("Content-Type", "application/json;charset=UTF-8");
        builder.b("Origin", "https://vieon.vn");
        builder.b("Referer", tVChannel.getTvChannelWebDetailPage());
        builder.b("Profile-Token", str3);
        builder.b("User-Agent", "Mozilla/5.0 (Linux; Android 10; SM-G975F) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/87.0.4280.141 Mobile Safari/537.36");
        FormBody.Builder builder2 = new FormBody.Builder(0);
        String obj = ac.g.v0(str2).toString();
        if (obj.length() <= 0) {
            obj = null;
        }
        if (obj == null) {
            obj = ac.g.n0(tVChannel.getTvChannelWebDetailPage(), "https://vieon.vn");
        }
        builder2.b("livetv_slug", obj);
        builder2.b("platform", "web");
        builder2.b("ui", "012021");
        builder.d(new FormBody(builder2.f22324a, builder2.f22325b));
        String K10 = d10.f12233b.b(new Request(builder)).e().f22445u.K();
        ArrayList arrayList = new ArrayList();
        String message = "response: " + K10;
        kotlin.jvm.internal.l.e(message, "message");
        JSONObject jSONObject = new JSONObject(K10);
        String optString = jSONObject.optString("hls_link_play");
        kotlin.jvm.internal.l.d(optString, "optString(...)");
        String obj2 = ac.g.v0(optString).toString();
        if (obj2.length() <= 0) {
            obj2 = null;
        }
        if (obj2 != null) {
            arrayList.add(obj2);
        }
        String optString2 = jSONObject.optString("dash_link_play");
        kotlin.jvm.internal.l.d(optString2, "optString(...)");
        String obj3 = ac.g.v0(optString2).toString();
        if (obj3.length() <= 0) {
            obj3 = null;
        }
        if (obj3 != null) {
            arrayList.add(obj3);
        }
        String optString3 = jSONObject.optString("link_play");
        kotlin.jvm.internal.l.d(optString3, "optString(...)");
        String obj4 = ac.g.v0(optString3).toString();
        if (obj4.length() <= 0) {
            obj4 = null;
        }
        if (obj4 != null) {
            arrayList.add(obj4);
        }
        JSONObject optJSONObject3 = jSONObject.optJSONObject("play_links");
        if (optJSONObject3 != null && (optJSONObject2 = optJSONObject3.optJSONObject("h264")) != null) {
            String optString4 = optJSONObject2.optString("hls");
            kotlin.jvm.internal.l.d(optString4, "optString(...)");
            String obj5 = ac.g.v0(optString4).toString();
            if (obj5.length() <= 0) {
                obj5 = null;
            }
            if (obj5 != null) {
                arrayList.add(obj5);
            }
            String optString5 = optJSONObject2.optString("dash");
            kotlin.jvm.internal.l.d(optString5, "optString(...)");
            String obj6 = ac.g.v0(optString5).toString();
            if (obj6.length() <= 0) {
                obj6 = null;
            }
            if (obj6 != null) {
                arrayList.add(obj6);
            }
        }
        JSONObject optJSONObject4 = jSONObject.optJSONObject("play_links");
        if (optJSONObject4 != null && (optJSONObject = optJSONObject4.optJSONObject("h265")) != null) {
            String optString6 = optJSONObject.optString("hls");
            kotlin.jvm.internal.l.d(optString6, "optString(...)");
            String obj7 = ac.g.v0(optString6).toString();
            if (obj7.length() <= 0) {
                obj7 = null;
            }
            if (obj7 != null) {
                arrayList.add(obj7);
            }
            String optString7 = optJSONObject.optString("dash");
            kotlin.jvm.internal.l.d(optString7, "optString(...)");
            String obj8 = ac.g.v0(optString7).toString();
            String str4 = obj8.length() > 0 ? obj8 : null;
            if (str4 != null) {
                arrayList.add(str4);
            }
        }
        return arrayList;
    }

    @Override // Y9.a
    public final gb.i a() {
        throw new IllegalStateException("Child no need to load list channel");
    }

    @Override // Y9.a
    public final gb.i b(TVChannel tvChannel, boolean z8) {
        kotlin.jvm.internal.l.e(tvChannel, "tvChannel");
        return new qb.m(new F8.a(10, this, tvChannel), 2).j(new C(this, tvChannel), com.google.android.gms.common.api.f.API_PRIORITY_OTHER);
    }
}
