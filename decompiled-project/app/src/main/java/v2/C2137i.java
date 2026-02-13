package v2;

import Y5.C0656w;
import android.os.Bundle;
import android.util.Log;
import fc.J;
import fc.L;
import fc.Q;
import fc.b0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import l2.EnumC1474s;
import l2.d0;

/* renamed from: v2.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2137i {

    /* renamed from: a, reason: collision with root package name */
    public final C0656w f24980a;

    /* renamed from: b, reason: collision with root package name */
    public final b0 f24981b;

    /* renamed from: c, reason: collision with root package name */
    public final b0 f24982c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f24983d;

    /* renamed from: e, reason: collision with root package name */
    public final L f24984e;

    /* renamed from: f, reason: collision with root package name */
    public final L f24985f;
    public final AbstractC2127A g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ u f24986h;

    public C2137i(u uVar, AbstractC2127A navigator) {
        kotlin.jvm.internal.l.e(navigator, "navigator");
        this.f24986h = uVar;
        this.f24980a = new C0656w(20);
        b0 c10 = Q.c(Eb.v.f3891a);
        this.f24981b = c10;
        b0 c11 = Q.c(Eb.x.f3893a);
        this.f24982c = c11;
        this.f24984e = new L(c10);
        this.f24985f = new L(c11);
        this.g = navigator;
    }

    public final void a(C2133e backStackEntry) {
        kotlin.jvm.internal.l.e(backStackEntry, "backStackEntry");
        synchronized (this.f24980a) {
            b0 b0Var = this.f24981b;
            ArrayList h02 = Eb.o.h0((Collection) b0Var.getValue(), backStackEntry);
            b0Var.getClass();
            b0Var.j(null, h02);
        }
    }

    public final C2133e b(q qVar, Bundle bundle) {
        y2.f fVar = this.f24986h.f25026b;
        fVar.getClass();
        return C0656w.f(fVar.f26765a.f25027c, qVar, bundle, fVar.h(), fVar.f26776o);
    }

    public final void c(C2133e entry) {
        C2138j c2138j;
        kotlin.jvm.internal.l.e(entry, "entry");
        y2.f fVar = this.f24986h.f25026b;
        C2136h c2136h = new C2136h(this, entry);
        fVar.getClass();
        LinkedHashMap linkedHashMap = fVar.f26784w;
        boolean a9 = kotlin.jvm.internal.l.a(linkedHashMap.get(entry), Boolean.TRUE);
        c2136h.invoke();
        linkedHashMap.remove(entry);
        Eb.l lVar = fVar.f26770f;
        boolean contains = lVar.contains(entry);
        b0 b0Var = fVar.f26771h;
        if (contains) {
            if (this.f24983d) {
                return;
            }
            fVar.q();
            ArrayList u02 = Eb.o.u0(lVar);
            b0 b0Var2 = fVar.g;
            b0Var2.getClass();
            b0Var2.j(null, u02);
            ArrayList n6 = fVar.n();
            b0Var.getClass();
            b0Var.j(null, n6);
            return;
        }
        fVar.p(entry);
        if (entry.f24973v.j.f19242d.compareTo(EnumC1474s.f19229c) >= 0) {
            entry.c(EnumC1474s.f19227a);
        }
        boolean isEmpty = lVar.isEmpty();
        String backStackEntryId = entry.f24971f;
        if (!isEmpty) {
            Iterator it = lVar.iterator();
            while (it.hasNext()) {
                if (kotlin.jvm.internal.l.a(((C2133e) it.next()).f24971f, backStackEntryId)) {
                    break;
                }
            }
        }
        if (!a9 && (c2138j = fVar.f26776o) != null) {
            kotlin.jvm.internal.l.e(backStackEntryId, "backStackEntryId");
            d0 d0Var = (d0) c2138j.f24987a.remove(backStackEntryId);
            if (d0Var != null) {
                d0Var.a();
            }
        }
        fVar.q();
        ArrayList n8 = fVar.n();
        b0Var.getClass();
        b0Var.j(null, n8);
    }

    public final void d(C2133e c2133e, boolean z8) {
        y2.f fVar = this.f24986h.f25026b;
        C2136h c2136h = new C2136h(this, c2133e, z8);
        fVar.getClass();
        AbstractC2127A b2 = fVar.f26780s.b(c2133e.f24967b.f25016a);
        fVar.f26784w.put(c2133e, Boolean.valueOf(z8));
        if (!b2.equals(this.g)) {
            Object obj = fVar.f26781t.get(b2);
            kotlin.jvm.internal.l.b(obj);
            ((C2137i) obj).d(c2133e, z8);
            return;
        }
        y2.d dVar = fVar.f26783v;
        if (dVar != null) {
            dVar.invoke(c2133e);
            c2136h.invoke();
            return;
        }
        Eb.l lVar = fVar.f26770f;
        int indexOf = lVar.indexOf(c2133e);
        if (indexOf < 0) {
            String message = "Ignoring pop of " + c2133e + " as it was not found on the current back stack";
            kotlin.jvm.internal.l.e(message, "message");
            Log.i("NavController", message);
            return;
        }
        int i7 = indexOf + 1;
        if (i7 != lVar.f3884c) {
            fVar.k(((C2133e) lVar.get(i7)).f24967b.f25017b.f4638a, true, false);
        }
        y2.f.m(fVar, c2133e);
        c2136h.invoke();
        fVar.f26766b.invoke();
        fVar.b();
    }

    public final void e(C2133e c2133e, boolean z8) {
        Object obj;
        b0 b0Var = this.f24982c;
        Iterable iterable = (Iterable) b0Var.getValue();
        boolean z10 = iterable instanceof Collection;
        L l10 = this.f24984e;
        if (!z10 || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((C2133e) it.next()) == c2133e) {
                    Iterable iterable2 = (Iterable) ((b0) l10.f17078a).getValue();
                    if ((iterable2 instanceof Collection) && ((Collection) iterable2).isEmpty()) {
                        return;
                    }
                    Iterator it2 = iterable2.iterator();
                    while (it2.hasNext()) {
                        if (((C2133e) it2.next()) == c2133e) {
                        }
                    }
                    return;
                }
            }
        }
        b0Var.j(null, O5.b.C((Set) b0Var.getValue(), c2133e));
        List list = (List) ((b0) l10.f17078a).getValue();
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            C2133e c2133e2 = (C2133e) obj;
            if (!kotlin.jvm.internal.l.a(c2133e2, c2133e)) {
                J j = l10.f17078a;
                if (((List) ((b0) j).getValue()).lastIndexOf(c2133e2) < ((List) ((b0) j).getValue()).lastIndexOf(c2133e)) {
                    break;
                }
            }
        }
        C2133e c2133e3 = (C2133e) obj;
        if (c2133e3 != null) {
            b0Var.j(null, O5.b.C((Set) b0Var.getValue(), c2133e3));
        }
        d(c2133e, z8);
    }

    public final void f(C2133e backStackEntry) {
        kotlin.jvm.internal.l.e(backStackEntry, "backStackEntry");
        y2.f fVar = this.f24986h.f25026b;
        fVar.getClass();
        AbstractC2127A b2 = fVar.f26780s.b(backStackEntry.f24967b.f25016a);
        if (!b2.equals(this.g)) {
            Object obj = fVar.f26781t.get(b2);
            if (obj == null) {
                throw new IllegalStateException(h3.o.p(new StringBuilder("NavigatorBackStack for "), backStackEntry.f24967b.f25016a, " should already be created").toString());
            }
            ((C2137i) obj).f(backStackEntry);
            return;
        }
        Rb.c cVar = fVar.f26782u;
        if (cVar != null) {
            cVar.invoke(backStackEntry);
            a(backStackEntry);
            return;
        }
        String message = "Ignoring add of destination " + backStackEntry.f24967b + " outside of the call to navigate(). ";
        kotlin.jvm.internal.l.e(message, "message");
        Log.i("NavController", message);
    }
}
