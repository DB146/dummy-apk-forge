package n7;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.p002firebaseauthapi.zzach;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

/* loaded from: classes.dex */
public final class C extends Tb.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f21244a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f21245b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C1713d f21246c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f21247d;

    public C(FirebaseAuth firebaseAuth, boolean z8, l lVar, C1713d c1713d) {
        this.f21244a = z8;
        this.f21245b = lVar;
        this.f21246c = c1713d;
        this.f21247d = firebaseAuth;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [n7.f, o7.t] */
    @Override // Tb.a
    public final Task Q(String str) {
        if (TextUtils.isEmpty(str)) {
            Log.i("FirebaseAuth", "Email link login/reauth with empty reCAPTCHA token");
        } else {
            Log.i("FirebaseAuth", "Got reCAPTCHA token for login/reauth with email link");
        }
        C1713d c1713d = this.f21246c;
        boolean z8 = this.f21244a;
        FirebaseAuth firebaseAuth = this.f21247d;
        if (!z8) {
            return firebaseAuth.f15832e.zza(firebaseAuth.f15828a, c1713d, str, (o7.v) new C1716g(firebaseAuth));
        }
        zzach zzachVar = firebaseAuth.f15832e;
        l lVar = this.f21245b;
        com.google.android.gms.common.internal.G.g(lVar);
        return zzachVar.zzb(firebaseAuth.f15828a, lVar, c1713d, str, (o7.t) new C1715f(firebaseAuth, 0));
    }
}
