package com.google.ads.interactivemedia.v3.impl.data;

import A3.c;
import h3.o;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzal extends zzbp {
    private final int major;
    private final int micro;
    private final int minor;

    public zzal(int i7, int i10, int i11) {
        this.major = i7;
        this.minor = i10;
        this.micro = i11;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzbp) {
            zzbp zzbpVar = (zzbp) obj;
            if (this.major == zzbpVar.major() && this.minor == zzbpVar.minor() && this.micro == zzbpVar.micro()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.major ^ 1000003) * 1000003) ^ this.minor) * 1000003) ^ this.micro;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbp
    public int major() {
        return this.major;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbp
    public int micro() {
        return this.micro;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbp
    public int minor() {
        return this.minor;
    }

    public String toString() {
        int i7 = this.major;
        int i10 = this.minor;
        return c.k(o.q(i7, i10, "SecureSignalsVersionData{major=", ", minor=", ", micro="), this.micro, "}");
    }
}
