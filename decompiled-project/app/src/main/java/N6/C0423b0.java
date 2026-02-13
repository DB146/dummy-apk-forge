package N6;

/* renamed from: N6.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0423b0 implements V {

    /* renamed from: b, reason: collision with root package name */
    public static final C0423b0 f7277b = new C0423b0(0);

    /* renamed from: c, reason: collision with root package name */
    public static final C0423b0 f7278c = new C0423b0(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7279a;

    public /* synthetic */ C0423b0(int i7) {
        this.f7279a = i7;
    }

    @Override // N6.V
    public final U a(X x2, Object obj, int i7, U u3) {
        switch (this.f7279a) {
            case 0:
                C0427d0 c0427d0 = (C0427d0) u3;
                return c0427d0 == null ? new C0427d0(obj, i7) : new C0425c0(obj, i7, c0427d0);
            default:
                C0433g0 c0433g0 = (C0433g0) u3;
                return c0433g0 == null ? new C0433g0(obj, i7) : new C0431f0(obj, i7, c0433g0);
        }
    }

    @Override // N6.V
    public final X b(l0 l0Var, int i7) {
        switch (this.f7279a) {
            case 0:
                return new X(l0Var, i7);
            default:
                return new C0435h0(l0Var, i7);
        }
    }

    @Override // N6.V
    public final EnumC0421a0 c() {
        switch (this.f7279a) {
            case 0:
                return EnumC0421a0.f7269a;
            default:
                return EnumC0421a0.f7270b;
        }
    }

    @Override // N6.V
    public final U d(X x2, U u3, U u10) {
        switch (this.f7279a) {
            case 0:
                C0427d0 c0427d0 = (C0427d0) u3;
                C0427d0 c0427d02 = (C0427d0) u10;
                Object obj = c0427d0.f7246a;
                int i7 = c0427d0.f7247b;
                C0427d0 c0427d03 = c0427d02 == null ? new C0427d0(obj, i7) : new C0425c0(obj, i7, c0427d02);
                c0427d03.f7286c = c0427d0.f7286c;
                return c0427d03;
            default:
                C0435h0 c0435h0 = (C0435h0) x2;
                C0433g0 c0433g0 = (C0433g0) u3;
                C0433g0 c0433g02 = (C0433g0) u10;
                int i10 = X.f7260u;
                if (c0433g0.getValue() == null) {
                    return null;
                }
                Object obj2 = c0433g0.f7246a;
                int i11 = c0433g0.f7247b;
                C0433g0 c0433g03 = c0433g02 == null ? new C0433g0(obj2, i11) : new C0431f0(obj2, i11, c0433g02);
                c0433g03.f7295c = c0433g0.f7295c.a(c0435h0.f7297v, c0433g03);
                return c0433g03;
        }
    }

    @Override // N6.V
    public final void e(X x2, U u3, Object obj) {
        switch (this.f7279a) {
            case 0:
                ((C0427d0) u3).f7286c = obj;
                return;
            default:
                C0433g0 c0433g0 = (C0433g0) u3;
                i0 i0Var = c0433g0.f7295c;
                c0433g0.f7295c = new j0(((C0435h0) x2).f7297v, obj, c0433g0);
                i0Var.clear();
                return;
        }
    }
}
