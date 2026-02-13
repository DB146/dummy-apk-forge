package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.api.FriendlyObstructionPurpose;

/* loaded from: classes.dex */
final class zzag extends zzbl {
    private boolean attached;
    private zzau bounds;
    private String detailedReason;
    private boolean hidden;
    private FriendlyObstructionPurpose purpose;
    private byte set$0;
    private String type;

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbl
    public zzbl attached(boolean z8) {
        this.attached = z8;
        this.set$0 = (byte) (this.set$0 | 1);
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbl
    public zzbl bounds(zzau zzauVar) {
        this.bounds = zzauVar;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbl
    public zzbm build() {
        zzau zzauVar;
        FriendlyObstructionPurpose friendlyObstructionPurpose;
        String str;
        if (this.set$0 == 3 && (zzauVar = this.bounds) != null && (friendlyObstructionPurpose = this.purpose) != null && (str = this.type) != null) {
            return new zzai(this.attached, zzauVar, this.detailedReason, this.hidden, friendlyObstructionPurpose, str);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.set$0 & 1) == 0) {
            sb2.append(" attached");
        }
        if (this.bounds == null) {
            sb2.append(" bounds");
        }
        if ((this.set$0 & 2) == 0) {
            sb2.append(" hidden");
        }
        if (this.purpose == null) {
            sb2.append(" purpose");
        }
        if (this.type == null) {
            sb2.append(" type");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbl
    public zzbl detailedReason(String str) {
        this.detailedReason = str;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbl
    public zzbl hidden(boolean z8) {
        this.hidden = z8;
        this.set$0 = (byte) (this.set$0 | 2);
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbl
    public zzbl purpose(FriendlyObstructionPurpose friendlyObstructionPurpose) {
        if (friendlyObstructionPurpose == null) {
            throw new NullPointerException("Null purpose");
        }
        this.purpose = friendlyObstructionPurpose;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbl
    public zzbl type(String str) {
        if (str == null) {
            throw new NullPointerException("Null type");
        }
        this.type = str;
        return this;
    }
}
