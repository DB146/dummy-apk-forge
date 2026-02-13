package Q;

import a0.AbstractC0696w;
import u.C2047J;

/* loaded from: classes.dex */
public final class O0 extends kotlin.jvm.internal.m implements Rb.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8347a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2047J f8348b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ O0(C2047J c2047j, int i7) {
        super(1);
        this.f8347a = i7;
        this.f8348b = c2047j;
    }

    @Override // Rb.c
    public final Object invoke(Object obj) {
        switch (this.f8347a) {
            case 0:
                if (obj instanceof AbstractC0696w) {
                    ((AbstractC0696w) obj).d(4);
                }
                this.f8348b.a(obj);
                return Db.q.f3365a;
            default:
                return obj == this.f8348b ? "(this)" : String.valueOf(obj);
        }
    }
}
