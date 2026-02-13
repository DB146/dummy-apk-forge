package Ca;

import android.util.Log;
import jb.InterfaceC1393d;

/* loaded from: classes2.dex */
public final class e implements InterfaceC1393d {

    /* renamed from: b, reason: collision with root package name */
    public static final e f3098b = new e(0);

    /* renamed from: c, reason: collision with root package name */
    public static final e f3099c = new e(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3100a;

    public /* synthetic */ e(int i7) {
        this.f3100a = i7;
    }

    @Override // jb.InterfaceC1393d
    public final void accept(Object obj) {
        switch (this.f3100a) {
            case 0:
                Throwable error = (Throwable) obj;
                kotlin.jvm.internal.l.e(error, "error");
                Log.e("FragmentTVDashboard", "Failed to load banner ads", error);
                return;
            default:
                Throwable error2 = (Throwable) obj;
                kotlin.jvm.internal.l.e(error2, "error");
                Log.e("FragmentTVGrid", "Failed to load banner ads", error2);
                return;
        }
    }
}
