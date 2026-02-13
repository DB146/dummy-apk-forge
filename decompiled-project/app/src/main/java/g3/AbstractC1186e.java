package g3;

import android.os.Looper;
import android.webkit.TracingController;
import android.webkit.WebView;
import f3.AbstractC1131b;
import java.io.OutputStream;
import java.util.concurrent.Executor;

/* renamed from: g3.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1186e {
    public static TracingController a() {
        TracingController tracingController;
        tracingController = TracingController.getInstance();
        return tracingController;
    }

    public static ClassLoader b() {
        ClassLoader webViewClassLoader;
        webViewClassLoader = WebView.getWebViewClassLoader();
        return webViewClassLoader;
    }

    public static Looper c(WebView webView) {
        Looper webViewLooper;
        webViewLooper = webView.getWebViewLooper();
        return webViewLooper;
    }

    public static boolean d(TracingController tracingController) {
        boolean isTracing;
        isTracing = tracingController.isTracing();
        return isTracing;
    }

    public static void e(String str) {
        WebView.setDataDirectorySuffix(str);
    }

    public static void f(TracingController tracingController, AbstractC1131b abstractC1131b) {
        com.kt.apps.core.utils.h.p();
        throw null;
    }

    public static boolean g(TracingController tracingController, OutputStream outputStream, Executor executor) {
        boolean stop;
        stop = tracingController.stop(outputStream, executor);
        return stop;
    }
}
