package Z9;

import com.kt.apps.core.tv.model.TVChannel;
import jb.InterfaceC1394e;

/* loaded from: classes2.dex */
public final class p implements InterfaceC1394e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s f12292a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TVChannel f12293b;

    public p(s sVar, TVChannel tVChannel) {
        this.f12292a = sVar;
        this.f12293b = tVChannel;
    }

    @Override // jb.InterfaceC1394e
    public final Object apply(Object obj) {
        TVChannel.Url it = (TVChannel.Url) obj;
        kotlin.jvm.internal.l.e(it, "it");
        return s.d(this.f12292a, it, this.f12293b);
    }
}
