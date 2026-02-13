package Aa;

import android.util.Log;
import jb.InterfaceC1393d;

/* loaded from: classes2.dex */
public final class u implements InterfaceC1393d {

    /* renamed from: a, reason: collision with root package name */
    public static final u f1543a = new Object();

    @Override // jb.InterfaceC1393d
    public final void accept(Object obj) {
        Throwable error = (Throwable) obj;
        kotlin.jvm.internal.l.e(error, "error");
        Log.e("TVPlaybackVideoFragment", "Failed to load banner ads", error);
    }
}
