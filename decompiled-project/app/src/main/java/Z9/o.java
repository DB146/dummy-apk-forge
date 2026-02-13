package Z9;

import com.kt.apps.core.tv.datasource.impl.MainTVDataSource$TVChannelUrlType;
import com.kt.apps.core.tv.model.TVChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jb.InterfaceC1394e;

/* loaded from: classes2.dex */
public final class o implements InterfaceC1394e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s f12289a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TVChannel.Url f12290b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TVChannel f12291c;

    public o(s sVar, TVChannel.Url url, TVChannel tVChannel) {
        this.f12289a = sVar;
        this.f12290b = url;
        this.f12291c = tVChannel;
    }

    @Override // jb.InterfaceC1394e
    public final Object apply(Object obj) {
        Throwable it = (Throwable) obj;
        kotlin.jvm.internal.l.e(it, "it");
        s sVar = this.f12289a;
        sVar.getClass();
        TVChannel tVChannel = this.f12291c;
        List<TVChannel.Url> urls = tVChannel.getUrls();
        ArrayList arrayList = new ArrayList(Eb.p.S(urls, 10));
        Iterator<T> it2 = urls.iterator();
        while (it2.hasNext()) {
            arrayList.add(((TVChannel.Url) it2.next()).getUrl());
        }
        int indexOf = arrayList.indexOf(this.f12290b.getUrl());
        TVChannel.Url url = null;
        if (indexOf != tVChannel.getUrls().size() - 1) {
            int i7 = indexOf + 1;
            int size = tVChannel.getUrls().size();
            while (true) {
                if (i7 >= size) {
                    break;
                }
                if (kotlin.jvm.internal.l.a(tVChannel.getUrls().get(i7).getType(), MainTVDataSource$TVChannelUrlType.WEB_PAGE.getValue())) {
                    url = tVChannel.getUrls().get(i7);
                    break;
                }
                i7++;
            }
        }
        if (url == null) {
            return gb.i.i(it);
        }
        String message = "NexUrl: " + url;
        kotlin.jvm.internal.l.e(message, "message");
        return s.d(sVar, url, tVChannel);
    }
}
