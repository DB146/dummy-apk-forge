package com.google.android.gms.internal.p000authapi;

import F5.d;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.internal.AbstractC0982x;
import com.google.android.gms.common.api.internal.C0981w;
import com.google.android.gms.common.api.internal.InterfaceC0978t;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.internal.G;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import h3.H;
import java.util.ArrayList;
import z5.h;
import z5.m;
import z5.r;

/* loaded from: classes.dex */
public final class zbaf extends l implements h {
    private static final com.google.android.gms.common.api.h zba;
    private static final a zbb;
    private static final i zbc;
    private final String zbd;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.common.api.h, java.lang.Object] */
    static {
        ?? obj = new Object();
        zba = obj;
        zbac zbacVar = new zbac();
        zbb = zbacVar;
        zbc = new i("Auth.Api.Identity.CredentialSaving.API", zbacVar, obj);
    }

    public zbaf(Activity activity, r rVar) {
        super(activity, activity, zbc, rVar, k.f15009c);
        this.zbd = zbas.zba();
    }

    public zbaf(Context context, r rVar) {
        super(context, null, zbc, rVar, k.f15009c);
        this.zbd = zbas.zba();
    }

    public final Status getStatusFromIntent(Intent intent) {
        Status status = Status.f14894u;
        if (intent == null) {
            return status;
        }
        Parcelable.Creator<Status> creator = Status.CREATOR;
        byte[] byteArrayExtra = intent.getByteArrayExtra("status");
        Status status2 = (Status) (byteArrayExtra == null ? null : H.o(byteArrayExtra, creator));
        return status2 == null ? status : status2;
    }

    public final Task<z5.k> saveAccountLinkingToken(SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest) {
        G.g(saveAccountLinkingTokenRequest);
        new ArrayList();
        TextUtils.isEmpty(saveAccountLinkingTokenRequest.f14847e);
        String str = this.zbd;
        PendingIntent pendingIntent = saveAccountLinkingTokenRequest.f14843a;
        G.a("Consent PendingIntent cannot be null", pendingIntent != null);
        String str2 = saveAccountLinkingTokenRequest.f14844b;
        G.a("Invalid tokenType", "auth_code".equals(str2));
        String str3 = saveAccountLinkingTokenRequest.f14845c;
        G.a("serviceId cannot be null or empty", !TextUtils.isEmpty(str3));
        ArrayList arrayList = saveAccountLinkingTokenRequest.f14846d;
        G.a("scopes cannot be null", arrayList != null);
        final SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest2 = new SaveAccountLinkingTokenRequest(pendingIntent, str2, str3, arrayList, str, saveAccountLinkingTokenRequest.f14848f);
        C0981w builder = AbstractC0982x.builder();
        builder.f15005c = new d[]{zbar.zbg};
        builder.f15003a = new InterfaceC0978t() { // from class: com.google.android.gms.internal.auth-api.zbaa
            @Override // com.google.android.gms.common.api.internal.InterfaceC0978t
            public final void accept(Object obj, Object obj2) {
                zbad zbadVar = new zbad(zbaf.this, (TaskCompletionSource) obj2);
                zbm zbmVar = (zbm) ((zbg) obj).getService();
                SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest3 = saveAccountLinkingTokenRequest2;
                G.g(saveAccountLinkingTokenRequest3);
                zbmVar.zbc(zbadVar, saveAccountLinkingTokenRequest3);
            }
        };
        builder.f15004b = false;
        builder.f15006d = 1535;
        return doRead(builder.a());
    }

    @Override // z5.h
    public final Task<m> savePassword(z5.l lVar) {
        G.g(lVar);
        final z5.l lVar2 = new z5.l(lVar.f28311a, this.zbd, lVar.f28313c);
        C0981w builder = AbstractC0982x.builder();
        builder.f15005c = new d[]{zbar.zbe};
        builder.f15003a = new InterfaceC0978t() { // from class: com.google.android.gms.internal.auth-api.zbab
            @Override // com.google.android.gms.common.api.internal.InterfaceC0978t
            public final void accept(Object obj, Object obj2) {
                zbae zbaeVar = new zbae(zbaf.this, (TaskCompletionSource) obj2);
                zbm zbmVar = (zbm) ((zbg) obj).getService();
                z5.l lVar3 = lVar2;
                G.g(lVar3);
                zbmVar.zbd(zbaeVar, lVar3);
            }
        };
        builder.f15004b = false;
        builder.f15006d = 1536;
        return doRead(builder.a());
    }
}
