package k1;

import android.app.Notification;
import android.content.Context;

/* loaded from: classes.dex */
public abstract class g {
    public static String a(Context context) {
        return context.getOpPackageName();
    }

    public static void b(Notification.Builder builder, boolean z8) {
        builder.setAllowSystemGeneratedContextualActions(z8);
    }

    public static void c(Notification.Builder builder) {
        builder.setBubbleMetadata(null);
    }

    public static void d(Notification.Action.Builder builder) {
        builder.setContextual(false);
    }
}
