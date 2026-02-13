package i;

import I2.K;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import u.C2048a;
import u.C2053f;
import u1.C2094d;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final K f18072a = new K(new W3.f(3));

    /* renamed from: b, reason: collision with root package name */
    public static final int f18073b = -100;

    /* renamed from: c, reason: collision with root package name */
    public static C2094d f18074c = null;

    /* renamed from: d, reason: collision with root package name */
    public static C2094d f18075d = null;

    /* renamed from: e, reason: collision with root package name */
    public static Boolean f18076e = null;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f18077f = false;

    /* renamed from: u, reason: collision with root package name */
    public static final C2053f f18078u = new C2053f(0);

    /* renamed from: v, reason: collision with root package name */
    public static final Object f18079v = new Object();

    /* renamed from: w, reason: collision with root package name */
    public static final Object f18080w = new Object();

    public static boolean b(Context context) {
        if (f18076e == null) {
            try {
                int i7 = AbstractServiceC1280C.f17989a;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) AbstractServiceC1280C.class), AbstractC1279B.a() | 128).metaData;
                if (bundle != null) {
                    f18076e = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                f18076e = Boolean.FALSE;
            }
        }
        return f18076e.booleanValue();
    }

    public static void f(v vVar) {
        synchronized (f18079v) {
            try {
                C2053f c2053f = f18078u;
                c2053f.getClass();
                C2048a c2048a = new C2048a(c2053f);
                while (c2048a.hasNext()) {
                    k kVar = (k) ((WeakReference) c2048a.next()).get();
                    if (kVar == vVar || kVar == null) {
                        c2048a.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void a();

    public abstract void c();

    public abstract void d();

    public abstract boolean h(int i7);

    public abstract void i(int i7);

    public abstract void j(View view);

    public abstract void k(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void l(CharSequence charSequence);
}
