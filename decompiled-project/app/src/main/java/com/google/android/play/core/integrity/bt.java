package com.google.android.play.core.integrity;

import com.google.android.gms.tasks.Task;
import com.google.android.play.core.integrity.StandardIntegrityManager;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class bt {

    /* renamed from: a, reason: collision with root package name */
    private final bn f15667a;

    public bt(bn bnVar) {
        this.f15667a = bnVar;
    }

    public final /* synthetic */ Task a(long j, long j10, int i7, StandardIntegrityManager.StandardIntegrityTokenRequest standardIntegrityTokenRequest) {
        return this.f15667a.d(standardIntegrityTokenRequest.a(), j, j10, 0);
    }
}
