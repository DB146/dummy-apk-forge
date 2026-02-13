package n7;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import o7.C1814d;

/* loaded from: classes.dex */
public final class G extends Tb.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f21264a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1713d f21265b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C1814d f21266c;

    public G(C1814d c1814d, l lVar, C1713d c1713d) {
        this.f21264a = lVar;
        this.f21265b = c1713d;
        this.f21266c = c1814d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [n7.f, o7.t] */
    @Override // Tb.a
    public final Task Q(String str) {
        if (TextUtils.isEmpty(str)) {
            Log.i("FirebaseAuth", "Linking email account with empty reCAPTCHA token");
        } else {
            Log.i("FirebaseAuth", "Got reCAPTCHA token for linking email account");
        }
        C1814d c1814d = this.f21266c;
        ?? c1715f = new C1715f(c1814d, 0);
        return c1814d.f15832e.zza(c1814d.f15828a, this.f21264a, (AbstractC1712c) this.f21265b, str, (o7.t) c1715f);
    }
}
