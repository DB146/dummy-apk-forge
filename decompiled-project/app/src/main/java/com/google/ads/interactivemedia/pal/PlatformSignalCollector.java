package com.google.ads.interactivemedia.pal;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public interface PlatformSignalCollector {
    Task<Map<String, String>> collectSignals(Context context, ExecutorService executorService);
}
