package xa;

import android.util.Log;
import jb.InterfaceC1393d;

/* loaded from: classes2.dex */
public final class b implements InterfaceC1393d {

    /* renamed from: b, reason: collision with root package name */
    public static final b f26282b = new b(0);

    /* renamed from: c, reason: collision with root package name */
    public static final b f26283c = new b(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26284a;

    public /* synthetic */ b(int i7) {
        this.f26284a = i7;
    }

    @Override // jb.InterfaceC1393d
    public final void accept(Object obj) {
        switch (this.f26284a) {
            case 0:
                Throwable error = (Throwable) obj;
                kotlin.jvm.internal.l.e(error, "error");
                Log.e("FootballFragment", "Failed to load banner ads", error);
                return;
            default:
                Throwable error2 = (Throwable) obj;
                kotlin.jvm.internal.l.e(error2, "error");
                Log.e("FootballPlaybackFragment", "Failed to load banner ads", error2);
                return;
        }
    }
}
