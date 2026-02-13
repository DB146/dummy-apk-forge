package K9;

import android.util.Log;
import java.lang.Thread;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements Thread.UncaughtExceptionHandler {
    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        Log.e("UnCatchExceptionHandler", "{Thead: " + thread.getName() + "}");
        Log.e("UnCatchExceptionHandler", th.getMessage(), th);
    }
}
