package Mc;

import android.util.Log;
import jb.InterfaceC1393d;
import kotlin.jvm.internal.l;

/* loaded from: classes2.dex */
public final class e implements InterfaceC1393d {

    /* renamed from: a, reason: collision with root package name */
    public static final e f6946a = new Object();

    public a a() {
        a aVar = a.f6936e;
        if (aVar == null) {
            synchronized (this) {
                aVar = a.f6936e;
                if (aVar == null) {
                    aVar = new a();
                    a.f6936e = aVar;
                }
            }
        }
        return aVar;
    }

    @Override // jb.InterfaceC1393d
    public void accept(Object obj) {
        Throwable error = (Throwable) obj;
        l.e(error, "error");
        Log.e("ShopeeProductDetails", "Failed to load related products", error);
    }
}
