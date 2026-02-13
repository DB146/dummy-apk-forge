package B0;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;

/* renamed from: B0.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ComponentCallbacks2C0172d0 implements ComponentCallbacks2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Configuration f1874a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ F0.a f1875b;

    public ComponentCallbacks2C0172d0(Configuration configuration, F0.a aVar) {
        this.f1874a = configuration;
        this.f1875b = aVar;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        Configuration configuration2 = this.f1874a;
        configuration2.updateFrom(configuration);
        Iterator it = this.f1875b.f4031a.entrySet().iterator();
        while (it.hasNext()) {
            if (((WeakReference) ((Map.Entry) it.next()).getValue()).get() != null) {
                throw new ClassCastException();
            }
            it.remove();
        }
        configuration2.setTo(configuration);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.f1875b.f4031a.clear();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i7) {
        this.f1875b.f4031a.clear();
    }
}
