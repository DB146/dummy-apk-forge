package x;

/* loaded from: classes.dex */
public final class m0 extends kotlin.jvm.internal.m implements Rb.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26124a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i0 f26125b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m0(i0 i0Var, int i7) {
        super(1);
        this.f26124a = i7;
        this.f26125b = i0Var;
    }

    @Override // Rb.c
    public final Object invoke(Object obj) {
        switch (this.f26124a) {
            case 0:
                return new l0(this.f26125b, 0);
            default:
                return new l0(this.f26125b, 1);
        }
    }
}
