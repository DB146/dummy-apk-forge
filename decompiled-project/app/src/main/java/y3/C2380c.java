package y3;

import y0.AbstractC2322G;

/* renamed from: y3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2380c extends kotlin.jvm.internal.m implements Rb.c {

    /* renamed from: b, reason: collision with root package name */
    public static final C2380c f26797b = new C2380c(1, 0);

    /* renamed from: c, reason: collision with root package name */
    public static final C2380c f26798c = new C2380c(1, 1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26799a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2380c(int i7, int i10) {
        super(i7);
        this.f26799a = i10;
    }

    @Override // Rb.c
    public final Object invoke(Object obj) {
        switch (this.f26799a) {
            case 0:
                com.bumptech.glide.k it = (com.bumptech.glide.k) obj;
                kotlin.jvm.internal.l.e(it, "it");
                return it;
            default:
                AbstractC2322G layout = (AbstractC2322G) obj;
                kotlin.jvm.internal.l.e(layout, "$this$layout");
                return Db.q.f3365a;
        }
    }
}
