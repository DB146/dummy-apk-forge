package P5;

import F5.h;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.IBinder;
import com.google.android.gms.common.internal.G;

/* loaded from: classes.dex */
public abstract class d {
    private final String zza = "com.google.android.gms.ads.adshield.AdShieldCreatorImpl";
    private Object zzb;

    public abstract Object getRemoteCreator(IBinder iBinder);

    public final Object getRemoteCreatorInstance(Context context) {
        Context context2;
        if (this.zzb == null) {
            G.g(context);
            int i7 = h.f4105e;
            try {
                context2 = context.createPackageContext("com.google.android.gms", 3);
            } catch (PackageManager.NameNotFoundException unused) {
                context2 = null;
            }
            if (context2 == null) {
                throw new Exception("Could not get remote context.");
            }
            try {
                this.zzb = getRemoteCreator((IBinder) context2.getClassLoader().loadClass(this.zza).newInstance());
            } catch (ClassNotFoundException e2) {
                throw new Exception("Could not load creator class.", e2);
            } catch (IllegalAccessException e10) {
                throw new Exception("Could not access creator.", e10);
            } catch (InstantiationException e11) {
                throw new Exception("Could not instantiate creator.", e11);
            }
        }
        return this.zzb;
    }
}
