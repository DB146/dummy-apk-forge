package B0;

import A9.S2;
import K0.C0371a;
import K0.C0374d;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.text.Layout;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.kt.apps.media.xemtv.beta.R;
import ec.C1116a;
import i0.C1289b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import u.AbstractC2058k;
import u.AbstractC2059l;
import u.AbstractC2060m;
import u.AbstractC2061n;
import u.C2046I;
import u.C2053f;
import u.C2068v;
import u.C2069w;
import u.C2070x;
import v.AbstractC2121a;
import y1.C2354b;
import y1.C2355c;

/* loaded from: classes.dex */
public final class L extends C2354b {

    /* renamed from: P */
    public static final C2069w f1713P;

    /* renamed from: A */
    public boolean f1714A;

    /* renamed from: B */
    public I f1715B;

    /* renamed from: C */
    public C2070x f1716C;

    /* renamed from: D */
    public final u.y f1717D;

    /* renamed from: E */
    public final C2068v f1718E;

    /* renamed from: F */
    public final C2068v f1719F;

    /* renamed from: G */
    public final String f1720G;

    /* renamed from: H */
    public final String f1721H;

    /* renamed from: I */
    public final Q7.h f1722I;

    /* renamed from: J */
    public final C2070x f1723J;

    /* renamed from: K */
    public W0 f1724K;
    public boolean L;

    /* renamed from: M */
    public final S2 f1725M;

    /* renamed from: N */
    public final ArrayList f1726N;

    /* renamed from: O */
    public final K f1727O;

    /* renamed from: d */
    public final D f1728d;

    /* renamed from: e */
    public int f1729e = Integer.MIN_VALUE;

    /* renamed from: f */
    public final K f1730f = new K(this, 0);
    public final AccessibilityManager g;

    /* renamed from: h */
    public long f1731h;

    /* renamed from: i */
    public final E f1732i;
    public final F j;
    public List k;

    /* renamed from: l */
    public final Handler f1733l;

    /* renamed from: m */
    public final H f1734m;

    /* renamed from: n */
    public int f1735n;

    /* renamed from: o */
    public int f1736o;

    /* renamed from: p */
    public z1.e f1737p;

    /* renamed from: q */
    public z1.e f1738q;

    /* renamed from: r */
    public boolean f1739r;

    /* renamed from: s */
    public final C2070x f1740s;

    /* renamed from: t */
    public final C2070x f1741t;

    /* renamed from: u */
    public final u.U f1742u;

    /* renamed from: v */
    public final u.U f1743v;

    /* renamed from: w */
    public int f1744w;

    /* renamed from: x */
    public Integer f1745x;

    /* renamed from: y */
    public final C2053f f1746y;

    /* renamed from: z */
    public final ec.d f1747z;

    static {
        int[] iArr = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
        C2069w c2069w = AbstractC2058k.f24690a;
        C2069w c2069w2 = new C2069w(32);
        int i7 = c2069w2.f24728b;
        if (i7 < 0) {
            AbstractC2121a.d("");
            throw null;
        }
        int i10 = i7 + 32;
        int[] iArr2 = c2069w2.f24727a;
        if (iArr2.length < i10) {
            int[] copyOf = Arrays.copyOf(iArr2, Math.max(i10, (iArr2.length * 3) / 2));
            kotlin.jvm.internal.l.d(copyOf, "copyOf(...)");
            c2069w2.f24727a = copyOf;
        }
        int[] iArr3 = c2069w2.f24727a;
        int i11 = c2069w2.f24728b;
        if (i7 != i11) {
            Eb.n.M(i10, i7, i11, iArr3, iArr3);
        }
        Eb.n.Q(i7, 0, 12, iArr, iArr3);
        c2069w2.f24728b += 32;
        f1713P = c2069w2;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [B0.E] */
    /* JADX WARN: Type inference failed for: r2v5, types: [B0.F] */
    public L(D d10) {
        this.f1728d = d10;
        Object systemService = d10.getContext().getSystemService("accessibility");
        kotlin.jvm.internal.l.c(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
        this.g = accessibilityManager;
        this.f1731h = 100L;
        this.f1732i = new AccessibilityManager.AccessibilityStateChangeListener() { // from class: B0.E
            @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
            public final void onAccessibilityStateChanged(boolean z8) {
                L l10 = L.this;
                l10.k = z8 ? l10.g.getEnabledAccessibilityServiceList(-1) : Eb.v.f3891a;
            }
        };
        this.j = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: B0.F
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z8) {
                L l10 = L.this;
                l10.k = l10.g.getEnabledAccessibilityServiceList(-1);
            }
        };
        this.k = accessibilityManager.getEnabledAccessibilityServiceList(-1);
        this.f1733l = new Handler(Looper.getMainLooper());
        this.f1734m = new H(this, 0);
        this.f1735n = Integer.MIN_VALUE;
        this.f1736o = Integer.MIN_VALUE;
        this.f1740s = new C2070x();
        this.f1741t = new C2070x();
        this.f1742u = new u.U(0);
        this.f1743v = new u.U(0);
        this.f1744w = -1;
        this.f1746y = new C2053f(0);
        this.f1747z = Q5.e.a(1, 0, 6);
        this.f1714A = true;
        C2070x c2070x = AbstractC2060m.f24696a;
        kotlin.jvm.internal.l.c(c2070x, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.f1716C = c2070x;
        this.f1717D = new u.y();
        this.f1718E = new C2068v();
        this.f1719F = new C2068v();
        this.f1720G = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.f1721H = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.f1722I = new Q7.h(2, (byte) 0);
        this.f1723J = new C2070x();
        H0.n a9 = d10.getSemanticsOwner().a();
        kotlin.jvm.internal.l.c(c2070x, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.f1724K = new W0(a9, c2070x);
        d10.addOnAttachStateChangeListener(new G(this, 0));
        this.f1725M = new S2(this, 5);
        this.f1726N = new ArrayList();
        this.f1727O = new K(this, 1);
    }

    public static /* synthetic */ void D(L l10, int i7, int i10, Integer num, int i11) {
        if ((i11 & 4) != 0) {
            num = null;
        }
        l10.C(i7, i10, num, null);
    }

    public static CharSequence K(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            int i7 = 100000;
            if (charSequence.length() > 100000) {
                if (Character.isHighSurrogate(charSequence.charAt(99999)) && Character.isLowSurrogate(charSequence.charAt(100000))) {
                    i7 = 99999;
                }
                CharSequence subSequence = charSequence.subSequence(0, i7);
                kotlin.jvm.internal.l.c(subSequence, "null cannot be cast to non-null type T of androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.trimToSize");
                return subSequence;
            }
        }
        return charSequence;
    }

    public static String t(H0.n nVar) {
        C0374d c0374d;
        if (nVar == null) {
            return null;
        }
        H0.t tVar = H0.q.f4539a;
        H0.i iVar = nVar.f4505d;
        C2046I c2046i = iVar.f4494a;
        if (c2046i.c(tVar)) {
            return X0.a.a(",", 62, (List) iVar.t(tVar));
        }
        H0.t tVar2 = H0.q.f4530C;
        if (c2046i.c(tVar2)) {
            Object g = c2046i.g(tVar2);
            if (g == null) {
                g = null;
            }
            C0374d c0374d2 = (C0374d) g;
            if (c0374d2 != null) {
                return c0374d2.f5871b;
            }
            return null;
        }
        Object g2 = c2046i.g(H0.q.f4560y);
        if (g2 == null) {
            g2 = null;
        }
        List list = (List) g2;
        if (list == null || (c0374d = (C0374d) Eb.o.Z(list)) == null) {
            return null;
        }
        return c0374d.f5871b;
    }

    public static final boolean w(H0.g gVar, float f4) {
        F.I i7 = gVar.f4468a;
        return (f4 < 0.0f && ((Number) i7.invoke()).floatValue() > 0.0f) || (f4 > 0.0f && ((Number) i7.invoke()).floatValue() < ((Number) gVar.f4469b.invoke()).floatValue());
    }

    public static final boolean x(H0.g gVar) {
        F.I i7 = gVar.f4468a;
        if (((Number) i7.invoke()).floatValue() > 0.0f) {
            return true;
        }
        ((Number) i7.invoke()).floatValue();
        ((Number) gVar.f4469b.invoke()).floatValue();
        return false;
    }

    public static final boolean y(H0.g gVar) {
        F.I i7 = gVar.f4468a;
        if (((Number) i7.invoke()).floatValue() < ((Number) gVar.f4469b.invoke()).floatValue()) {
            return true;
        }
        ((Number) i7.invoke()).floatValue();
        return false;
    }

    public final void A(H0.n nVar, W0 w02) {
        int[] iArr = AbstractC2061n.f24697a;
        u.y yVar = new u.y();
        List h10 = H0.n.h(4, nVar);
        int size = h10.size();
        int i7 = 0;
        while (true) {
            A0.L l10 = nVar.f4504c;
            if (i7 >= size) {
                u.y yVar2 = w02.f1806b;
                int[] iArr2 = yVar2.f24731b;
                long[] jArr = yVar2.f24730a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i10 = 0;
                    while (true) {
                        long j = jArr[i10];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i11 = 8 - ((~(i10 - length)) >>> 31);
                            for (int i12 = 0; i12 < i11; i12++) {
                                if ((255 & j) < 128 && !yVar.b(iArr2[(i10 << 3) + i12])) {
                                    v(l10);
                                    return;
                                }
                                j >>= 8;
                            }
                            if (i11 != 8) {
                                break;
                            }
                        }
                        if (i10 == length) {
                            break;
                        } else {
                            i10++;
                        }
                    }
                }
                List h11 = H0.n.h(4, nVar);
                int size2 = h11.size();
                for (int i13 = 0; i13 < size2; i13++) {
                    H0.n nVar2 = (H0.n) h11.get(i13);
                    if (s().a(nVar2.g)) {
                        Object b2 = this.f1723J.b(nVar2.g);
                        kotlin.jvm.internal.l.b(b2);
                        A(nVar2, (W0) b2);
                    }
                }
                return;
            }
            H0.n nVar3 = (H0.n) h10.get(i7);
            if (s().a(nVar3.g)) {
                u.y yVar3 = w02.f1806b;
                int i14 = nVar3.g;
                if (!yVar3.b(i14)) {
                    v(l10);
                    return;
                }
                yVar.a(i14);
            }
            i7++;
        }
    }

    public final boolean B(AccessibilityEvent accessibilityEvent) {
        if (!u()) {
            return false;
        }
        if (accessibilityEvent.getEventType() == 2048 || accessibilityEvent.getEventType() == 32768) {
            this.f1739r = true;
        }
        try {
            return ((Boolean) this.f1730f.invoke(accessibilityEvent)).booleanValue();
        } finally {
            this.f1739r = false;
        }
    }

    public final boolean C(int i7, int i10, Integer num, List list) {
        if (i7 == Integer.MIN_VALUE || !u()) {
            return false;
        }
        AccessibilityEvent o10 = o(i7, i10);
        if (num != null) {
            o10.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            o10.setContentDescription(X0.a.a(",", 62, list));
        }
        return B(o10);
    }

    public final void E(int i7, int i10, String str) {
        AccessibilityEvent o10 = o(z(i7), 32);
        o10.setContentChangeTypes(i10);
        if (str != null) {
            o10.getText().add(str);
        }
        B(o10);
    }

    public final void F(int i7) {
        I i10 = this.f1715B;
        if (i10 != null) {
            H0.n nVar = i10.f1687a;
            if (i7 != nVar.g) {
                return;
            }
            if (SystemClock.uptimeMillis() - i10.f1692f <= 1000) {
                AccessibilityEvent o10 = o(z(nVar.g), 131072);
                o10.setFromIndex(i10.f1690d);
                o10.setToIndex(i10.f1691e);
                o10.setAction(i10.f1688b);
                o10.setMovementGranularity(i10.f1689c);
                o10.getText().add(t(nVar));
                B(o10);
            }
        }
        this.f1715B = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:215:0x059c, code lost:
    
        if (r1.containsAll(r2) != false) goto L553;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x059f, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x05c1, code lost:
    
        if (r1.isEmpty() == false) goto L560;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x05fd, code lost:
    
        if (r0 != false) goto L553;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x05f5, code lost:
    
        if (r0 != null) goto L572;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x05fa, code lost:
    
        if (r0 == null) goto L572;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0180  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void G(AbstractC2059l abstractC2059l) {
        ArrayList arrayList;
        int[] iArr;
        long[] jArr;
        ArrayList arrayList2;
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        ArrayList arrayList3;
        int[] iArr2;
        long[] jArr2;
        int i14;
        int i15;
        ArrayList arrayList4;
        H0.i iVar;
        int i16;
        H0.n nVar;
        boolean z8;
        boolean z10;
        Object[] objArr;
        int i17;
        Object[] objArr2;
        C2046I c2046i;
        int i18;
        int i19;
        long[] jArr3;
        H0.i iVar2;
        int i20;
        Object[] objArr3;
        ArrayList arrayList5;
        int i21;
        Object[] objArr4;
        int i22;
        int i23;
        int i24;
        C2046I c2046i2;
        H0.n nVar2;
        char c10;
        int i25;
        int i26;
        long[] jArr4;
        ArrayList arrayList6;
        int i27;
        V0 v02;
        boolean z11;
        H0.t tVar;
        char c11;
        C2046I c2046i3;
        ArrayList arrayList7;
        boolean z12;
        boolean z13;
        V0 v03;
        String str;
        AccessibilityEvent p10;
        char c12;
        AbstractC2059l abstractC2059l2 = abstractC2059l;
        ArrayList arrayList8 = this.f1726N;
        ArrayList arrayList9 = new ArrayList(arrayList8);
        arrayList8.clear();
        int[] iArr3 = abstractC2059l2.f24692b;
        long[] jArr5 = abstractC2059l2.f24691a;
        int length = jArr5.length - 2;
        if (length < 0) {
            return;
        }
        int i28 = 0;
        while (true) {
            long j = jArr5[i28];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i29 = 8;
                int i30 = 8 - ((~(i28 - length)) >>> 31);
                long j10 = j;
                int i31 = 0;
                while (i31 < i30) {
                    if ((j10 & 255) < 128) {
                        int i32 = iArr3[(i28 << 3) + i31];
                        W0 w02 = (W0) this.f1723J.b(i32);
                        if (w02 != null) {
                            X0 x02 = (X0) abstractC2059l2.b(i32);
                            H0.n nVar3 = x02 != null ? x02.f1809a : null;
                            if (nVar3 == null) {
                                throw X.c.c("no value for specified key");
                            }
                            H0.i iVar3 = nVar3.f4505d;
                            C2046I c2046i4 = iVar3.f4494a;
                            Object[] objArr5 = c2046i4.f24604b;
                            Object[] objArr6 = c2046i4.f24605c;
                            iArr2 = iArr3;
                            long[] jArr6 = c2046i4.f24603a;
                            i11 = i31;
                            int length2 = jArr6.length - 2;
                            H0.i iVar4 = w02.f1805a;
                            jArr2 = jArr5;
                            if (length2 >= 0) {
                                int i33 = i30;
                                C2046I c2046i5 = c2046i4;
                                int i34 = 0;
                                z8 = false;
                                while (true) {
                                    long j11 = jArr6[i34];
                                    i14 = length;
                                    H0.n nVar4 = nVar3;
                                    if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i35 = 8 - ((~(i34 - length2)) >>> 31);
                                        long j12 = j11;
                                        int i36 = 0;
                                        while (i36 < i35) {
                                            if ((j12 & 255) < 128) {
                                                int i37 = (i34 << 3) + i36;
                                                Object obj = objArr5[i37];
                                                Object obj2 = objArr6[i37];
                                                H0.t tVar2 = (H0.t) obj;
                                                int i38 = length2;
                                                H0.t tVar3 = H0.q.f4554s;
                                                if (kotlin.jvm.internal.l.a(tVar2, tVar3)) {
                                                    i27 = i28;
                                                } else {
                                                    i27 = i28;
                                                    if (!kotlin.jvm.internal.l.a(tVar2, H0.q.f4555t)) {
                                                        objArr3 = objArr6;
                                                        z11 = false;
                                                        C2046I c2046i6 = iVar4.f4494a;
                                                        if (!z11) {
                                                            Object g = c2046i6.g(tVar2);
                                                            if (g == null) {
                                                                g = null;
                                                            }
                                                            if (kotlin.jvm.internal.l.a(obj2, g)) {
                                                                iVar2 = iVar4;
                                                                arrayList5 = arrayList9;
                                                                i21 = i34;
                                                                objArr4 = objArr5;
                                                                i22 = i35;
                                                                i23 = i36;
                                                                i24 = i33;
                                                                c2046i2 = c2046i5;
                                                                nVar2 = nVar4;
                                                                i26 = i38;
                                                                i20 = i27;
                                                                c10 = '\b';
                                                                i25 = i32;
                                                            }
                                                        }
                                                        tVar = H0.q.f4542d;
                                                        if (kotlin.jvm.internal.l.a(tVar2, tVar)) {
                                                            if (kotlin.jvm.internal.l.a(tVar2, H0.q.f4540b) ? true : kotlin.jvm.internal.l.a(tVar2, H0.q.f4533F)) {
                                                                c11 = '\b';
                                                                D(this, z(i32), 2048, 64, 8);
                                                                D(this, z(i32), 2048, 0, 8);
                                                                iVar2 = iVar4;
                                                            } else {
                                                                iVar2 = iVar4;
                                                                c11 = '\b';
                                                                if (kotlin.jvm.internal.l.a(tVar2, H0.q.f4541c)) {
                                                                    D(this, z(i32), 2048, 64, 8);
                                                                    D(this, z(i32), 2048, 0, 8);
                                                                } else {
                                                                    H0.t tVar4 = H0.q.f4532E;
                                                                    boolean a9 = kotlin.jvm.internal.l.a(tVar2, tVar4);
                                                                    arrayList5 = arrayList9;
                                                                    nVar2 = nVar4;
                                                                    jArr4 = jArr6;
                                                                    A0.L l10 = nVar2.f4504c;
                                                                    objArr4 = objArr5;
                                                                    if (a9) {
                                                                        c2046i3 = c2046i5;
                                                                        Object g2 = c2046i3.g(H0.q.f4557v);
                                                                        if (g2 == null) {
                                                                            g2 = null;
                                                                        }
                                                                        if (((H0.f) g2) == null ? false : H0.f.a(5, 4)) {
                                                                            Object g10 = c2046i3.g(tVar4);
                                                                            if (g10 == null) {
                                                                                g10 = null;
                                                                            }
                                                                            if (kotlin.jvm.internal.l.a(g10, Boolean.TRUE)) {
                                                                                AccessibilityEvent o10 = o(z(i32), 4);
                                                                                H0.n nVar5 = new H0.n(nVar2.f4502a, true, l10, iVar3);
                                                                                Object g11 = nVar5.i().f4494a.g(H0.q.f4539a);
                                                                                if (g11 == null) {
                                                                                    g11 = null;
                                                                                }
                                                                                List list = (List) g11;
                                                                                String a10 = list != null ? X0.a.a(",", 62, list) : null;
                                                                                Object g12 = nVar5.i().f4494a.g(H0.q.f4560y);
                                                                                if (g12 == null) {
                                                                                    g12 = null;
                                                                                }
                                                                                List list2 = (List) g12;
                                                                                String a11 = list2 != null ? X0.a.a(",", 62, list2) : null;
                                                                                if (a10 != null) {
                                                                                    o10.setContentDescription(a10);
                                                                                }
                                                                                if (a11 != null) {
                                                                                    o10.getText().add(a11);
                                                                                }
                                                                                B(o10);
                                                                                i25 = i32;
                                                                                arrayList6 = arrayList8;
                                                                                i21 = i34;
                                                                                i22 = i35;
                                                                                i23 = i36;
                                                                                i24 = i33;
                                                                                i20 = i27;
                                                                                c10 = '\b';
                                                                            } else {
                                                                                c12 = '\b';
                                                                                D(this, z(i32), 2048, 0, 8);
                                                                            }
                                                                        } else {
                                                                            c12 = '\b';
                                                                            D(this, z(i32), 2048, 64, 8);
                                                                            D(this, z(i32), 2048, 0, 8);
                                                                        }
                                                                        i25 = i32;
                                                                        arrayList6 = arrayList8;
                                                                        i21 = i34;
                                                                        i22 = i35;
                                                                        i23 = i36;
                                                                        i24 = i33;
                                                                        i20 = i27;
                                                                        c10 = c12;
                                                                    } else {
                                                                        c2046i3 = c2046i5;
                                                                        if (kotlin.jvm.internal.l.a(tVar2, H0.q.f4539a)) {
                                                                            int z14 = z(i32);
                                                                            kotlin.jvm.internal.l.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                                                                            C(z14, 2048, 4, (List) obj2);
                                                                            i25 = i32;
                                                                            arrayList6 = arrayList8;
                                                                            i21 = i34;
                                                                            i22 = i35;
                                                                            i23 = i36;
                                                                            c10 = '\b';
                                                                            i24 = i33;
                                                                            i20 = i27;
                                                                        } else {
                                                                            H0.t tVar5 = H0.q.f4530C;
                                                                            String str2 = "";
                                                                            if (!kotlin.jvm.internal.l.a(tVar2, tVar5)) {
                                                                                i25 = i32;
                                                                                arrayList7 = arrayList8;
                                                                                i21 = i34;
                                                                                i22 = i35;
                                                                                i23 = i36;
                                                                                c10 = '\b';
                                                                                i24 = i33;
                                                                                i20 = i27;
                                                                                c2046i2 = c2046i3;
                                                                                i26 = i38;
                                                                                H0.t tVar6 = H0.q.f4531D;
                                                                                boolean a12 = kotlin.jvm.internal.l.a(tVar2, tVar6);
                                                                                int i39 = nVar2.g;
                                                                                if (a12) {
                                                                                    Object g13 = c2046i2.g(tVar5);
                                                                                    if (g13 == null) {
                                                                                        g13 = null;
                                                                                    }
                                                                                    C0374d c0374d = (C0374d) g13;
                                                                                    if (c0374d != null && (str = c0374d.f5871b) != null) {
                                                                                        str2 = str;
                                                                                    }
                                                                                    K0.E e2 = (K0.E) iVar3.t(tVar6);
                                                                                    int z15 = z(i25);
                                                                                    long j13 = e2.f5853a;
                                                                                    B(p(z15, Integer.valueOf((int) (j13 >> 32)), Integer.valueOf((int) (j13 & 4294967295L)), Integer.valueOf(str2.length()), K(str2)));
                                                                                    F(i39);
                                                                                } else {
                                                                                    if (kotlin.jvm.internal.l.a(tVar2, tVar3) ? true : kotlin.jvm.internal.l.a(tVar2, H0.q.f4555t)) {
                                                                                        v(l10);
                                                                                        int size = arrayList7.size();
                                                                                        int i40 = 0;
                                                                                        while (true) {
                                                                                            if (i40 >= size) {
                                                                                                arrayList6 = arrayList7;
                                                                                                v03 = null;
                                                                                                break;
                                                                                            }
                                                                                            arrayList6 = arrayList7;
                                                                                            if (((V0) arrayList6.get(i40)).f1798a == i25) {
                                                                                                v03 = (V0) arrayList6.get(i40);
                                                                                                break;
                                                                                            } else {
                                                                                                i40++;
                                                                                                arrayList7 = arrayList6;
                                                                                            }
                                                                                        }
                                                                                        kotlin.jvm.internal.l.b(v03);
                                                                                        Object g14 = c2046i2.g(tVar3);
                                                                                        if (g14 == null) {
                                                                                            g14 = null;
                                                                                        }
                                                                                        v03.f1802e = (H0.g) g14;
                                                                                        Object g15 = c2046i2.g(H0.q.f4555t);
                                                                                        if (g15 == null) {
                                                                                            g15 = null;
                                                                                        }
                                                                                        v03.f1803f = (H0.g) g15;
                                                                                        if (v03.f1799b.contains(v03)) {
                                                                                            this.f1728d.getSnapshotObserver().a(v03, this.f1727O, new A0.K(6, v03, this));
                                                                                        }
                                                                                    } else {
                                                                                        arrayList6 = arrayList7;
                                                                                        if (kotlin.jvm.internal.l.a(tVar2, H0.q.k)) {
                                                                                            kotlin.jvm.internal.l.c(obj2, "null cannot be cast to non-null type kotlin.Boolean");
                                                                                            if (((Boolean) obj2).booleanValue()) {
                                                                                                B(o(z(i39), 8));
                                                                                            }
                                                                                            D(this, z(i39), 2048, 0, 8);
                                                                                        } else {
                                                                                            H0.t tVar7 = H0.h.f4489v;
                                                                                            if (kotlin.jvm.internal.l.a(tVar2, tVar7)) {
                                                                                                List list3 = (List) iVar3.t(tVar7);
                                                                                                Object g16 = c2046i6.g(tVar7);
                                                                                                if (g16 == null) {
                                                                                                    g16 = null;
                                                                                                }
                                                                                                List list4 = (List) g16;
                                                                                                if (list4 != null) {
                                                                                                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                                                                                                    if (list3.size() > 0) {
                                                                                                        list3.get(0).getClass();
                                                                                                        throw new ClassCastException();
                                                                                                    }
                                                                                                    LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                                                                                                    if (list4.size() > 0) {
                                                                                                        list4.get(0).getClass();
                                                                                                        throw new ClassCastException();
                                                                                                    }
                                                                                                    if (linkedHashSet.containsAll(linkedHashSet2)) {
                                                                                                    }
                                                                                                }
                                                                                                z13 = true;
                                                                                            } else {
                                                                                                if (obj2 instanceof H0.a) {
                                                                                                    H0.a aVar = (H0.a) obj2;
                                                                                                    Object g17 = c2046i6.g(tVar2);
                                                                                                    if (g17 == null) {
                                                                                                        g17 = null;
                                                                                                    }
                                                                                                    Comparator[] comparatorArr = P.f1769a;
                                                                                                    if (aVar != g17) {
                                                                                                        if (g17 instanceof H0.a) {
                                                                                                            H0.a aVar2 = (H0.a) g17;
                                                                                                            if (kotlin.jvm.internal.l.a(aVar.f4460a, aVar2.f4460a)) {
                                                                                                                Db.c cVar = aVar2.f4461b;
                                                                                                                Db.c cVar2 = aVar.f4461b;
                                                                                                                if (cVar2 == null) {
                                                                                                                }
                                                                                                                if (cVar2 != null) {
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                        z12 = false;
                                                                                                    }
                                                                                                    z12 = true;
                                                                                                }
                                                                                                z13 = true;
                                                                                            }
                                                                                            z8 = z13;
                                                                                            j12 >>= c10;
                                                                                            length2 = i26;
                                                                                            arrayList8 = arrayList6;
                                                                                            c2046i5 = c2046i2;
                                                                                            jArr6 = jArr4;
                                                                                            objArr6 = objArr3;
                                                                                            iVar4 = iVar2;
                                                                                            i34 = i21;
                                                                                            i35 = i22;
                                                                                            i33 = i24;
                                                                                            i28 = i20;
                                                                                            i36 = i23 + 1;
                                                                                            nVar4 = nVar2;
                                                                                            i32 = i25;
                                                                                            arrayList9 = arrayList5;
                                                                                            objArr5 = objArr4;
                                                                                        }
                                                                                    }
                                                                                    z13 = z8;
                                                                                    z8 = z13;
                                                                                    j12 >>= c10;
                                                                                    length2 = i26;
                                                                                    arrayList8 = arrayList6;
                                                                                    c2046i5 = c2046i2;
                                                                                    jArr6 = jArr4;
                                                                                    objArr6 = objArr3;
                                                                                    iVar4 = iVar2;
                                                                                    i34 = i21;
                                                                                    i35 = i22;
                                                                                    i33 = i24;
                                                                                    i28 = i20;
                                                                                    i36 = i23 + 1;
                                                                                    nVar4 = nVar2;
                                                                                    i32 = i25;
                                                                                    arrayList9 = arrayList5;
                                                                                    objArr5 = objArr4;
                                                                                }
                                                                            } else if (c2046i3.c(H0.h.j)) {
                                                                                Object g18 = c2046i6.g(tVar5);
                                                                                if (g18 == null) {
                                                                                    g18 = null;
                                                                                }
                                                                                C0374d c0374d2 = (C0374d) g18;
                                                                                if (c0374d2 == null) {
                                                                                    c0374d2 = "";
                                                                                }
                                                                                Object g19 = c2046i3.g(tVar5);
                                                                                if (g19 == null) {
                                                                                    g19 = null;
                                                                                }
                                                                                CharSequence charSequence = (C0374d) g19;
                                                                                if (charSequence == null) {
                                                                                    charSequence = "";
                                                                                }
                                                                                CharSequence K10 = K(charSequence);
                                                                                int length3 = c0374d2.length();
                                                                                int length4 = charSequence.length();
                                                                                int i41 = length3 > length4 ? length4 : length3;
                                                                                i21 = i34;
                                                                                int i42 = 0;
                                                                                while (true) {
                                                                                    i22 = i35;
                                                                                    if (i42 >= i41) {
                                                                                        i23 = i36;
                                                                                        break;
                                                                                    }
                                                                                    i23 = i36;
                                                                                    if (c0374d2.charAt(i42) != charSequence.charAt(i42)) {
                                                                                        break;
                                                                                    }
                                                                                    i42++;
                                                                                    i35 = i22;
                                                                                    i36 = i23;
                                                                                }
                                                                                arrayList7 = arrayList8;
                                                                                int i43 = 0;
                                                                                while (i43 < i41 - i42 && c0374d2.charAt((length3 - 1) - i43) == charSequence.charAt((length4 - 1) - i43)) {
                                                                                    i43++;
                                                                                }
                                                                                int i44 = (length3 - i43) - i42;
                                                                                int i45 = (length4 - i43) - i42;
                                                                                H0.t tVar8 = H0.q.f4534G;
                                                                                boolean c13 = c2046i6.c(tVar8);
                                                                                boolean c14 = c2046i3.c(tVar8);
                                                                                boolean c15 = c2046i6.c(H0.q.f4530C);
                                                                                boolean z16 = c15 && !c13 && c14;
                                                                                boolean z17 = c15 && c13 && !c14;
                                                                                if (z16 || z17) {
                                                                                    i25 = i32;
                                                                                    i26 = i38;
                                                                                    i24 = i33;
                                                                                    i11 = i11;
                                                                                    c2046i2 = c2046i3;
                                                                                    i20 = i27;
                                                                                    c10 = '\b';
                                                                                    p10 = p(z(i32), 0, 0, Integer.valueOf(length4), K10);
                                                                                } else {
                                                                                    p10 = o(z(i32), 16);
                                                                                    p10.setFromIndex(i42);
                                                                                    p10.setRemovedCount(i44);
                                                                                    p10.setAddedCount(i45);
                                                                                    p10.setBeforeText(c0374d2);
                                                                                    p10.getText().add(K10);
                                                                                    i25 = i32;
                                                                                    c2046i2 = c2046i3;
                                                                                    c10 = '\b';
                                                                                    i24 = i33;
                                                                                    i26 = i38;
                                                                                    i20 = i27;
                                                                                }
                                                                                p10.setClassName("android.widget.EditText");
                                                                                B(p10);
                                                                                if (z16 || z17) {
                                                                                    long j14 = ((K0.E) iVar3.t(H0.q.f4531D)).f5853a;
                                                                                    p10.setFromIndex((int) (j14 >> 32));
                                                                                    p10.setToIndex((int) (j14 & 4294967295L));
                                                                                    B(p10);
                                                                                }
                                                                            } else {
                                                                                i25 = i32;
                                                                                arrayList7 = arrayList8;
                                                                                i21 = i34;
                                                                                i22 = i35;
                                                                                i23 = i36;
                                                                                c10 = '\b';
                                                                                i24 = i33;
                                                                                i20 = i27;
                                                                                c2046i2 = c2046i3;
                                                                                i26 = i38;
                                                                                D(this, z(i25), 2048, 2, 8);
                                                                            }
                                                                            arrayList6 = arrayList7;
                                                                            z13 = z8;
                                                                            z8 = z13;
                                                                            j12 >>= c10;
                                                                            length2 = i26;
                                                                            arrayList8 = arrayList6;
                                                                            c2046i5 = c2046i2;
                                                                            jArr6 = jArr4;
                                                                            objArr6 = objArr3;
                                                                            iVar4 = iVar2;
                                                                            i34 = i21;
                                                                            i35 = i22;
                                                                            i33 = i24;
                                                                            i28 = i20;
                                                                            i36 = i23 + 1;
                                                                            nVar4 = nVar2;
                                                                            i32 = i25;
                                                                            arrayList9 = arrayList5;
                                                                            objArr5 = objArr4;
                                                                        }
                                                                    }
                                                                    c2046i2 = c2046i3;
                                                                    i26 = i38;
                                                                    z13 = z8;
                                                                    z8 = z13;
                                                                    j12 >>= c10;
                                                                    length2 = i26;
                                                                    arrayList8 = arrayList6;
                                                                    c2046i5 = c2046i2;
                                                                    jArr6 = jArr4;
                                                                    objArr6 = objArr3;
                                                                    iVar4 = iVar2;
                                                                    i34 = i21;
                                                                    i35 = i22;
                                                                    i33 = i24;
                                                                    i28 = i20;
                                                                    i36 = i23 + 1;
                                                                    nVar4 = nVar2;
                                                                    i32 = i25;
                                                                    arrayList9 = arrayList5;
                                                                    objArr5 = objArr4;
                                                                }
                                                            }
                                                            arrayList5 = arrayList9;
                                                            i21 = i34;
                                                            objArr4 = objArr5;
                                                            i22 = i35;
                                                            i23 = i36;
                                                            i24 = i33;
                                                            c2046i2 = c2046i5;
                                                            nVar2 = nVar4;
                                                            i20 = i27;
                                                            i25 = i32;
                                                            c10 = c11;
                                                            jArr4 = jArr6;
                                                            i26 = i38;
                                                        } else {
                                                            kotlin.jvm.internal.l.c(obj2, "null cannot be cast to non-null type kotlin.String");
                                                            String str3 = (String) obj2;
                                                            if (c2046i6.c(tVar)) {
                                                                E(i32, 8, str3);
                                                                iVar2 = iVar4;
                                                                arrayList5 = arrayList9;
                                                                i21 = i34;
                                                                objArr4 = objArr5;
                                                                i22 = i35;
                                                                i23 = i36;
                                                                i24 = i33;
                                                                c2046i2 = c2046i5;
                                                                nVar2 = nVar4;
                                                                i26 = i38;
                                                                i20 = i27;
                                                                i25 = i32;
                                                                c10 = '\b';
                                                            } else {
                                                                iVar2 = iVar4;
                                                                arrayList5 = arrayList9;
                                                                i21 = i34;
                                                                objArr4 = objArr5;
                                                                i22 = i35;
                                                                i23 = i36;
                                                                i24 = i33;
                                                                c2046i2 = c2046i5;
                                                                nVar2 = nVar4;
                                                                i26 = i38;
                                                                i20 = i27;
                                                                c10 = '\b';
                                                                i25 = i32;
                                                            }
                                                            jArr4 = jArr6;
                                                        }
                                                        arrayList6 = arrayList8;
                                                        z13 = z8;
                                                        z8 = z13;
                                                        j12 >>= c10;
                                                        length2 = i26;
                                                        arrayList8 = arrayList6;
                                                        c2046i5 = c2046i2;
                                                        jArr6 = jArr4;
                                                        objArr6 = objArr3;
                                                        iVar4 = iVar2;
                                                        i34 = i21;
                                                        i35 = i22;
                                                        i33 = i24;
                                                        i28 = i20;
                                                        i36 = i23 + 1;
                                                        nVar4 = nVar2;
                                                        i32 = i25;
                                                        arrayList9 = arrayList5;
                                                        objArr5 = objArr4;
                                                    }
                                                }
                                                int size2 = arrayList9.size();
                                                objArr3 = objArr6;
                                                int i46 = 0;
                                                while (true) {
                                                    if (i46 >= size2) {
                                                        v02 = null;
                                                        break;
                                                    }
                                                    int i47 = size2;
                                                    if (((V0) arrayList9.get(i46)).f1798a == i32) {
                                                        v02 = (V0) arrayList9.get(i46);
                                                        break;
                                                    } else {
                                                        i46++;
                                                        size2 = i47;
                                                    }
                                                }
                                                if (v02 != null) {
                                                    z11 = false;
                                                } else {
                                                    v02 = new V0(i32, arrayList8);
                                                    z11 = true;
                                                }
                                                arrayList8.add(v02);
                                                C2046I c2046i62 = iVar4.f4494a;
                                                if (!z11) {
                                                }
                                                tVar = H0.q.f4542d;
                                                if (kotlin.jvm.internal.l.a(tVar2, tVar)) {
                                                }
                                                arrayList6 = arrayList8;
                                                z13 = z8;
                                                z8 = z13;
                                                j12 >>= c10;
                                                length2 = i26;
                                                arrayList8 = arrayList6;
                                                c2046i5 = c2046i2;
                                                jArr6 = jArr4;
                                                objArr6 = objArr3;
                                                iVar4 = iVar2;
                                                i34 = i21;
                                                i35 = i22;
                                                i33 = i24;
                                                i28 = i20;
                                                i36 = i23 + 1;
                                                nVar4 = nVar2;
                                                i32 = i25;
                                                arrayList9 = arrayList5;
                                                objArr5 = objArr4;
                                            } else {
                                                iVar2 = iVar4;
                                                i20 = i28;
                                                objArr3 = objArr6;
                                                arrayList5 = arrayList9;
                                                i21 = i34;
                                                objArr4 = objArr5;
                                                i22 = i35;
                                                i23 = i36;
                                                i24 = i33;
                                                c2046i2 = c2046i5;
                                                nVar2 = nVar4;
                                                c10 = '\b';
                                                i25 = i32;
                                                i26 = length2;
                                            }
                                            jArr4 = jArr6;
                                            arrayList6 = arrayList8;
                                            j12 >>= c10;
                                            length2 = i26;
                                            arrayList8 = arrayList6;
                                            c2046i5 = c2046i2;
                                            jArr6 = jArr4;
                                            objArr6 = objArr3;
                                            iVar4 = iVar2;
                                            i34 = i21;
                                            i35 = i22;
                                            i33 = i24;
                                            i28 = i20;
                                            i36 = i23 + 1;
                                            nVar4 = nVar2;
                                            i32 = i25;
                                            arrayList9 = arrayList5;
                                            objArr5 = objArr4;
                                        }
                                        iVar = iVar4;
                                        i13 = i28;
                                        objArr = objArr6;
                                        arrayList3 = arrayList9;
                                        i17 = i34;
                                        objArr2 = objArr5;
                                        i12 = i33;
                                        c2046i = c2046i5;
                                        nVar = nVar4;
                                        i18 = 1;
                                        i15 = 8;
                                        i16 = i32;
                                        i19 = length2;
                                        jArr3 = jArr6;
                                        arrayList4 = arrayList8;
                                        if (i35 != 8) {
                                            break;
                                        }
                                    } else {
                                        iVar = iVar4;
                                        i13 = i28;
                                        objArr = objArr6;
                                        arrayList3 = arrayList9;
                                        i17 = i34;
                                        objArr2 = objArr5;
                                        i12 = i33;
                                        c2046i = c2046i5;
                                        nVar = nVar4;
                                        i18 = 1;
                                        i15 = 8;
                                        i16 = i32;
                                        i19 = length2;
                                        jArr3 = jArr6;
                                        arrayList4 = arrayList8;
                                    }
                                    int i48 = i17;
                                    if (i48 == i19) {
                                        break;
                                    }
                                    i34 = i48 + i18;
                                    length2 = i19;
                                    arrayList8 = arrayList4;
                                    i32 = i16;
                                    c2046i5 = c2046i;
                                    length = i14;
                                    jArr6 = jArr3;
                                    objArr6 = objArr;
                                    iVar4 = iVar;
                                    objArr5 = objArr2;
                                    i33 = i12;
                                    i28 = i13;
                                    nVar3 = nVar;
                                    arrayList9 = arrayList3;
                                }
                            } else {
                                iVar = iVar4;
                                i16 = i32;
                                i12 = i30;
                                i13 = i28;
                                arrayList3 = arrayList9;
                                arrayList4 = arrayList8;
                                i14 = length;
                                nVar = nVar3;
                                i15 = 8;
                                z8 = false;
                            }
                            if (!z8) {
                                Comparator[] comparatorArr2 = P.f1769a;
                                Iterator it = iVar.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        z10 = false;
                                        break;
                                    }
                                    if (!nVar.i().f4494a.c((H0.t) ((Map.Entry) it.next()).getKey())) {
                                        z10 = true;
                                        break;
                                    }
                                }
                                z8 = z10;
                            }
                            if (z8) {
                                D(this, z(i16), 2048, 0, i15);
                            }
                            j10 >>= i15;
                            i31 = i11 + 1;
                            abstractC2059l2 = abstractC2059l;
                            arrayList8 = arrayList4;
                            i29 = i15;
                            iArr3 = iArr2;
                            jArr5 = jArr2;
                            length = i14;
                            arrayList9 = arrayList3;
                            i30 = i12;
                            i28 = i13;
                        }
                    }
                    i11 = i31;
                    i12 = i30;
                    i13 = i28;
                    arrayList3 = arrayList9;
                    iArr2 = iArr3;
                    jArr2 = jArr5;
                    i14 = length;
                    i15 = i29;
                    arrayList4 = arrayList8;
                    j10 >>= i15;
                    i31 = i11 + 1;
                    abstractC2059l2 = abstractC2059l;
                    arrayList8 = arrayList4;
                    i29 = i15;
                    iArr3 = iArr2;
                    jArr5 = jArr2;
                    length = i14;
                    arrayList9 = arrayList3;
                    i30 = i12;
                    i28 = i13;
                }
                int i49 = i28;
                arrayList = arrayList9;
                iArr = iArr3;
                jArr = jArr5;
                int i50 = length;
                arrayList2 = arrayList8;
                if (i30 != i29) {
                    return;
                }
                i10 = i50;
                i7 = i49;
            } else {
                arrayList = arrayList9;
                iArr = iArr3;
                jArr = jArr5;
                arrayList2 = arrayList8;
                i7 = i28;
                i10 = length;
            }
            if (i7 == i10) {
                return;
            }
            i28 = i7 + 1;
            abstractC2059l2 = abstractC2059l;
            length = i10;
            arrayList8 = arrayList2;
            iArr3 = iArr;
            jArr5 = jArr;
            arrayList9 = arrayList;
        }
    }

    public final void H(A0.L l10, u.y yVar) {
        H0.i v10;
        if (l10.F() && !this.f1728d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(l10)) {
            A0.L l11 = null;
            if (!l10.f60S.d(8)) {
                l10 = l10.t();
                while (true) {
                    if (l10 == null) {
                        l10 = null;
                        break;
                    } else if (l10.f60S.d(8)) {
                        break;
                    } else {
                        l10 = l10.t();
                    }
                }
            }
            if (l10 == null || (v10 = l10.v()) == null) {
                return;
            }
            if (!v10.f4496c) {
                A0.L t5 = l10.t();
                while (true) {
                    if (t5 != null) {
                        H0.i v11 = t5.v();
                        if (v11 != null && v11.f4496c) {
                            l11 = t5;
                            break;
                        }
                        t5 = t5.t();
                    } else {
                        break;
                    }
                }
                if (l11 != null) {
                    l10 = l11;
                }
            }
            int i7 = l10.f70b;
            if (yVar.a(i7)) {
                D(this, z(i7), 2048, 1, 8);
            }
        }
    }

    public final void I(A0.L l10) {
        if (l10.F() && !this.f1728d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(l10)) {
            int i7 = l10.f70b;
            H0.g gVar = (H0.g) this.f1740s.b(i7);
            H0.g gVar2 = (H0.g) this.f1741t.b(i7);
            if (gVar == null && gVar2 == null) {
                return;
            }
            AccessibilityEvent o10 = o(i7, 4096);
            if (gVar != null) {
                o10.setScrollX((int) ((Number) gVar.f4468a.invoke()).floatValue());
                o10.setMaxScrollX((int) ((Number) gVar.f4469b.invoke()).floatValue());
            }
            if (gVar2 != null) {
                o10.setScrollY((int) ((Number) gVar2.f4468a.invoke()).floatValue());
                o10.setMaxScrollY((int) ((Number) gVar2.f4469b.invoke()).floatValue());
            }
            B(o10);
        }
    }

    public final boolean J(H0.n nVar, int i7, int i10, boolean z8) {
        String t5;
        H0.i iVar = nVar.f4505d;
        H0.t tVar = H0.h.f4478i;
        if (iVar.f4494a.c(tVar) && P.a(nVar)) {
            Rb.f fVar = (Rb.f) ((H0.a) nVar.f4505d.t(tVar)).f4461b;
            if (fVar != null) {
                return ((Boolean) fVar.a(Integer.valueOf(i7), Integer.valueOf(i10), Boolean.valueOf(z8))).booleanValue();
            }
            return false;
        }
        if ((i7 == i10 && i10 == this.f1744w) || (t5 = t(nVar)) == null) {
            return false;
        }
        if (i7 < 0 || i7 != i10 || i10 > t5.length()) {
            i7 = -1;
        }
        this.f1744w = i7;
        boolean z10 = t5.length() > 0;
        int i11 = nVar.g;
        B(p(z(i11), z10 ? Integer.valueOf(this.f1744w) : null, z10 ? Integer.valueOf(this.f1744w) : null, z10 ? Integer.valueOf(t5.length()) : null, t5));
        F(i11);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0140, code lost:
    
        r28 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x014e, code lost:
    
        if (((r0 & ((~r0) << 6)) & (-9187201950435737472L)) == 0) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0150, code lost:
    
        r24 = -1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void L() {
        L l10;
        long[] jArr;
        int[] iArr;
        long[] jArr2;
        int i7;
        int i10;
        int[] iArr2;
        int i11;
        int i12;
        u.y yVar = new u.y();
        u.y yVar2 = this.f1717D;
        int[] iArr3 = yVar2.f24731b;
        long[] jArr3 = yVar2.f24730a;
        int length = jArr3.length - 2;
        C2070x c2070x = this.f1723J;
        char c10 = 7;
        long j = -9187201950435737472L;
        int i13 = 8;
        if (length >= 0) {
            int i14 = 0;
            while (true) {
                long j10 = jArr3[i14];
                if ((((~j10) << c10) & j10 & j) != j) {
                    int i15 = 8 - ((~(i14 - length)) >>> 31);
                    for (int i16 = 0; i16 < i15; i16++) {
                        if ((j10 & 255) < 128) {
                            int i17 = iArr3[(i14 << 3) + i16];
                            X0 x02 = (X0) s().b(i17);
                            H0.n nVar = x02 != null ? x02.f1809a : null;
                            if (nVar != null) {
                                if (nVar.f4505d.f4494a.c(H0.q.f4542d)) {
                                }
                            }
                            yVar.a(i17);
                            W0 w02 = (W0) c2070x.b(i17);
                            if (w02 != null) {
                                Object g = w02.f1805a.f4494a.g(H0.q.f4542d);
                                r20 = g != 0 ? g : null;
                            }
                            E(i17, 32, r20);
                        }
                        j10 >>= 8;
                    }
                    if (i15 != 8) {
                        break;
                    }
                }
                if (i14 == length) {
                    break;
                }
                i14++;
                c10 = 7;
                j = -9187201950435737472L;
            }
        }
        int[] iArr4 = yVar.f24731b;
        long[] jArr4 = yVar.f24730a;
        int length2 = jArr4.length - 2;
        if (length2 >= 0) {
            int i18 = 0;
            while (true) {
                long j11 = jArr4[i18];
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i19 = 8 - ((~(i18 - length2)) >>> 31);
                    int i20 = 0;
                    while (i20 < i19) {
                        if ((j11 & 255) < 128) {
                            int i21 = iArr4[(i18 << 3) + i20];
                            int hashCode = Integer.hashCode(i21) * (-862048943);
                            int i22 = hashCode ^ (hashCode << 16);
                            int i23 = i22 & 127;
                            int i24 = yVar2.f24732c;
                            int i25 = (i22 >>> 7) & i24;
                            int i26 = 0;
                            while (true) {
                                long[] jArr5 = yVar2.f24730a;
                                int i27 = i25 >> 3;
                                jArr2 = jArr4;
                                int i28 = (i25 & 7) << 3;
                                long j12 = (jArr5[i27] >>> i28) | ((jArr5[i27 + 1] << (64 - i28)) & ((-i28) >> 63));
                                iArr2 = iArr4;
                                i7 = length2;
                                long j13 = (i23 * 72340172838076673L) ^ j12;
                                long j14 = (j13 - 72340172838076673L) & (~j13) & (-9187201950435737472L);
                                while (true) {
                                    if (j14 == 0) {
                                        break;
                                    }
                                    i12 = (i25 + (Long.numberOfTrailingZeros(j14) >> 3)) & i24;
                                    int i29 = i23;
                                    if (yVar2.f24731b[i12] == i21) {
                                        break;
                                    }
                                    j14 &= j14 - 1;
                                    i23 = i29;
                                }
                                i26 += 8;
                                i25 = (i25 + i26) & i24;
                                iArr4 = iArr2;
                                length2 = i7;
                                jArr4 = jArr2;
                                i23 = i11;
                            }
                            int i30 = i12;
                            if (i30 >= 0) {
                                yVar2.f(i30);
                            }
                            i10 = 8;
                        } else {
                            jArr2 = jArr4;
                            i7 = length2;
                            i10 = i13;
                            iArr2 = iArr4;
                        }
                        j11 >>= i10;
                        i20++;
                        iArr4 = iArr2;
                        length2 = i7;
                        jArr4 = jArr2;
                        i13 = i10;
                    }
                    jArr = jArr4;
                    int i31 = length2;
                    int i32 = i13;
                    iArr = iArr4;
                    if (i19 != i32) {
                        break;
                    } else {
                        length2 = i31;
                    }
                } else {
                    jArr = jArr4;
                    iArr = iArr4;
                }
                if (i18 == length2) {
                    break;
                }
                i18++;
                iArr4 = iArr;
                jArr4 = jArr;
                i13 = 8;
            }
        }
        c2070x.c();
        AbstractC2059l s3 = s();
        int[] iArr5 = s3.f24692b;
        Object[] objArr = s3.f24693c;
        long[] jArr6 = s3.f24691a;
        int length3 = jArr6.length - 2;
        if (length3 >= 0) {
            int i33 = 0;
            while (true) {
                long j15 = jArr6[i33];
                if ((((~j15) << 7) & j15 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i34 = 8 - ((~(i33 - length3)) >>> 31);
                    for (int i35 = 0; i35 < i34; i35++) {
                        if ((j15 & 255) < 128) {
                            int i36 = (i33 << 3) + i35;
                            int i37 = iArr5[i36];
                            X0 x03 = (X0) objArr[i36];
                            H0.i iVar = x03.f1809a.f4505d;
                            H0.t tVar = H0.q.f4542d;
                            boolean c11 = iVar.f4494a.c(tVar);
                            H0.n nVar2 = x03.f1809a;
                            if (c11 && yVar2.a(i37)) {
                                E(i37, 16, (String) nVar2.f4505d.t(tVar));
                            }
                            c2070x.g(i37, new W0(nVar2, s()));
                        }
                        j15 >>= 8;
                    }
                    l10 = this;
                    if (i34 != 8) {
                        break;
                    }
                } else {
                    l10 = this;
                }
                if (i33 == length3) {
                    break;
                } else {
                    i33++;
                }
            }
        } else {
            l10 = this;
        }
        l10.f1724K = new W0(l10.f1728d.getSemanticsOwner().a(), s());
    }

    @Override // y1.C2354b
    public final C2355c b(View view) {
        return this.f1734m;
    }

    public final void j(int i7, z1.e eVar, String str, Bundle bundle) {
        H0.n nVar;
        int i10;
        float h10;
        float h11;
        float g;
        float g2;
        int i11;
        RectF rectF;
        X0 x02 = (X0) s().b(i7);
        if (x02 == null || (nVar = x02.f1809a) == null) {
            return;
        }
        String t5 = t(nVar);
        boolean a9 = kotlin.jvm.internal.l.a(str, this.f1720G);
        AccessibilityNodeInfo accessibilityNodeInfo = eVar.f28173a;
        if (a9) {
            int d10 = this.f1718E.d(i7);
            if (d10 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, d10);
                return;
            }
            return;
        }
        if (kotlin.jvm.internal.l.a(str, this.f1721H)) {
            int d11 = this.f1719F.d(i7);
            if (d11 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, d11);
                return;
            }
            return;
        }
        H0.t tVar = H0.h.f4471a;
        H0.i iVar = nVar.f4505d;
        C2046I c2046i = iVar.f4494a;
        boolean z8 = false;
        if (!c2046i.c(tVar) || bundle == null || !kotlin.jvm.internal.l.a(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
            H0.t tVar2 = H0.q.f4558w;
            if (!c2046i.c(tVar2) || bundle == null || !kotlin.jvm.internal.l.a(str, "androidx.compose.ui.semantics.testTag")) {
                if (kotlin.jvm.internal.l.a(str, "androidx.compose.ui.semantics.id")) {
                    accessibilityNodeInfo.getExtras().putInt(str, nVar.g);
                    return;
                }
                return;
            } else {
                Object g10 = c2046i.g(tVar2);
                String str2 = (String) (g10 == null ? null : g10);
                if (str2 != null) {
                    accessibilityNodeInfo.getExtras().putCharSequence(str, str2);
                    return;
                }
                return;
            }
        }
        int i12 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
        int i13 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
        if (i13 > 0 && i12 >= 0) {
            if (i12 < (t5 != null ? t5.length() : com.google.android.gms.common.api.f.API_PRIORITY_OTHER)) {
                K0.C g11 = X.g(iVar);
                if (g11 == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                int i14 = 0;
                while (i14 < i13) {
                    int i15 = i12 + i14;
                    if (i15 >= g11.f5841a.f5833a.f5871b.length()) {
                        arrayList.add(z8);
                        i10 = i12;
                        i11 = i13;
                    } else {
                        F.Q q10 = g11.f5842b;
                        C0374d c0374d = (C0374d) ((A9.O0) q10.f3938c).f922a;
                        if (i15 < 0 || i15 >= c0374d.f5871b.length()) {
                            StringBuilder r10 = h3.o.r(i15, "offset(", ") is out of bounds [0, ");
                            r10.append(c0374d.f5871b.length());
                            r10.append(')');
                            P0.a.a(r10.toString());
                        }
                        ArrayList arrayList2 = (ArrayList) q10.f3940e;
                        K0.m mVar = (K0.m) arrayList2.get(vc.i.q(i15, arrayList2));
                        C0371a c0371a = mVar.f5916a;
                        int a10 = mVar.a(i15);
                        CharSequence charSequence = c0371a.f5864e;
                        if (a10 < 0 || a10 >= charSequence.length()) {
                            StringBuilder r11 = h3.o.r(a10, "offset(", ") is out of bounds [0,");
                            r11.append(charSequence.length());
                            r11.append(')');
                            P0.a.a(r11.toString());
                        }
                        L0.j jVar = c0371a.f5863d;
                        Layout layout = jVar.f6252e;
                        int lineForOffset = layout.getLineForOffset(a10);
                        float f4 = jVar.f(lineForOffset);
                        float d12 = jVar.d(lineForOffset);
                        i10 = i12;
                        boolean z10 = layout.getParagraphDirection(lineForOffset) == 1;
                        boolean isRtlCharAt = layout.isRtlCharAt(a10);
                        if (!z10 || isRtlCharAt) {
                            if (z10 && isRtlCharAt) {
                                g = jVar.h(a10, false);
                                g2 = jVar.h(a10 + 1, true);
                            } else if (isRtlCharAt) {
                                g = jVar.g(a10, false);
                                g2 = jVar.g(a10 + 1, true);
                            } else {
                                h10 = jVar.h(a10, false);
                                h11 = jVar.h(a10 + 1, true);
                            }
                            float f10 = g;
                            h10 = g2;
                            h11 = f10;
                        } else {
                            h10 = jVar.g(a10, false);
                            h11 = jVar.g(a10 + 1, true);
                        }
                        RectF rectF2 = new RectF(h10, f4, h11, d12);
                        i11 = i13;
                        long floatToRawIntBits = (Float.floatToRawIntBits(mVar.f5921f) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32);
                        int i16 = (int) (floatToRawIntBits >> 32);
                        int i17 = (int) (floatToRawIntBits & 4294967295L);
                        i0.c cVar = new i0.c(Float.intBitsToFloat(i16) + rectF2.left, Float.intBitsToFloat(i17) + rectF2.top, Float.intBitsToFloat(i16) + rectF2.right, Float.intBitsToFloat(i17) + rectF2.bottom);
                        A0.n0 c10 = nVar.c();
                        long j = 0;
                        if (c10 != null) {
                            if (!c10.t0().f14112B) {
                                c10 = null;
                            }
                            if (c10 != null) {
                                j = c10.A(0L);
                            }
                        }
                        i0.c e2 = cVar.e(j);
                        i0.c e10 = nVar.e();
                        if ((((((e2.f18174a > e10.f18176c ? 1 : (e2.f18174a == e10.f18176c ? 0 : -1)) < 0) & ((e10.f18174a > e2.f18176c ? 1 : (e10.f18174a == e2.f18176c ? 0 : -1)) < 0)) & ((e2.f18175b > e10.f18177d ? 1 : (e2.f18175b == e10.f18177d ? 0 : -1)) < 0)) & ((e10.f18175b > e2.f18177d ? 1 : (e10.f18175b == e2.f18177d ? 0 : -1)) < 0) ? e2.c(e10) : null) != null) {
                            D d13 = this.f1728d;
                            long s3 = d13.s((Float.floatToRawIntBits(r1.f18174a) << 32) | (Float.floatToRawIntBits(r1.f18175b) & 4294967295L));
                            long s10 = d13.s((Float.floatToRawIntBits(r1.f18176c) << 32) | (Float.floatToRawIntBits(r1.f18177d) & 4294967295L));
                            rectF = new RectF(Float.intBitsToFloat((int) (s3 >> 32)), Float.intBitsToFloat((int) (s3 & 4294967295L)), Float.intBitsToFloat((int) (s10 >> 32)), Float.intBitsToFloat((int) (s10 & 4294967295L)));
                        } else {
                            rectF = null;
                        }
                        arrayList.add(rectF);
                    }
                    i14++;
                    i13 = i11;
                    i12 = i10;
                    z8 = false;
                }
                accessibilityNodeInfo.getExtras().putParcelableArray(str, (Parcelable[]) arrayList.toArray(new RectF[0]));
                return;
            }
        }
        Log.e("AccessibilityDelegate", "Invalid arguments for accessibility character locations");
    }

    public final Rect k(X0 x02) {
        Rect rect = x02.f1810b;
        float f4 = rect.left;
        float f10 = rect.top;
        long floatToRawIntBits = (Float.floatToRawIntBits(f10) & 4294967295L) | (Float.floatToRawIntBits(f4) << 32);
        D d10 = this.f1728d;
        long s3 = d10.s(floatToRawIntBits);
        float f11 = rect.right;
        float f12 = rect.bottom;
        long s10 = d10.s((Float.floatToRawIntBits(f11) << 32) | (Float.floatToRawIntBits(f12) & 4294967295L));
        return new Rect((int) Math.floor(Float.intBitsToFloat((int) (s3 >> 32))), (int) Math.floor(Float.intBitsToFloat((int) (s3 & 4294967295L))), (int) Math.ceil(Float.intBitsToFloat((int) (s10 >> 32))), (int) Math.ceil(Float.intBitsToFloat((int) (s10 & 4294967295L))));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007c A[Catch: all -> 0x0037, TRY_LEAVE, TryCatch #0 {all -> 0x0037, blocks: (B:12:0x0030, B:15:0x005f, B:20:0x0074, B:22:0x007c, B:25:0x0087, B:27:0x008d, B:29:0x009c, B:31:0x00a4, B:32:0x00c0, B:34:0x00cf, B:35:0x00dd, B:46:0x0048), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00f9 -> B:14:0x00fc). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(Jb.c cVar) {
        J j;
        int i7;
        L l10;
        u.y yVar;
        C1116a c1116a;
        u.y yVar2;
        C1116a c1116a2;
        Object b2;
        try {
            if (cVar instanceof J) {
                j = (J) cVar;
                int i10 = j.f1705f;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    j.f1705f = i10 - Integer.MIN_VALUE;
                    Object obj = j.f1703d;
                    Ib.a aVar = Ib.a.f5345a;
                    i7 = j.f1705f;
                    int i11 = 1;
                    if (i7 != 0) {
                        com.bumptech.glide.c.c0(obj);
                        try {
                            yVar = new u.y();
                            ec.d dVar = this.f1747z;
                            dVar.getClass();
                            c1116a = new C1116a(dVar);
                            l10 = this;
                            j.f1700a = l10;
                            j.f1701b = yVar;
                            j.f1702c = c1116a;
                            j.f1705f = i11;
                            b2 = c1116a.b(j);
                            if (b2 == aVar) {
                            }
                        } catch (Throwable th) {
                            th = th;
                            l10 = this;
                            l10.f1746y.clear();
                            throw th;
                        }
                    } else if (i7 == 1) {
                        c1116a2 = j.f1702c;
                        yVar2 = j.f1701b;
                        l10 = j.f1700a;
                        com.bumptech.glide.c.c0(obj);
                        if (((Boolean) obj).booleanValue()) {
                        }
                    } else {
                        if (i7 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c1116a2 = j.f1702c;
                        yVar2 = j.f1701b;
                        l10 = j.f1700a;
                        com.bumptech.glide.c.c0(obj);
                        int i12 = 1;
                        char c10 = 2;
                        i11 = i12;
                        yVar = yVar2;
                        c1116a = c1116a2;
                        j.f1700a = l10;
                        j.f1701b = yVar;
                        j.f1702c = c1116a;
                        j.f1705f = i11;
                        b2 = c1116a.b(j);
                        if (b2 == aVar) {
                            return aVar;
                        }
                        C1116a c1116a3 = c1116a;
                        yVar2 = yVar;
                        obj = b2;
                        c1116a2 = c1116a3;
                        if (((Boolean) obj).booleanValue()) {
                            l10.f1746y.clear();
                            return Db.q.f3365a;
                        }
                        c1116a2.c();
                        boolean u3 = l10.u();
                        C2053f c2053f = l10.f1746y;
                        if (u3) {
                            int i13 = c2053f.f24672c;
                            for (int i14 = 0; i14 < i13; i14++) {
                                A0.L l11 = (A0.L) c2053f.f24671b[i14];
                                l10.H(l11, yVar2);
                                l10.I(l11);
                            }
                            yVar2.f24733d = 0;
                            long[] jArr = yVar2.f24730a;
                            if (jArr != u.Q.f24633a) {
                                Eb.n.V(jArr, -9187201950435737472L);
                                long[] jArr2 = yVar2.f24730a;
                                int i15 = yVar2.f24732c;
                                int i16 = i15 >> 3;
                                long j10 = 255 << ((i15 & 7) << 3);
                                jArr2[i16] = ((~j10) & jArr2[i16]) | j10;
                            }
                            yVar2.f24734e = u.Q.a(yVar2.f24732c) - yVar2.f24733d;
                            if (l10.L) {
                                i12 = 1;
                            } else {
                                i12 = 1;
                                l10.L = true;
                                l10.f1733l.post(l10.f1725M);
                            }
                        } else {
                            i12 = i11;
                        }
                        c2053f.clear();
                        l10.f1740s.c();
                        l10.f1741t.c();
                        long j11 = l10.f1731h;
                        j.f1700a = l10;
                        j.f1701b = yVar2;
                        j.f1702c = c1116a2;
                        c10 = 2;
                        j.f1705f = 2;
                        if (cc.F.l(j11, j) == aVar) {
                            return aVar;
                        }
                        i11 = i12;
                        yVar = yVar2;
                        c1116a = c1116a2;
                        j.f1700a = l10;
                        j.f1701b = yVar;
                        j.f1702c = c1116a;
                        j.f1705f = i11;
                        b2 = c1116a.b(j);
                        if (b2 == aVar) {
                        }
                    }
                }
            }
            if (i7 != 0) {
            }
        } catch (Throwable th2) {
            th = th2;
        }
        j = new J(this, cVar);
        Object obj2 = j.f1703d;
        Ib.a aVar2 = Ib.a.f5345a;
        i7 = j.f1705f;
        int i112 = 1;
    }

    public final boolean m(int i7, long j, boolean z8) {
        H0.t tVar;
        long[] jArr;
        Object[] objArr;
        int i10;
        long[] jArr2;
        Object[] objArr2;
        int i11;
        int i12;
        int i13;
        int i14 = 0;
        if (!kotlin.jvm.internal.l.a(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            return false;
        }
        AbstractC2059l s3 = s();
        if (!C1289b.b(j, 9205357640488583168L) && (((9223372034707292159L & j) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
            if (z8) {
                tVar = H0.q.f4555t;
            } else {
                if (z8) {
                    throw new Db.d(1);
                }
                tVar = H0.q.f4554s;
            }
            Object[] objArr3 = s3.f24693c;
            long[] jArr3 = s3.f24691a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i15 = 0;
                boolean z10 = false;
                while (true) {
                    long j10 = jArr3[i15];
                    if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i16 = 8;
                        int i17 = 8 - ((~(i15 - length)) >>> 31);
                        int i18 = i14;
                        while (i18 < i17) {
                            if ((255 & j10) < 128) {
                                X0 x02 = (X0) objArr3[(i15 << 3) + i18];
                                Rect rect = x02.f1810b;
                                float f4 = rect.left;
                                float f10 = rect.top;
                                jArr2 = jArr3;
                                float f11 = rect.right;
                                float f12 = rect.bottom;
                                objArr2 = objArr3;
                                i11 = length;
                                float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
                                i12 = i15;
                                float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
                                if ((intBitsToFloat < f11) & (intBitsToFloat >= f4) & (intBitsToFloat2 >= f10) & (intBitsToFloat2 < f12)) {
                                    Object g = x02.f1809a.f4505d.f4494a.g(tVar);
                                    if (g == null) {
                                        g = null;
                                    }
                                    H0.g gVar = (H0.g) g;
                                    if (gVar != null) {
                                        F.I i19 = gVar.f4468a;
                                        if (i7 >= 0 ? ((Number) i19.invoke()).floatValue() < ((Number) gVar.f4469b.invoke()).floatValue() : ((Number) i19.invoke()).floatValue() > 0.0f) {
                                            z10 = true;
                                        }
                                    }
                                }
                                i13 = 8;
                            } else {
                                jArr2 = jArr3;
                                objArr2 = objArr3;
                                i11 = length;
                                i12 = i15;
                                i13 = i16;
                            }
                            j10 >>= i13;
                            i18++;
                            i16 = i13;
                            jArr3 = jArr2;
                            i15 = i12;
                            objArr3 = objArr2;
                            length = i11;
                        }
                        jArr = jArr3;
                        objArr = objArr3;
                        int i20 = length;
                        int i21 = i15;
                        if (i17 != i16) {
                            break;
                        }
                        i10 = i21;
                        length = i20;
                    } else {
                        jArr = jArr3;
                        objArr = objArr3;
                        i10 = i15;
                    }
                    if (i10 == length) {
                        break;
                    }
                    i15 = i10 + 1;
                    jArr3 = jArr;
                    objArr3 = objArr;
                    i14 = 0;
                }
                return z10;
            }
        }
        return false;
    }

    public final void n() {
        Trace.beginSection("sendAccessibilitySemanticsStructureChangeEvents");
        try {
            if (u()) {
                A(this.f1728d.getSemanticsOwner().a(), this.f1724K);
            }
            Trace.endSection();
            Trace.beginSection("sendSemanticsPropertyChangeEvents");
            try {
                G(s());
                Trace.endSection();
                Trace.beginSection("updateSemanticsNodesCopyAndPanes");
                try {
                    L();
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    public final AccessibilityEvent o(int i7, int i10) {
        X0 x02;
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i10);
        obtain.setEnabled(true);
        obtain.setClassName("android.view.View");
        D d10 = this.f1728d;
        obtain.setPackageName(d10.getContext().getPackageName());
        obtain.setSource(d10, i7);
        if (u() && (x02 = (X0) s().b(i7)) != null) {
            obtain.setPassword(x02.f1809a.f4505d.f4494a.c(H0.q.f4534G));
        }
        return obtain;
    }

    public final AccessibilityEvent p(int i7, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent o10 = o(i7, 8192);
        if (num != null) {
            o10.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            o10.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            o10.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            o10.getText().add(charSequence);
        }
        return o10;
    }

    public final int q(H0.n nVar) {
        H0.i iVar = nVar.f4505d;
        H0.t tVar = H0.q.f4539a;
        if (!iVar.f4494a.c(H0.q.f4539a)) {
            H0.t tVar2 = H0.q.f4531D;
            H0.i iVar2 = nVar.f4505d;
            if (iVar2.f4494a.c(tVar2)) {
                return (int) (4294967295L & ((K0.E) iVar2.t(tVar2)).f5853a);
            }
        }
        return this.f1744w;
    }

    public final int r(H0.n nVar) {
        H0.i iVar = nVar.f4505d;
        H0.t tVar = H0.q.f4539a;
        if (!iVar.f4494a.c(H0.q.f4539a)) {
            H0.t tVar2 = H0.q.f4531D;
            H0.i iVar2 = nVar.f4505d;
            if (iVar2.f4494a.c(tVar2)) {
                return (int) (((K0.E) iVar2.t(tVar2)).f5853a >> 32);
            }
        }
        return this.f1744w;
    }

    public final AbstractC2059l s() {
        if (this.f1714A) {
            this.f1714A = false;
            D d10 = this.f1728d;
            this.f1716C = X.e(d10.getSemanticsOwner());
            if (u()) {
                C2070x c2070x = this.f1716C;
                Resources resources = d10.getContext().getResources();
                Comparator[] comparatorArr = P.f1769a;
                C2068v c2068v = this.f1718E;
                c2068v.a();
                C2068v c2068v2 = this.f1719F;
                c2068v2.a();
                X0 x02 = (X0) c2070x.b(-1);
                H0.n nVar = x02 != null ? x02.f1809a : null;
                kotlin.jvm.internal.l.b(nVar);
                ArrayList h10 = P.h(P.f(nVar), y7.u0.x(nVar), c2070x, resources);
                int s3 = y7.u0.s(h10);
                if (1 <= s3) {
                    int i7 = 1;
                    while (true) {
                        int i10 = ((H0.n) h10.get(i7 - 1)).g;
                        int i11 = ((H0.n) h10.get(i7)).g;
                        c2068v.f(i10, i11);
                        c2068v2.f(i11, i10);
                        if (i7 == s3) {
                            break;
                        }
                        i7++;
                    }
                }
            }
        }
        return this.f1716C;
    }

    public final boolean u() {
        return this.g.isEnabled() && !this.k.isEmpty();
    }

    public final void v(A0.L l10) {
        if (this.f1746y.add(l10)) {
            this.f1747z.h(Db.q.f3365a);
        }
    }

    public final int z(int i7) {
        if (i7 == this.f1728d.getSemanticsOwner().a().g) {
            return -1;
        }
        return i7;
    }
}
