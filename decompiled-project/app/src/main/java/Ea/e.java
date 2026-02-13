package Ea;

import Db.q;
import com.kt.apps.media.xemtv.ui_mobile.MobileMainActivity;

/* loaded from: classes2.dex */
public final /* synthetic */ class e implements Rb.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3832a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MobileMainActivity f3833b;

    public /* synthetic */ e(MobileMainActivity mobileMainActivity, int i7) {
        this.f3832a = i7;
        this.f3833b = mobileMainActivity;
    }

    @Override // Rb.a
    public final Object invoke() {
        MobileMainActivity mobileMainActivity = this.f3833b;
        switch (this.f3832a) {
            case 0:
                int i7 = MobileMainActivity.f16227S;
                return new f(mobileMainActivity);
            default:
                int i10 = MobileMainActivity.f16227S;
                ta.c l10 = mobileMainActivity.l();
                l10.set_lastWatchedChannel(null);
                l10.get_tvWithLinkStreamLiveData().l(new Object());
                return q.f3365a;
        }
    }
}
