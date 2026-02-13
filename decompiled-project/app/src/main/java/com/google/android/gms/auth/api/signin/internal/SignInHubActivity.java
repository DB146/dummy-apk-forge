package com.google.android.gms.auth.api.signin.internal;

import D5.d;
import D5.i;
import W1.G;
import W1.W;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.o;
import java.lang.reflect.Modifier;
import java.util.Set;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.w;
import l2.c0;
import l2.d0;
import o2.C1779a;
import r2.C1916a;
import r2.b;
import r2.c;
import t8.C2034c;
import u.U;

@KeepName
/* loaded from: classes.dex */
public class SignInHubActivity extends G {

    /* renamed from: S, reason: collision with root package name */
    public static boolean f14882S = false;

    /* renamed from: N, reason: collision with root package name */
    public boolean f14883N = false;

    /* renamed from: O, reason: collision with root package name */
    public SignInConfiguration f14884O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f14885P;

    /* renamed from: Q, reason: collision with root package name */
    public int f14886Q;

    /* renamed from: R, reason: collision with root package name */
    public Intent f14887R;

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    public final void l() {
        d0 store = s();
        W w10 = c.f23651c;
        l.e(store, "store");
        c cVar = (c) new c0(store, w10, C1779a.f21662b).a(w.a(c.class));
        C2034c c2034c = new C2034c(this, 6);
        if (cVar.f23653b) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        U u3 = cVar.f23652a;
        C1916a c1916a = (C1916a) u3.c(0);
        if (c1916a == null) {
            try {
                cVar.f23653b = true;
                Set set = o.f15012a;
                synchronized (set) {
                }
                d dVar = new d(this, set);
                if (d.class.isMemberClass() && !Modifier.isStatic(d.class.getModifiers())) {
                    throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + dVar);
                }
                C1916a c1916a2 = new C1916a(dVar);
                u3.e(0, c1916a2);
                cVar.f23653b = false;
                b bVar = new b(c1916a2.f23646l, c2034c);
                c1916a2.e(this, bVar);
                b bVar2 = c1916a2.f23648n;
                if (bVar2 != null) {
                    c1916a2.i(bVar2);
                }
                c1916a2.f23647m = this;
                c1916a2.f23648n = bVar;
            } catch (Throwable th) {
                cVar.f23653b = false;
                throw th;
            }
        } else {
            b bVar3 = new b(c1916a.f23646l, c2034c);
            c1916a.e(this, bVar3);
            b bVar4 = c1916a.f23648n;
            if (bVar4 != null) {
                c1916a.i(bVar4);
            }
            c1916a.f23647m = this;
            c1916a.f23648n = bVar3;
        }
        f14882S = false;
    }

    public final void m(int i7) {
        Status status = new Status(i7, null, null, null);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        f14882S = false;
    }

    @Override // W1.G, c.AbstractActivityC0867k, android.app.Activity
    public final void onActivityResult(int i7, int i10, Intent intent) {
        GoogleSignInAccount googleSignInAccount;
        if (this.f14883N) {
            return;
        }
        setResult(0);
        if (i7 != 40962) {
            return;
        }
        if (intent != null) {
            SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra("signInAccount");
            if (signInAccount != null && (googleSignInAccount = signInAccount.f14878b) != null) {
                i z8 = i.z(this);
                GoogleSignInOptions googleSignInOptions = this.f14884O.f14881b;
                synchronized (z8) {
                    ((D5.b) z8.f3256b).d(googleSignInAccount, googleSignInOptions);
                }
                intent.removeExtra("signInAccount");
                intent.putExtra("googleSignInAccount", googleSignInAccount);
                this.f14885P = true;
                this.f14886Q = i10;
                this.f14887R = intent;
                l();
                return;
            }
            if (intent.hasExtra("errorCode")) {
                int intExtra = intent.getIntExtra("errorCode", 8);
                if (intExtra == 13) {
                    intExtra = 12501;
                }
                m(intExtra);
                return;
            }
        }
        m(8);
    }

    @Override // W1.G, c.AbstractActivityC0867k, k1.h, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        if (action == null) {
            Log.e("AuthSignInClient", "Null action");
            m(12500);
            return;
        }
        if (action.equals("com.google.android.gms.auth.NO_IMPL")) {
            Log.e("AuthSignInClient", "Action not implemented");
            m(12500);
            return;
        }
        if (!action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") && !action.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            Log.e("AuthSignInClient", "Unknown action: ".concat(String.valueOf(intent.getAction())));
            finish();
            return;
        }
        Bundle bundleExtra = intent.getBundleExtra("config");
        if (bundleExtra == null) {
            Log.e("AuthSignInClient", "Activity started with no configuration.");
            setResult(0);
            finish();
            return;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) bundleExtra.getParcelable("config");
        if (signInConfiguration == null) {
            Log.e("AuthSignInClient", "Activity started with invalid configuration.");
            setResult(0);
            finish();
            return;
        }
        this.f14884O = signInConfiguration;
        if (bundle != null) {
            boolean z8 = bundle.getBoolean("signingInGoogleApiClients");
            this.f14885P = z8;
            if (z8) {
                this.f14886Q = bundle.getInt("signInResultCode");
                Intent intent2 = (Intent) bundle.getParcelable("signInResultData");
                if (intent2 != null) {
                    this.f14887R = intent2;
                    l();
                    return;
                } else {
                    Log.e("AuthSignInClient", "Sign in result data cannot be null");
                    setResult(0);
                    finish();
                    return;
                }
            }
            return;
        }
        if (f14882S) {
            setResult(0);
            m(12502);
            return;
        }
        f14882S = true;
        Intent intent3 = new Intent(action);
        if (action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN")) {
            intent3.setPackage("com.google.android.gms");
        } else {
            intent3.setPackage(getPackageName());
        }
        intent3.putExtra("config", this.f14884O);
        try {
            startActivityForResult(intent3, 40962);
        } catch (ActivityNotFoundException unused) {
            this.f14883N = true;
            Log.w("AuthSignInClient", "Could not launch sign in Intent. Google Play Service is probably being updated...");
            m(17);
        }
    }

    @Override // W1.G, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        f14882S = false;
    }

    @Override // c.AbstractActivityC0867k, k1.h, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.f14885P);
        if (this.f14885P) {
            bundle.putInt("signInResultCode", this.f14886Q);
            bundle.putParcelable("signInResultData", this.f14887R);
        }
    }
}
