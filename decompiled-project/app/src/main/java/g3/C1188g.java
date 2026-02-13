package g3;

import android.webkit.WebView;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;

/* renamed from: g3.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1188g implements InterfaceC1195n {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f17437a = new String[0];

    @Override // g3.InterfaceC1195n
    public final String[] b() {
        return f17437a;
    }

    @Override // g3.InterfaceC1195n
    public final WebViewProviderBoundaryInterface createWebView(WebView webView) {
        throw new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }
}
