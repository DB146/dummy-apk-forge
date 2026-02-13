package yc;

import ea.C1111f;

/* loaded from: classes2.dex */
public final class K extends S {

    /* renamed from: d, reason: collision with root package name */
    public final C1111f f27665d;

    public K() {
        super(4);
        this.f27665d = new C1111f(19);
    }

    @Override // yc.S
    public final void g() {
        this.f27676b = -1;
        this.f27677c = -1;
        this.f27665d.z();
    }

    public final void h(char c10) {
        this.f27665d.h(c10);
    }

    public final String toString() {
        return "<!--" + this.f27665d.L() + "-->";
    }
}
