package Q;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class Q0 implements Iterable, Sb.a {

    /* renamed from: a, reason: collision with root package name */
    public final z0 f8361a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8362b;

    /* renamed from: c, reason: collision with root package name */
    public final C0480b f8363c;

    public Q0(z0 z0Var, int i7, K k, C0480b c0480b) {
        this.f8361a = z0Var;
        this.f8362b = i7;
        this.f8363c = c0480b;
        k.getClass();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new J(this.f8361a, this.f8362b, null, this.f8363c);
    }
}
