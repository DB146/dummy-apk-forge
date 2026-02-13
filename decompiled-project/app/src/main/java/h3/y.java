package h3;

import android.content.Context;
import androidx.work.WorkerParameters;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class y {

    /* renamed from: a, reason: collision with root package name */
    public final Context f17718a;

    /* renamed from: b, reason: collision with root package name */
    public final WorkerParameters f17719b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicInteger f17720c = new AtomicInteger(-256);

    /* renamed from: d, reason: collision with root package name */
    public boolean f17721d;

    public y(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        }
        if (workerParameters == null) {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        this.f17718a = context;
        this.f17719b = workerParameters;
    }

    public abstract a1.l a();

    public abstract a1.l b();
}
