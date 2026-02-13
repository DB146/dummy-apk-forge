package Z9;

import com.kt.apps.core.tv.datasource.impl.MainTVDataSource$TVChannelUrlType;
import com.kt.apps.core.tv.model.TVChannel;
import com.kt.apps.core.tv.model.TVChannelLinkStream;
import com.kt.apps.core.utils.UtilsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import y7.u0;

/* renamed from: Z9.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0664a implements Y9.a {
    @Override // Y9.a
    public final gb.i a() {
        throw new IllegalStateException("Remove in future");
    }

    @Override // Y9.a
    public final gb.i b(TVChannel tvChannel, boolean z8) {
        TVChannel.Url fromUrl;
        kotlin.jvm.internal.l.e(tvChannel, "tvChannel");
        List x2 = u0.x(tvChannel.getTvChannelWebDetailPage());
        ArrayList arrayList = new ArrayList(Eb.p.S(x2, 10));
        Iterator it = x2.iterator();
        while (it.hasNext()) {
            fromUrl = TVChannel.Url.Companion.fromUrl((String) it.next(), (r15 & 2) != 0 ? MainTVDataSource$TVChannelUrlType.STREAM.getValue() : null, (r15 & 4) != 0 ? null : null, (r15 & 8) != 0 ? null : tvChannel.getTvChannelWebDetailPage(), (r15 & 16) != 0 ? null : UtilsKt.getBaseUrl(tvChannel.getTvChannelWebDetailPage()), (r15 & 32) != 0 ? null : null, (r15 & 64) == 0 ? null : null);
            arrayList.add(fromUrl);
        }
        return gb.i.l(new TVChannelLinkStream(tvChannel, arrayList));
    }
}
