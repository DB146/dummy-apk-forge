package F;

import Q.C0480b;
import Q.C0487e0;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final Object f4025a;

    /* renamed from: b, reason: collision with root package name */
    public final A f4026b;

    /* renamed from: d, reason: collision with root package name */
    public int f4028d;

    /* renamed from: e, reason: collision with root package name */
    public z f4029e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4030f;

    /* renamed from: c, reason: collision with root package name */
    public int f4027c = -1;
    public final C0487e0 g = C0480b.o(null);

    public z(Object obj, A a9) {
        this.f4025a = obj;
        this.f4026b = a9;
    }

    public final z a() {
        if (this.f4030f) {
            B.a.c("Pin should not be called on an already disposed item ");
        }
        if (this.f4028d == 0) {
            this.f4026b.f3898a.add(this);
            z zVar = (z) this.g.getValue();
            if (zVar != null) {
                zVar.a();
            } else {
                zVar = null;
            }
            this.f4029e = zVar;
        }
        this.f4028d++;
        return this;
    }

    public final void b() {
        if (this.f4030f) {
            return;
        }
        if (this.f4028d <= 0) {
            B.a.c("Release should only be called once");
        }
        int i7 = this.f4028d - 1;
        this.f4028d = i7;
        if (i7 == 0) {
            this.f4026b.f3898a.remove(this);
            z zVar = this.f4029e;
            if (zVar != null) {
                zVar.b();
            }
            this.f4029e = null;
        }
    }
}
