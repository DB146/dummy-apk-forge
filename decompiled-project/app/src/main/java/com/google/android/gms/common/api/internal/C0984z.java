package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import java.util.Map;

/* renamed from: com.google.android.gms.common.api.internal.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0984z implements com.google.android.gms.common.api.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BasePendingResult f15007a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ A f15008b;

    public C0984z(A a9, BasePendingResult basePendingResult) {
        this.f15008b = a9;
        this.f15007a = basePendingResult;
    }

    @Override // com.google.android.gms.common.api.p
    public final void a(Status status) {
        ((Map) this.f15008b.f14905a).remove(this.f15007a);
    }
}
