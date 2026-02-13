package B0;

import ea.C1111f;
import x.C2236f;

/* loaded from: classes.dex */
public final class R0 extends kotlin.jvm.internal.m implements Rb.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1779a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Rb.e f1780b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R0(Rb.e eVar, int i7) {
        super(1);
        this.f1779a = i7;
        switch (i7) {
            case 1:
                C1111f c1111f = x.p0.f26141a;
                this.f1780b = eVar;
                super(1);
                return;
            default:
                this.f1780b = eVar;
                return;
        }
    }

    @Override // Rb.c
    public final Object invoke(Object obj) {
        Db.q qVar = Db.q.f3365a;
        Rb.e eVar = this.f1780b;
        switch (this.f1779a) {
            case 0:
                eVar.invoke((j0.l) obj, null);
                return qVar;
            default:
                C2236f c2236f = (C2236f) obj;
                Object value = c2236f.f26082e.getValue();
                C1111f c1111f = x.p0.f26141a;
                eVar.invoke(value, x.Y.f26021x.invoke(c2236f.f26083f));
                return qVar;
        }
    }
}
