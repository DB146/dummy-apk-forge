package u8;

import com.google.android.gms.common.api.internal.InterfaceC0961b;
import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class i implements InterfaceC0961b {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReference f24892a = new AtomicReference();

    @Override // com.google.android.gms.common.api.internal.InterfaceC0961b
    public final void a(boolean z8) {
        Random random = j.j;
        synchronized (j.class) {
            Iterator it = j.k.values().iterator();
            while (it.hasNext()) {
                ((c) it.next()).h(z8);
            }
        }
    }
}
