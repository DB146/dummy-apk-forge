package l3;

import P1.g;
import android.app.job.JobParameters;
import android.content.Context;
import android.widget.EdgeEffect;
import androidx.work.impl.background.systemjob.SystemJobService;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;

/* loaded from: classes.dex */
public abstract class d {
    public static EdgeEffect a(Context context) {
        try {
            return new EdgeEffect(context, null);
        } catch (Throwable unused) {
            return new EdgeEffect(context);
        }
    }

    public static float b(EdgeEffect edgeEffect) {
        try {
            return edgeEffect.getDistance();
        } catch (Throwable unused) {
            return 0.0f;
        }
    }

    public static int c(JobParameters jobParameters) {
        int stopReason = jobParameters.getStopReason();
        String str = SystemJobService.f13751e;
        switch (stopReason) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case g.BYTES_FIELD_NUMBER /* 8 */:
            case 9:
            case 10:
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
            case 12:
            case 13:
            case 14:
            case 15:
                return stopReason;
            default:
                return -512;
        }
    }

    public static float d(EdgeEffect edgeEffect, float f4, float f10) {
        try {
            return edgeEffect.onPullDistance(f4, f10);
        } catch (Throwable unused) {
            edgeEffect.onPull(f4, f10);
            return 0.0f;
        }
    }
}
