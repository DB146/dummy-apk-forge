package Z9;

import com.kt.apps.core.tv.datasource.impl.MainTVDataSource$TVChannelUrlType;
import com.kt.apps.core.tv.model.TVChannel;
import com.kt.apps.core.tv.model.TVChannelLinkStream;
import com.kt.apps.core.utils.UtilsKt;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.UUID;
import jb.InterfaceC1394e;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class C implements InterfaceC1394e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ D f12230a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TVChannel f12231b;

    public C(D d10, TVChannel tVChannel) {
        this.f12230a = d10;
        this.f12231b = tVChannel;
    }

    @Override // jb.InterfaceC1394e
    public final Object apply(Object obj) {
        TVChannel.Url fromUrl;
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        String optString;
        xc.l body = (xc.l) obj;
        TVChannel tVChannel = this.f12231b;
        kotlin.jvm.internal.l.e(body, "body");
        Date time = Calendar.getInstance().getTime();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(calendar.getTimeInMillis() + 4147200000L);
        Date time2 = calendar.getTime();
        String uuid = UUID.randomUUID().toString();
        kotlin.jvm.internal.l.d(uuid, "toString(...)");
        String uuid2 = UUID.randomUUID().toString();
        kotlin.jvm.internal.l.d(uuid2, "toString(...)");
        String W10 = ac.n.W(uuid2, "-", "");
        vc.i.A("__NEXT_DATA__");
        String str = null;
        xc.l lVar = (xc.l) android.support.v4.media.session.b.F(body, xc.l.class).filter(new zc.f(new zc.h("__NEXT_DATA__", 8, false), body, 0)).findFirst().orElse(null);
        if (lVar == null) {
            return gb.i.i(new IllegalStateException("Null Next Data"));
        }
        String j02 = lVar.j0();
        kotlin.jvm.internal.l.d(j02, "html(...)");
        JSONObject optJSONObject3 = new JSONObject(j02).optJSONObject("props");
        D t5 = this.f12230a;
        if (optJSONObject3 != null && (optJSONObject = optJSONObject3.optJSONObject("initialState")) != null && (optJSONObject2 = optJSONObject.optJSONObject("App")) != null && (optString = optJSONObject2.optString("token")) != null) {
            if (optString.length() <= 0) {
                optString = null;
            }
            if (optString != null) {
                String message = "token: ".concat(optString);
                kotlin.jvm.internal.l.e(t5, "t");
                kotlin.jvm.internal.l.e(message, "message");
                str = optString;
            }
        }
        String str2 = str != null ? str : "";
        try {
            String n02 = ac.g.n0(tVChannel.getTvChannelWebDetailPage(), "https://vieon.vn");
            kotlin.jvm.internal.l.b(time);
            kotlin.jvm.internal.l.b(time2);
            ArrayList d10 = D.d(t5, str2, tVChannel, n02, D.c(t5, time, time2, uuid, W10));
            if (d10.isEmpty()) {
                return gb.i.i(new Throwable("Empty data found!"));
            }
            ArrayList arrayList = new ArrayList(Eb.p.S(d10, 10));
            Iterator it = d10.iterator();
            while (it.hasNext()) {
                fromUrl = TVChannel.Url.Companion.fromUrl((String) it.next(), (r15 & 2) != 0 ? MainTVDataSource$TVChannelUrlType.STREAM.getValue() : null, (r15 & 4) != 0 ? null : null, (r15 & 8) != 0 ? null : tVChannel.getTvChannelWebDetailPage(), (r15 & 16) != 0 ? null : UtilsKt.getBaseUrl(tVChannel.getTvChannelWebDetailPage()), (r15 & 32) != 0 ? null : null, (r15 & 64) == 0 ? null : null);
                arrayList.add(fromUrl);
            }
            return gb.i.l(new TVChannelLinkStream(tVChannel, arrayList));
        } catch (Exception e2) {
            kotlin.jvm.internal.l.e(t5, "t");
            return gb.i.i(e2);
        }
    }
}
