package o;

import n.InterfaceC1664B;

/* loaded from: classes.dex */
public final class D extends AbstractViewOnTouchListenerC1753p0 {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ I f21364x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ L f21365y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(L l10, L l11, I i7) {
        super(l11);
        this.f21365y = l10;
        this.f21364x = i7;
    }

    @Override // o.AbstractViewOnTouchListenerC1753p0
    public final InterfaceC1664B b() {
        return this.f21364x;
    }

    @Override // o.AbstractViewOnTouchListenerC1753p0
    public final boolean c() {
        L l10 = this.f21365y;
        if (l10.getInternalPopup().b()) {
            return true;
        }
        l10.f21408f.l(l10.getTextDirection(), l10.getTextAlignment());
        return true;
    }
}
