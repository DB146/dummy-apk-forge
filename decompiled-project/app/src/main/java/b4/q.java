package b4;

import Y5.B;
import Y5.C0656w;
import android.content.Context;
import c4.C0903e;
import d4.InterfaceC1049b;
import g4.C1197b;

/* loaded from: classes.dex */
public final class q implements InterfaceC1049b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13881a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1049b f13882b;

    /* renamed from: c, reason: collision with root package name */
    public final Cb.a f13883c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC1049b f13884d;

    public /* synthetic */ q(InterfaceC1049b interfaceC1049b, Cb.a aVar, InterfaceC1049b interfaceC1049b2, int i7) {
        this.f13881a = i7;
        this.f13882b = interfaceC1049b;
        this.f13883c = aVar;
        this.f13884d = interfaceC1049b2;
    }

    @Override // Cb.a
    public final Object get() {
        switch (this.f13881a) {
            case 0:
                return new p(new C0656w(12), new B(11), (g4.c) ((C1197b) this.f13882b).get(), (h4.i) ((h4.j) this.f13883c).get(), (h4.k) ((h4.l) this.f13884d).get());
            default:
                return new h4.d((Context) ((C0903e) this.f13882b).f14341b, (i4.d) this.f13883c.get(), (h4.b) ((m) this.f13884d).get());
        }
    }
}
