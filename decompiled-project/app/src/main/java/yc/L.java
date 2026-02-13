package yc;

import ea.C1111f;

/* loaded from: classes2.dex */
public final class L extends S {

    /* renamed from: d, reason: collision with root package name */
    public final C1111f f27666d;

    /* renamed from: e, reason: collision with root package name */
    public String f27667e;

    /* renamed from: f, reason: collision with root package name */
    public final C1111f f27668f;
    public final C1111f g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f27669h;

    public L() {
        super(1);
        this.f27666d = new C1111f(19);
        this.f27667e = null;
        this.f27668f = new C1111f(19);
        this.g = new C1111f(19);
        this.f27669h = false;
    }

    @Override // yc.S
    public final void g() {
        this.f27676b = -1;
        this.f27677c = -1;
        this.f27666d.z();
        this.f27667e = null;
        this.f27668f.z();
        this.g.z();
        this.f27669h = false;
    }

    public final String toString() {
        return "<!doctype " + this.f27666d.L() + ">";
    }
}
