package Y7;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.internal.AbstractC0995k;

/* loaded from: classes.dex */
public final class b extends AbstractC0995k {
    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.IInterface, java.lang.Object, Y7.d] */
    @Override // com.google.android.gms.common.internal.AbstractC0990f
    public final IInterface createServiceInterface(IBinder iBinder) {
        int i7 = e.f12062a;
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.firebase.dynamiclinks.internal.IDynamicLinksService");
        if (queryLocalInterface != null && (queryLocalInterface instanceof f)) {
            return (f) queryLocalInterface;
        }
        ?? obj = new Object();
        obj.f12061a = iBinder;
        return obj;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0990f, com.google.android.gms.common.api.g
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0990f
    public final String getServiceDescriptor() {
        return "com.google.firebase.dynamiclinks.internal.IDynamicLinksService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC0990f
    public final String getStartServiceAction() {
        return "com.google.firebase.dynamiclinks.service.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC0990f
    public final boolean usesClientTelemetry() {
        return true;
    }
}
