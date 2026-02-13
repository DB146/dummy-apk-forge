package E5;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final int f3706a;

    /* renamed from: b, reason: collision with root package name */
    public final TaskCompletionSource f3707b = new TaskCompletionSource();

    /* renamed from: c, reason: collision with root package name */
    public final int f3708c;

    /* renamed from: d, reason: collision with root package name */
    public final Bundle f3709d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3710e;

    public n(int i7, int i10, Bundle bundle, int i11) {
        this.f3710e = i11;
        this.f3706a = i7;
        this.f3708c = i10;
        this.f3709d = bundle;
    }

    public final boolean a() {
        switch (this.f3710e) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    public final void b(Bc.o oVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Failing " + toString() + " with " + oVar.toString());
        }
        this.f3707b.setException(oVar);
    }

    public final void c(Bundle bundle) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Finishing " + toString() + " with " + String.valueOf(bundle));
        }
        this.f3707b.setResult(bundle);
    }

    public final String toString() {
        return "Request { what=" + this.f3708c + " id=" + this.f3706a + " oneWay=" + a() + "}";
    }
}
