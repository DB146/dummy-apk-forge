package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzel extends zzeb {
    private final int appVersion;
    private final String packageName;

    public zzel(int i7, String str) {
        this.appVersion = i7;
        if (str == null) {
            throw new NullPointerException("Null packageName");
        }
        this.packageName = str;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzeb
    public int appVersion() {
        return this.appVersion;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzeb) {
            zzeb zzebVar = (zzeb) obj;
            if (this.appVersion == zzebVar.appVersion() && this.packageName.equals(zzebVar.packageName())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.appVersion ^ 1000003) * 1000003) ^ this.packageName.hashCode();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzeb
    public String packageName() {
        return this.packageName;
    }

    public String toString() {
        return "MarketAppInfo{appVersion=" + this.appVersion + ", packageName=" + this.packageName + "}";
    }
}
