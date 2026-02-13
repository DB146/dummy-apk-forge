package h4;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import b4.C0838i;
import h3.r;
import j4.C1375a;
import j4.InterfaceC1377c;
import java.util.Objects;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f17738a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0838i f17739b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f17740c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Runnable f17741d;

    public /* synthetic */ f(i iVar, C0838i c0838i, int i7, Runnable runnable) {
        this.f17738a = iVar;
        this.f17739b = c0838i;
        this.f17740c = i7;
        this.f17741d = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0838i c0838i = this.f17739b;
        int i7 = this.f17740c;
        Runnable runnable = this.f17741d;
        i iVar = this.f17738a;
        InterfaceC1377c interfaceC1377c = iVar.f17753f;
        try {
            try {
                i4.d dVar = iVar.f17750c;
                Objects.requireNonNull(dVar);
                ((i4.g) interfaceC1377c).T(new Q9.a(dVar, 12));
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) iVar.f17748a.getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                    ((i4.g) interfaceC1377c).T(new r(iVar, c0838i, i7));
                } else {
                    iVar.a(c0838i, i7);
                }
            } catch (C1375a unused) {
                iVar.f17751d.a(c0838i, i7 + 1, false);
            }
            runnable.run();
        } catch (Throwable th) {
            runnable.run();
            throw th;
        }
    }
}
