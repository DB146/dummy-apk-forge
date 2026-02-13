package com.google.android.gms.internal.p000authapi;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.internal.AbstractC0982x;
import com.google.android.gms.common.api.internal.C0967h;
import com.google.android.gms.common.api.internal.C0981w;
import com.google.android.gms.common.api.internal.InterfaceC0978t;
import com.google.android.gms.common.api.j;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.internal.G;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import h3.H;
import java.util.Iterator;
import java.util.Set;
import z5.C2597b;
import z5.c;
import z5.d;
import z5.e;
import z5.f;
import z5.g;
import z5.n;
import z5.o;
import z5.s;

/* loaded from: classes.dex */
public final class zbap extends l implements n {
    private static final h zba;
    private static final a zbb;
    private static final i zbc;
    private final String zbd;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.common.api.h, java.lang.Object] */
    static {
        ?? obj = new Object();
        zba = obj;
        zbak zbakVar = new zbak();
        zbb = zbakVar;
        zbc = new i("Auth.Api.Identity.SignIn.API", zbakVar, obj);
    }

    public zbap(Activity activity, s sVar) {
        super(activity, activity, zbc, sVar, k.f15009c);
        this.zbd = zbas.zba();
    }

    public zbap(Context context, s sVar) {
        super(context, null, zbc, sVar, k.f15009c);
        this.zbd = zbas.zba();
    }

    @Override // z5.n
    public final Task<g> beginSignIn(f fVar) {
        G.g(fVar);
        C2597b c2597b = fVar.f28295b;
        G.g(c2597b);
        e eVar = fVar.f28294a;
        G.g(eVar);
        d dVar = fVar.f28299f;
        G.g(dVar);
        c cVar = fVar.f28300u;
        G.g(cVar);
        final f fVar2 = new f(eVar, c2597b, this.zbd, fVar.f28297d, fVar.f28298e, dVar, cVar, fVar.f28301v);
        C0981w builder = AbstractC0982x.builder();
        builder.f15005c = new F5.d[]{new F5.d("auth_api_credentials_begin_sign_in", 8L)};
        builder.f15003a = new InterfaceC0978t() { // from class: com.google.android.gms.internal.auth-api.zbai
            @Override // com.google.android.gms.common.api.internal.InterfaceC0978t
            public final void accept(Object obj, Object obj2) {
                zbal zbalVar = new zbal(zbap.this, (TaskCompletionSource) obj2);
                zbv zbvVar = (zbv) ((zbaq) obj).getService();
                f fVar3 = fVar2;
                G.g(fVar3);
                zbvVar.zbc(zbalVar, fVar3);
            }
        };
        builder.f15004b = false;
        builder.f15006d = 1553;
        return doRead(builder.a());
    }

    public final String getPhoneNumberFromIntent(Intent intent) {
        Status status = Status.f14894u;
        if (intent == null) {
            throw new j(status);
        }
        Parcelable.Creator<Status> creator = Status.CREATOR;
        byte[] byteArrayExtra = intent.getByteArrayExtra("status");
        Status status2 = (Status) (byteArrayExtra == null ? null : H.o(byteArrayExtra, creator));
        if (status2 == null) {
            throw new j(Status.f14896w);
        }
        if (!status2.t()) {
            throw new j(status2);
        }
        String stringExtra = intent.getStringExtra("phone_number_hint_result");
        if (stringExtra != null) {
            return stringExtra;
        }
        throw new j(status);
    }

    public final Task<PendingIntent> getPhoneNumberHintIntent(final z5.i iVar) {
        G.g(iVar);
        C0981w builder = AbstractC0982x.builder();
        builder.f15005c = new F5.d[]{zbar.zbh};
        builder.f15003a = new InterfaceC0978t() { // from class: com.google.android.gms.internal.auth-api.zbag
            @Override // com.google.android.gms.common.api.internal.InterfaceC0978t
            public final void accept(Object obj, Object obj2) {
                zbap.this.zba(iVar, (zbaq) obj, (TaskCompletionSource) obj2);
            }
        };
        builder.f15006d = 1653;
        return doRead(builder.a());
    }

    public final o getSignInCredentialFromIntent(Intent intent) {
        Status status = Status.f14894u;
        if (intent == null) {
            throw new j(status);
        }
        Parcelable.Creator<Status> creator = Status.CREATOR;
        byte[] byteArrayExtra = intent.getByteArrayExtra("status");
        Status status2 = (Status) (byteArrayExtra == null ? null : H.o(byteArrayExtra, creator));
        if (status2 == null) {
            throw new j(Status.f14896w);
        }
        if (!status2.t()) {
            throw new j(status2);
        }
        Parcelable.Creator<o> creator2 = o.CREATOR;
        byte[] byteArrayExtra2 = intent.getByteArrayExtra("sign_in_credential");
        o oVar = (o) (byteArrayExtra2 != null ? H.o(byteArrayExtra2, creator2) : null);
        if (oVar != null) {
            return oVar;
        }
        throw new j(status);
    }

    @Override // z5.n
    public final Task<PendingIntent> getSignInIntent(z5.j jVar) {
        G.g(jVar);
        String str = jVar.f28304a;
        G.g(str);
        String str2 = this.zbd;
        final z5.j jVar2 = new z5.j(str, jVar.f28305b, jVar.f28308e, str2, jVar.f28309f, jVar.f28307d);
        C0981w builder = AbstractC0982x.builder();
        builder.f15005c = new F5.d[]{zbar.zbf};
        builder.f15003a = new InterfaceC0978t() { // from class: com.google.android.gms.internal.auth-api.zbaj
            @Override // com.google.android.gms.common.api.internal.InterfaceC0978t
            public final void accept(Object obj, Object obj2) {
                zban zbanVar = new zban(zbap.this, (TaskCompletionSource) obj2);
                zbv zbvVar = (zbv) ((zbaq) obj).getService();
                z5.j jVar3 = jVar2;
                G.g(jVar3);
                zbvVar.zbe(zbanVar, jVar3);
            }
        };
        builder.f15006d = 1555;
        return doRead(builder.a());
    }

    public final Task<Void> signOut() {
        getApplicationContext().getSharedPreferences("com.google.android.gms.signin", 0).edit().clear().apply();
        Set set = com.google.android.gms.common.api.o.f15012a;
        synchronized (set) {
        }
        Iterator it = set.iterator();
        if (it.hasNext()) {
            ((com.google.android.gms.common.api.o) it.next()).getClass();
            throw new UnsupportedOperationException();
        }
        C0967h.a();
        C0981w builder = AbstractC0982x.builder();
        builder.f15005c = new F5.d[]{zbar.zbb};
        builder.f15003a = new InterfaceC0978t() { // from class: com.google.android.gms.internal.auth-api.zbah
            @Override // com.google.android.gms.common.api.internal.InterfaceC0978t
            public final void accept(Object obj, Object obj2) {
                zbap.this.zbb((zbaq) obj, (TaskCompletionSource) obj2);
            }
        };
        builder.f15004b = false;
        builder.f15006d = 1554;
        return doWrite(builder.a());
    }

    public final /* synthetic */ void zba(z5.i iVar, zbaq zbaqVar, TaskCompletionSource taskCompletionSource) {
        ((zbv) zbaqVar.getService()).zbd(new zbao(this, taskCompletionSource), iVar, this.zbd);
    }

    public final /* synthetic */ void zbb(zbaq zbaqVar, TaskCompletionSource taskCompletionSource) {
        ((zbv) zbaqVar.getService()).zbf(new zbam(this, taskCompletionSource), this.zbd);
    }
}
