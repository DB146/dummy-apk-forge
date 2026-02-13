package Q;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: Q.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0502m extends r {

    /* renamed from: a, reason: collision with root package name */
    public final int f8418a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f8419b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f8420c;

    /* renamed from: d, reason: collision with root package name */
    public HashSet f8421d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashSet f8422e = new LinkedHashSet();

    /* renamed from: f, reason: collision with root package name */
    public final C0487e0 f8423f = new C0487e0(Y.j.f11053d, S.f8366d);
    public final /* synthetic */ C0506o g;

    public C0502m(C0506o c0506o, int i7, boolean z8, boolean z10, S s3) {
        this.g = c0506o;
        this.f8418a = i7;
        this.f8419b = z8;
        this.f8420c = z10;
    }

    @Override // Q.r
    public final void a(C0517u c0517u, Y.e eVar) {
        this.g.f8452b.a(c0517u, eVar);
    }

    @Override // Q.r
    public final void b() {
        C0506o c0506o = this.g;
        c0506o.f8473z--;
    }

    @Override // Q.r
    public final boolean c() {
        return this.g.f8452b.c();
    }

    @Override // Q.r
    public final boolean d() {
        return this.f8419b;
    }

    @Override // Q.r
    public final boolean e() {
        return this.f8420c;
    }

    @Override // Q.r
    public final InterfaceC0493h0 f() {
        return (InterfaceC0493h0) this.f8423f.getValue();
    }

    @Override // Q.r
    public final int g() {
        return this.f8418a;
    }

    @Override // Q.r
    public final Hb.i h() {
        return this.g.f8452b.h();
    }

    @Override // Q.r
    public final void i(C0517u c0517u) {
        C0506o c0506o = this.g;
        c0506o.f8452b.i(c0506o.g);
        c0506o.f8452b.i(c0517u);
    }

    @Override // Q.r
    public final U j(V v10) {
        return this.g.f8452b.j(v10);
    }

    @Override // Q.r
    public final void k(Set set) {
        HashSet hashSet = this.f8421d;
        if (hashSet == null) {
            hashSet = new HashSet();
            this.f8421d = hashSet;
        }
        hashSet.add(set);
    }

    @Override // Q.r
    public final void l(C0506o c0506o) {
        this.f8422e.add(c0506o);
    }

    @Override // Q.r
    public final void m(C0517u c0517u) {
        this.g.f8452b.m(c0517u);
    }

    @Override // Q.r
    public final void n() {
        this.g.f8473z++;
    }

    @Override // Q.r
    public final void o(C0506o c0506o) {
        HashSet hashSet = this.f8421d;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                Set set = (Set) it.next();
                kotlin.jvm.internal.l.c(c0506o, "null cannot be cast to non-null type androidx.compose.runtime.ComposerImpl");
                set.remove(c0506o.f8453c);
            }
        }
        LinkedHashSet linkedHashSet = this.f8422e;
        if (!(linkedHashSet instanceof Sb.a) || (linkedHashSet instanceof Sb.b)) {
            linkedHashSet.remove(c0506o);
        } else {
            kotlin.jvm.internal.y.f(linkedHashSet, "kotlin.collections.MutableCollection");
            throw null;
        }
    }

    @Override // Q.r
    public final void p(C0517u c0517u) {
        this.g.f8452b.p(c0517u);
    }

    public final void q() {
        LinkedHashSet<C0506o> linkedHashSet = this.f8422e;
        if (linkedHashSet.isEmpty()) {
            return;
        }
        HashSet hashSet = this.f8421d;
        if (hashSet != null) {
            for (C0506o c0506o : linkedHashSet) {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    ((Set) it.next()).remove(c0506o.f8453c);
                }
            }
        }
        linkedHashSet.clear();
    }
}
