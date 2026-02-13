package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.api.FriendlyObstructionPurpose;

/* loaded from: classes.dex */
final class zzai extends zzbm {
    private final boolean attached;
    private final zzau bounds;
    private final String detailedReason;
    private final boolean hidden;
    private final FriendlyObstructionPurpose purpose;
    private final String type;

    private zzai(boolean z8, zzau zzauVar, String str, boolean z10, FriendlyObstructionPurpose friendlyObstructionPurpose, String str2) {
        this.attached = z8;
        this.bounds = zzauVar;
        this.detailedReason = str;
        this.hidden = z10;
        this.purpose = friendlyObstructionPurpose;
        this.type = str2;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbm
    public boolean attached() {
        return this.attached;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbm
    public zzau bounds() {
        return this.bounds;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbm
    public String detailedReason() {
        return this.detailedReason;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzbm) {
            zzbm zzbmVar = (zzbm) obj;
            if (this.attached == zzbmVar.attached() && this.bounds.equals(zzbmVar.bounds()) && ((str = this.detailedReason) != null ? str.equals(zzbmVar.detailedReason()) : zzbmVar.detailedReason() == null) && this.hidden == zzbmVar.hidden() && this.purpose.equals(zzbmVar.purpose()) && this.type.equals(zzbmVar.type())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (((true != this.attached ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.bounds.hashCode();
        String str = this.detailedReason;
        return (((((((hashCode * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ (true != this.hidden ? 1237 : 1231)) * 1000003) ^ this.purpose.hashCode()) * 1000003) ^ this.type.hashCode();
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbm
    public boolean hidden() {
        return this.hidden;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbm
    public FriendlyObstructionPurpose purpose() {
        return this.purpose;
    }

    public String toString() {
        return "ObstructionData{attached=" + this.attached + ", bounds=" + String.valueOf(this.bounds) + ", detailedReason=" + this.detailedReason + ", hidden=" + this.hidden + ", purpose=" + String.valueOf(this.purpose) + ", type=" + this.type + "}";
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbm
    public String type() {
        return this.type;
    }
}
