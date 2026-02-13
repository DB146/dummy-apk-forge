package com.google.android.play.core.install;

/* loaded from: classes.dex */
public final class zza {

    /* renamed from: a, reason: collision with root package name */
    public final int f15561a;

    /* renamed from: b, reason: collision with root package name */
    public final long f15562b;

    /* renamed from: c, reason: collision with root package name */
    public final long f15563c;

    /* renamed from: d, reason: collision with root package name */
    public final int f15564d;

    /* renamed from: e, reason: collision with root package name */
    public final String f15565e;

    public zza(int i7, long j, long j10, int i10, String str) {
        this.f15561a = i7;
        this.f15562b = j;
        this.f15563c = j10;
        this.f15564d = i10;
        if (str == null) {
            throw new NullPointerException("Null packageName");
        }
        this.f15565e = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zza) {
            zza zzaVar = (zza) obj;
            if (this.f15561a == zzaVar.f15561a && this.f15562b == zzaVar.f15562b && this.f15563c == zzaVar.f15563c && this.f15564d == zzaVar.f15564d && this.f15565e.equals(zzaVar.f15565e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7 = this.f15561a ^ 1000003;
        long j = this.f15562b;
        long j10 = this.f15563c;
        return (((((((i7 * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j10 >>> 32) ^ j10))) * 1000003) ^ this.f15564d) * 1000003) ^ this.f15565e.hashCode();
    }

    public final String toString() {
        return "InstallState{installStatus=" + this.f15561a + ", bytesDownloaded=" + this.f15562b + ", totalBytesToDownload=" + this.f15563c + ", installErrorCode=" + this.f15564d + ", packageName=" + this.f15565e + "}";
    }
}
