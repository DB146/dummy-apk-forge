package A9;

import K0.C0374d;
import P4.C0463k;
import a3.C0709A;
import android.animation.ValueAnimator;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.os.Trace;
import android.view.Choreographer;
import android.view.MotionEvent;
import android.view.inputmethod.InputMethodManager;
import c.DialogC0868l;
import c.ViewTreeObserverOnDrawListenerC0864h;
import cc.InterfaceC0937i0;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.material.textfield.TextInputLayout;
import com.kt.apps.core.base.leanback.SearchView;
import com.kt.apps.core.utils.ActivityUtilsKt;
import com.kt.apps.core.utils.blurry.BlurFactor;
import com.kt.apps.media.xemtv.beta.R;
import com.kt.apps.media.xemtv.ui.playback.PlaybackActivity;
import h7.C1260f;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import l1.AbstractC1449a;
import u.AbstractC2059l;
import u.C2046I;
import u.C2048a;
import u.C2053f;
import u.C2070x;
import u1.C2094d;
import u1.C2095e;

/* loaded from: classes2.dex */
public final /* synthetic */ class S2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f961a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f962b;

    public /* synthetic */ S2(Object obj, int i7) {
        this.f961a = i7;
        this.f962b = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0065, code lost:
    
        if (r2 != null) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0074  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z8;
        long j;
        long j10;
        long j11;
        long j12;
        int i7;
        B0.D d10;
        C2070x c2070x;
        C2070x c2070x2;
        int i10;
        C2070x c2070x3;
        AbstractC2059l abstractC2059l;
        int[] iArr;
        long[] jArr;
        int i11;
        B0.D d11;
        C2070x c2070x4;
        AbstractC2059l abstractC2059l2;
        int[] iArr2;
        long[] jArr2;
        int i12;
        int i13;
        Object[] objArr;
        long[] jArr3;
        int i14;
        Object[] objArr2;
        long[] jArr4;
        Object[] objArr3;
        int i15;
        int i16;
        Object[] objArr4;
        int i17;
        int i18;
        C2094d c2094d;
        Context context;
        long j13 = 0;
        Object obj = null;
        switch (this.f961a) {
            case 0:
                SearchView searchView = (SearchView) this.f962b;
                SearchView.SearchAutoComplete searchAutoComplete = searchView.f16068f;
                kotlin.jvm.internal.l.b(searchAutoComplete);
                String message = "updateFocusedState: {mSearchSrcTextView_hasFocus(): " + searchAutoComplete.hasFocus() + "}";
                kotlin.jvm.internal.l.e(message, "message");
                searchAutoComplete.hasFocus();
                searchView.invalidate();
                return;
            case 1:
                SearchView.SearchAutoComplete searchAutoComplete2 = (SearchView.SearchAutoComplete) this.f962b;
                if (searchAutoComplete2.f16077u) {
                    Object systemService = searchAutoComplete2.getContext().getSystemService("input_method");
                    kotlin.jvm.internal.l.c(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                    ((InputMethodManager) systemService).showSoftInput(searchAutoComplete2, 0);
                    searchAutoComplete2.f16077u = false;
                    return;
                }
                return;
            case 2:
                int i19 = PlaybackActivity.f16206f0;
                Intent intent = new Intent();
                PlaybackActivity playbackActivity = (PlaybackActivity) this.f962b;
                intent.setData(Uri.parse(ActivityUtilsKt.getDefScheme(playbackActivity) + "://bongda/dashboard"));
                playbackActivity.startActivity(intent);
                return;
            case 3:
                B0.D d12 = (B0.D) this.f962b;
                d12.f1597K0 = false;
                MotionEvent motionEvent = d12.f1585E0;
                kotlin.jvm.internal.l.b(motionEvent);
                if (motionEvent.getActionMasked() != 10) {
                    throw new IllegalStateException("The ACTION_HOVER_EXIT event was not cleared.");
                }
                d12.H(motionEvent);
                return;
            case 4:
                ((Rb.a) this.f962b).invoke();
                return;
            case 5:
                B0.L l10 = (B0.L) this.f962b;
                Trace.beginSection("measureAndLayout");
                try {
                    l10.f1728d.t(true);
                    Trace.endSection();
                    Trace.beginSection("checkForSemanticsChanges");
                    try {
                        l10.n();
                        Trace.endSection();
                        l10.L = false;
                        return;
                    } finally {
                    }
                } finally {
                }
            case 6:
                ((C6.c) this.f962b).t(true);
                return;
            case 7:
                C6.i iVar = (C6.i) this.f962b;
                boolean isPopupShowing = iVar.f2935h.isPopupShowing();
                iVar.t(isPopupShowing);
                iVar.f2938m = isPopupShowing;
                return;
            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                ((TextInputLayout) this.f962b).f15488d.requestLayout();
                return;
            case 9:
                Ca.i iVar2 = (Ca.i) this.f962b;
                String str = iVar2.f3109W0;
                if (iVar2.N() && !iVar2.f10272P) {
                    int i20 = iVar2.F().getDisplayMetrics().widthPixels;
                    int i21 = iVar2.F().getDisplayMetrics().heightPixels;
                    W1.G g02 = iVar2.g0();
                    com.bumptech.glide.k kVar = (com.bumptech.glide.k) ((com.bumptech.glide.k) com.bumptech.glide.b.b(g02).d(g02).p(str).b()).g(AbstractC1449a.getDrawable(iVar2.g0(), R.drawable.default_background));
                    kVar.C(new T3.g(i20, i21), null, kVar, W3.g.f10605a);
                    Timer timer = iVar2.f3110X0;
                    if (timer != null) {
                        timer.cancel();
                        return;
                    }
                    return;
                }
                return;
            case 10:
                E4.e eVar = (E4.e) this.f962b;
                synchronized (eVar.f3559a) {
                    try {
                        if (eVar.f3567l) {
                            return;
                        }
                        long j14 = eVar.k - 1;
                        eVar.k = j14;
                        if (j14 > 0) {
                            return;
                        }
                        if (j14 >= 0) {
                            eVar.a();
                            return;
                        }
                        IllegalStateException illegalStateException = new IllegalStateException();
                        synchronized (eVar.f3559a) {
                            eVar.f3568m = illegalStateException;
                        }
                        return;
                    } finally {
                    }
                }
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                M.j.a((M.j) this.f962b);
                return;
            case 12:
                D5.i iVar3 = ((R1.c) this.f962b).f8809c;
                iVar3.getClass();
                long uptimeMillis = SystemClock.uptimeMillis();
                R1.c cVar = (R1.c) iVar3.f3256b;
                cVar.getClass();
                long uptimeMillis2 = SystemClock.uptimeMillis();
                int i22 = 0;
                while (true) {
                    ArrayList arrayList = cVar.f8808b;
                    if (i22 >= arrayList.size()) {
                        if (cVar.f8812f) {
                            for (int size = arrayList.size() - 1; size >= 0; size--) {
                                if (arrayList.get(size) == null) {
                                    arrayList.remove(size);
                                }
                            }
                            if (arrayList.size() == 0 && Build.VERSION.SDK_INT >= 33) {
                                q3.s sVar = cVar.f8813h;
                                ValueAnimator.unregisterDurationScaleChangeListener((R1.a) sVar.f23438b);
                                sVar.f23438b = null;
                            }
                            cVar.f8812f = false;
                        }
                        if (arrayList.size() > 0) {
                            q3.c cVar2 = cVar.f8811e;
                            cVar2.getClass();
                            ((Choreographer) cVar2.f23371b).postFrameCallback(new R1.b(cVar.f8810d));
                            return;
                        }
                        return;
                    }
                    R1.e eVar2 = (R1.e) arrayList.get(i22);
                    if (eVar2 != null) {
                        u.T t5 = cVar.f8807a;
                        Long l11 = (Long) t5.get(eVar2);
                        if (l11 != null) {
                            if (l11.longValue() < uptimeMillis2) {
                                t5.remove(eVar2);
                            }
                        }
                        long j15 = eVar2.f8822h;
                        if (j15 == j13) {
                            eVar2.f8822h = uptimeMillis;
                            eVar2.c(eVar2.f8817b);
                        } else {
                            long j16 = uptimeMillis - j15;
                            eVar2.f8822h = uptimeMillis;
                            long j17 = R1.e.b().g == 0.0f ? 2147483647L : ((float) j16) / r13;
                            if (eVar2.f8825m != Float.MAX_VALUE) {
                                long j18 = j17 / 2;
                                R1.d a9 = eVar2.f8824l.a(eVar2.f8817b, eVar2.f8816a, j18);
                                R1.f fVar = eVar2.f8824l;
                                fVar.f8833i = eVar2.f8825m;
                                eVar2.f8825m = Float.MAX_VALUE;
                                R1.d a10 = fVar.a(a9.f8814a, a9.f8815b, j18);
                                eVar2.f8817b = a10.f8814a;
                                eVar2.f8816a = a10.f8815b;
                            } else {
                                R1.d a11 = eVar2.f8824l.a(eVar2.f8817b, eVar2.f8816a, j17);
                                eVar2.f8817b = a11.f8814a;
                                eVar2.f8816a = a11.f8815b;
                            }
                            float max = Math.max(eVar2.f8817b, eVar2.g);
                            eVar2.f8817b = max;
                            eVar2.f8817b = Math.min(max, eVar2.f8821f);
                            float f4 = eVar2.f8816a;
                            R1.f fVar2 = eVar2.f8824l;
                            fVar2.getClass();
                            if (Math.abs(f4) >= fVar2.f8830e || Math.abs(r0 - ((float) fVar2.f8833i)) >= fVar2.f8829d) {
                                z8 = false;
                            } else {
                                eVar2.f8817b = (float) eVar2.f8824l.f8833i;
                                eVar2.f8816a = 0.0f;
                                z8 = true;
                            }
                            float min = Math.min(eVar2.f8817b, eVar2.f8821f);
                            eVar2.f8817b = min;
                            float max2 = Math.max(min, eVar2.g);
                            eVar2.f8817b = max2;
                            eVar2.c(max2);
                            if (z8) {
                                eVar2.f8820e = false;
                                R1.c b2 = R1.e.b();
                                b2.f8807a.remove(eVar2);
                                ArrayList arrayList2 = b2.f8808b;
                                int indexOf = arrayList2.indexOf(eVar2);
                                if (indexOf >= 0) {
                                    arrayList2.set(indexOf, null);
                                    b2.f8812f = true;
                                }
                                eVar2.f8822h = 0L;
                                eVar2.f8818c = false;
                                int i23 = 0;
                                while (true) {
                                    ArrayList arrayList3 = eVar2.j;
                                    if (i23 < arrayList3.size()) {
                                        if (arrayList3.get(i23) != null) {
                                            a3.q qVar = (a3.q) arrayList3.get(i23);
                                            float f10 = eVar2.f8817b;
                                            a3.r rVar = qVar.f12558a;
                                            a3.t tVar = a3.t.f12566m;
                                            C0709A c0709a = rVar.g;
                                            if (f10 < 1.0f) {
                                                long j19 = c0709a.L;
                                                a3.u P10 = c0709a.P(0);
                                                a3.u uVar = P10.f12580G;
                                                P10.f12580G = null;
                                                j11 = uptimeMillis;
                                                j12 = uptimeMillis2;
                                                c0709a.F(-1L, rVar.f12559a);
                                                c0709a.F(j19, -1L);
                                                rVar.f12559a = j19;
                                                Aa.j jVar = rVar.f12564f;
                                                if (jVar != null) {
                                                    jVar.run();
                                                }
                                                c0709a.f12582I.clear();
                                                i7 = 1;
                                                if (uVar != null) {
                                                    uVar.y(uVar, tVar, true);
                                                }
                                            } else {
                                                j11 = uptimeMillis;
                                                j12 = uptimeMillis2;
                                                i7 = 1;
                                                c0709a.y(c0709a, tVar, false);
                                            }
                                        } else {
                                            j11 = uptimeMillis;
                                            j12 = uptimeMillis2;
                                            i7 = 1;
                                        }
                                        i23 += i7;
                                        uptimeMillis = j11;
                                        uptimeMillis2 = j12;
                                    } else {
                                        j = uptimeMillis;
                                        j10 = uptimeMillis2;
                                        for (int size2 = arrayList3.size() - 1; size2 >= 0; size2--) {
                                            if (arrayList3.get(size2) == null) {
                                                arrayList3.remove(size2);
                                            }
                                        }
                                        i22++;
                                        uptimeMillis = j;
                                        uptimeMillis2 = j10;
                                        j13 = 0;
                                    }
                                }
                            }
                        }
                    }
                    j = uptimeMillis;
                    j10 = uptimeMillis2;
                    i22++;
                    uptimeMillis = j;
                    uptimeMillis2 = j10;
                    j13 = 0;
                }
                break;
            case 13:
                ((C0463k) this.f962b).z();
                return;
            case 14:
                kotlin.jvm.internal.v seekCancelLambda = (kotlin.jvm.internal.v) this.f962b;
                kotlin.jvm.internal.l.e(seekCancelLambda, "$seekCancelLambda");
                Rb.a aVar = (Rb.a) seekCancelLambda.f19134a;
                if (aVar != null) {
                    aVar.invoke();
                    return;
                }
                return;
            case 15:
                W1.d0.a(4, (ArrayList) this.f962b);
                return;
            case 16:
                W1.C c10 = (W1.C) this.f962b;
                c10.f10290d0.f10507f.w(c10.f10289d);
                c10.f10289d = null;
                return;
            case 17:
                ((HandlerThread) this.f962b).quit();
                return;
            case 18:
                ((Y0.i) this.f962b).invoke();
                return;
            case 19:
                ((Y0.i) this.f962b).invoke();
                return;
            case 20:
                ((Y4.c) this.f962b).w();
                return;
            case 21:
                ViewTreeObserverOnDrawListenerC0864h viewTreeObserverOnDrawListenerC0864h = (ViewTreeObserverOnDrawListenerC0864h) this.f962b;
                Runnable runnable = viewTreeObserverOnDrawListenerC0864h.f14028b;
                if (runnable != null) {
                    runnable.run();
                    viewTreeObserverOnDrawListenerC0864h.f14028b = null;
                    return;
                }
                return;
            case 22:
                DialogC0868l.c((DialogC0868l) this.f962b);
                return;
            case 23:
                ((A0.J) this.f962b).invoke();
                return;
            case 24:
                ((com.google.android.material.timepicker.e) this.f962b).m();
                return;
            case BlurFactor.DEFAULT_RADIUS /* 25 */:
                e0.c cVar3 = (e0.c) this.f962b;
                if (cVar3.d()) {
                    B0.D d13 = cVar3.f16644a;
                    d13.t(true);
                    C2070x c2070x5 = cVar3.f16655z;
                    int[] iArr3 = c2070x5.f24692b;
                    long[] jArr5 = c2070x5.f24691a;
                    int length = jArr5.length - 2;
                    long j20 = 255;
                    int i24 = 8;
                    long j21 = -9187201950435737472L;
                    if (length >= 0) {
                        int i25 = 0;
                        while (true) {
                            long j22 = jArr5[i25];
                            if ((((~j22) << 7) & j22 & j21) != j21) {
                                int i26 = 8 - ((~(i25 - length)) >>> 31);
                                int i27 = 0;
                                while (i27 < i26) {
                                    if ((j22 & j20) < 128) {
                                        int i28 = iArr3[(i25 << 3) + i27];
                                        if (!cVar3.c().a(i28)) {
                                            cVar3.f16647d.add(new e0.d(i28, cVar3.f16654y, e0.e.f16661b, null));
                                            cVar3.f16651v.h(Db.q.f3365a);
                                        }
                                        i18 = 8;
                                    } else {
                                        i18 = i24;
                                    }
                                    j22 >>= i18;
                                    i27++;
                                    i24 = i18;
                                    j20 = 255;
                                }
                                i17 = 1;
                                if (i26 != i24) {
                                }
                            } else {
                                i17 = 1;
                            }
                            if (i25 != length) {
                                i25 += i17;
                                j20 = 255;
                                i24 = 8;
                                j21 = -9187201950435737472L;
                            }
                        }
                    }
                    cVar3.f(d13.getSemanticsOwner().a(), cVar3.f16641A);
                    AbstractC2059l c11 = cVar3.c();
                    int[] iArr4 = c11.f24692b;
                    long[] jArr6 = c11.f24691a;
                    int length2 = jArr6.length - 2;
                    if (length2 >= 0) {
                        int i29 = 0;
                        while (true) {
                            long j23 = jArr6[i29];
                            if ((((~j23) << 7) & j23 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i30 = 8 - ((~(i29 - length2)) >>> 31);
                                int i31 = 0;
                                while (i31 < i30) {
                                    if ((j23 & 255) < 128) {
                                        int i32 = iArr4[(i29 << 3) + i31];
                                        B0.W0 w02 = (B0.W0) c2070x5.b(i32);
                                        B0.X0 x02 = (B0.X0) c11.b(i32);
                                        H0.n nVar = x02 != null ? x02.f1809a : null;
                                        if (nVar == null) {
                                            throw X.c.c("no value for specified key");
                                        }
                                        H0.i iVar4 = nVar.f4505d;
                                        int i33 = nVar.g;
                                        C2046I c2046i = iVar4.f4494a;
                                        if (w02 == null) {
                                            Object[] objArr5 = c2046i.f24604b;
                                            abstractC2059l2 = c11;
                                            long[] jArr7 = c2046i.f24603a;
                                            iArr2 = iArr4;
                                            int length3 = jArr7.length - 2;
                                            d11 = d13;
                                            if (length3 >= 0) {
                                                jArr2 = jArr6;
                                                int i34 = 0;
                                                while (true) {
                                                    long j24 = jArr7[i34];
                                                    c2070x4 = c2070x5;
                                                    long[] jArr8 = jArr7;
                                                    if ((((~j24) << 7) & j24 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i35 = 8 - ((~(i34 - length3)) >>> 31);
                                                        int i36 = 0;
                                                        while (i36 < i35) {
                                                            if ((j24 & 255) < 128) {
                                                                objArr4 = objArr5;
                                                                H0.t tVar2 = (H0.t) objArr5[(i34 << 3) + i36];
                                                                i16 = length2;
                                                                H0.t tVar3 = H0.q.f4560y;
                                                                if (kotlin.jvm.internal.l.a(tVar2, tVar3)) {
                                                                    Object g = c2046i.g(tVar3);
                                                                    if (g == null) {
                                                                        g = null;
                                                                    }
                                                                    List list = (List) g;
                                                                    cVar3.g(i33, String.valueOf(list != null ? (C0374d) Eb.o.Z(list) : null));
                                                                }
                                                            } else {
                                                                i16 = length2;
                                                                objArr4 = objArr5;
                                                            }
                                                            j24 >>= 8;
                                                            i36++;
                                                            length2 = i16;
                                                            objArr5 = objArr4;
                                                        }
                                                        i12 = length2;
                                                        objArr3 = objArr5;
                                                        i15 = 1;
                                                        if (i35 != 8) {
                                                        }
                                                    } else {
                                                        i12 = length2;
                                                        objArr3 = objArr5;
                                                        i15 = 1;
                                                    }
                                                    if (i34 != length3) {
                                                        i34 += i15;
                                                        c2070x5 = c2070x4;
                                                        jArr7 = jArr8;
                                                        length2 = i12;
                                                        objArr5 = objArr3;
                                                    }
                                                }
                                            } else {
                                                c2070x4 = c2070x5;
                                                jArr2 = jArr6;
                                                i12 = length2;
                                            }
                                        } else {
                                            d11 = d13;
                                            c2070x4 = c2070x5;
                                            abstractC2059l2 = c11;
                                            iArr2 = iArr4;
                                            jArr2 = jArr6;
                                            i12 = length2;
                                            Object[] objArr6 = c2046i.f24604b;
                                            long[] jArr9 = c2046i.f24603a;
                                            int length4 = jArr9.length - 2;
                                            if (length4 >= 0) {
                                                int i37 = 0;
                                                while (true) {
                                                    long j25 = jArr9[i37];
                                                    i13 = i29;
                                                    if ((((~j25) << 7) & j25 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i38 = 8 - ((~(i37 - length4)) >>> 31);
                                                        int i39 = 0;
                                                        while (i39 < i38) {
                                                            if ((j25 & 255) < 128) {
                                                                objArr2 = objArr6;
                                                                H0.t tVar4 = (H0.t) objArr6[(i37 << 3) + i39];
                                                                jArr4 = jArr9;
                                                                H0.t tVar5 = H0.q.f4560y;
                                                                if (kotlin.jvm.internal.l.a(tVar4, tVar5)) {
                                                                    Object g2 = w02.f1805a.f4494a.g(tVar5);
                                                                    if (g2 == null) {
                                                                        g2 = null;
                                                                    }
                                                                    List list2 = (List) g2;
                                                                    C0374d c0374d = list2 != null ? (C0374d) Eb.o.Z(list2) : null;
                                                                    Object g10 = c2046i.g(tVar5);
                                                                    if (g10 == null) {
                                                                        g10 = null;
                                                                    }
                                                                    List list3 = (List) g10;
                                                                    C0374d c0374d2 = list3 != null ? (C0374d) Eb.o.Z(list3) : null;
                                                                    if (!kotlin.jvm.internal.l.a(c0374d, c0374d2)) {
                                                                        cVar3.g(i33, String.valueOf(c0374d2));
                                                                    }
                                                                }
                                                            } else {
                                                                objArr2 = objArr6;
                                                                jArr4 = jArr9;
                                                            }
                                                            j25 >>= 8;
                                                            i39++;
                                                            jArr9 = jArr4;
                                                            objArr6 = objArr2;
                                                        }
                                                        objArr = objArr6;
                                                        jArr3 = jArr9;
                                                        i14 = 1;
                                                        if (i38 != 8) {
                                                        }
                                                    } else {
                                                        objArr = objArr6;
                                                        jArr3 = jArr9;
                                                        i14 = 1;
                                                    }
                                                    if (i37 != length4) {
                                                        i37 += i14;
                                                        i29 = i13;
                                                        jArr9 = jArr3;
                                                        objArr6 = objArr;
                                                    }
                                                }
                                                j23 >>= 8;
                                                i31++;
                                                c11 = abstractC2059l2;
                                                iArr4 = iArr2;
                                                jArr6 = jArr2;
                                                d13 = d11;
                                                c2070x5 = c2070x4;
                                                i29 = i13;
                                                length2 = i12;
                                            }
                                        }
                                    } else {
                                        d11 = d13;
                                        c2070x4 = c2070x5;
                                        abstractC2059l2 = c11;
                                        iArr2 = iArr4;
                                        jArr2 = jArr6;
                                        i12 = length2;
                                    }
                                    i13 = i29;
                                    j23 >>= 8;
                                    i31++;
                                    c11 = abstractC2059l2;
                                    iArr4 = iArr2;
                                    jArr6 = jArr2;
                                    d13 = d11;
                                    c2070x5 = c2070x4;
                                    i29 = i13;
                                    length2 = i12;
                                }
                                d10 = d13;
                                c2070x = c2070x5;
                                abstractC2059l = c11;
                                iArr = iArr4;
                                jArr = jArr6;
                                int i40 = length2;
                                int i41 = i29;
                                if (i30 == 8) {
                                    i11 = i41;
                                    length2 = i40;
                                }
                            } else {
                                d10 = d13;
                                c2070x = c2070x5;
                                abstractC2059l = c11;
                                iArr = iArr4;
                                jArr = jArr6;
                                i11 = i29;
                            }
                            if (i11 != length2) {
                                i29 = i11 + 1;
                                c11 = abstractC2059l;
                                iArr4 = iArr;
                                jArr6 = jArr;
                                d13 = d10;
                                c2070x5 = c2070x;
                            }
                        }
                    } else {
                        d10 = d13;
                        c2070x = c2070x5;
                    }
                    c2070x.c();
                    AbstractC2059l c12 = cVar3.c();
                    int[] iArr5 = c12.f24692b;
                    Object[] objArr7 = c12.f24693c;
                    long[] jArr10 = c12.f24691a;
                    int length5 = jArr10.length - 2;
                    if (length5 >= 0) {
                        int i42 = 0;
                        while (true) {
                            long j26 = jArr10[i42];
                            if ((((~j26) << 7) & j26 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i43 = 8 - ((~(i42 - length5)) >>> 31);
                                int i44 = 0;
                                while (i44 < i43) {
                                    if ((j26 & 255) < 128) {
                                        int i45 = (i42 << 3) + i44;
                                        int i46 = iArr5[i45];
                                        B0.W0 w03 = new B0.W0(((B0.X0) objArr7[i45]).f1809a, cVar3.c());
                                        c2070x3 = c2070x;
                                        c2070x3.g(i46, w03);
                                    } else {
                                        c2070x3 = c2070x;
                                    }
                                    j26 >>= 8;
                                    i44++;
                                    c2070x = c2070x3;
                                }
                                c2070x2 = c2070x;
                                i10 = 1;
                                if (i43 != 8) {
                                }
                            } else {
                                c2070x2 = c2070x;
                                i10 = 1;
                            }
                            if (i42 != length5) {
                                i42 += i10;
                                c2070x = c2070x2;
                            }
                        }
                    }
                    cVar3.f16641A = new B0.W0(d10.getSemanticsOwner().a(), cVar3.c());
                    cVar3.f16642B = false;
                    return;
                }
                return;
            case 26:
                InterfaceC0937i0 interfaceC0937i0 = (InterfaceC0937i0) this.f962b;
                if (interfaceC0937i0 != null) {
                    interfaceC0937i0.cancel(null);
                    return;
                }
                return;
            case 27:
                h4.k kVar2 = (h4.k) this.f962b;
                kVar2.getClass();
                ((i4.g) kVar2.f17765d).T(new Q9.a(kVar2, 14));
                return;
            case 28:
                C1260f c1260f = (C1260f) this.f962b;
                c1260f.f17847a.a().addOnFailureListener(c1260f.f17848b, new Q9.a(c1260f, 16));
                return;
            default:
                int i47 = Build.VERSION.SDK_INT;
                if (i47 >= 33) {
                    Context context2 = (Context) this.f962b;
                    ComponentName componentName = new ComponentName(context2, "androidx.appcompat.app.AppLocalesMetadataHolderService");
                    if (context2.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                        if (i47 < 33) {
                            c2094d = i.k.f18074c;
                            break;
                        } else {
                            C2053f c2053f = i.k.f18078u;
                            c2053f.getClass();
                            C2048a c2048a = new C2048a(c2053f);
                            while (true) {
                                if (c2048a.hasNext()) {
                                    i.k kVar3 = (i.k) ((WeakReference) c2048a.next()).get();
                                    if (kVar3 != null && (context = ((i.v) kVar3).f18159y) != null) {
                                        obj = context.getSystemService("locale");
                                    }
                                }
                            }
                            if (obj != null) {
                                c2094d = new C2094d(new C2095e(i.j.a(obj)));
                                if (c2094d.f24825a.f24826a.isEmpty()) {
                                    String e2 = k1.f.e(context2);
                                    Object systemService2 = context2.getSystemService("locale");
                                    if (systemService2 != null) {
                                        i.j.b(systemService2, i.i.a(e2));
                                    }
                                }
                                context2.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                            }
                            c2094d = C2094d.f24824b;
                            if (c2094d.f24825a.f24826a.isEmpty()) {
                            }
                            context2.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                        }
                    }
                }
                i.k.f18077f = true;
                return;
        }
    }
}
