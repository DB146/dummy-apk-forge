package com.google.android.gms.internal.p000authapi;

import F5.d;
import P.c;
import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.AuthorizationRequest;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.internal.AbstractC0982x;
import com.google.android.gms.common.api.internal.C0981w;
import com.google.android.gms.common.api.internal.InterfaceC0978t;
import com.google.android.gms.common.api.j;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.internal.G;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import h3.H;
import java.util.ArrayList;
import y.S;
import z5.C2596a;
import z5.q;

/* loaded from: classes.dex */
public final class zbz extends l {
    private static final h zba;
    private static final a zbb;
    private static final i zbc;
    private final String zbd;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.common.api.h, java.lang.Object] */
    static {
        ?? obj = new Object();
        zba = obj;
        zbx zbxVar = new zbx();
        zbb = zbxVar;
        zbc = new i("Auth.Api.Identity.Authorization.API", zbxVar, obj);
    }

    public zbz(Activity activity, q qVar) {
        super(activity, activity, zbc, qVar, k.f15009c);
        this.zbd = zbas.zba();
    }

    public zbz(Context context, q qVar) {
        super(context, null, zbc, qVar, k.f15009c);
        this.zbd = zbas.zba();
    }

    public final Task<C2596a> authorize(AuthorizationRequest authorizationRequest) {
        Bundle bundle;
        String str;
        boolean z8;
        boolean z10;
        boolean z11;
        String str2;
        int i7;
        G.g(authorizationRequest);
        ArrayList arrayList = authorizationRequest.f14833a;
        G.a("requestedScopes cannot be null or empty", (arrayList == null || arrayList.isEmpty()) ? false : true);
        String str3 = null;
        Bundle bundle2 = authorizationRequest.f14841w;
        if (bundle2 != null) {
            Bundle bundle3 = null;
            for (String str4 : bundle2.keySet()) {
                String string = bundle2.getString(str4);
                int[] c10 = c.c(2);
                int length = c10.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        i7 = 0;
                        break;
                    }
                    i7 = c10[i10];
                    if (S.a(i7).equals(str4)) {
                        break;
                    }
                    i10++;
                }
                if (string != null && i7 != 0) {
                    if (bundle3 == null) {
                        bundle3 = new Bundle();
                    }
                    bundle3.putString(S.a(i7), string);
                }
            }
            bundle = bundle3;
        } else {
            bundle = null;
        }
        String str5 = authorizationRequest.f14838f;
        if (str5 != null) {
            G.d(str5);
            str = str5;
        } else {
            str = null;
        }
        Account account = authorizationRequest.f14837e;
        Account account2 = account != null ? account : null;
        boolean z12 = authorizationRequest.f14836d;
        String str6 = authorizationRequest.f14834b;
        if (!z12 || str6 == null) {
            z8 = false;
        } else {
            z8 = true;
            str3 = str6;
        }
        if (!authorizationRequest.f14835c || str6 == null) {
            z10 = false;
            z11 = false;
            str2 = str3;
        } else {
            G.a("two different server client ids provided", str3 == null || str3.equals(str6));
            z11 = authorizationRequest.f14840v;
            str2 = str6;
            z10 = true;
        }
        final AuthorizationRequest authorizationRequest2 = new AuthorizationRequest(arrayList, str2, z10, z8, account2, str, this.zbd, z11, bundle, authorizationRequest.f14842x);
        C0981w builder = AbstractC0982x.builder();
        builder.f15005c = new d[]{zbar.zbc};
        builder.f15003a = new InterfaceC0978t() { // from class: com.google.android.gms.internal.auth-api.zbw
            @Override // com.google.android.gms.common.api.internal.InterfaceC0978t
            public final void accept(Object obj, Object obj2) {
                zby zbyVar = new zby(zbz.this, (TaskCompletionSource) obj2);
                zbj zbjVar = (zbj) ((zbf) obj).getService();
                AuthorizationRequest authorizationRequest3 = authorizationRequest2;
                G.g(authorizationRequest3);
                zbjVar.zbc(zbyVar, authorizationRequest3);
            }
        };
        builder.f15004b = false;
        builder.f15006d = 1534;
        return doRead(builder.a());
    }

    public final C2596a getAuthorizationResultFromIntent(Intent intent) {
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
        Parcelable.Creator<C2596a> creator2 = C2596a.CREATOR;
        byte[] byteArrayExtra2 = intent.getByteArrayExtra("authorization_result");
        C2596a c2596a = (C2596a) (byteArrayExtra2 != null ? H.o(byteArrayExtra2, creator2) : null);
        if (c2596a != null) {
            return c2596a;
        }
        throw new j(status);
    }
}
