package com.kt.apps.core.workers;

import A9.N2;
import Db.o;
import Eb.p;
import G8.m;
import M9.d;
import N8.a;
import R9.b;
import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.kt.apps.core.storage.local.RoomDataBase;
import com.kt.apps.core.utils.models.IPTVPreloadData;
import gb.i;
import h3.w;
import h3.x;
import hb.InterfaceC1269b;
import ia.C1357c;
import ia.C1358d;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.internal.l;
import nb.g;
import sb.u;
import u8.c;
import y7.u0;

/* loaded from: classes2.dex */
public final class PreloadDataWorker extends Worker {

    /* renamed from: e, reason: collision with root package name */
    public final c f16178e;

    /* renamed from: f, reason: collision with root package name */
    public final RoomDataBase f16179f;
    public final b g;

    /* renamed from: h, reason: collision with root package name */
    public final o f16180h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreloadDataWorker(Context context, WorkerParameters params, c firebaseRemoteConfig, RoomDataBase roomDataBase, b keyValueStorage) {
        super(context, params);
        l.e(context, "context");
        l.e(params, "params");
        l.e(firebaseRemoteConfig, "firebaseRemoteConfig");
        l.e(roomDataBase, "roomDataBase");
        l.e(keyValueStorage, "keyValueStorage");
        this.f16178e = firebaseRemoteConfig;
        this.f16179f = roomDataBase;
        this.g = keyValueStorage;
        this.f16180h = android.support.v4.media.session.b.z(new N2(this, 24));
    }

    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.concurrent.CountDownLatch, nb.d, gb.b] */
    @Override // androidx.work.Worker
    public final w c() {
        this.f16178e.d();
        ((Number) this.g.a(Integer.TYPE, "PRELOAD_VERSION")).intValue();
        double d10 = this.f16178e.d();
        List<IPTVPreloadData> list = (List) new m().c(this.f16178e.g("default_iptv_channel"), a.a(List.class, IPTVPreloadData.class).f7387b);
        l.b(list);
        ArrayList arrayList = new ArrayList(p.S(list, 10));
        for (IPTVPreloadData iPTVPreloadData : list) {
            arrayList.add(new d(iPTVPreloadData.getSourceName(), iPTVPreloadData.getSourceUrl()));
        }
        u l10 = i.l(arrayList);
        C1357c c1357c = C1357c.f18484d;
        C1358d c1358d = new C1358d(this, 0);
        ?? countDownLatch = new CountDownLatch(1);
        try {
            try {
                l10.b(new g(7, new sb.o(countDownLatch, c1358d, false), c1357c));
                try {
                    if (countDownLatch.getCount() != 0) {
                        try {
                            countDownLatch.await();
                        } catch (InterruptedException e2) {
                            countDownLatch.f21340d = true;
                            InterfaceC1269b interfaceC1269b = countDownLatch.f21339c;
                            if (interfaceC1269b != null) {
                                interfaceC1269b.b();
                            }
                            com.bumptech.glide.d.t(e2);
                        }
                    }
                    Throwable th = countDownLatch.f21338b;
                    if (th != null) {
                        com.bumptech.glide.d.t(th);
                    }
                } catch (Throwable th2) {
                    u0.L(th2);
                    com.bumptech.glide.d.t(th2);
                }
                this.g.b(Integer.valueOf((int) d10), "PRELOAD_VERSION");
                return x.a();
            } catch (NullPointerException e10) {
                throw e10;
            } catch (Throwable th3) {
                u0.L(th3);
                com.bumptech.glide.d.t(th3);
                NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
                nullPointerException.initCause(th3);
                throw nullPointerException;
            }
        } catch (NullPointerException e11) {
            throw e11;
        } catch (Throwable th4) {
            u0.L(th4);
            com.bumptech.glide.d.t(th4);
            NullPointerException nullPointerException2 = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
            nullPointerException2.initCause(th4);
            throw nullPointerException2;
        }
    }
}
