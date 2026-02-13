package e0;

import A0.j0;
import A9.AbstractC0068b1;
import A9.L2;
import A9.S2;
import B0.C0200s;
import B0.D;
import B0.W0;
import B0.X;
import Db.q;
import H0.n;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import cc.F;
import ec.C1116a;
import g3.C1191j;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.l;
import l2.InterfaceC1462f;
import l2.InterfaceC1479x;
import u.AbstractC2059l;
import u.AbstractC2060m;
import u.C2070x;

/* loaded from: classes.dex */
public final class c implements InterfaceC1462f, View.OnAttachStateChangeListener {

    /* renamed from: A, reason: collision with root package name */
    public W0 f16641A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f16642B;

    /* renamed from: C, reason: collision with root package name */
    public final S2 f16643C;

    /* renamed from: a, reason: collision with root package name */
    public final D f16644a;

    /* renamed from: b, reason: collision with root package name */
    public final C0200s f16645b;

    /* renamed from: c, reason: collision with root package name */
    public D0.c f16646c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f16647d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final long f16648e = 100;

    /* renamed from: f, reason: collision with root package name */
    public EnumC1074a f16649f = EnumC1074a.f16633a;

    /* renamed from: u, reason: collision with root package name */
    public boolean f16650u = true;

    /* renamed from: v, reason: collision with root package name */
    public final ec.d f16651v = Q5.e.a(1, 0, 6);

    /* renamed from: w, reason: collision with root package name */
    public final Handler f16652w = new Handler(Looper.getMainLooper());

    /* renamed from: x, reason: collision with root package name */
    public C2070x f16653x;

    /* renamed from: y, reason: collision with root package name */
    public long f16654y;

    /* renamed from: z, reason: collision with root package name */
    public final C2070x f16655z;

    public c(D d10, C0200s c0200s) {
        this.f16644a = d10;
        this.f16645b = c0200s;
        C2070x c2070x = AbstractC2060m.f24696a;
        l.c(c2070x, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.f16653x = c2070x;
        this.f16655z = new C2070x();
        n a9 = d10.getSemanticsOwner().a();
        l.c(c2070x, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.f16641A = new W0(a9, c2070x);
        this.f16643C = new S2(this, 25);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0059 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x008a -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Jb.c cVar) {
        b bVar;
        int i7;
        C1116a c1116a;
        c cVar2;
        c cVar3;
        Object b2;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i10 = bVar.f16640e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f16640e = i10 - Integer.MIN_VALUE;
                Object obj = bVar.f16638c;
                Ib.a aVar = Ib.a.f5345a;
                i7 = bVar.f16640e;
                if (i7 != 0) {
                    com.bumptech.glide.c.c0(obj);
                    ec.d dVar = this.f16651v;
                    dVar.getClass();
                    c1116a = new C1116a(dVar);
                    cVar2 = this;
                    bVar.f16636a = cVar2;
                    bVar.f16637b = c1116a;
                    bVar.f16640e = 1;
                    b2 = c1116a.b(bVar);
                    if (b2 == aVar) {
                    }
                } else if (i7 == 1) {
                    c1116a = bVar.f16637b;
                    cVar3 = bVar.f16636a;
                    com.bumptech.glide.c.c0(obj);
                    if (((Boolean) obj).booleanValue()) {
                    }
                } else {
                    if (i7 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c1116a = bVar.f16637b;
                    cVar3 = bVar.f16636a;
                    com.bumptech.glide.c.c0(obj);
                    cVar2 = cVar3;
                    bVar.f16636a = cVar2;
                    bVar.f16637b = c1116a;
                    bVar.f16640e = 1;
                    b2 = c1116a.b(bVar);
                    if (b2 == aVar) {
                        return aVar;
                    }
                    cVar3 = cVar2;
                    obj = b2;
                    if (((Boolean) obj).booleanValue()) {
                        return q.f3365a;
                    }
                    c1116a.c();
                    if (cVar3.d()) {
                        cVar3.e();
                    }
                    if (!cVar3.f16642B) {
                        cVar3.f16642B = true;
                        cVar3.f16652w.post(cVar3.f16643C);
                    }
                    bVar.f16636a = cVar3;
                    bVar.f16637b = c1116a;
                    bVar.f16640e = 2;
                    if (F.l(cVar3.f16648e, bVar) == aVar) {
                        return aVar;
                    }
                    cVar2 = cVar3;
                    bVar.f16636a = cVar2;
                    bVar.f16637b = c1116a;
                    bVar.f16640e = 1;
                    b2 = c1116a.b(bVar);
                    if (b2 == aVar) {
                    }
                }
            }
        }
        bVar = new b(this, cVar);
        Object obj2 = bVar.f16638c;
        Ib.a aVar2 = Ib.a.f5345a;
        i7 = bVar.f16640e;
        if (i7 != 0) {
        }
    }

    public final void b(n nVar, Rb.e eVar) {
        nVar.getClass();
        List h10 = n.h(4, nVar);
        int size = h10.size();
        int i7 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = h10.get(i10);
            if (c().a(((n) obj).g)) {
                eVar.invoke(Integer.valueOf(i7), obj);
                i7++;
            }
        }
    }

    public final AbstractC2059l c() {
        if (this.f16650u) {
            this.f16650u = false;
            this.f16653x = X.e(this.f16644a.getSemanticsOwner());
            this.f16654y = System.currentTimeMillis();
        }
        return this.f16653x;
    }

    public final boolean d() {
        return this.f16646c != null;
    }

    public final void e() {
        Object obj;
        AutofillId a9;
        D0.c cVar = this.f16646c;
        if (cVar != null && Build.VERSION.SDK_INT >= 29) {
            ArrayList arrayList = this.f16647d;
            if (arrayList.isEmpty()) {
                return;
            }
            int size = arrayList.size();
            int i7 = 0;
            while (true) {
                obj = cVar.f3147a;
                if (i7 >= size) {
                    break;
                }
                d dVar = (d) arrayList.get(i7);
                int ordinal = dVar.f16658c.ordinal();
                if (ordinal == 0) {
                    C1191j c1191j = dVar.f16659d;
                    if (c1191j != null && Build.VERSION.SDK_INT >= 29) {
                        D0.b.d(L2.h(obj), (ViewStructure) c1191j.f17441b);
                    }
                } else if (ordinal == 1 && (a9 = cVar.a(dVar.f16656a)) != null && Build.VERSION.SDK_INT >= 29) {
                    D0.b.e(L2.h(obj), a9);
                }
                i7++;
            }
            if (Build.VERSION.SDK_INT >= 29) {
                ContentCaptureSession h10 = L2.h(obj);
                D0.a m10 = Y6.b.m(cVar.f3148b);
                Objects.requireNonNull(m10);
                D0.b.g(h10, AbstractC0068b1.i(m10.f3146a), new long[]{Long.MIN_VALUE});
            }
            arrayList.clear();
        }
    }

    public final void f(n nVar, W0 w02) {
        b(nVar, new j0(7, w02, this));
        List h10 = n.h(4, nVar);
        int size = h10.size();
        for (int i7 = 0; i7 < size; i7++) {
            n nVar2 = (n) h10.get(i7);
            if (c().a(nVar2.g)) {
                C2070x c2070x = this.f16655z;
                int i10 = nVar2.g;
                if (c2070x.a(i10)) {
                    Object b2 = c2070x.b(i10);
                    if (b2 == null) {
                        throw X.c.c("node not present in pruned tree before this change");
                    }
                    f(nVar2, (W0) b2);
                } else {
                    continue;
                }
            }
        }
    }

    public final void g(int i7, String str) {
        D0.c cVar;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29 && (cVar = this.f16646c) != null) {
            AutofillId a9 = cVar.a(i7);
            if (a9 == null) {
                throw X.c.c("Invalid content capture ID");
            }
            if (i10 >= 29) {
                D0.b.f(L2.h(cVar.f3147a), a9, str);
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r6v15 android.view.autofill.AutofillId, still in use, count: 2, list:
          (r6v15 android.view.autofill.AutofillId) from 0x0093: IF  (r6v15 android.view.autofill.AutofillId) == (null android.view.autofill.AutofillId)  -> B:22:0x0072 A[HIDDEN]
          (r6v15 android.view.autofill.AutofillId) from 0x009c: PHI (r6v6 android.view.autofill.AutofillId) = (r6v5 android.view.autofill.AutofillId), (r6v15 android.view.autofill.AutofillId) binds: [B:96:0x0096, B:34:0x0093] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:114)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1093)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1093)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(int r22, H0.n r23) {
        /*
            Method dump skipped, instructions count: 474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.c.h(int, H0.n):void");
    }

    public final void i(n nVar) {
        if (d()) {
            this.f16647d.add(new d(nVar.g, this.f16654y, e.f16661b, null));
            List h10 = n.h(4, nVar);
            int size = h10.size();
            for (int i7 = 0; i7 < size; i7++) {
                i((n) h10.get(i7));
            }
        }
    }

    @Override // l2.InterfaceC1462f
    public final void onStart(InterfaceC1479x interfaceC1479x) {
        this.f16646c = (D0.c) this.f16645b.invoke();
        h(-1, this.f16644a.getSemanticsOwner().a());
        e();
    }

    @Override // l2.InterfaceC1462f
    public final void onStop(InterfaceC1479x interfaceC1479x) {
        i(this.f16644a.getSemanticsOwner().a());
        e();
        this.f16646c = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f16652w.removeCallbacks(this.f16643C);
        this.f16646c = null;
    }
}
