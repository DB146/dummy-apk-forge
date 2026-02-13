package A9;

import android.text.TextUtils;

/* renamed from: A9.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0090h extends AbstractC0117n2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1203a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0113m2[] f1204b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1205c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC0113m2 f1206d;

    public C0090h() {
        C0086g c0086g = new C0086g(0);
        this.f1205c = c0086g;
        C0086g c0086g2 = new C0086g(1);
        this.f1206d = c0086g2;
        this.f1204b = new AbstractC0113m2[]{c0086g, c0086g2};
    }

    public C0090h(AbstractC0117n2 abstractC0117n2, C0108l1 c0108l1, AbstractC0113m2[] abstractC0113m2Arr) {
        this.f1205c = abstractC0117n2;
        this.f1206d = c0108l1;
        this.f1204b = abstractC0113m2Arr;
    }

    @Override // A9.AbstractC0117n2
    public final AbstractC0113m2 a(Object obj) {
        switch (this.f1203a) {
            case 0:
                return TextUtils.isEmpty(((AbstractC0074d) obj).f1102d) ? (C0086g) this.f1205c : (C0086g) this.f1206d;
            default:
                AbstractC0132r2 abstractC0132r2 = (AbstractC0132r2) obj;
                abstractC0132r2.getClass();
                return !(abstractC0132r2 instanceof P1) ? ((AbstractC0117n2) this.f1205c).a(obj) : (C0108l1) this.f1206d;
        }
    }

    @Override // A9.AbstractC0117n2
    public final AbstractC0113m2[] b() {
        switch (this.f1203a) {
            case 0:
                return this.f1204b;
            default:
                return this.f1204b;
        }
    }
}
