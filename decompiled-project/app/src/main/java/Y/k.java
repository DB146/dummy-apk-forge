package Y;

import Q.C0480b;
import Q.C0487e0;
import Q.InterfaceC0494i;
import Q.v0;
import Q.w0;
import android.os.Trace;
import b4.C0837h;
import b4.C0840k;
import ea.C1111f;
import java.util.ArrayList;
import java.util.HashMap;
import u.C2047J;
import u.C2069w;
import u.L;
import x.AbstractC2232b;
import x.AbstractC2243m;
import x.C2229B;
import x.C2231a;
import x.C2238h;
import x.C2239i;
import x.C2240j;
import x.C2241k;
import x.InterfaceC2249t;
import x.Q;
import x.Z;
import y7.u0;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public Object f11054a;

    /* renamed from: b, reason: collision with root package name */
    public Object f11055b;

    /* renamed from: c, reason: collision with root package name */
    public Object f11056c;

    /* renamed from: d, reason: collision with root package name */
    public Object f11057d;

    /* renamed from: e, reason: collision with root package name */
    public Object f11058e;

    /* renamed from: f, reason: collision with root package name */
    public Object f11059f;
    public Object g;

    /* renamed from: h, reason: collision with root package name */
    public Object f11060h;

    /* renamed from: i, reason: collision with root package name */
    public Object f11061i;
    public Object j;

    public k(Object obj, C1111f c1111f, Object obj2, int i7) {
        AbstractC2243m abstractC2243m = null;
        obj2 = (i7 & 4) != 0 ? null : obj2;
        this.f11054a = c1111f;
        this.f11055b = obj2;
        C2238h c2238h = new C2238h(c1111f, obj, abstractC2243m, 60);
        this.f11056c = c2238h;
        this.f11057d = C0480b.o(Boolean.FALSE);
        this.f11058e = C0480b.o(obj);
        this.f11059f = new C2229B();
        new Q(1500.0f, obj2);
        AbstractC2243m abstractC2243m2 = c2238h.f26094c;
        boolean z8 = abstractC2243m2 instanceof C2239i;
        Object obj3 = z8 ? AbstractC2232b.f26049e : abstractC2243m2 instanceof C2240j ? AbstractC2232b.f26050f : abstractC2243m2 instanceof C2241k ? AbstractC2232b.g : AbstractC2232b.f26051h;
        this.g = obj3;
        Object obj4 = z8 ? AbstractC2232b.f26045a : abstractC2243m2 instanceof C2240j ? AbstractC2232b.f26046b : abstractC2243m2 instanceof C2241k ? AbstractC2232b.f26047c : AbstractC2232b.f26048d;
        this.f11060h = obj4;
        this.f11061i = obj3;
        this.j = obj4;
    }

    public k(L l10) {
        this.f11054a = l10;
        S.e eVar = new S.e(new w0[16]);
        this.f11055b = eVar;
        this.f11056c = eVar;
        this.f11057d = new S.e(new Object[16]);
        this.f11058e = new S.e(new Rb.a[16]);
        this.g = new ArrayList();
        this.f11061i = new C2069w();
        this.j = new C2069w();
    }

    public static final void a(k kVar) {
        C2238h c2238h = (C2238h) kVar.f11056c;
        c2238h.f26094c.d();
        c2238h.f26095d = Long.MIN_VALUE;
        ((C0487e0) kVar.f11057d).setValue(Boolean.FALSE);
    }

    public static Object c(k kVar, Object obj, InterfaceC2249t interfaceC2249t, Rb.c cVar, Jb.i iVar, int i7) {
        Object invoke = ((Rb.c) ((C1111f) kVar.f11054a).f16838c).invoke(((C2238h) kVar.f11056c).f26094c);
        Rb.c cVar2 = (i7 & 8) != 0 ? null : cVar;
        Object g = kVar.g();
        C1111f c1111f = (C1111f) kVar.f11054a;
        return C2229B.a((C2229B) kVar.f11059f, new C2231a(kVar, invoke, new Z(interfaceC2249t, c1111f, g, obj, (AbstractC2243m) ((Rb.c) c1111f.f16837b).invoke(invoke)), ((C2238h) kVar.f11056c).f26095d, cVar2, null), iVar);
    }

    public void b(String str, String str2) {
        HashMap hashMap = (HashMap) this.f11059f;
        if (hashMap == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        hashMap.put(str, str2);
    }

    public C0837h d() {
        String str = ((String) this.f11054a) == null ? " transportName" : "";
        if (((C0840k) this.f11056c) == null) {
            str = str.concat(" encodedPayload");
        }
        if (((Long) this.f11057d) == null) {
            str = X.c.h(str, " eventMillis");
        }
        if (((Long) this.f11058e) == null) {
            str = X.c.h(str, " uptimeMillis");
        }
        if (((HashMap) this.f11059f) == null) {
            str = X.c.h(str, " autoMetadata");
        }
        if (str.isEmpty()) {
            return new C0837h((String) this.f11054a, (Integer) this.f11055b, (C0840k) this.f11056c, ((Long) this.f11057d).longValue(), ((Long) this.f11058e).longValue(), (HashMap) this.f11059f, (Integer) this.g, (String) this.f11060h, (byte[]) this.f11061i, (byte[]) this.j);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public void e() {
        L l10 = (L) this.f11054a;
        if (l10.isEmpty()) {
            return;
        }
        Trace.beginSection("Compose:abandons");
        try {
            l10.getClass();
            W.c cVar = new W.c(l10);
            Zb.h hVar = (Zb.h) cVar.f10248b;
            while (hVar.hasNext()) {
                v0 v0Var = (v0) hVar.next();
                cVar.remove();
                v0Var.c();
            }
        } finally {
            Trace.endSection();
        }
    }

    public void f() {
        h(Integer.MIN_VALUE);
        S.e eVar = (S.e) this.f11057d;
        int i7 = eVar.f8961c;
        L l10 = (L) this.f11054a;
        if (i7 != 0) {
            Trace.beginSection("Compose:onForgotten");
            try {
                C2047J c2047j = (C2047J) this.f11059f;
                int i10 = eVar.f8961c;
                while (true) {
                    i10--;
                    if (-1 >= i10) {
                        break;
                    }
                    Object obj = eVar.f8959a[i10];
                    if (obj instanceof w0) {
                        v0 v0Var = ((w0) obj).f8565a;
                        l10.remove(v0Var);
                        v0Var.d();
                    }
                    if (obj instanceof InterfaceC0494i) {
                        if (c2047j == null || !c2047j.c(obj)) {
                            ((InterfaceC0494i) obj).f();
                        } else {
                            ((InterfaceC0494i) obj).e();
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        S.e eVar2 = (S.e) this.f11055b;
        if (eVar2.f8961c != 0) {
            Trace.beginSection("Compose:onRemembered");
            try {
                Object[] objArr = eVar2.f8959a;
                int i11 = eVar2.f8961c;
                for (int i12 = 0; i12 < i11; i12++) {
                    v0 v0Var2 = ((w0) objArr[i12]).f8565a;
                    l10.remove(v0Var2);
                    v0Var2.b();
                }
            } finally {
                Trace.endSection();
            }
        }
    }

    public Object g() {
        return ((C2238h) this.f11056c).f26093b.getValue();
    }

    public void h(int i7) {
        ArrayList arrayList = (ArrayList) this.g;
        if (arrayList.isEmpty()) {
            return;
        }
        int i10 = 0;
        ArrayList arrayList2 = null;
        int i11 = 0;
        C2069w c2069w = null;
        C2069w c2069w2 = null;
        while (true) {
            C2069w c2069w3 = (C2069w) this.j;
            if (i11 >= c2069w3.f24728b) {
                break;
            }
            if (i7 <= c2069w3.b(i11)) {
                Object remove = arrayList.remove(i11);
                int c10 = c2069w3.c(i11);
                int c11 = ((C2069w) this.f11061i).c(i11);
                if (arrayList2 == null) {
                    arrayList2 = u0.B(remove);
                    c2069w2 = new C2069w();
                    c2069w2.a(c10);
                    c2069w = new C2069w();
                    c2069w.a(c11);
                } else {
                    kotlin.jvm.internal.l.c(c2069w, "null cannot be cast to non-null type androidx.collection.MutableIntList");
                    kotlin.jvm.internal.l.c(c2069w2, "null cannot be cast to non-null type androidx.collection.MutableIntList");
                    arrayList2.add(remove);
                    c2069w2.a(c10);
                    c2069w.a(c11);
                }
            } else {
                i11++;
            }
        }
        if (arrayList2 != null) {
            kotlin.jvm.internal.l.c(c2069w, "null cannot be cast to non-null type androidx.collection.MutableIntList");
            kotlin.jvm.internal.l.c(c2069w2, "null cannot be cast to non-null type androidx.collection.MutableIntList");
            int size = arrayList2.size() - 1;
            while (i10 < size) {
                int i12 = i10 + 1;
                int size2 = arrayList2.size();
                for (int i13 = i12; i13 < size2; i13++) {
                    int b2 = c2069w2.b(i10);
                    int b10 = c2069w2.b(i13);
                    if (b2 < b10 || (b10 == b2 && c2069w.b(i10) < c2069w.b(i13))) {
                        Object obj = arrayList2.get(i10);
                        arrayList2.set(i10, arrayList2.get(i13));
                        arrayList2.set(i13, obj);
                        int b11 = c2069w.b(i10);
                        c2069w.d(i10, c2069w.b(i13));
                        c2069w.d(i13, b11);
                        int b12 = c2069w2.b(i10);
                        c2069w2.d(i10, c2069w2.b(i13));
                        c2069w2.d(i13, b12);
                    }
                }
                i10 = i12;
            }
            S.e eVar = (S.e) this.f11057d;
            eVar.d(eVar.f8961c, arrayList2);
        }
    }

    public void i(Object obj, int i7, int i10, int i11) {
        h(i7);
        if (i11 < 0 || i11 >= i7) {
            ((S.e) this.f11057d).b(obj);
            return;
        }
        ((ArrayList) this.g).add(obj);
        ((C2069w) this.f11061i).a(i10);
        ((C2069w) this.j).a(i11);
    }
}
