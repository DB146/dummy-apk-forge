package A9;

import android.util.Log;

/* loaded from: classes2.dex */
public final class U implements O1 {

    /* renamed from: a, reason: collision with root package name */
    public final T f970a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ W f971b;

    public U(W w10, T t5) {
        this.f971b = w10;
        this.f970a = t5;
    }

    @Override // A9.InterfaceC0153x
    public final void a(C0109l2 c0109l2, Object obj, C0152w2 c0152w2, Object obj2) {
        AbstractC0132r2 abstractC0132r2 = (AbstractC0132r2) obj2;
        int q02 = ((A2) this.f970a.f964a).q0();
        Log.v("BrowseSupportFragment", "row selected position " + q02);
        W w10 = this.f971b;
        w10.C0(q02);
        O1 o12 = w10.f1016d1;
        if (o12 != null) {
            o12.a(c0109l2, obj, c0152w2, abstractC0132r2);
        }
    }
}
