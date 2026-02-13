package za;

import com.kt.apps.media.xemtv.ui.main.MainActivity;
import kotlin.jvm.internal.m;

/* loaded from: classes2.dex */
public final class k extends m implements Rb.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28365a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MainActivity f28366b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(MainActivity mainActivity, int i7) {
        super(0);
        this.f28365a = i7;
        this.f28366b = mainActivity;
    }

    @Override // Rb.a
    public final Object invoke() {
        switch (this.f28365a) {
            case 0:
                return this.f28366b.n();
            case 1:
                return this.f28366b.s();
            case 2:
                return this.f28366b.o();
            case 3:
                return this.f28366b.n();
            case 4:
                return this.f28366b.s();
            default:
                return this.f28366b.o();
        }
    }
}
