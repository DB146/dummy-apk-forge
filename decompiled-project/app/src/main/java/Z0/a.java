package Z0;

import B0.Z;
import Db.q;
import kotlin.jvm.internal.m;

/* loaded from: classes.dex */
public final class a extends m implements Rb.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12103a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f12104b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(k kVar, int i7) {
        super(1);
        this.f12103a = i7;
        this.f12104b = kVar;
    }

    @Override // Rb.c
    public final Object invoke(Object obj) {
        switch (this.f12103a) {
            case 0:
                k kVar = this.f12104b;
                kVar.show();
                return new Z(kVar, 4);
            default:
                k kVar2 = this.f12104b;
                if (kVar2.f12127e.f12121a) {
                    kVar2.f12126d.invoke();
                }
                return q.f3365a;
        }
    }
}
