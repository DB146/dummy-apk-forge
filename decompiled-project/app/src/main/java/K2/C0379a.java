package K2;

/* renamed from: K2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0379a implements Hb.g {

    /* renamed from: b, reason: collision with root package name */
    public static final U9.i f6007b = new U9.i(8);

    /* renamed from: a, reason: collision with root package name */
    public final x f6008a;

    public C0379a(x connectionWrapper) {
        kotlin.jvm.internal.l.e(connectionWrapper, "connectionWrapper");
        this.f6008a = connectionWrapper;
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
        return f6007b;
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
