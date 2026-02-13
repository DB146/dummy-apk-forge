package com.google.ads.interactivemedia.v3.impl.data;

/* loaded from: classes.dex */
final class zzo extends CompanionData {
    private final String clickThroughUrl;
    private final String size;
    private final String src;
    private final zzav type;

    public zzo(String str, String str2, String str3, zzav zzavVar) {
        if (str == null) {
            throw new NullPointerException("Null size");
        }
        this.size = str;
        if (str2 == null) {
            throw new NullPointerException("Null src");
        }
        this.src = str2;
        if (str3 == null) {
            throw new NullPointerException("Null clickThroughUrl");
        }
        this.clickThroughUrl = str3;
        if (zzavVar == null) {
            throw new NullPointerException("Null type");
        }
        this.type = zzavVar;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.CompanionData
    public String clickThroughUrl() {
        return this.clickThroughUrl;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CompanionData) {
            CompanionData companionData = (CompanionData) obj;
            if (this.size.equals(companionData.size()) && this.src.equals(companionData.src()) && this.clickThroughUrl.equals(companionData.clickThroughUrl()) && this.type.equals(companionData.type())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.size.hashCode() ^ 1000003) * 1000003) ^ this.src.hashCode()) * 1000003) ^ this.clickThroughUrl.hashCode()) * 1000003) ^ this.type.hashCode();
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.CompanionData
    public String size() {
        return this.size;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.CompanionData
    public String src() {
        return this.src;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.CompanionData
    public zzav type() {
        return this.type;
    }
}
