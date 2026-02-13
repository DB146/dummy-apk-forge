package Q;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import u.C2070x;

/* loaded from: classes.dex */
public final class z0 implements Iterable, Sb.a {

    /* renamed from: b, reason: collision with root package name */
    public int f8587b;

    /* renamed from: d, reason: collision with root package name */
    public int f8589d;

    /* renamed from: e, reason: collision with root package name */
    public int f8590e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f8591f;

    /* renamed from: u, reason: collision with root package name */
    public boolean f8592u;

    /* renamed from: v, reason: collision with root package name */
    public int f8593v;

    /* renamed from: x, reason: collision with root package name */
    public HashMap f8595x;

    /* renamed from: y, reason: collision with root package name */
    public C2070x f8596y;

    /* renamed from: a, reason: collision with root package name */
    public int[] f8586a = new int[0];

    /* renamed from: c, reason: collision with root package name */
    public Object[] f8588c = new Object[0];

    /* renamed from: w, reason: collision with root package name */
    public ArrayList f8594w = new ArrayList();

    public final int b(C0478a c0478a) {
        if (this.f8592u) {
            AbstractC0508p.c("Use active SlotWriter to determine anchor location instead");
        }
        if (!c0478a.a()) {
            AbstractC0495i0.a("Anchor refers to a group that was removed");
        }
        return c0478a.f8373a;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new J(this, 0, this.f8587b);
    }

    public final void o() {
        this.f8595x = new HashMap();
    }

    public final y0 t() {
        if (this.f8592u) {
            throw new IllegalStateException("Cannot read while a writer is pending");
        }
        this.f8590e++;
        return new y0(this);
    }

    public final C0 y() {
        if (this.f8592u) {
            AbstractC0508p.c("Cannot start a writer when another writer is pending");
        }
        if (this.f8590e > 0) {
            AbstractC0508p.c("Cannot start a writer when a reader is pending");
        }
        this.f8592u = true;
        this.f8593v++;
        return new C0(this);
    }

    public final boolean z(C0478a c0478a) {
        int e2;
        return c0478a.a() && (e2 = B0.e(this.f8594w, c0478a.f8373a, this.f8587b)) >= 0 && kotlin.jvm.internal.l.a(this.f8594w.get(e2), c0478a);
    }
}
