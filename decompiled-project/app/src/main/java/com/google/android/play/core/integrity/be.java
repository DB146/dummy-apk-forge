package com.google.android.play.core.integrity;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class be extends J6.z {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f15627a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ bn f15628b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public be(bn bnVar, TaskCompletionSource taskCompletionSource, Context context) {
        super(taskCompletionSource);
        this.f15628b = bnVar;
        this.f15627a = context;
    }

    @Override // J6.z
    public final void b() {
        TaskCompletionSource taskCompletionSource;
        int i7;
        PackageInfo packageInfo;
        ApplicationInfo applicationInfo;
        Context context = this.f15627a;
        taskCompletionSource = this.f15628b.f15654d;
        J6.y yVar = J6.f.f5555a;
        try {
            packageInfo = context.getPackageManager().getPackageInfo("com.android.vending", 64);
            applicationInfo = packageInfo.applicationInfo;
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (applicationInfo != null && applicationInfo.enabled && J6.f.a(packageInfo.signatures)) {
            i7 = packageInfo.versionCode;
            taskCompletionSource.trySetResult(Integer.valueOf(i7));
        }
        i7 = 0;
        taskCompletionSource.trySetResult(Integer.valueOf(i7));
    }
}
