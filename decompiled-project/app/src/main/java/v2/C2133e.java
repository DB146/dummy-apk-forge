package v2;

import G3.C0283e;
import Y5.C0660y;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import l2.C1481z;
import l2.EnumC1474s;
import l2.InterfaceC1470n;
import l2.InterfaceC1479x;
import l2.Q;
import l2.Z;
import l2.a0;
import l2.d0;
import l2.e0;

/* renamed from: v2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2133e implements InterfaceC1479x, e0, InterfaceC1470n, Q2.e {

    /* renamed from: a, reason: collision with root package name */
    public final C0283e f24966a;

    /* renamed from: b, reason: collision with root package name */
    public q f24967b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f24968c;

    /* renamed from: d, reason: collision with root package name */
    public EnumC1474s f24969d;

    /* renamed from: e, reason: collision with root package name */
    public final C2138j f24970e;

    /* renamed from: f, reason: collision with root package name */
    public final String f24971f;

    /* renamed from: u, reason: collision with root package name */
    public final Bundle f24972u;

    /* renamed from: v, reason: collision with root package name */
    public final y2.c f24973v = new y2.c(this);

    public C2133e(C0283e c0283e, q qVar, Bundle bundle, EnumC1474s enumC1474s, C2138j c2138j, String str, Bundle bundle2) {
        this.f24966a = c0283e;
        this.f24967b = qVar;
        this.f24968c = bundle;
        this.f24969d = enumC1474s;
        this.f24970e = c2138j;
        this.f24971f = str;
        this.f24972u = bundle2;
        android.support.v4.media.session.b.z(new C2132d(this, 0));
    }

    @Override // Q2.e
    public final q3.s b() {
        return (q3.s) this.f24973v.f26754h.f23372c;
    }

    public final void c(EnumC1474s enumC1474s) {
        y2.c cVar = this.f24973v;
        cVar.getClass();
        cVar.k = enumC1474s;
        cVar.b();
    }

    public final boolean equals(Object obj) {
        Set<String> keySet;
        if (obj == null || !(obj instanceof C2133e)) {
            return false;
        }
        C2133e c2133e = (C2133e) obj;
        if (!kotlin.jvm.internal.l.a(this.f24971f, c2133e.f24971f) || !kotlin.jvm.internal.l.a(this.f24967b, c2133e.f24967b) || !kotlin.jvm.internal.l.a(this.f24973v.j, c2133e.f24973v.j) || !kotlin.jvm.internal.l.a(b(), c2133e.b())) {
            return false;
        }
        Bundle bundle = this.f24968c;
        Bundle bundle2 = c2133e.f24968c;
        if (!kotlin.jvm.internal.l.a(bundle, bundle2)) {
            if (bundle == null || (keySet = bundle.keySet()) == null) {
                return false;
            }
            Set<String> set = keySet;
            if (!(set instanceof Collection) || !set.isEmpty()) {
                for (String str : set) {
                    if (!kotlin.jvm.internal.l.a(bundle.get(str), bundle2 != null ? bundle2.get(str) : null)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        Set<String> keySet;
        int hashCode = this.f24967b.hashCode() + (this.f24971f.hashCode() * 31);
        Bundle bundle = this.f24968c;
        if (bundle != null && (keySet = bundle.keySet()) != null) {
            Iterator<T> it = keySet.iterator();
            while (it.hasNext()) {
                int i7 = hashCode * 31;
                Object obj = bundle.get((String) it.next());
                hashCode = i7 + (obj != null ? obj.hashCode() : 0);
            }
        }
        return b().hashCode() + ((this.f24973v.j.hashCode() + (hashCode * 31)) * 31);
    }

    @Override // l2.InterfaceC1470n
    public final a0 n() {
        return this.f24973v.f26756l;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    @Override // l2.InterfaceC1470n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final o2.d o() {
        Application application;
        Application application2;
        y2.c cVar = this.f24973v;
        cVar.getClass();
        o2.d dVar = new o2.d(0);
        C0660y c0660y = Q.f19174a;
        LinkedHashMap linkedHashMap = dVar.f21663a;
        C2133e c2133e = cVar.f26748a;
        linkedHashMap.put(c0660y, c2133e);
        linkedHashMap.put(Q.f19175b, c2133e);
        Bundle a9 = cVar.a();
        if (a9 != null) {
            linkedHashMap.put(Q.f19176c, a9);
        }
        C0283e c0283e = this.f24966a;
        if (c0283e != null) {
            Context context = c0283e.f4301b;
            Context applicationContext = context != null ? context.getApplicationContext() : null;
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                application2 = application != null ? application : null;
                if (application2 != null) {
                    linkedHashMap.put(Z.f19198d, application2);
                }
                return dVar;
            }
        }
        application = null;
        if (application != null) {
        }
        if (application2 != null) {
        }
        return dVar;
    }

    @Override // l2.e0
    public final d0 s() {
        y2.c cVar = this.f24973v;
        if (!cVar.f26755i) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
        }
        if (cVar.j.f19242d == EnumC1474s.f19227a) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.");
        }
        C2138j c2138j = cVar.f26752e;
        if (c2138j == null) {
            throw new IllegalStateException("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.");
        }
        String backStackEntryId = cVar.f26753f;
        kotlin.jvm.internal.l.e(backStackEntryId, "backStackEntryId");
        LinkedHashMap linkedHashMap = c2138j.f24987a;
        d0 d0Var = (d0) linkedHashMap.get(backStackEntryId);
        if (d0Var != null) {
            return d0Var;
        }
        d0 d0Var2 = new d0();
        linkedHashMap.put(backStackEntryId, d0Var2);
        return d0Var2;
    }

    public final String toString() {
        return this.f24973v.toString();
    }

    @Override // l2.InterfaceC1479x
    public final C1481z w() {
        return this.f24973v.j;
    }
}
