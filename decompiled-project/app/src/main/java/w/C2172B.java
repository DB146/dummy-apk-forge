package w;

/* renamed from: w.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2172B extends kotlin.jvm.internal.m implements Rb.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f25485a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Rb.a f25486b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2172B(boolean z8, Rb.a aVar) {
        super(1);
        this.f25485a = z8;
        this.f25486b = aVar;
    }

    @Override // Rb.c
    public final Object invoke(Object obj) {
        j0.B b2 = (j0.B) obj;
        boolean z8 = !this.f25485a && ((Boolean) this.f25486b.invoke()).booleanValue();
        if (b2.f18509y != z8) {
            b2.f18499a |= 16384;
            b2.f18509y = z8;
        }
        return Db.q.f3365a;
    }
}
