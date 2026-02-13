package ea;

import com.kt.apps.core.tv.viewmodels.BaseTVChannelViewModel;
import java.util.List;
import jb.InterfaceC1393d;
import kotlin.jvm.internal.l;
import y9.G;

/* renamed from: ea.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1107b implements InterfaceC1393d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16827a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BaseTVChannelViewModel f16828b;

    public /* synthetic */ C1107b(BaseTVChannelViewModel baseTVChannelViewModel, int i7) {
        this.f16827a = i7;
        this.f16828b = baseTVChannelViewModel;
    }

    @Override // jb.InterfaceC1393d
    public final void accept(Object obj) {
        switch (this.f16827a) {
            case 0:
                Throwable it = (Throwable) obj;
                l.e(it, "it");
                A3.c.r(it, this.f16828b.get_tvWithLinkStreamLiveData());
                return;
            case 1:
                Throwable it2 = (Throwable) obj;
                l.e(it2, "it");
                BaseTVChannelViewModel t5 = this.f16828b;
                l.e(t5, "t");
                A3.c.r(it2, t5.get_listTvChannelLiveData());
                return;
            default:
                List it3 = (List) obj;
                l.e(it3, "it");
                if (it3.isEmpty()) {
                    return;
                }
                this.f16828b.get_listTvChannelLiveData().l(new G(it3));
                return;
        }
    }
}
