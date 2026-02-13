package q3;

import A0.AbstractC0017g;
import A0.AbstractC0025n;
import A0.F;
import A0.InterfaceC0027p;
import B0.InterfaceC0196p0;
import B0.X;
import C4.B;
import C4.C;
import C4.D;
import F.C0257a;
import H2.O;
import H2.i0;
import J3.x;
import L7.C0385e;
import L7.RunnableC0383c;
import M9.t;
import N6.H;
import N6.t0;
import Q.V;
import W1.U;
import Y5.C0646q0;
import Y5.E0;
import Y5.W;
import Z9.E;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import android.view.View;
import androidx.work.impl.WorkDatabase_Impl;
import b3.AbstractC0826a;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.internal.measurement.zzda;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.kt.apps.core.tv.model.TVChannel;
import com.kt.apps.core.tv.model.TVDataSourceFrom;
import com.kt.apps.core.utils.ActivityUtilsKt;
import com.kt.apps.core.utils.UtilsKt;
import com.kt.apps.core.utils.blurry.BlurFactor;
import com.kt.apps.media.xemtv.workers.TVRecommendationWorkers;
import d7.C1055b;
import da.C1066d;
import hb.C1268a;
import j0.AbstractC1362A;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import jb.InterfaceC1393d;
import jb.InterfaceC1394e;
import m5.C1618o;
import m5.L;
import n5.C1704A;
import n5.v;
import ob.C1838f;
import ob.C1842j;
import s4.InterfaceC1984l;
import u.AbstractC2065s;
import u.C2042E;
import u.C2046I;
import u.C2066t;
import u.T;
import va.C2161e;
import y9.G;

/* loaded from: classes.dex */
public final class l implements InterfaceC0196p0, B, Continuation, OnCompleteListener, InterfaceC1393d, InterfaceC1394e, J3.p, O7.i, L, E0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23390a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f23391b;

    /* renamed from: c, reason: collision with root package name */
    public Object f23392c;

    public l(int i7) {
        this.f23390a = i7;
        switch (i7) {
            case 5:
                this.f23391b = new HashMap();
                this.f23392c = new E3.c(0);
                return;
            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                this.f23391b = new T(0);
                this.f23392c = new u.r((Object) null);
                return;
            case 16:
                this.f23391b = new Hc.e(14);
                this.f23392c = new C2066t(16);
                return;
            case 18:
                this.f23391b = new C2046I();
                this.f23392c = new C2046I();
                return;
            case 20:
                this.f23391b = new ArrayList();
                this.f23392c = new HashMap();
                return;
            default:
                this.f23391b = new S.e(new A0.L[16]);
                return;
        }
    }

    public /* synthetic */ l(int i7, Object obj, Object obj2) {
        this.f23390a = i7;
        this.f23392c = obj;
        this.f23391b = obj2;
    }

    public /* synthetic */ l(int i7, Object obj, Object obj2, boolean z8) {
        this.f23390a = i7;
        this.f23391b = obj;
        this.f23392c = obj2;
    }

    public l(D d10) {
        this.f23390a = 4;
        this.f23392c = d10;
        this.f23391b = new b5.f(new byte[4], 4);
    }

    public l(V8.b bVar) {
        this.f23390a = 26;
        this.f23391b = bVar;
        this.f23392c = new W8.a(bVar);
    }

    public l(U fragmentManager) {
        this.f23390a = 22;
        kotlin.jvm.internal.l.e(fragmentManager, "fragmentManager");
        this.f23391b = fragmentManager;
        this.f23392c = new CopyOnWriteArrayList();
    }

    public l(W4.B b2, t0 t0Var) {
        this.f23390a = 23;
        this.f23391b = b2;
        this.f23392c = H.F(t0Var);
    }

    public l(X5.a aVar, ha.g gVar) {
        this.f23390a = 28;
        this.f23392c = gVar;
        aVar.f10991a.zzf(new C1055b(this));
        this.f23391b = new HashSet();
    }

    public l(Y6.i iVar) {
        this.f23390a = 9;
        new HashSet();
        this.f23392c = iVar;
        if (iVar != null) {
            iVar.b();
            this.f23391b = iVar.f12041a;
        } else {
            Log.e("FirebaseDatabase", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            Log.e("FirebaseDatabase", "ERROR: You must call FirebaseApp.initializeApp() before using Firebase Database.");
            Log.e("FirebaseDatabase", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            throw new RuntimeException("You need to call FirebaseApp.initializeApp() before using Firebase Database.");
        }
    }

    public l(WorkDatabase_Impl workDatabase_Impl) {
        this.f23390a = 0;
        this.f23391b = workDatabase_Impl;
        this.f23392c = new b(workDatabase_Impl, 3);
    }

    public l(String str) {
        this.f23390a = 27;
        this.f23391b = "LibraryVersion";
        this.f23392c = (str == null || str.length() <= 0) ? null : str;
    }

    public l(List list, List list2) {
        this.f23390a = 21;
        if (list.size() != list2.size() - 1) {
            throw new IllegalArgumentException("Number of posts need to be n-1 for n hashes in CompoundHash");
        }
        this.f23391b = list;
        this.f23392c = list2;
    }

    public l(boolean z8, List list, C0385e c0385e) {
        this.f23390a = 14;
        this.f23391b = list;
        this.f23392c = c0385e;
    }

    public l(float[] fArr) {
        this.f23390a = 2;
        this.f23391b = fArr;
        this.f23392c = new int[2];
    }

    public static P8.p D(P8.p pVar, float f4, float f10) {
        float f11 = pVar.f8249a;
        float f12 = f11 < f4 ? f11 - 1.0f : f11 + 1.0f;
        float f13 = pVar.f8250b;
        return new P8.p(f12, f13 < f10 ? f13 - 1.0f : f13 + 1.0f);
    }

    public static void G(T7.s sVar, T7.h hVar) {
        if (!sVar.p()) {
            if (sVar.isEmpty()) {
                throw new IllegalArgumentException("Can't calculate hash on empty node!");
            }
            if (sVar instanceof T7.f) {
                ((T7.f) sVar).i(new T7.g(hVar), true);
                return;
            } else {
                throw new IllegalStateException("Expected children node, but got: " + sVar);
            }
        }
        hVar.e();
        hVar.f9340b = hVar.f9341c;
        ((StringBuilder) hVar.f9342d).append(((T7.o) sVar).m(2));
        hVar.f9339a = true;
        C0257a c0257a = (C0257a) hVar.f9345h;
        c0257a.getClass();
        if (((StringBuilder) hVar.f9342d).length() > c0257a.f3957a) {
            if (hVar.c(hVar.f9341c).isEmpty() || !hVar.c(hVar.f9341c).z().equals(T7.c.f9330d)) {
                hVar.d();
            }
        }
    }

    public static P8.p K(P8.p pVar, P8.p pVar2, int i7) {
        float f4 = pVar2.f8249a;
        float f10 = pVar.f8249a;
        float f11 = i7 + 1;
        float f12 = pVar2.f8250b;
        float f13 = pVar.f8250b;
        return new P8.p(f10 + ((f4 - f10) / f11), f13 + ((f12 - f13) / f11));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [c0.l] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [c0.l] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [S.e] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [S.e] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public static void h(A0.L l10) {
        if (l10.f61T.f96d == F.f24e && !l10.p() && !l10.q() && !l10.f73c0 && l10.G()) {
            c0.l lVar = (c0.l) l10.f60S.f229f;
            if ((lVar.f14116d & 256) != 0) {
                while (lVar != null) {
                    if ((lVar.f14115c & 256) != 0) {
                        AbstractC0025n abstractC0025n = lVar;
                        ?? r52 = 0;
                        while (abstractC0025n != 0) {
                            if (abstractC0025n instanceof InterfaceC0027p) {
                                InterfaceC0027p interfaceC0027p = (InterfaceC0027p) abstractC0025n;
                                interfaceC0027p.i(AbstractC0017g.r(interfaceC0027p, 256));
                            } else if ((abstractC0025n.f14115c & 256) != 0 && (abstractC0025n instanceof AbstractC0025n)) {
                                c0.l lVar2 = abstractC0025n.f269D;
                                int i7 = 0;
                                abstractC0025n = abstractC0025n;
                                r52 = r52;
                                while (lVar2 != null) {
                                    if ((lVar2.f14115c & 256) != 0) {
                                        i7++;
                                        r52 = r52;
                                        if (i7 == 1) {
                                            abstractC0025n = lVar2;
                                        } else {
                                            if (r52 == 0) {
                                                r52 = new S.e(new c0.l[16]);
                                            }
                                            if (abstractC0025n != 0) {
                                                r52.b(abstractC0025n);
                                                abstractC0025n = 0;
                                            }
                                            r52.b(lVar2);
                                        }
                                    }
                                    lVar2 = lVar2.f14118f;
                                    abstractC0025n = abstractC0025n;
                                    r52 = r52;
                                }
                                if (i7 == 1) {
                                }
                            }
                            abstractC0025n = AbstractC0017g.e(r52);
                        }
                    }
                    if ((lVar.f14116d & 256) == 0) {
                        break;
                    } else {
                        lVar = lVar.f14118f;
                    }
                }
            }
        }
        l10.f71b0 = false;
        S.e x2 = l10.x();
        Object[] objArr = x2.f8959a;
        int i10 = x2.f8961c;
        for (int i11 = 0; i11 < i10; i11++) {
            h((A0.L) objArr[i11]);
        }
    }

    public synchronized ArrayList A(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = ((ArrayList) this.f23391b).iterator();
        while (it.hasNext()) {
            List<R3.c> list = (List) ((HashMap) this.f23392c).get((String) it.next());
            if (list != null) {
                for (R3.c cVar : list) {
                    if ((cVar.f8840a.isAssignableFrom(cls) && cls2.isAssignableFrom(cVar.f8841b)) && !arrayList.contains(cVar.f8841b)) {
                        arrayList.add(cVar.f8841b);
                    }
                }
            }
        }
        return arrayList;
    }

    public void B(String str, String str2, Bundle bundle, long j) {
        try {
            ((zzda) this.f23391b).zze(str, str2, bundle, j);
        } catch (RemoteException e2) {
            C0646q0 c0646q0 = ((AppMeasurementDynamiteService) this.f23392c).f15154a;
            if (c0646q0 != null) {
                W w10 = c0646q0.f11912f;
                C0646q0.l(w10);
                w10.f11580w.b(e2, "Event interceptor threw exception");
            }
        }
    }

    public boolean C(P8.p pVar) {
        float f4 = pVar.f8249a;
        if (f4 >= 0.0f) {
            V8.b bVar = (V8.b) this.f23391b;
            if (f4 <= bVar.f10194a - 1) {
                float f10 = pVar.f8250b;
                if (f10 > 0.0f && f10 <= bVar.f10195b - 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public void E(String str) {
        ((O7.b) this.f23391b).execute(new RunnableC0383c((J7.a) this.f23392c, str, 0));
    }

    public O F(i0 i0Var, int i7) {
        H2.t0 t0Var;
        O o10;
        T t5 = (T) this.f23391b;
        int d10 = t5.d(i0Var);
        if (d10 >= 0 && (t0Var = (H2.t0) t5.k(d10)) != null) {
            int i10 = t0Var.f4831a;
            if ((i10 & i7) != 0) {
                int i11 = i10 & (~i7);
                t0Var.f4831a = i11;
                if (i7 == 4) {
                    o10 = t0Var.f4832b;
                } else {
                    if (i7 != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    o10 = t0Var.f4833c;
                }
                if ((i11 & 12) == 0) {
                    t5.h(d10);
                    t0Var.f4831a = 0;
                    t0Var.f4832b = null;
                    t0Var.f4833c = null;
                    H2.t0.f4830d.c(t0Var);
                }
                return o10;
            }
        }
        return null;
    }

    public void H(String str) {
        E3.b bVar;
        synchronized (this) {
            try {
                bVar = (E3.b) ((HashMap) this.f23391b).get(str);
                W3.g.c(bVar, "Argument must not be null");
                int i7 = bVar.f3522b;
                if (i7 < 1) {
                    throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + bVar.f3522b);
                }
                int i10 = i7 - 1;
                bVar.f3522b = i10;
                if (i10 == 0) {
                    E3.b bVar2 = (E3.b) ((HashMap) this.f23391b).remove(str);
                    if (!bVar2.equals(bVar)) {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + bVar + ", but actually removed: " + bVar2 + ", safeKey: " + str);
                    }
                    E3.c cVar = (E3.c) this.f23392c;
                    synchronized (cVar.f3523a) {
                        try {
                            if (cVar.f3523a.size() < 10) {
                                cVar.f3523a.offer(bVar2);
                            }
                        } finally {
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        bVar.f3521a.unlock();
    }

    public void I(i0 i0Var) {
        H2.t0 t0Var = (H2.t0) ((T) this.f23391b).get(i0Var);
        if (t0Var == null) {
            return;
        }
        t0Var.f4831a &= -2;
    }

    public void J(i0 i0Var) {
        u.r rVar = (u.r) this.f23392c;
        int g = rVar.g() - 1;
        while (true) {
            if (g < 0) {
                break;
            }
            if (i0Var == rVar.h(g)) {
                Object[] objArr = rVar.f24712c;
                Object obj = objArr[g];
                Object obj2 = AbstractC2065s.f24714a;
                if (obj != obj2) {
                    objArr[g] = obj2;
                    rVar.f24710a = true;
                }
            } else {
                g--;
            }
        }
        H2.t0 t0Var = (H2.t0) ((T) this.f23391b).remove(i0Var);
        if (t0Var != null) {
            t0Var.f4831a = 0;
            t0Var.f4832b = null;
            t0Var.f4833c = null;
            H2.t0.f4830d.c(t0Var);
        }
    }

    public void L(View view, float[] fArr) {
        Object parent = view.getParent();
        boolean z8 = parent instanceof View;
        float[] fArr2 = (float[]) this.f23391b;
        if (z8) {
            L((View) parent, fArr);
            AbstractC1362A.u(fArr2);
            AbstractC1362A.C(fArr2, -view.getScrollX(), -view.getScrollY());
            X.n(fArr, fArr2);
            float left = view.getLeft();
            float top = view.getTop();
            AbstractC1362A.u(fArr2);
            AbstractC1362A.C(fArr2, left, top);
            X.n(fArr, fArr2);
        } else {
            int[] iArr = (int[]) this.f23392c;
            view.getLocationInWindow(iArr);
            AbstractC1362A.u(fArr2);
            AbstractC1362A.C(fArr2, -view.getScrollX(), -view.getScrollY());
            X.n(fArr, fArr2);
            float f4 = iArr[0];
            float f10 = iArr[1];
            AbstractC1362A.u(fArr2);
            AbstractC1362A.C(fArr2, f4, f10);
            X.n(fArr, fArr2);
        }
        Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            return;
        }
        AbstractC1362A.v(fArr2, matrix);
        X.n(fArr, fArr2);
    }

    public int M(P8.p pVar, P8.p pVar2) {
        int i7 = (int) pVar.f8249a;
        int i10 = (int) pVar.f8250b;
        int i11 = (int) pVar2.f8249a;
        V8.b bVar = (V8.b) this.f23391b;
        int min = Math.min(bVar.f10195b - 1, (int) pVar2.f8250b);
        int i12 = 0;
        boolean z8 = Math.abs(min - i10) > Math.abs(i11 - i7);
        if (z8) {
            i7 = i10;
            i10 = i7;
            i11 = min;
            min = i11;
        }
        int abs = Math.abs(i11 - i7);
        int abs2 = Math.abs(min - i10);
        int i13 = (-abs) / 2;
        int i14 = i10 < min ? 1 : -1;
        int i15 = i7 >= i11 ? -1 : 1;
        boolean b2 = bVar.b(z8 ? i10 : i7, z8 ? i7 : i10);
        while (i7 != i11) {
            boolean b10 = bVar.b(z8 ? i10 : i7, z8 ? i7 : i10);
            if (b10 != b2) {
                i12++;
                b2 = b10;
            }
            i13 += abs2;
            if (i13 > 0) {
                if (i10 == min) {
                    break;
                }
                i10 += i14;
                i13 -= abs;
            }
            i7 += i15;
        }
        return i12;
    }

    public l N(T7.m mVar, boolean z8, boolean z10) {
        return new l(19, new Q7.a(mVar, z8, z10), (Q7.a) this.f23392c, false);
    }

    public void O(V v10) {
        Object g = ((C2046I) this.f23392c).g(v10);
        if (g != null) {
            if (!(g instanceof C2042E)) {
                throw new ClassCastException();
            }
            C2042E c2042e = (C2042E) g;
            Object[] objArr = c2042e.f24584a;
            if (c2042e.f24585b <= 0) {
                return;
            }
            kotlin.jvm.internal.l.c(objArr[0], "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap");
            throw new ClassCastException();
        }
    }

    @Override // B0.InterfaceC0196p0
    public void a(View view, float[] fArr) {
        AbstractC1362A.u(fArr);
        L(view, fArr);
    }

    @Override // jb.InterfaceC1393d
    public void accept(Object obj) {
        switch (this.f23390a) {
            case 10:
                List it = (List) obj;
                kotlin.jvm.internal.l.e(it, "it");
                if (it.isEmpty()) {
                    return;
                }
                C2161e c2161e = (C2161e) this.f23391b;
                M9.d dVar = c2161e.f25325o;
                String str = dVar != null ? dVar.f6851b : null;
                M9.d dVar2 = (M9.d) this.f23392c;
                String str2 = dVar2.f6851b;
                if (!kotlin.jvm.internal.l.a(str, str2) || (c2161e.a().d() instanceof G)) {
                    return;
                }
                c2.q.o(c2161e.f25317d, str2, dVar2.f6850a, new Db.j[0]);
                c2161e.a().l(new G(dVar2));
                C1268a compositeDisposable = c2161e.getCompositeDisposable();
                t tVar = c2161e.f25314a;
                tVar.getClass();
                U9.h z8 = tVar.f6916c.z();
                z8.getClass();
                C1842j e2 = android.support.v4.media.session.b.g(z8.f9862a, new U9.e(z8, dVar2, 1)).e(Ab.e.f1561c);
                nb.e eVar = new nb.e(0, I9.b.f5312b, new A1.d(c2161e, 23));
                e2.c(eVar);
                compositeDisposable.d(eVar);
                return;
            default:
                kotlin.jvm.internal.l.e((Throwable) obj, "it");
                StringBuilder sb2 = new StringBuilder();
                String str3 = (String) this.f23392c;
                String message = h3.o.p(sb2, str3, " - Error");
                M9.k t5 = (M9.k) this.f23391b;
                kotlin.jvm.internal.l.e(t5, "t");
                kotlin.jvm.internal.l.e(message, "message");
                ((ConcurrentHashMap) t5.f6880h.getValue()).remove(str3);
                t5.e().remove(str3);
                t5.f();
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0104, code lost:
    
        if (r3.moveToFirst() != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0106, code lost:
    
        r5.add(b3.m.d(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0111, code lost:
    
        if (r3.moveToNext() != false) goto L116;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x026a  */
    /* JADX WARN: Type inference failed for: r15v9, types: [java.lang.Object, b3.c, b3.m] */
    @Override // jb.InterfaceC1394e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object apply(Object obj) {
        Object obj2;
        AbstractC0826a abstractC0826a;
        long parseId;
        b3.m d10;
        ListIterator listIterator;
        String sourceFrom;
        TVChannel tVChannel = null;
        Object obj3 = this.f23391b;
        switch (this.f23390a) {
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                W9.f tvChannelEntity = (W9.f) obj;
                kotlin.jvm.internal.l.e(tvChannelEntity, "tvChannelEntity");
                TVRecommendationWorkers tVRecommendationWorkers = (TVRecommendationWorkers) obj3;
                Context context = tVRecommendationWorkers.g;
                kotlin.jvm.internal.l.e(context, "context");
                ArrayList arrayList = new ArrayList();
                try {
                    Cursor query = context.getContentResolver().query(b3.k.f13829a, b3.m.f13830d, null, null, null);
                    if (query != null) {
                        break;
                    }
                    if (query != null) {
                        query.close();
                    }
                } catch (IllegalArgumentException unused) {
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    String.valueOf((b3.m) it.next());
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = arrayList.iterator();
                while (true) {
                    boolean hasNext = it2.hasNext();
                    String str = (String) this.f23392c;
                    if (hasNext) {
                        Object next = it2.next();
                        if (!kotlin.jvm.internal.l.a(((b3.m) next).f13817a.getAsString("content_id"), str)) {
                            arrayList2.add(next);
                        }
                    } else {
                        Iterator it3 = arrayList2.iterator();
                        while (true) {
                            boolean hasNext2 = it3.hasNext();
                            Context context2 = tVRecommendationWorkers.g;
                            if (!hasNext2) {
                                Iterator it4 = arrayList.iterator();
                                while (true) {
                                    if (it4.hasNext()) {
                                        obj2 = it4.next();
                                        if (kotlin.jvm.internal.l.a(((b3.m) obj2).f13817a.getAsString("content_id"), str)) {
                                        }
                                    } else {
                                        obj2 = null;
                                    }
                                }
                                b3.m mVar = (b3.m) obj2;
                                String.valueOf(mVar);
                                if (mVar != null) {
                                    abstractC0826a = new AbstractC0826a();
                                    abstractC0826a.f3094a = new ContentValues(mVar.f13817a);
                                } else {
                                    abstractC0826a = new AbstractC0826a();
                                }
                                ((ContentValues) abstractC0826a.f3094a).put("last_engagement_time_utc_millis", Long.valueOf(System.currentTimeMillis()));
                                StringBuilder n6 = A3.c.n(ActivityUtilsKt.getDefScheme(context2), "://tv/channel/");
                                String str2 = tvChannelEntity.f10885f;
                                n6.append(str2);
                                abstractC0826a.L(Uri.parse(n6.toString()));
                                ((ContentValues) abstractC0826a.f3094a).put("content_id", str2);
                                abstractC0826a.K(true);
                                ((ContentValues) abstractC0826a.f3094a).put("title", tvChannelEntity.f10882c);
                                Uri uri = tvChannelEntity.f10881b;
                                abstractC0826a.G(uri);
                                abstractC0826a.F(true);
                                abstractC0826a.E(uri);
                                abstractC0826a.M(uri);
                                abstractC0826a.N(Calendar.getInstance(Locale.TAIWAN).getTime());
                                abstractC0826a.O(6);
                                ((ContentValues) abstractC0826a.f3094a).put("watch_next_type", (Integer) 0);
                                ?? obj4 = new Object();
                                obj4.f13817a = (ContentValues) abstractC0826a.f3094a;
                                String.valueOf((Object) obj4);
                                if (mVar != null) {
                                    long a9 = mVar.a();
                                    if (Build.VERSION.SDK_INT < 26) {
                                        d10 = null;
                                    } else {
                                        Cursor query2 = context2.getContentResolver().query(ContentUris.withAppendedId(b3.k.f13829a, a9), null, null, null, null);
                                        if (query2 != null) {
                                            try {
                                                if (query2.moveToFirst()) {
                                                    d10 = b3.m.d(query2);
                                                    if (query2 != null) {
                                                        query2.close();
                                                    }
                                                }
                                            } catch (Throwable th) {
                                                try {
                                                    query2.close();
                                                } catch (Throwable th2) {
                                                    th.addSuppressed(th2);
                                                }
                                                throw th;
                                            }
                                        }
                                        d10 = null;
                                        if (query2 != null) {
                                        }
                                    }
                                    if (d10 != null) {
                                        Iterator<String> it5 = obj4.f13817a.keySet().iterator();
                                        while (true) {
                                            if (it5.hasNext()) {
                                                String next2 = it5.next();
                                                if (!Objects.deepEquals(obj4.f13817a.get(next2), d10.f13817a.get(next2))) {
                                                    context2.getContentResolver().update(ContentUris.withAppendedId(b3.k.f13829a, a9), obj4.e(), null, null);
                                                }
                                            }
                                        }
                                    }
                                    parseId = mVar.a();
                                } else {
                                    if (Build.VERSION.SDK_INT >= 26) {
                                        try {
                                            parseId = ContentUris.parseId(context2.getContentResolver().insert(b3.k.f13829a, obj4.e()));
                                        } catch (SecurityException e2) {
                                            Log.e("PreviewChannelHelper", "Your app's ability to insert data into the TvProvider may have been revoked.", e2);
                                        }
                                    }
                                    parseId = -1;
                                }
                                String message = "Insert id: " + parseId;
                                kotlin.jvm.internal.l.e(message, "message");
                                return C1838f.f22215a;
                            }
                            context2.getContentResolver().delete(ContentUris.withAppendedId(b3.k.f13829a, ((b3.m) it3.next()).a()), null, null);
                        }
                    }
                }
            case BlurFactor.DEFAULT_RADIUS /* 25 */:
                List it6 = (List) obj;
                kotlin.jvm.internal.l.e(it6, "it");
                TVChannel tVChannel2 = (TVChannel) this.f23392c;
                E e10 = (E) obj3;
                e10.getClass();
                try {
                    listIterator = it6.listIterator(it6.size());
                } catch (Exception unused2) {
                }
                while (listIterator.hasPrevious()) {
                    Object previous = listIterator.previous();
                    String channelId = ((TVChannel) previous).getChannelId();
                    Locale locale = Locale.ROOT;
                    String lowerCase = channelId.toLowerCase(locale);
                    kotlin.jvm.internal.l.d(lowerCase, "toLowerCase(...)");
                    String obj5 = ac.g.v0(UtilsKt.removeAllSpecialChars(lowerCase)).toString();
                    String lowerCase2 = UtilsKt.removeAllSpecialChars(tVChannel2.getChannelId()).toLowerCase(locale);
                    kotlin.jvm.internal.l.d(lowerCase2, "toLowerCase(...)");
                    if (ac.g.b0(obj5, ac.g.v0(lowerCase2).toString())) {
                        tVChannel = (TVChannel) previous;
                        return tVChannel != null ? e10.b(tVChannel, false) : gb.i.i(new Throwable());
                    }
                }
                throw new NoSuchElementException("List contains no element matching the predicate.");
            default:
                Throwable it7 = (Throwable) obj;
                kotlin.jvm.internal.l.e(it7, "it");
                Db.o oVar = X9.a.f11017a;
                String message2 = it7.getMessage();
                if (message2 == null) {
                    message2 = it7.getClass().getName();
                }
                TVChannel tVChannel3 = (TVChannel) obj3;
                X9.a.a(tVChannel3, message2);
                C1066d c1066d = (C1066d) this.f23392c;
                TVDataSourceFrom tVDataSourceFrom = (TVDataSourceFrom) ((Map) c1066d.f16616b.getValue()).get(tVChannel3.getTvGroup());
                if (tVDataSourceFrom == null || (sourceFrom = tVDataSourceFrom.name()) == null) {
                    sourceFrom = tVChannel3.getSourceFrom();
                }
                tVChannel3.setSourceFrom(sourceFrom);
                if (tVDataSourceFrom == null) {
                    return gb.i.i(it7);
                }
                Object obj6 = c1066d.f16615a.get(tVDataSourceFrom);
                kotlin.jvm.internal.l.b(obj6);
                return ((Y9.a) obj6).b(tVChannel3, true);
        }
    }

    @Override // C4.B
    public void b(v vVar) {
        D d10;
        if (vVar.v() == 0 && (vVar.v() & 128) != 0) {
            vVar.H(6);
            int a9 = vVar.a() / 4;
            int i7 = 0;
            while (true) {
                d10 = (D) this.f23392c;
                if (i7 >= a9) {
                    break;
                }
                b5.f fVar = (b5.f) this.f23391b;
                vVar.f(0, fVar.f13953b, 4);
                fVar.p(0);
                int i10 = fVar.i(16);
                fVar.s(3);
                if (i10 == 0) {
                    fVar.s(13);
                } else {
                    int i11 = fVar.i(13);
                    if (d10.f2668f.get(i11) == null) {
                        d10.f2668f.put(i11, new C(new B4.j(d10, i11)));
                        d10.f2671l++;
                    }
                }
                i7++;
            }
            if (d10.f2663a != 2) {
                d10.f2668f.remove(0);
            }
        }
    }

    @Override // C4.B
    public void c(C1704A c1704a, InterfaceC1984l interfaceC1984l, C4.F f4) {
    }

    @Override // O7.i
    public boolean d(Object obj) {
        L7.D d10 = (L7.D) obj;
        d10.getClass();
        if (!((List) this.f23391b).contains(Long.valueOf(d10.f6312a))) {
            C0385e c0385e = d10.f6313b;
            C0385e c0385e2 = (C0385e) this.f23392c;
            if (c0385e.y(c0385e2) || c0385e2.y(c0385e)) {
                return true;
            }
        }
        return false;
    }

    public void e(i0 i0Var, O o10) {
        T t5 = (T) this.f23391b;
        H2.t0 t0Var = (H2.t0) t5.get(i0Var);
        if (t0Var == null) {
            t0Var = H2.t0.a();
            t5.put(i0Var, t0Var);
        }
        t0Var.f4833c = o10;
        t0Var.f4831a |= 8;
    }

    @Override // J3.p
    public void f(D3.a aVar, Bitmap bitmap) {
        IOException iOException = ((W3.e) this.f23392c).f10602b;
        if (iOException != null) {
            if (bitmap == null) {
                throw iOException;
            }
            aVar.g(bitmap);
            throw iOException;
        }
    }

    @Override // m5.L
    public Object g(Uri uri, C1618o c1618o) {
        O4.a aVar = (O4.a) ((L) this.f23391b).g(uri, c1618o);
        List list = (List) this.f23392c;
        return (list == null || list.isEmpty()) ? aVar : (O4.a) aVar.a(list);
    }

    public void i(W1.C f4, boolean z8) {
        kotlin.jvm.internal.l.e(f4, "f");
        W1.C c10 = ((U) this.f23391b).f10376y;
        if (c10 != null) {
            c10.E().f10366o.i(f4, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f23392c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z8) {
                throw null;
            }
            throw null;
        }
    }

    public void j(W1.C f4, boolean z8) {
        kotlin.jvm.internal.l.e(f4, "f");
        U u3 = (U) this.f23391b;
        W1.G g = u3.f10374w.f10311b;
        W1.C c10 = u3.f10376y;
        if (c10 != null) {
            c10.E().f10366o.j(f4, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f23392c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z8) {
                throw null;
            }
            throw null;
        }
    }

    @Override // J3.p
    public void k() {
        x xVar = (x) this.f23391b;
        synchronized (xVar) {
            xVar.f5508c = xVar.f5506a.length;
        }
    }

    public void l(W1.C f4, boolean z8) {
        kotlin.jvm.internal.l.e(f4, "f");
        W1.C c10 = ((U) this.f23391b).f10376y;
        if (c10 != null) {
            c10.E().f10366o.l(f4, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f23392c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z8) {
                throw null;
            }
            throw null;
        }
    }

    public void m(W1.C f4, boolean z8) {
        kotlin.jvm.internal.l.e(f4, "f");
        W1.C c10 = ((U) this.f23391b).f10376y;
        if (c10 != null) {
            c10.E().f10366o.m(f4, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f23392c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z8) {
                throw null;
            }
            throw null;
        }
    }

    public void n(W1.C f4, boolean z8) {
        kotlin.jvm.internal.l.e(f4, "f");
        W1.C c10 = ((U) this.f23391b).f10376y;
        if (c10 != null) {
            c10.E().f10366o.n(f4, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f23392c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z8) {
                throw null;
            }
            throw null;
        }
    }

    public void o(W1.C f4, boolean z8) {
        kotlin.jvm.internal.l.e(f4, "f");
        W1.C c10 = ((U) this.f23391b).f10376y;
        if (c10 != null) {
            c10.E().f10366o.o(f4, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f23392c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z8) {
                throw null;
            }
            throw null;
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        F6.o oVar = (F6.o) this.f23391b;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f23392c;
        synchronized (oVar.f4170f) {
            oVar.f4169e.remove(taskCompletionSource);
        }
    }

    public void p(W1.C f4, boolean z8) {
        kotlin.jvm.internal.l.e(f4, "f");
        U u3 = (U) this.f23391b;
        W1.G g = u3.f10374w.f10311b;
        W1.C c10 = u3.f10376y;
        if (c10 != null) {
            c10.E().f10366o.p(f4, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f23392c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z8) {
                throw null;
            }
            throw null;
        }
    }

    public void q(W1.C f4, boolean z8) {
        kotlin.jvm.internal.l.e(f4, "f");
        W1.C c10 = ((U) this.f23391b).f10376y;
        if (c10 != null) {
            c10.E().f10366o.q(f4, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f23392c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z8) {
                throw null;
            }
            throw null;
        }
    }

    public void r(W1.C f4, boolean z8) {
        kotlin.jvm.internal.l.e(f4, "f");
        W1.C c10 = ((U) this.f23391b).f10376y;
        if (c10 != null) {
            c10.E().f10366o.r(f4, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f23392c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z8) {
                throw null;
            }
            throw null;
        }
    }

    public void s(W1.C f4, Bundle bundle, boolean z8) {
        kotlin.jvm.internal.l.e(f4, "f");
        W1.C c10 = ((U) this.f23391b).f10376y;
        if (c10 != null) {
            c10.E().f10366o.s(f4, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f23392c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z8) {
                throw null;
            }
            throw null;
        }
    }

    public void t(W1.C f4, boolean z8) {
        kotlin.jvm.internal.l.e(f4, "f");
        W1.C c10 = ((U) this.f23391b).f10376y;
        if (c10 != null) {
            c10.E().f10366o.t(f4, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f23392c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z8) {
                throw null;
            }
            throw null;
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        Bundle bundle;
        E5.b bVar = (E5.b) this.f23391b;
        bVar.getClass();
        return (task.isSuccessful() && (bundle = (Bundle) task.getResult()) != null && bundle.containsKey("google.messenger")) ? bVar.a((Bundle) this.f23392c).onSuccessTask(E5.h.f3687c, E5.d.f3682d) : task;
    }

    public void u(W1.C f4, boolean z8) {
        kotlin.jvm.internal.l.e(f4, "f");
        W1.C c10 = ((U) this.f23391b).f10376y;
        if (c10 != null) {
            c10.E().f10366o.u(f4, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f23392c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z8) {
                throw null;
            }
            throw null;
        }
    }

    public void v(W1.C f4, View v10, boolean z8) {
        kotlin.jvm.internal.l.e(f4, "f");
        kotlin.jvm.internal.l.e(v10, "v");
        W1.C c10 = ((U) this.f23391b).f10376y;
        if (c10 != null) {
            c10.E().f10366o.v(f4, v10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f23392c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z8) {
                throw null;
            }
            throw null;
        }
    }

    public void w(W1.C f4, boolean z8) {
        kotlin.jvm.internal.l.e(f4, "f");
        W1.C c10 = ((U) this.f23391b).f10376y;
        if (c10 != null) {
            c10.E().f10366o.w(f4, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f23392c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z8) {
                throw null;
            }
            throw null;
        }
    }

    public T7.s x() {
        Q7.a aVar = (Q7.a) this.f23391b;
        if (aVar.f8669a) {
            return ((T7.m) aVar.f8671c).f9350a;
        }
        return null;
    }

    public T7.s y() {
        Q7.a aVar = (Q7.a) this.f23392c;
        if (aVar.f8669a) {
            return ((T7.m) aVar.f8671c).f9350a;
        }
        return null;
    }

    public synchronized List z(String str) {
        List list;
        if (!((ArrayList) this.f23391b).contains(str)) {
            ((ArrayList) this.f23391b).add(str);
        }
        list = (List) ((HashMap) this.f23392c).get(str);
        if (list == null) {
            list = new ArrayList();
            ((HashMap) this.f23392c).put(str, list);
        }
        return list;
    }
}
