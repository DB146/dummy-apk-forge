package o;

/* renamed from: o.v0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1764v0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21611a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1770y0 f21612b;

    public /* synthetic */ RunnableC1764v0(C1770y0 c1770y0, int i7) {
        this.f21611a = i7;
        this.f21612b = c1770y0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f21611a) {
            case 0:
                C1747m0 c1747m0 = this.f21612b.f21640c;
                if (c1747m0 != null) {
                    c1747m0.setListSelectionHidden(true);
                    c1747m0.requestLayout();
                    return;
                }
                return;
            default:
                C1770y0 c1770y0 = this.f21612b;
                C1747m0 c1747m02 = c1770y0.f21640c;
                if (c1747m02 == null || !c1747m02.isAttachedToWindow() || c1770y0.f21640c.getCount() <= c1770y0.f21640c.getChildCount() || c1770y0.f21640c.getChildCount() > c1770y0.f21625A) {
                    return;
                }
                c1770y0.f21637N.setInputMethodMode(2);
                c1770y0.c();
                return;
        }
    }
}
