package n7;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.p002firebaseauthapi.zzach;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

/* loaded from: classes.dex */
public final class D extends Tb.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f21248a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f21249b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f21250c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f21251d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f21252e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f21253f;

    public D(FirebaseAuth firebaseAuth, String str, boolean z8, l lVar, String str2, String str3) {
        this.f21248a = str;
        this.f21249b = z8;
        this.f21250c = lVar;
        this.f21251d = str2;
        this.f21252e = str3;
        this.f21253f = firebaseAuth;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [n7.f, o7.t] */
    @Override // Tb.a
    public final Task Q(String str) {
        boolean isEmpty = TextUtils.isEmpty(str);
        String str2 = this.f21248a;
        if (isEmpty) {
            Log.i("FirebaseAuth", "Logging in as " + str2 + " with empty reCAPTCHA token");
        } else {
            Log.i("FirebaseAuth", "Got reCAPTCHA token for login with email " + str2);
        }
        boolean z8 = this.f21249b;
        FirebaseAuth firebaseAuth = this.f21253f;
        if (!z8) {
            return firebaseAuth.f15832e.zzb(firebaseAuth.f15828a, this.f21248a, this.f21251d, this.f21252e, str, new C1716g(firebaseAuth));
        }
        zzach zzachVar = firebaseAuth.f15832e;
        l lVar = this.f21250c;
        com.google.android.gms.common.internal.G.g(lVar);
        return zzachVar.zzb(firebaseAuth.f15828a, lVar, this.f21248a, this.f21251d, this.f21252e, str, new C1715f(firebaseAuth, 0));
    }
}
