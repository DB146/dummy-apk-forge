package i2;

import android.text.TextUtils;

/* renamed from: i2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1317e extends AbstractC1301I {

    /* renamed from: a, reason: collision with root package name */
    public final C1316d f18257a;

    /* renamed from: b, reason: collision with root package name */
    public final C1316d f18258b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC1300H[] f18259c;

    public C1317e() {
        C1316d c1316d = new C1316d(0);
        this.f18257a = c1316d;
        C1316d c1316d2 = new C1316d(1);
        this.f18258b = c1316d2;
        this.f18259c = new AbstractC1300H[]{c1316d, c1316d2};
    }

    @Override // i2.AbstractC1301I
    public final AbstractC1300H a(Object obj) {
        return TextUtils.isEmpty(((C1314b) obj).f18253b) ? this.f18257a : this.f18258b;
    }

    @Override // i2.AbstractC1301I
    public final AbstractC1300H[] b() {
        return this.f18259c;
    }
}
