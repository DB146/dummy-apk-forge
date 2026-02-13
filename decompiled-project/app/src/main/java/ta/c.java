package ta;

import A8.K;
import Hb.j;
import Ia.d;
import c2.i;
import com.kt.apps.core.tv.model.TVChannel;
import com.kt.apps.core.tv.viewmodels.BaseTVChannelViewModel;
import com.kt.apps.media.xemtv.workers.TVRecommendationWorkers;
import ea.C1113h;
import fc.C1156c;
import fc.L;
import fc.Q;
import h3.C1236B;
import h3.C1249k;
import i3.p;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.l;
import l2.AbstractC1456G;
import l2.C1468l;

/* loaded from: classes2.dex */
public final class c extends BaseTVChannelViewModel {

    /* renamed from: b, reason: collision with root package name */
    public static int f24522b;

    /* renamed from: a, reason: collision with root package name */
    public final p f24523a;

    public c(C1113h c1113h, p pVar) {
        super(c1113h);
        this.f24523a = pVar;
        int i7 = f24522b + 1;
        f24522b = i7;
        String message = "TVChannelViewModel instance count: " + i7;
        l.e(message, "message");
    }

    @Override // com.kt.apps.core.tv.viewmodels.BaseTVChannelViewModel
    public final void enqueueInsertWatchNextTVChannel(TVChannel tvChannel) {
        l.e(tvChannel, "tvChannel");
        C1236B c1236b = new C1236B(TVRecommendationWorkers.class);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        d[] dVarArr = d.f5341a;
        linkedHashMap.put("extra:type", 2);
        linkedHashMap.put("extra:program_id", tvChannel.getChannelId());
        C1249k c1249k = new C1249k(linkedHashMap);
        i.y(c1249k);
        ((q3.p) c1236b.f5049b).f23407e = c1249k;
        this.f24523a.p(c1236b.c());
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [fc.Y, java.lang.Object] */
    public final L i() {
        AbstractC1456G tvWithLinkStreamLiveData = getTvWithLinkStreamLiveData();
        l.e(tvWithLinkStreamLiveData, "<this>");
        return Q.m(new K(6, Q.f(new C1156c(new C1468l(tvWithLinkStreamLiveData, null), j.f4919a, -2, 1), -1), this), l2.Q.h(this), new Object(), getLastWatchedChannel());
    }

    @Override // com.kt.apps.core.tv.viewmodels.BaseTVChannelViewModel
    public final void onFetchTVListSuccess(List listChannel) {
        l.e(listChannel, "listChannel");
        super.onFetchTVListSuccess(listChannel);
        C1236B c1236b = new C1236B(TVRecommendationWorkers.class);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        d[] dVarArr = d.f5341a;
        linkedHashMap.put("extra:type", 1);
        C1249k c1249k = new C1249k(linkedHashMap);
        i.y(c1249k);
        ((q3.p) c1236b.f5049b).f23407e = c1249k;
        this.f24523a.p(c1236b.c());
    }
}
