package s5;

import android.content.Context;
import com.google.android.gms.common.internal.G;
import com.google.android.gms.internal.appindex.zzab;
import com.google.android.gms.tasks.Task;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public abstract class f {
    public static final String APP_INDEXING_API_TAG = "UserActions";
    private static WeakReference zza;

    public static synchronized f getInstance(Context context) {
        synchronized (f.class) {
            G.g(context);
            WeakReference weakReference = zza;
            f fVar = weakReference == null ? null : (f) weakReference.get();
            if (fVar != null) {
                return fVar;
            }
            zzab zzabVar = new zzab(context.getApplicationContext());
            zza = new WeakReference(zzabVar);
            return zzabVar;
        }
    }

    public abstract Task end(InterfaceC1990a interfaceC1990a);
}
