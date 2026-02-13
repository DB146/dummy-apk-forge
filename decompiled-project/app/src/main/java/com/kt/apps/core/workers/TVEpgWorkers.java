package com.kt.apps.core.workers;

import Ab.e;
import M9.k;
import R9.a;
import R9.b;
import U9.t;
import android.content.Context;
import android.text.format.DateUtils;
import androidx.work.WorkerParameters;
import androidx.work.rxjava3.RxWorker;
import gb.p;
import h3.C1249k;
import h3.x;
import i1.C1290a;
import kotlin.jvm.internal.l;
import ob.m;
import tb.f;

/* loaded from: classes2.dex */
public final class TVEpgWorkers extends RxWorker {

    /* renamed from: f, reason: collision with root package name */
    public final a f16181f;
    public final k g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TVEpgWorkers(Context context, WorkerParameters inputParams, a keyValueStorage, k parserEpgRepo) {
        super(context, inputParams);
        l.e(context, "context");
        l.e(inputParams, "inputParams");
        l.e(keyValueStorage, "keyValueStorage");
        l.e(parserEpgRepo, "parserEpgRepo");
        this.f16181f = keyValueStorage;
        this.g = parserEpgRepo;
    }

    @Override // androidx.work.rxjava3.RxWorker
    public final p c() {
        Class cls = Long.TYPE;
        a aVar = this.f16181f;
        long longValue = ((Number) ((b) aVar).a(cls, "extra:last_update_epg")).longValue();
        WorkerParameters workerParameters = this.f17719b;
        C1249k c1249k = workerParameters.f13734b;
        Object obj = Boolean.FALSE;
        Object obj2 = c1249k.f17699a.get("extra:force_update");
        if (obj2 instanceof Boolean) {
            obj = obj2;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        if (DateUtils.isToday(longValue) && !booleanValue && System.currentTimeMillis() - longValue < 3600000) {
            return p.c(x.a());
        }
        String b2 = workerParameters.f13734b.b("extra:default_url");
        l.b(b2);
        l.e(aVar, "<this>");
        ((b) aVar).b(b2, "DefaultEpgUrl");
        k kVar = this.g;
        kVar.getClass();
        t tVar = (t) kVar.f6879f.getValue();
        tVar.getClass();
        return new m(4, new f(new m(new tb.b(new F8.a(b2, 22, this), 0), android.support.v4.media.session.b.g(tVar.f9911a, new U9.b(b2, 3))).f(e.f1561c), new Q9.a(this, 18), null), new C1290a(this, 3));
    }
}
