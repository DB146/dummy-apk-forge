package H5;

import F5.d;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.internal.InterfaceC0966g;
import com.google.android.gms.common.api.internal.InterfaceC0976q;
import com.google.android.gms.common.internal.AbstractC0995k;
import com.google.android.gms.common.internal.C0992h;
import com.google.android.gms.common.internal.C1004u;
import com.google.android.gms.internal.base.zaa;
import com.google.android.gms.internal.base.zaf;

/* loaded from: classes.dex */
public final class c extends AbstractC0995k {

    /* renamed from: a, reason: collision with root package name */
    public final C1004u f4894a;

    public c(Context context, Looper looper, C0992h c0992h, C1004u c1004u, InterfaceC0966g interfaceC0966g, InterfaceC0976q interfaceC0976q) {
        super(context, looper, 270, c0992h, interfaceC0966g, interfaceC0976q);
        this.f4894a = c1004u;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0990f
    public final IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return queryLocalInterface instanceof a ? (a) queryLocalInterface : new zaa(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService");
    }

    @Override // com.google.android.gms.common.internal.AbstractC0990f
    public final d[] getApiFeatures() {
        return zaf.zab;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0990f
    public final Bundle getGetServiceRequestExtraArgs() {
        C1004u c1004u = this.f4894a;
        c1004u.getClass();
        Bundle bundle = new Bundle();
        String str = c1004u.f15115a;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0990f, com.google.android.gms.common.api.g
    public final int getMinApkVersion() {
        return 203400000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0990f
    public final String getServiceDescriptor() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC0990f
    public final String getStartServiceAction() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC0990f
    public final boolean getUseDynamicLookup() {
        return true;
    }
}
