package D0;

import A9.AbstractC0068b1;
import A9.L2;
import android.os.Build;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import java.util.Objects;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final Object f3147a;

    /* renamed from: b, reason: collision with root package name */
    public final View f3148b;

    public c(ContentCaptureSession contentCaptureSession, View view) {
        this.f3147a = contentCaptureSession;
        this.f3148b = view;
    }

    public final AutofillId a(long j) {
        if (Build.VERSION.SDK_INT < 29) {
            return null;
        }
        ContentCaptureSession h10 = L2.h(this.f3147a);
        a m10 = Y6.b.m(this.f3148b);
        Objects.requireNonNull(m10);
        return b.b(h10, AbstractC0068b1.i(m10.f3146a), j);
    }
}
