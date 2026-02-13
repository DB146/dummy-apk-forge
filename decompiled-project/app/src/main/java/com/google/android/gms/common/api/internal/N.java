package com.google.android.gms.common.api.internal;

import a6.AbstractBinderC0780d;
import a6.C0777a;
import a6.C0781e;
import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.AbstractC0990f;
import com.google.android.gms.common.internal.C0992h;
import com.google.android.gms.internal.base.zac;
import java.util.Set;

/* loaded from: classes.dex */
public final class N extends AbstractBinderC0780d implements com.google.android.gms.common.api.m, com.google.android.gms.common.api.n {
    public static final A5.b k = Z5.b.f12197a;

    /* renamed from: a, reason: collision with root package name */
    public final Context f14947a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f14948b;

    /* renamed from: c, reason: collision with root package name */
    public final A5.b f14949c;

    /* renamed from: d, reason: collision with root package name */
    public final Set f14950d;

    /* renamed from: e, reason: collision with root package name */
    public final C0992h f14951e;

    /* renamed from: f, reason: collision with root package name */
    public C0777a f14952f;
    public G j;

    public N(Context context, Handler handler, C0992h c0992h) {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
        this.f14947a = context;
        this.f14948b = handler;
        this.f14951e = c0992h;
        this.f14950d = c0992h.f15061a;
        this.f14949c = k;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0966g
    public final void h() {
        C0777a c0777a = this.f14952f;
        c0777a.getClass();
        try {
            c0777a.f12782b.getClass();
            Account account = new Account(AbstractC0990f.DEFAULT_ACCOUNT, "com.google");
            GoogleSignInAccount b2 = AbstractC0990f.DEFAULT_ACCOUNT.equals(account.name) ? D5.b.a(c0777a.getContext()).b() : null;
            Integer num = c0777a.f12784d;
            com.google.android.gms.common.internal.G.g(num);
            com.google.android.gms.common.internal.y yVar = new com.google.android.gms.common.internal.y(2, account, num.intValue(), b2);
            C0781e c0781e = (C0781e) c0777a.getService();
            a6.g gVar = new a6.g(1, yVar);
            Parcel zaa = c0781e.zaa();
            zac.zac(zaa, gVar);
            zac.zad(zaa, this);
            c0781e.zac(12, zaa);
        } catch (RemoteException e2) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                this.f14948b.post(new Y(2, this, new a6.h(1, new F5.b(8, null), null)));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e2);
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0976q
    public final void onConnectionFailed(F5.b bVar) {
        this.j.d(bVar);
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0966g
    public final void onConnectionSuspended(int i7) {
        G g = this.j;
        E e2 = (E) ((C0967h) g.f14935f).f14998x.get((C0960a) g.f14932c);
        if (e2 != null) {
            if (e2.f14923l) {
                e2.o(new F5.b(17));
            } else {
                e2.onConnectionSuspended(i7);
            }
        }
    }
}
