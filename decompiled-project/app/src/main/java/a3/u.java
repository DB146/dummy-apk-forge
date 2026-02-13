package a3;

import A9.C0076d1;
import Y5.C0660y;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import u.C2052e;
import u.T;
import y1.AbstractC2352B;

/* loaded from: classes.dex */
public abstract class u implements Cloneable {

    /* renamed from: O, reason: collision with root package name */
    public static final Animator[] f12570O = new Animator[0];

    /* renamed from: P, reason: collision with root package name */
    public static final int[] f12571P = {2, 1, 3, 4};

    /* renamed from: Q, reason: collision with root package name */
    public static final C0660y f12572Q = new C0660y(7);

    /* renamed from: R, reason: collision with root package name */
    public static final ThreadLocal f12573R = new ThreadLocal();

    /* renamed from: A, reason: collision with root package name */
    public s[] f12574A;

    /* renamed from: J, reason: collision with root package name */
    public Z9.x f12583J;
    public long L;

    /* renamed from: M, reason: collision with root package name */
    public r f12585M;

    /* renamed from: N, reason: collision with root package name */
    public long f12586N;

    /* renamed from: y, reason: collision with root package name */
    public ArrayList f12597y;

    /* renamed from: z, reason: collision with root package name */
    public ArrayList f12598z;

    /* renamed from: a, reason: collision with root package name */
    public final String f12587a = getClass().getName();

    /* renamed from: b, reason: collision with root package name */
    public long f12588b = -1;

    /* renamed from: c, reason: collision with root package name */
    public long f12589c = -1;

    /* renamed from: d, reason: collision with root package name */
    public TimeInterpolator f12590d = null;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f12591e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f12592f = new ArrayList();

    /* renamed from: u, reason: collision with root package name */
    public q3.n f12593u = new q3.n(6);

    /* renamed from: v, reason: collision with root package name */
    public q3.n f12594v = new q3.n(6);

    /* renamed from: w, reason: collision with root package name */
    public C0709A f12595w = null;

    /* renamed from: x, reason: collision with root package name */
    public final int[] f12596x = f12571P;

    /* renamed from: B, reason: collision with root package name */
    public final ArrayList f12575B = new ArrayList();

    /* renamed from: C, reason: collision with root package name */
    public Animator[] f12576C = f12570O;

    /* renamed from: D, reason: collision with root package name */
    public int f12577D = 0;

    /* renamed from: E, reason: collision with root package name */
    public boolean f12578E = false;

    /* renamed from: F, reason: collision with root package name */
    public boolean f12579F = false;

    /* renamed from: G, reason: collision with root package name */
    public u f12580G = null;

    /* renamed from: H, reason: collision with root package name */
    public ArrayList f12581H = null;

    /* renamed from: I, reason: collision with root package name */
    public ArrayList f12582I = new ArrayList();

    /* renamed from: K, reason: collision with root package name */
    public C0660y f12584K = f12572Q;

    public static void c(q3.n nVar, View view, C0712D c0712d) {
        ((C2052e) nVar.f23396b).put(view, c0712d);
        int id = view.getId();
        if (id >= 0) {
            SparseArray sparseArray = (SparseArray) nVar.f23397c;
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        WeakHashMap weakHashMap = y1.K.f26642a;
        String f4 = AbstractC2352B.f(view);
        if (f4 != null) {
            C2052e c2052e = (C2052e) nVar.f23399e;
            if (c2052e.containsKey(f4)) {
                c2052e.put(f4, null);
            } else {
                c2052e.put(f4, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                u.r rVar = (u.r) nVar.f23398d;
                if (rVar.c(itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    rVar.e(view, itemIdAtPosition);
                    return;
                }
                View view2 = (View) rVar.b(itemIdAtPosition);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    rVar.e(null, itemIdAtPosition);
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [u.T, java.lang.Object, u.e] */
    public static C2052e q() {
        ThreadLocal threadLocal = f12573R;
        C2052e c2052e = (C2052e) threadLocal.get();
        if (c2052e != null) {
            return c2052e;
        }
        ?? t5 = new T(0);
        threadLocal.set(t5);
        return t5;
    }

    public static boolean x(C0712D c0712d, C0712D c0712d2, String str) {
        Object obj = c0712d.f12498a.get(str);
        Object obj2 = c0712d2.f12498a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public void A() {
        C2052e q10 = q();
        this.L = 0L;
        for (int i7 = 0; i7 < this.f12582I.size(); i7++) {
            Animator animator = (Animator) this.f12582I.get(i7);
            C0738o c0738o = (C0738o) q10.get(animator);
            if (animator != null && c0738o != null) {
                long j = this.f12589c;
                Animator animator2 = c0738o.f12557f;
                if (j >= 0) {
                    animator2.setDuration(j);
                }
                long j10 = this.f12588b;
                if (j10 >= 0) {
                    animator2.setStartDelay(animator2.getStartDelay() + j10);
                }
                TimeInterpolator timeInterpolator = this.f12590d;
                if (timeInterpolator != null) {
                    animator2.setInterpolator(timeInterpolator);
                }
                this.f12575B.add(animator);
                this.L = Math.max(this.L, AbstractC0739p.a(animator));
            }
        }
        this.f12582I.clear();
    }

    public u B(s sVar) {
        u uVar;
        ArrayList arrayList = this.f12581H;
        if (arrayList == null) {
            return this;
        }
        if (!arrayList.remove(sVar) && (uVar = this.f12580G) != null) {
            uVar.B(sVar);
        }
        if (this.f12581H.size() == 0) {
            this.f12581H = null;
        }
        return this;
    }

    public void C(View view) {
        this.f12592f.remove(view);
    }

    public void D(View view) {
        if (this.f12578E) {
            if (!this.f12579F) {
                ArrayList arrayList = this.f12575B;
                int size = arrayList.size();
                Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f12576C);
                this.f12576C = f12570O;
                for (int i7 = size - 1; i7 >= 0; i7--) {
                    Animator animator = animatorArr[i7];
                    animatorArr[i7] = null;
                    animator.resume();
                }
                this.f12576C = animatorArr;
                y(this, t.f12569p, false);
            }
            this.f12578E = false;
        }
    }

    public void E() {
        M();
        C2052e q10 = q();
        Iterator it = this.f12582I.iterator();
        while (it.hasNext()) {
            Animator animator = (Animator) it.next();
            if (q10.containsKey(animator)) {
                M();
                if (animator != null) {
                    animator.addListener(new C0737n(this, q10));
                    long j = this.f12589c;
                    if (j >= 0) {
                        animator.setDuration(j);
                    }
                    long j10 = this.f12588b;
                    if (j10 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j10);
                    }
                    TimeInterpolator timeInterpolator = this.f12590d;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new C0076d1(this, 4));
                    animator.start();
                }
            }
        }
        this.f12582I.clear();
        n();
    }

    public void F(long j, long j10) {
        long j11 = this.L;
        boolean z8 = j < j10;
        if ((j10 < 0 && j >= 0) || (j10 > j11 && j <= j11)) {
            this.f12579F = false;
            y(this, t.f12565l, z8);
        }
        ArrayList arrayList = this.f12575B;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f12576C);
        this.f12576C = f12570O;
        for (int i7 = 0; i7 < size; i7++) {
            Animator animator = animatorArr[i7];
            animatorArr[i7] = null;
            AbstractC0739p.b(animator, Math.min(Math.max(0L, j), AbstractC0739p.a(animator)));
        }
        this.f12576C = animatorArr;
        if ((j <= j11 || j10 > j11) && (j >= 0 || j10 < 0)) {
            return;
        }
        if (j > j11) {
            this.f12579F = true;
        }
        y(this, t.f12566m, z8);
    }

    public void G(long j) {
        this.f12589c = j;
    }

    public void H(Z9.x xVar) {
        this.f12583J = xVar;
    }

    public void I(TimeInterpolator timeInterpolator) {
        this.f12590d = timeInterpolator;
    }

    public void J(C0660y c0660y) {
        if (c0660y == null) {
            this.f12584K = f12572Q;
        } else {
            this.f12584K = c0660y;
        }
    }

    public void K() {
    }

    public void L(long j) {
        this.f12588b = j;
    }

    public final void M() {
        if (this.f12577D == 0) {
            y(this, t.f12565l, false);
            this.f12579F = false;
        }
        this.f12577D++;
    }

    public String N(String str) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(getClass().getSimpleName());
        sb2.append("@");
        sb2.append(Integer.toHexString(hashCode()));
        sb2.append(": ");
        if (this.f12589c != -1) {
            sb2.append("dur(");
            sb2.append(this.f12589c);
            sb2.append(") ");
        }
        if (this.f12588b != -1) {
            sb2.append("dly(");
            sb2.append(this.f12588b);
            sb2.append(") ");
        }
        if (this.f12590d != null) {
            sb2.append("interp(");
            sb2.append(this.f12590d);
            sb2.append(") ");
        }
        ArrayList arrayList = this.f12591e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f12592f;
        if (size > 0 || arrayList2.size() > 0) {
            sb2.append("tgts(");
            if (arrayList.size() > 0) {
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    if (i7 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(arrayList.get(i7));
                }
            }
            if (arrayList2.size() > 0) {
                for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                    if (i10 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(arrayList2.get(i10));
                }
            }
            sb2.append(")");
        }
        return sb2.toString();
    }

    public void a(s sVar) {
        if (this.f12581H == null) {
            this.f12581H = new ArrayList();
        }
        this.f12581H.add(sVar);
    }

    public void b(View view) {
        this.f12592f.add(view);
    }

    public void d() {
        ArrayList arrayList = this.f12575B;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f12576C);
        this.f12576C = f12570O;
        for (int i7 = size - 1; i7 >= 0; i7--) {
            Animator animator = animatorArr[i7];
            animatorArr[i7] = null;
            animator.cancel();
        }
        this.f12576C = animatorArr;
        y(this, t.f12567n, false);
    }

    public abstract void e(C0712D c0712d);

    public final void f(View view, boolean z8) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            C0712D c0712d = new C0712D(view);
            if (z8) {
                h(c0712d);
            } else {
                e(c0712d);
            }
            c0712d.f12500c.add(this);
            g(c0712d);
            if (z8) {
                c(this.f12593u, view, c0712d);
            } else {
                c(this.f12594v, view, c0712d);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
                f(viewGroup.getChildAt(i7), z8);
            }
        }
    }

    public void g(C0712D c0712d) {
    }

    public abstract void h(C0712D c0712d);

    public final void i(ViewGroup viewGroup, boolean z8) {
        j(z8);
        ArrayList arrayList = this.f12591e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f12592f;
        if (size <= 0 && arrayList2.size() <= 0) {
            f(viewGroup, z8);
            return;
        }
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            View findViewById = viewGroup.findViewById(((Integer) arrayList.get(i7)).intValue());
            if (findViewById != null) {
                C0712D c0712d = new C0712D(findViewById);
                if (z8) {
                    h(c0712d);
                } else {
                    e(c0712d);
                }
                c0712d.f12500c.add(this);
                g(c0712d);
                if (z8) {
                    c(this.f12593u, findViewById, c0712d);
                } else {
                    c(this.f12594v, findViewById, c0712d);
                }
            }
        }
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            View view = (View) arrayList2.get(i10);
            C0712D c0712d2 = new C0712D(view);
            if (z8) {
                h(c0712d2);
            } else {
                e(c0712d2);
            }
            c0712d2.f12500c.add(this);
            g(c0712d2);
            if (z8) {
                c(this.f12593u, view, c0712d2);
            } else {
                c(this.f12594v, view, c0712d2);
            }
        }
    }

    public final void j(boolean z8) {
        if (z8) {
            ((C2052e) this.f12593u.f23396b).clear();
            ((SparseArray) this.f12593u.f23397c).clear();
            ((u.r) this.f12593u.f23398d).a();
        } else {
            ((C2052e) this.f12594v.f23396b).clear();
            ((SparseArray) this.f12594v.f23397c).clear();
            ((u.r) this.f12594v.f23398d).a();
        }
    }

    @Override // 
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public u clone() {
        try {
            u uVar = (u) super.clone();
            uVar.f12582I = new ArrayList();
            uVar.f12593u = new q3.n(6);
            uVar.f12594v = new q3.n(6);
            uVar.f12597y = null;
            uVar.f12598z = null;
            uVar.f12585M = null;
            uVar.f12580G = this;
            uVar.f12581H = null;
            return uVar;
        } catch (CloneNotSupportedException e2) {
            throw new RuntimeException(e2);
        }
    }

    public Animator l(ViewGroup viewGroup, C0712D c0712d, C0712D c0712d2) {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object, a3.o] */
    public void m(ViewGroup viewGroup, q3.n nVar, q3.n nVar2, ArrayList arrayList, ArrayList arrayList2) {
        int i7;
        View view;
        C0712D c0712d;
        Animator animator;
        C0712D c0712d2;
        C2052e q10 = q();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        boolean z8 = p().f12585M != null;
        int i10 = 0;
        while (i10 < size) {
            C0712D c0712d3 = (C0712D) arrayList.get(i10);
            C0712D c0712d4 = (C0712D) arrayList2.get(i10);
            if (c0712d3 != null && !c0712d3.f12500c.contains(this)) {
                c0712d3 = null;
            }
            if (c0712d4 != null && !c0712d4.f12500c.contains(this)) {
                c0712d4 = null;
            }
            if ((c0712d3 != null || c0712d4 != null) && (c0712d3 == null || c0712d4 == null || v(c0712d3, c0712d4))) {
                Animator l10 = l(viewGroup, c0712d3, c0712d4);
                if (l10 != null) {
                    String str = this.f12587a;
                    if (c0712d4 != null) {
                        String[] r10 = r();
                        view = c0712d4.f12499b;
                        if (r10 != null && r10.length > 0) {
                            c0712d2 = new C0712D(view);
                            C0712D c0712d5 = (C0712D) ((C2052e) nVar2.f23396b).get(view);
                            i7 = size;
                            if (c0712d5 != null) {
                                int i11 = 0;
                                while (i11 < r10.length) {
                                    HashMap hashMap = c0712d2.f12498a;
                                    String str2 = r10[i11];
                                    hashMap.put(str2, c0712d5.f12498a.get(str2));
                                    i11++;
                                    r10 = r10;
                                }
                            }
                            int i12 = q10.f24637c;
                            int i13 = 0;
                            while (true) {
                                if (i13 >= i12) {
                                    animator = l10;
                                    break;
                                }
                                C0738o c0738o = (C0738o) q10.get((Animator) q10.f(i13));
                                if (c0738o.f12554c != null && c0738o.f12552a == view && c0738o.f12553b.equals(str) && c0738o.f12554c.equals(c0712d2)) {
                                    animator = null;
                                    break;
                                }
                                i13++;
                            }
                        } else {
                            i7 = size;
                            animator = l10;
                            c0712d2 = null;
                        }
                        l10 = animator;
                        c0712d = c0712d2;
                    } else {
                        i7 = size;
                        view = c0712d3.f12499b;
                        c0712d = null;
                    }
                    if (l10 != null) {
                        WindowId windowId = viewGroup.getWindowId();
                        ?? obj = new Object();
                        obj.f12552a = view;
                        obj.f12553b = str;
                        obj.f12554c = c0712d;
                        obj.f12555d = windowId;
                        obj.f12556e = this;
                        obj.f12557f = l10;
                        if (z8) {
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.play(l10);
                            l10 = animatorSet;
                        }
                        q10.put(l10, obj);
                        this.f12582I.add(l10);
                    }
                    i10++;
                    size = i7;
                }
            }
            i7 = size;
            i10++;
            size = i7;
        }
        if (sparseIntArray.size() != 0) {
            for (int i14 = 0; i14 < sparseIntArray.size(); i14++) {
                C0738o c0738o2 = (C0738o) q10.get((Animator) this.f12582I.get(sparseIntArray.keyAt(i14)));
                c0738o2.f12557f.setStartDelay(c0738o2.f12557f.getStartDelay() + (sparseIntArray.valueAt(i14) - Long.MAX_VALUE));
            }
        }
    }

    public final void n() {
        int i7 = this.f12577D - 1;
        this.f12577D = i7;
        if (i7 == 0) {
            y(this, t.f12566m, false);
            for (int i10 = 0; i10 < ((u.r) this.f12593u.f23398d).g(); i10++) {
                View view = (View) ((u.r) this.f12593u.f23398d).h(i10);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i11 = 0; i11 < ((u.r) this.f12594v.f23398d).g(); i11++) {
                View view2 = (View) ((u.r) this.f12594v.f23398d).h(i11);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.f12579F = true;
        }
    }

    public final C0712D o(View view, boolean z8) {
        C0709A c0709a = this.f12595w;
        if (c0709a != null) {
            return c0709a.o(view, z8);
        }
        ArrayList arrayList = z8 ? this.f12597y : this.f12598z;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                i7 = -1;
                break;
            }
            C0712D c0712d = (C0712D) arrayList.get(i7);
            if (c0712d == null) {
                return null;
            }
            if (c0712d.f12499b == view) {
                break;
            }
            i7++;
        }
        if (i7 >= 0) {
            return (C0712D) (z8 ? this.f12598z : this.f12597y).get(i7);
        }
        return null;
    }

    public final u p() {
        C0709A c0709a = this.f12595w;
        return c0709a != null ? c0709a.p() : this;
    }

    public String[] r() {
        return null;
    }

    public final C0712D s(View view, boolean z8) {
        C0709A c0709a = this.f12595w;
        if (c0709a != null) {
            return c0709a.s(view, z8);
        }
        return (C0712D) ((C2052e) (z8 ? this.f12593u : this.f12594v).f23396b).get(view);
    }

    public boolean t() {
        return !this.f12575B.isEmpty();
    }

    public final String toString() {
        return N("");
    }

    public abstract boolean u();

    public boolean v(C0712D c0712d, C0712D c0712d2) {
        if (c0712d == null || c0712d2 == null) {
            return false;
        }
        String[] r10 = r();
        if (r10 == null) {
            Iterator it = c0712d.f12498a.keySet().iterator();
            while (it.hasNext()) {
                if (x(c0712d, c0712d2, (String) it.next())) {
                }
            }
            return false;
        }
        for (String str : r10) {
            if (!x(c0712d, c0712d2, str)) {
            }
        }
        return false;
        return true;
    }

    public final boolean w(View view) {
        int id = view.getId();
        ArrayList arrayList = this.f12591e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f12592f;
        return (size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id)) || arrayList2.contains(view);
    }

    public final void y(u uVar, t tVar, boolean z8) {
        u uVar2 = this.f12580G;
        if (uVar2 != null) {
            uVar2.y(uVar, tVar, z8);
        }
        ArrayList arrayList = this.f12581H;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.f12581H.size();
        s[] sVarArr = this.f12574A;
        if (sVarArr == null) {
            sVarArr = new s[size];
        }
        this.f12574A = null;
        s[] sVarArr2 = (s[]) this.f12581H.toArray(sVarArr);
        for (int i7 = 0; i7 < size; i7++) {
            tVar.a(sVarArr2[i7], uVar, z8);
            sVarArr2[i7] = null;
        }
        this.f12574A = sVarArr2;
    }

    public void z(ViewGroup viewGroup) {
        if (this.f12579F) {
            return;
        }
        ArrayList arrayList = this.f12575B;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f12576C);
        this.f12576C = f12570O;
        for (int i7 = size - 1; i7 >= 0; i7--) {
            Animator animator = animatorArr[i7];
            animatorArr[i7] = null;
            animator.pause();
        }
        this.f12576C = animatorArr;
        y(this, t.f12568o, false);
        this.f12578E = true;
    }
}
