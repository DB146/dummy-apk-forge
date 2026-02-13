package y3;

import c3.C0886c;

/* loaded from: classes.dex */
public final class k extends kotlin.jvm.internal.m implements Rb.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26811a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f26812b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(p pVar, int i7) {
        super(0);
        this.f26811a = i7;
        this.f26812b = pVar;
    }

    @Override // Rb.a
    public final Object invoke() {
        switch (this.f26811a) {
            case 0:
                j jVar = this.f26812b.L;
                if (jVar != null) {
                    return jVar.a();
                }
                return null;
            case 1:
                j jVar2 = this.f26812b.L;
                if (jVar2 != null) {
                    return jVar2.b();
                }
                return null;
            default:
                return new C0886c(this.f26812b, 1);
        }
    }
}
