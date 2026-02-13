package Z9;

import com.kt.apps.core.tv.model.TVChannel;
import com.kt.apps.core.tv.model.TVChannelLinkStream;
import java.util.List;
import jb.InterfaceC1394e;
import y7.u0;

/* renamed from: Z9.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0671h implements InterfaceC1394e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f12275a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TVChannel f12276b;

    public C0671h(j jVar, TVChannel tVChannel) {
        this.f12275a = jVar;
        this.f12276b = tVChannel;
    }

    @Override // jb.InterfaceC1394e
    public final Object apply(Object obj) {
        List extensionsChannels = (List) obj;
        kotlin.jvm.internal.l.e(extensionsChannels, "extensionsChannels");
        j jVar = this.f12275a;
        TVChannel tVChannel = this.f12276b;
        TVChannel.Url c10 = jVar.c(tVChannel, extensionsChannels);
        return c10 != null ? gb.i.l(new TVChannelLinkStream(tVChannel, u0.x(c10))) : sb.h.f24268a;
    }
}
