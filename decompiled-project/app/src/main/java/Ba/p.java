package Ba;

import android.util.Log;
import jb.InterfaceC1393d;

/* loaded from: classes2.dex */
public final class p implements InterfaceC1393d {

    /* renamed from: b, reason: collision with root package name */
    public static final p f2268b = new p(0);

    /* renamed from: c, reason: collision with root package name */
    public static final p f2269c = new p(1);

    /* renamed from: d, reason: collision with root package name */
    public static final p f2270d = new p(2);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2271a;

    public /* synthetic */ p(int i7) {
        this.f2271a = i7;
    }

    @Override // jb.InterfaceC1393d
    public final void accept(Object obj) {
        switch (this.f2271a) {
            case 0:
                Throwable error = (Throwable) obj;
                kotlin.jvm.internal.l.e(error, "error");
                Log.e("TVSearchFragment", "Failed to load banner ads", error);
                return;
            case 1:
                kotlin.jvm.internal.l.e((Boolean) obj, "it");
                return;
            default:
                Boolean it = (Boolean) obj;
                kotlin.jvm.internal.l.e(it, "it");
                Log.d("RowsSupportFragment", "initAction: " + it);
                return;
        }
    }
}
