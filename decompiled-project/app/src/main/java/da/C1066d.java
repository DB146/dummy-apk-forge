package da;

import Db.j;
import Db.o;
import Eb.B;
import Eb.p;
import N6.y0;
import P4.C0463k;
import ac.g;
import com.kt.apps.core.tv.datasource.impl.MainTVDataSource$TVChannelUrlType;
import com.kt.apps.core.tv.model.TVChannel;
import com.kt.apps.core.tv.model.TVChannelLinkStream;
import com.kt.apps.core.tv.model.TVDataSourceFrom;
import com.kt.apps.core.utils.l;
import gb.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sb.C2012f;
import sb.q;
import y7.u0;

/* renamed from: da.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1066d extends H9.b {

    /* renamed from: a, reason: collision with root package name */
    public final y0 f16615a;

    /* renamed from: b, reason: collision with root package name */
    public final o f16616b = android.support.v4.media.session.b.z(new l(1));

    public C1066d(y0 y0Var) {
        this.f16615a = y0Var;
    }

    public final i a(TVChannel tvChannel) {
        kotlin.jvm.internal.l.e(tvChannel, "tvChannel");
        return execute(B.H(new j("extra:tv_channel", tvChannel), new j("extra:datasource_from", TVDataSourceFrom.valueOf(tvChannel.getSourceFrom()))));
    }

    @Override // H9.b
    public final i prepareExecute(Map map) {
        TVChannel.Url fromUrl;
        TVChannel.Url fromUrl2;
        TVChannel.Url fromUrl3;
        Object obj = map.get("extra:tv_channel");
        kotlin.jvm.internal.l.c(obj, "null cannot be cast to non-null type com.kt.apps.core.tv.model.TVChannel");
        TVChannel tVChannel = (TVChannel) obj;
        Object obj2 = map.get("extra:datasource_from");
        kotlin.jvm.internal.l.c(obj2, "null cannot be cast to non-null type com.kt.apps.core.tv.model.TVDataSourceFrom");
        TVDataSourceFrom tVDataSourceFrom = (TVDataSourceFrom) obj2;
        TVDataSourceFrom tVDataSourceFrom2 = TVDataSourceFrom.f16152V;
        if (tVDataSourceFrom == tVDataSourceFrom2 && kotlin.jvm.internal.l.a(tVChannel.getTvGroup(), "VOV")) {
            List x2 = u0.x(tVChannel.getTvChannelWebDetailPage());
            ArrayList arrayList = new ArrayList(p.S(x2, 10));
            Iterator it = x2.iterator();
            while (it.hasNext()) {
                fromUrl3 = TVChannel.Url.Companion.fromUrl((String) it.next(), (r15 & 2) != 0 ? MainTVDataSource$TVChannelUrlType.STREAM.getValue() : null, (r15 & 4) != 0 ? null : null, (r15 & 8) != 0 ? null : null, (r15 & 16) != 0 ? null : null, (r15 & 32) != 0 ? null : null, (r15 & 64) == 0 ? null : null);
                arrayList.add(fromUrl3);
            }
            return i.l(new TVChannelLinkStream(tVChannel, arrayList));
        }
        if (tVDataSourceFrom == tVDataSourceFrom2 && kotlin.jvm.internal.l.a(tVChannel.getTvGroup(), "VOH")) {
            List x10 = u0.x(tVChannel.getTvChannelWebDetailPage());
            ArrayList arrayList2 = new ArrayList(p.S(x10, 10));
            Iterator it2 = x10.iterator();
            while (it2.hasNext()) {
                fromUrl2 = TVChannel.Url.Companion.fromUrl((String) it2.next(), (r15 & 2) != 0 ? MainTVDataSource$TVChannelUrlType.STREAM.getValue() : null, (r15 & 4) != 0 ? null : null, (r15 & 8) != 0 ? null : null, (r15 & 16) != 0 ? null : null, (r15 & 32) != 0 ? null : null, (r15 & 64) == 0 ? null : null);
                arrayList2.add(fromUrl2);
            }
            return i.l(new TVChannelLinkStream(tVChannel, arrayList2));
        }
        if (tVDataSourceFrom == tVDataSourceFrom2 && g.b0(tVChannel.getTvChannelWebDetailPage(), ";stream")) {
            List x11 = u0.x(tVChannel.getTvChannelWebDetailPage());
            ArrayList arrayList3 = new ArrayList(p.S(x11, 10));
            Iterator it3 = x11.iterator();
            while (it3.hasNext()) {
                fromUrl = TVChannel.Url.Companion.fromUrl((String) it3.next(), (r15 & 2) != 0 ? MainTVDataSource$TVChannelUrlType.STREAM.getValue() : null, (r15 & 4) != 0 ? null : null, (r15 & 8) != 0 ? null : null, (r15 & 16) != 0 ? null : null, (r15 & 32) != 0 ? null : null, (r15 & 64) == 0 ? null : null);
                arrayList3.add(fromUrl);
            }
            return i.l(new TVChannelLinkStream(tVChannel, arrayList3));
        }
        y0 y0Var = this.f16615a;
        if (tVDataSourceFrom == tVDataSourceFrom2) {
            Object obj3 = y0Var.get(tVDataSourceFrom);
            kotlin.jvm.internal.l.b(obj3);
            return new q(((Y9.a) obj3).b(tVChannel, false), new q3.l(29, tVChannel, this, false), 2);
        }
        Object obj4 = y0Var.get(tVDataSourceFrom);
        kotlin.jvm.internal.l.b(obj4);
        Y9.a aVar = (Y9.a) obj4;
        Object obj5 = map.get("extra:is_backup");
        Boolean bool = obj5 instanceof Boolean ? (Boolean) obj5 : null;
        return new C2012f(aVar.b(tVChannel, bool != null ? bool.booleanValue() : false), new R7.b(tVChannel, 17), lb.b.f19615d, lb.b.f19614c).h(new C0463k(tVChannel, 22));
    }
}
