package a6;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.api.n;
import com.google.android.gms.common.internal.AbstractC0995k;
import com.google.android.gms.common.internal.C0992h;
import com.google.android.gms.internal.base.zaa;

/* renamed from: a6.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0777a extends AbstractC0995k implements com.google.android.gms.common.api.g {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f12781a;

    /* renamed from: b, reason: collision with root package name */
    public final C0992h f12782b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f12783c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f12784d;

    public C0777a(Context context, Looper looper, C0992h c0992h, Bundle bundle, m mVar, n nVar) {
        super(context, looper, 44, c0992h, mVar, nVar);
        this.f12781a = true;
        this.f12782b = c0992h;
        this.f12783c = bundle;
        this.f12784d = c0992h.g;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0990f
    public final IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return queryLocalInterface instanceof C0781e ? (C0781e) queryLocalInterface : new zaa(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    @Override // com.google.android.gms.common.internal.AbstractC0990f
    public final Bundle getGetServiceRequestExtraArgs() {
        C0992h c0992h = this.f12782b;
        boolean equals = getContext().getPackageName().equals(c0992h.f15064d);
        Bundle bundle = this.f12783c;
        if (!equals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", c0992h.f15064d);
        }
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0990f, com.google.android.gms.common.api.g
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0990f
    public final String getServiceDescriptor() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC0990f
    public final String getStartServiceAction() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC0990f, com.google.android.gms.common.api.g
    public final boolean requiresSignIn() {
        return this.f12781a;
    }
}
