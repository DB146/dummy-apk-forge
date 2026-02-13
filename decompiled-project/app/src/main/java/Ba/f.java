package Ba;

import W9.e;
import com.kt.apps.core.tv.model.TVChannel;
import com.kt.apps.core.tv.model.TVChannelLinkStream;
import java.util.ArrayList;
import java.util.List;
import jb.InterfaceC1394e;

/* loaded from: classes2.dex */
public final class f implements InterfaceC1394e {

    /* renamed from: a, reason: collision with root package name */
    public static final f f2249a = new Object();

    @Override // jb.InterfaceC1394e
    public final Object apply(Object obj) {
        W9.h it = (W9.h) obj;
        kotlin.jvm.internal.l.e(it, "it");
        TVChannel mapToTVChannel = TVChannel.Companion.mapToTVChannel(it);
        List<e.a> list = it.f10889b;
        ArrayList arrayList = new ArrayList(Eb.p.S(list, 10));
        for (e.a aVar : list) {
            arrayList.add(new TVChannel.Url(aVar.a(), aVar.c(), aVar.d(), null, null, null, null, 120, null));
        }
        return new TVChannelLinkStream(mapToTVChannel, arrayList);
    }
}
