package D0;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.graphics.Insets;
import android.util.Log;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import androidx.work.impl.foreground.SystemForegroundService;
import h3.z;

/* loaded from: classes.dex */
public abstract class b {
    public static ContentCaptureSession a(View view) {
        return view.getContentCaptureSession();
    }

    public static AutofillId b(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j) {
        return contentCaptureSession.newAutofillId(autofillId, j);
    }

    public static ViewStructure c(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j) {
        return contentCaptureSession.newVirtualViewStructure(autofillId, j);
    }

    public static void d(ContentCaptureSession contentCaptureSession, ViewStructure viewStructure) {
        contentCaptureSession.notifyViewAppeared(viewStructure);
    }

    public static void e(ContentCaptureSession contentCaptureSession, AutofillId autofillId) {
        contentCaptureSession.notifyViewDisappeared(autofillId);
    }

    public static void f(ContentCaptureSession contentCaptureSession, AutofillId autofillId, String str) {
        contentCaptureSession.notifyViewTextChanged(autofillId, str);
    }

    public static void g(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long[] jArr) {
        contentCaptureSession.notifyViewsDisappeared(autofillId, jArr);
    }

    public static Insets h(int i7, int i10, int i11, int i12) {
        return Insets.of(i7, i10, i11, i12);
    }

    public static void i(SystemForegroundService systemForegroundService, int i7, Notification notification, int i10) {
        systemForegroundService.startForeground(i7, notification, i10);
    }

    public static void j(SystemForegroundService systemForegroundService, int i7, Notification notification, int i10) {
        try {
            systemForegroundService.startForeground(i7, notification, i10);
        } catch (ForegroundServiceStartNotAllowedException e2) {
            z e10 = z.e();
            String str = SystemForegroundService.f13757e;
            if (e10.f17724a <= 5) {
                Log.w(str, "Unable to start foreground service", e2);
            }
        } catch (SecurityException e11) {
            z e12 = z.e();
            String str2 = SystemForegroundService.f13757e;
            if (e12.f17724a <= 5) {
                Log.w(str2, "Unable to start foreground service", e11);
            }
        }
    }
}
