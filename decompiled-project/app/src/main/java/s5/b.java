package s5;

import android.content.Context;
import com.google.android.gms.common.internal.G;
import com.google.android.gms.internal.appindex.zzt;
import com.google.android.gms.tasks.Task;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public abstract class b {
    public static final String ACTION_UPDATE_INDEX = "com.google.firebase.appindexing.UPDATE_INDEX";
    public static final String APP_INDEXING_API_TAG = "AppIndex";
    public static final String EXTRA_UPDATE_INDEX_REASON = "com.google.firebase.appindexing.extra.REASON";
    public static final int EXTRA_UPDATE_INDEX_REASON_REBUILD = 1;
    public static final int EXTRA_UPDATE_INDEX_REASON_REFRESH = 2;
    private static WeakReference zza;

    public static synchronized b getInstance(Context context) {
        synchronized (b.class) {
            G.g(context);
            WeakReference weakReference = zza;
            b bVar = weakReference == null ? null : (b) weakReference.get();
            if (bVar != null) {
                return bVar;
            }
            zzt zztVar = new zzt(context.getApplicationContext());
            zza = new WeakReference(zztVar);
            return zztVar;
        }
    }

    public abstract Task update(e... eVarArr);
}
