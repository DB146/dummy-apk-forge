package A0;

import Q.C0481b0;
import Q.C0487e0;
import Q.C0491g0;
import Q.C0506o;
import Q.C0518u0;
import Q.EnumC0507o0;
import a0.AbstractC0688o;
import a0.C0693t;
import a0.C0694u;
import android.os.Trace;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;
import cc.C0944m;
import cc.InterfaceC0942l;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.kt.apps.core.utils.blurry.BlurFactor;
import fc.InterfaceC1161h;
import h0.C1229p;
import j0.AbstractC1362A;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import u.C2042E;
import u.C2046I;
import u.C2047J;
import y.C2281C;
import y0.C2331P;
import y0.C2348p;
import z.C2537I;

/* loaded from: classes.dex */
public final class J extends kotlin.jvm.internal.m implements Rb.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f36b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(C0506o c0506o, Q.V v10) {
        super(0);
        this.f35a = 10;
        this.f36b = c0506o;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(AbstractC1362A abstractC1362A, long j) {
        super(0);
        this.f35a = 13;
        this.f36b = abstractC1362A;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ J(Object obj, int i7) {
        super(0);
        this.f35a = i7;
        this.f36b = obj;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02f5  */
    @Override // Rb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        InterfaceC0942l u3;
        long j;
        long j10;
        char c10;
        char c11;
        long j11;
        int i7;
        long j12;
        long[] jArr;
        long[] jArr2;
        int i10;
        int i11;
        J j13 = this;
        long j14 = 128;
        long j15 = 255;
        char c12 = '\b';
        long j16 = -9187201950435737472L;
        char c13 = 7;
        int i12 = 2;
        switch (j13.f35a) {
            case 0:
                P p10 = ((L) j13.f36b).f61T;
                p10.f105p.f180M = true;
                Y y10 = p10.f106q;
                if (y10 != null) {
                    y10.f140G = true;
                }
                return Db.q.f3365a;
            case 1:
                j0.B b2 = n0.f270U;
                ((Rb.c) j13.f36b).invoke(b2);
                b2.f18498C = b2.f18508x.d(b2.f18510z, b2.f18497B, b2.f18496A);
                return Db.q.f3365a;
            case 2:
                return (Ba.s) j13.f36b;
            case 3:
                return (l2.e0) ((J) j13.f36b).invoke();
            case 4:
                I0.a aVar = (I0.a) j13.f36b;
                aVar.g = null;
                Trace.beginSection("OnPositionedDispatch");
                try {
                    aVar.a();
                    Trace.endSection();
                    return Db.q.f3365a;
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            case 5:
                J.g gVar = (J.g) j13.f36b;
                gVar.f5411M = null;
                AbstractC0017g.m(gVar);
                AbstractC0017g.l(gVar);
                AbstractC0017g.k(gVar);
                return Boolean.TRUE;
            case 6:
                ((M.a) j13.f36b).f6468w.setValue(Boolean.valueOf(!((Boolean) r0.f6468w.getValue()).booleanValue()));
                return Db.q.f3365a;
            case 7:
                AbstractC0017g.k((M.b) j13.f36b);
                return Db.q.f3365a;
            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                Object systemService = ((View) ((q3.c) j13.f36b).f23371b).getContext().getSystemService("input_method");
                kotlin.jvm.internal.l.c(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                return (InputMethodManager) systemService;
            case 9:
                return new BaseInputConnection((View) ((q3.e) j13.f36b).f23376b, false);
            case 10:
                throw null;
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                C0491g0 c0491g0 = (C0491g0) j13.f36b;
                C2046I c2046i = new C2046I(c0491g0.f8398a.size());
                ArrayList arrayList = c0491g0.f8398a;
                int size = arrayList.size();
                for (int i13 = 0; i13 < size; i13++) {
                    Q.O o10 = (Q.O) arrayList.get(i13);
                    Object obj = o10.f8344b;
                    int i14 = o10.f8343a;
                    Object n6 = obj != null ? new Q.N(Integer.valueOf(i14), o10.f8344b) : Integer.valueOf(i14);
                    int f4 = c2046i.f(n6);
                    boolean z8 = f4 < 0;
                    Object obj2 = z8 ? null : c2046i.f24605c[f4];
                    if ((obj2 instanceof List) && (obj2 instanceof Sb.a)) {
                        boolean z10 = obj2 instanceof Sb.c;
                    }
                    if (obj2 != null) {
                        if (obj2 instanceof C2042E) {
                            C2042E c2042e = (C2042E) obj2;
                            c2042e.a(o10);
                            o10 = c2042e;
                        } else {
                            Object[] objArr = u.O.f24630a;
                            C2042E c2042e2 = new C2042E(2);
                            c2042e2.a(obj2);
                            c2042e2.a(o10);
                            o10 = c2042e2;
                            if (z8) {
                                c2046i.f24605c[f4] = o10;
                            } else {
                                int i15 = ~f4;
                                c2046i.f24604b[i15] = n6;
                                c2046i.f24605c[i15] = o10;
                            }
                        }
                    }
                    if (z8) {
                    }
                }
                return new S.a(c2046i);
            case 12:
                C0518u0 c0518u0 = (C0518u0) j13.f36b;
                synchronized (c0518u0.f8543b) {
                    u3 = c0518u0.u();
                    if (((EnumC0507o0) c0518u0.f8558t.getValue()).compareTo(EnumC0507o0.f8475b) <= 0) {
                        Throwable th2 = c0518u0.f8545d;
                        CancellationException cancellationException = new CancellationException("Recomposer shutdown; frame clock awaiter will never resume");
                        cancellationException.initCause(th2);
                        throw cancellationException;
                    }
                }
                if (u3 != null) {
                    ((C0944m) u3).resumeWith(Db.q.f3365a);
                }
                return Db.q.f3365a;
            case 13:
                throw null;
            case 14:
                T0.b bVar = (T0.b) j13.f36b;
                if (((i0.e) bVar.f9198b.getValue()).f18185a != 9205357640488583168L) {
                    C0487e0 c0487e0 = bVar.f9198b;
                    if (!i0.e.d(((i0.e) c0487e0.getValue()).f18185a)) {
                        long j17 = ((i0.e) c0487e0.getValue()).f18185a;
                        throw null;
                    }
                }
                return null;
            case 15:
                Z.b bVar2 = (Z.b) j13.f36b;
                Z.m mVar = bVar2.f12073a;
                Object obj3 = bVar2.f12076d;
                if (obj3 != null) {
                    return mVar.b(bVar2, obj3);
                }
                throw new IllegalArgumentException("Value should be initialized");
            case 16:
                break;
            case 17:
                ((C1229p) j13.f36b).q0();
                return Db.q.f3365a;
            case 18:
                return new m3.c[((InterfaceC1161h[]) j13.f36b).length];
            case 19:
                p0.s sVar = (p0.s) j13.f36b;
                int i16 = sVar.k;
                C0481b0 c0481b0 = sVar.f23030h;
                if (i16 == ((Q.E0) AbstractC0688o.t(c0481b0.f8377b, c0481b0)).f8301c) {
                    c0481b0.e(((Q.E0) AbstractC0688o.t(c0481b0.f8377b, c0481b0)).f8301c + 1);
                }
                return Db.q.f3365a;
            case 20:
                return ((t0.d) j13.f36b).f24419d;
            case 21:
                return ((t0.g) j13.f36b).p0();
            case 22:
                x.O o11 = (x.O) j13.f36b;
                x.i0 i0Var = o11.f25967e;
                o11.f25968f = i0Var != null ? ((Number) i0Var.f26107l.getValue()).longValue() : 0L;
                return Db.q.f3365a;
            case 23:
                ((y.r) j13.f36b).f26514H.invoke();
                return Boolean.TRUE;
            case 24:
                return Boolean.valueOf(((C2281C) j13.f36b).f26397J.t0(7));
            case BlurFactor.DEFAULT_RADIUS /* 25 */:
                y0.w a9 = ((C2331P) j13.f36b).a();
                L l10 = a9.f26620a;
                if (a9.f26618B != ((S.b) l10.o()).f8953a.f8961c) {
                    C2046I c2046i2 = a9.f26625f;
                    Object[] objArr2 = c2046i2.f24605c;
                    long[] jArr3 = c2046i2.f24603a;
                    int length = jArr3.length - 2;
                    if (length >= 0) {
                        int i17 = 0;
                        while (true) {
                            long j18 = jArr3[i17];
                            long[] jArr4 = jArr3;
                            if ((((~j18) << 7) & j18 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i18 = 8 - ((~(i17 - length)) >>> 31);
                                int i19 = 0;
                                while (i19 < i18) {
                                    if ((j18 & 255) < j14) {
                                        i11 = 1;
                                        ((C2348p) objArr2[(i17 << 3) + i19]).f26595d = true;
                                    } else {
                                        i11 = 1;
                                    }
                                    j18 >>= 8;
                                    i19 += i11;
                                    j14 = 128;
                                }
                                i10 = 1;
                                if (i18 != 8) {
                                }
                            } else {
                                i10 = 1;
                            }
                            if (i17 != length) {
                                i17 += i10;
                                jArr3 = jArr4;
                                j14 = 128;
                            }
                        }
                    }
                    if (!l10.q()) {
                        L.S(l10, false, 7);
                    }
                }
                return Db.q.f3365a;
            case 26:
                return ((C) j13.f36b).invoke();
            default:
                Object g = ((ec.d) j13.f36b).g();
                return (C2537I) (g instanceof ec.j ? null : g);
        }
        while (true) {
            C0694u c0694u = (C0694u) j13.f36b;
            synchronized (c0694u.g) {
                try {
                    if (c0694u.f12428c) {
                        j = j15;
                        j10 = j16;
                        c10 = c12;
                    } else {
                        try {
                            c0694u.f12428c = true;
                            try {
                                S.e eVar = c0694u.f12431f;
                                Object[] objArr3 = eVar.f8959a;
                                int i20 = eVar.f8961c;
                                int i21 = 0;
                                while (i21 < i20) {
                                    C0693t c0693t = (C0693t) objArr3[i21];
                                    C2047J c2047j = c0693t.g;
                                    Object[] objArr4 = c2047j.f24610b;
                                    long[] jArr5 = c2047j.f24609a;
                                    int length2 = jArr5.length - i12;
                                    if (length2 >= 0) {
                                        int i22 = 0;
                                        while (true) {
                                            long j19 = jArr5[i22];
                                            j11 = -9187201950435737472L;
                                            if ((((~j19) << c13) & j19 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                int i23 = 8 - ((~(i22 - length2)) >>> 31);
                                                int i24 = 0;
                                                while (i24 < i23) {
                                                    if ((j19 & 255) < 128) {
                                                        jArr2 = jArr5;
                                                        c0693t.f12417a.invoke(objArr4[(i22 << 3) + i24]);
                                                    } else {
                                                        jArr2 = jArr5;
                                                    }
                                                    j19 >>= 8;
                                                    i24++;
                                                    jArr5 = jArr2;
                                                }
                                                jArr = jArr5;
                                                c11 = '\b';
                                                i7 = 1;
                                                j12 = 255;
                                                if (i23 == 8) {
                                                }
                                            } else {
                                                jArr = jArr5;
                                                c11 = '\b';
                                                i7 = 1;
                                                j12 = 255;
                                            }
                                            if (i22 != length2) {
                                                i22 += i7;
                                                jArr5 = jArr;
                                                c13 = 7;
                                            }
                                        }
                                    } else {
                                        c11 = c12;
                                        j11 = j16;
                                        i7 = 1;
                                        j12 = 255;
                                    }
                                    c2047j.b();
                                    i21 += i7;
                                    c12 = c11;
                                    j15 = j12;
                                    j16 = j11;
                                    c13 = 7;
                                    i12 = 2;
                                }
                                j = j15;
                                j10 = j16;
                                c10 = c12;
                                c0694u.f12428c = false;
                            } catch (Throwable th3) {
                                c0694u.f12428c = false;
                                throw th3;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            throw th;
                        }
                    }
                    j13 = this;
                    if (!C0694u.a((C0694u) j13.f36b)) {
                        return Db.q.f3365a;
                    }
                    c12 = c10;
                    j15 = j;
                    j16 = j10;
                    c13 = 7;
                    i12 = 2;
                } catch (Throwable th5) {
                    th = th5;
                }
            }
        }
    }
}
