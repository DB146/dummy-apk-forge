package d8;

import a8.C0786c;
import a8.InterfaceC0790g;

/* loaded from: classes.dex */
public final class h implements InterfaceC0790g {

    /* renamed from: a, reason: collision with root package name */
    public boolean f16563a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f16564b = false;

    /* renamed from: c, reason: collision with root package name */
    public C0786c f16565c;

    /* renamed from: d, reason: collision with root package name */
    public final f f16566d;

    public h(f fVar) {
        this.f16566d = fVar;
    }

    @Override // a8.InterfaceC0790g
    public final InterfaceC0790g d(String str) {
        if (this.f16563a) {
            throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f16563a = true;
        this.f16566d.h(this.f16565c, str, this.f16564b);
        return this;
    }

    @Override // a8.InterfaceC0790g
    public final InterfaceC0790g e(boolean z8) {
        if (this.f16563a) {
            throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f16563a = true;
        this.f16566d.e(this.f16565c, z8 ? 1 : 0, this.f16564b);
        return this;
    }
}
