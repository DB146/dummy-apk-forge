package W1;

import android.content.Context;
import android.util.Log;
import android.view.View;
import com.kt.apps.core.base.receiver.NetworkChangeReceiver;
import com.kt.apps.core.utils.ActivityUtilsKt;
import java.lang.ref.WeakReference;
import l2.InterfaceC1479x;
import v2.C2132d;
import va.C2165i;

/* renamed from: W1.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0575s implements l2.I {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10548a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C f10549b;

    public /* synthetic */ C0575s(int i7, C c10) {
        this.f10548a = i7;
        this.f10549b = c10;
    }

    @Override // l2.I
    public final void b(Object obj) {
        int i7 = 1;
        C c10 = this.f10549b;
        switch (this.f10548a) {
            case 0:
                if (((InterfaceC1479x) obj) != null) {
                    DialogInterfaceOnCancelListenerC0577u dialogInterfaceOnCancelListenerC0577u = (DialogInterfaceOnCancelListenerC0577u) c10;
                    if (dialogInterfaceOnCancelListenerC0577u.f10561t0) {
                        View j02 = dialogInterfaceOnCancelListenerC0577u.j0();
                        if (j02.getParent() != null) {
                            throw new IllegalStateException("DialogFragment can not be attached to a container view");
                        }
                        if (dialogInterfaceOnCancelListenerC0577u.f10565x0 != null) {
                            if (Log.isLoggable("FragmentManager", 3)) {
                                Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + dialogInterfaceOnCancelListenerC0577u.f10565x0);
                            }
                            dialogInterfaceOnCancelListenerC0577u.f10565x0.setContentView(j02);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                y9.I value = (y9.I) obj;
                kotlin.jvm.internal.l.e(value, "value");
                C2165i c2165i = (C2165i) c10;
                if (value instanceof y9.G) {
                    c2165i.B0().a();
                    C2165i c2165i2 = (C2165i) c10;
                    ActivityUtilsKt.showSuccessDialog$default((C) c2165i2, (Rb.a) new C2132d(c2165i2, i7), "Thêm nguồn IPTV thành công!\r\nVui lòng chờ trong giây lát", (Integer) null, false, 12, (Object) null);
                    c2165i.G0().a().i(this);
                    return;
                }
                if (value instanceof y9.E) {
                    c2165i.B0().b();
                    return;
                }
                if (value instanceof y9.D) {
                    c2165i.B0().a();
                    Context C2 = c2165i.C();
                    if (C2 != null) {
                        WeakReference weakReference = NetworkChangeReceiver.f16114b;
                        if (c2.q.n(C2)) {
                            ActivityUtilsKt.showErrorDialog$default((C2165i) c10, null, ((y9.D) value).f27482a.getMessage(), "Lỗi thêm nguồn video", null, null, false, false, null, null, 505, null);
                            Throwable exception = ((y9.D) value).f27482a;
                            kotlin.jvm.internal.l.e(exception, "exception");
                            return;
                        }
                    }
                    ActivityUtilsKt.showErrorDialog$default((C2165i) c10, null, "Vui lòng kiểm tra kết nối internet và thử lại!", null, null, null, false, false, null, null, 509, null);
                    Throwable exception2 = ((y9.D) value).f27482a;
                    kotlin.jvm.internal.l.e(exception2, "exception");
                    return;
                }
                return;
        }
    }
}
