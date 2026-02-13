package y2;

import Eb.l;
import Eb.o;
import Eb.p;
import Eb.v;
import G3.C0283e;
import H2.C0288b;
import Y5.C0656w;
import Zb.i;
import Zb.j;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import fc.L;
import fc.P;
import fc.Q;
import fc.b0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.jvm.internal.y;
import l2.EnumC1474s;
import l2.InterfaceC1479x;
import l2.d0;
import v2.AbstractC2127A;
import v2.C2128B;
import v2.C2133e;
import v2.C2134f;
import v2.C2135g;
import v2.C2137i;
import v2.C2138j;
import v2.InterfaceC2131c;
import v2.q;
import v2.r;
import v2.u;
import v2.x;
import y7.u0;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final u f26765a;

    /* renamed from: b, reason: collision with root package name */
    public final C2135g f26766b;

    /* renamed from: c, reason: collision with root package name */
    public r f26767c;

    /* renamed from: d, reason: collision with root package name */
    public Bundle f26768d;

    /* renamed from: e, reason: collision with root package name */
    public Bundle[] f26769e;

    /* renamed from: f, reason: collision with root package name */
    public final l f26770f;
    public final b0 g;

    /* renamed from: h, reason: collision with root package name */
    public final b0 f26771h;

    /* renamed from: i, reason: collision with root package name */
    public final L f26772i;
    public final LinkedHashMap j;
    public final LinkedHashMap k;

    /* renamed from: l, reason: collision with root package name */
    public final LinkedHashMap f26773l;

    /* renamed from: m, reason: collision with root package name */
    public final LinkedHashMap f26774m;

    /* renamed from: n, reason: collision with root package name */
    public InterfaceC1479x f26775n;

    /* renamed from: o, reason: collision with root package name */
    public C2138j f26776o;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f26777p;

    /* renamed from: q, reason: collision with root package name */
    public EnumC1474s f26778q;

    /* renamed from: r, reason: collision with root package name */
    public final S2.a f26779r;

    /* renamed from: s, reason: collision with root package name */
    public final C2128B f26780s;

    /* renamed from: t, reason: collision with root package name */
    public final LinkedHashMap f26781t;

    /* renamed from: u, reason: collision with root package name */
    public Rb.c f26782u;

    /* renamed from: v, reason: collision with root package name */
    public d f26783v;

    /* renamed from: w, reason: collision with root package name */
    public final LinkedHashMap f26784w;

    /* renamed from: x, reason: collision with root package name */
    public int f26785x;

    /* renamed from: y, reason: collision with root package name */
    public final ArrayList f26786y;

    /* renamed from: z, reason: collision with root package name */
    public final P f26787z;

    public f(u navController, C2135g c2135g) {
        P a9;
        kotlin.jvm.internal.l.e(navController, "navController");
        this.f26765a = navController;
        this.f26766b = c2135g;
        this.f26770f = new l();
        v vVar = v.f3891a;
        this.g = Q.c(vVar);
        b0 c10 = Q.c(vVar);
        this.f26771h = c10;
        this.f26772i = new L(c10);
        this.j = new LinkedHashMap();
        this.k = new LinkedHashMap();
        this.f26773l = new LinkedHashMap();
        this.f26774m = new LinkedHashMap();
        this.f26777p = new ArrayList();
        this.f26778q = EnumC1474s.f19228b;
        this.f26779r = new S2.a(this, 1);
        this.f26780s = new C2128B();
        this.f26781t = new LinkedHashMap();
        this.f26784w = new LinkedHashMap();
        this.f26786y = new ArrayList();
        a9 = Q.a((r4 & 1) != 0 ? 0 : 1, (r4 & 2) == 0 ? 16 : 0, (r4 & 4) == 0 ? 2 : 1);
        this.f26787z = a9;
    }

    public static q d(int i7, q qVar, q qVar2, boolean z8) {
        if (qVar.f25017b.f4638a == i7 && (qVar2 == null || (qVar.equals(qVar2) && kotlin.jvm.internal.l.a(qVar.f25018c, qVar2.f25018c)))) {
            return qVar;
        }
        r rVar = qVar instanceof r ? (r) qVar : null;
        if (rVar == null) {
            rVar = qVar.f25018c;
            kotlin.jvm.internal.l.b(rVar);
        }
        return rVar.f25021f.j(i7, rVar, qVar2, z8);
    }

    public static /* synthetic */ void m(f fVar, C2133e c2133e) {
        fVar.l(c2133e, false, new l());
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0180, code lost:
    
        r15 = r5.f25027c;
        r0 = r11.f26767c;
        kotlin.jvm.internal.l.b(r0);
        r2 = r11.f26767c;
        kotlin.jvm.internal.l.b(r2);
        r6 = Y5.C0656w.f(r15, r0, r2.b(r13), h(), r11.f26776o);
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x019a, code lost:
    
        r1.addFirst(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x019d, code lost:
    
        r13 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01a5, code lost:
    
        if (r13.hasNext() == false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01a7, code lost:
    
        r15 = (v2.C2133e) r13.next();
        r0 = r11.f26781t.get(r11.f26780s.b(r15.f24967b.f25016a));
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01bd, code lost:
    
        if (r0 == null) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01bf, code lost:
    
        ((v2.C2137i) r0).a(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01dd, code lost:
    
        throw new java.lang.IllegalStateException(h3.o.p(new java.lang.StringBuilder("NavigatorBackStack for "), r12.f25016a, " should already be created").toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01de, code lost:
    
        r3.addAll(r1);
        r3.addLast(r14);
        r12 = Eb.o.h0(r1, r14).iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x01f0, code lost:
    
        if (r12.hasNext() == false) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x01f2, code lost:
    
        r13 = (v2.C2133e) r12.next();
        r14 = r13.f24967b.f25018c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01fc, code lost:
    
        if (r14 == null) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x01fe, code lost:
    
        i(r13, e(r14.f25017b.f4638a));
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x020a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0150, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0099, code lost:
    
        r4 = ((v2.C2133e) r1.first()).f24967b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002e, code lost:
    
        r1 = new Eb.l();
        r4 = r12 instanceof v2.r;
        r5 = r11.f26765a;
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        if (r4 == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        r4 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003b, code lost:
    
        kotlin.jvm.internal.l.b(r4);
        r4 = r4.f25018c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
    
        if (r4 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0042, code lost:
    
        r7 = r15.listIterator(r15.size());
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004e, code lost:
    
        if (r7.hasPrevious() == false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0050, code lost:
    
        r8 = r7.previous();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005d, code lost:
    
        if (kotlin.jvm.internal.l.a(((v2.C2133e) r8).f24967b, r4) == false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0061, code lost:
    
        r8 = (v2.C2133e) r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0063, code lost:
    
        if (r8 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0065, code lost:
    
        r8 = Y5.C0656w.f(r5.f25027c, r4, r13, h(), r11.f26776o);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0071, code lost:
    
        r1.addFirst(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0078, code lost:
    
        if (r3.isEmpty() != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x0007, code lost:
    
        if (r1 == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0082, code lost:
    
        if (((v2.C2133e) r3.last()).f24967b != r4) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0084, code lost:
    
        m(r11, (v2.C2133e) r3.last());
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0060, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008d, code lost:
    
        if (r4 == null) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008f, code lost:
    
        if (r4 != r12) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0095, code lost:
    
        if (r1.isEmpty() == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0097, code lost:
    
        r4 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a1, code lost:
    
        if (r4 == null) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ab, code lost:
    
        if (c(r4.f25017b.f4638a, r4) == r4) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ad, code lost:
    
        r4 = r4.f25018c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00af, code lost:
    
        if (r4 == null) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000d, code lost:
    
        if (r3.isEmpty() != false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b1, code lost:
    
        if (r13 == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00b7, code lost:
    
        if (r13.isEmpty() != true) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b9, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00bc, code lost:
    
        r8 = r15.listIterator(r15.size());
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00c8, code lost:
    
        if (r8.hasPrevious() == false) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00ca, code lost:
    
        r9 = r8.previous();
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00d7, code lost:
    
        if (kotlin.jvm.internal.l.a(((v2.C2133e) r9).f24967b, r4) == false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00db, code lost:
    
        r9 = (v2.C2133e) r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00dd, code lost:
    
        if (r9 != null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00df, code lost:
    
        r9 = Y5.C0656w.f(r5.f25027c, r4, r4.b(r7), h(), r11.f26776o);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00ef, code lost:
    
        r1.addFirst(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00da, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00bb, code lost:
    
        r7 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0019, code lost:
    
        if ((((v2.C2133e) r3.last()).f24967b instanceof v2.InterfaceC2131c) == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00f7, code lost:
    
        if (r1.isEmpty() == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00fa, code lost:
    
        r0 = ((v2.C2133e) r1.first()).f24967b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0106, code lost:
    
        if (r3.isEmpty() != false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0112, code lost:
    
        if ((((v2.C2133e) r3.last()).f24967b instanceof v2.r) == false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0114, code lost:
    
        r2 = ((v2.C2133e) r3.last()).f24967b;
        kotlin.jvm.internal.l.c(r2, "null cannot be cast to non-null type androidx.navigation.NavGraph");
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0131, code lost:
    
        if (((u.U) ((v2.r) r2).f25021f.f2091d).c(r0.f25017b.f4638a) != null) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0133, code lost:
    
        m(r11, (v2.C2133e) r3.last());
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x013d, code lost:
    
        r0 = (v2.C2133e) r3.z();
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0143, code lost:
    
        if (r0 != null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0145, code lost:
    
        r0 = (v2.C2133e) r1.z();
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x014b, code lost:
    
        if (r0 == null) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x014d, code lost:
    
        r0 = r0.f24967b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002c, code lost:
    
        if (k(((v2.C2133e) r3.last()).f24967b.f25017b.f4638a, true, false) != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0157, code lost:
    
        if (kotlin.jvm.internal.l.a(r0, r11.f26767c) != false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0159, code lost:
    
        r15 = r15.listIterator(r15.size());
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0165, code lost:
    
        if (r15.hasPrevious() == false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0167, code lost:
    
        r0 = r15.previous();
        r2 = ((v2.C2133e) r0).f24967b;
        r4 = r11.f26767c;
        kotlin.jvm.internal.l.b(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0179, code lost:
    
        if (kotlin.jvm.internal.l.a(r2, r4) == false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x017b, code lost:
    
        r6 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x017c, code lost:
    
        r6 = (v2.C2133e) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x017e, code lost:
    
        if (r6 != null) goto L85;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(q qVar, Bundle bundle, C2133e c2133e, List list) {
        q qVar2 = c2133e.f24967b;
        boolean z8 = qVar2 instanceof InterfaceC2131c;
        l lVar = this.f26770f;
    }

    public final boolean b() {
        l lVar;
        while (true) {
            lVar = this.f26770f;
            if (lVar.isEmpty() || !(((C2133e) lVar.last()).f24967b instanceof r)) {
                break;
            }
            m(this, (C2133e) lVar.last());
        }
        C2133e c2133e = (C2133e) lVar.D();
        ArrayList arrayList = this.f26786y;
        if (c2133e != null) {
            arrayList.add(c2133e);
        }
        this.f26785x++;
        q();
        int i7 = this.f26785x - 1;
        this.f26785x = i7;
        if (i7 == 0) {
            ArrayList u02 = o.u0(arrayList);
            arrayList.clear();
            Iterator it = u02.iterator();
            while (it.hasNext()) {
                C2133e c2133e2 = (C2133e) it.next();
                Iterator it2 = this.f26777p.iterator();
                if (it2.hasNext()) {
                    if (it2.next() != null) {
                        throw new ClassCastException();
                    }
                    q qVar = c2133e2.f24967b;
                    c2133e2.f24973v.a();
                    throw null;
                }
                this.f26787z.p(c2133e2);
            }
            ArrayList u03 = o.u0(lVar);
            b0 b0Var = this.g;
            b0Var.getClass();
            b0Var.j(null, u03);
            ArrayList n6 = n();
            b0 b0Var2 = this.f26771h;
            b0Var2.getClass();
            b0Var2.j(null, n6);
        }
        return c2133e != null;
    }

    public final q c(int i7, q qVar) {
        q qVar2;
        r rVar = this.f26767c;
        if (rVar == null) {
            return null;
        }
        if (rVar.f25017b.f4638a == i7) {
            if (qVar == null) {
                return rVar;
            }
            if (kotlin.jvm.internal.l.a(rVar, qVar) && qVar.f25018c == null) {
                return this.f26767c;
            }
        }
        C2133e c2133e = (C2133e) this.f26770f.D();
        if (c2133e == null || (qVar2 = c2133e.f24967b) == null) {
            qVar2 = this.f26767c;
            kotlin.jvm.internal.l.b(qVar2);
        }
        return d(i7, qVar2, qVar, false);
    }

    public final C2133e e(int i7) {
        Object obj;
        l lVar = this.f26770f;
        ListIterator<E> listIterator = lVar.listIterator(lVar.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            if (((C2133e) obj).f24967b.f25017b.f4638a == i7) {
                break;
            }
        }
        C2133e c2133e = (C2133e) obj;
        if (c2133e != null) {
            return c2133e;
        }
        StringBuilder r10 = h3.o.r(i7, "No destination with ID ", " is on the NavController's back stack. The current destination is ");
        r10.append(f());
        throw new IllegalArgumentException(r10.toString().toString());
    }

    public final q f() {
        C2133e c2133e = (C2133e) this.f26770f.D();
        if (c2133e != null) {
            return c2133e.f24967b;
        }
        return null;
    }

    public final r g() {
        r rVar = this.f26767c;
        if (rVar == null) {
            throw new IllegalStateException("You must call setGraph() before calling getGraph()");
        }
        kotlin.jvm.internal.l.c(rVar, "null cannot be cast to non-null type androidx.navigation.NavGraph");
        return rVar;
    }

    public final EnumC1474s h() {
        return this.f26775n == null ? EnumC1474s.f19229c : this.f26778q;
    }

    public final void i(C2133e c2133e, C2133e c2133e2) {
        this.j.put(c2133e, c2133e2);
        LinkedHashMap linkedHashMap = this.k;
        if (linkedHashMap.get(c2133e2) == null) {
            linkedHashMap.put(c2133e2, new a());
        }
        Object obj = linkedHashMap.get(c2133e2);
        kotlin.jvm.internal.l.b(obj);
        ((a) obj).f26746a.incrementAndGet();
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x023b, code lost:
    
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0111, code lost:
    
        if (r24.f25017b.f4638a == r3.f25017b.f4638a) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ff, code lost:
    
        if (r13.equals(r3) == false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0113, code lost:
    
        r3 = new Eb.l();
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x011e, code lost:
    
        if (y7.u0.s(r23.f26770f) < r4) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0120, code lost:
    
        r6 = (v2.C2133e) Eb.o.k0(r23.f26770f);
        p(r6);
        r15 = new v2.C2133e(r6.f24966a, r6.f24967b, r6.f24967b.b(r25), r6.f24969d, r6.f24970e, r6.f24971f, r6.f24972u);
        r1 = r15.f24973v;
        r2 = r6.f24969d;
        r1.getClass();
        kotlin.jvm.internal.l.e(r2, "<set-?>");
        r1.f26751d = r2;
        r1 = r15.f24973v;
        r2 = r6.f24973v.k;
        r1.getClass();
        kotlin.jvm.internal.l.e(r2, "maxState");
        r1.k = r2;
        r1.b();
        r3.addFirst(r15);
        r4 = r4;
        r11 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0182, code lost:
    
        r22 = r11;
        r1 = r3.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x018c, code lost:
    
        if (r1.hasNext() == false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x018e, code lost:
    
        r2 = (v2.C2133e) r1.next();
        r4 = r2.f24967b.f25018c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0198, code lost:
    
        if (r4 == null) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x019a, code lost:
    
        i(r2, e(r4.f25017b.f4638a));
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01a5, code lost:
    
        r23.f26770f.addLast(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01ab, code lost:
    
        r1 = r3.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01b3, code lost:
    
        if (r1.hasNext() == false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01b5, code lost:
    
        r2 = (v2.C2133e) r1.next();
        r3 = r23.f26780s.b(r2.f24967b.f25016a);
        r4 = r2.f24967b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01c7, code lost:
    
        if (r4 == null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01ca, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01cb, code lost:
    
        if (r4 != null) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01cf, code lost:
    
        r6 = new v2.y();
        r6.f25044b = true;
        r11 = r6.f25044b;
        r12 = r6.f25043a;
        r12.f25031a = r11;
        r12.f25032b = false;
        r13 = r6.f25045c;
        r6 = r6.f25046d;
        r12.f25033c = r13;
        r12.f25034d = false;
        r12.f25035e = r6;
        r3.c(r4);
        r3 = r3.b();
        r4 = r3.f24980a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01f3, code lost:
    
        monitor-enter(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01f4, code lost:
    
        r6 = Eb.o.u0((java.util.Collection) ((fc.b0) r3.f24984e.f17078a).getValue());
        r11 = r6.listIterator(r6.size());
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0210, code lost:
    
        if (r11.hasPrevious() == false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0220, code lost:
    
        if (kotlin.jvm.internal.l.a(((v2.C2133e) r11.previous()).f24971f, r2.f24971f) == false) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0222, code lost:
    
        r11 = r11.nextIndex();
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x022a, code lost:
    
        r6.set(r11, r2);
        r2 = r3.f24981b;
        r2.getClass();
        r2.j(null, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0236, code lost:
    
        monitor-exit(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0229, code lost:
    
        r11 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0227, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x023a, code lost:
    
        throw r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0242  */
    /* JADX WARN: Type inference failed for: r10v0, types: [kotlin.jvm.internal.r, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(q node, Bundle bundle, x xVar) {
        boolean z8;
        boolean z10;
        boolean z11;
        int i7;
        int i10;
        kotlin.jvm.internal.l.e(node, "node");
        Iterator it = this.f26781t.values().iterator();
        while (it.hasNext()) {
            ((C2137i) it.next()).f24983d = true;
        }
        ?? obj = new Object();
        boolean k = (xVar == null || (i10 = xVar.f25039c) == -1) ? false : k(i10, xVar.f25040d, xVar.f25041e);
        Bundle b2 = node.b(bundle);
        if (xVar != null && xVar.f25038b && this.f26773l.containsKey(Integer.valueOf(node.f25017b.f4638a))) {
            obj.f19130a = o(node.f25017b.f4638a, b2, xVar);
            z8 = k;
            z11 = false;
        } else {
            if (xVar != null && xVar.f25037a) {
                C2133e c2133e = (C2133e) this.f26770f.D();
                l lVar = this.f26770f;
                ListIterator listIterator = lVar.listIterator(lVar.b());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        i7 = -1;
                        break;
                    } else if (((C2133e) listIterator.previous()).f24967b == node) {
                        i7 = listIterator.nextIndex();
                        break;
                    }
                }
                if (i7 != -1) {
                    if (node instanceof r) {
                        int i11 = r.f25020u;
                        List P10 = i.P(new j(i.N((r) node, new Ba.i(17)), new Ba.i(26), 1));
                        if (this.f26770f.f3884c - i7 == P10.size()) {
                            l lVar2 = this.f26770f;
                            List subList = lVar2.subList(i7, lVar2.f3884c);
                            ArrayList arrayList = new ArrayList(p.S(subList, 10));
                            Iterator it2 = subList.iterator();
                            while (it2.hasNext()) {
                                arrayList.add(Integer.valueOf(((C2133e) it2.next()).f24967b.f25017b.f4638a));
                            }
                        }
                    } else if (c2133e != null) {
                        q qVar = c2133e.f24967b;
                        if (qVar != null) {
                        }
                    }
                    if (!z10) {
                        C2133e f4 = C0656w.f(this.f26765a.f25027c, node, b2, h(), this.f26776o);
                        AbstractC2127A b10 = this.f26780s.b(node.f25016a);
                        List x2 = u0.x(f4);
                        this.f26782u = new Ea.g(obj, this, node, b2, 3);
                        b10.d(x2, xVar);
                        this.f26782u = null;
                    }
                    z11 = z10;
                }
            }
            z8 = k;
            z10 = false;
            if (!z10) {
            }
            z11 = z10;
        }
        this.f26766b.invoke();
        Iterator it3 = this.f26781t.values().iterator();
        while (it3.hasNext()) {
            ((C2137i) it3.next()).f24983d = false;
        }
        if (z8 || obj.f19130a || z11) {
            b();
        } else {
            q();
        }
    }

    /* JADX WARN: Type inference failed for: r12v0, types: [kotlin.jvm.internal.r, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [kotlin.jvm.internal.r, java.lang.Object] */
    public final boolean k(int i7, boolean z8, boolean z10) {
        q qVar;
        E5.o oVar;
        l lVar = this.f26770f;
        if (lVar.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = o.l0(lVar).iterator();
        while (true) {
            if (!it.hasNext()) {
                qVar = null;
                break;
            }
            q qVar2 = ((C2133e) it.next()).f24967b;
            AbstractC2127A b2 = this.f26780s.b(qVar2.f25016a);
            C0288b c0288b = qVar2.f25017b;
            if (z8 || c0288b.f4638a != i7) {
                arrayList.add(b2);
            }
            if (c0288b.f4638a == i7) {
                qVar = qVar2;
                break;
            }
        }
        if (qVar == null) {
            int i10 = q.f25015e;
            String message = "Ignoring popBackStack to destination " + u0.q(this.f26765a.f25027c, i7) + " as it was not found on the current back stack";
            kotlin.jvm.internal.l.e(message, "message");
            Log.i("NavController", message);
            return false;
        }
        ?? obj = new Object();
        l lVar2 = new l();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            AbstractC2127A navigator = (AbstractC2127A) it2.next();
            ?? obj2 = new Object();
            C2133e popUpTo = (C2133e) lVar.last();
            l lVar3 = lVar;
            d dVar = new d(obj2, obj, this, z10, lVar2);
            kotlin.jvm.internal.l.e(navigator, "navigator");
            kotlin.jvm.internal.l.e(popUpTo, "popUpTo");
            this.f26783v = dVar;
            navigator.e(popUpTo, z10);
            this.f26783v = null;
            if (!obj2.f19130a) {
                break;
            }
            lVar = lVar3;
        }
        if (z10) {
            LinkedHashMap linkedHashMap = this.f26773l;
            if (!z8) {
                final int i11 = 0;
                Zb.e eVar = new Zb.e(new j(i.N(qVar, new Ba.i(24)), new Rb.c(this) { // from class: y2.e

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ f f26764b;

                    {
                        this.f26764b = this;
                    }

                    @Override // Rb.c
                    public final Object invoke(Object obj3) {
                        q destination = (q) obj3;
                        switch (i11) {
                            case 0:
                                kotlin.jvm.internal.l.e(destination, "destination");
                                return Boolean.valueOf(!this.f26764b.f26773l.containsKey(Integer.valueOf(destination.f25017b.f4638a)));
                            default:
                                kotlin.jvm.internal.l.e(destination, "destination");
                                return Boolean.valueOf(!this.f26764b.f26773l.containsKey(Integer.valueOf(destination.f25017b.f4638a)));
                        }
                    }
                }, 0));
                while (eVar.hasNext()) {
                    Integer valueOf = Integer.valueOf(((q) eVar.next()).f25017b.f4638a);
                    C2134f c2134f = (C2134f) lVar2.z();
                    linkedHashMap.put(valueOf, c2134f != null ? (String) c2134f.f24974a.f3713b : null);
                }
            }
            if (!lVar2.isEmpty()) {
                C2134f c2134f2 = (C2134f) lVar2.first();
                final int i12 = 1;
                Zb.e eVar2 = new Zb.e(new j(i.N(c(c2134f2.f24974a.f3712a, null), new Ba.i(25)), new Rb.c(this) { // from class: y2.e

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ f f26764b;

                    {
                        this.f26764b = this;
                    }

                    @Override // Rb.c
                    public final Object invoke(Object obj3) {
                        q destination = (q) obj3;
                        switch (i12) {
                            case 0:
                                kotlin.jvm.internal.l.e(destination, "destination");
                                return Boolean.valueOf(!this.f26764b.f26773l.containsKey(Integer.valueOf(destination.f25017b.f4638a)));
                            default:
                                kotlin.jvm.internal.l.e(destination, "destination");
                                return Boolean.valueOf(!this.f26764b.f26773l.containsKey(Integer.valueOf(destination.f25017b.f4638a)));
                        }
                    }
                }, 0));
                while (true) {
                    boolean hasNext = eVar2.hasNext();
                    oVar = c2134f2.f24974a;
                    if (!hasNext) {
                        break;
                    }
                    linkedHashMap.put(Integer.valueOf(((q) eVar2.next()).f25017b.f4638a), (String) oVar.f3713b);
                }
                if (linkedHashMap.values().contains((String) oVar.f3713b)) {
                    this.f26774m.put((String) oVar.f3713b, lVar2);
                }
            }
        }
        this.f26766b.invoke();
        return obj.f19130a;
    }

    public final void l(C2133e popUpTo, boolean z8, l lVar) {
        C2138j c2138j;
        L l10;
        Set set;
        kotlin.jvm.internal.l.e(popUpTo, "popUpTo");
        l lVar2 = this.f26770f;
        C2133e c2133e = (C2133e) lVar2.last();
        if (!kotlin.jvm.internal.l.a(c2133e, popUpTo)) {
            throw new IllegalStateException(("Attempted to pop " + popUpTo.f24967b + ", which is not the top of the back stack (" + c2133e.f24967b + ')').toString());
        }
        o.k0(lVar2);
        C2137i c2137i = (C2137i) this.f26781t.get(this.f26780s.b(c2133e.f24967b.f25016a));
        boolean z10 = true;
        if ((c2137i == null || (l10 = c2137i.f24985f) == null || (set = (Set) ((b0) l10.f17078a).getValue()) == null || !set.contains(c2133e)) && !this.k.containsKey(c2133e)) {
            z10 = false;
        }
        EnumC1474s enumC1474s = c2133e.f24973v.j.f19242d;
        EnumC1474s enumC1474s2 = EnumC1474s.f19229c;
        if (enumC1474s.compareTo(enumC1474s2) >= 0) {
            if (z8) {
                c2133e.c(enumC1474s2);
                lVar.addFirst(new C2134f(c2133e));
            }
            if (z10) {
                c2133e.c(enumC1474s2);
            } else {
                c2133e.c(EnumC1474s.f19227a);
                p(c2133e);
            }
        }
        if (z8 || z10 || (c2138j = this.f26776o) == null) {
            return;
        }
        String backStackEntryId = c2133e.f24971f;
        kotlin.jvm.internal.l.e(backStackEntryId, "backStackEntryId");
        d0 d0Var = (d0) c2138j.f24987a.remove(backStackEntryId);
        if (d0Var != null) {
            d0Var.a();
        }
    }

    public final ArrayList n() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f26781t.values().iterator();
        while (it.hasNext()) {
            Iterable iterable = (Iterable) ((b0) ((C2137i) it.next()).f24985f.f17078a).getValue();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : iterable) {
                C2133e c2133e = (C2133e) obj;
                if (!arrayList.contains(c2133e) && c2133e.f24973v.k.compareTo(EnumC1474s.f19230d) < 0) {
                    arrayList2.add(obj);
                }
            }
            o.U(arrayList, arrayList2);
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = this.f26770f.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            C2133e c2133e2 = (C2133e) next;
            if (!arrayList.contains(c2133e2) && c2133e2.f24973v.k.compareTo(EnumC1474s.f19230d) >= 0) {
                arrayList3.add(next);
            }
        }
        o.U(arrayList, arrayList3);
        ArrayList arrayList4 = new ArrayList();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            Object next2 = it3.next();
            if (!(((C2133e) next2).f24967b instanceof r)) {
                arrayList4.add(next2);
            }
        }
        return arrayList4;
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [kotlin.jvm.internal.r, java.lang.Object] */
    public final boolean o(int i7, Bundle bundle, x xVar) {
        q g;
        C2133e c2133e;
        q qVar;
        Bundle bundle2;
        LinkedHashMap linkedHashMap = this.f26773l;
        if (!linkedHashMap.containsKey(Integer.valueOf(i7))) {
            return false;
        }
        String str = (String) linkedHashMap.get(Integer.valueOf(i7));
        Collection values = linkedHashMap.values();
        kotlin.jvm.internal.l.e(values, "<this>");
        Iterator it = values.iterator();
        while (it.hasNext()) {
            if (kotlin.jvm.internal.l.a((String) it.next(), str)) {
                it.remove();
            }
        }
        l lVar = (l) y.a(this.f26774m).remove(str);
        ArrayList arrayList = new ArrayList();
        C2133e c2133e2 = (C2133e) this.f26770f.D();
        if (c2133e2 == null || (g = c2133e2.f24967b) == null) {
            g = g();
        }
        if (lVar != null) {
            Iterator it2 = lVar.iterator();
            while (it2.hasNext()) {
                C2134f c2134f = (C2134f) it2.next();
                q d10 = d(c2134f.f24974a.f3712a, g, null, true);
                E5.o oVar = c2134f.f24974a;
                u uVar = this.f26765a;
                if (d10 == null) {
                    int i10 = q.f25015e;
                    throw new IllegalStateException(("Restore State failed: destination " + u0.q(uVar.f25027c, oVar.f3712a) + " cannot be found from the current destination " + g).toString());
                }
                C0283e context = uVar.f25027c;
                EnumC1474s hostLifecycleState = h();
                C2138j c2138j = this.f26776o;
                kotlin.jvm.internal.l.e(context, "context");
                kotlin.jvm.internal.l.e(hostLifecycleState, "hostLifecycleState");
                Bundle bundle3 = (Bundle) oVar.f3714c;
                if (bundle3 != null) {
                    Context context2 = context.f4301b;
                    bundle3.setClassLoader(context2 != null ? context2.getClassLoader() : null);
                    bundle2 = bundle3;
                } else {
                    bundle2 = null;
                }
                String id = (String) oVar.f3713b;
                kotlin.jvm.internal.l.e(id, "id");
                arrayList.add(new C2133e(context, d10, bundle2, hostLifecycleState, c2138j, id, (Bundle) oVar.f3715d));
                g = d10;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            Object next = it3.next();
            if (!(((C2133e) next).f24967b instanceof r)) {
                arrayList3.add(next);
            }
        }
        Iterator it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            C2133e c2133e3 = (C2133e) it4.next();
            List list = (List) o.f0(arrayList2);
            if (kotlin.jvm.internal.l.a((list == null || (c2133e = (C2133e) o.e0(list)) == null || (qVar = c2133e.f24967b) == null) ? null : qVar.f25016a, c2133e3.f24967b.f25016a)) {
                list.add(c2133e3);
            } else {
                arrayList2.add(u0.B(c2133e3));
            }
        }
        ?? obj = new Object();
        Iterator it5 = arrayList2.iterator();
        while (it5.hasNext()) {
            List list2 = (List) it5.next();
            AbstractC2127A b2 = this.f26780s.b(((C2133e) o.Y(list2)).f24967b.f25016a);
            this.f26782u = new Ga.b(obj, arrayList, new Object(), this, bundle, 1);
            b2.d(list2, xVar);
            this.f26782u = null;
        }
        return obj.f19130a;
    }

    public final void p(C2133e child) {
        kotlin.jvm.internal.l.e(child, "child");
        C2133e c2133e = (C2133e) this.j.remove(child);
        if (c2133e == null) {
            return;
        }
        LinkedHashMap linkedHashMap = this.k;
        a aVar = (a) linkedHashMap.get(c2133e);
        Integer valueOf = aVar != null ? Integer.valueOf(aVar.f26746a.decrementAndGet()) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            C2137i c2137i = (C2137i) this.f26781t.get(this.f26780s.b(c2133e.f24967b.f25016a));
            if (c2137i != null) {
                c2137i.c(c2133e);
            }
            linkedHashMap.remove(c2133e);
        }
    }

    public final void q() {
        a aVar;
        L l10;
        Set set;
        ArrayList u02 = o.u0(this.f26770f);
        if (u02.isEmpty()) {
            return;
        }
        ArrayList B10 = u0.B(((C2133e) o.e0(u02)).f24967b);
        ArrayList arrayList = new ArrayList();
        if (o.e0(B10) instanceof InterfaceC2131c) {
            Iterator it = o.l0(u02).iterator();
            while (it.hasNext()) {
                q qVar = ((C2133e) it.next()).f24967b;
                arrayList.add(qVar);
                if (!(qVar instanceof InterfaceC2131c) && !(qVar instanceof r)) {
                    break;
                }
            }
        }
        HashMap hashMap = new HashMap();
        for (C2133e c2133e : o.l0(u02)) {
            EnumC1474s enumC1474s = c2133e.f24973v.k;
            q qVar2 = c2133e.f24967b;
            q qVar3 = (q) o.Z(B10);
            if (qVar3 != null && qVar3.f25017b.f4638a == qVar2.f25017b.f4638a) {
                EnumC1474s enumC1474s2 = EnumC1474s.f19231e;
                if (enumC1474s != enumC1474s2) {
                    C2137i c2137i = (C2137i) this.f26781t.get(this.f26780s.b(c2133e.f24967b.f25016a));
                    if (kotlin.jvm.internal.l.a((c2137i == null || (l10 = c2137i.f24985f) == null || (set = (Set) ((b0) l10.f17078a).getValue()) == null) ? null : Boolean.valueOf(set.contains(c2133e)), Boolean.TRUE) || ((aVar = (a) this.k.get(c2133e)) != null && aVar.f26746a.get() == 0)) {
                        hashMap.put(c2133e, EnumC1474s.f19230d);
                    } else {
                        hashMap.put(c2133e, enumC1474s2);
                    }
                }
                q qVar4 = (q) o.Z(arrayList);
                if (qVar4 != null && qVar4.f25017b.f4638a == qVar2.f25017b.f4638a) {
                    o.j0(arrayList);
                }
                o.j0(B10);
                r rVar = qVar2.f25018c;
                if (rVar != null) {
                    B10.add(rVar);
                }
            } else if (arrayList.isEmpty() || qVar2.f25017b.f4638a != ((q) o.Y(arrayList)).f25017b.f4638a) {
                c2133e.c(EnumC1474s.f19229c);
            } else {
                q qVar5 = (q) o.j0(arrayList);
                if (enumC1474s == EnumC1474s.f19231e) {
                    c2133e.c(EnumC1474s.f19230d);
                } else {
                    EnumC1474s enumC1474s3 = EnumC1474s.f19230d;
                    if (enumC1474s != enumC1474s3) {
                        hashMap.put(c2133e, enumC1474s3);
                    }
                }
                r rVar2 = qVar5.f25018c;
                if (rVar2 != null && !arrayList.contains(rVar2)) {
                    arrayList.add(rVar2);
                }
            }
        }
        Iterator it2 = u02.iterator();
        while (it2.hasNext()) {
            C2133e c2133e2 = (C2133e) it2.next();
            EnumC1474s enumC1474s4 = (EnumC1474s) hashMap.get(c2133e2);
            if (enumC1474s4 != null) {
                c2133e2.c(enumC1474s4);
            } else {
                c2133e2.f24973v.b();
            }
        }
    }
}
