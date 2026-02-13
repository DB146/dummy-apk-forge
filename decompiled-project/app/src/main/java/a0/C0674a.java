package a0;

/* renamed from: a0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0674a extends kotlin.jvm.internal.m implements Rb.c {

    /* renamed from: b, reason: collision with root package name */
    public static final C0674a f12365b = new C0674a(1, 0);

    /* renamed from: c, reason: collision with root package name */
    public static final C0674a f12366c = new C0674a(1, 1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12367a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0674a(int i7, int i10) {
        super(i7);
        this.f12367a = i10;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List, java.util.Collection, java.lang.Object] */
    @Override // Rb.c
    public final Object invoke(Object obj) {
        switch (this.f12367a) {
            case 0:
                synchronized (AbstractC0688o.f12405b) {
                    ?? r12 = AbstractC0688o.f12410h;
                    int size = r12.size();
                    for (int i7 = 0; i7 < size; i7++) {
                        ((Rb.c) r12.get(i7)).invoke(obj);
                    }
                }
                return Db.q.f3365a;
            default:
                return Db.q.f3365a;
        }
    }
}
