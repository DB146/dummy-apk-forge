package Za;

import Y5.C0658x;
import db.C1069b;
import l2.Y;
import l2.a0;

/* loaded from: classes2.dex */
public final class f implements a0 {

    /* renamed from: d, reason: collision with root package name */
    public static final C0658x f12331d = new C0658x(7);

    /* renamed from: a, reason: collision with root package name */
    public final C1069b f12332a;

    /* renamed from: b, reason: collision with root package name */
    public final a0 f12333b;

    /* renamed from: c, reason: collision with root package name */
    public final d f12334c;

    public f(C1069b c1069b, a0 a0Var, ha.g gVar) {
        this.f12332a = c1069b;
        this.f12333b = a0Var;
        this.f12334c = new d(gVar, 0);
    }

    @Override // l2.a0
    public final Y a(Class cls) {
        if (this.f12332a.containsKey(cls)) {
            throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
        }
        return this.f12333b.a(cls);
    }

    @Override // l2.a0
    public final Y b(Class cls, o2.d dVar) {
        return this.f12332a.containsKey(cls) ? this.f12334c.b(cls, dVar) : this.f12333b.b(cls, dVar);
    }
}
