package oa;

import M9.t;
import android.content.Context;
import androidx.work.WorkerParameters;
import com.kt.apps.core.storage.local.RoomDataBase;
import com.kt.apps.core.workers.AutoRefreshExtensionsChannelWorker;
import com.kt.apps.core.workers.PreloadDataWorker;
import com.kt.apps.core.workers.TVEpgWorkers;
import com.kt.apps.media.xemtv.workers.TVRecommendationWorkers;
import da.C1065c;
import h3.y;

/* renamed from: oa.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1832g implements Y1.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22154a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f22155b;

    public /* synthetic */ C1832g(i iVar, int i7) {
        this.f22154a = i7;
        this.f22155b = iVar;
    }

    @Override // Y1.b
    public final y a(Context context, WorkerParameters workerParameters) {
        switch (this.f22154a) {
            case 0:
                j jVar = this.f22155b.f22156a;
                return new AutoRefreshExtensionsChannelWorker(context, workerParameters, (R9.a) jVar.j.get(), (t) jVar.f22179n.get());
            case 1:
                j jVar2 = this.f22155b.f22156a;
                return new PreloadDataWorker(context, workerParameters, (u8.c) jVar2.f22177l.get(), (RoomDataBase) jVar2.k.get(), (R9.b) jVar2.j.get());
            case 2:
                j jVar3 = this.f22155b.f22156a;
                return new TVEpgWorkers(context, workerParameters, (R9.a) jVar3.j.get(), (M9.k) jVar3.f22178m.get());
            default:
                return new TVRecommendationWorkers(context, workerParameters, (C1065c) this.f22155b.f22156a.f22191z.get());
        }
    }
}
