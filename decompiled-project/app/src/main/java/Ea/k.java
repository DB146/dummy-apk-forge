package Ea;

import com.kt.apps.media.xemtv.ui_mobile.MobileMainActivity;
import kotlin.jvm.internal.m;

/* loaded from: classes2.dex */
public final class k extends m implements Rb.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3849a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MobileMainActivity f3850b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(MobileMainActivity mobileMainActivity, int i7) {
        super(0);
        this.f3849a = i7;
        this.f3850b = mobileMainActivity;
    }

    @Override // Rb.a
    public final Object invoke() {
        switch (this.f3849a) {
            case 0:
                return this.f3850b.n();
            case 1:
                return this.f3850b.s();
            default:
                return this.f3850b.o();
        }
    }
}
