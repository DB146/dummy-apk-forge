package y3;

import l0.InterfaceC1445d;
import o0.AbstractC1775c;

/* loaded from: classes.dex */
public final class l extends kotlin.jvm.internal.m implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26813a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f26814b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC1775c f26815c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(AbstractC1775c abstractC1775c, p pVar) {
        super(2);
        this.f26815c = abstractC1775c;
        this.f26814b = pVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(p pVar, AbstractC1775c abstractC1775c) {
        super(2);
        this.f26814b = pVar;
        this.f26815c = abstractC1775c;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f26813a) {
            case 0:
                long j = ((i0.e) obj2).f18185a;
                kotlin.jvm.internal.l.e((InterfaceC1445d) obj, "$this$drawOne");
                float f4 = this.f26814b.f26828G;
                kotlin.jvm.internal.l.e(this.f26815c, "<anonymous parameter 0>");
                return Db.q.f3365a;
            default:
                InterfaceC1445d drawOne = (InterfaceC1445d) obj;
                long j10 = ((i0.e) obj2).f18185a;
                kotlin.jvm.internal.l.e(drawOne, "$this$drawOne");
                p pVar = this.f26814b;
                pVar.f26841U.getClass();
                this.f26815c.d(drawOne, j10, pVar.f26828G, pVar.f26829H);
                return Db.q.f3365a;
        }
    }
}
