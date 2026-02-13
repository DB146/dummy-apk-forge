package D5;

import Y5.C0660y;
import Y5.C0662z;
import android.content.Context;
import android.os.Binder;
import android.os.Looper;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.RevocationBoundService;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.api.internal.H;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.api.w;
import com.google.android.gms.common.internal.G;
import com.google.android.gms.common.internal.x;
import com.google.android.gms.internal.p000authapi.zbb;
import com.google.android.gms.tasks.TaskCompletionSource;
import x5.AbstractC2267a;

/* loaded from: classes.dex */
public final class l extends zbb {

    /* renamed from: a, reason: collision with root package name */
    public final RevocationBoundService f3257a;

    public l(RevocationBoundService revocationBoundService) {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
        this.f3257a = revocationBoundService;
    }

    public final void h() {
        if (!M5.c.g(this.f3257a, Binder.getCallingUid())) {
            throw new SecurityException(A3.c.f(Binder.getCallingUid(), "Calling UID ", " is not Google Play services."));
        }
    }

    /* JADX WARN: Type inference failed for: r9v2, types: [com.google.android.gms.common.api.l, C5.a] */
    @Override // com.google.android.gms.internal.p000authapi.zbb
    public final boolean zba(int i7, Parcel parcel, Parcel parcel2, int i10) {
        BasePendingResult doWrite;
        BasePendingResult doWrite2;
        RevocationBoundService revocationBoundService = this.f3257a;
        if (i7 == 1) {
            h();
            b a9 = b.a(revocationBoundService);
            GoogleSignInAccount b2 = a9.b();
            GoogleSignInOptions googleSignInOptions = GoogleSignInOptions.f14865y;
            if (b2 != null) {
                googleSignInOptions = a9.c();
            }
            GoogleSignInOptions googleSignInOptions2 = googleSignInOptions;
            G.g(googleSignInOptions2);
            ?? lVar = new com.google.android.gms.common.api.l(this.f3257a, null, AbstractC2267a.f26219a, googleSignInOptions2, new com.google.android.gms.common.api.k(new C0660y(9), Looper.getMainLooper()));
            if (b2 != null) {
                o asGoogleApiClient = lVar.asGoogleApiClient();
                Context applicationContext = lVar.getApplicationContext();
                boolean z8 = lVar.c() == 3;
                h.f3253a.a("Revoking access", new Object[0]);
                String e2 = b.a(applicationContext).e("refreshToken");
                h.a(applicationContext);
                if (!z8) {
                    doWrite2 = ((H) asGoogleApiClient).f14936b.doWrite((com.google.android.gms.common.api.l) new g(asGoogleApiClient, 1));
                } else if (e2 == null) {
                    I5.a aVar = c.f3238c;
                    Status status = new Status(4, null, null, null);
                    G.a("Status code must not be SUCCESS", !status.t());
                    doWrite2 = new w(status);
                    doWrite2.setResult(status);
                } else {
                    c cVar = new c(e2);
                    new Thread(cVar).start();
                    doWrite2 = cVar.f3240b;
                }
                C0662z c0662z = new C0662z(9);
                TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                doWrite2.addStatusListener(new x(doWrite2, taskCompletionSource, c0662z));
                taskCompletionSource.getTask();
            } else {
                o asGoogleApiClient2 = lVar.asGoogleApiClient();
                Context applicationContext2 = lVar.getApplicationContext();
                boolean z10 = lVar.c() == 3;
                h.f3253a.a("Signing out", new Object[0]);
                h.a(applicationContext2);
                if (z10) {
                    Status status2 = Status.f14892e;
                    doWrite = new BasePendingResult(asGoogleApiClient2);
                    doWrite.setResult(status2);
                } else {
                    doWrite = ((H) asGoogleApiClient2).f14936b.doWrite((com.google.android.gms.common.api.l) new g(asGoogleApiClient2, 0));
                }
                C0662z c0662z2 = new C0662z(9);
                TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
                doWrite.addStatusListener(new x(doWrite, taskCompletionSource2, c0662z2));
                taskCompletionSource2.getTask();
            }
        } else {
            if (i7 != 2) {
                return false;
            }
            h();
            i.z(revocationBoundService).A();
        }
        return true;
    }
}
