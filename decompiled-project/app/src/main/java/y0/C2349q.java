package y0;

import A0.C0030t;
import A0.C0031u;
import java.util.Map;

/* renamed from: y0.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2349q implements InterfaceC2317B {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26598a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f26599b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Map f26600c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r f26601d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w f26602e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Rb.c f26603f;

    public C2349q(int i7, int i10, Map map, r rVar, w wVar, Rb.c cVar) {
        this.f26598a = i7;
        this.f26599b = i10;
        this.f26600c = map;
        this.f26601d = rVar;
        this.f26602e = wVar;
        this.f26603f = cVar;
    }

    @Override // y0.InterfaceC2317B
    public final Map a() {
        return this.f26600c;
    }

    @Override // y0.InterfaceC2317B
    public final void b() {
        C0030t c0030t;
        boolean m10 = this.f26601d.m();
        Rb.c cVar = this.f26603f;
        w wVar = this.f26602e;
        if (!m10 || (c0030t = ((C0031u) wVar.f26620a.f60S.f226c).f311Z) == null) {
            cVar.invoke(((C0031u) wVar.f26620a.f60S.f226c).f116w);
        } else {
            cVar.invoke(c0030t.f116w);
        }
    }

    @Override // y0.InterfaceC2317B
    public final Rb.c c() {
        return null;
    }

    @Override // y0.InterfaceC2317B
    public final int getHeight() {
        return this.f26599b;
    }

    @Override // y0.InterfaceC2317B
    public final int getWidth() {
        return this.f26598a;
    }
}
