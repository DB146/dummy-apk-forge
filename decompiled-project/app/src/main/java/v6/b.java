package v6;

import android.graphics.Typeface;

/* loaded from: classes.dex */
public final class b extends n1.b {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Y6.b f25080h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ d f25081i;

    public b(d dVar, Y6.b bVar) {
        this.f25081i = dVar;
        this.f25080h = bVar;
    }

    @Override // n1.b
    public final void i(int i7) {
        this.f25081i.f25094m = true;
        this.f25080h.t(i7);
    }

    @Override // n1.b
    public final void j(Typeface typeface) {
        d dVar = this.f25081i;
        dVar.f25095n = Typeface.create(typeface, dVar.f25087c);
        dVar.f25094m = true;
        this.f25080h.u(dVar.f25095n, false);
    }
}
