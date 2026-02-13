package B0;

import A0.C0005a;
import C.C0216a;
import I2.C0330t;
import Q.C0484d;
import Q.C0486e;
import Q.C0517u;
import Q.C0518u0;
import Q.EnumC0507o0;
import a.AbstractC0672a;
import a0.C0691r;
import android.content.Context;
import android.graphics.Typeface;
import android.view.Choreographer;
import android.view.MotionEvent;
import android.view.View;
import cc.C0944m;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.kt.apps.core.utils.blurry.BlurFactor;
import g3.C1191j;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import l2.C1481z;
import l2.EnumC1474s;
import u.C2047J;
import u.C2066t;
import u0.C2086p;
import u0.EnumC2084n;
import y0.AbstractC2322G;
import y0.AbstractC2323H;
import y1.AbstractC2352B;

/* renamed from: B0.c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0170c0 extends kotlin.jvm.internal.m implements Rb.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1863a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1864b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1865c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0170c0(int i7, Object obj, Object obj2) {
        super(1);
        this.f1863a = i7;
        this.f1864b = obj;
        this.f1865c = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0170c0(ArrayList arrayList, List list, boolean z8) {
        super(1);
        this.f1863a = 7;
        this.f1864b = arrayList;
        this.f1865c = list;
    }

    private final Object b(Object obj) {
        Throwable th = (Throwable) obj;
        C0518u0 c0518u0 = (C0518u0) this.f1864b;
        Object obj2 = c0518u0.f8543b;
        Throwable th2 = (Throwable) this.f1865c;
        synchronized (obj2) {
            if (th2 == null) {
                th2 = null;
            } else if (th != null) {
                try {
                    if (th instanceof CancellationException) {
                        th = null;
                    }
                    if (th != null) {
                        AbstractC0672a.c(th2, th);
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            c0518u0.f8545d = th2;
            fc.b0 b0Var = c0518u0.f8558t;
            EnumC0507o0 enumC0507o0 = EnumC0507o0.f8474a;
            b0Var.getClass();
            b0Var.j(null, enumC0507o0);
        }
        return Db.q.f3365a;
    }

    /* JADX WARN: Removed duplicated region for block: B:97:0x01ef A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01f0  */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.util.List, java.util.Collection, java.lang.Object] */
    @Override // Rb.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        Db.q qVar;
        Db.q qVar2;
        Typeface e2;
        N0.s sVar = null;
        int i7 = 0;
        char c10 = 1;
        char c11 = 1;
        switch (this.f1863a) {
            case 0:
                Context context = (Context) this.f1864b;
                Context applicationContext = context.getApplicationContext();
                ComponentCallbacks2C0172d0 componentCallbacks2C0172d0 = (ComponentCallbacks2C0172d0) this.f1865c;
                applicationContext.registerComponentCallbacks(componentCallbacks2C0172d0);
                return new C0168b0(i7, context, componentCallbacks2C0172d0);
            case 1:
                Context context2 = (Context) this.f1864b;
                Context applicationContext2 = context2.getApplicationContext();
                ComponentCallbacks2C0174e0 componentCallbacks2C0174e0 = (ComponentCallbacks2C0174e0) this.f1865c;
                applicationContext2.registerComponentCallbacks(componentCallbacks2C0174e0);
                return new C0168b0(c10 == true ? 1 : 0, context2, componentCallbacks2C0174e0);
            case 2:
                C0182i0 c0182i0 = (C0182i0) this.f1864b;
                ChoreographerFrameCallbackC0184j0 choreographerFrameCallbackC0184j0 = (ChoreographerFrameCallbackC0184j0) this.f1865c;
                synchronized (c0182i0.f1913e) {
                    c0182i0.f1915u.remove(choreographerFrameCallbackC0184j0);
                }
                return Db.q.f3365a;
            case 3:
                ((Choreographer) ((C0186k0) this.f1864b).f1926b).removeFrameCallback((ChoreographerFrameCallbackC0184j0) this.f1865c);
                return Db.q.f3365a;
            case 4:
                C0195p c0195p = (C0195p) obj;
                y1 y1Var = (y1) this.f1864b;
                if (!y1Var.f2023c) {
                    C1481z w10 = c0195p.f1943a.w();
                    Y.e eVar = (Y.e) this.f1865c;
                    y1Var.f2025e = eVar;
                    if (y1Var.f2024d == null) {
                        y1Var.f2024d = w10;
                        w10.a(y1Var);
                    } else if (w10.f19242d.compareTo(EnumC1474s.f19229c) >= 0) {
                        y1Var.f2022b.j(new Y.e(-2000640158, new x1(y1Var, eVar, c11 == true ? 1 : 0), true));
                    }
                }
                return Db.q.f3365a;
            case 5:
                C.P p10 = (C.P) this.f1864b;
                int i10 = p10.f2385s;
                View view = (View) this.f1865c;
                if (i10 == 0) {
                    WeakHashMap weakHashMap = y1.K.f26642a;
                    C.A a9 = p10.f2386t;
                    AbstractC2352B.l(view, a9);
                    if (view.isAttachedToWindow()) {
                        view.requestApplyInsets();
                    }
                    view.addOnAttachStateChangeListener(a9);
                    y1.K.p(view, a9);
                }
                p10.f2385s++;
                return new C0168b0(2, p10, view);
            case 6:
                Throwable th = (Throwable) obj;
                a1.i iVar = (a1.i) this.f1864b;
                if (th == null) {
                    iVar.a(((cc.J) this.f1865c).x());
                } else if (th instanceof CancellationException) {
                    iVar.f12474d = true;
                    a1.l lVar = iVar.f12472b;
                    if (lVar != null && lVar.f12477b.cancel(true)) {
                        iVar.f12471a = null;
                        iVar.f12472b = null;
                        iVar.f12473c = null;
                    }
                } else {
                    iVar.b(th);
                }
                return Db.q.f3365a;
            case 7:
                AbstractC2322G abstractC2322G = (AbstractC2322G) obj;
                ArrayList arrayList = (ArrayList) this.f1864b;
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((E.t) arrayList.get(i11)).b(abstractC2322G);
                }
                ?? r02 = this.f1865c;
                int size2 = r02.size();
                while (i7 < size2) {
                    ((E.t) r02.get(i7)).b(abstractC2322G);
                    i7++;
                }
                return Db.q.f3365a;
            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                return new F.N((Z.j) this.f1864b, (Map) obj, (Z.g) this.f1865c);
            case 9:
                F.N n6 = (F.N) this.f1864b;
                C2047J c2047j = n6.f3928c;
                Object obj2 = this.f1865c;
                c2047j.i(obj2);
                return new C0168b0(3, n6, obj2);
            case 10:
                Throwable th2 = (Throwable) obj;
                ((C0005a) this.f1864b).invoke(th2);
                r8.o oVar = (r8.o) this.f1865c;
                ((ec.d) oVar.f23859d).k(false, th2);
                do {
                    Object g = ((ec.d) oVar.f23859d).g();
                    if (g instanceof ec.j) {
                        g = null;
                    }
                    qVar = Db.q.f3365a;
                    if (g != null) {
                        M1.M.f6606a.invoke(g, th2);
                        qVar2 = qVar;
                    } else {
                        qVar2 = null;
                    }
                } while (qVar2 != null);
                return qVar;
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                ((O.b) this.f1864b).f7408a.setValue(new C.x((C0216a) this.f1865c, (C.O) obj));
                return Db.q.f3365a;
            case 12:
                N0.e eVar2 = (N0.e) this.f1864b;
                eVar2.f7133d.getClass();
                N0.r rVar = (N0.r) this.f1865c;
                C1191j c1191j = eVar2.f7134e;
                c1191j.getClass();
                N0.q qVar3 = rVar.f7148a;
                boolean z8 = qVar3 != null ? qVar3 instanceof N0.b : true;
                N0.p pVar = (N0.p) c1191j.f17441b;
                int i12 = rVar.f7150c;
                N0.k kVar = rVar.f7149b;
                if (!z8) {
                    if (qVar3 instanceof N0.m) {
                        e2 = pVar.e((N0.m) qVar3, kVar, i12);
                    }
                    if (sVar == null) {
                        return sVar;
                    }
                    throw new IllegalStateException("Could not load font");
                }
                e2 = pVar.q(kVar, i12);
                sVar = new N0.s(e2, 0);
                if (sVar == null) {
                }
            case 13:
                N0.s sVar2 = (N0.s) obj;
                q3.l lVar2 = (q3.l) this.f1864b;
                Hc.e eVar3 = (Hc.e) lVar2.f23391b;
                N0.r rVar2 = (N0.r) this.f1865c;
                synchronized (eVar3) {
                    try {
                        if (sVar2.f7154b) {
                            ((C2066t) lVar2.f23392c).put(rVar2, sVar2);
                        } else {
                            ((C2066t) lVar2.f23392c).remove(rVar2);
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                return Db.q.f3365a;
            case 14:
                C0486e c0486e = (C0486e) this.f1864b;
                Object obj3 = c0486e.f8382b;
                C0484d c0484d = (C0484d) this.f1865c;
                synchronized (obj3) {
                    c0486e.f8384d.remove(c0484d);
                    if (c0486e.f8384d.isEmpty()) {
                        c0486e.f8386f.set(0);
                    }
                }
                return Db.q.f3365a;
            case 15:
                C0330t c0330t = (C0330t) this.f1864b;
                Object obj4 = c0330t.f5200b;
                C0944m c0944m = (C0944m) this.f1865c;
                synchronized (obj4) {
                    ((ArrayList) c0330t.f5201c).remove(c0944m);
                }
                return Db.q.f3365a;
            case 16:
                return b(obj);
            case 17:
                ((C0517u) this.f1864b).z(obj);
                C2047J c2047j2 = (C2047J) this.f1865c;
                if (c2047j2 != null) {
                    c2047j2.a(obj);
                }
                return Db.q.f3365a;
            case 18:
                ((A0.L) this.f1864b).Y(((c0.m) obj).c((c0.m) this.f1865c));
                return Db.q.f3365a;
            case 19:
                ((AbstractC2322G) obj).d((AbstractC2323H) this.f1864b, 0, 0, ((c0.q) this.f1865c).f14127C);
                return Db.q.f3365a;
            case 20:
                ((dc.d) this.f1864b).f16628c.removeCallbacks((E5.k) this.f1865c);
                return Db.q.f3365a;
            case 21:
                Throwable th4 = (Throwable) obj;
                if (th4 instanceof i3.r) {
                    ((h3.y) this.f1864b).f17720c.compareAndSet(-256, ((i3.r) th4).f18386a);
                }
                ((R6.a) this.f1865c).cancel(false);
                return Db.q.f3365a;
            case 22:
                AbstractC2322G.i((AbstractC2322G) obj, (AbstractC2323H) this.f1864b, ((j0.j) this.f1865c).f18546C);
                return Db.q.f3365a;
            case 23:
                AbstractC2322G.i((AbstractC2322G) obj, (AbstractC2323H) this.f1864b, ((j0.E) this.f1865c).f18524M);
                return Db.q.f3365a;
            case 24:
                m3.c it = (m3.c) obj;
                kotlin.jvm.internal.l.e(it, "it");
                ((cc.D0) this.f1864b).cancel(null);
                ((ec.q) ((ec.r) this.f1865c)).h(it);
                return Db.q.f3365a;
            case BlurFactor.DEFAULT_RADIUS /* 25 */:
                MotionEvent motionEvent = (MotionEvent) obj;
                int actionMasked = motionEvent.getActionMasked();
                C2086p c2086p = (C2086p) this.f1865c;
                if (actionMasked == 0) {
                    Y0.d dVar = c2086p.f24792a;
                    if (dVar == null) {
                        kotlin.jvm.internal.l.j("onTouchEvent");
                        throw null;
                    }
                    ((l2.X) this.f1864b).f19195c = ((Boolean) dVar.invoke(motionEvent)).booleanValue() ? EnumC2084n.f24787b : EnumC2084n.f24788c;
                } else {
                    Y0.d dVar2 = c2086p.f24792a;
                    if (dVar2 == null) {
                        kotlin.jvm.internal.l.j("onTouchEvent");
                        throw null;
                    }
                    dVar2.invoke(motionEvent);
                }
                return Db.q.f3365a;
            case 26:
                ((AbstractC2322G) obj).d((AbstractC2323H) this.f1864b, 0, 0, ((w.w) this.f1865c).f25623c.e());
                return Db.q.f3365a;
            case 27:
                cc.F.B((cc.E) this.f1864b, null, 4, new x.g0((x.i0) this.f1865c, null), 1);
                return new Object();
            case 28:
                x.i0 i0Var = (x.i0) this.f1864b;
                C0691r c0691r = i0Var.j;
                x.i0 i0Var2 = (x.i0) this.f1865c;
                c0691r.add(i0Var2);
                return new C0168b0(6, i0Var, i0Var2);
            default:
                return new C0168b0(7, (x.i0) this.f1864b, (x.b0) this.f1865c);
        }
    }
}
