package B0;

import M1.C0405u;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import com.kt.apps.media.xemtv.beta.R;
import hc.C1277e;
import java.util.LinkedHashMap;
import kc.C1441d;

/* loaded from: classes.dex */
public abstract class u1 {

    /* renamed from: a, reason: collision with root package name */
    public static final LinkedHashMap f1985a = new LinkedHashMap();

    /* JADX WARN: Type inference failed for: r3v3, types: [fc.Y, java.lang.Object] */
    public static final fc.Z a(Context context) {
        fc.Z z8;
        LinkedHashMap linkedHashMap = f1985a;
        synchronized (linkedHashMap) {
            try {
                Object obj = linkedHashMap.get(context);
                if (obj == null) {
                    ContentResolver contentResolver = context.getContentResolver();
                    Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                    ec.d a9 = Q5.e.a(-1, 0, 6);
                    C0405u c0405u = new C0405u(new s1(contentResolver, uriFor, new t1(a9, com.bumptech.glide.d.f(Looper.getMainLooper())), a9, context, null));
                    cc.F0 d10 = cc.F.d();
                    C1441d c1441d = cc.P.f14498a;
                    obj = fc.Q.m(c0405u, new C1277e(E6.b.w(d10, hc.o.f17967a)), new Object(), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                    linkedHashMap.put(context, obj);
                }
                z8 = (fc.Z) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z8;
    }

    public static final Q.r b(View view) {
        Object tag = view.getTag(R.id.androidx_compose_ui_view_composition_context);
        if (tag instanceof Q.r) {
            return (Q.r) tag;
        }
        return null;
    }
}
