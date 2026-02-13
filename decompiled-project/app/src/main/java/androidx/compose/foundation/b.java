package androidx.compose.foundation;

import A.i;
import Q.C0498k;
import Q.C0506o;
import Rb.f;
import kotlin.jvm.internal.m;
import y.InterfaceC2286H;

/* loaded from: classes.dex */
public final class b extends m implements f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2286H f13139a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Rb.a f13140b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(InterfaceC2286H interfaceC2286H, Rb.a aVar) {
        super(3);
        this.f13139a = interfaceC2286H;
        this.f13140b = aVar;
    }

    @Override // Rb.f
    public final Object a(Object obj, Object obj2, Object obj3) {
        C0506o c0506o = (C0506o) obj2;
        ((Number) obj3).intValue();
        c0506o.S(-1525724089);
        Object H10 = c0506o.H();
        if (H10 == C0498k.f8409a) {
            H10 = new i();
            c0506o.d0(H10);
        }
        i iVar = (i) H10;
        c0.m c10 = c.a(iVar, this.f13139a).c(new ClickableElement(iVar, null, this.f13140b));
        c0506o.p(false);
        return c10;
    }
}
