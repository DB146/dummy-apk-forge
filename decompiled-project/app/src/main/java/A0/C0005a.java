package A0;

import B0.C0170c0;
import B0.C0213y0;
import F.C0273q;
import P4.C0463k;
import Q.C0517u;
import Q.C0518u0;
import Q.C0523z;
import Q.EnumC0507o0;
import a0.C0693t;
import a0.C0694u;
import android.adservices.measurement.MeasurementManager;
import android.content.Context;
import android.content.res.Configuration;
import android.os.CancellationSignal;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import cc.C0944m;
import cc.InterfaceC0937i0;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.kt.apps.core.utils.blurry.BlurFactor;
import ia.C1358d;
import j0.AbstractC1362A;
import j0.C1368f;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import l0.InterfaceC1445d;
import m0.C1533b;
import u.C2041D;
import u.C2042E;
import u.C2043F;
import y0.C2344l;

/* renamed from: A0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0005a extends kotlin.jvm.internal.m implements Rb.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f155a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f156b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0005a(Object obj, int i7) {
        super(1);
        this.f155a = i7;
        this.f156b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:165:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x033c  */
    /* JADX WARN: Type inference failed for: r0v67, types: [Rb.c, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r0v8, types: [y0.H, A0.b] */
    @Override // Rb.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        E.s sVar;
        MeasurementManager measurementManager;
        int i7 = 0;
        E.s sVar2 = null;
        switch (this.f155a) {
            case 0:
                InterfaceC0007b interfaceC0007b = (InterfaceC0007b) obj;
                if (interfaceC0007b.t()) {
                    if (interfaceC0007b.a().f84b) {
                        interfaceC0007b.l();
                    }
                    Iterator it = interfaceC0007b.a().g.entrySet().iterator();
                    while (true) {
                        boolean hasNext = it.hasNext();
                        M m10 = (M) this.f156b;
                        if (hasNext) {
                            Map.Entry entry = (Map.Entry) it.next();
                            M.a(m10, (C2344l) entry.getKey(), ((Number) entry.getValue()).intValue(), interfaceC0007b.i());
                        } else {
                            n0 n0Var = interfaceC0007b.i().f275B;
                            kotlin.jvm.internal.l.b(n0Var);
                            while (!n0Var.equals(m10.f83a.i())) {
                                for (C2344l c2344l : m10.b(n0Var).keySet()) {
                                    M.a(m10, c2344l, m10.c(n0Var, c2344l), n0Var);
                                }
                                n0Var = n0Var.f275B;
                                kotlin.jvm.internal.l.b(n0Var);
                            }
                        }
                    }
                }
                return Db.q.f3365a;
            case 1:
                ((S.e) this.f156b).b((c0.k) obj);
                return Boolean.TRUE;
            case 2:
                Configuration configuration = new Configuration((Configuration) obj);
                C0523z c0523z = AndroidCompositionLocals_androidKt.f13206a;
                ((Q.W) this.f156b).setValue(configuration);
                return Db.q.f3365a;
            case 3:
                return new B0.Z((C0213y0) this.f156b, i7);
            case 4:
                boolean compareAndSet = B0.D0.f1653b.compareAndSet(false, true);
                Db.q qVar = Db.q.f3365a;
                if (compareAndSet) {
                    ((ec.d) this.f156b).h(qVar);
                }
                return qVar;
            case 5:
                InterfaceC1445d interfaceC1445d = (InterfaceC1445d) obj;
                j0.l x2 = interfaceC1445d.u().x();
                Rb.e eVar = ((B0.E0) this.f156b).f1667d;
                if (eVar != null) {
                    eVar.invoke(x2, (C1533b) interfaceC1445d.u().f8696c);
                }
                return Db.q.f3365a;
            case 6:
                int intValue = ((Number) obj).intValue();
                E.o oVar = (E.o) this.f156b;
                return oVar.a(intValue, oVar.f3442c);
            case 7:
                float f4 = -((Number) obj).floatValue();
                E.A a9 = (E.A) this.f156b;
                if ((f4 >= 0.0f || a9.c()) && (f4 <= 0.0f || a9.b())) {
                    if (Math.abs(a9.g) > 0.5f) {
                        B.a.c("entered drag with non-zero pending scroll");
                    }
                    float f10 = a9.g + f4;
                    a9.g = f10;
                    if (Math.abs(f10) > 0.5f) {
                        float f11 = a9.g;
                        int round = Math.round(f11);
                        E.s d10 = ((E.s) a9.f3373e.getValue()).d(round, !a9.f3370b);
                        if (d10 != null && (sVar = a9.f3371c) != null) {
                            E.s d11 = sVar.d(round, true);
                            if (d11 != null) {
                                a9.f3371c = d11;
                            }
                            if (sVar2 == null) {
                                a9.a(sVar2, a9.f3370b, true);
                                a9.f3386u.setValue(Db.q.f3365a);
                                a9.e(f11 - a9.g, sVar2);
                            } else {
                                L l10 = a9.j;
                                if (l10 != null) {
                                    l10.l();
                                }
                                a9.e(f11 - a9.g, a9.d());
                            }
                        }
                        sVar2 = d10;
                        if (sVar2 == null) {
                        }
                    }
                    if (Math.abs(a9.g) > 0.5f) {
                        f4 -= a9.g;
                        a9.g = 0.0f;
                    }
                } else {
                    f4 = 0.0f;
                }
                return Float.valueOf(-f4);
            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                Context it2 = (Context) obj;
                kotlin.jvm.internal.l.e(it2, "it");
                Context context = (Context) this.f156b;
                kotlin.jvm.internal.l.e(context, "context");
                measurementManager = MeasurementManager.get(context);
                kotlin.jvm.internal.l.d(measurementManager, "get(context)");
                return new E2.f(measurementManager);
            case 9:
                return new B0.Z((C0273q) this.f156b, true ? 1 : 0);
            case 10:
                return new B0.Z((F.z) this.f156b, 3);
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                Z.j jVar = (Z.j) this.f156b;
                return Boolean.valueOf(jVar != null ? jVar.b(obj) : true);
            case 12:
                if (((Throwable) obj) != null) {
                    ((CancellationSignal) this.f156b).cancel();
                }
                return Db.q.f3365a;
            case 13:
                ((List) obj).add((Float) ((F.I) this.f156b).invoke());
                return true;
            case 14:
                Throwable th = (Throwable) obj;
                M1.Q q10 = (M1.Q) this.f156b;
                if (th != null) {
                    q10.f6627h.y(new M1.S(th));
                }
                if (q10.j.f3362b != Db.p.f3364a) {
                    ((O1.i) q10.j.getValue()).close();
                }
                return Db.q.f3365a;
            case 15:
                N0.r rVar = (N0.r) obj;
                return ((N0.e) this.f156b).a(new N0.r(null, rVar.f7149b, rVar.f7150c, rVar.f7151d, rVar.f7152e)).f7153a;
            case 16:
                Throwable th2 = (Throwable) obj;
                CancellationException cancellationException = new CancellationException("Recomposer effect job completed");
                cancellationException.initCause(th2);
                C0518u0 c0518u0 = (C0518u0) this.f156b;
                synchronized (c0518u0.f8543b) {
                    try {
                        InterfaceC0937i0 interfaceC0937i0 = c0518u0.f8544c;
                        if (interfaceC0937i0 != null) {
                            fc.b0 b0Var = c0518u0.f8558t;
                            EnumC0507o0 enumC0507o0 = EnumC0507o0.f8475b;
                            b0Var.getClass();
                            b0Var.j(null, enumC0507o0);
                            fc.b0 b0Var2 = C0518u0.f8540x;
                            interfaceC0937i0.cancel(cancellationException);
                            c0518u0.f8555q = null;
                            interfaceC0937i0.invokeOnCompletion(new C0170c0(16, c0518u0, th2));
                        } else {
                            c0518u0.f8545d = cancellationException;
                            fc.b0 b0Var3 = c0518u0.f8558t;
                            EnumC0507o0 enumC0507o02 = EnumC0507o0.f8474a;
                            b0Var3.getClass();
                            b0Var3.j(null, enumC0507o02);
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                return Db.q.f3365a;
            case 17:
                ((C0517u) this.f156b).y(obj);
                return Db.q.f3365a;
            case 18:
                ((L) this.f156b).V((V0.c) obj);
                return Db.q.f3365a;
            case 19:
                Z.j jVar2 = ((Z.g) this.f156b).f12093c;
                return Boolean.valueOf(jVar2 != null ? jVar2.b(obj) : true);
            case 20:
                C0694u c0694u = (C0694u) this.f156b;
                c0694u.getClass();
                synchronized (c0694u.g) {
                    C0693t c0693t = c0694u.f12433i;
                    kotlin.jvm.internal.l.b(c0693t);
                    Object obj2 = c0693t.f12418b;
                    kotlin.jvm.internal.l.b(obj2);
                    int i10 = c0693t.f12420d;
                    C2041D c2041d = c0693t.f12419c;
                    if (c2041d == null) {
                        c2041d = new C2041D();
                        c0693t.f12419c = c2041d;
                        c0693t.f12422f.l(obj2, c2041d);
                    }
                    c0693t.c(obj, i10, obj2, c2041d);
                }
                return Db.q.f3365a;
            case 21:
                ((R6.a) this.f156b).cancel(false);
                return Db.q.f3365a;
            case 22:
                Db.q qVar2 = Db.q.f3365a;
                ((C0944m) this.f156b).resumeWith(qVar2);
                return qVar2;
            case 23:
                f0.f fVar = (f0.f) obj;
                if (!fVar.f14113a.f14112B) {
                    return D0.f17b;
                }
                f0.f fVar2 = fVar.f16932D;
                if (fVar2 != null) {
                    C0005a c0005a = new C0005a((C0463k) this.f156b, 23);
                    if (c0005a.invoke(fVar2) == D0.f16a) {
                        AbstractC0017g.x(fVar2, c0005a);
                    }
                }
                fVar.f16932D = null;
                fVar.f16931C = null;
                return D0.f16a;
            case 24:
                j0.B b2 = (j0.B) obj;
                j0.E e2 = (j0.E) this.f156b;
                b2.b(e2.f18515C);
                b2.c(e2.f18516D);
                b2.a(e2.f18517E);
                float f12 = e2.f18518F;
                if (b2.f18503e != f12) {
                    b2.f18499a |= 32;
                    b2.f18503e = f12;
                }
                float f13 = e2.f18519G;
                if (b2.f18506v != f13) {
                    b2.f18499a |= 2048;
                    b2.f18506v = f13;
                }
                b2.d(e2.f18520H);
                j0.D d12 = e2.f18521I;
                if (!kotlin.jvm.internal.l.a(b2.f18508x, d12)) {
                    b2.f18499a |= 8192;
                    b2.f18508x = d12;
                }
                boolean z8 = e2.f18522J;
                if (b2.f18509y != z8) {
                    b2.f18499a |= 16384;
                    b2.f18509y = z8;
                }
                if (!kotlin.jvm.internal.l.a(null, null)) {
                    b2.f18499a |= 131072;
                }
                long j = e2.f18523K;
                if (!j0.n.c(b2.f18504f, j)) {
                    b2.f18499a |= 64;
                    b2.f18504f = j;
                }
                long j10 = e2.L;
                if (!j0.n.c(b2.f18505u, j10)) {
                    b2.f18499a |= 128;
                    b2.f18505u = j10;
                }
                if (!AbstractC1362A.i(0)) {
                    b2.f18499a |= 32768;
                }
                return Db.q.f3365a;
            case BlurFactor.DEFAULT_RADIUS /* 25 */:
                InterfaceC1445d interfaceC1445d2 = (InterfaceC1445d) obj;
                C1533b c1533b = (C1533b) this.f156b;
                C1368f c1368f = c1533b.f19692l;
                if (c1533b.f19694n && c1533b.f19703w && c1368f != null) {
                    Q7.h u3 = interfaceC1445d2.u();
                    long D10 = u3.D();
                    u3.x().i();
                    try {
                        ((Q7.h) ((C1358d) u3.f8695b).f18487b).x().a(c1368f);
                        c1533b.c(interfaceC1445d2);
                    } finally {
                        u3.x().g();
                        u3.U(D10);
                    }
                } else {
                    c1533b.c(interfaceC1445d2);
                }
                return Db.q.f3365a;
            case 26:
                ((mc.h) this.f156b).b();
                return Db.q.f3365a;
            case 27:
                p0.m mVar = (p0.m) obj;
                p0.b bVar = (p0.b) this.f156b;
                bVar.g(mVar);
                ?? r02 = bVar.f22979i;
                if (r02 != 0) {
                    r02.invoke(mVar);
                }
                return Db.q.f3365a;
            case 28:
                return obj == ((C2042E) this.f156b) ? "(this)" : String.valueOf(obj);
            default:
                return obj == ((C2043F) this.f156b) ? "(this)" : String.valueOf(obj);
        }
    }
}
