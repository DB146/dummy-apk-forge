package com.kt.apps.core.workers;

import Db.o;
import M9.t;
import R9.a;
import U9.h;
import android.content.Context;
import android.support.v4.media.session.b;
import androidx.work.WorkerParameters;
import androidx.work.rxjava3.RxWorker;
import com.kt.apps.core.storage.local.RoomDataBase;
import com.kt.apps.core.workers.AutoRefreshExtensionsChannelWorker;
import gb.p;
import h3.C1249k;
import h3.x;
import i1.C1290a;
import ia.C1355a;
import kotlin.jvm.internal.l;
import ob.m;
import sb.g;
import t8.C2034c;

/* loaded from: classes2.dex */
public final class AutoRefreshExtensionsChannelWorker extends RxWorker {

    /* renamed from: f, reason: collision with root package name */
    public final a f16175f;
    public final t g;

    /* renamed from: h, reason: collision with root package name */
    public final o f16176h;

    /* renamed from: i, reason: collision with root package name */
    public final o f16177i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoRefreshExtensionsChannelWorker(Context appContext, WorkerParameters workerParams, a keyValueStorage, t parserExtensionsSource) {
        super(appContext, workerParams);
        l.e(appContext, "appContext");
        l.e(workerParams, "workerParams");
        l.e(keyValueStorage, "keyValueStorage");
        l.e(parserExtensionsSource, "parserExtensionsSource");
        this.f16175f = keyValueStorage;
        this.g = parserExtensionsSource;
        this.f16176h = b.z(new C1355a(appContext, 0));
        final int i7 = 0;
        this.f16177i = b.z(new Rb.a(this) { // from class: ia.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AutoRefreshExtensionsChannelWorker f18481b;

            {
                this.f18481b = this;
            }

            @Override // Rb.a
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        return ((RoomDataBase) this.f18481b.f16176h.getValue()).z();
                    default:
                        return ((RoomDataBase) this.f18481b.f16176h.getValue()).y();
                }
            }
        });
        final int i10 = 1;
        b.z(new Rb.a(this) { // from class: ia.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AutoRefreshExtensionsChannelWorker f18481b;

            {
                this.f18481b = this;
            }

            @Override // Rb.a
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return ((RoomDataBase) this.f18481b.f16176h.getValue()).z();
                    default:
                        return ((RoomDataBase) this.f18481b.f16176h.getValue()).y();
                }
            }
        });
    }

    @Override // androidx.work.rxjava3.RxWorker
    public final p c() {
        C1249k c1249k = this.f17719b.f13734b;
        Object obj = Boolean.FALSE;
        Object obj2 = c1249k.f17699a.get("extra:key_version_is_beta");
        if (obj2 instanceof Boolean) {
            obj = obj2;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        h hVar = (h) this.f16177i.getValue();
        hVar.getClass();
        m mVar = new m(0, new g(new qb.m(b.i(hVar.f9862a, new Ba.o(hVar, 16)), 0), new C1290a(this, 2), 1).g(new R7.b(this, 21)), x.a());
        if (!booleanValue) {
            return mVar;
        }
        t tVar = this.g;
        tVar.getClass();
        return new m(mVar, new g(new qb.m(new M9.m(tVar, 1), 2), M9.h.f6865e, 2).g(new C2034c(tVar, 24)));
    }
}
