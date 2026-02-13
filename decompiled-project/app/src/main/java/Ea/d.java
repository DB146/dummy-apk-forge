package Ea;

import Db.q;
import com.kt.apps.core.tv.model.TVChannel;
import com.kt.apps.core.tv.model.TVChannelLinkStream;
import com.kt.apps.core.tv.viewmodels.BaseTVChannelViewModel;
import com.kt.apps.media.xemtv.ui_mobile.MobileMainActivity;
import java.util.List;
import java.util.Map;
import y9.G;
import y9.I;

/* loaded from: classes2.dex */
public final /* synthetic */ class d implements Rb.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3830a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MobileMainActivity f3831b;

    public /* synthetic */ d(MobileMainActivity mobileMainActivity, int i7) {
        this.f3830a = i7;
        this.f3831b = mobileMainActivity;
    }

    @Override // Rb.c
    public final Object invoke(Object obj) {
        q qVar = q.f3365a;
        MobileMainActivity mobileMainActivity = this.f3831b;
        switch (this.f3830a) {
            case 0:
                I i7 = (I) obj;
                int i10 = MobileMainActivity.f16227S;
                if (i7 instanceof G) {
                    TVChannelLinkStream tVChannelLinkStream = (TVChannelLinkStream) ((G) i7).f27483a;
                    E9.h k = mobileMainActivity.k();
                    List<E9.i> inputExoPlayerLink = tVChannelLinkStream.getInputExoPlayerLink();
                    boolean isHls = tVChannelLinkStream.getChannel().isHls();
                    Map<String, String> mapData = tVChannelLinkStream.getChannel().getMapData();
                    f fVar = (f) mobileMainActivity.f16233R.getValue();
                    int i11 = E9.c.f3804f;
                    k.d(inputExoPlayerLink, isHls, mapData, fVar, null);
                }
                return qVar;
            default:
                TVChannel it = (TVChannel) obj;
                kotlin.jvm.internal.l.e(it, "it");
                int i12 = MobileMainActivity.f16227S;
                BaseTVChannelViewModel.getLinkStreamForChannel$default(mobileMainActivity.l(), it, false, 2, null);
                return qVar;
        }
    }
}
