package Ba;

import A9.A2;
import A9.C0160y2;
import y9.AbstractC2457B;

/* loaded from: classes2.dex */
public final class q extends C0160y2 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2272e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractC2457B f2273f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(AbstractC2457B abstractC2457B, int i7) {
        super((A2) abstractC2457B);
        this.f2272e = i7;
        this.f2273f = abstractC2457B;
    }

    @Override // A9.C0160y2, A9.Q
    public final void e(int i7) {
        switch (this.f2272e) {
            case 0:
                super.e(((s) this.f2273f).f2291f1);
                return;
            default:
                super.e(((wa.c) this.f2273f).f25834T0);
                return;
        }
    }
}
