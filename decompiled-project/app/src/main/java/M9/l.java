package M9;

import U9.u;
import com.kt.apps.core.utils.NetworkUtilsKt;
import java.io.BufferedReader;
import java.util.Map;
import jb.InterfaceC1390a;
import ob.C1836d;
import sb.C2010d;
import t8.C2034c;
import y.S;
import y7.u0;

/* loaded from: classes2.dex */
public final /* synthetic */ class l implements InterfaceC1390a, gb.c, gb.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6882a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f6883b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f6884c;

    public /* synthetic */ l(t tVar, d dVar, int i7) {
        this.f6882a = i7;
        this.f6883b = tVar;
        this.f6884c = dVar;
    }

    public /* synthetic */ l(t tVar, d dVar, kotlin.jvm.internal.r rVar) {
        this.f6882a = 5;
        this.f6883b = tVar;
        this.f6884c = dVar;
    }

    @Override // gb.c
    public void b(C1836d c1836d) {
        String str;
        t tVar = this.f6883b;
        Map g = tVar.g();
        d dVar = this.f6884c;
        o oVar = (o) g.get(dVar.f6851b);
        do {
            str = dVar.f6851b;
            if (oVar == null || oVar != o.f6888a || c1836d.g() || Thread.currentThread().isInterrupted()) {
                break;
            }
            try {
                Thread.sleep(100L);
                oVar = (o) tVar.g().get(str);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return;
            }
        } while (oVar != o.f6890c);
        String message = "Pending source: " + oVar;
        kotlin.jvm.internal.l.e(message, "message");
        if (c1836d.g()) {
            return;
        }
        if (oVar == o.f6890c) {
            c1836d.a();
            return;
        }
        if (oVar == o.f6889b) {
            tVar.g().remove(str);
            Throwable th = new Throwable("Retry");
            if (c1836d.d(th)) {
                return;
            }
            com.bumptech.glide.d.t(th);
        }
    }

    @Override // gb.j
    public void d(C2010d c2010d) {
        t t5 = this.f6883b;
        d dVar = this.f6884c;
        if (c2010d.g() || Thread.currentThread().isInterrupted()) {
            return;
        }
        NetworkUtilsKt.trustEveryone();
        try {
            BufferedReader a9 = t5.a(dVar);
            if (!c2010d.g() && !Thread.currentThread().isInterrupted()) {
                c2010d.d(a9);
                c2010d.a();
            }
        } catch (Exception e2) {
            if (c2010d.g() || Thread.currentThread().isInterrupted()) {
                return;
            }
            kotlin.jvm.internal.l.e(t5, "t");
            c2010d.onError(e2);
        }
    }

    @Override // jb.InterfaceC1390a
    public void run() {
        switch (this.f6882a) {
            case 0:
                d dVar = this.f6884c;
                String message = S.b("Offline ", dVar.f6851b, " source complete");
                t t5 = this.f6883b;
                kotlin.jvm.internal.l.e(t5, "t");
                kotlin.jvm.internal.l.e(message, "message");
                k kVar = t5.f6917d;
                kVar.getClass();
                u uVar = kVar.g;
                uVar.getClass();
                String configId = dVar.f6851b;
                kotlin.jvm.internal.l.e(configId, "configId");
                gb.i g = android.support.v4.media.session.b.k(uVar.f9913a, true, new U9.b(configId, 6)).g();
                h hVar = h.f6863c;
                q3.s sVar = new q3.s(15, kVar, dVar, false);
                nb.e eVar = new nb.e(0, new C2034c(kVar, 23), new F8.a(4, kVar, dVar));
                try {
                    try {
                        g.b(new nb.g(7, new sb.o(eVar, sVar, false), hVar));
                        kVar.f6877d.d(eVar);
                        t5.h().remove(configId);
                        return;
                    } catch (NullPointerException e2) {
                        throw e2;
                    } catch (Throwable th) {
                        u0.L(th);
                        com.bumptech.glide.d.t(th);
                        NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
                        nullPointerException.initCause(th);
                        throw nullPointerException;
                    }
                } catch (NullPointerException e10) {
                    throw e10;
                } catch (Throwable th2) {
                    u0.L(th2);
                    com.bumptech.glide.d.t(th2);
                    NullPointerException nullPointerException2 = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
                    nullPointerException2.initCause(th2);
                    throw nullPointerException2;
                }
            case 1:
                d dVar2 = this.f6884c;
                String message2 = "Offline " + dVar2.f6851b + " source dispose";
                t t10 = this.f6883b;
                kotlin.jvm.internal.l.e(t10, "t");
                kotlin.jvm.internal.l.e(message2, "message");
                t10.h().remove(dVar2.f6851b);
                return;
            case 2:
            case 5:
            default:
                d dVar3 = this.f6884c;
                String message3 = "Dispose " + dVar3.f6851b;
                t t11 = this.f6883b;
                kotlin.jvm.internal.l.e(t11, "t");
                kotlin.jvm.internal.l.e(message3, "message");
                Map g2 = t11.g();
                o oVar = o.f6891d;
                String str = dVar3.f6851b;
                g2.put(str, oVar);
                t11.g().remove(str);
                return;
            case 3:
                d dVar4 = this.f6884c;
                String message4 = dVar4.f6851b + " Dispose";
                t t12 = this.f6883b;
                kotlin.jvm.internal.l.e(t12, "t");
                kotlin.jvm.internal.l.e(message4, "message");
                t12.h().remove(dVar4.f6851b);
                return;
            case 4:
                d dVar5 = this.f6884c;
                String message5 = dVar5.f6851b + " Complete";
                t t13 = this.f6883b;
                kotlin.jvm.internal.l.e(t13, "t");
                kotlin.jvm.internal.l.e(message5, "message");
                t13.h().remove(dVar5.f6851b);
                return;
            case 6:
                d dVar6 = this.f6884c;
                String message6 = "Complete " + dVar6.f6851b;
                t t14 = this.f6883b;
                kotlin.jvm.internal.l.e(t14, "t");
                kotlin.jvm.internal.l.e(message6, "message");
                O5.b.H(t14.f6915b, dVar6);
                t14.f6917d.f();
                t14.g().put(dVar6.f6851b, o.f6890c);
                return;
        }
    }
}
