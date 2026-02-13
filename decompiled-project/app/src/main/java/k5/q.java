package k5;

import A0.B;
import H2.C0288b;
import I2.C0330t;
import N6.C0449w;
import N6.H;
import N6.s0;
import N6.t0;
import P4.m0;
import P4.n0;
import Y5.C0658x;
import android.content.Context;
import android.media.AudioManager;
import android.media.Spatializer;
import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.RandomAccess;
import m4.C1555I;
import m4.L;
import n5.AbstractC1705a;
import n5.D;
import o4.C1791e;

/* loaded from: classes.dex */
public final class q extends u {
    public static final s0 j = new C0449w(new B(12));
    public static final s0 k = new C0449w(new B(13));

    /* renamed from: c, reason: collision with root package name */
    public final Object f18955c;

    /* renamed from: d, reason: collision with root package name */
    public final Context f18956d;

    /* renamed from: e, reason: collision with root package name */
    public final C0658x f18957e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f18958f;
    public i g;

    /* renamed from: h, reason: collision with root package name */
    public final C0330t f18959h;

    /* renamed from: i, reason: collision with root package name */
    public C1791e f18960i;

    public q(Context context) {
        Spatializer spatializer;
        C0658x c0658x = new C0658x(12);
        int i7 = i.f18910e0;
        i iVar = new i(new C1429h(context));
        this.f18955c = new Object();
        C0330t c0330t = null;
        this.f18956d = context != null ? context.getApplicationContext() : null;
        this.f18957e = c0658x;
        this.g = iVar;
        this.f18960i = C1791e.f21838u;
        boolean z8 = context != null && D.L(context);
        this.f18958f = z8;
        if (!z8 && context != null && D.f21141a >= 32) {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            if (audioManager != null) {
                spatializer = audioManager.getSpatializer();
                c0330t = new C0330t(spatializer);
            }
            this.f18959h = c0330t;
        }
        if (this.g.f18920X && context == null) {
            AbstractC1705a.S("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    public static int a(int i7, int i10) {
        return (i7 == 0 || i7 != i10) ? Integer.bitCount(i7 & i10) : com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
    }

    public static void b(n0 n0Var, i iVar, HashMap hashMap) {
        for (int i7 = 0; i7 < n0Var.f8119a; i7++) {
            v vVar = (v) iVar.f19003M.get(n0Var.a(i7));
            if (vVar != null) {
                m0 m0Var = vVar.f18967a;
                v vVar2 = (v) hashMap.get(Integer.valueOf(m0Var.f8108c));
                if (vVar2 == null || (vVar2.f18968b.isEmpty() && !vVar.f18968b.isEmpty())) {
                    hashMap.put(Integer.valueOf(m0Var.f8108c), vVar);
                }
            }
        }
    }

    public static int c(L l10, String str, boolean z8) {
        if (!TextUtils.isEmpty(str) && str.equals(l10.f20087c)) {
            return 4;
        }
        String g = g(str);
        String g2 = g(l10.f20087c);
        if (g2 == null || g == null) {
            return (z8 && g2 == null) ? 1 : 0;
        }
        if (g2.startsWith(g) || g.startsWith(g2)) {
            return 3;
        }
        int i7 = D.f21141a;
        return g2.split("-", 2)[0].equals(g.split("-", 2)[0]) ? 2 : 0;
    }

    public static boolean e(int i7, boolean z8) {
        int i10 = i7 & 7;
        return i10 == 4 || (z8 && i10 == 3);
    }

    public static String g(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    public static Pair h(int i7, C0288b c0288b, int[][][] iArr, n nVar, Comparator comparator) {
        RandomAccess randomAccess;
        boolean z8;
        C0288b c0288b2 = c0288b;
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (i10 < c0288b2.f4638a) {
            if (i7 == ((int[]) c0288b2.f4639b)[i10]) {
                n0 n0Var = ((n0[]) c0288b2.f4640c)[i10];
                for (int i11 = 0; i11 < n0Var.f8119a; i11++) {
                    m0 a9 = n0Var.a(i11);
                    t0 h10 = nVar.h(i10, a9, iArr[i10][i11]);
                    int i12 = a9.f8106a;
                    boolean[] zArr = new boolean[i12];
                    for (int i13 = 0; i13 < i12; i13++) {
                        o oVar = (o) h10.get(i13);
                        int a10 = oVar.a();
                        if (!zArr[i13] && a10 != 0) {
                            if (a10 == 1) {
                                randomAccess = H.K(oVar);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(oVar);
                                for (int i14 = i13 + 1; i14 < i12; i14++) {
                                    o oVar2 = (o) h10.get(i14);
                                    if (oVar2.a() == 2 && oVar.b(oVar2)) {
                                        arrayList2.add(oVar2);
                                        z8 = true;
                                        zArr[i14] = true;
                                    } else {
                                        z8 = true;
                                    }
                                }
                                randomAccess = arrayList2;
                            }
                            arrayList.add(randomAccess);
                        }
                    }
                }
            }
            i10++;
            c0288b2 = c0288b;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i15 = 0; i15 < list.size(); i15++) {
            iArr2[i15] = ((o) list.get(i15)).f18939c;
        }
        o oVar3 = (o) list.get(0);
        return Pair.create(new r(0, oVar3.f18938b, iArr2), Integer.valueOf(oVar3.f18937a));
    }

    public final i d() {
        i iVar;
        synchronized (this.f18955c) {
            iVar = this.g;
        }
        return iVar;
    }

    public final void f() {
        boolean z8;
        C1555I c1555i;
        C0330t c0330t;
        synchronized (this.f18955c) {
            try {
                z8 = this.g.f18920X && !this.f18958f && D.f21141a >= 32 && (c0330t = this.f18959h) != null && c0330t.f5199a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z8 || (c1555i = this.f18963a) == null) {
            return;
        }
        c1555i.f19951v.d(10);
    }

    public final void i(i iVar) {
        boolean equals;
        iVar.getClass();
        synchronized (this.f18955c) {
            equals = this.g.equals(iVar);
            this.g = iVar;
        }
        if (equals) {
            return;
        }
        if (iVar.f18920X && this.f18956d == null) {
            AbstractC1705a.S("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
        C1555I c1555i = this.f18963a;
        if (c1555i != null) {
            c1555i.f19951v.d(10);
        }
    }
}
