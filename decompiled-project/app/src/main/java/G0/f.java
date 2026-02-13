package G0;

import A0.C0005a;
import B0.AbstractC0187l;
import B0.D;
import Db.q;
import H0.n;
import Q.C0480b;
import Q.C0487e0;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import android.view.Surface;
import cc.D0;
import cc.F;
import cc.z0;
import g3.C1191j;
import h3.H;
import hc.C1277e;
import j0.AbstractC1362A;
import java.util.function.Consumer;

/* loaded from: classes.dex */
public final class f implements ScrollCaptureCallback {

    /* renamed from: a, reason: collision with root package name */
    public final n f4261a;

    /* renamed from: b, reason: collision with root package name */
    public final V0.j f4262b;

    /* renamed from: c, reason: collision with root package name */
    public final C1191j f4263c;

    /* renamed from: d, reason: collision with root package name */
    public final D f4264d;

    /* renamed from: e, reason: collision with root package name */
    public final C1277e f4265e;

    /* renamed from: f, reason: collision with root package name */
    public final j f4266f;

    public f(n nVar, V0.j jVar, C1277e c1277e, C1191j c1191j, D d10) {
        this.f4261a = nVar;
        this.f4262b = jVar;
        this.f4263c = c1191j;
        this.f4264d = d10;
        this.f4265e = new C1277e(c1277e.l().plus(h.f4268a));
        this.f4266f = new j(jVar.f9980d - jVar.f9978b, new e(this, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(f fVar, ScrollCaptureSession scrollCaptureSession, V0.j jVar, Jb.c cVar) {
        c cVar2;
        Ib.a aVar;
        int i7;
        int i10;
        int i11;
        d dVar;
        f fVar2;
        ScrollCaptureSession scrollCaptureSession2;
        int i12;
        int i13;
        int k;
        int k7;
        Surface surface;
        Surface surface2;
        Surface surface3;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i14 = cVar2.f4253v;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                cVar2.f4253v = i14 - Integer.MIN_VALUE;
                Object obj = cVar2.f4251f;
                aVar = Ib.a.f5345a;
                i7 = cVar2.f4253v;
                if (i7 != 0) {
                    com.bumptech.glide.c.c0(obj);
                    i10 = jVar.f9978b;
                    j jVar2 = fVar.f4266f;
                    cVar2.f4246a = fVar;
                    cVar2.f4247b = scrollCaptureSession;
                    cVar2.f4248c = jVar;
                    cVar2.f4249d = i10;
                    i11 = jVar.f9980d;
                    cVar2.f4250e = i11;
                    cVar2.f4253v = 1;
                    if (i10 > i11) {
                        jVar2.getClass();
                        throw new IllegalArgumentException(("Expected min=" + i10 + " ≤ max=" + i11).toString());
                    }
                    int i15 = i11 - i10;
                    int i16 = jVar2.f4273a;
                    if (i15 > i16) {
                        throw new IllegalArgumentException(X.c.e(i15, i16, "Expected range (", ") to be ≤ viewportSize=").toString());
                    }
                    float f4 = i10;
                    float f10 = jVar2.f4275c;
                    Object obj2 = q.f3365a;
                    if (f4 < f10 || i11 > i16 + f10) {
                        Object a9 = jVar2.a((f4 < f10 ? i10 : i11 - i16) - f10, cVar2);
                        if (a9 != aVar) {
                            a9 = obj2;
                        }
                        if (a9 == aVar) {
                            obj2 = a9;
                        }
                    }
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        i13 = cVar2.f4250e;
                        i12 = cVar2.f4249d;
                        jVar = cVar2.f4248c;
                        scrollCaptureSession2 = AbstractC0187l.g(cVar2.f4247b);
                        fVar2 = cVar2.f4246a;
                        com.bumptech.glide.c.c0(obj);
                        j jVar3 = fVar2.f4266f;
                        k = H.k(i12 - Tb.a.F(jVar3.f4275c), 0, jVar3.f4273a);
                        j jVar4 = fVar2.f4266f;
                        k7 = H.k(i13 - Tb.a.F(jVar4.f4275c), 0, jVar4.f4273a);
                        int i17 = jVar.f9977a;
                        if (k != k7) {
                            return V0.j.f9976e;
                        }
                        surface = scrollCaptureSession2.getSurface();
                        Canvas lockHardwareCanvas = surface.lockHardwareCanvas();
                        try {
                            lockHardwareCanvas.save();
                            lockHardwareCanvas.translate(-i17, -k);
                            V0.j jVar5 = fVar2.f4262b;
                            lockHardwareCanvas.translate(-jVar5.f9977a, -jVar5.f9978b);
                            fVar2.f4264d.getRootView().draw(lockHardwareCanvas);
                            surface3 = scrollCaptureSession2.getSurface();
                            surface3.unlockCanvasAndPost(lockHardwareCanvas);
                            int F10 = Tb.a.F(fVar2.f4266f.f4275c);
                            return new V0.j(i17, k + F10, jVar.f9979c, k7 + F10);
                        } catch (Throwable th) {
                            surface2 = scrollCaptureSession2.getSurface();
                            surface2.unlockCanvasAndPost(lockHardwareCanvas);
                            throw th;
                        }
                    }
                    int i18 = cVar2.f4250e;
                    int i19 = cVar2.f4249d;
                    jVar = cVar2.f4248c;
                    ScrollCaptureSession g = AbstractC0187l.g(cVar2.f4247b);
                    f fVar3 = cVar2.f4246a;
                    com.bumptech.glide.c.c0(obj);
                    i11 = i18;
                    i10 = i19;
                    scrollCaptureSession = g;
                    fVar = fVar3;
                }
                dVar = d.f4254b;
                cVar2.f4246a = fVar;
                cVar2.f4247b = scrollCaptureSession;
                cVar2.f4248c = jVar;
                cVar2.f4249d = i10;
                cVar2.f4250e = i11;
                cVar2.f4253v = 2;
                if (C0480b.m(cVar2.getContext()).n(dVar, cVar2) != aVar) {
                    return aVar;
                }
                fVar2 = fVar;
                scrollCaptureSession2 = scrollCaptureSession;
                i12 = i10;
                i13 = i11;
                j jVar32 = fVar2.f4266f;
                k = H.k(i12 - Tb.a.F(jVar32.f4275c), 0, jVar32.f4273a);
                j jVar42 = fVar2.f4266f;
                k7 = H.k(i13 - Tb.a.F(jVar42.f4275c), 0, jVar42.f4273a);
                int i172 = jVar.f9977a;
                if (k != k7) {
                }
            }
        }
        cVar2 = new c(fVar, cVar);
        Object obj3 = cVar2.f4251f;
        aVar = Ib.a.f5345a;
        i7 = cVar2.f4253v;
        if (i7 != 0) {
        }
        dVar = d.f4254b;
        cVar2.f4246a = fVar;
        cVar2.f4247b = scrollCaptureSession;
        cVar2.f4248c = jVar;
        cVar2.f4249d = i10;
        cVar2.f4250e = i11;
        cVar2.f4253v = 2;
        if (C0480b.m(cVar2.getContext()).n(dVar, cVar2) != aVar) {
        }
    }

    public final void onScrollCaptureEnd(Runnable runnable) {
        F.B(this.f4265e, z0.f14594b, 0, new a(this, runnable, null), 2);
    }

    public final void onScrollCaptureImageRequest(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Rect rect, Consumer consumer) {
        final D0 B10 = F.B(this.f4265e, null, 0, new b(this, scrollCaptureSession, rect, consumer, null), 3);
        B10.invokeOnCompletion(new C0005a(cancellationSignal, 12));
        cancellationSignal.setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: G0.g
            @Override // android.os.CancellationSignal.OnCancelListener
            public final void onCancel() {
                D0.this.cancel(null);
            }
        });
    }

    public final void onScrollCaptureSearch(CancellationSignal cancellationSignal, Consumer consumer) {
        consumer.accept(AbstractC1362A.x(this.f4262b));
    }

    public final void onScrollCaptureStart(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Runnable runnable) {
        this.f4266f.f4275c = 0.0f;
        C1191j c1191j = this.f4263c;
        ((C0487e0) c1191j.f17441b).setValue(Boolean.TRUE);
        runnable.run();
    }
}
