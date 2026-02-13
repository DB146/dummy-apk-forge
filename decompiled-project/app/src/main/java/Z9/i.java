package Z9;

import com.kt.apps.core.extensions.ExtensionsChannel;
import com.kt.apps.core.tv.model.TVChannel;
import com.kt.apps.core.tv.model.TVChannelLinkStream;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import jb.InterfaceC1393d;

/* loaded from: classes2.dex */
public final class i implements InterfaceC1393d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f12277a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TVChannel.Url f12278b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TVChannel f12279c;

    public i(j jVar, TVChannel.Url url, TVChannel tVChannel) {
        this.f12277a = jVar;
        this.f12278b = url;
        this.f12279c = tVChannel;
    }

    @Override // jb.InterfaceC1393d
    public final void accept(Object obj) {
        i iVar = this;
        TVChannelLinkStream result = (TVChannelLinkStream) obj;
        kotlin.jvm.internal.l.e(result, "result");
        j jVar = iVar.f12277a;
        LinkedHashMap linkedHashMap = jVar.f12281b;
        TVChannel.Url url = iVar.f12278b;
        String url2 = url.getUrl();
        List<TVChannel.Url> linkStream = result.getLinkStream();
        ArrayList arrayList = new ArrayList(Eb.p.S(linkStream, 10));
        for (TVChannel.Url url3 : linkStream) {
            TVChannel tVChannel = iVar.f12279c;
            arrayList.add(new ExtensionsChannel(tVChannel.getTvGroup(), tVChannel.getLogoChannel(), tVChannel.getTvChannelName(), url3.getUrl(), "iptv-backup", tVChannel.getChannelId(), 0L, ac.g.b0(url3.getUrl(), ".m3u8"), null, null, null, url3.getProps(), "iptv-backup", 1856, null));
            iVar = this;
        }
        linkedHashMap.put(url2, arrayList);
        jVar.f12282c.put(url.getUrl(), Long.valueOf(System.currentTimeMillis()));
    }
}
