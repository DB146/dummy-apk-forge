package com.google.ads.interactivemedia.v3.impl.data;

/* loaded from: classes.dex */
final class zzl extends zzat {
    private int height;
    private int left;
    private byte set$0;
    private int top;
    private int width;

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzat
    public zzau build() {
        if (this.set$0 == 15) {
            return new zzn(this.left, this.top, this.height, this.width);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.set$0 & 1) == 0) {
            sb2.append(" left");
        }
        if ((this.set$0 & 2) == 0) {
            sb2.append(" top");
        }
        if ((this.set$0 & 4) == 0) {
            sb2.append(" height");
        }
        if ((this.set$0 & 8) == 0) {
            sb2.append(" width");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzat
    public zzat height(int i7) {
        this.height = i7;
        this.set$0 = (byte) (this.set$0 | 4);
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzat
    public zzat left(int i7) {
        this.left = i7;
        this.set$0 = (byte) (this.set$0 | 1);
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzat
    public zzat top(int i7) {
        this.top = i7;
        this.set$0 = (byte) (this.set$0 | 2);
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzat
    public zzat width(int i7) {
        this.width = i7;
        this.set$0 = (byte) (this.set$0 | 8);
        return this;
    }
}
