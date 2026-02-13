package D5;

import android.content.Context;
import com.google.android.gms.common.api.internal.C0967h;
import com.google.android.gms.common.api.o;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final I5.a f3253a = new I5.a("GoogleSignInCommon", new String[0]);

    public static void a(Context context) {
        i.z(context).A();
        Set set = o.f15012a;
        synchronized (set) {
        }
        Iterator it = set.iterator();
        if (it.hasNext()) {
            ((o) it.next()).getClass();
            throw new UnsupportedOperationException();
        }
        C0967h.a();
    }
}
