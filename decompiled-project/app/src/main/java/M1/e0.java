package M1;

/* loaded from: classes.dex */
public final class e0 implements Hb.g {

    /* renamed from: a, reason: collision with root package name */
    public final e0 f6666a;

    /* renamed from: b, reason: collision with root package name */
    public final Q f6667b;

    public e0(e0 e0Var, Q instance) {
        kotlin.jvm.internal.l.e(instance, "instance");
        this.f6666a = e0Var;
        this.f6667b = instance;
    }

    public final void a(Q q10) {
        if (this.f6667b == q10) {
            throw new IllegalStateException("Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.");
        }
        e0 e0Var = this.f6666a;
        if (e0Var != null) {
            e0Var.a(q10);
        }
    }

    @Override // Hb.i
    public final Object fold(Object obj, Rb.e eVar) {
        return eVar.invoke(obj, this);
    }

    @Override // Hb.i
    public final Hb.g get(Hb.h hVar) {
        return E6.b.l(this, hVar);
    }

    @Override // Hb.g
    public final Hb.h getKey() {
        return d0.f6662a;
    }

    @Override // Hb.i
    public final Hb.i minusKey(Hb.h hVar) {
        return E6.b.v(this, hVar);
    }

    @Override // Hb.i
    public final Hb.i plus(Hb.i iVar) {
        return E6.b.w(this, iVar);
    }
}
