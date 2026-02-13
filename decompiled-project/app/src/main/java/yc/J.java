package yc;

import ea.C1111f;

/* loaded from: classes2.dex */
public class J extends S {

    /* renamed from: d, reason: collision with root package name */
    public final C1111f f27664d;

    public J() {
        super(5);
        this.f27664d = new C1111f(19);
    }

    public J(J j) {
        super(5);
        C1111f c1111f = new C1111f(19);
        this.f27664d = c1111f;
        this.f27676b = j.f27676b;
        this.f27677c = j.f27677c;
        String L = j.f27664d.L();
        c1111f.z();
        c1111f.f16837b = L;
    }

    @Override // yc.S
    public final void g() {
        this.f27676b = -1;
        this.f27677c = -1;
        this.f27664d.z();
    }

    public String toString() {
        return this.f27664d.L();
    }
}
