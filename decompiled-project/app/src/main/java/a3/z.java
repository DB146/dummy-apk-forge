package a3;

/* loaded from: classes.dex */
public final class z extends v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12606a;

    /* renamed from: b, reason: collision with root package name */
    public u f12607b;

    public /* synthetic */ z() {
        this.f12606a = 1;
    }

    public /* synthetic */ z(u uVar, int i7) {
        this.f12606a = i7;
        this.f12607b = uVar;
    }

    @Override // a3.v, a3.s
    public void d(u uVar) {
        switch (this.f12606a) {
            case 1:
                C0709A c0709a = (C0709A) this.f12607b;
                int i7 = c0709a.f12494U - 1;
                c0709a.f12494U = i7;
                if (i7 == 0) {
                    c0709a.f12495V = false;
                    c0709a.n();
                }
                uVar.B(this);
                return;
            case 2:
                this.f12607b.E();
                uVar.B(this);
                return;
            default:
                return;
        }
    }

    @Override // a3.v, a3.s
    public void e(u uVar) {
        switch (this.f12606a) {
            case 1:
                C0709A c0709a = (C0709A) this.f12607b;
                if (c0709a.f12495V) {
                    return;
                }
                c0709a.M();
                c0709a.f12495V = true;
                return;
            default:
                return;
        }
    }

    @Override // a3.v, a3.s
    public void f(u uVar) {
        switch (this.f12606a) {
            case 0:
                C0709A c0709a = (C0709A) this.f12607b;
                c0709a.f12492S.remove(uVar);
                if (c0709a.t()) {
                    return;
                }
                c0709a.y(c0709a, t.f12567n, false);
                c0709a.f12579F = true;
                c0709a.y(c0709a, t.f12566m, false);
                return;
            default:
                return;
        }
    }
}
