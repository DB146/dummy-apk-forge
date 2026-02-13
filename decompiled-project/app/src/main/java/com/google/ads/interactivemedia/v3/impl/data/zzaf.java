package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.internal.zzso;
import y.S;

/* loaded from: classes.dex */
final class zzaf extends zzbn {
    private final zzso<zzbm> obstructions;

    private zzaf(zzso<zzbm> zzsoVar) {
        this.obstructions = zzsoVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzbn) {
            return this.obstructions.equals(((zzbn) obj).obstructions());
        }
        return false;
    }

    public int hashCode() {
        return this.obstructions.hashCode() ^ 1000003;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbn
    public zzso<zzbm> obstructions() {
        return this.obstructions;
    }

    public String toString() {
        return S.b("ObstructionListData{obstructions=", String.valueOf(this.obstructions), "}");
    }
}
