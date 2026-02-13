package Q;

import A0.C0005a;
import B0.C0170c0;
import a0.AbstractC0682i;
import a0.AbstractC0688o;
import a0.C0678e;
import a0.C0683j;
import android.util.Log;
import cc.C0943l0;
import cc.C0944m;
import cc.InterfaceC0937i0;
import cc.InterfaceC0942l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import u.C2046I;
import u.C2047J;

/* renamed from: Q.u0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0518u0 extends r {

    /* renamed from: x, reason: collision with root package name */
    public static final fc.b0 f8540x = fc.Q.c(W.b.f10243d);

    /* renamed from: y, reason: collision with root package name */
    public static final AtomicReference f8541y = new AtomicReference(Boolean.FALSE);

    /* renamed from: a, reason: collision with root package name */
    public final C0486e f8542a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f8543b;

    /* renamed from: c, reason: collision with root package name */
    public InterfaceC0937i0 f8544c;

    /* renamed from: d, reason: collision with root package name */
    public Throwable f8545d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f8546e;

    /* renamed from: f, reason: collision with root package name */
    public Object f8547f;
    public C2047J g;

    /* renamed from: h, reason: collision with root package name */
    public final S.e f8548h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f8549i;
    public final ArrayList j;
    public final C2046I k;

    /* renamed from: l, reason: collision with root package name */
    public final q3.l f8550l;

    /* renamed from: m, reason: collision with root package name */
    public final C2046I f8551m;

    /* renamed from: n, reason: collision with root package name */
    public final C2046I f8552n;

    /* renamed from: o, reason: collision with root package name */
    public ArrayList f8553o;

    /* renamed from: p, reason: collision with root package name */
    public LinkedHashSet f8554p;

    /* renamed from: q, reason: collision with root package name */
    public C0944m f8555q;

    /* renamed from: r, reason: collision with root package name */
    public D5.i f8556r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f8557s;

    /* renamed from: t, reason: collision with root package name */
    public final fc.b0 f8558t;

    /* renamed from: u, reason: collision with root package name */
    public final C0943l0 f8559u;

    /* renamed from: v, reason: collision with root package name */
    public final Hb.i f8560v;

    /* renamed from: w, reason: collision with root package name */
    public final S f8561w;

    public C0518u0(Hb.i iVar) {
        C0486e c0486e = new C0486e(new A0.J(this, 12));
        this.f8542a = c0486e;
        this.f8543b = new Object();
        this.f8546e = new ArrayList();
        this.g = new C2047J();
        this.f8548h = new S.e(new C0517u[16]);
        this.f8549i = new ArrayList();
        this.j = new ArrayList();
        this.k = new C2046I();
        this.f8550l = new q3.l(18);
        this.f8551m = new C2046I();
        this.f8552n = new C2046I();
        this.f8558t = fc.Q.c(EnumC0507o0.f8476c);
        new AtomicReference(Y.f.f11045b);
        C0943l0 c0943l0 = new C0943l0((InterfaceC0937i0) iVar.get(cc.B.f14467b));
        c0943l0.invokeOnCompletion(new C0005a(this, 16));
        this.f8559u = c0943l0;
        this.f8560v = iVar.plus(c0486e).plus(c0943l0);
        this.f8561w = new S(9);
    }

    public static final C0517u q(C0518u0 c0518u0, C0517u c0517u, C2047J c2047j) {
        C0678e C2;
        if (c0517u.f8526G.f8439E || c0517u.f8527H) {
            return null;
        }
        LinkedHashSet linkedHashSet = c0518u0.f8554p;
        if (linkedHashSet != null && linkedHashSet.contains(c0517u)) {
            return null;
        }
        C0005a c0005a = new C0005a(c0517u, 17);
        C0170c0 c0170c0 = new C0170c0(17, c0517u, c2047j);
        AbstractC0682i k = AbstractC0688o.k();
        C0678e c0678e = k instanceof C0678e ? (C0678e) k : null;
        if (c0678e == null || (C2 = c0678e.C(c0005a, c0170c0)) == null) {
            throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
        }
        try {
            AbstractC0682i j = C2.j();
            if (c2047j != null) {
                try {
                    if (c2047j.h()) {
                        A0.K k7 = new A0.K(10, c2047j, c0517u);
                        C0506o c0506o = c0517u.f8526G;
                        if (c0506o.f8439E) {
                            AbstractC0508p.c("Preparing a composition while composing is not supported");
                        }
                        c0506o.f8439E = true;
                        try {
                            k7.invoke();
                            c0506o.f8439E = false;
                        } catch (Throwable th) {
                            c0506o.f8439E = false;
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    AbstractC0682i.q(j);
                    throw th2;
                }
            }
            boolean w10 = c0517u.w();
            AbstractC0682i.q(j);
            if (!w10) {
                c0517u = null;
            }
            return c0517u;
        } finally {
            s(C2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0018, code lost:
    
        if (r8.v() != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0078, code lost:
    
        if (r8.v() != false) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean r(C0518u0 c0518u0) {
        boolean z8;
        List x2;
        synchronized (c0518u0.f8543b) {
            z8 = false;
            if (c0518u0.g.g()) {
                if (c0518u0.f8548h.f8961c == 0) {
                }
                z8 = true;
            } else {
                S.h hVar = new S.h(c0518u0.g);
                c0518u0.g = new C2047J();
                synchronized (c0518u0.f8543b) {
                    x2 = c0518u0.x();
                }
                try {
                    int size = x2.size();
                    for (int i7 = 0; i7 < size; i7++) {
                        ((C0517u) x2.get(i7)).x(hVar);
                        if (((EnumC0507o0) c0518u0.f8558t.getValue()).compareTo(EnumC0507o0.f8475b) <= 0) {
                            break;
                        }
                    }
                    synchronized (c0518u0.f8543b) {
                        c0518u0.g = new C2047J();
                    }
                    synchronized (c0518u0.f8543b) {
                        if (c0518u0.u() != null) {
                            throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                        }
                        if (c0518u0.f8548h.f8961c == 0) {
                        }
                        z8 = true;
                    }
                } catch (Throwable th) {
                    synchronized (c0518u0.f8543b) {
                        C2047J c2047j = c0518u0.g;
                        c2047j.getClass();
                        Iterator<E> it = hVar.iterator();
                        while (it.hasNext()) {
                            c2047j.j(it.next());
                        }
                        throw th;
                    }
                }
            }
        }
        return z8;
    }

    public static void s(C0678e c0678e) {
        try {
            if (c0678e.w() instanceof C0683j) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
        } finally {
            c0678e.c();
        }
    }

    public static final void y(ArrayList arrayList, C0518u0 c0518u0, C0517u c0517u) {
        arrayList.clear();
        synchronized (c0518u0.f8543b) {
            Iterator it = c0518u0.j.iterator();
            if (it.hasNext()) {
                ((V) it.next()).getClass();
                throw null;
            }
        }
    }

    public final void A(Throwable th, C0517u c0517u) {
        if (!((Boolean) f8541y.get()).booleanValue() || (th instanceof C0496j)) {
            synchronized (this.f8543b) {
                D5.i iVar = this.f8556r;
                if (iVar != null) {
                    throw ((Throwable) iVar.f3256b);
                }
                this.f8556r = new D5.i(th, 28);
            }
            throw th;
        }
        synchronized (this.f8543b) {
            Log.e("ComposeInternal", "Error was captured in composition while live edit was enabled.", th);
            this.f8549i.clear();
            this.f8548h.g();
            this.g = new C2047J();
            this.j.clear();
            this.k.a();
            this.f8551m.a();
            this.f8556r = new D5.i(th, 28);
            if (c0517u != null) {
                B(c0517u);
            }
            u();
        }
    }

    public final void B(C0517u c0517u) {
        ArrayList arrayList = this.f8553o;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f8553o = arrayList;
        }
        if (!arrayList.contains(c0517u)) {
            arrayList.add(c0517u);
        }
        if (this.f8546e.remove(c0517u)) {
            this.f8547f = null;
        }
    }

    @Override // Q.r
    public final void a(C0517u c0517u, Y.e eVar) {
        C0678e C2;
        boolean z8 = c0517u.f8526G.f8439E;
        try {
            C0005a c0005a = new C0005a(c0517u, 17);
            C0170c0 c0170c0 = new C0170c0(17, c0517u, (Object) null);
            AbstractC0682i k = AbstractC0688o.k();
            C0678e c0678e = k instanceof C0678e ? (C0678e) k : null;
            if (c0678e == null || (C2 = c0678e.C(c0005a, c0170c0)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                AbstractC0682i j = C2.j();
                try {
                    c0517u.i(eVar);
                    if (!z8) {
                        AbstractC0688o.k().m();
                    }
                    synchronized (this.f8543b) {
                        if (((EnumC0507o0) this.f8558t.getValue()).compareTo(EnumC0507o0.f8475b) > 0 && !x().contains(c0517u)) {
                            this.f8546e.add(c0517u);
                            this.f8547f = null;
                        }
                    }
                    try {
                        synchronized (this.f8543b) {
                            ArrayList arrayList = this.j;
                            if (arrayList.size() > 0) {
                                ((V) arrayList.get(0)).getClass();
                                throw null;
                            }
                        }
                        try {
                            c0517u.d();
                            c0517u.f();
                            if (z8) {
                                return;
                            }
                            AbstractC0688o.k().m();
                        } catch (Throwable th) {
                            A(th, null);
                        }
                    } catch (Throwable th2) {
                        A(th2, c0517u);
                    }
                } finally {
                    AbstractC0682i.q(j);
                }
            } finally {
                s(C2);
            }
        } catch (Throwable th3) {
            A(th3, c0517u);
        }
    }

    @Override // Q.r
    public final boolean c() {
        return ((Boolean) f8541y.get()).booleanValue();
    }

    @Override // Q.r
    public final boolean d() {
        return false;
    }

    @Override // Q.r
    public final boolean e() {
        return false;
    }

    @Override // Q.r
    public final int g() {
        return 1000;
    }

    @Override // Q.r
    public final Hb.i h() {
        return this.f8560v;
    }

    @Override // Q.r
    public final void i(C0517u c0517u) {
        InterfaceC0942l interfaceC0942l;
        synchronized (this.f8543b) {
            if (this.f8548h.h(c0517u)) {
                interfaceC0942l = null;
            } else {
                this.f8548h.b(c0517u);
                interfaceC0942l = u();
            }
        }
        if (interfaceC0942l != null) {
            ((C0944m) interfaceC0942l).resumeWith(Db.q.f3365a);
        }
    }

    @Override // Q.r
    public final U j(V v10) {
        U u3;
        synchronized (this.f8543b) {
            u3 = (U) this.f8551m.j(v10);
        }
        return u3;
    }

    @Override // Q.r
    public final void k(Set set) {
    }

    @Override // Q.r
    public final void m(C0517u c0517u) {
        synchronized (this.f8543b) {
            try {
                LinkedHashSet linkedHashSet = this.f8554p;
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                    this.f8554p = linkedHashSet;
                }
                linkedHashSet.add(c0517u);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // Q.r
    public final void p(C0517u c0517u) {
        synchronized (this.f8543b) {
            if (this.f8546e.remove(c0517u)) {
                this.f8547f = null;
            }
            this.f8548h.k(c0517u);
            this.f8549i.remove(c0517u);
        }
    }

    public final void t() {
        synchronized (this.f8543b) {
            if (((EnumC0507o0) this.f8558t.getValue()).compareTo(EnumC0507o0.f8478e) >= 0) {
                fc.b0 b0Var = this.f8558t;
                EnumC0507o0 enumC0507o0 = EnumC0507o0.f8475b;
                b0Var.getClass();
                b0Var.j(null, enumC0507o0);
            }
        }
        this.f8559u.cancel(null);
    }

    public final InterfaceC0942l u() {
        EnumC0507o0 enumC0507o0;
        fc.b0 b0Var = this.f8558t;
        int compareTo = ((EnumC0507o0) b0Var.getValue()).compareTo(EnumC0507o0.f8475b);
        ArrayList arrayList = this.j;
        ArrayList arrayList2 = this.f8549i;
        S.e eVar = this.f8548h;
        if (compareTo <= 0) {
            this.f8546e.clear();
            this.f8547f = Eb.v.f3891a;
            this.g = new C2047J();
            eVar.g();
            arrayList2.clear();
            arrayList.clear();
            this.f8553o = null;
            C0944m c0944m = this.f8555q;
            if (c0944m != null) {
                c0944m.d(null);
            }
            this.f8555q = null;
            this.f8556r = null;
            return null;
        }
        if (this.f8556r != null) {
            enumC0507o0 = EnumC0507o0.f8476c;
        } else if (this.f8544c == null) {
            this.g = new C2047J();
            eVar.g();
            enumC0507o0 = v() ? EnumC0507o0.f8477d : EnumC0507o0.f8476c;
        } else {
            enumC0507o0 = (eVar.f8961c == 0 && !this.g.h() && arrayList2.isEmpty() && arrayList.isEmpty() && !v()) ? EnumC0507o0.f8478e : EnumC0507o0.f8479f;
        }
        b0Var.getClass();
        b0Var.j(null, enumC0507o0);
        if (enumC0507o0 != EnumC0507o0.f8479f) {
            return null;
        }
        C0944m c0944m2 = this.f8555q;
        this.f8555q = null;
        return c0944m2;
    }

    public final boolean v() {
        return (this.f8557s || this.f8542a.f8386f.get() == 0) ? false : true;
    }

    public final boolean w() {
        boolean z8;
        synchronized (this.f8543b) {
            if (!this.g.h() && this.f8548h.f8961c == 0) {
                z8 = v();
            }
        }
        return z8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    public final List x() {
        Object obj = this.f8547f;
        ?? r02 = obj;
        if (obj == null) {
            ArrayList arrayList = this.f8546e;
            RandomAccess arrayList2 = arrayList.isEmpty() ? Eb.v.f3891a : new ArrayList(arrayList);
            this.f8547f = arrayList2;
            r02 = arrayList2;
        }
        return r02;
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x013e, code lost:
    
        r3 = r10.size();
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0143, code lost:
    
        if (r4 >= r3) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x014d, code lost:
    
        if (((Db.j) r10.get(r4)).f3355b == null) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x014f, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0152, code lost:
    
        r3 = new java.util.ArrayList(r10.size());
        r4 = r10.size();
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0160, code lost:
    
        if (r8 >= r4) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0162, code lost:
    
        r11 = (Db.j) r10.get(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x016a, code lost:
    
        if (r11.f3355b != null) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x016c, code lost:
    
        r11 = (Q.V) r11.f3354a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0173, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0176, code lost:
    
        r4 = r17.f8543b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0178, code lost:
    
        monitor-enter(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0179, code lost:
    
        Eb.o.U(r17.j, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x017e, code lost:
    
        monitor-exit(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x017f, code lost:
    
        r3 = new java.util.ArrayList(r10.size());
        r4 = r10.size();
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x018d, code lost:
    
        if (r8 >= r4) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x018f, code lost:
    
        r11 = r10.get(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0198, code lost:
    
        if (((Db.j) r11).f3355b == null) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x019a, code lost:
    
        r3.add(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x019d, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01a0, code lost:
    
        r10 = r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List z(List list, C2047J c2047j) {
        C0678e C2;
        ArrayList arrayList;
        HashMap hashMap = new HashMap(list.size());
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            Object obj = list.get(i7);
            ((V) obj).getClass();
            Object obj2 = hashMap.get(null);
            if (obj2 == null) {
                obj2 = new ArrayList();
                hashMap.put(null, obj2);
            }
            ((ArrayList) obj2).add(obj);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            C0517u c0517u = (C0517u) entry.getKey();
            List list2 = (List) entry.getValue();
            if (c0517u.f8526G.f8439E) {
                AbstractC0508p.c("Check failed");
            }
            C0005a c0005a = new C0005a(c0517u, 17);
            C0170c0 c0170c0 = new C0170c0(17, c0517u, c2047j);
            AbstractC0682i k = AbstractC0688o.k();
            C0678e c0678e = k instanceof C0678e ? (C0678e) k : null;
            if (c0678e == null || (C2 = c0678e.C(c0005a, c0170c0)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                AbstractC0682i j = C2.j();
                try {
                    synchronized (this.f8543b) {
                        try {
                            arrayList = new ArrayList(list2.size());
                            int size2 = list2.size();
                            for (int i10 = 0; i10 < size2; i10++) {
                                V v10 = (V) list2.get(i10);
                                C2046I c2046i = this.k;
                                v10.getClass();
                                Object a9 = S.a.a(c2046i);
                                arrayList.add(new Db.j(v10, a9));
                            }
                            int size3 = arrayList.size();
                            int i11 = 0;
                            while (true) {
                                if (i11 >= size3) {
                                    break;
                                }
                                Db.j jVar = (Db.j) arrayList.get(i11);
                                if (jVar.f3355b == null) {
                                    q3.l lVar = this.f8550l;
                                    ((V) jVar.f3354a).getClass();
                                    if (((C2046I) lVar.f23391b).b(null)) {
                                        ArrayList arrayList2 = new ArrayList(Eb.p.S(arrayList, 10));
                                        Iterator it = arrayList.iterator();
                                        while (it.hasNext()) {
                                            Db.j jVar2 = (Db.j) it.next();
                                            if (jVar2.f3355b == null) {
                                                q3.l lVar2 = this.f8550l;
                                                ((V) jVar2.f3354a).getClass();
                                                C2046I c2046i2 = (C2046I) lVar2.f23391b;
                                                if (c2046i2.i()) {
                                                    ((C2046I) lVar2.f23392c).a();
                                                }
                                            }
                                            arrayList2.add(jVar2);
                                        }
                                        arrayList = arrayList2;
                                    }
                                }
                                i11++;
                            }
                        } finally {
                        }
                    }
                    int size4 = arrayList.size();
                    int i12 = 0;
                    while (true) {
                        if (i12 >= size4) {
                            break;
                        }
                        if (((Db.j) arrayList.get(i12)).f3355b != null) {
                            break;
                        }
                        i12++;
                    }
                    c0517u.p(arrayList);
                    AbstractC0682i.q(j);
                } catch (Throwable th) {
                    AbstractC0682i.q(j);
                    throw th;
                }
            } finally {
                s(C2);
            }
        }
        return Eb.o.s0(hashMap.keySet());
    }
}
