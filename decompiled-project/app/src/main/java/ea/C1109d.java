package ea;

import com.kt.apps.core.tv.viewmodels.BaseTVChannelViewModel;
import jb.InterfaceC1393d;
import kotlin.jvm.internal.l;

/* renamed from: ea.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1109d implements InterfaceC1393d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16832a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BaseTVChannelViewModel f16833b;

    public /* synthetic */ C1109d(BaseTVChannelViewModel baseTVChannelViewModel, int i7) {
        this.f16832a = i7;
        this.f16833b = baseTVChannelViewModel;
    }

    @Override // jb.InterfaceC1393d
    public final void accept(Object obj) {
        switch (this.f16832a) {
            case 0:
                Throwable it = (Throwable) obj;
                l.e(it, "it");
                A3.c.r(it, this.f16833b.get_tvWithLinkStreamLiveData());
                return;
            default:
                Throwable it2 = (Throwable) obj;
                l.e(it2, "it");
                A3.c.r(it2, this.f16833b.get_tvWithLinkStreamLiveData());
                return;
        }
    }
}
