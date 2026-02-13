package B0;

import android.content.ClipboardManager;
import android.content.Context;

/* renamed from: B0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0185k implements InterfaceC0201s0 {

    /* renamed from: a, reason: collision with root package name */
    public final ClipboardManager f1924a;

    public C0185k(Context context) {
        Object systemService = context.getSystemService("clipboard");
        kotlin.jvm.internal.l.c(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        this.f1924a = (ClipboardManager) systemService;
    }
}
