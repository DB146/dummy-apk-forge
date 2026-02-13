package com.google.ads.interactivemedia.v3.impl.data;

import A3.c;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzp extends zzaw {
    private final String addtlConsent;
    private final String gdprApplies;
    private final String tcString;
    private final String uspString;

    public zzp(String str, String str2, String str3, String str4) {
        if (str == null) {
            throw new NullPointerException("Null gdprApplies");
        }
        this.gdprApplies = str;
        if (str2 == null) {
            throw new NullPointerException("Null tcString");
        }
        this.tcString = str2;
        if (str3 == null) {
            throw new NullPointerException("Null addtlConsent");
        }
        this.addtlConsent = str3;
        if (str4 == null) {
            throw new NullPointerException("Null uspString");
        }
        this.uspString = str4;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzaw
    public String addtlConsent() {
        return this.addtlConsent;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzaw) {
            zzaw zzawVar = (zzaw) obj;
            if (this.gdprApplies.equals(zzawVar.gdprApplies()) && this.tcString.equals(zzawVar.tcString()) && this.addtlConsent.equals(zzawVar.addtlConsent()) && this.uspString.equals(zzawVar.uspString())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzaw
    public String gdprApplies() {
        return this.gdprApplies;
    }

    public int hashCode() {
        return ((((((this.gdprApplies.hashCode() ^ 1000003) * 1000003) ^ this.tcString.hashCode()) * 1000003) ^ this.addtlConsent.hashCode()) * 1000003) ^ this.uspString.hashCode();
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzaw
    public String tcString() {
        return this.tcString;
    }

    public String toString() {
        String str = this.gdprApplies;
        String str2 = this.tcString;
        String str3 = this.addtlConsent;
        String str4 = this.uspString;
        StringBuilder o10 = c.o("ConsentSettings{gdprApplies=", str, ", tcString=", str2, ", addtlConsent=");
        o10.append(str3);
        o10.append(", uspString=");
        o10.append(str4);
        o10.append("}");
        return o10.toString();
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzaw
    public String uspString() {
        return this.uspString;
    }
}
