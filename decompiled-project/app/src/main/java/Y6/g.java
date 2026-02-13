package Y6;

import android.util.Log;
import com.google.android.gms.common.api.internal.InterfaceC0961b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class g implements InterfaceC0961b {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReference f12037a = new AtomicReference();

    @Override // com.google.android.gms.common.api.internal.InterfaceC0961b
    public final void a(boolean z8) {
        synchronized (i.k) {
            try {
                Iterator it = new ArrayList(i.f12040l.values()).iterator();
                while (it.hasNext()) {
                    i iVar = (i) it.next();
                    if (iVar.f12045e.get()) {
                        Log.d("FirebaseApp", "Notifying background state change listeners.");
                        Iterator it2 = iVar.f12048i.iterator();
                        while (it2.hasNext()) {
                            ((f) it2.next()).a(z8);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
