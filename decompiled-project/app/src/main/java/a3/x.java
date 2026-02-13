package a3;

import android.animation.Animator;
import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowId;
import java.util.ArrayList;
import java.util.Iterator;
import u.C2052e;

/* loaded from: classes.dex */
public final class x implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public u f12601a;

    /* renamed from: b, reason: collision with root package name */
    public ViewGroup f12602b;

    /* JADX WARN: Removed duplicated region for block: B:117:0x01e0 A[EDGE_INSN: B:117:0x01e0->B:118:0x01e0 BREAK  A[LOOP:1: B:17:0x0087->B:29:0x01d7], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008c  */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onPreDraw() {
        ArrayList arrayList;
        u uVar;
        int i7;
        q3.n nVar;
        C2052e c2052e;
        C2052e c2052e2;
        int i10;
        int[] iArr;
        int i11;
        int i12;
        int i13;
        C0738o c0738o;
        View view;
        q3.n nVar2;
        C0712D c0712d;
        View view2;
        View view3;
        q3.n nVar3;
        ViewGroup viewGroup = this.f12602b;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        ArrayList arrayList2 = y.f12605c;
        ViewGroup viewGroup2 = this.f12602b;
        int i14 = 1;
        if (!arrayList2.remove(viewGroup2)) {
            return true;
        }
        C2052e b2 = y.b();
        ArrayList arrayList3 = (ArrayList) b2.get(viewGroup2);
        if (arrayList3 == null) {
            arrayList3 = new ArrayList();
            b2.put(viewGroup2, arrayList3);
        } else if (arrayList3.size() > 0) {
            arrayList = new ArrayList(arrayList3);
            uVar = this.f12601a;
            arrayList3.add(uVar);
            uVar.a(new w(this, b2));
            i7 = 0;
            uVar.i(viewGroup2, false);
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((u) it.next()).D(viewGroup2);
                }
            }
            uVar.f12597y = new ArrayList();
            uVar.f12598z = new ArrayList();
            nVar = uVar.f12593u;
            q3.n nVar4 = uVar.f12594v;
            c2052e = new C2052e((C2052e) nVar.f23396b);
            c2052e2 = new C2052e((C2052e) nVar4.f23396b);
            i10 = 0;
            while (true) {
                iArr = uVar.f12596x;
                if (i10 < iArr.length) {
                    break;
                }
                int i15 = iArr[i10];
                if (i15 == i14) {
                    nVar2 = nVar;
                    for (int i16 = c2052e.f24637c - 1; i16 >= 0; i16--) {
                        View view4 = (View) c2052e.f(i16);
                        if (view4 != null && uVar.w(view4) && (c0712d = (C0712D) c2052e2.remove(view4)) != null && uVar.w(c0712d.f12499b)) {
                            uVar.f12597y.add((C0712D) c2052e.h(i16));
                            uVar.f12598z.add(c0712d);
                        }
                    }
                } else if (i15 == 2) {
                    nVar2 = nVar;
                    C2052e c2052e3 = (C2052e) nVar2.f23399e;
                    C2052e c2052e4 = (C2052e) nVar4.f23399e;
                    int i17 = c2052e3.f24637c;
                    for (int i18 = 0; i18 < i17; i18++) {
                        View view5 = (View) c2052e3.k(i18);
                        if (view5 != null && uVar.w(view5) && (view2 = (View) c2052e4.get(c2052e3.f(i18))) != null && uVar.w(view2)) {
                            C0712D c0712d2 = (C0712D) c2052e.get(view5);
                            C0712D c0712d3 = (C0712D) c2052e2.get(view2);
                            if (c0712d2 != null && c0712d3 != null) {
                                uVar.f12597y.add(c0712d2);
                                uVar.f12598z.add(c0712d3);
                                c2052e.remove(view5);
                                c2052e2.remove(view2);
                            }
                        }
                    }
                } else if (i15 != 3) {
                    if (i15 == 4) {
                        u.r rVar = (u.r) nVar.f23398d;
                        int g = rVar.g();
                        int i19 = i7;
                        while (i19 < g) {
                            View view6 = (View) rVar.h(i19);
                            if (view6 == null || !uVar.w(view6)) {
                                nVar3 = nVar;
                            } else {
                                nVar3 = nVar;
                                View view7 = (View) ((u.r) nVar4.f23398d).b(rVar.d(i19));
                                if (view7 != null && uVar.w(view7)) {
                                    C0712D c0712d4 = (C0712D) c2052e.get(view6);
                                    C0712D c0712d5 = (C0712D) c2052e2.get(view7);
                                    if (c0712d4 != null && c0712d5 != null) {
                                        uVar.f12597y.add(c0712d4);
                                        uVar.f12598z.add(c0712d5);
                                        c2052e.remove(view6);
                                        c2052e2.remove(view7);
                                    }
                                }
                            }
                            i19++;
                            nVar = nVar3;
                        }
                    }
                    nVar2 = nVar;
                } else {
                    nVar2 = nVar;
                    SparseArray sparseArray = (SparseArray) nVar2.f23397c;
                    SparseArray sparseArray2 = (SparseArray) nVar4.f23397c;
                    int size = sparseArray.size();
                    for (int i20 = 0; i20 < size; i20++) {
                        View view8 = (View) sparseArray.valueAt(i20);
                        if (view8 != null && uVar.w(view8) && (view3 = (View) sparseArray2.get(sparseArray.keyAt(i20))) != null && uVar.w(view3)) {
                            C0712D c0712d6 = (C0712D) c2052e.get(view8);
                            C0712D c0712d7 = (C0712D) c2052e2.get(view3);
                            if (c0712d6 != null && c0712d7 != null) {
                                uVar.f12597y.add(c0712d6);
                                uVar.f12598z.add(c0712d7);
                                c2052e.remove(view8);
                                c2052e2.remove(view3);
                            }
                        }
                    }
                }
                i10++;
                nVar = nVar2;
                i7 = 0;
                i14 = 1;
            }
            for (i11 = 0; i11 < c2052e.f24637c; i11++) {
                C0712D c0712d8 = (C0712D) c2052e.k(i11);
                if (uVar.w(c0712d8.f12499b)) {
                    uVar.f12597y.add(c0712d8);
                    uVar.f12598z.add(null);
                }
            }
            for (i12 = 0; i12 < c2052e2.f24637c; i12++) {
                C0712D c0712d9 = (C0712D) c2052e2.k(i12);
                if (uVar.w(c0712d9.f12499b)) {
                    uVar.f12598z.add(c0712d9);
                    uVar.f12597y.add(null);
                }
            }
            C2052e q10 = u.q();
            int i21 = q10.f24637c;
            WindowId windowId = viewGroup2.getWindowId();
            for (i13 = i21 - 1; i13 >= 0; i13--) {
                Animator animator = (Animator) q10.f(i13);
                if (animator != null && (c0738o = (C0738o) q10.get(animator)) != null && (view = c0738o.f12552a) != null && windowId.equals(c0738o.f12555d)) {
                    C0712D s3 = uVar.s(view, true);
                    C0712D o10 = uVar.o(view, true);
                    if (s3 == null && o10 == null) {
                        o10 = (C0712D) ((C2052e) uVar.f12594v.f23396b).get(view);
                    }
                    if (s3 != null || o10 != null) {
                        C0712D c0712d10 = c0738o.f12554c;
                        u uVar2 = c0738o.f12556e;
                        if (uVar2.v(c0712d10, o10)) {
                            if (uVar2.p().f12585M != null) {
                                animator.cancel();
                                ArrayList arrayList4 = uVar2.f12575B;
                                arrayList4.remove(animator);
                                q10.remove(animator);
                                if (arrayList4.size() == 0) {
                                    uVar2.y(uVar2, t.f12567n, false);
                                    if (!uVar2.f12579F) {
                                        uVar2.f12579F = true;
                                        uVar2.y(uVar2, t.f12566m, false);
                                    }
                                }
                            } else if (animator.isRunning() || animator.isStarted()) {
                                animator.cancel();
                            } else {
                                q10.remove(animator);
                            }
                        }
                    }
                }
            }
            uVar.m(viewGroup2, uVar.f12593u, uVar.f12594v, uVar.f12597y, uVar.f12598z);
            if (uVar.f12585M != null) {
                uVar.E();
            } else if (Build.VERSION.SDK_INT >= 34) {
                uVar.A();
                r rVar2 = uVar.f12585M;
                C0709A c0709a = rVar2.g;
                long j = c0709a.L == 0 ? 1L : 0L;
                c0709a.F(j, rVar2.f12559a);
                rVar2.f12559a = j;
                uVar.f12585M.f12560b = true;
                return true;
            }
            return true;
        }
        arrayList = null;
        uVar = this.f12601a;
        arrayList3.add(uVar);
        uVar.a(new w(this, b2));
        i7 = 0;
        uVar.i(viewGroup2, false);
        if (arrayList != null) {
        }
        uVar.f12597y = new ArrayList();
        uVar.f12598z = new ArrayList();
        nVar = uVar.f12593u;
        q3.n nVar42 = uVar.f12594v;
        c2052e = new C2052e((C2052e) nVar.f23396b);
        c2052e2 = new C2052e((C2052e) nVar42.f23396b);
        i10 = 0;
        while (true) {
            iArr = uVar.f12596x;
            if (i10 < iArr.length) {
            }
            i10++;
            nVar = nVar2;
            i7 = 0;
            i14 = 1;
        }
        while (i11 < c2052e.f24637c) {
        }
        while (i12 < c2052e2.f24637c) {
        }
        C2052e q102 = u.q();
        int i212 = q102.f24637c;
        WindowId windowId2 = viewGroup2.getWindowId();
        while (i13 >= 0) {
        }
        uVar.m(viewGroup2, uVar.f12593u, uVar.f12594v, uVar.f12597y, uVar.f12598z);
        if (uVar.f12585M != null) {
        }
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ViewGroup viewGroup = this.f12602b;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        ArrayList arrayList = y.f12605c;
        ViewGroup viewGroup2 = this.f12602b;
        arrayList.remove(viewGroup2);
        ArrayList arrayList2 = (ArrayList) y.b().get(viewGroup2);
        if (arrayList2 != null && arrayList2.size() > 0) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ((u) it.next()).D(viewGroup2);
            }
        }
        this.f12601a.j(true);
    }
}
