package A8;

import android.content.Context;

/* loaded from: classes.dex */
public final class r extends kotlin.jvm.internal.m implements Rb.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f714a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f715b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(Context context, int i7) {
        super(0);
        this.f714a = i7;
        this.f715b = context;
    }

    @Override // Rb.a
    public final Object invoke() {
        switch (this.f714a) {
            case 0:
                return E6.b.x(this.f715b, E.f544b);
            default:
                return E6.b.x(this.f715b, E.f543a);
        }
    }
}
