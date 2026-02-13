package com.google.android.gms.common.api;

import com.google.android.gms.common.api.internal.BasePendingResult;

/* loaded from: classes.dex */
public final class w extends BasePendingResult {

    /* renamed from: a, reason: collision with root package name */
    public final Status f15014a;

    public w(Status status) {
        super(null);
        this.f15014a = status;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final r createFailedResult(Status status) {
        return this.f15014a;
    }
}
