package W1;

import A9.C0098j;
import B0.C0215z0;
import P4.C0463k;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;
import c.C0853A;
import c.C0865i;
import c.InterfaceC0858b;
import com.kt.apps.media.xemtv.beta.R;
import f.C1124h;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import l2.EnumC1474s;
import o2.C1779a;
import x1.InterfaceC2257a;
import y7.u0;

/* loaded from: classes.dex */
public final class U {

    /* renamed from: C, reason: collision with root package name */
    public C1124h f10342C;

    /* renamed from: D, reason: collision with root package name */
    public C1124h f10343D;

    /* renamed from: E, reason: collision with root package name */
    public C1124h f10344E;

    /* renamed from: G, reason: collision with root package name */
    public boolean f10346G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f10347H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f10348I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f10349J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f10350K;
    public ArrayList L;

    /* renamed from: M, reason: collision with root package name */
    public ArrayList f10351M;

    /* renamed from: N, reason: collision with root package name */
    public ArrayList f10352N;

    /* renamed from: O, reason: collision with root package name */
    public X f10353O;

    /* renamed from: b, reason: collision with root package name */
    public boolean f10356b;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f10359e;
    public C0853A g;

    /* renamed from: i, reason: collision with root package name */
    public final K f10362i;

    /* renamed from: q, reason: collision with root package name */
    public final J f10368q;

    /* renamed from: r, reason: collision with root package name */
    public final J f10369r;

    /* renamed from: s, reason: collision with root package name */
    public final J f10370s;

    /* renamed from: t, reason: collision with root package name */
    public final J f10371t;

    /* renamed from: w, reason: collision with root package name */
    public F f10374w;

    /* renamed from: x, reason: collision with root package name */
    public tc.b f10375x;

    /* renamed from: y, reason: collision with root package name */
    public C f10376y;

    /* renamed from: z, reason: collision with root package name */
    public C f10377z;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f10355a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final q3.n f10357c = new q3.n(5);

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f10358d = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final I f10360f = new I(this);

    /* renamed from: h, reason: collision with root package name */
    public C0558a f10361h = null;
    public final AtomicInteger j = new AtomicInteger();
    public final Map k = Collections.synchronizedMap(new HashMap());

    /* renamed from: l, reason: collision with root package name */
    public final Map f10363l = Collections.synchronizedMap(new HashMap());

    /* renamed from: m, reason: collision with root package name */
    public final Map f10364m = Collections.synchronizedMap(new HashMap());

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f10365n = new ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public final q3.l f10366o = new q3.l(this);

    /* renamed from: p, reason: collision with root package name */
    public final CopyOnWriteArrayList f10367p = new CopyOnWriteArrayList();

    /* renamed from: u, reason: collision with root package name */
    public final L f10372u = new L(this);

    /* renamed from: v, reason: collision with root package name */
    public int f10373v = -1;

    /* renamed from: A, reason: collision with root package name */
    public final M f10340A = new M(this);

    /* renamed from: B, reason: collision with root package name */
    public final U9.j f10341B = new U9.j(16);

    /* renamed from: F, reason: collision with root package name */
    public ArrayDeque f10345F = new ArrayDeque();

    /* renamed from: P, reason: collision with root package name */
    public final B0.C f10354P = new B0.C(this, 15);

    /* JADX WARN: Type inference failed for: r0v16, types: [W1.J] */
    /* JADX WARN: Type inference failed for: r0v17, types: [W1.J] */
    /* JADX WARN: Type inference failed for: r0v18, types: [W1.J] */
    /* JADX WARN: Type inference failed for: r0v19, types: [W1.J] */
    public U() {
        final int i7 = 0;
        this.f10362i = new K(this, i7);
        this.f10368q = new InterfaceC2257a(this) { // from class: W1.J

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ U f10326b;

            {
                this.f10326b = this;
            }

            @Override // x1.InterfaceC2257a
            public final void accept(Object obj) {
                switch (i7) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        U u3 = this.f10326b;
                        if (u3.N()) {
                            u3.i(false, configuration);
                            return;
                        }
                        return;
                    case 1:
                        Integer num = (Integer) obj;
                        U u10 = this.f10326b;
                        if (u10.N() && num.intValue() == 80) {
                            u10.m(false);
                            return;
                        }
                        return;
                    case 2:
                        k1.j jVar = (k1.j) obj;
                        U u11 = this.f10326b;
                        if (u11.N()) {
                            boolean z8 = jVar.f18774a;
                            u11.n(false);
                            return;
                        }
                        return;
                    default:
                        k1.v vVar = (k1.v) obj;
                        U u12 = this.f10326b;
                        if (u12.N()) {
                            boolean z10 = vVar.f18803a;
                            u12.s(false);
                            return;
                        }
                        return;
                }
            }
        };
        final int i10 = 1;
        this.f10369r = new InterfaceC2257a(this) { // from class: W1.J

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ U f10326b;

            {
                this.f10326b = this;
            }

            @Override // x1.InterfaceC2257a
            public final void accept(Object obj) {
                switch (i10) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        U u3 = this.f10326b;
                        if (u3.N()) {
                            u3.i(false, configuration);
                            return;
                        }
                        return;
                    case 1:
                        Integer num = (Integer) obj;
                        U u10 = this.f10326b;
                        if (u10.N() && num.intValue() == 80) {
                            u10.m(false);
                            return;
                        }
                        return;
                    case 2:
                        k1.j jVar = (k1.j) obj;
                        U u11 = this.f10326b;
                        if (u11.N()) {
                            boolean z8 = jVar.f18774a;
                            u11.n(false);
                            return;
                        }
                        return;
                    default:
                        k1.v vVar = (k1.v) obj;
                        U u12 = this.f10326b;
                        if (u12.N()) {
                            boolean z10 = vVar.f18803a;
                            u12.s(false);
                            return;
                        }
                        return;
                }
            }
        };
        final int i11 = 2;
        this.f10370s = new InterfaceC2257a(this) { // from class: W1.J

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ U f10326b;

            {
                this.f10326b = this;
            }

            @Override // x1.InterfaceC2257a
            public final void accept(Object obj) {
                switch (i11) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        U u3 = this.f10326b;
                        if (u3.N()) {
                            u3.i(false, configuration);
                            return;
                        }
                        return;
                    case 1:
                        Integer num = (Integer) obj;
                        U u10 = this.f10326b;
                        if (u10.N() && num.intValue() == 80) {
                            u10.m(false);
                            return;
                        }
                        return;
                    case 2:
                        k1.j jVar = (k1.j) obj;
                        U u11 = this.f10326b;
                        if (u11.N()) {
                            boolean z8 = jVar.f18774a;
                            u11.n(false);
                            return;
                        }
                        return;
                    default:
                        k1.v vVar = (k1.v) obj;
                        U u12 = this.f10326b;
                        if (u12.N()) {
                            boolean z10 = vVar.f18803a;
                            u12.s(false);
                            return;
                        }
                        return;
                }
            }
        };
        final int i12 = 3;
        this.f10371t = new InterfaceC2257a(this) { // from class: W1.J

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ U f10326b;

            {
                this.f10326b = this;
            }

            @Override // x1.InterfaceC2257a
            public final void accept(Object obj) {
                switch (i12) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        U u3 = this.f10326b;
                        if (u3.N()) {
                            u3.i(false, configuration);
                            return;
                        }
                        return;
                    case 1:
                        Integer num = (Integer) obj;
                        U u10 = this.f10326b;
                        if (u10.N() && num.intValue() == 80) {
                            u10.m(false);
                            return;
                        }
                        return;
                    case 2:
                        k1.j jVar = (k1.j) obj;
                        U u11 = this.f10326b;
                        if (u11.N()) {
                            boolean z8 = jVar.f18774a;
                            u11.n(false);
                            return;
                        }
                        return;
                    default:
                        k1.v vVar = (k1.v) obj;
                        U u12 = this.f10326b;
                        if (u12.N()) {
                            boolean z10 = vVar.f18803a;
                            u12.s(false);
                            return;
                        }
                        return;
                }
            }
        };
    }

    public static HashSet G(C0558a c0558a) {
        HashSet hashSet = new HashSet();
        for (int i7 = 0; i7 < c0558a.f10409c.size(); i7++) {
            C c10 = ((c0) c0558a.f10409c.get(i7)).f10453b;
            if (c10 != null && c0558a.f10414i) {
                hashSet.add(c10);
            }
        }
        return hashSet;
    }

    public static boolean M(C c10) {
        c10.getClass();
        Iterator it = c10.f10267J.f10357c.g().iterator();
        boolean z8 = false;
        while (it.hasNext()) {
            C c11 = (C) it.next();
            if (c11 != null) {
                z8 = M(c11);
            }
            if (z8) {
                return true;
            }
        }
        return false;
    }

    public static boolean O(C c10) {
        if (c10 == null) {
            return true;
        }
        return c10.f10274R && (c10.f10265H == null || O(c10.f10268K));
    }

    public static boolean P(C c10) {
        if (c10 == null) {
            return true;
        }
        U u3 = c10.f10265H;
        return c10.equals(u3.f10377z) && P(u3.f10376y);
    }

    public static void e0(C c10) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "show: " + c10);
        }
        if (c10.f10271O) {
            c10.f10271O = false;
            c10.f10281Y = !c10.f10281Y;
        }
    }

    public final boolean A(boolean z8) {
        boolean z10;
        z(z8);
        boolean z11 = false;
        while (true) {
            ArrayList arrayList = this.L;
            ArrayList arrayList2 = this.f10351M;
            synchronized (this.f10355a) {
                if (this.f10355a.isEmpty()) {
                    z10 = false;
                } else {
                    try {
                        int size = this.f10355a.size();
                        z10 = false;
                        for (int i7 = 0; i7 < size; i7++) {
                            z10 |= ((Q) this.f10355a.get(i7)).a(arrayList, arrayList2);
                        }
                    } finally {
                    }
                }
            }
            if (!z10) {
                h0();
                v();
                ((HashMap) this.f10357c.f23397c).values().removeAll(Collections.singleton(null));
                return z11;
            }
            z11 = true;
            this.f10356b = true;
            try {
                W(this.L, this.f10351M);
            } finally {
                d();
            }
        }
    }

    public final void B(C0558a c0558a, boolean z8) {
        if (z8 && (this.f10374w == null || this.f10349J)) {
            return;
        }
        z(z8);
        c0558a.a(this.L, this.f10351M);
        this.f10356b = true;
        try {
            W(this.L, this.f10351M);
            d();
            h0();
            v();
            ((HashMap) this.f10357c.f23397c).values().removeAll(Collections.singleton(null));
        } catch (Throwable th) {
            d();
            throw th;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:140:0x024b. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:173:0x0323. Please report as an issue. */
    public final void C(ArrayList arrayList, ArrayList arrayList2, int i7, int i10) {
        C0558a c0558a;
        Object obj;
        ArrayList arrayList3;
        q3.n nVar;
        q3.n nVar2;
        q3.n nVar3;
        int i11;
        int i12;
        int i13;
        ArrayList arrayList4 = arrayList;
        ArrayList arrayList5 = arrayList2;
        boolean z8 = ((C0558a) arrayList4.get(i7)).f10421r;
        ArrayList arrayList6 = this.f10352N;
        if (arrayList6 == null) {
            this.f10352N = new ArrayList();
        } else {
            arrayList6.clear();
        }
        ArrayList arrayList7 = this.f10352N;
        q3.n nVar4 = this.f10357c;
        arrayList7.addAll(nVar4.h());
        C c10 = this.f10377z;
        int i14 = i7;
        boolean z10 = false;
        while (true) {
            int i15 = 1;
            if (i14 >= i10) {
                q3.n nVar5 = nVar4;
                this.f10352N.clear();
                if (!z8 && this.f10373v >= 1) {
                    for (int i16 = i7; i16 < i10; i16++) {
                        Iterator it = ((C0558a) arrayList.get(i16)).f10409c.iterator();
                        while (it.hasNext()) {
                            C c11 = ((c0) it.next()).f10453b;
                            if (c11 == null || c11.f10265H == null) {
                                nVar = nVar5;
                            } else {
                                nVar = nVar5;
                                nVar.m(g(c11));
                            }
                            nVar5 = nVar;
                        }
                    }
                }
                for (int i17 = i7; i17 < i10; i17++) {
                    C0558a c0558a2 = (C0558a) arrayList.get(i17);
                    if (((Boolean) arrayList2.get(i17)).booleanValue()) {
                        c0558a2.d(-1);
                        ArrayList arrayList8 = c0558a2.f10409c;
                        boolean z11 = true;
                        for (int size = arrayList8.size() - 1; size >= 0; size--) {
                            c0 c0Var = (c0) arrayList8.get(size);
                            C c12 = c0Var.f10453b;
                            if (c12 != null) {
                                if (c12.f10280X != null) {
                                    c12.z().f10576a = z11;
                                }
                                int i18 = c0558a2.f10413h;
                                int i19 = 8194;
                                int i20 = 4097;
                                if (i18 != 4097) {
                                    if (i18 != 8194) {
                                        i19 = 4100;
                                        i20 = 8197;
                                        if (i18 != 8197) {
                                            if (i18 == 4099) {
                                                i19 = 4099;
                                            } else if (i18 != 4100) {
                                                i19 = 0;
                                            }
                                        }
                                    }
                                    i19 = i20;
                                }
                                if (c12.f10280X != null || i19 != 0) {
                                    c12.z();
                                    c12.f10280X.f10581f = i19;
                                }
                                ArrayList arrayList9 = c0558a2.f10420q;
                                ArrayList arrayList10 = c0558a2.f10419p;
                                c12.z();
                                C0582z c0582z = c12.f10280X;
                                c0582z.g = arrayList9;
                                c0582z.f10582h = arrayList10;
                            }
                            int i21 = c0Var.f10452a;
                            U u3 = c0558a2.f10422s;
                            switch (i21) {
                                case 1:
                                    c12.k0(c0Var.f10455d, c0Var.f10456e, c0Var.f10457f, c0Var.g);
                                    z11 = true;
                                    u3.a0(c12, true);
                                    u3.V(c12);
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + c0Var.f10452a);
                                case 3:
                                    c12.k0(c0Var.f10455d, c0Var.f10456e, c0Var.f10457f, c0Var.g);
                                    u3.a(c12);
                                    z11 = true;
                                case 4:
                                    c12.k0(c0Var.f10455d, c0Var.f10456e, c0Var.f10457f, c0Var.g);
                                    u3.getClass();
                                    e0(c12);
                                    z11 = true;
                                case 5:
                                    c12.k0(c0Var.f10455d, c0Var.f10456e, c0Var.f10457f, c0Var.g);
                                    u3.a0(c12, true);
                                    u3.L(c12);
                                    z11 = true;
                                case 6:
                                    c12.k0(c0Var.f10455d, c0Var.f10456e, c0Var.f10457f, c0Var.g);
                                    u3.c(c12);
                                    z11 = true;
                                case 7:
                                    c12.k0(c0Var.f10455d, c0Var.f10456e, c0Var.f10457f, c0Var.g);
                                    u3.a0(c12, true);
                                    u3.h(c12);
                                    z11 = true;
                                case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                                    u3.c0(null);
                                    z11 = true;
                                case 9:
                                    u3.c0(c12);
                                    z11 = true;
                                case 10:
                                    u3.b0(c12, c0Var.f10458h);
                                    z11 = true;
                            }
                        }
                    } else {
                        c0558a2.d(1);
                        ArrayList arrayList11 = c0558a2.f10409c;
                        int size2 = arrayList11.size();
                        int i22 = 0;
                        while (i22 < size2) {
                            c0 c0Var2 = (c0) arrayList11.get(i22);
                            C c13 = c0Var2.f10453b;
                            if (c13 != null) {
                                if (c13.f10280X != null) {
                                    c13.z().f10576a = false;
                                }
                                int i23 = c0558a2.f10413h;
                                if (c13.f10280X != null || i23 != 0) {
                                    c13.z();
                                    c13.f10280X.f10581f = i23;
                                }
                                ArrayList arrayList12 = c0558a2.f10419p;
                                ArrayList arrayList13 = c0558a2.f10420q;
                                c13.z();
                                C0582z c0582z2 = c13.f10280X;
                                c0582z2.g = arrayList12;
                                c0582z2.f10582h = arrayList13;
                            }
                            int i24 = c0Var2.f10452a;
                            U u10 = c0558a2.f10422s;
                            switch (i24) {
                                case 1:
                                    arrayList3 = arrayList11;
                                    c13.k0(c0Var2.f10455d, c0Var2.f10456e, c0Var2.f10457f, c0Var2.g);
                                    u10.a0(c13, false);
                                    u10.a(c13);
                                    i22++;
                                    arrayList11 = arrayList3;
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + c0Var2.f10452a);
                                case 3:
                                    arrayList3 = arrayList11;
                                    c13.k0(c0Var2.f10455d, c0Var2.f10456e, c0Var2.f10457f, c0Var2.g);
                                    u10.V(c13);
                                    i22++;
                                    arrayList11 = arrayList3;
                                case 4:
                                    arrayList3 = arrayList11;
                                    c13.k0(c0Var2.f10455d, c0Var2.f10456e, c0Var2.f10457f, c0Var2.g);
                                    u10.L(c13);
                                    i22++;
                                    arrayList11 = arrayList3;
                                case 5:
                                    arrayList3 = arrayList11;
                                    c13.k0(c0Var2.f10455d, c0Var2.f10456e, c0Var2.f10457f, c0Var2.g);
                                    u10.a0(c13, false);
                                    e0(c13);
                                    i22++;
                                    arrayList11 = arrayList3;
                                case 6:
                                    arrayList3 = arrayList11;
                                    c13.k0(c0Var2.f10455d, c0Var2.f10456e, c0Var2.f10457f, c0Var2.g);
                                    u10.h(c13);
                                    i22++;
                                    arrayList11 = arrayList3;
                                case 7:
                                    arrayList3 = arrayList11;
                                    c13.k0(c0Var2.f10455d, c0Var2.f10456e, c0Var2.f10457f, c0Var2.g);
                                    u10.a0(c13, false);
                                    u10.c(c13);
                                    i22++;
                                    arrayList11 = arrayList3;
                                case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                                    u10.c0(c13);
                                    arrayList3 = arrayList11;
                                    i22++;
                                    arrayList11 = arrayList3;
                                case 9:
                                    u10.c0(null);
                                    arrayList3 = arrayList11;
                                    i22++;
                                    arrayList11 = arrayList3;
                                case 10:
                                    u10.b0(c13, c0Var2.f10459i);
                                    arrayList3 = arrayList11;
                                    i22++;
                                    arrayList11 = arrayList3;
                            }
                        }
                    }
                }
                boolean booleanValue = ((Boolean) arrayList2.get(i10 - 1)).booleanValue();
                ArrayList arrayList14 = this.f10365n;
                if (z10 && !arrayList14.isEmpty()) {
                    LinkedHashSet<C> linkedHashSet = new LinkedHashSet();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        linkedHashSet.addAll(G((C0558a) it2.next()));
                    }
                    if (this.f10361h == null) {
                        Iterator it3 = arrayList14.iterator();
                        while (it3.hasNext()) {
                            A9.L l10 = (A9.L) it3.next();
                            for (C c14 : linkedHashSet) {
                                l10.getClass();
                            }
                        }
                        Iterator it4 = arrayList14.iterator();
                        while (it4.hasNext()) {
                            A9.L l11 = (A9.L) it4.next();
                            for (C c15 : linkedHashSet) {
                                l11.getClass();
                            }
                        }
                    }
                }
                for (int i25 = i7; i25 < i10; i25++) {
                    C0558a c0558a3 = (C0558a) arrayList.get(i25);
                    if (booleanValue) {
                        for (int size3 = c0558a3.f10409c.size() - 1; size3 >= 0; size3--) {
                            C c16 = ((c0) c0558a3.f10409c.get(size3)).f10453b;
                            if (c16 != null) {
                                g(c16).k();
                            }
                        }
                    } else {
                        Iterator it5 = c0558a3.f10409c.iterator();
                        while (it5.hasNext()) {
                            C c17 = ((c0) it5.next()).f10453b;
                            if (c17 != null) {
                                g(c17).k();
                            }
                        }
                    }
                }
                Q(this.f10373v, true);
                int i26 = i7;
                Iterator it6 = f(arrayList, i26, i10).iterator();
                while (it6.hasNext()) {
                    C0573p c0573p = (C0573p) it6.next();
                    c0573p.f10543d = booleanValue;
                    synchronized (c0573p.f10541b) {
                        try {
                            c0573p.l();
                            ArrayList arrayList15 = c0573p.f10541b;
                            ListIterator listIterator = arrayList15.listIterator(arrayList15.size());
                            while (true) {
                                if (listIterator.hasPrevious()) {
                                    obj = listIterator.previous();
                                    o0 o0Var = (o0) obj;
                                    View view = o0Var.f10533c.f10277U;
                                    kotlin.jvm.internal.l.d(view, "operation.fragment.mView");
                                    int g = u0.g(view);
                                    if (o0Var.f10531a != 2 || g == 2) {
                                    }
                                } else {
                                    obj = null;
                                }
                            }
                            c0573p.f10544e = false;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    c0573p.e();
                }
                while (i26 < i10) {
                    C0558a c0558a4 = (C0558a) arrayList.get(i26);
                    if (((Boolean) arrayList2.get(i26)).booleanValue() && c0558a4.f10424u >= 0) {
                        c0558a4.f10424u = -1;
                    }
                    c0558a4.getClass();
                    i26++;
                }
                if (z10) {
                    for (int i27 = 0; i27 < arrayList14.size(); i27++) {
                        A9.L l12 = (A9.L) arrayList14.get(i27);
                        A9.W w10 = l12.f864c;
                        U u11 = w10.f10265H;
                        if (u11 == null) {
                            Log.w("BrowseSupportFragment", "getFragmentManager() is null, stack:", new Exception());
                        } else {
                            int H10 = u11.H();
                            int i28 = l12.f862a;
                            if (H10 > i28) {
                                U u12 = w10.f10265H;
                                int i29 = H10 - 1;
                                if (i29 == u12.f10358d.size()) {
                                    c0558a = u12.f10361h;
                                    if (c0558a == null) {
                                        throw new IndexOutOfBoundsException();
                                    }
                                } else {
                                    c0558a = (C0558a) u12.f10358d.get(i29);
                                }
                                if (w10.f1009W0.equals(c0558a.k)) {
                                    l12.f863b = i29;
                                }
                            } else if (H10 < i28 && l12.f863b >= H10) {
                                C0098j c0098j = w10.f1003Q0;
                                if ((c0098j == null || c0098j.f1233c.size() == 0) ? false : true) {
                                    l12.f863b = -1;
                                    if (!w10.f1011Y0) {
                                        w10.L0(true);
                                        l12.f862a = H10;
                                    }
                                    l12.f862a = H10;
                                } else {
                                    U u13 = w10.f10265H;
                                    u13.getClass();
                                    C0558a c0558a5 = new C0558a(u13);
                                    c0558a5.c(w10.f1009W0);
                                    c0558a5.e(false);
                                }
                            }
                            l12.f862a = H10;
                        }
                    }
                    return;
                }
                return;
            }
            C0558a c0558a6 = (C0558a) arrayList4.get(i14);
            if (((Boolean) arrayList5.get(i14)).booleanValue()) {
                nVar2 = nVar4;
                int i30 = 1;
                ArrayList arrayList16 = this.f10352N;
                ArrayList arrayList17 = c0558a6.f10409c;
                int size4 = arrayList17.size() - 1;
                while (size4 >= 0) {
                    c0 c0Var3 = (c0) arrayList17.get(size4);
                    int i31 = c0Var3.f10452a;
                    if (i31 != i30) {
                        if (i31 != 3) {
                            switch (i31) {
                                case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                                    c10 = null;
                                    break;
                                case 9:
                                    c10 = c0Var3.f10453b;
                                    break;
                                case 10:
                                    c0Var3.f10459i = c0Var3.f10458h;
                                    break;
                            }
                            size4--;
                            i30 = 1;
                        }
                        arrayList16.add(c0Var3.f10453b);
                        size4--;
                        i30 = 1;
                    }
                    arrayList16.remove(c0Var3.f10453b);
                    size4--;
                    i30 = 1;
                }
            } else {
                ArrayList arrayList18 = this.f10352N;
                int i32 = 0;
                while (true) {
                    ArrayList arrayList19 = c0558a6.f10409c;
                    if (i32 < arrayList19.size()) {
                        c0 c0Var4 = (c0) arrayList19.get(i32);
                        int i33 = c0Var4.f10452a;
                        if (i33 != i15) {
                            if (i33 != 2) {
                                if (i33 == 3 || i33 == 6) {
                                    arrayList18.remove(c0Var4.f10453b);
                                    C c18 = c0Var4.f10453b;
                                    if (c18 == c10) {
                                        arrayList19.add(i32, new c0(9, c18));
                                        i32++;
                                        nVar3 = nVar4;
                                        i11 = 1;
                                        c10 = null;
                                    }
                                } else if (i33 == 7) {
                                    nVar3 = nVar4;
                                    i11 = 1;
                                } else if (i33 == 8) {
                                    arrayList19.add(i32, new c0(9, c10, 0));
                                    c0Var4.f10454c = true;
                                    i32++;
                                    c10 = c0Var4.f10453b;
                                }
                                nVar3 = nVar4;
                                i11 = 1;
                            } else {
                                C c19 = c0Var4.f10453b;
                                int i34 = c19.f10269M;
                                int size5 = arrayList18.size() - 1;
                                boolean z12 = false;
                                while (size5 >= 0) {
                                    q3.n nVar6 = nVar4;
                                    C c20 = (C) arrayList18.get(size5);
                                    if (c20.f10269M != i34) {
                                        i12 = i34;
                                    } else if (c20 == c19) {
                                        i12 = i34;
                                        z12 = true;
                                    } else {
                                        if (c20 == c10) {
                                            i12 = i34;
                                            arrayList19.add(i32, new c0(9, c20, 0));
                                            i32++;
                                            i13 = 0;
                                            c10 = null;
                                        } else {
                                            i12 = i34;
                                            i13 = 0;
                                        }
                                        c0 c0Var5 = new c0(3, c20, i13);
                                        c0Var5.f10455d = c0Var4.f10455d;
                                        c0Var5.f10457f = c0Var4.f10457f;
                                        c0Var5.f10456e = c0Var4.f10456e;
                                        c0Var5.g = c0Var4.g;
                                        arrayList19.add(i32, c0Var5);
                                        arrayList18.remove(c20);
                                        i32++;
                                        c10 = c10;
                                    }
                                    size5--;
                                    i34 = i12;
                                    nVar4 = nVar6;
                                }
                                nVar3 = nVar4;
                                i11 = 1;
                                if (z12) {
                                    arrayList19.remove(i32);
                                    i32--;
                                } else {
                                    c0Var4.f10452a = 1;
                                    c0Var4.f10454c = true;
                                    arrayList18.add(c19);
                                }
                            }
                            i32 += i11;
                            i15 = i11;
                            nVar4 = nVar3;
                        } else {
                            nVar3 = nVar4;
                            i11 = i15;
                        }
                        arrayList18.add(c0Var4.f10453b);
                        i32 += i11;
                        i15 = i11;
                        nVar4 = nVar3;
                    } else {
                        nVar2 = nVar4;
                    }
                }
            }
            z10 = z10 || c0558a6.f10414i;
            i14++;
            arrayList4 = arrayList;
            arrayList5 = arrayList2;
            nVar4 = nVar2;
        }
    }

    public final C D(int i7) {
        q3.n nVar = this.f10357c;
        ArrayList arrayList = (ArrayList) nVar.f23396b;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C c10 = (C) arrayList.get(size);
            if (c10 != null && c10.L == i7) {
                return c10;
            }
        }
        for (a0 a0Var : ((HashMap) nVar.f23397c).values()) {
            if (a0Var != null) {
                C c11 = a0Var.f10427c;
                if (c11.L == i7) {
                    return c11;
                }
            }
        }
        return null;
    }

    public final C E(String str) {
        q3.n nVar = this.f10357c;
        ArrayList arrayList = (ArrayList) nVar.f23396b;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C c10 = (C) arrayList.get(size);
            if (c10 != null && str.equals(c10.f10270N)) {
                return c10;
            }
        }
        for (a0 a0Var : ((HashMap) nVar.f23397c).values()) {
            if (a0Var != null) {
                C c11 = a0Var.f10427c;
                if (str.equals(c11.f10270N)) {
                    return c11;
                }
            }
        }
        return null;
    }

    public final void F() {
        Iterator it = e().iterator();
        while (it.hasNext()) {
            C0573p c0573p = (C0573p) it.next();
            if (c0573p.f10544e) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                c0573p.f10544e = false;
                c0573p.e();
            }
        }
    }

    public final int H() {
        return this.f10358d.size() + (this.f10361h != null ? 1 : 0);
    }

    public final ViewGroup I(C c10) {
        ViewGroup viewGroup = c10.f10276T;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (c10.f10269M > 0 && this.f10375x.C()) {
            View B10 = this.f10375x.B(c10.f10269M);
            if (B10 instanceof ViewGroup) {
                return (ViewGroup) B10;
            }
        }
        return null;
    }

    public final M J() {
        C c10 = this.f10376y;
        return c10 != null ? c10.f10265H.J() : this.f10340A;
    }

    public final U9.j K() {
        C c10 = this.f10376y;
        return c10 != null ? c10.f10265H.K() : this.f10341B;
    }

    public final void L(C c10) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "hide: " + c10);
        }
        if (c10.f10271O) {
            return;
        }
        c10.f10271O = true;
        c10.f10281Y = true ^ c10.f10281Y;
        d0(c10);
    }

    public final boolean N() {
        C c10 = this.f10376y;
        if (c10 == null) {
            return true;
        }
        return c10.K() && this.f10376y.E().N();
    }

    public final void Q(int i7, boolean z8) {
        HashMap hashMap;
        F f4;
        if (this.f10374w == null && i7 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z8 || i7 != this.f10373v) {
            this.f10373v = i7;
            q3.n nVar = this.f10357c;
            Iterator it = ((ArrayList) nVar.f23396b).iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                hashMap = (HashMap) nVar.f23397c;
                if (!hasNext) {
                    break;
                }
                a0 a0Var = (a0) hashMap.get(((C) it.next()).f10293f);
                if (a0Var != null) {
                    a0Var.k();
                }
            }
            for (a0 a0Var2 : hashMap.values()) {
                if (a0Var2 != null) {
                    a0Var2.k();
                    C c10 = a0Var2.f10427c;
                    if (c10.f10258A && !c10.M()) {
                        nVar.n(a0Var2);
                    }
                }
            }
            f0();
            if (this.f10346G && (f4 = this.f10374w) != null && this.f10373v == 7) {
                f4.f10314e.invalidateOptionsMenu();
                this.f10346G = false;
            }
        }
    }

    public final void R() {
        if (this.f10374w == null) {
            return;
        }
        this.f10347H = false;
        this.f10348I = false;
        this.f10353O.f10392f = false;
        for (C c10 : this.f10357c.h()) {
            if (c10 != null) {
                c10.f10267J.R();
            }
        }
    }

    public final boolean S() {
        return T(-1, 0);
    }

    public final boolean T(int i7, int i10) {
        A(false);
        z(true);
        C c10 = this.f10377z;
        if (c10 != null && i7 < 0 && c10.B().S()) {
            return true;
        }
        boolean U8 = U(this.L, this.f10351M, i7, i10);
        if (U8) {
            this.f10356b = true;
            try {
                W(this.L, this.f10351M);
            } finally {
                d();
            }
        }
        h0();
        v();
        ((HashMap) this.f10357c.f23397c).values().removeAll(Collections.singleton(null));
        return U8;
    }

    public final boolean U(ArrayList arrayList, ArrayList arrayList2, int i7, int i10) {
        boolean z8 = (i10 & 1) != 0;
        int i11 = -1;
        if (!this.f10358d.isEmpty()) {
            if (i7 < 0) {
                i11 = z8 ? 0 : this.f10358d.size() - 1;
            } else {
                int size = this.f10358d.size() - 1;
                while (size >= 0) {
                    C0558a c0558a = (C0558a) this.f10358d.get(size);
                    if (i7 >= 0 && i7 == c0558a.f10424u) {
                        break;
                    }
                    size--;
                }
                if (size >= 0) {
                    if (z8) {
                        while (size > 0) {
                            C0558a c0558a2 = (C0558a) this.f10358d.get(size - 1);
                            if (i7 < 0 || i7 != c0558a2.f10424u) {
                                break;
                            }
                            size--;
                        }
                    } else if (size != this.f10358d.size() - 1) {
                        size++;
                    }
                }
                i11 = size;
            }
        }
        if (i11 < 0) {
            return false;
        }
        for (int size2 = this.f10358d.size() - 1; size2 >= i11; size2--) {
            arrayList.add((C0558a) this.f10358d.remove(size2));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void V(C c10) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "remove: " + c10 + " nesting=" + c10.f10264G);
        }
        boolean M3 = c10.M();
        if (c10.f10272P && M3) {
            return;
        }
        q3.n nVar = this.f10357c;
        synchronized (((ArrayList) nVar.f23396b)) {
            ((ArrayList) nVar.f23396b).remove(c10);
        }
        c10.f10305z = false;
        if (M(c10)) {
            this.f10346G = true;
        }
        c10.f10258A = true;
        d0(c10);
    }

    public final void W(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i7 = 0;
        int i10 = 0;
        while (i7 < size) {
            if (!((C0558a) arrayList.get(i7)).f10421r) {
                if (i10 != i7) {
                    C(arrayList, arrayList2, i10, i7);
                }
                i10 = i7 + 1;
                if (((Boolean) arrayList2.get(i7)).booleanValue()) {
                    while (i10 < size && ((Boolean) arrayList2.get(i10)).booleanValue() && !((C0558a) arrayList.get(i10)).f10421r) {
                        i10++;
                    }
                }
                C(arrayList, arrayList2, i7, i10);
                i7 = i10 - 1;
            }
            i7++;
        }
        if (i10 != size) {
            C(arrayList, arrayList2, i10, size);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1, types: [W1.c0, java.lang.Object] */
    public final void X(Bundle bundle) {
        int i7;
        q3.l lVar;
        int i10;
        a0 a0Var;
        Bundle bundle2;
        Bundle bundle3;
        for (String str : bundle.keySet()) {
            if (str.startsWith("result_") && (bundle3 = bundle.getBundle(str)) != null) {
                bundle3.setClassLoader(this.f10374w.f10311b.getClassLoader());
                this.f10363l.put(str.substring(7), bundle3);
            }
        }
        HashMap hashMap = new HashMap();
        for (String str2 : bundle.keySet()) {
            if (str2.startsWith("fragment_") && (bundle2 = bundle.getBundle(str2)) != null) {
                bundle2.setClassLoader(this.f10374w.f10311b.getClassLoader());
                hashMap.put(str2.substring(9), bundle2);
            }
        }
        q3.n nVar = this.f10357c;
        HashMap hashMap2 = (HashMap) nVar.f23398d;
        hashMap2.clear();
        hashMap2.putAll(hashMap);
        V v10 = (V) bundle.getParcelable("state");
        if (v10 == null) {
            return;
        }
        HashMap hashMap3 = (HashMap) nVar.f23397c;
        hashMap3.clear();
        Iterator it = v10.f10378a.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            i7 = 2;
            lVar = this.f10366o;
            if (!hasNext) {
                break;
            }
            Bundle p10 = nVar.p((String) it.next(), null);
            if (p10 != null) {
                C c10 = (C) this.f10353O.f10387a.get(((Z) p10.getParcelable("state")).f10396b);
                if (c10 != null) {
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + c10);
                    }
                    a0Var = new a0(lVar, nVar, c10, p10);
                } else {
                    a0Var = new a0(this.f10366o, this.f10357c, this.f10374w.f10311b.getClassLoader(), J(), p10);
                }
                C c11 = a0Var.f10427c;
                c11.f10285b = p10;
                c11.f10265H = this;
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + c11.f10293f + "): " + c11);
                }
                a0Var.m(this.f10374w.f10311b.getClassLoader());
                nVar.m(a0Var);
                a0Var.f10429e = this.f10373v;
            }
        }
        X x2 = this.f10353O;
        x2.getClass();
        Iterator it2 = new ArrayList(x2.f10387a.values()).iterator();
        while (it2.hasNext()) {
            C c12 = (C) it2.next();
            if (hashMap3.get(c12.f10293f) == null) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + c12 + " that was not found in the set of active Fragments " + v10.f10378a);
                }
                this.f10353O.d(c12);
                c12.f10265H = this;
                a0 a0Var2 = new a0(lVar, nVar, c12);
                a0Var2.f10429e = 1;
                a0Var2.k();
                c12.f10258A = true;
                a0Var2.k();
            }
        }
        ArrayList<String> arrayList = v10.f10379b;
        ((ArrayList) nVar.f23396b).clear();
        if (arrayList != null) {
            for (String str3 : arrayList) {
                C d10 = nVar.d(str3);
                if (d10 == null) {
                    throw new IllegalStateException(y.S.b("No instantiated fragment for (", str3, ")"));
                }
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str3 + "): " + d10);
                }
                nVar.a(d10);
            }
        }
        if (v10.f10380c != null) {
            this.f10358d = new ArrayList(v10.f10380c.length);
            int i11 = 0;
            while (true) {
                C0559b[] c0559bArr = v10.f10380c;
                if (i11 >= c0559bArr.length) {
                    break;
                }
                C0559b c0559b = c0559bArr[i11];
                c0559b.getClass();
                C0558a c0558a = new C0558a(this);
                int i12 = 0;
                int i13 = 0;
                while (true) {
                    int[] iArr = c0559b.f10432a;
                    if (i12 >= iArr.length) {
                        break;
                    }
                    ?? obj = new Object();
                    int i14 = i12 + 1;
                    obj.f10452a = iArr[i12];
                    if (Log.isLoggable("FragmentManager", i7)) {
                        Log.v("FragmentManager", "Instantiate " + c0558a + " op #" + i13 + " base fragment #" + iArr[i14]);
                    }
                    obj.f10458h = EnumC1474s.values()[c0559b.f10434c[i13]];
                    obj.f10459i = EnumC1474s.values()[c0559b.f10435d[i13]];
                    int i15 = i12 + 2;
                    obj.f10454c = iArr[i14] != 0;
                    int i16 = iArr[i15];
                    obj.f10455d = i16;
                    int i17 = iArr[i12 + 3];
                    obj.f10456e = i17;
                    int i18 = i12 + 5;
                    int i19 = iArr[i12 + 4];
                    obj.f10457f = i19;
                    i12 += 6;
                    int i20 = iArr[i18];
                    obj.g = i20;
                    c0558a.f10410d = i16;
                    c0558a.f10411e = i17;
                    c0558a.f10412f = i19;
                    c0558a.g = i20;
                    c0558a.b(obj);
                    i13++;
                    i7 = 2;
                }
                c0558a.f10413h = c0559b.f10436e;
                c0558a.k = c0559b.f10437f;
                c0558a.f10414i = true;
                c0558a.f10415l = c0559b.f10439v;
                c0558a.f10416m = c0559b.f10440w;
                c0558a.f10417n = c0559b.f10441x;
                c0558a.f10418o = c0559b.f10442y;
                c0558a.f10419p = c0559b.f10443z;
                c0558a.f10420q = c0559b.f10430A;
                c0558a.f10421r = c0559b.f10431B;
                c0558a.f10424u = c0559b.f10438u;
                int i21 = 0;
                while (true) {
                    ArrayList arrayList2 = c0559b.f10433b;
                    if (i21 >= arrayList2.size()) {
                        break;
                    }
                    String str4 = (String) arrayList2.get(i21);
                    if (str4 != null) {
                        ((c0) c0558a.f10409c.get(i21)).f10453b = nVar.d(str4);
                    }
                    i21++;
                }
                c0558a.d(1);
                if (Log.isLoggable("FragmentManager", 2)) {
                    StringBuilder r10 = h3.o.r(i11, "restoreAllState: back stack #", " (index ");
                    r10.append(c0558a.f10424u);
                    r10.append("): ");
                    r10.append(c0558a);
                    Log.v("FragmentManager", r10.toString());
                    PrintWriter printWriter = new PrintWriter(new m0());
                    c0558a.h("  ", printWriter, false);
                    printWriter.close();
                }
                this.f10358d.add(c0558a);
                i11++;
                i7 = 2;
            }
            i10 = 0;
        } else {
            i10 = 0;
            this.f10358d = new ArrayList();
        }
        this.j.set(v10.f10381d);
        String str5 = v10.f10382e;
        if (str5 != null) {
            C d11 = nVar.d(str5);
            this.f10377z = d11;
            r(d11);
        }
        ArrayList arrayList3 = v10.f10383f;
        if (arrayList3 != null) {
            for (int i22 = i10; i22 < arrayList3.size(); i22++) {
                this.k.put((String) arrayList3.get(i22), (C0560c) v10.f10384u.get(i22));
            }
        }
        this.f10345F = new ArrayDeque(v10.f10385v);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11, types: [android.os.Parcelable, java.lang.Object, W1.V] */
    public final Bundle Y() {
        ArrayList arrayList;
        C0559b[] c0559bArr;
        Bundle bundle = new Bundle();
        F();
        x();
        A(true);
        this.f10347H = true;
        this.f10353O.f10392f = true;
        q3.n nVar = this.f10357c;
        nVar.getClass();
        HashMap hashMap = (HashMap) nVar.f23397c;
        ArrayList arrayList2 = new ArrayList(hashMap.size());
        for (a0 a0Var : hashMap.values()) {
            if (a0Var != null) {
                C c10 = a0Var.f10427c;
                nVar.p(c10.f10293f, a0Var.o());
                arrayList2.add(c10.f10293f);
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Saved state of " + c10 + ": " + c10.f10285b);
                }
            }
        }
        HashMap hashMap2 = (HashMap) this.f10357c.f23398d;
        if (!hashMap2.isEmpty()) {
            q3.n nVar2 = this.f10357c;
            synchronized (((ArrayList) nVar2.f23396b)) {
                try {
                    if (((ArrayList) nVar2.f23396b).isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(((ArrayList) nVar2.f23396b).size());
                        Iterator it = ((ArrayList) nVar2.f23396b).iterator();
                        while (it.hasNext()) {
                            C c11 = (C) it.next();
                            arrayList.add(c11.f10293f);
                            if (Log.isLoggable("FragmentManager", 2)) {
                                Log.v("FragmentManager", "saveAllState: adding fragment (" + c11.f10293f + "): " + c11);
                            }
                        }
                    }
                } finally {
                }
            }
            int size = this.f10358d.size();
            if (size > 0) {
                c0559bArr = new C0559b[size];
                for (int i7 = 0; i7 < size; i7++) {
                    c0559bArr[i7] = new C0559b((C0558a) this.f10358d.get(i7));
                    if (Log.isLoggable("FragmentManager", 2)) {
                        StringBuilder r10 = h3.o.r(i7, "saveAllState: adding back stack #", ": ");
                        r10.append(this.f10358d.get(i7));
                        Log.v("FragmentManager", r10.toString());
                    }
                }
            } else {
                c0559bArr = null;
            }
            ?? obj = new Object();
            obj.f10382e = null;
            ArrayList arrayList3 = new ArrayList();
            obj.f10383f = arrayList3;
            ArrayList arrayList4 = new ArrayList();
            obj.f10384u = arrayList4;
            obj.f10378a = arrayList2;
            obj.f10379b = arrayList;
            obj.f10380c = c0559bArr;
            obj.f10381d = this.j.get();
            C c12 = this.f10377z;
            if (c12 != null) {
                obj.f10382e = c12.f10293f;
            }
            arrayList3.addAll(this.k.keySet());
            arrayList4.addAll(this.k.values());
            obj.f10385v = new ArrayList(this.f10345F);
            bundle.putParcelable("state", obj);
            for (String str : this.f10363l.keySet()) {
                bundle.putBundle(X.c.t("result_", str), (Bundle) this.f10363l.get(str));
            }
            for (String str2 : hashMap2.keySet()) {
                bundle.putBundle(X.c.t("fragment_", str2), (Bundle) hashMap2.get(str2));
            }
        } else if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
        }
        return bundle;
    }

    public final void Z() {
        synchronized (this.f10355a) {
            try {
                if (this.f10355a.size() == 1) {
                    this.f10374w.f10312c.removeCallbacks(this.f10354P);
                    this.f10374w.f10312c.post(this.f10354P);
                    h0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final a0 a(C c10) {
        String str = c10.f10284a0;
        if (str != null) {
            X1.d.c(c10, str);
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "add: " + c10);
        }
        a0 g = g(c10);
        c10.f10265H = this;
        q3.n nVar = this.f10357c;
        nVar.m(g);
        if (!c10.f10272P) {
            nVar.a(c10);
            c10.f10258A = false;
            if (c10.f10277U == null) {
                c10.f10281Y = false;
            }
            if (M(c10)) {
                this.f10346G = true;
            }
        }
        return g;
    }

    public final void a0(C c10, boolean z8) {
        ViewGroup I6 = I(c10);
        if (I6 == null || !(I6 instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) I6).setDrawDisappearingViewsLast(!z8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(F f4, tc.b bVar, C c10) {
        if (this.f10374w != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f10374w = f4;
        this.f10375x = bVar;
        this.f10376y = c10;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f10367p;
        if (c10 != 0) {
            copyOnWriteArrayList.add(new N(c10));
        } else if (f4 != null) {
            copyOnWriteArrayList.add(f4);
        }
        if (this.f10376y != null) {
            h0();
        }
        if (f4 != null) {
            C0853A a9 = f4.f10314e.a();
            this.g = a9;
            a9.a(c10 != 0 ? c10 : f4, this.f10362i);
        }
        if (c10 != 0) {
            X x2 = c10.f10265H.f10353O;
            HashMap hashMap = x2.f10388b;
            X x10 = (X) hashMap.get(c10.f10293f);
            if (x10 == null) {
                x10 = new X(x2.f10390d);
                hashMap.put(c10.f10293f, x10);
            }
            this.f10353O = x10;
        } else if (f4 != null) {
            l2.d0 s3 = f4.f10314e.s();
            W w10 = X.g;
            C1779a defaultCreationExtras = C1779a.f21662b;
            kotlin.jvm.internal.l.e(defaultCreationExtras, "defaultCreationExtras");
            q3.n nVar = new q3.n(s3, w10, defaultCreationExtras);
            kotlin.jvm.internal.e a10 = kotlin.jvm.internal.w.a(X.class);
            String b2 = a10.b();
            if (b2 == null) {
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            }
            this.f10353O = (X) nVar.l(a10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b2));
        } else {
            this.f10353O = new X(false);
        }
        X x11 = this.f10353O;
        x11.f10392f = this.f10347H || this.f10348I;
        this.f10357c.f23399e = x11;
        F f10 = this.f10374w;
        if (f10 != null && c10 == 0) {
            q3.s b10 = f10.b();
            b10.D("android:support:fragments", new C0215z0(this, 2));
            Bundle o10 = b10.o("android:support:fragments");
            if (o10 != null) {
                X(o10);
            }
        }
        F f11 = this.f10374w;
        if (f11 != null) {
            G g = f11.f10314e;
            String t5 = X.c.t("FragmentManager:", c10 != 0 ? h3.o.p(new StringBuilder(), c10.f10293f, ":") : "");
            String h10 = X.c.h(t5, "StartActivityForResult");
            O o11 = new O(3);
            R7.b bVar2 = new R7.b(this, 7);
            C0865i c0865i = g.f14055w;
            this.f10342C = c0865i.c(h10, o11, bVar2);
            this.f10343D = c0865i.c(X.c.h(t5, "StartIntentSenderForResult"), new O(0), new C0463k(this, 11));
            this.f10344E = c0865i.c(X.c.h(t5, "RequestPermissions"), new O(1), new R7.a(this, 9));
        }
        F f12 = this.f10374w;
        if (f12 != null) {
            f12.f10314e.f(this.f10368q);
        }
        F f13 = this.f10374w;
        if (f13 != null) {
            G g2 = f13.f10314e;
            J listener = this.f10369r;
            g2.getClass();
            kotlin.jvm.internal.l.e(listener, "listener");
            g2.f14057y.add(listener);
        }
        F f14 = this.f10374w;
        if (f14 != null) {
            G g10 = f14.f10314e;
            J listener2 = this.f10370s;
            g10.getClass();
            kotlin.jvm.internal.l.e(listener2, "listener");
            g10.f14041A.add(listener2);
        }
        F f15 = this.f10374w;
        if (f15 != null) {
            G g11 = f15.f10314e;
            J listener3 = this.f10371t;
            g11.getClass();
            kotlin.jvm.internal.l.e(listener3, "listener");
            g11.f14042B.add(listener3);
        }
        F f16 = this.f10374w;
        if (f16 == null || c10 != 0) {
            return;
        }
        G g12 = f16.f10314e;
        L provider = this.f10372u;
        g12.getClass();
        kotlin.jvm.internal.l.e(provider, "provider");
        l2.X x12 = g12.f14049c;
        ((CopyOnWriteArrayList) x12.f19195c).add(provider);
        ((Runnable) x12.f19194b).run();
    }

    public final void b0(C c10, EnumC1474s enumC1474s) {
        if (c10.equals(this.f10357c.d(c10.f10293f)) && (c10.f10266I == null || c10.f10265H == this)) {
            c10.f10286b0 = enumC1474s;
            return;
        }
        throw new IllegalArgumentException("Fragment " + c10 + " is not an active fragment of FragmentManager " + this);
    }

    public final void c(C c10) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "attach: " + c10);
        }
        if (c10.f10272P) {
            c10.f10272P = false;
            if (c10.f10305z) {
                return;
            }
            this.f10357c.a(c10);
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "add from attach: " + c10);
            }
            if (M(c10)) {
                this.f10346G = true;
            }
        }
    }

    public final void c0(C c10) {
        if (c10 != null) {
            if (!c10.equals(this.f10357c.d(c10.f10293f)) || (c10.f10266I != null && c10.f10265H != this)) {
                throw new IllegalArgumentException("Fragment " + c10 + " is not an active fragment of FragmentManager " + this);
            }
        }
        C c11 = this.f10377z;
        this.f10377z = c10;
        r(c11);
        r(this.f10377z);
    }

    public final void d() {
        this.f10356b = false;
        this.f10351M.clear();
        this.L.clear();
    }

    public final void d0(C c10) {
        ViewGroup I6 = I(c10);
        if (I6 != null) {
            C0582z c0582z = c10.f10280X;
            if ((c0582z == null ? 0 : c0582z.f10580e) + (c0582z == null ? 0 : c0582z.f10579d) + (c0582z == null ? 0 : c0582z.f10578c) + (c0582z == null ? 0 : c0582z.f10577b) > 0) {
                if (I6.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    I6.setTag(R.id.visible_removing_fragment_view_tag, c10);
                }
                C c11 = (C) I6.getTag(R.id.visible_removing_fragment_view_tag);
                C0582z c0582z2 = c10.f10280X;
                boolean z8 = c0582z2 != null ? c0582z2.f10576a : false;
                if (c11.f10280X == null) {
                    return;
                }
                c11.z().f10576a = z8;
            }
        }
    }

    public final HashSet e() {
        C0573p c0573p;
        HashSet hashSet = new HashSet();
        Iterator it = this.f10357c.f().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((a0) it.next()).f10427c.f10276T;
            if (viewGroup != null) {
                U9.j factory = K();
                kotlin.jvm.internal.l.e(factory, "factory");
                Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
                if (tag instanceof C0573p) {
                    c0573p = (C0573p) tag;
                } else {
                    c0573p = new C0573p(viewGroup);
                    viewGroup.setTag(R.id.special_effects_controller_view_tag, c0573p);
                }
                hashSet.add(c0573p);
            }
        }
        return hashSet;
    }

    public final HashSet f(ArrayList arrayList, int i7, int i10) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i7 < i10) {
            Iterator it = ((C0558a) arrayList.get(i7)).f10409c.iterator();
            while (it.hasNext()) {
                C c10 = ((c0) it.next()).f10453b;
                if (c10 != null && (viewGroup = c10.f10276T) != null) {
                    hashSet.add(C0573p.j(viewGroup, this));
                }
            }
            i7++;
        }
        return hashSet;
    }

    public final void f0() {
        Iterator it = this.f10357c.f().iterator();
        while (it.hasNext()) {
            a0 a0Var = (a0) it.next();
            C c10 = a0Var.f10427c;
            if (c10.f10278V) {
                if (this.f10356b) {
                    this.f10350K = true;
                } else {
                    c10.f10278V = false;
                    a0Var.k();
                }
            }
        }
    }

    public final a0 g(C c10) {
        String str = c10.f10293f;
        q3.n nVar = this.f10357c;
        a0 a0Var = (a0) ((HashMap) nVar.f23397c).get(str);
        if (a0Var != null) {
            return a0Var;
        }
        a0 a0Var2 = new a0(this.f10366o, nVar, c10);
        a0Var2.m(this.f10374w.f10311b.getClassLoader());
        a0Var2.f10429e = this.f10373v;
        return a0Var2;
    }

    public final void g0(IllegalStateException illegalStateException) {
        Log.e("FragmentManager", illegalStateException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new m0());
        F f4 = this.f10374w;
        if (f4 == null) {
            try {
                w("  ", null, printWriter, new String[0]);
                throw illegalStateException;
            } catch (Exception e2) {
                Log.e("FragmentManager", "Failed dumping state", e2);
                throw illegalStateException;
            }
        }
        try {
            f4.f10314e.dump("  ", null, printWriter, new String[0]);
            throw illegalStateException;
        } catch (Exception e10) {
            Log.e("FragmentManager", "Failed dumping state", e10);
            throw illegalStateException;
        }
    }

    public final void h(C c10) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "detach: " + c10);
        }
        if (c10.f10272P) {
            return;
        }
        c10.f10272P = true;
        if (c10.f10305z) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "remove from detach: " + c10);
            }
            q3.n nVar = this.f10357c;
            synchronized (((ArrayList) nVar.f23396b)) {
                ((ArrayList) nVar.f23396b).remove(c10);
            }
            c10.f10305z = false;
            if (M(c10)) {
                this.f10346G = true;
            }
            d0(c10);
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [Rb.a, kotlin.jvm.internal.j] */
    /* JADX WARN: Type inference failed for: r2v5, types: [Rb.a, kotlin.jvm.internal.j] */
    public final void h0() {
        synchronized (this.f10355a) {
            try {
                if (!this.f10355a.isEmpty()) {
                    K k = this.f10362i;
                    k.f14068a = true;
                    ?? r22 = k.f14070c;
                    if (r22 != 0) {
                        r22.invoke();
                    }
                    if (Log.isLoggable("FragmentManager", 3)) {
                        Log.d("FragmentManager", "FragmentManager " + this + " enabling OnBackPressedCallback, caused by non-empty pending actions");
                    }
                    return;
                }
                boolean z8 = H() > 0 && P(this.f10376y);
                if (Log.isLoggable("FragmentManager", 3)) {
                    Log.d("FragmentManager", "OnBackPressedCallback for FragmentManager " + this + " enabled state is " + z8);
                }
                K k7 = this.f10362i;
                k7.f14068a = z8;
                ?? r02 = k7.f14070c;
                if (r02 != 0) {
                    r02.invoke();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i(boolean z8, Configuration configuration) {
        if (z8 && this.f10374w != null) {
            g0(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (C c10 : this.f10357c.h()) {
            if (c10 != null) {
                c10.onConfigurationChanged(configuration);
                if (z8) {
                    c10.f10267J.i(true, configuration);
                }
            }
        }
    }

    public final boolean j() {
        if (this.f10373v < 1) {
            return false;
        }
        for (C c10 : this.f10357c.h()) {
            if (c10 != null) {
                if (!c10.f10271O ? c10.f10267J.j() : false) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean k() {
        if (this.f10373v < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z8 = false;
        for (C c10 : this.f10357c.h()) {
            if (c10 != null && O(c10)) {
                if (!c10.f10271O ? c10.f10267J.k() : false) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(c10);
                    z8 = true;
                }
            }
        }
        if (this.f10359e != null) {
            for (int i7 = 0; i7 < this.f10359e.size(); i7++) {
                C c11 = (C) this.f10359e.get(i7);
                if (arrayList == null || !arrayList.contains(c11)) {
                    c11.getClass();
                }
            }
        }
        this.f10359e = arrayList;
        return z8;
    }

    public final void l() {
        boolean z8 = true;
        this.f10349J = true;
        A(true);
        x();
        F f4 = this.f10374w;
        q3.n nVar = this.f10357c;
        if (f4 != null) {
            z8 = ((X) nVar.f23399e).f10391e;
        } else {
            G g = f4.f10311b;
            if (g != null) {
                z8 = true ^ g.isChangingConfigurations();
            }
        }
        if (z8) {
            Iterator it = this.k.values().iterator();
            while (it.hasNext()) {
                Iterator it2 = ((C0560c) it.next()).f10450a.iterator();
                while (it2.hasNext()) {
                    ((X) nVar.f23399e).b((String) it2.next(), false);
                }
            }
        }
        u(-1);
        F f10 = this.f10374w;
        if (f10 != null) {
            G g2 = f10.f10314e;
            J listener = this.f10369r;
            g2.getClass();
            kotlin.jvm.internal.l.e(listener, "listener");
            g2.f14057y.remove(listener);
        }
        F f11 = this.f10374w;
        if (f11 != null) {
            G g10 = f11.f10314e;
            J listener2 = this.f10368q;
            g10.getClass();
            kotlin.jvm.internal.l.e(listener2, "listener");
            g10.f14056x.remove(listener2);
        }
        F f12 = this.f10374w;
        if (f12 != null) {
            G g11 = f12.f10314e;
            J listener3 = this.f10370s;
            g11.getClass();
            kotlin.jvm.internal.l.e(listener3, "listener");
            g11.f14041A.remove(listener3);
        }
        F f13 = this.f10374w;
        if (f13 != null) {
            G g12 = f13.f10314e;
            J listener4 = this.f10371t;
            g12.getClass();
            kotlin.jvm.internal.l.e(listener4, "listener");
            g12.f14042B.remove(listener4);
        }
        F f14 = this.f10374w;
        if (f14 != null && this.f10376y == null) {
            G g13 = f14.f10314e;
            L provider = this.f10372u;
            g13.getClass();
            kotlin.jvm.internal.l.e(provider, "provider");
            l2.X x2 = g13.f14049c;
            ((CopyOnWriteArrayList) x2.f19195c).remove(provider);
            if (((HashMap) x2.f19196d).remove(provider) != null) {
                throw new ClassCastException();
            }
            ((Runnable) x2.f19194b).run();
        }
        this.f10374w = null;
        this.f10375x = null;
        this.f10376y = null;
        if (this.g != null) {
            Iterator it3 = this.f10362i.f14069b.iterator();
            while (it3.hasNext()) {
                ((InterfaceC0858b) it3.next()).cancel();
            }
            this.g = null;
        }
        C1124h c1124h = this.f10342C;
        if (c1124h != null) {
            c1124h.b();
            this.f10343D.b();
            this.f10344E.b();
        }
    }

    public final void m(boolean z8) {
        if (z8 && this.f10374w != null) {
            g0(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (C c10 : this.f10357c.h()) {
            if (c10 != null) {
                c10.f10275S = true;
                if (z8) {
                    c10.f10267J.m(true);
                }
            }
        }
    }

    public final void n(boolean z8) {
        if (z8 && this.f10374w != null) {
            g0(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (C c10 : this.f10357c.h()) {
            if (c10 != null && z8) {
                c10.f10267J.n(true);
            }
        }
    }

    public final void o() {
        Iterator it = this.f10357c.g().iterator();
        while (it.hasNext()) {
            C c10 = (C) it.next();
            if (c10 != null) {
                c10.L();
                c10.f10267J.o();
            }
        }
    }

    public final boolean p() {
        if (this.f10373v < 1) {
            return false;
        }
        for (C c10 : this.f10357c.h()) {
            if (c10 != null) {
                if (!c10.f10271O ? c10.f10267J.p() : false) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void q() {
        if (this.f10373v < 1) {
            return;
        }
        for (C c10 : this.f10357c.h()) {
            if (c10 != null && !c10.f10271O) {
                c10.f10267J.q();
            }
        }
    }

    public final void r(C c10) {
        if (c10 != null) {
            if (c10.equals(this.f10357c.d(c10.f10293f))) {
                c10.f10265H.getClass();
                boolean P10 = P(c10);
                Boolean bool = c10.f10304y;
                if (bool == null || bool.booleanValue() != P10) {
                    c10.f10304y = Boolean.valueOf(P10);
                    U u3 = c10.f10267J;
                    u3.h0();
                    u3.r(u3.f10377z);
                }
            }
        }
    }

    public final void s(boolean z8) {
        if (z8 && this.f10374w != null) {
            g0(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (C c10 : this.f10357c.h()) {
            if (c10 != null && z8) {
                c10.f10267J.s(true);
            }
        }
    }

    public final boolean t() {
        if (this.f10373v < 1) {
            return false;
        }
        boolean z8 = false;
        for (C c10 : this.f10357c.h()) {
            if (c10 != null && O(c10)) {
                if (!c10.f10271O ? c10.f10267J.t() : false) {
                    z8 = true;
                }
            }
        }
        return z8;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        C c10 = this.f10376y;
        if (c10 != null) {
            sb2.append(c10.getClass().getSimpleName());
            sb2.append("{");
            sb2.append(Integer.toHexString(System.identityHashCode(this.f10376y)));
            sb2.append("}");
        } else {
            F f4 = this.f10374w;
            if (f4 != null) {
                sb2.append(f4.getClass().getSimpleName());
                sb2.append("{");
                sb2.append(Integer.toHexString(System.identityHashCode(this.f10374w)));
                sb2.append("}");
            } else {
                sb2.append("null");
            }
        }
        sb2.append("}}");
        return sb2.toString();
    }

    public final void u(int i7) {
        try {
            this.f10356b = true;
            for (a0 a0Var : ((HashMap) this.f10357c.f23397c).values()) {
                if (a0Var != null) {
                    a0Var.f10429e = i7;
                }
            }
            Q(i7, false);
            Iterator it = e().iterator();
            while (it.hasNext()) {
                ((C0573p) it.next()).i();
            }
            this.f10356b = false;
            A(true);
        } catch (Throwable th) {
            this.f10356b = false;
            throw th;
        }
    }

    public final void v() {
        if (this.f10350K) {
            this.f10350K = false;
            f0();
        }
    }

    public final void w(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        String h10 = X.c.h(str, "    ");
        q3.n nVar = this.f10357c;
        nVar.getClass();
        String str2 = str + "    ";
        HashMap hashMap = (HashMap) nVar.f23397c;
        if (!hashMap.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (a0 a0Var : hashMap.values()) {
                printWriter.print(str);
                if (a0Var != null) {
                    C c10 = a0Var.f10427c;
                    printWriter.println(c10);
                    c10.y(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        ArrayList arrayList = (ArrayList) nVar.f23396b;
        int size2 = arrayList.size();
        if (size2 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i7 = 0; i7 < size2; i7++) {
                C c11 = (C) arrayList.get(i7);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i7);
                printWriter.print(": ");
                printWriter.println(c11.toString());
            }
        }
        ArrayList arrayList2 = this.f10359e;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i10 = 0; i10 < size; i10++) {
                C c12 = (C) this.f10359e.get(i10);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(c12.toString());
            }
        }
        int size3 = this.f10358d.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i11 = 0; i11 < size3; i11++) {
                C0558a c0558a = (C0558a) this.f10358d.get(i11);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i11);
                printWriter.print(": ");
                printWriter.println(c0558a.toString());
                c0558a.h(h10, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.j.get());
        synchronized (this.f10355a) {
            try {
                int size4 = this.f10355a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i12 = 0; i12 < size4; i12++) {
                        Object obj = (Q) this.f10355a.get(i12);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i12);
                        printWriter.print(": ");
                        printWriter.println(obj);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f10374w);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f10375x);
        if (this.f10376y != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f10376y);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f10373v);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f10347H);
        printWriter.print(" mStopped=");
        printWriter.print(this.f10348I);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f10349J);
        if (this.f10346G) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f10346G);
        }
    }

    public final void x() {
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((C0573p) it.next()).i();
        }
    }

    public final void y(Q q10, boolean z8) {
        if (!z8) {
            if (this.f10374w == null) {
                if (!this.f10349J) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            if (this.f10347H || this.f10348I) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.f10355a) {
            try {
                if (this.f10374w == null) {
                    if (!z8) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f10355a.add(q10);
                    Z();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void z(boolean z8) {
        if (this.f10356b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f10374w == null) {
            if (!this.f10349J) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f10374w.f10312c.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z8 && (this.f10347H || this.f10348I)) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.L == null) {
            this.L = new ArrayList();
            this.f10351M = new ArrayList();
        }
    }
}
