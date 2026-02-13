package G;

import A0.K;
import A0.n0;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.k;

/* loaded from: classes.dex */
public final /* synthetic */ class a extends j implements Rb.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f4221a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n0 f4222b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ K f4223c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(e eVar, n0 n0Var, K k) {
        super(0, k.class, "localRect", "bringIntoView$localRect(Landroidx/compose/foundation/relocation/BringIntoViewResponderNode;Landroidx/compose/ui/layout/LayoutCoordinates;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/geometry/Rect;", 0);
        this.f4221a = eVar;
        this.f4222b = n0Var;
        this.f4223c = k;
    }

    @Override // Rb.a
    public final Object invoke() {
        K k = this.f4223c;
        return e.p0(this.f4221a, this.f4222b, k);
    }
}
