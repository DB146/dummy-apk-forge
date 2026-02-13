package r2;

import D5.d;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import l2.I;
import t8.C2034c;

/* loaded from: classes.dex */
public final class b implements I {

    /* renamed from: a, reason: collision with root package name */
    public final C2034c f23649a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f23650b = false;

    public b(d dVar, C2034c c2034c) {
        this.f23649a = c2034c;
    }

    @Override // l2.I
    public final void b(Object obj) {
        this.f23650b = true;
        C2034c c2034c = this.f23649a;
        c2034c.getClass();
        SignInHubActivity signInHubActivity = (SignInHubActivity) c2034c.f24513b;
        signInHubActivity.setResult(signInHubActivity.f14886Q, signInHubActivity.f14887R);
        signInHubActivity.finish();
    }

    public final String toString() {
        return this.f23649a.toString();
    }
}
