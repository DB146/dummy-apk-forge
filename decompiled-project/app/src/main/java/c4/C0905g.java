package c4;

import Y5.B;
import Y5.C0656w;
import android.content.Context;
import d4.InterfaceC1049b;
import i4.C1345a;
import i4.i;

/* renamed from: c4.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0905g implements InterfaceC1049b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14345a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1049b f14346b;

    /* renamed from: c, reason: collision with root package name */
    public final Cb.a f14347c;

    public /* synthetic */ C0905g(InterfaceC1049b interfaceC1049b, Cb.a aVar, int i7) {
        this.f14345a = i7;
        this.f14346b = interfaceC1049b;
        this.f14347c = aVar;
    }

    @Override // Cb.a
    public final Object get() {
        switch (this.f14345a) {
            case 0:
                return new C0904f((Context) ((C0903e) this.f14346b).f14341b, (C0902d) ((C0903e) this.f14347c).get());
            default:
                return new i4.g(new C0656w(12), new B(11), C1345a.f18400f, (i) ((C0903e) this.f14346b).get(), this.f14347c);
        }
    }
}
