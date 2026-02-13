package t2;

import A8.c0;
import W1.G;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: t2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2017a {

    /* renamed from: e, reason: collision with root package name */
    public static final Object f24435e = new Object();

    /* renamed from: f, reason: collision with root package name */
    public static C2017a f24436f;

    /* renamed from: a, reason: collision with root package name */
    public final Context f24437a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f24438b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f24439c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f24440d = new ArrayList();

    public C2017a(Context context) {
        this.f24437a = context;
        new c0(this, context.getMainLooper(), 7);
    }

    public static C2017a a(G g) {
        C2017a c2017a;
        synchronized (f24435e) {
            try {
                if (f24436f == null) {
                    f24436f = new C2017a(g.getApplicationContext());
                }
                c2017a = f24436f;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c2017a;
    }

    public final void b(Intent intent) {
        synchronized (this.f24438b) {
            try {
                intent.getAction();
                String resolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f24437a.getContentResolver());
                intent.getData();
                String scheme = intent.getScheme();
                intent.getCategories();
                boolean z8 = (intent.getFlags() & 8) != 0;
                if (z8) {
                    Log.v("LocalBroadcastManager", "Resolving type " + resolveTypeIfNeeded + " scheme " + scheme + " of intent " + intent);
                }
                ArrayList arrayList = (ArrayList) this.f24439c.get(intent.getAction());
                if (arrayList != null) {
                    if (z8) {
                        Log.v("LocalBroadcastManager", "Action list: " + arrayList);
                    }
                    if (arrayList.size() > 0) {
                        if (arrayList.get(0) != null) {
                            throw new ClassCastException();
                        }
                        if (!z8) {
                            throw null;
                        }
                        throw null;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
