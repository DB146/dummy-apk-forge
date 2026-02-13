package Y5;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* renamed from: Y5.u0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class CallableC0653u0 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11954a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ O1 f11955b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Bundle f11956c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ BinderC0657w0 f11957d;

    public /* synthetic */ CallableC0653u0(BinderC0657w0 binderC0657w0, O1 o12, Bundle bundle, int i7) {
        this.f11954a = i7;
        this.f11955b = o12;
        this.f11956c = bundle;
        this.f11957d = binderC0657w0;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        switch (this.f11954a) {
            case 0:
                BinderC0657w0 binderC0657w0 = this.f11957d;
                binderC0657w0.f11980a.A();
                return binderC0657w0.f11980a.b0(this.f11955b, this.f11956c);
            default:
                BinderC0657w0 binderC0657w02 = this.f11957d;
                binderC0657w02.f11980a.A();
                return binderC0657w02.f11980a.b0(this.f11955b, this.f11956c);
        }
    }
}
