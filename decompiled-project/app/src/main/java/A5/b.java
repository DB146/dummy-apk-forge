package A5;

import D5.e;
import H5.c;
import a6.C0777a;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.internal.InterfaceC0966g;
import com.google.android.gms.common.api.internal.InterfaceC0976q;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.api.n;
import com.google.android.gms.common.internal.AbstractC0995k;
import com.google.android.gms.common.internal.C0992h;
import com.google.android.gms.common.internal.C1004u;
import com.google.android.gms.internal.auth.zzam;
import com.google.android.gms.internal.auth.zzbe;
import com.google.android.gms.internal.p000authapi.zbd;
import com.google.android.gms.internal.p001authapiphone.zzw;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import x5.d;

/* loaded from: classes.dex */
public final class b extends com.google.android.gms.common.api.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f514a;

    @Override // com.google.android.gms.common.api.a
    public /* synthetic */ g buildClient(Context context, Looper looper, C0992h c0992h, Object obj, InterfaceC0966g interfaceC0966g, InterfaceC0976q interfaceC0976q) {
        switch (this.f514a) {
            case 0:
                return new zzw(context, looper, c0992h, interfaceC0966g, interfaceC0976q);
            case 1:
                return new c(context, looper, c0992h, (C1004u) obj, interfaceC0966g, interfaceC0976q);
            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                return new zzbe(context, looper, c0992h, (x5.c) obj, interfaceC0966g, interfaceC0976q);
            default:
                return super.buildClient(context, looper, c0992h, obj, interfaceC0966g, interfaceC0976q);
        }
    }

    @Override // com.google.android.gms.common.api.a
    public g buildClient(Context context, Looper looper, C0992h c0992h, Object obj, m mVar, n nVar) {
        switch (this.f514a) {
            case 2:
                return new AbstractC0995k(context, looper, 131, c0992h, mVar, nVar);
            case 3:
                c0992h.getClass();
                Integer num = c0992h.g;
                Bundle bundle = new Bundle();
                bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", null);
                if (num != null) {
                    bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
                }
                bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
                bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
                bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
                bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
                bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
                bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
                return new C0777a(context, looper, c0992h, bundle, mVar, nVar);
            case 4:
                obj.getClass();
                throw new ClassCastException();
            case 5:
                return new zzam(context, looper, c0992h, mVar, nVar);
            case 6:
                return new zbd(context, looper, c0992h, (d) obj, mVar, nVar);
            case 7:
                return new e(context, looper, c0992h, (GoogleSignInOptions) obj, mVar, nVar);
            default:
                return super.buildClient(context, looper, c0992h, obj, mVar, nVar);
        }
    }

    @Override // com.google.android.gms.common.api.f
    public List getImpliedScopes(Object obj) {
        switch (this.f514a) {
            case 7:
                GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
                return googleSignInOptions == null ? Collections.emptyList() : new ArrayList(googleSignInOptions.f14868b);
            default:
                return super.getImpliedScopes(obj);
        }
    }
}
