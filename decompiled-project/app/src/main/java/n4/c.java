package n4;

import android.os.Bundle;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.kt.apps.core.utils.blurry.BlurFactor;
import j8.InterfaceC1386a;
import j8.InterfaceC1387b;
import java.util.concurrent.ScheduledExecutorService;
import m4.InterfaceC1567f;
import m4.InterfaceC1569g;
import o5.C1807b;
import r4.p;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements n5.i, InterfaceC1567f, InterfaceC1386a, p7.c, p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21081a;

    @Override // m4.InterfaceC1567f
    public InterfaceC1569g c(Bundle bundle) {
        return new C1807b(bundle.getInt(C1807b.f21936u, -1), bundle.getByteArray(C1807b.f21939x), bundle.getInt(C1807b.f21937v, -1), bundle.getInt(C1807b.f21938w, -1));
    }

    @Override // j8.InterfaceC1386a
    public void f(InterfaceC1387b interfaceC1387b) {
    }

    @Override // p7.c
    public Object g(T6.a aVar) {
        switch (this.f21081a) {
            case 24:
                return (ScheduledExecutorService) ExecutorsRegistrar.f15852a.get();
            case BlurFactor.DEFAULT_RADIUS /* 25 */:
                return (ScheduledExecutorService) ExecutorsRegistrar.f15854c.get();
            case 26:
                return (ScheduledExecutorService) ExecutorsRegistrar.f15853b.get();
            default:
                p7.l lVar = ExecutorsRegistrar.f15852a;
                return q7.k.f23543a;
        }
    }

    @Override // n5.i
    public void invoke(Object obj) {
        j jVar = (j) obj;
        switch (this.f21081a) {
            case 0:
                jVar.getClass();
                return;
            case 1:
                jVar.getClass();
                return;
            case 2:
                jVar.getClass();
                return;
            case 3:
                jVar.getClass();
                return;
            case 4:
                jVar.getClass();
                return;
            case 5:
                jVar.getClass();
                return;
            case 6:
                jVar.getClass();
                return;
            case 7:
                jVar.getClass();
                return;
            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                jVar.getClass();
                return;
            case 9:
                jVar.getClass();
                return;
            case 10:
                jVar.getClass();
                return;
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                jVar.getClass();
                return;
            case 12:
                jVar.getClass();
                return;
            case 13:
                jVar.getClass();
                return;
            case 14:
                jVar.getClass();
                return;
            case 15:
                jVar.getClass();
                return;
            case 16:
                jVar.getClass();
                return;
            case 17:
                jVar.getClass();
                return;
            case 18:
                jVar.getClass();
                return;
            case 19:
                jVar.getClass();
                return;
            case 20:
                jVar.getClass();
                return;
            default:
                jVar.getClass();
                return;
        }
    }

    @Override // r4.p
    public void release() {
    }
}
