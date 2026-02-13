package C;

import java.util.List;
import y0.AbstractC2322G;
import y0.AbstractC2323H;

/* renamed from: C.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0232q extends kotlin.jvm.internal.m implements Rb.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC2323H[] f2425a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f2426b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ A0.T f2427c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.t f2428d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.t f2429e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r f2430f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0232q(AbstractC2323H[] abstractC2323HArr, List list, A0.T t5, kotlin.jvm.internal.t tVar, kotlin.jvm.internal.t tVar2, r rVar) {
        super(1);
        this.f2425a = abstractC2323HArr;
        this.f2426b = list;
        this.f2427c = t5;
        this.f2428d = tVar;
        this.f2429e = tVar2;
        this.f2430f = rVar;
    }

    @Override // Rb.c
    public final Object invoke(Object obj) {
        AbstractC2322G abstractC2322G = (AbstractC2322G) obj;
        AbstractC2323H[] abstractC2323HArr = this.f2425a;
        int length = abstractC2323HArr.length;
        int i7 = 0;
        int i10 = 0;
        while (i10 < length) {
            AbstractC2323H abstractC2323H = abstractC2323HArr[i10];
            kotlin.jvm.internal.l.c(abstractC2323H, "null cannot be cast to non-null type androidx.compose.ui.layout.Placeable");
            AbstractC0230o.b(abstractC2322G, abstractC2323H, (y0.z) this.f2426b.get(i7), this.f2427c.getLayoutDirection(), this.f2428d.f19132a, this.f2429e.f19132a, this.f2430f.f2431a);
            i10++;
            i7++;
        }
        return Db.q.f3365a;
    }
}
