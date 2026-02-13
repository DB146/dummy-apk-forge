package t6;

import android.view.View;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import c.C0879w;
import java.util.Objects;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public OnBackInvokedCallback f24498a;

    public OnBackInvokedCallback a(b bVar) {
        Objects.requireNonNull(bVar);
        return new C0879w(bVar, 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0005, code lost:
    
        r3 = r3.findOnBackInvokedDispatcher();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(b bVar, View view, boolean z8) {
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        if (this.f24498a == null && findOnBackInvokedDispatcher != null) {
            OnBackInvokedCallback a9 = a(bVar);
            this.f24498a = a9;
            findOnBackInvokedDispatcher.registerOnBackInvokedCallback(z8 ? 1000000 : 0, a9);
        }
    }

    public void c(View view) {
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        findOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher();
        if (findOnBackInvokedDispatcher == null) {
            return;
        }
        findOnBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.f24498a);
        this.f24498a = null;
    }
}
