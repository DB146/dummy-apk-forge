package A0;

import java.util.Map;
import y0.InterfaceC2317B;

/* loaded from: classes.dex */
public final class Q implements InterfaceC2317B {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f107a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f108b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Map f109c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Rb.c f110d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ T f111e;

    public Q(int i7, int i10, Map map, Rb.c cVar, T t5) {
        this.f107a = i7;
        this.f108b = i10;
        this.f109c = map;
        this.f110d = cVar;
        this.f111e = t5;
    }

    @Override // y0.InterfaceC2317B
    public final Map a() {
        return this.f109c;
    }

    @Override // y0.InterfaceC2317B
    public final void b() {
        this.f110d.invoke(this.f111e.f116w);
    }

    @Override // y0.InterfaceC2317B
    public final Rb.c c() {
        return null;
    }

    @Override // y0.InterfaceC2317B
    public final int getHeight() {
        return this.f108b;
    }

    @Override // y0.InterfaceC2317B
    public final int getWidth() {
        return this.f107a;
    }
}
