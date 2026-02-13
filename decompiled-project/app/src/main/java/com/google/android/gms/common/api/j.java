package com.google.android.gms.common.api;

/* loaded from: classes.dex */
public class j extends Exception {

    @Deprecated
    protected final Status mStatus;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public j(Status status) {
        super(r0 + ": " + (r1 == null ? "" : r1));
        int i7 = status.f14897a;
        String str = status.f14898b;
        this.mStatus = status;
    }

    public Status getStatus() {
        return this.mStatus;
    }

    public int getStatusCode() {
        return this.mStatus.f14897a;
    }

    @Deprecated
    public String getStatusMessage() {
        return this.mStatus.f14898b;
    }
}
