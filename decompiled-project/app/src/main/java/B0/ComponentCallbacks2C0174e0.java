package B0;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;

/* renamed from: B0.e0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ComponentCallbacks2C0174e0 implements ComponentCallbacks2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ F0.b f1880a;

    public ComponentCallbacks2C0174e0(F0.b bVar) {
        this.f1880a = bVar;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        F0.b bVar = this.f1880a;
        synchronized (bVar) {
            bVar.f4032a.c();
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        F0.b bVar = this.f1880a;
        synchronized (bVar) {
            bVar.f4032a.c();
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i7) {
        F0.b bVar = this.f1880a;
        synchronized (bVar) {
            bVar.f4032a.c();
        }
    }
}
