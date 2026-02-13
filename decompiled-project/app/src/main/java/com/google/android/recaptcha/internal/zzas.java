package com.google.android.recaptcha.internal;

import cc.I;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
public final class zzas {
    public static final Task zza(I i7) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource(new CancellationTokenSource().getToken());
        i7.invokeOnCompletion(new zzar(taskCompletionSource, i7));
        return taskCompletionSource.getTask();
    }
}
