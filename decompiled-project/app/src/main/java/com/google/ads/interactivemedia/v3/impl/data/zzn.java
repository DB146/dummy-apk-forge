package com.google.ads.interactivemedia.v3.impl.data;

import h3.o;

/* loaded from: classes.dex */
final class zzn extends zzau {
    private final int height;
    private final int left;
    private final int top;
    private final int width;

    private zzn(int i7, int i10, int i11, int i12) {
        this.left = i7;
        this.top = i10;
        this.height = i11;
        this.width = i12;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzau) {
            zzau zzauVar = (zzau) obj;
            if (this.left == zzauVar.left() && this.top == zzauVar.top() && this.height == zzauVar.height() && this.width == zzauVar.width()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.left ^ 1000003) * 1000003) ^ this.top) * 1000003) ^ this.height) * 1000003) ^ this.width;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzau
    public int height() {
        return this.height;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzau
    public int left() {
        return this.left;
    }

    public String toString() {
        int i7 = this.left;
        int i10 = this.top;
        int i11 = this.height;
        int i12 = this.width;
        StringBuilder q10 = o.q(i7, i10, "BoundingRectData{left=", ", top=", ", height=");
        q10.append(i11);
        q10.append(", width=");
        q10.append(i12);
        q10.append("}");
        return q10.toString();
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzau
    public int top() {
        return this.top;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzau
    public int width() {
        return this.width;
    }
}
