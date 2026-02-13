package Ia;

import com.kt.apps.media.xemtv.workers.TVRecommendationWorkers;
import jb.InterfaceC1390a;
import kotlin.jvm.internal.l;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements InterfaceC1390a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5335a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TVRecommendationWorkers f5336b;

    public /* synthetic */ a(TVRecommendationWorkers tVRecommendationWorkers, int i7) {
        this.f5335a = i7;
        this.f5336b = tVRecommendationWorkers;
    }

    @Override // jb.InterfaceC1390a
    public final void run() {
        switch (this.f5335a) {
            case 0:
                TVRecommendationWorkers t5 = this.f5336b;
                l.e(t5, "t");
                return;
            default:
                TVRecommendationWorkers t10 = this.f5336b;
                l.e(t10, "t");
                return;
        }
    }
}
