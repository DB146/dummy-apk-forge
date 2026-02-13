package E;

/* loaded from: classes.dex */
public final class f extends kotlin.jvm.internal.m implements Rb.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3407a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3408b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Object obj, int i7) {
        super(1);
        this.f3407a = i7;
        this.f3408b = obj;
    }

    @Override // Rb.c
    public final Object invoke(Object obj) {
        switch (this.f3407a) {
            case 0:
                ((Number) obj).intValue();
                return this.f3408b;
            default:
                return Boolean.valueOf(kotlin.jvm.internal.l.a(obj, this.f3408b));
        }
    }
}
