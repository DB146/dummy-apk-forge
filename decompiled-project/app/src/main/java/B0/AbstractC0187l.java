package B0;

import android.content.pm.ApkChecksum;
import android.content.res.Configuration;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import android.view.ScrollCaptureTarget;
import android.view.autofill.AutofillId;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;

/* renamed from: B0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0187l {
    public static /* bridge */ /* synthetic */ int b(Configuration configuration) {
        return configuration.fontWeightAdjustment;
    }

    public static /* bridge */ /* synthetic */ ApkChecksum c(Object obj) {
        return (ApkChecksum) obj;
    }

    public static /* bridge */ /* synthetic */ RenderEffect d(Shader.TileMode tileMode) {
        return RenderEffect.createBlurEffect(50.0f, 50.0f, tileMode);
    }

    public static /* bridge */ /* synthetic */ ScrollCaptureSession g(Object obj) {
        return (ScrollCaptureSession) obj;
    }

    public static /* synthetic */ ScrollCaptureTarget h(D d10, Rect rect, Point point, ScrollCaptureCallback scrollCaptureCallback) {
        return new ScrollCaptureTarget(d10, rect, point, scrollCaptureCallback);
    }

    public static /* bridge */ /* synthetic */ TranslationResponseValue k(ViewTranslationResponse viewTranslationResponse) {
        return viewTranslationResponse.getValue("android:text");
    }

    public static /* synthetic */ ViewTranslationRequest.Builder l(AutofillId autofillId, long j) {
        return new ViewTranslationRequest.Builder(autofillId, j);
    }

    public static /* bridge */ /* synthetic */ ViewTranslationResponse n(Object obj) {
        return (ViewTranslationResponse) obj;
    }

    public static /* bridge */ /* synthetic */ CharSequence o(TranslationResponseValue translationResponseValue) {
        return translationResponseValue.getText();
    }

    public static /* synthetic */ void q() {
    }

    public static /* bridge */ /* synthetic */ void x(RenderNode renderNode, RenderEffect renderEffect) {
        renderNode.setRenderEffect(renderEffect);
    }
}
