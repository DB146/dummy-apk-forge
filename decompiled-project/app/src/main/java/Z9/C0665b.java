package Z9;

import com.kt.apps.core.tv.datasource.impl.MainTVDataSource$TVChannelUrlType;
import com.kt.apps.core.tv.model.TVChannel;
import com.kt.apps.core.tv.model.TVChannelLinkStream;
import com.kt.apps.core.utils.UtilsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import sb.C2010d;
import y7.u0;

/* renamed from: Z9.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0665b implements Rb.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12253a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2010d f12254b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TVChannel f12255c;

    public /* synthetic */ C0665b(C2010d c2010d, TVChannel tVChannel, int i7) {
        this.f12253a = i7;
        this.f12254b = c2010d;
        this.f12255c = tVChannel;
    }

    @Override // Rb.c
    public final Object invoke(Object obj) {
        TVChannel.Url fromUrl;
        TVChannel.Url fromUrl2;
        switch (this.f12253a) {
            case 0:
                List it = (List) obj;
                kotlin.jvm.internal.l.e(it, "it");
                ArrayList arrayList = new ArrayList(Eb.p.S(it, 10));
                Iterator it2 = it.iterator();
                while (true) {
                    boolean hasNext = it2.hasNext();
                    TVChannel tVChannel = this.f12255c;
                    if (!hasNext) {
                        TVChannelLinkStream tVChannelLinkStream = new TVChannelLinkStream(tVChannel, arrayList);
                        C2010d c2010d = this.f12254b;
                        c2010d.d(tVChannelLinkStream);
                        c2010d.a();
                        return Db.q.f3365a;
                    }
                    fromUrl = TVChannel.Url.Companion.fromUrl((String) it2.next(), (r15 & 2) != 0 ? MainTVDataSource$TVChannelUrlType.STREAM.getValue() : null, (r15 & 4) != 0 ? null : null, (r15 & 8) != 0 ? null : tVChannel.getTvChannelWebDetailPage(), (r15 & 16) != 0 ? null : UtilsKt.getBaseUrl(tVChannel.getTvChannelWebDetailPage()), (r15 & 32) != 0 ? null : null, (r15 & 64) == 0 ? null : null);
                    arrayList.add(fromUrl);
                }
            default:
                String realChunks = (String) obj;
                kotlin.jvm.internal.l.e(realChunks, "realChunks");
                List x2 = u0.x(realChunks);
                ArrayList arrayList2 = new ArrayList(Eb.p.S(x2, 10));
                Iterator it3 = x2.iterator();
                while (true) {
                    boolean hasNext2 = it3.hasNext();
                    TVChannel tVChannel2 = this.f12255c;
                    if (!hasNext2) {
                        TVChannelLinkStream tVChannelLinkStream2 = new TVChannelLinkStream(tVChannel2, arrayList2);
                        C2010d c2010d2 = this.f12254b;
                        c2010d2.d(tVChannelLinkStream2);
                        c2010d2.a();
                        return Db.q.f3365a;
                    }
                    fromUrl2 = TVChannel.Url.Companion.fromUrl((String) it3.next(), (r15 & 2) != 0 ? MainTVDataSource$TVChannelUrlType.STREAM.getValue() : null, (r15 & 4) != 0 ? null : null, (r15 & 8) != 0 ? null : tVChannel2.getTvChannelWebDetailPage(), (r15 & 16) != 0 ? null : UtilsKt.getBaseUrl(tVChannel2.getTvChannelWebDetailPage()), (r15 & 32) != 0 ? null : null, (r15 & 64) == 0 ? null : null);
                    arrayList2.add(fromUrl2);
                }
        }
    }
}
