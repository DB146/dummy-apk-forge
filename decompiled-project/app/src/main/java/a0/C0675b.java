package a0;

/* renamed from: a0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0675b extends kotlin.jvm.internal.m implements Rb.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12368a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Rb.c f12369b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Rb.c f12370c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0675b(Rb.c cVar, Rb.c cVar2, int i7) {
        super(1);
        this.f12368a = i7;
        this.f12369b = cVar;
        this.f12370c = cVar2;
    }

    @Override // Rb.c
    public final Object invoke(Object obj) {
        long j;
        switch (this.f12368a) {
            case 0:
                C0686m c0686m = (C0686m) obj;
                synchronized (AbstractC0688o.f12405b) {
                    j = AbstractC0688o.f12407d;
                    AbstractC0688o.f12407d = 1 + j;
                }
                return new C0678e(j, c0686m, this.f12369b, this.f12370c);
            case 1:
                this.f12369b.invoke(obj);
                this.f12370c.invoke(obj);
                return Db.q.f3365a;
            default:
                this.f12369b.invoke(obj);
                this.f12370c.invoke(obj);
                return Db.q.f3365a;
        }
    }
}
