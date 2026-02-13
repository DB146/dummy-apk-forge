package Kc;

import Ga.j;
import jb.InterfaceC1394e;
import kotlin.jvm.internal.l;
import tb.e;
import tss.r.core.ads.database.AdsDatabase;

/* loaded from: classes2.dex */
public final class c implements InterfaceC1394e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6222a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f6223b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f6224c;

    public /* synthetic */ c(d dVar, int i7, int i10) {
        this.f6222a = i10;
        this.f6223b = dVar;
        this.f6224c = i7;
    }

    @Override // jb.InterfaceC1394e
    public final Object apply(Object obj) {
        switch (this.f6222a) {
            case 0:
                Throwable it = (Throwable) obj;
                l.e(it, "it");
                return this.f6223b.a(this.f6224c);
            case 1:
                Ic.a versionEntity = (Ic.a) obj;
                l.e(versionEntity, "versionEntity");
                long currentTimeMillis = System.currentTimeMillis();
                d dVar = this.f6223b;
                long j = dVar.f6230d;
                long j10 = versionEntity.f5356b;
                int i7 = this.f6224c;
                if (j10 < j || currentTimeMillis - versionEntity.f5357c >= 7200000) {
                    return dVar.a(i7);
                }
                Hc.d y10 = ((AdsDatabase) dVar.f6229c.getValue()).y();
                y10.getClass();
                return new e(new e(android.support.v4.media.session.b.k(y10.f4927a, false, new j(i7, y10)), b.f6221a, 1), new c(dVar, i7, 0), 2);
            default:
                Throwable it2 = (Throwable) obj;
                l.e(it2, "it");
                return this.f6223b.a(this.f6224c);
        }
    }
}
