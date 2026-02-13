package D5;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.api.n;
import com.google.android.gms.common.internal.AbstractC0995k;
import com.google.android.gms.common.internal.C0992h;
import com.google.android.gms.internal.p000authapi.zba;
import com.google.android.gms.internal.p000authapi.zbas;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class e extends AbstractC0995k {

    /* renamed from: a, reason: collision with root package name */
    public final GoogleSignInOptions f3249a;

    /* JADX WARN: Type inference failed for: r1v1, types: [C5.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [C5.b, java.lang.Object] */
    public e(Context context, Looper looper, C0992h c0992h, GoogleSignInOptions googleSignInOptions, m mVar, n nVar) {
        super(context, looper, 91, c0992h, mVar, nVar);
        C5.b bVar;
        if (googleSignInOptions != null) {
            ?? obj = new Object();
            obj.f2907a = new HashSet();
            obj.f2913h = new HashMap();
            obj.f2907a = new HashSet(googleSignInOptions.f14868b);
            obj.f2908b = googleSignInOptions.f14871e;
            obj.f2909c = googleSignInOptions.f14872f;
            obj.f2910d = googleSignInOptions.f14870d;
            obj.f2911e = googleSignInOptions.f14873u;
            obj.f2912f = googleSignInOptions.f14869c;
            obj.g = googleSignInOptions.f14874v;
            obj.f2913h = GoogleSignInOptions.z(googleSignInOptions.f14875w);
            obj.f2914i = googleSignInOptions.f14876x;
            bVar = obj;
        } else {
            ?? obj2 = new Object();
            obj2.f2907a = new HashSet();
            obj2.f2913h = new HashMap();
            bVar = obj2;
        }
        bVar.f2914i = zbas.zba();
        Set<Scope> set = c0992h.f15062b;
        if (!set.isEmpty()) {
            for (Scope scope : set) {
                HashSet hashSet = bVar.f2907a;
                hashSet.add(scope);
                hashSet.addAll(Arrays.asList(new Scope[0]));
            }
        }
        Scope scope2 = GoogleSignInOptions.f14863B;
        HashSet hashSet2 = bVar.f2907a;
        if (hashSet2.contains(scope2)) {
            Scope scope3 = GoogleSignInOptions.f14862A;
            if (hashSet2.contains(scope3)) {
                hashSet2.remove(scope3);
            }
        }
        if (bVar.f2910d && (bVar.f2912f == null || !hashSet2.isEmpty())) {
            bVar.f2907a.add(GoogleSignInOptions.f14866z);
        }
        this.f3249a = new GoogleSignInOptions(3, new ArrayList(hashSet2), bVar.f2912f, bVar.f2910d, bVar.f2908b, bVar.f2909c, bVar.f2911e, bVar.g, bVar.f2913h, bVar.f2914i);
    }

    @Override // com.google.android.gms.common.internal.AbstractC0990f
    public final IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        return queryLocalInterface instanceof k ? (k) queryLocalInterface : new zba(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService");
    }

    @Override // com.google.android.gms.common.internal.AbstractC0990f, com.google.android.gms.common.api.g
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0990f
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC0990f
    public final Intent getSignInIntent() {
        Context context = getContext();
        h.f3253a.a("getSignInIntent()", new Object[0]);
        SignInConfiguration signInConfiguration = new SignInConfiguration(context.getPackageName(), this.f3249a);
        Intent intent = new Intent("com.google.android.gms.auth.GOOGLE_SIGN_IN");
        intent.setPackage(context.getPackageName());
        intent.setClass(context, SignInHubActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable("config", signInConfiguration);
        intent.putExtra("config", bundle);
        return intent;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0990f
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC0990f
    public final boolean providesSignIn() {
        return true;
    }
}
