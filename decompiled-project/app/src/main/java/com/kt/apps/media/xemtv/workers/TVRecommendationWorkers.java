package com.kt.apps.media.xemtv.workers;

import Aa.t;
import Ab.e;
import D5.i;
import Db.o;
import Ia.d;
import Rb.a;
import U9.w;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.support.v4.media.session.b;
import androidx.work.WorkerParameters;
import androidx.work.rxjava3.RxWorker;
import com.google.android.gms.common.api.f;
import com.kt.apps.core.storage.local.RoomDataBase;
import com.kt.apps.media.xemtv.workers.TVRecommendationWorkers;
import da.C1065c;
import g3.C1191j;
import gb.p;
import h3.C1249k;
import h3.u;
import h3.x;
import kotlin.jvm.internal.l;
import mb.InterfaceC1655a;
import ob.C1833a;
import ob.C1837e;
import ob.k;
import ob.m;
import sb.g;

/* loaded from: classes2.dex */
public final class TVRecommendationWorkers extends RxWorker {

    /* renamed from: f, reason: collision with root package name */
    public final C1065c f16234f;
    public final Context g;

    /* renamed from: h, reason: collision with root package name */
    public final WorkerParameters f16235h;

    /* renamed from: i, reason: collision with root package name */
    public final o f16236i;
    public final o j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TVRecommendationWorkers(Context appContext, WorkerParameters workerParams, C1065c tvChannelUseCase) {
        super(appContext, workerParams);
        l.e(appContext, "appContext");
        l.e(workerParams, "workerParams");
        l.e(tvChannelUseCase, "tvChannelUseCase");
        this.f16234f = tvChannelUseCase;
        this.g = appContext;
        this.f16235h = workerParams;
        final int i7 = 0;
        this.f16236i = b.z(new a(this) { // from class: Ia.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TVRecommendationWorkers f5338b;

            {
                this.f5338b = this;
            }

            @Override // Rb.a
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        return RoomDataBase.f16124l.g(this.f5338b.g).E();
                    default:
                        return RoomDataBase.f16124l.g(this.f5338b.g).H();
                }
            }
        });
        final int i10 = 1;
        this.j = b.z(new a(this) { // from class: Ia.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TVRecommendationWorkers f5338b;

            {
                this.f5338b = this;
            }

            @Override // Rb.a
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return RoomDataBase.f16124l.g(this.f5338b.g).E();
                    default:
                        return RoomDataBase.f16124l.g(this.f5338b.g).H();
                }
            }
        });
    }

    public static Uri g(Resources resources, int i7) {
        Uri build = new Uri.Builder().scheme("android.resource").authority(resources.getResourcePackageName(i7)).appendPath(resources.getResourceTypeName(i7)).appendPath(resources.getResourceEntryName(i7)).build();
        l.d(build, "build(...)");
        return build;
    }

    @Override // androidx.work.rxjava3.RxWorker
    public final p c() {
        m mVar;
        int i7 = 1;
        int i10 = 0;
        WorkerParameters workerParameters = this.f16235h;
        try {
            C1249k c1249k = workerParameters.f13734b;
            d[] dVarArr = d.f5341a;
            c1249k.getClass();
            Object obj = c1249k.f17699a.get("extra:type");
            int intValue = ((Number) (obj instanceof Integer ? obj : 1)).intValue();
            if (intValue == 2) {
                String b2 = workerParameters.f13734b.b("extra:program_id");
                l.b(b2);
                mVar = new m(i10, f(b2), x.a());
            } else if (intValue == 3) {
                w wVar = (w) this.j.getValue();
                wVar.getClass();
                mVar = new m(i10, new C1833a(i7, b.i(wVar.f9918a, new Ba.o(wVar, 19)), new i(this, 18)), x.a());
            } else {
                mVar = new m(i10, e(), x.a());
            }
            return mVar;
        } catch (Exception unused) {
            return p.c(new u());
        }
    }

    public final synchronized k e() {
        Object pVar;
        pVar = new sb.p(new g(C1065c.b(this.f16234f, false, 3).n(e.f1560b).j(Ia.e.f5342a, f.API_PRIORITY_OTHER), Ia.e.f5343b, 1), new C1191j(this, 19), false);
        return new C1837e(new pb.g(pVar instanceof InterfaceC1655a ? ((InterfaceC1655a) pVar).a() : new ob.l(pVar, 0), Ia.e.f5344c, 1), 1).a(new Ia.a(this, 1));
    }

    public final k f(String str) {
        U9.p pVar = (U9.p) this.f16236i.getValue();
        pVar.getClass();
        t tVar = new t(17, str, pVar);
        return new sb.p(b.j(pVar.f9906a, new String[]{"TVChannelEntity"}, tVar), new q3.l(11, this, str, false), false).a(new Ia.a(this, 0));
    }
}
